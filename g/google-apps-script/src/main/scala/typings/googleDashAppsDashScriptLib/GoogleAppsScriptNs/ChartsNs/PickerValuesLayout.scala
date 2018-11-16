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
  
  val ASIDE: ASIDE with java.lang.String = js.native
  val BELOW: BELOW with java.lang.String = js.native
  val BELOW_STACKED: BELOW_STACKED with java.lang.String = js.native
  val BELOW_WRAPPING: BELOW_WRAPPING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PickerValuesLayout with java.lang.String
  ] = js.native
}

