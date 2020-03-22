package typings.firefoxWebextBrowser.browser.tabs

import typings.firefoxWebextBrowser.AnonHighlighted
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
  def apply(tabId: Double, updateProperties: AnonHighlighted): js.Promise[Tab] = js.native
  /**
    * Modifies the properties of a tab. Properties that are not specified in `updateProperties` are not modified.
    */
  def apply(updateProperties: AnonHighlighted): js.Promise[Tab] = js.native
}

