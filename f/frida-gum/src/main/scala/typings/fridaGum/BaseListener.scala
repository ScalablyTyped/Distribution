package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseListener extends StObject {
  
  /**
    * Waits for the next client to connect.
    */
  def accept(): js.Promise[SocketConnection] = js.native
  
  /**
    * Closes the listener, releasing resources related to it. Once the listener is closed, all other operations
    * will fail. Closing a listener multiple times is allowed and will not result in an error.
    */
  def close(): js.Promise[Unit] = js.native
}
object BaseListener {
  
  @scala.inline
  def apply(accept: () => js.Promise[SocketConnection], close: () => js.Promise[Unit]): BaseListener = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[BaseListener]
  }
  
  @scala.inline
  implicit class BaseListenerMutableBuilder[Self <: BaseListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: () => js.Promise[SocketConnection]): Self = StObject.set(x, "accept", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
  }
}
