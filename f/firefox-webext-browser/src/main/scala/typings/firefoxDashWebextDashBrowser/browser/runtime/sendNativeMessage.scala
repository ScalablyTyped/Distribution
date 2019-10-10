package typings.firefoxDashWebextDashBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.runtime.sendNativeMessage")
@js.native
object sendNativeMessage extends js.Object {
  /**
    * Send a single message to a native application.
    *
    * Not allowed in: Devtools pages
    * @param application The name of the native messaging host.
    * @param message The message that will be passed to the native messaging host.
    */
  def apply(application: String, message: js.Any): js.Promise[_] = js.native
}

