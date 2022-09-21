package typings.djangoBananas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiResponse[T] extends StObject {
  
  var obj: T
  
  var status: Double
  
  var statusText: String
}
object ApiResponse {
  
  inline def apply[T](obj: T, status: Double, statusText: String): ApiResponse[T] = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiResponse[T]]
  }
  
  extension [Self <: ApiResponse[?], T](x: Self & ApiResponse[T]) {
    
    inline def setObj(value: T): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
  }
}
