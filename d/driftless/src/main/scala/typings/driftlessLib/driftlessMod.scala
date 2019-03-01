package typings
package driftlessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("driftless", JSImport.Namespace)
@js.native
object driftlessMod extends js.Object {
  def clearDriftless(id: scala.Double): scala.Unit = js.native
  def clearDriftless(id: scala.Double, options: driftlessLib.Anon_Args): scala.Unit = js.native
  def setDriftlessInterval(callback: java.lang.String, delayMs: scala.Double, params: js.Any*): scala.Double = js.native
  def setDriftlessInterval(callback: js.Function1[/* repeated */ js.Any, scala.Unit], delayMs: scala.Double, params: js.Any*): scala.Double = js.native
  def setDriftlessTimeout(callback: java.lang.String, delayMs: scala.Double, params: js.Any*): scala.Double = js.native
  def setDriftlessTimeout(callback: js.Function1[/* repeated */ js.Any, scala.Unit], delayMs: scala.Double, params: js.Any*): scala.Double = js.native
}

