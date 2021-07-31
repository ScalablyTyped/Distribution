package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientStorageAPI extends StObject {
  
  def getAsync(key: String): js.Promise[js.Any]
  
  def setAsync(key: String, value: js.Any): js.Promise[Unit]
}
object ClientStorageAPI {
  
  @scala.inline
  def apply(getAsync: String => js.Promise[js.Any], setAsync: (String, js.Any) => js.Promise[Unit]): ClientStorageAPI = {
    val __obj = js.Dynamic.literal(getAsync = js.Any.fromFunction1(getAsync), setAsync = js.Any.fromFunction2(setAsync))
    __obj.asInstanceOf[ClientStorageAPI]
  }
  
  @scala.inline
  implicit class ClientStorageAPIMutableBuilder[Self <: ClientStorageAPI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAsync(value: String => js.Promise[js.Any]): Self = StObject.set(x, "getAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAsync(value: (String, js.Any) => js.Promise[Unit]): Self = StObject.set(x, "setAsync", js.Any.fromFunction2(value))
  }
}
