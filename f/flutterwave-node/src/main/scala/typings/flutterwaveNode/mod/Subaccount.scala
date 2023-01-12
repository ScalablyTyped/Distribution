package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subaccount extends StObject {
  
  def create(data: SubaccountCreateRequest): js.Promise[AxiosResponse[SubaccountCreateResponse, Any]]
  
  def fetch(data: SubaccountFetchRequest): js.Promise[AxiosResponse[SubaccountFetchResponse, Any]]
  
  def list(data: SubaccountListRequest): js.Promise[AxiosResponse[SubaccountListResponse, Any]]
}
object Subaccount {
  
  inline def apply(
    create: SubaccountCreateRequest => js.Promise[AxiosResponse[SubaccountCreateResponse, Any]],
    fetch: SubaccountFetchRequest => js.Promise[AxiosResponse[SubaccountFetchResponse, Any]],
    list: SubaccountListRequest => js.Promise[AxiosResponse[SubaccountListResponse, Any]]
  ): Subaccount = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), fetch = js.Any.fromFunction1(fetch), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[Subaccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subaccount] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: SubaccountCreateRequest => js.Promise[AxiosResponse[SubaccountCreateResponse, Any]]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setFetch(value: SubaccountFetchRequest => js.Promise[AxiosResponse[SubaccountFetchResponse, Any]]): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
    
    inline def setList(value: SubaccountListRequest => js.Promise[AxiosResponse[SubaccountListResponse, Any]]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
  }
}
