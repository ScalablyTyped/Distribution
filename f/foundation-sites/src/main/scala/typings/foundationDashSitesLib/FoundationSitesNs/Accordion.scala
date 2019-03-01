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
    destroy: js.Function0[scala.Unit],
    down: js.Function2[foundationDashSitesLib.JQuery, scala.Boolean, scala.Unit],
    toggle: js.Function1[foundationDashSitesLib.JQuery, scala.Unit],
    up: js.Function1[foundationDashSitesLib.JQuery, scala.Unit]
  ): Accordion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("down")(down)
    __obj.updateDynamic("toggle")(toggle)
    __obj.updateDynamic("up")(up)
    __obj.asInstanceOf[Accordion]
  }
}

