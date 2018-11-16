package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointStyle extends js.Object

@JSGlobal("GoogleAppsScript.Charts.PointStyle")
@js.native
object PointStyle extends js.Object {
  @js.native
  sealed trait HUGE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PointStyle
  
  @js.native
  sealed trait LARGE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PointStyle
  
  @js.native
  sealed trait MEDIUM
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PointStyle
  
  @js.native
  sealed trait NONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PointStyle
  
  @js.native
  sealed trait TINY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PointStyle
  
  val HUGE: HUGE with java.lang.String = js.native
  val LARGE: LARGE with java.lang.String = js.native
  val MEDIUM: MEDIUM with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  val TINY: TINY with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PointStyle with java.lang.String
  ] = js.native
}

