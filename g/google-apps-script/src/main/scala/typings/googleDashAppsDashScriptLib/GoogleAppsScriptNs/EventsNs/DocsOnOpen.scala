package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocsOnOpen extends AppsScriptEvent {
  var source: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.Document
}

object DocsOnOpen {
  @scala.inline
  def apply(
    authMode: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthMode,
    source: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.Document,
    triggerUid: java.lang.String,
    user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User
  ): DocsOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode, source = source, triggerUid = triggerUid, user = user)
  
    __obj.asInstanceOf[DocsOnOpen]
  }
}

