package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormsOnOpen extends AppsScriptEvent {
  var source: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.Form
}

object FormsOnOpen {
  @scala.inline
  def apply(
    authMode: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthMode,
    source: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.Form,
    triggerUid: java.lang.String,
    user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User
  ): FormsOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode, source = source, triggerUid = triggerUid, user = user)
  
    __obj.asInstanceOf[FormsOnOpen]
  }
}

