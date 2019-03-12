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
    destroy: () => scala.Unit,
    hide: () => scala.Unit,
    show: () => scala.Unit,
    toggle: () => scala.Unit
  ): Tooltip = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[Tooltip]
  }
}

