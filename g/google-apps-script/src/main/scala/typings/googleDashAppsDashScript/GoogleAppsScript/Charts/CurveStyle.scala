package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CurveStyle extends js.Object

@JSGlobal("GoogleAppsScript.Charts.CurveStyle")
@js.native
object CurveStyle extends js.Object {
  @js.native
  sealed trait NORMAL extends CurveStyle
  
  @js.native
  sealed trait SMOOTH extends CurveStyle
  
  /* 0 */ val NORMAL: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.CurveStyle.NORMAL with Double = js.native
  /* 1 */ val SMOOTH: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.CurveStyle.SMOOTH with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CurveStyle with Double] = js.native
}

