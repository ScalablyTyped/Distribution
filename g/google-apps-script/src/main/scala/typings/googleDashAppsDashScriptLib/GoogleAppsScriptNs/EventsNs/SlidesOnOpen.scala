package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlidesOnOpen extends AppsScriptEvent {
  var source: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.Presentation
}

object SlidesOnOpen {
  @scala.inline
  def apply(
    authMode: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthMode,
    source: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.Presentation,
    triggerUid: java.lang.String,
    user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User
  ): SlidesOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode, source = source, triggerUid = triggerUid, user = user)
  
    __obj.asInstanceOf[SlidesOnOpen]
  }
}

