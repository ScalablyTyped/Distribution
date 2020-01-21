package typings.googleAppsScript.GoogleAppsScript.Events

import org.scalablytyped.runtime.StringDictionary
import typings.googleAppsScript.GoogleAppsScript.Base.User
import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Range
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
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], namedValues = namedValues.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SheetsOnFormSubmit]
  }
}

