package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.getCurrent")
@js.native
object getCurrent extends js.Object {
  /**
    * Gets the tab that this script call is being made from. May be undefined if called from a non-tab context (for
    * example: a background page or popup view).
    */
  def apply(): js.Promise[Tab] = js.native
}

