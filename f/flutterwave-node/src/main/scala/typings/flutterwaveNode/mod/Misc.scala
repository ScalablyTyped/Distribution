package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Misc extends StObject {
  
  def disburse(data: MiscDisburseRequest): js.Promise[AxiosResponse[Any, Any]]
  
  def exchange_rates(data: MiscExchangeRatesRequest): js.Promise[AxiosResponse[Any, Any]]
  
  def getBalHist(data: MiscGetBalHistRequest): js.Promise[AxiosResponse[Any, Any]]
  
  def getBalance(data: MistGetBalanceRequest): js.Promise[AxiosResponse[Any, Any]]
  
  def getBanks(data: MiscGetBanksRequest): js.Promise[AxiosResponse[Any, Any]]
  
  def getFee(data: MiscGetFeeRequest): js.Promise[AxiosResponse[Any, Any]]
  
  def list_transactions(data: MiscListTransactionsRequest): js.Promise[AxiosResponse[Any, Any]]
}
object Misc {
  
  inline def apply(
    disburse: MiscDisburseRequest => js.Promise[AxiosResponse[Any, Any]],
    exchange_rates: MiscExchangeRatesRequest => js.Promise[AxiosResponse[Any, Any]],
    getBalHist: MiscGetBalHistRequest => js.Promise[AxiosResponse[Any, Any]],
    getBalance: MistGetBalanceRequest => js.Promise[AxiosResponse[Any, Any]],
    getBanks: MiscGetBanksRequest => js.Promise[AxiosResponse[Any, Any]],
    getFee: MiscGetFeeRequest => js.Promise[AxiosResponse[Any, Any]],
    list_transactions: MiscListTransactionsRequest => js.Promise[AxiosResponse[Any, Any]]
  ): Misc = {
    val __obj = js.Dynamic.literal(disburse = js.Any.fromFunction1(disburse), exchange_rates = js.Any.fromFunction1(exchange_rates), getBalHist = js.Any.fromFunction1(getBalHist), getBalance = js.Any.fromFunction1(getBalance), getBanks = js.Any.fromFunction1(getBanks), getFee = js.Any.fromFunction1(getFee), list_transactions = js.Any.fromFunction1(list_transactions))
    __obj.asInstanceOf[Misc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Misc] (val x: Self) extends AnyVal {
    
    inline def setDisburse(value: MiscDisburseRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "disburse", js.Any.fromFunction1(value))
    
    inline def setExchange_rates(value: MiscExchangeRatesRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "exchange_rates", js.Any.fromFunction1(value))
    
    inline def setGetBalHist(value: MiscGetBalHistRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "getBalHist", js.Any.fromFunction1(value))
    
    inline def setGetBalance(value: MistGetBalanceRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "getBalance", js.Any.fromFunction1(value))
    
    inline def setGetBanks(value: MiscGetBanksRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "getBanks", js.Any.fromFunction1(value))
    
    inline def setGetFee(value: MiscGetFeeRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "getFee", js.Any.fromFunction1(value))
    
    inline def setList_transactions(value: MiscListTransactionsRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "list_transactions", js.Any.fromFunction1(value))
  }
}
