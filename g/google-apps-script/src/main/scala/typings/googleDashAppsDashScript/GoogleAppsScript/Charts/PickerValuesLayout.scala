package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PickerValuesLayout extends js.Object

@JSGlobal("GoogleAppsScript.Charts.PickerValuesLayout")
@js.native
object PickerValuesLayout extends js.Object {
  @js.native
  sealed trait ASIDE extends PickerValuesLayout
  
  @js.native
  sealed trait BELOW extends PickerValuesLayout
  
  @js.native
  sealed trait BELOW_STACKED extends PickerValuesLayout
  
  @js.native
  sealed trait BELOW_WRAPPING extends PickerValuesLayout
  
  /* 0 */ val ASIDE: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.PickerValuesLayout.ASIDE with Double = js.native
  /* 1 */ val BELOW: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.PickerValuesLayout.BELOW with Double = js.native
  /* 3 */ val BELOW_STACKED: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.PickerValuesLayout.BELOW_STACKED with Double = js.native
  /* 2 */ val BELOW_WRAPPING: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.PickerValuesLayout.BELOW_WRAPPING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PickerValuesLayout with Double] = js.native
}

