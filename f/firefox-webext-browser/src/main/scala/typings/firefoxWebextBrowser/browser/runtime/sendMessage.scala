package typings.firefoxWebextBrowser.browser.runtime

import typings.firefoxWebextBrowser.AnonIncludeTlsChannelIdToProxyScript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.runtime.sendMessage")
@js.native
object sendMessage extends js.Object {
  /**
    * Sends a single message to event listeners within your extension/app or a different extension/app. Similar to
    * `runtime.connect` but only sends a single message, with an optional response. If sending to your extension, the
    * `runtime.onMessage` event will be fired in each page, or `runtime.onMessageExternal`, if a different extension.
    * Note that extensions cannot send messages to content scripts using this method. To send messages to content
    * scripts, use `tabs.sendMessage`.
    *
    * Allowed in: Proxy scripts
    * @param extensionId The ID of the extension/app to send the message to. If omitted, the message will be sent to
    *     your own extension/app. Required if sending messages from a web page for web messaging.
    */
  def apply(extensionId: String, message: js.Any): js.Promise[_] = js.native
  def apply(extensionId: String, message: js.Any, options: AnonIncludeTlsChannelIdToProxyScript): js.Promise[_] = js.native
  /**
    * Sends a single message to event listeners within your extension/app or a different extension/app. Similar to
    * `runtime.connect` but only sends a single message, with an optional response. If sending to your extension, the
    * `runtime.onMessage` event will be fired in each page, or `runtime.onMessageExternal`, if a different extension.
    * Note that extensions cannot send messages to content scripts using this method. To send messages to content
    * scripts, use `tabs.sendMessage`.
    *
    * Allowed in: Proxy scripts
    */
  def apply(message: js.Any): js.Promise[_] = js.native
  def apply(message: js.Any, options: AnonIncludeTlsChannelIdToProxyScript): js.Promise[_] = js.native
}

