package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PickerValuesLayout extends js.Object

@JSGlobal("GoogleAppsScript.Charts.PickerValuesLayout")
@js.native
object PickerValuesLayout extends js.Object {
  @js.native
  sealed trait ASIDE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PickerValuesLayout
  
  @js.native
  sealed trait BELOW
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PickerValuesLayout
  
  @js.native
  sealed trait BELOW_STACKED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PickerValuesLayout
  
  @js.native
  sealed trait BELOW_WRAPPING
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PickerValuesLayout
  
  /* 0 */ val ASIDE: ASIDE with scala.Double = js.native
  /* 1 */ val BELOW: BELOW with scala.Double = js.native
  /* 3 */ val BELOW_STACKED: BELOW_STACKED with scala.Double = js.native
  /* 2 */ val BELOW_WRAPPING: BELOW_WRAPPING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PickerValuesLayout with scala.Double
  ] = js.native
}

