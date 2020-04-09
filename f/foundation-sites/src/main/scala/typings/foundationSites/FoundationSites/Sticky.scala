package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://get.foundation/sites/docs/sticky.html#javascript-reference
trait Sticky extends js.Object {
  def destroy(): Unit
}

object Sticky {
  @scala.inline
  def apply(destroy: () => Unit): Sticky = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[Sticky]
  }
}

