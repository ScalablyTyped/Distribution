package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Motion extends js.Object {
  def animateIn(element: js.Object, animation: js.Any, cb: js.Function): scala.Unit
  def animateOut(element: js.Object, animation: js.Any, cb: js.Function): scala.Unit
}

object Motion {
  @scala.inline
  def apply(
    animateIn: js.Function3[js.Object, js.Any, js.Function, scala.Unit],
    animateOut: js.Function3[js.Object, js.Any, js.Function, scala.Unit]
  ): Motion = {
    val __obj = js.Dynamic.literal(animateIn = animateIn, animateOut = animateOut)
  
    __obj.asInstanceOf[Motion]
  }
}

