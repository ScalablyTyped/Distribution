package typings.googleDashAppsDashScript.GoogleAppsScript.Events

import org.scalablytyped.runtime.StringDictionary
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsOnFormSubmit extends AppsScriptEvent {
  var namedValues: StringDictionary[js.Array[String]]
  var range: Range
  var values: js.Array[String]
}

object SheetsOnFormSubmit {
  @scala.inline
  def apply(
    authMode: AuthMode,
    namedValues: StringDictionary[js.Array[String]],
    range: Range,
    triggerUid: String,
    user: User,
    values: js.Array[String]
  ): SheetsOnFormSubmit = {
    val __obj = js.Dynamic.literal(authMode = authMode, namedValues = namedValues, range = range, triggerUid = triggerUid, user = user, values = values)
  
    __obj.asInstanceOf[SheetsOnFormSubmit]
  }
}

