package typings.foundationDashSites.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/dropdown.html#javascript-reference
trait Dropdown extends js.Object {
  def close(): Unit
  def destroy(): Unit
  def getPositionClass(): String
  def open(): Unit
  def toggle(): Unit
}

object Dropdown {
  @scala.inline
  def apply(
    close: () => Unit,
    destroy: () => Unit,
    getPositionClass: () => String,
    open: () => Unit,
    toggle: () => Unit
  ): Dropdown = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), getPositionClass = js.Any.fromFunction0(getPositionClass), open = js.Any.fromFunction0(open), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[Dropdown]
  }
}

