package typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.User
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ScriptNs.AuthMode
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.Range
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.Spreadsheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsOnEdit extends AppsScriptEvent {
  var oldValue: String
  var range: Range
  var source: Spreadsheet
  var value: String
}

object SheetsOnEdit {
  @scala.inline
  def apply(
    authMode: AuthMode,
    oldValue: String,
    range: Range,
    source: Spreadsheet,
    triggerUid: String,
    user: User,
    value: String
  ): SheetsOnEdit = {
    val __obj = js.Dynamic.literal(authMode = authMode, oldValue = oldValue, range = range, source = source, triggerUid = triggerUid, user = user, value = value)
  
    __obj.asInstanceOf[SheetsOnEdit]
  }
}

