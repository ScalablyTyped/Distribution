package typings.foundationDashSites.FoundationSites

import typings.foundationDashSites.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/accordion-menu.html#javascript-reference
trait AccordionMenu extends js.Object {
  def destroy(): Unit
  def down($target: JQuery, firstTime: Boolean): Unit
  def hideAll(): Unit
  def toggle($target: JQuery): Unit
  def up($target: JQuery): Unit
}

object AccordionMenu {
  @scala.inline
  def apply(
    destroy: () => Unit,
    down: (JQuery, Boolean) => Unit,
    hideAll: () => Unit,
    toggle: JQuery => Unit,
    up: JQuery => Unit
  ): AccordionMenu = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), down = js.Any.fromFunction2(down), hideAll = js.Any.fromFunction0(hideAll), toggle = js.Any.fromFunction1(toggle), up = js.Any.fromFunction1(up))
  
    __obj.asInstanceOf[AccordionMenu]
  }
}

