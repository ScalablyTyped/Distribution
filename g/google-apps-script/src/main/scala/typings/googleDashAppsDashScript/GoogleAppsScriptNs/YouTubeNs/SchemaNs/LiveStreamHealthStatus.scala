package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamHealthStatus extends js.Object {
  var configurationIssues: js.UndefOr[js.Array[LiveStreamConfigurationIssue]] = js.undefined
  var lastUpdateTimeSeconds: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object LiveStreamHealthStatus {
  @scala.inline
  def apply(
    configurationIssues: js.Array[LiveStreamConfigurationIssue] = null,
    lastUpdateTimeSeconds: String = null,
    status: String = null
  ): LiveStreamHealthStatus = {
    val __obj = js.Dynamic.literal()
    if (configurationIssues != null) __obj.updateDynamic("configurationIssues")(configurationIssues)
    if (lastUpdateTimeSeconds != null) __obj.updateDynamic("lastUpdateTimeSeconds")(lastUpdateTimeSeconds)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[LiveStreamHealthStatus]
  }
}

