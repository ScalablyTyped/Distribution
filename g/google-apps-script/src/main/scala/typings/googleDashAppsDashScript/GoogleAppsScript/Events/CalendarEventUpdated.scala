package typings.googleDashAppsDashScript.GoogleAppsScript.Events

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: Is there a `user` attribute?
trait CalendarEventUpdated extends AppsScriptEvent {
  var calendarId: String
}

object CalendarEventUpdated {
  @scala.inline
  def apply(authMode: AuthMode, calendarId: String, triggerUid: String, user: User): CalendarEventUpdated = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], calendarId = calendarId.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CalendarEventUpdated]
  }
}

