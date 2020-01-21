package typings.firefoxWebextBrowser.browser.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.sessions.getTabValue")
@js.native
object getTabValue extends js.Object {
  /**
    * Retrieve a value that was set for a given key on a given tab.
    * @param tabId The id of the tab whose value is being retrieved from.
    * @param key The key which corresponds to the value.
    */
  def apply(tabId: Double, key: String): js.Promise[js.UndefOr[String | js.Object]] = js.native
}

