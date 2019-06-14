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
  
  /* 4 */ val HUGE: HUGE with scala.Double = js.native
  /* 3 */ val LARGE: LARGE with scala.Double = js.native
  /* 2 */ val MEDIUM: MEDIUM with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 1 */ val TINY: TINY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PointStyle with scala.Double
  ] = js.native
}

