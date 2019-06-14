package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CurveStyle extends js.Object

@JSGlobal("GoogleAppsScript.Charts.CurveStyle")
@js.native
object CurveStyle extends js.Object {
  @js.native
  sealed trait NORMAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.CurveStyle
  
  @js.native
  sealed trait SMOOTH
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.CurveStyle
  
  /* 0 */ val NORMAL: NORMAL with scala.Double = js.native
  /* 1 */ val SMOOTH: SMOOTH with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.CurveStyle with scala.Double
  ] = js.native
}

