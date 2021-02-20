package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IngestGetPipelineParams extends GenericParams {
  
  var id: String = js.native
  
  var masterTimeout: js.UndefOr[Double] = js.native
}
object IngestGetPipelineParams {
  
  @scala.inline
  def apply(id: String): IngestGetPipelineParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestGetPipelineParams]
  }
  
  @scala.inline
  implicit class IngestGetPipelineParamsMutableBuilder[Self <: IngestGetPipelineParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeout(value: Double): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
  }
}
