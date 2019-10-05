package typings.firefoxDashWebextDashBrowser.browser.menus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.menus.refresh")
@js.native
object refresh extends js.Object {
  /**
    * Updates the extension items in the shown menu, including changes that have been made since the menu was shown.
    * Has no effect if the menu is hidden. Rebuilding a shown menu is an expensive operation, only invoke this method
    * when necessary.
    */
  def apply(): js.Promise[_] = js.native
}

