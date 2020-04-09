package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://get.foundation/sites/docs/tooltip.html#javascript-reference
trait Tooltip extends js.Object {
  def destroy(): Unit
  def hide(): Unit
  def show(): Unit
  def toggle(): Unit
}

object Tooltip {
  @scala.inline
  def apply(destroy: () => Unit, hide: () => Unit, show: () => Unit, toggle: () => Unit): Tooltip = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[Tooltip]
  }
}

