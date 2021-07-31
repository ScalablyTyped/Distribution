package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShardsResponse extends StObject {
  
  var failed: Double
  
  var skipped: Double
  
  var successful: Double
  
  var total: Double
}
object ShardsResponse {
  
  @scala.inline
  def apply(failed: Double, skipped: Double, successful: Double, total: Double): ShardsResponse = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShardsResponse]
  }
  
  @scala.inline
  implicit class ShardsResponseMutableBuilder[Self <: ShardsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipped(value: Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessful(value: Double): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
