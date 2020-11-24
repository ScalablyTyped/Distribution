package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseListener extends js.Object {
  
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
  implicit class BaseListenerOps[Self <: BaseListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccept(value: () => js.Promise[SocketConnection]): Self = this.set("accept", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => js.Promise[Unit]): Self = this.set("close", js.Any.fromFunction0(value))
  }
}
