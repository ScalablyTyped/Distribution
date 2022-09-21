package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenCharge extends StObject {
  
  def account(data: TokenChargeCardRequest): js.Promise[AxiosResponse[TokenChargeCardResponse, Any]]
  
  def card(data: TokenChargeCardRequest): js.Promise[AxiosResponse[TokenChargeCardResponse, Any]]
}
object TokenCharge {
  
  inline def apply(
    account: TokenChargeCardRequest => js.Promise[AxiosResponse[TokenChargeCardResponse, Any]],
    card: TokenChargeCardRequest => js.Promise[AxiosResponse[TokenChargeCardResponse, Any]]
  ): TokenCharge = {
    val __obj = js.Dynamic.literal(account = js.Any.fromFunction1(account), card = js.Any.fromFunction1(card))
    __obj.asInstanceOf[TokenCharge]
  }
  
  extension [Self <: TokenCharge](x: Self) {
    
    inline def setAccount(value: TokenChargeCardRequest => js.Promise[AxiosResponse[TokenChargeCardResponse, Any]]): Self = StObject.set(x, "account", js.Any.fromFunction1(value))
    
    inline def setCard(value: TokenChargeCardRequest => js.Promise[AxiosResponse[TokenChargeCardResponse, Any]]): Self = StObject.set(x, "card", js.Any.fromFunction1(value))
  }
}
