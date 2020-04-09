package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://get.foundation/sites/docs/toggler.html#javascript-reference
trait Toggler extends js.Object {
  def destroy(): Unit
  def toggle(): Unit
}

object Toggler {
  @scala.inline
  def apply(destroy: () => Unit, toggle: () => Unit): Toggler = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[Toggler]
  }
}

