package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Paymentplans
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentplanListResponse
  extends StObject
     with BaseResponse {
  
  var data: Paymentplans
}
object PaymentplanListResponse {
  
  inline def apply(data: Paymentplans, message: String, status: String): PaymentplanListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentplanListResponse]
  }
  
  extension [Self <: PaymentplanListResponse](x: Self) {
    
    inline def setData(value: Paymentplans): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
