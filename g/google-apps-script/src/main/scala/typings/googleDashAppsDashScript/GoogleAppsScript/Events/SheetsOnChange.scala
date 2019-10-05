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
    val __obj = js.Dynamic.literal(authMode = authMode, changeType = changeType, triggerUid = triggerUid, user = user)
  
    __obj.asInstanceOf[SheetsOnChange]
  }
}

