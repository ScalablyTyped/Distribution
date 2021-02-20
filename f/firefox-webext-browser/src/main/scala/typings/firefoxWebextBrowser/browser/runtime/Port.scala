package typings.firefoxWebextBrowser.browser.runtime

import typings.firefoxWebextBrowser.WebExtEvent
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* runtime types */
/** An object which allows two way communication with other pages. */
@js.native
trait Port extends StObject {
  
  def disconnect(): Unit = js.native
  
  var error: js.UndefOr[Error] = js.native
  
  var name: String = js.native
  
  var onDisconnect: WebExtEvent[js.Function1[/* port */ this.type, Unit]] = js.native
  
  var onMessage: WebExtEvent[js.Function1[/* response */ js.Object, Unit]] = js.native
  
  def postMessage(message: js.Object): Unit = js.native
  
  /** This property will **only** be present on ports passed to onConnect/onConnectExternal listeners. */
  var sender: js.UndefOr[MessageSender] = js.native
}
object Port {
  
  @scala.inline
  def apply(
    disconnect: () => Unit,
    name: String,
    onDisconnect: WebExtEvent[js.Function1[Port, Unit]],
    onMessage: WebExtEvent[js.Function1[/* response */ js.Object, Unit]],
    postMessage: js.Object => Unit
  ): Port = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), name = name.asInstanceOf[js.Any], onDisconnect = onDisconnect.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], postMessage = js.Any.fromFunction1(postMessage))
    __obj.asInstanceOf[Port]
  }
  
  @scala.inline
  implicit class PortMutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDisconnect(value: WebExtEvent[js.Function1[Port, Unit]]): Self = StObject.set(x, "onDisconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMessage(value: WebExtEvent[js.Function1[/* response */ js.Object, Unit]]): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostMessage(value: js.Object => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSender(value: MessageSender): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
