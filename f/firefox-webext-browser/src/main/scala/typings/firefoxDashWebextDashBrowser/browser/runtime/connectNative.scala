package typings.firefoxDashWebextDashBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.runtime.connectNative")
@js.native
object connectNative extends js.Object {
  /**
    * Connects to a native application in the host machine.
    *
    * Not allowed in: Devtools pages
    * @param application The name of the registered application to connect to.
    * @returns Port through which messages can be sent and received with the application
    */
  def apply(application: String): Port = js.native
}

