package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSGlobal("GoogleAppsScript.Charts.Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait HORIZONTAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Orientation
  
  @js.native
  sealed trait VERTICAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Orientation
  
  /* 0 */ val HORIZONTAL: HORIZONTAL with scala.Double = js.native
  /* 1 */ val VERTICAL: VERTICAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Orientation with scala.Double
  ] = js.native
}

