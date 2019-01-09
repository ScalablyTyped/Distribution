package typings
package domDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  var default: Anon_End = js.native
  @JSName("end")
  var end_Original: Anon_Duration = js.native
  var properties: Anon_AnimationDelay = js.native
  def end[T /* <: stdLib.Element */](element: T, handler: js.Function1[/* event */ Anon_CurrentTarget[T], scala.Unit]): scala.Unit = js.native
  def end[T /* <: stdLib.Element */](
    element: T,
    handler: js.Function1[/* event */ Anon_CurrentTarget[T], scala.Unit],
    duration: scala.Double
  ): scala.Unit = js.native
}

