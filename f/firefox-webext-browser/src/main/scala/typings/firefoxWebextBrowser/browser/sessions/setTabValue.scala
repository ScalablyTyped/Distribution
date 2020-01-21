package typings.firefoxWebextBrowser.browser.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.sessions.setTabValue")
@js.native
object setTabValue extends js.Object {
  /**
    * Set a key/value pair on a given tab.
    * @param tabId The id of the tab that the key/value pair is being set on.
    * @param key The key which corresponds to the value being set.
    * @param value The value being set.
    */
  def apply(tabId: Double, key: String, value: js.Any): js.Promise[Unit] = js.native
}

