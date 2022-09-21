package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCards extends StObject {
  
  def create(data: VirtualCardsCreateRequest): js.Promise[AxiosResponse[VirtualCardsCreateResponse, Any]]
  
  def fetchTransactions(data: VirtualCardsFetchTransactionsRequest): js.Promise[AxiosResponse[VirtualCardsFetchTransactionsResponse, Any]]
  
  def freeze(data: VirtualCardsFreezeUnfreezeRequest): js.Promise[AxiosResponse[VirtualCardsFreezeUnfreezeResponse, Any]]
  
  def fund(data: VirtualCardsFundRequest): js.Promise[AxiosResponse[VirtualCardsFundResponse, Any]]
  
  def get(data: VirtualCardsGetRequest): js.Promise[AxiosResponse[VirtualCardsGetResponse, Any]]
  
  def list(data: VirtualCardsListRequest): js.Promise[AxiosResponse[VirtualCardsListResponse, Any]]
  
  def terminate(data: VirtualCardsTerminateRequest): js.Promise[AxiosResponse[VirtualCardsTerminateResponse, Any]]
  
  def unfreeze(data: VirtualCardsFreezeUnfreezeRequest): js.Promise[AxiosResponse[VirtualCardsFreezeUnfreezeResponse, Any]]
  
  def withdraw(data: VirtualCardsWithrawRequest): js.Promise[AxiosResponse[VirtualCardsWithrawResponse, Any]]
}
object VirtualCards {
  
  inline def apply(
    create: VirtualCardsCreateRequest => js.Promise[AxiosResponse[VirtualCardsCreateResponse, Any]],
    fetchTransactions: VirtualCardsFetchTransactionsRequest => js.Promise[AxiosResponse[VirtualCardsFetchTransactionsResponse, Any]],
    freeze: VirtualCardsFreezeUnfreezeRequest => js.Promise[AxiosResponse[VirtualCardsFreezeUnfreezeResponse, Any]],
    fund: VirtualCardsFundRequest => js.Promise[AxiosResponse[VirtualCardsFundResponse, Any]],
    get: VirtualCardsGetRequest => js.Promise[AxiosResponse[VirtualCardsGetResponse, Any]],
    list: VirtualCardsListRequest => js.Promise[AxiosResponse[VirtualCardsListResponse, Any]],
    terminate: VirtualCardsTerminateRequest => js.Promise[AxiosResponse[VirtualCardsTerminateResponse, Any]],
    unfreeze: VirtualCardsFreezeUnfreezeRequest => js.Promise[AxiosResponse[VirtualCardsFreezeUnfreezeResponse, Any]],
    withdraw: VirtualCardsWithrawRequest => js.Promise[AxiosResponse[VirtualCardsWithrawResponse, Any]]
  ): VirtualCards = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), fetchTransactions = js.Any.fromFunction1(fetchTransactions), freeze = js.Any.fromFunction1(freeze), fund = js.Any.fromFunction1(fund), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), terminate = js.Any.fromFunction1(terminate), unfreeze = js.Any.fromFunction1(unfreeze), withdraw = js.Any.fromFunction1(withdraw))
    __obj.asInstanceOf[VirtualCards]
  }
  
  extension [Self <: VirtualCards](x: Self) {
    
    inline def setCreate(value: VirtualCardsCreateRequest => js.Promise[AxiosResponse[VirtualCardsCreateResponse, Any]]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setFetchTransactions(
      value: VirtualCardsFetchTransactionsRequest => js.Promise[AxiosResponse[VirtualCardsFetchTransactionsResponse, Any]]
    ): Self = StObject.set(x, "fetchTransactions", js.Any.fromFunction1(value))
    
    inline def setFreeze(
      value: VirtualCardsFreezeUnfreezeRequest => js.Promise[AxiosResponse[VirtualCardsFreezeUnfreezeResponse, Any]]
    ): Self = StObject.set(x, "freeze", js.Any.fromFunction1(value))
    
    inline def setFund(value: VirtualCardsFundRequest => js.Promise[AxiosResponse[VirtualCardsFundResponse, Any]]): Self = StObject.set(x, "fund", js.Any.fromFunction1(value))
    
    inline def setGet(value: VirtualCardsGetRequest => js.Promise[AxiosResponse[VirtualCardsGetResponse, Any]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setList(value: VirtualCardsListRequest => js.Promise[AxiosResponse[VirtualCardsListResponse, Any]]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
    
    inline def setTerminate(
      value: VirtualCardsTerminateRequest => js.Promise[AxiosResponse[VirtualCardsTerminateResponse, Any]]
    ): Self = StObject.set(x, "terminate", js.Any.fromFunction1(value))
    
    inline def setUnfreeze(
      value: VirtualCardsFreezeUnfreezeRequest => js.Promise[AxiosResponse[VirtualCardsFreezeUnfreezeResponse, Any]]
    ): Self = StObject.set(x, "unfreeze", js.Any.fromFunction1(value))
    
    inline def setWithdraw(value: VirtualCardsWithrawRequest => js.Promise[AxiosResponse[VirtualCardsWithrawResponse, Any]]): Self = StObject.set(x, "withdraw", js.Any.fromFunction1(value))
  }
}
