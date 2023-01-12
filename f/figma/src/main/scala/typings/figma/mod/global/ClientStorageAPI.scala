package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientStorageAPI extends StObject {
  
  def getAsync(key: String): js.Promise[Any]
  
  def setAsync(key: String, value: Any): js.Promise[Unit]
}
object ClientStorageAPI {
  
  inline def apply(getAsync: String => js.Promise[Any], setAsync: (String, Any) => js.Promise[Unit]): ClientStorageAPI = {
    val __obj = js.Dynamic.literal(getAsync = js.Any.fromFunction1(getAsync), setAsync = js.Any.fromFunction2(setAsync))
    __obj.asInstanceOf[ClientStorageAPI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientStorageAPI] (val x: Self) extends AnyVal {
    
    inline def setGetAsync(value: String => js.Promise[Any]): Self = StObject.set(x, "getAsync", js.Any.fromFunction1(value))
    
    inline def setSetAsync(value: (String, Any) => js.Promise[Unit]): Self = StObject.set(x, "setAsync", js.Any.fromFunction2(value))
  }
}
