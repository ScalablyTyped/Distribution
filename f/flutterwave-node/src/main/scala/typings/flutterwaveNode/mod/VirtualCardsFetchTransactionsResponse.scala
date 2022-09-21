package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Accesstoken
import typings.flutterwaveNode.anon.AmountConfirmed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCardsFetchTransactionsResponse
  extends StObject
     with BaseResponse {
  
  var Data: Any
  
  var Token: Accesstoken
  
  var Transactions: js.Array[AmountConfirmed]
}
object VirtualCardsFetchTransactionsResponse {
  
  inline def apply(
    Data: Any,
    Token: Accesstoken,
    Transactions: js.Array[AmountConfirmed],
    message: String,
    status: String
  ): VirtualCardsFetchTransactionsResponse = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any], Transactions = Transactions.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualCardsFetchTransactionsResponse]
  }
  
  extension [Self <: VirtualCardsFetchTransactionsResponse](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setToken(value: Accesstoken): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    inline def setTransactions(value: js.Array[AmountConfirmed]): Self = StObject.set(x, "Transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsVarargs(value: AmountConfirmed*): Self = StObject.set(x, "Transactions", js.Array(value*))
  }
}
