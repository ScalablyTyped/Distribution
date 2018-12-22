package typings
package domDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/transition/end", JSImport.Namespace)
@js.native
object transitionEndMod extends js.Object {
  def apply[T /* <: stdLib.Element */](element: T, handler: js.Function1[/* event */ domDashHelpersLib.Anon_CurrentTarget[T], scala.Unit]): scala.Unit = js.native
  def apply[T /* <: stdLib.Element */](
    element: T,
    handler: js.Function1[/* event */ domDashHelpersLib.Anon_CurrentTarget[T], scala.Unit],
    duration: scala.Double
  ): scala.Unit = js.native
}

