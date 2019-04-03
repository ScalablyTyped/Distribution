package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsOnChange extends AppsScriptEvent {
  var changeType: SheetsOnChangeChangeType
}

object SheetsOnChange {
  @scala.inline
  def apply(
    authMode: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthMode,
    changeType: SheetsOnChangeChangeType,
    triggerUid: java.lang.String,
    user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User
  ): SheetsOnChange = {
    val __obj = js.Dynamic.literal(authMode = authMode, changeType = changeType, triggerUid = triggerUid, user = user)
  
    __obj.asInstanceOf[SheetsOnChange]
  }
}

