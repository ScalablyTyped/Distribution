package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.AvailableBalance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferGetBalanceResponse
  extends StObject
     with BaseResponse {
  
  var data: AvailableBalance
}
object TransferGetBalanceResponse {
  
  inline def apply(data: AvailableBalance, message: String, status: String): TransferGetBalanceResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferGetBalanceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferGetBalanceResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: AvailableBalance): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
