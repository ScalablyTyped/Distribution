package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormsOnSubmit extends AppsScriptEvent {
  var namedValues: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  var range: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Range
  var values: js.Array[java.lang.String]
}

object FormsOnSubmit {
  @scala.inline
  def apply(
    authMode: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthMode,
    namedValues: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]],
    range: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Range,
    triggerUid: java.lang.String,
    user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User,
    values: js.Array[java.lang.String]
  ): FormsOnSubmit = {
    val __obj = js.Dynamic.literal(authMode = authMode, namedValues = namedValues, range = range, triggerUid = triggerUid, user = user, values = values)
  
    __obj.asInstanceOf[FormsOnSubmit]
  }
}

