package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/slider.html#javascript-reference
trait Slider extends js.Object {
  def destroy(): scala.Unit
}

object Slider {
  @scala.inline
  def apply(destroy: () => scala.Unit): Slider = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[Slider]
  }
}

