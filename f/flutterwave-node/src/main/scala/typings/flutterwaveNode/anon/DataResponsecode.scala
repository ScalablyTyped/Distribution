package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataResponsecode extends StObject {
  
  var data: Flwreference
  
  var response_code: String
  
  var response_message: String
}
object DataResponsecode {
  
  inline def apply(data: Flwreference, response_code: String, response_message: String): DataResponsecode = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], response_code = response_code.asInstanceOf[js.Any], response_message = response_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataResponsecode]
  }
  
  extension [Self <: DataResponsecode](x: Self) {
    
    inline def setData(value: Flwreference): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setResponse_code(value: String): Self = StObject.set(x, "response_code", value.asInstanceOf[js.Any])
    
    inline def setResponse_message(value: String): Self = StObject.set(x, "response_message", value.asInstanceOf[js.Any])
  }
}
