package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamConfigurationIssue extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
  var severity: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object LiveStreamConfigurationIssue {
  @scala.inline
  def apply(description: String = null, reason: String = null, severity: String = null, `type`: String = null): LiveStreamConfigurationIssue = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LiveStreamConfigurationIssue]
  }
}

