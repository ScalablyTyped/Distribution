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
    close: () => scala.Unit,
    destroy: () => scala.Unit,
    getPositionClass: () => java.lang.String,
    open: () => scala.Unit,
    toggle: () => scala.Unit
  ): Dropdown = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), getPositionClass = js.Any.fromFunction0(getPositionClass), open = js.Any.fromFunction0(open), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[Dropdown]
  }
}

