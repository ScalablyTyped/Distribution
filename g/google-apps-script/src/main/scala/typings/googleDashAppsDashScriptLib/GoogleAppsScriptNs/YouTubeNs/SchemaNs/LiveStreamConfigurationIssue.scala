package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamConfigurationIssue extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var severity: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object LiveStreamConfigurationIssue {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    reason: java.lang.String = null,
    severity: java.lang.String = null,
    `type`: java.lang.String = null
  ): LiveStreamConfigurationIssue = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LiveStreamConfigurationIssue]
  }
}

