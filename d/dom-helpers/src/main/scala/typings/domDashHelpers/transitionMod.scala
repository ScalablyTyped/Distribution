package typings.domDashHelpers

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/transition", JSImport.Namespace)
@js.native
object transitionMod extends js.Object {
  var default: Anon_End = js.native
  @JSName("end")
  var end_Original: Fn_Duration = js.native
  var properties: Anon_AnimationDelay = js.native
  def end[T /* <: Element */](element: T, handler: js.Function1[/* event */ Anon_CurrentTarget[T], Unit]): Unit = js.native
  def end[T /* <: Element */](element: T, handler: js.Function1[/* event */ Anon_CurrentTarget[T], Unit], duration: Double): Unit = js.native
}

