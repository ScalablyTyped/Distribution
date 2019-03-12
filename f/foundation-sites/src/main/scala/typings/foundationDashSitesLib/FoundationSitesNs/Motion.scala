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
    animateIn: (js.Object, js.Any, js.Function) => scala.Unit,
    animateOut: (js.Object, js.Any, js.Function) => scala.Unit
  ): Motion = {
    val __obj = js.Dynamic.literal(animateIn = js.Any.fromFunction3(animateIn), animateOut = js.Any.fromFunction3(animateOut))
  
    __obj.asInstanceOf[Motion]
  }
}

