package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsOnEdit extends AppsScriptEvent {
  var oldValue: java.lang.String
  var range: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Range
  var source: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Spreadsheet
  var value: java.lang.String
}

object SheetsOnEdit {
  @scala.inline
  def apply(
    authMode: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthMode,
    oldValue: java.lang.String,
    range: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Range,
    source: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Spreadsheet,
    triggerUid: java.lang.String,
    user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User,
    value: java.lang.String
  ): SheetsOnEdit = {
    val __obj = js.Dynamic.literal(authMode = authMode, oldValue = oldValue, range = range, source = source, triggerUid = triggerUid, user = user, value = value)
  
    __obj.asInstanceOf[SheetsOnEdit]
  }
}

