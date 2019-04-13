package typings
package domDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/transition", JSImport.Namespace)
@js.native
object transitionMod extends js.Object {
  var default: domDashHelpersLib.Anon_End = js.native
  @JSName("end")
  var end_Original: domDashHelpersLib.Anon_Duration = js.native
  var properties: domDashHelpersLib.Anon_AnimationDelay = js.native
  def end[T /* <: stdLib.Element */](element: T, handler: js.Function1[/* event */ domDashHelpersLib.Anon_CurrentTarget[T], scala.Unit]): scala.Unit = js.native
  def end[T /* <: stdLib.Element */](
    element: T,
    handler: js.Function1[/* event */ domDashHelpersLib.Anon_CurrentTarget[T], scala.Unit],
    duration: scala.Double
  ): scala.Unit = js.native
}

