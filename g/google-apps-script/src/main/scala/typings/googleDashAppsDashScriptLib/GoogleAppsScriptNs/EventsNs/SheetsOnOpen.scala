package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsOnOpen extends AppsScriptEvent {
  var source: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Spreadsheet
}

object SheetsOnOpen {
  @scala.inline
  def apply(
    authMode: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthMode,
    source: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Spreadsheet,
    triggerUid: java.lang.String,
    user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User
  ): SheetsOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode, source = source, triggerUid = triggerUid, user = user)
  
    __obj.asInstanceOf[SheetsOnOpen]
  }
}

