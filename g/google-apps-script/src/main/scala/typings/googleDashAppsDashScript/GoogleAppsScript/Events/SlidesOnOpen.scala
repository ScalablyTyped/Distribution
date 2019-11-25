package typings.googleDashAppsDashScript.GoogleAppsScript.Events

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlidesOnOpen extends AppsScriptEvent {
  var source: Presentation
}

object SlidesOnOpen {
  @scala.inline
  def apply(authMode: AuthMode, source: Presentation, triggerUid: String, user: User): SlidesOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SlidesOnOpen]
  }
}

