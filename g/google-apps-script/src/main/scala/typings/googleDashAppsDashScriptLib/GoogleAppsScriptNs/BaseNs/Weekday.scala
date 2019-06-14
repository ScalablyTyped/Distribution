package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Weekday extends js.Object

@JSGlobal("GoogleAppsScript.Base.Weekday")
@js.native
object Weekday extends js.Object {
  @js.native
  sealed trait FRIDAY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday
  
  @js.native
  sealed trait MONDAY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday
  
  @js.native
  sealed trait SATURDAY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday
  
  @js.native
  sealed trait SUNDAY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday
  
  @js.native
  sealed trait THURSDAY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday
  
  @js.native
  sealed trait TUESDAY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday
  
  @js.native
  sealed trait WEDNESDAY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday
  
  /* 5 */ val FRIDAY: FRIDAY with scala.Double = js.native
  /* 1 */ val MONDAY: MONDAY with scala.Double = js.native
  /* 6 */ val SATURDAY: SATURDAY with scala.Double = js.native
  /* 0 */ val SUNDAY: SUNDAY with scala.Double = js.native
  /* 4 */ val THURSDAY: THURSDAY with scala.Double = js.native
  /* 2 */ val TUESDAY: TUESDAY with scala.Double = js.native
  /* 3 */ val WEDNESDAY: WEDNESDAY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday with scala.Double] = js.native
}

