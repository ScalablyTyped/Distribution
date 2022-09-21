package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.AmountRefunded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefundRefundResponse
  extends StObject
     with BaseResponse {
  
  var data: AmountRefunded
}
object RefundRefundResponse {
  
  inline def apply(data: AmountRefunded, message: String, status: String): RefundRefundResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefundRefundResponse]
  }
  
  extension [Self <: RefundRefundResponse](x: Self) {
    
    inline def setData(value: AmountRefunded): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
