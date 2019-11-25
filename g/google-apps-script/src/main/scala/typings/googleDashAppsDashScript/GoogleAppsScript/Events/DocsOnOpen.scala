package typings.googleDashAppsDashScript.GoogleAppsScript.Events

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocsOnOpen extends AppsScriptEvent {
  var source: typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document
}

object DocsOnOpen {
  @scala.inline
  def apply(
    authMode: AuthMode,
    source: typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document,
    triggerUid: String,
    user: User
  ): DocsOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocsOnOpen]
  }
}

