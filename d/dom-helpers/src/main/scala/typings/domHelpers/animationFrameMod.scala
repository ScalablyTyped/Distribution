package typings.domHelpers

import typings.std.FrameRequestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dom-helpers/cjs/animationFrame", JSImport.Namespace)
@js.native
object animationFrameMod extends js.Object {
  
  def cancel(id: Double): Unit = js.native
  
  val request: js.Function1[/* callback */ FrameRequestCallback, Double] = js.native
}
