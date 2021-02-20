package typings.domHelpers

import typings.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationFrameMod {
  
  @JSImport("dom-helpers/cjs/animationFrame", "cancel")
  @js.native
  def cancel(id: Double): Unit = js.native
  
  @JSImport("dom-helpers/cjs/animationFrame", "request")
  @js.native
  val request: js.Function1[/* callback */ FrameRequestCallback, Double] = js.native
}
