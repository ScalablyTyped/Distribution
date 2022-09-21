package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settlement extends StObject {
  
  def fetch(data: SettlementFetchRequest): js.Promise[AxiosResponse[SettlementFetchResponse, Any]]
  
  def list(data: SettlementListRequest): js.Promise[AxiosResponse[SettlementListResponse, Any]]
}
object Settlement {
  
  inline def apply(
    fetch: SettlementFetchRequest => js.Promise[AxiosResponse[SettlementFetchResponse, Any]],
    list: SettlementListRequest => js.Promise[AxiosResponse[SettlementListResponse, Any]]
  ): Settlement = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[Settlement]
  }
  
  extension [Self <: Settlement](x: Self) {
    
    inline def setFetch(value: SettlementFetchRequest => js.Promise[AxiosResponse[SettlementFetchResponse, Any]]): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
    
    inline def setList(value: SettlementListRequest => js.Promise[AxiosResponse[SettlementListResponse, Any]]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
  }
}
