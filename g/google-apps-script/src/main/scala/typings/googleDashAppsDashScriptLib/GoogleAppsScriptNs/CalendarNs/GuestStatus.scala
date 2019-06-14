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
  
  /* 0 */ val INVITED: INVITED with scala.Double = js.native
  /* 1 */ val MAYBE: MAYBE with scala.Double = js.native
  /* 2 */ val NO: NO with scala.Double = js.native
  /* 3 */ val OWNER: OWNER with scala.Double = js.native
  /* 4 */ val YES: YES with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.GuestStatus with scala.Double
  ] = js.native
}

