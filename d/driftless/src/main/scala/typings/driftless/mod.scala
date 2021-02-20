package typings.driftless

import typings.driftless.anon.CustomClearTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("driftless", "clearDriftless")
  @js.native
  def clearDriftless(id: Double): Unit = js.native
  @JSImport("driftless", "clearDriftless")
  @js.native
  def clearDriftless(id: Double, options: CustomClearTimeout): Unit = js.native
  
  @JSImport("driftless", "setDriftlessInterval")
  @js.native
  def setDriftlessInterval(callback: String, delayMs: Double, params: js.Any*): Double = js.native
  @JSImport("driftless", "setDriftlessInterval")
  @js.native
  def setDriftlessInterval(callback: js.Function1[/* repeated */ js.Any, Unit], delayMs: Double, params: js.Any*): Double = js.native
  
  @JSImport("driftless", "setDriftlessTimeout")
  @js.native
  def setDriftlessTimeout(callback: String, delayMs: Double, params: js.Any*): Double = js.native
  @JSImport("driftless", "setDriftlessTimeout")
  @js.native
  def setDriftlessTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], delayMs: Double, params: js.Any*): Double = js.native
}
