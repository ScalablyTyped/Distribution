package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamHealthStatus extends js.Object {
  /** The configurations issues on this stream */
  var configurationIssues: js.UndefOr[js.Array[LiveStreamConfigurationIssue]] = js.undefined
  /** The last time this status was updated (in seconds) */
  var lastUpdateTimeSeconds: js.UndefOr[String] = js.undefined
  /** The status code of this stream */
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
    if (configurationIssues != null) __obj.updateDynamic("configurationIssues")(configurationIssues.asInstanceOf[js.Any])
    if (lastUpdateTimeSeconds != null) __obj.updateDynamic("lastUpdateTimeSeconds")(lastUpdateTimeSeconds.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveStreamHealthStatus]
  }
}

