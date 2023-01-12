package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  def requery(data: StatusRequeryRequest): js.Promise[AxiosResponse[StatusRequeryResponse, Any]]
  
  def xrequery(data: StatusXqequeryRequest): js.Promise[AxiosResponse[Any, Any]]
}
object Status {
  
  inline def apply(
    requery: StatusRequeryRequest => js.Promise[AxiosResponse[StatusRequeryResponse, Any]],
    xrequery: StatusXqequeryRequest => js.Promise[AxiosResponse[Any, Any]]
  ): Status = {
    val __obj = js.Dynamic.literal(requery = js.Any.fromFunction1(requery), xrequery = js.Any.fromFunction1(xrequery))
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    inline def setRequery(value: StatusRequeryRequest => js.Promise[AxiosResponse[StatusRequeryResponse, Any]]): Self = StObject.set(x, "requery", js.Any.fromFunction1(value))
    
    inline def setXrequery(value: StatusXqequeryRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "xrequery", js.Any.fromFunction1(value))
  }
}
