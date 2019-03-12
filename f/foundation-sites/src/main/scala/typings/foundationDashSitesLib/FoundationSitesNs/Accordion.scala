package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/accordion.html#javascript-reference
trait Accordion extends js.Object {
  def destroy(): scala.Unit
  def down($target: foundationDashSitesLib.JQuery, firstTime: scala.Boolean): scala.Unit
  def toggle($target: foundationDashSitesLib.JQuery): scala.Unit
  def up($target: foundationDashSitesLib.JQuery): scala.Unit
}

object Accordion {
  @scala.inline
  def apply(
    destroy: () => scala.Unit,
    down: (foundationDashSitesLib.JQuery, scala.Boolean) => scala.Unit,
    toggle: foundationDashSitesLib.JQuery => scala.Unit,
    up: foundationDashSitesLib.JQuery => scala.Unit
  ): Accordion = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), down = js.Any.fromFunction2(down), toggle = js.Any.fromFunction1(toggle), up = js.Any.fromFunction1(up))
  
    __obj.asInstanceOf[Accordion]
  }
}

