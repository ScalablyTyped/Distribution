package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ebills extends StObject {
  
  def create(data: EbillsCreateRequest): js.Promise[AxiosResponse[EbillsCreateResponse, Any]]
  
  def update(data: EbillsUpdateRequest): js.Promise[AxiosResponse[EbillsUpdateResponse, Any]]
}
object Ebills {
  
  inline def apply(
    create: EbillsCreateRequest => js.Promise[AxiosResponse[EbillsCreateResponse, Any]],
    update: EbillsUpdateRequest => js.Promise[AxiosResponse[EbillsUpdateResponse, Any]]
  ): Ebills = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Ebills]
  }
  
  extension [Self <: Ebills](x: Self) {
    
    inline def setCreate(value: EbillsCreateRequest => js.Promise[AxiosResponse[EbillsCreateResponse, Any]]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: EbillsUpdateRequest => js.Promise[AxiosResponse[EbillsUpdateResponse, Any]]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
