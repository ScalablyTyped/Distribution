package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/dropdown.html#javascript-reference
trait Dropdown extends js.Object {
  def close(): scala.Unit
  def destroy(): scala.Unit
  def getPositionClass(): java.lang.String
  def open(): scala.Unit
  def toggle(): scala.Unit
}

object Dropdown {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    getPositionClass: js.Function0[java.lang.String],
    open: js.Function0[scala.Unit],
    toggle: js.Function0[scala.Unit]
  ): Dropdown = {
    val __obj = js.Dynamic.literal(close = close, destroy = destroy, getPositionClass = getPositionClass, open = open, toggle = toggle)
  
    __obj.asInstanceOf[Dropdown]
  }
}

