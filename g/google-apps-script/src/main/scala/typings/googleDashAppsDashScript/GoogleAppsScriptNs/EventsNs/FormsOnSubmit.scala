package typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs

import org.scalablytyped.runtime.StringDictionary
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.User
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ScriptNs.AuthMode
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormsOnSubmit extends AppsScriptEvent {
  var namedValues: StringDictionary[js.Array[String]]
  var range: Range
  var values: js.Array[String]
}

object FormsOnSubmit {
  @scala.inline
  def apply(
    authMode: AuthMode,
    namedValues: StringDictionary[js.Array[String]],
    range: Range,
    triggerUid: String,
    user: User,
    values: js.Array[String]
  ): FormsOnSubmit = {
    val __obj = js.Dynamic.literal(authMode = authMode, namedValues = namedValues, range = range, triggerUid = triggerUid, user = user, values = values)
  
    __obj.asInstanceOf[FormsOnSubmit]
  }
}

