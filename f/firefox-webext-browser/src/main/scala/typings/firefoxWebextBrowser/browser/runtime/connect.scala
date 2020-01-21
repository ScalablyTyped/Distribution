package typings.firefoxWebextBrowser.browser.runtime

import typings.firefoxWebextBrowser.AnonIncludeTlsChannelId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.runtime.connect")
@js.native
object connect extends js.Object {
  /**
    * Attempts to connect to connect listeners within an extension/app (such as the background page), or other
    * extensions/apps. This is useful for content scripts connecting to their extension processes, inter-app/extension
    * communication, and web messaging. Note that this does not connect to any listeners in a content script.
    * Extensions may connect to content scripts embedded in tabs via `tabs.connect`.
    * @param [extensionId] The ID of the extension or app to connect to. If omitted, a connection will be attempted
    *     with your own extension. Required if sending messages from a web page for web messaging.
    * @returns Port through which messages can be sent and received. The port's `runtime.Port onDisconnect` event is
    *     fired if the extension/app does not exist.
    */
  def apply(): Port = js.native
  def apply(extensionId: String): Port = js.native
  def apply(extensionId: String, connectInfo: AnonIncludeTlsChannelId): Port = js.native
}

