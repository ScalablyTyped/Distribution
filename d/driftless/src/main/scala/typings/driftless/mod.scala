package typings.driftless

import typings.driftless.anon.CustomClearTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("driftless", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def clearDriftless(id: Double): Unit = js.native
  def clearDriftless(id: Double, options: CustomClearTimeout): Unit = js.native
  
  def setDriftlessInterval(callback: String, delayMs: Double, params: js.Any*): Double = js.native
  def setDriftlessInterval(callback: js.Function1[/* repeated */ js.Any, Unit], delayMs: Double, params: js.Any*): Double = js.native
  
  def setDriftlessTimeout(callback: String, delayMs: Double, params: js.Any*): Double = js.native
  def setDriftlessTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], delayMs: Double, params: js.Any*): Double = js.native
}
