package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responsemessage extends StObject {
  
  var data: Amount
  
  var response_code: String
  
  var response_message: String
}
object Responsemessage {
  
  inline def apply(data: Amount, response_code: String, response_message: String): Responsemessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], response_code = response_code.asInstanceOf[js.Any], response_message = response_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responsemessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responsemessage] (val x: Self) extends AnyVal {
    
    inline def setData(value: Amount): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setResponse_code(value: String): Self = StObject.set(x, "response_code", value.asInstanceOf[js.Any])
    
    inline def setResponse_message(value: String): Self = StObject.set(x, "response_message", value.asInstanceOf[js.Any])
  }
}
