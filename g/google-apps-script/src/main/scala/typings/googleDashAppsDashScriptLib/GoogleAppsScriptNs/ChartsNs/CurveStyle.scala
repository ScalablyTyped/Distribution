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
  
  val NORMAL: NORMAL with java.lang.String = js.native
  val SMOOTH: SMOOTH with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.CurveStyle with java.lang.String
  ] = js.native
}

