package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GuestStatus extends js.Object

@JSGlobal("GoogleAppsScript.Calendar.GuestStatus")
@js.native
object GuestStatus extends js.Object {
  @js.native
  sealed trait INVITED extends GuestStatus
  
  @js.native
  sealed trait MAYBE extends GuestStatus
  
  @js.native
  sealed trait NO extends GuestStatus
  
  @js.native
  sealed trait OWNER extends GuestStatus
  
  @js.native
  sealed trait YES extends GuestStatus
  
  /* 0 */ val INVITED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.GuestStatus.INVITED with Double = js.native
  /* 1 */ val MAYBE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.GuestStatus.MAYBE with Double = js.native
  /* 2 */ val NO: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.GuestStatus.NO with Double = js.native
  /* 3 */ val OWNER: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.GuestStatus.OWNER with Double = js.native
  /* 4 */ val YES: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.GuestStatus.YES with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GuestStatus with Double] = js.native
}

