package typings.firefoxWebextBrowser.browser.runtime

import typings.firefoxWebextBrowser.WebExtEvent
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* runtime types */
/** An object which allows two way communication with other pages. */
@js.native
trait Port extends js.Object {
  
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
  implicit class PortOps[Self <: Port] (val x: Self) extends AnyVal {
    
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
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDisconnect(value: WebExtEvent[js.Function1[Port, Unit]]): Self = this.set("onDisconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMessage(value: WebExtEvent[js.Function1[/* response */ js.Object, Unit]]): Self = this.set("onMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostMessage(value: js.Object => Unit): Self = this.set("postMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setSender(value: MessageSender): Self = this.set("sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
  }
}
