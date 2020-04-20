package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://get.foundation/sites/docs/slider.html#javascript-reference
trait Slider extends js.Object {
  def destroy(): Unit
}

object Slider {
  @scala.inline
  def apply(destroy: () => Unit): Slider = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[Slider]
  }
}

