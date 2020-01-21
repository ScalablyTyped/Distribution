package typings.firefoxWebextBrowser.browser.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.sessions.getWindowValue")
@js.native
object getWindowValue extends js.Object {
  /**
    * Retrieve a value that was set for a given key on a given window.
    * @param windowId The id of the window whose value is being retrieved from.
    * @param key The key which corresponds to the value.
    */
  def apply(windowId: Double, key: String): js.Promise[js.UndefOr[String | js.Object]] = js.native
}

