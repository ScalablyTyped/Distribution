package typings.firefoxDashWebextDashBrowser.browser.tabs

import typings.firefoxDashWebextDashBrowser.Anon_ActiveHighlighted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.update")
@js.native
object update extends js.Object {
  /**
    * Modifies the properties of a tab. Properties that are not specified in `updateProperties` are not modified.
    * @param tabId Defaults to the selected tab of the current window.
    */
  def apply(tabId: Double, updateProperties: Anon_ActiveHighlighted): js.Promise[js.UndefOr[Tab]] = js.native
  /**
    * Modifies the properties of a tab. Properties that are not specified in `updateProperties` are not modified.
    */
  def apply(updateProperties: Anon_ActiveHighlighted): js.Promise[js.UndefOr[Tab]] = js.native
}

