package typings.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.hide")
@js.native
object hide extends js.Object {
  def apply(tabIds: js.Array[Double]): js.Promise[js.Array[Double]] = js.native
  /**
    * Hides one or more tabs. The `"tabHide"` permission is required to hide tabs. Not all tabs are hidable. Returns
    * an array of hidden tabs.
    * @param tabIds The TAB ID or list of TAB IDs to hide.
    */
  def apply(tabIds: Double): js.Promise[js.Array[Double]] = js.native
}

