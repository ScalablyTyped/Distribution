package typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.User
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ScriptNs.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarEventUpdated extends AppsScriptEvent {
  var calendarId: String
}

object CalendarEventUpdated {
  @scala.inline
  def apply(authMode: AuthMode, calendarId: String, triggerUid: String, user: User): CalendarEventUpdated = {
    val __obj = js.Dynamic.literal(authMode = authMode, calendarId = calendarId, triggerUid = triggerUid, user = user)
  
    __obj.asInstanceOf[CalendarEventUpdated]
  }
}

