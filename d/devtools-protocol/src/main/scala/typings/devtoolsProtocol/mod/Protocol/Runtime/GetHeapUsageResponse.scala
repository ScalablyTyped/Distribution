package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHeapUsageResponse extends StObject {
  
  /**
    * Allocated heap size in bytes.
    */
  var totalSize: Double
  
  /**
    * Used heap size in bytes.
    */
  var usedSize: Double
}
object GetHeapUsageResponse {
  
  inline def apply(totalSize: Double, usedSize: Double): GetHeapUsageResponse = {
    val __obj = js.Dynamic.literal(totalSize = totalSize.asInstanceOf[js.Any], usedSize = usedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHeapUsageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetHeapUsageResponse] (val x: Self) extends AnyVal {
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setUsedSize(value: Double): Self = StObject.set(x, "usedSize", value.asInstanceOf[js.Any])
  }
}
