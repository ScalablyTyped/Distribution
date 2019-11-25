package typings.googleDashAppsDashScript.GoogleAppsScript.Events

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsOnChange extends AppsScriptEvent {
  var changeType: SheetsOnChangeChangeType
}

object SheetsOnChange {
  @scala.inline
  def apply(authMode: AuthMode, changeType: SheetsOnChangeChangeType, triggerUid: String, user: User): SheetsOnChange = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SheetsOnChange]
  }
}

