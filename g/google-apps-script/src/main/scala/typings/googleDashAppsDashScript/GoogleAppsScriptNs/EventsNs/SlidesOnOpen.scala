package typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.User
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ScriptNs.AuthMode
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlidesOnOpen extends AppsScriptEvent {
  var source: Presentation
}

object SlidesOnOpen {
  @scala.inline
  def apply(authMode: AuthMode, source: Presentation, triggerUid: String, user: User): SlidesOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode, source = source, triggerUid = triggerUid, user = user)
  
    __obj.asInstanceOf[SlidesOnOpen]
  }
}

