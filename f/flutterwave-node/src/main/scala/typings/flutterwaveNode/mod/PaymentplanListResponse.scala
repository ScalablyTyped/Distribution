package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Pageinfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentplanListResponse
  extends StObject
     with BaseResponse {
  
  var data: Pageinfo
}
object PaymentplanListResponse {
  
  inline def apply(data: Pageinfo, message: String, status: String): PaymentplanListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentplanListResponse]
  }
  
  extension [Self <: PaymentplanListResponse](x: Self) {
    
    inline def setData(value: Pageinfo): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
