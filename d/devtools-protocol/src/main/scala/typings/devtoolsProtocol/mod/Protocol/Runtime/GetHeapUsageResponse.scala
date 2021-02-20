package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHeapUsageResponse extends StObject {
  
  /**
    * Allocated heap size in bytes.
    */
  var totalSize: Double = js.native
  
  /**
    * Used heap size in bytes.
    */
  var usedSize: Double = js.native
}
object GetHeapUsageResponse {
  
  @scala.inline
  def apply(totalSize: Double, usedSize: Double): GetHeapUsageResponse = {
    val __obj = js.Dynamic.literal(totalSize = totalSize.asInstanceOf[js.Any], usedSize = usedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHeapUsageResponse]
  }
  
  @scala.inline
  implicit class GetHeapUsageResponseMutableBuilder[Self <: GetHeapUsageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedSize(value: Double): Self = StObject.set(x, "usedSize", value.asInstanceOf[js.Any])
  }
}
