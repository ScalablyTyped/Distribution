package typings.domDashHelpers

import typings.std.FrameRequestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/animationFrame", JSImport.Namespace)
@js.native
object cjsAnimationFrameMod extends js.Object {
  val request: js.Function1[/* callback */ FrameRequestCallback, Double] = js.native
  def cancel(id: Double): Unit = js.native
}

