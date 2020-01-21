package typings.firefoxWebextBrowser.browser.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.sessions.setWindowValue")
@js.native
object setWindowValue extends js.Object {
  /**
    * Set a key/value pair on a given window.
    * @param windowId The id of the window that the key/value pair is being set on.
    * @param key The key which corresponds to the value being set.
    * @param value The value being set.
    */
  def apply(windowId: Double, key: String, value: js.Any): js.Promise[Unit] = js.native
}

