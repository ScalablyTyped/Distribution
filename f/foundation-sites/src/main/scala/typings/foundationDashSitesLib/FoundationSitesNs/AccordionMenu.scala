package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/accordion-menu.html#javascript-reference
trait AccordionMenu extends js.Object {
  def destroy(): scala.Unit
  def down($target: foundationDashSitesLib.JQuery, firstTime: scala.Boolean): scala.Unit
  def hideAll(): scala.Unit
  def toggle($target: foundationDashSitesLib.JQuery): scala.Unit
  def up($target: foundationDashSitesLib.JQuery): scala.Unit
}

object AccordionMenu {
  @scala.inline
  def apply(
    destroy: () => scala.Unit,
    down: (foundationDashSitesLib.JQuery, scala.Boolean) => scala.Unit,
    hideAll: () => scala.Unit,
    toggle: foundationDashSitesLib.JQuery => scala.Unit,
    up: foundationDashSitesLib.JQuery => scala.Unit
  ): AccordionMenu = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), down = js.Any.fromFunction2(down), hideAll = js.Any.fromFunction0(hideAll), toggle = js.Any.fromFunction1(toggle), up = js.Any.fromFunction1(up))
  
    __obj.asInstanceOf[AccordionMenu]
  }
}

