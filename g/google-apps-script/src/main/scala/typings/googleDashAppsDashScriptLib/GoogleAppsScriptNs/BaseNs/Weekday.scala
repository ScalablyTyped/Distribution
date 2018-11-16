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
  
  val FRIDAY: FRIDAY with java.lang.String = js.native
  val MONDAY: MONDAY with java.lang.String = js.native
  val SATURDAY: SATURDAY with java.lang.String = js.native
  val SUNDAY: SUNDAY with java.lang.String = js.native
  val THURSDAY: THURSDAY with java.lang.String = js.native
  val TUESDAY: TUESDAY with java.lang.String = js.native
  val WEDNESDAY: WEDNESDAY with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday with java.lang.String
  ] = js.native
}

