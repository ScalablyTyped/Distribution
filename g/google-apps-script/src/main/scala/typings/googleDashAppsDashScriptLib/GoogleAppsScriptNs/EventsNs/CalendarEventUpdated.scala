package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarEventUpdated extends AppsScriptEvent {
  var calendarId: java.lang.String
}

object CalendarEventUpdated {
  @scala.inline
  def apply(
    authMode: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthMode,
    calendarId: java.lang.String,
    triggerUid: java.lang.String,
    user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User
  ): CalendarEventUpdated = {
    val __obj = js.Dynamic.literal(authMode = authMode, calendarId = calendarId, triggerUid = triggerUid, user = user)
  
    __obj.asInstanceOf[CalendarEventUpdated]
  }
}

