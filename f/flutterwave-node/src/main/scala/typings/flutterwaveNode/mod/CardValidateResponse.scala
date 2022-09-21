package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardValidateResponse
  extends StObject
     with BaseResponse {
  
  var data: Data
}
object CardValidateResponse {
  
  inline def apply(data: Data, message: String, status: String): CardValidateResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardValidateResponse]
  }
  
  extension [Self <: CardValidateResponse](x: Self) {
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
