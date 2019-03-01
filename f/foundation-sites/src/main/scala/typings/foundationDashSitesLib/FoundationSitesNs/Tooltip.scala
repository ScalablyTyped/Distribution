package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/tooltip.html#javascript-reference
trait Tooltip extends js.Object {
  def destroy(): scala.Unit
  def hide(): scala.Unit
  def show(): scala.Unit
  def toggle(): scala.Unit
}

object Tooltip {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    hide: js.Function0[scala.Unit],
    show: js.Function0[scala.Unit],
    toggle: js.Function0[scala.Unit]
  ): Tooltip = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[Tooltip]
  }
}

