package typings.googleDashAppsDashScript.GoogleAppsScript.Events

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// External interfaces
trait SheetsOnOpen extends AppsScriptEvent {
  var source: Spreadsheet
}

object SheetsOnOpen {
  @scala.inline
  def apply(authMode: AuthMode, source: Spreadsheet, triggerUid: String, user: User): SheetsOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SheetsOnOpen]
  }
}

