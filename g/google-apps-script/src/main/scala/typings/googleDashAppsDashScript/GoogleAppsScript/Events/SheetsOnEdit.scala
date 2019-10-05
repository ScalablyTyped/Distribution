package typings.googleDashAppsDashScript.GoogleAppsScript.Events

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsOnEdit extends AppsScriptEvent {
  var oldValue: String
  var range: Range
  var source: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet
  var value: String
}

object SheetsOnEdit {
  @scala.inline
  def apply(
    authMode: AuthMode,
    oldValue: String,
    range: Range,
    source: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet,
    triggerUid: String,
    user: User,
    value: String
  ): SheetsOnEdit = {
    val __obj = js.Dynamic.literal(authMode = authMode, oldValue = oldValue, range = range, source = source, triggerUid = triggerUid, user = user, value = value)
  
    __obj.asInstanceOf[SheetsOnEdit]
  }
}

