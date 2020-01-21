package typings.firefoxWebextBrowser.browser.menus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.menus.getTargetElement")
@js.native
object getTargetElement extends js.Object {
  /**
    * Retrieve the element that was associated with a recent contextmenu event.
    * @param targetElementId The identifier of the clicked element, available as info.targetElementId in the
    *     menus.onShown, onClicked or onclick event.
    */
  def apply(targetElementId: Double): js.Object | Unit = js.native
}

