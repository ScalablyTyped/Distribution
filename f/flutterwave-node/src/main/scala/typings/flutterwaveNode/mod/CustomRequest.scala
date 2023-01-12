package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRequest extends StObject {
  
  def custom(path: String, data: Any): js.Promise[AxiosResponse[Any, Any]]
}
object CustomRequest {
  
  inline def apply(custom: (String, Any) => js.Promise[AxiosResponse[Any, Any]]): CustomRequest = {
    val __obj = js.Dynamic.literal(custom = js.Any.fromFunction2(custom))
    __obj.asInstanceOf[CustomRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomRequest] (val x: Self) extends AnyVal {
    
    inline def setCustom(value: (String, Any) => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "custom", js.Any.fromFunction2(value))
  }
}
