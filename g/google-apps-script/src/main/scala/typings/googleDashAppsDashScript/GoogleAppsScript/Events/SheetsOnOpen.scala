package typings.googleDashAppsDashScript.GoogleAppsScript.Events

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// External interfaces
trait SheetsOnOpen extends AppsScriptEvent {
  var source: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet
}

object SheetsOnOpen {
  @scala.inline
  def apply(
    authMode: AuthMode,
    source: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet,
    triggerUid: String,
    user: User
  ): SheetsOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode, source = source, triggerUid = triggerUid, user = user)
  
    __obj.asInstanceOf[SheetsOnOpen]
  }
}

