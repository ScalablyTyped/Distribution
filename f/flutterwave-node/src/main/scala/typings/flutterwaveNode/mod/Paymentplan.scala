package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paymentplan extends StObject {
  
  def cancel(data: PaymentplanCancelRequest): js.Promise[AxiosResponse[PaymentplanCancelResponse, Any]]
  
  def create(data: PaymentplanCreateRequest): js.Promise[AxiosResponse[PaymentplanCreateResponse, Any]]
  
  def edit(data: PaymentplanEditRequest): js.Promise[AxiosResponse[PaymentplanEditRequest, Any]]
  
  def fetch(data: PaymentplanFetchRequest): js.Promise[AxiosResponse[PaymentplanFetchResponse, Any]]
  
  def list(data: PaymentplanListRequest): js.Promise[AxiosResponse[Any, Any]]
}
object Paymentplan {
  
  inline def apply(
    cancel: PaymentplanCancelRequest => js.Promise[AxiosResponse[PaymentplanCancelResponse, Any]],
    create: PaymentplanCreateRequest => js.Promise[AxiosResponse[PaymentplanCreateResponse, Any]],
    edit: PaymentplanEditRequest => js.Promise[AxiosResponse[PaymentplanEditRequest, Any]],
    fetch: PaymentplanFetchRequest => js.Promise[AxiosResponse[PaymentplanFetchResponse, Any]],
    list: PaymentplanListRequest => js.Promise[AxiosResponse[Any, Any]]
  ): Paymentplan = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), edit = js.Any.fromFunction1(edit), fetch = js.Any.fromFunction1(fetch), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[Paymentplan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Paymentplan] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: PaymentplanCancelRequest => js.Promise[AxiosResponse[PaymentplanCancelResponse, Any]]): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setCreate(value: PaymentplanCreateRequest => js.Promise[AxiosResponse[PaymentplanCreateResponse, Any]]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setEdit(value: PaymentplanEditRequest => js.Promise[AxiosResponse[PaymentplanEditRequest, Any]]): Self = StObject.set(x, "edit", js.Any.fromFunction1(value))
    
    inline def setFetch(value: PaymentplanFetchRequest => js.Promise[AxiosResponse[PaymentplanFetchResponse, Any]]): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
    
    inline def setList(value: PaymentplanListRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
  }
}
