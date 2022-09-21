package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.ChargeResponseMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbillsCreateResponse
  extends StObject
     with BaseResponse {
  
  var data: ChargeResponseMessage
}
object EbillsCreateResponse {
  
  inline def apply(data: ChargeResponseMessage, message: String, status: String): EbillsCreateResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbillsCreateResponse]
  }
  
  extension [Self <: EbillsCreateResponse](x: Self) {
    
    inline def setData(value: ChargeResponseMessage): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
