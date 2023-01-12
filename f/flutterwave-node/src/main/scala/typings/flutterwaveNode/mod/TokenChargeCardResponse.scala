package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Acctbearsfeeattransactiontime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenChargeCardResponse
  extends StObject
     with BaseResponse {
  
  var data: Acctbearsfeeattransactiontime
}
object TokenChargeCardResponse {
  
  inline def apply(data: Acctbearsfeeattransactiontime, message: String, status: String): TokenChargeCardResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenChargeCardResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TokenChargeCardResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Acctbearsfeeattransactiontime): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
