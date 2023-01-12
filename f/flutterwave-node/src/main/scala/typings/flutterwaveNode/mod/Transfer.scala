package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transfer extends StObject {
  
  def accountVerification(data: TranferAccountVerificationRequest): js.Promise[AxiosResponse[TranferAccountVerificationResponse, Any]]
  
  def bulk(data: TransferBulkRequest): js.Promise[AxiosResponse[TransferBulkResponse, Any]]
  
  def fetch(data: TransferFetchRequest): js.Promise[AxiosResponse[TransferFetchResponse, Any]]
  
  def getApplicableFee(data: TransferGetApplicableFeeRequest): js.Promise[AxiosResponse[TransferGetApplicableFeeResponse, Any]]
  
  def getBalance(data: TransferGetBalanceRequest): js.Promise[AxiosResponse[TransferGetBalanceResponse, Any]]
  
  def initiate(data: TransferInitiateRequest): js.Promise[AxiosResponse[TransferInitiateResponse, Any]]
  
  def list(data: TransferListRequest): js.Promise[AxiosResponse[TransferListResponse, Any]]
  
  def retrieveStatusOfBulk(data: TransferRetrieveStatusOfBulkRequest): js.Promise[AxiosResponse[TransferRetrieveStatusOfBulkResponse, Any]]
}
object Transfer {
  
  inline def apply(
    accountVerification: TranferAccountVerificationRequest => js.Promise[AxiosResponse[TranferAccountVerificationResponse, Any]],
    bulk: TransferBulkRequest => js.Promise[AxiosResponse[TransferBulkResponse, Any]],
    fetch: TransferFetchRequest => js.Promise[AxiosResponse[TransferFetchResponse, Any]],
    getApplicableFee: TransferGetApplicableFeeRequest => js.Promise[AxiosResponse[TransferGetApplicableFeeResponse, Any]],
    getBalance: TransferGetBalanceRequest => js.Promise[AxiosResponse[TransferGetBalanceResponse, Any]],
    initiate: TransferInitiateRequest => js.Promise[AxiosResponse[TransferInitiateResponse, Any]],
    list: TransferListRequest => js.Promise[AxiosResponse[TransferListResponse, Any]],
    retrieveStatusOfBulk: TransferRetrieveStatusOfBulkRequest => js.Promise[AxiosResponse[TransferRetrieveStatusOfBulkResponse, Any]]
  ): Transfer = {
    val __obj = js.Dynamic.literal(accountVerification = js.Any.fromFunction1(accountVerification), bulk = js.Any.fromFunction1(bulk), fetch = js.Any.fromFunction1(fetch), getApplicableFee = js.Any.fromFunction1(getApplicableFee), getBalance = js.Any.fromFunction1(getBalance), initiate = js.Any.fromFunction1(initiate), list = js.Any.fromFunction1(list), retrieveStatusOfBulk = js.Any.fromFunction1(retrieveStatusOfBulk))
    __obj.asInstanceOf[Transfer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transfer] (val x: Self) extends AnyVal {
    
    inline def setAccountVerification(
      value: TranferAccountVerificationRequest => js.Promise[AxiosResponse[TranferAccountVerificationResponse, Any]]
    ): Self = StObject.set(x, "accountVerification", js.Any.fromFunction1(value))
    
    inline def setBulk(value: TransferBulkRequest => js.Promise[AxiosResponse[TransferBulkResponse, Any]]): Self = StObject.set(x, "bulk", js.Any.fromFunction1(value))
    
    inline def setFetch(value: TransferFetchRequest => js.Promise[AxiosResponse[TransferFetchResponse, Any]]): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
    
    inline def setGetApplicableFee(
      value: TransferGetApplicableFeeRequest => js.Promise[AxiosResponse[TransferGetApplicableFeeResponse, Any]]
    ): Self = StObject.set(x, "getApplicableFee", js.Any.fromFunction1(value))
    
    inline def setGetBalance(value: TransferGetBalanceRequest => js.Promise[AxiosResponse[TransferGetBalanceResponse, Any]]): Self = StObject.set(x, "getBalance", js.Any.fromFunction1(value))
    
    inline def setInitiate(value: TransferInitiateRequest => js.Promise[AxiosResponse[TransferInitiateResponse, Any]]): Self = StObject.set(x, "initiate", js.Any.fromFunction1(value))
    
    inline def setList(value: TransferListRequest => js.Promise[AxiosResponse[TransferListResponse, Any]]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
    
    inline def setRetrieveStatusOfBulk(
      value: TransferRetrieveStatusOfBulkRequest => js.Promise[AxiosResponse[TransferRetrieveStatusOfBulkResponse, Any]]
    ): Self = StObject.set(x, "retrieveStatusOfBulk", js.Any.fromFunction1(value))
  }
}
