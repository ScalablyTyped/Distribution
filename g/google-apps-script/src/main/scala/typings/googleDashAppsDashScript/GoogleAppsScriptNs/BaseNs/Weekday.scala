package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Weekday extends js.Object

@JSGlobal("GoogleAppsScript.Base.Weekday")
@js.native
object Weekday extends js.Object {
  @js.native
  sealed trait FRIDAY extends Weekday
  
  @js.native
  sealed trait MONDAY extends Weekday
  
  @js.native
  sealed trait SATURDAY extends Weekday
  
  @js.native
  sealed trait SUNDAY extends Weekday
  
  @js.native
  sealed trait THURSDAY extends Weekday
  
  @js.native
  sealed trait TUESDAY extends Weekday
  
  @js.native
  sealed trait WEDNESDAY extends Weekday
  
  /* 5 */ val FRIDAY: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Weekday.FRIDAY with Double = js.native
  /* 1 */ val MONDAY: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Weekday.MONDAY with Double = js.native
  /* 6 */ val SATURDAY: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Weekday.SATURDAY with Double = js.native
  /* 0 */ val SUNDAY: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Weekday.SUNDAY with Double = js.native
  /* 4 */ val THURSDAY: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Weekday.THURSDAY with Double = js.native
  /* 2 */ val TUESDAY: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Weekday.TUESDAY with Double = js.native
  /* 3 */ val WEDNESDAY: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Weekday.WEDNESDAY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Weekday with Double] = js.native
}

