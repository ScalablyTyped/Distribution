package typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.User
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ScriptNs.AuthMode
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.Spreadsheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsOnOpen extends AppsScriptEvent {
  var source: Spreadsheet
}

object SheetsOnOpen {
  @scala.inline
  def apply(authMode: AuthMode, source: Spreadsheet, triggerUid: String, user: User): SheetsOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode, source = source, triggerUid = triggerUid, user = user)
  
    __obj.asInstanceOf[SheetsOnOpen]
  }
}

