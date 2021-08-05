package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var code: Double
  
  var details: js.Array[js.Object]
  
  var message: String
}
object Status {
  
  inline def apply(code: Double, details: js.Array[js.Object], message: String): Status = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: js.Array[js.Object]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsVarargs(value: js.Object*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
