package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GuestStatus extends js.Object

@JSGlobal("GoogleAppsScript.Calendar.GuestStatus")
@js.native
object GuestStatus extends js.Object {
  @js.native
  sealed trait INVITED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.GuestStatus
  
  @js.native
  sealed trait MAYBE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.GuestStatus
  
  @js.native
  sealed trait NO
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.GuestStatus
  
  @js.native
  sealed trait OWNER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.GuestStatus
  
  @js.native
  sealed trait YES
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.GuestStatus
  
  val INVITED: INVITED with java.lang.String = js.native
  val MAYBE: MAYBE with java.lang.String = js.native
  val NO: NO with java.lang.String = js.native
  val OWNER: OWNER with java.lang.String = js.native
  val YES: YES with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.GuestStatus with java.lang.String
  ] = js.native
}

