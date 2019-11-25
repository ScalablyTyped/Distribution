package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

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
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveStreamConfigurationIssue]
  }
}

