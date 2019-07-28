package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointStyle extends js.Object

@JSGlobal("GoogleAppsScript.Charts.PointStyle")
@js.native
object PointStyle extends js.Object {
  @js.native
  sealed trait HUGE extends PointStyle
  
  @js.native
  sealed trait LARGE extends PointStyle
  
  @js.native
  sealed trait MEDIUM extends PointStyle
  
  @js.native
  sealed trait NONE extends PointStyle
  
  @js.native
  sealed trait TINY extends PointStyle
  
  /* 4 */ val HUGE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.PointStyle.HUGE with Double = js.native
  /* 3 */ val LARGE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.PointStyle.LARGE with Double = js.native
  /* 2 */ val MEDIUM: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.PointStyle.MEDIUM with Double = js.native
  /* 0 */ val NONE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.PointStyle.NONE with Double = js.native
  /* 1 */ val TINY: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.PointStyle.TINY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointStyle with Double] = js.native
}

