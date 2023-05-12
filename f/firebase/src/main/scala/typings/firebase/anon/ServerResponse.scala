package typings.firebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerResponse extends StObject {
  
  var serverResponse: String | Null
}
object ServerResponse {
  
  inline def apply(): ServerResponse = {
    val __obj = js.Dynamic.literal(serverResponse = null)
    __obj.asInstanceOf[ServerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerResponse] (val x: Self) extends AnyVal {
    
    inline def setServerResponse(value: String): Self = StObject.set(x, "serverResponse", value.asInstanceOf[js.Any])
    
    inline def setServerResponseNull: Self = StObject.set(x, "serverResponse", null)
  }
}
