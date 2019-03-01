package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamHealthStatus extends js.Object {
  /** The configurations issues on this stream */
  var configurationIssues: js.UndefOr[js.Array[LiveStreamConfigurationIssue]] = js.undefined
  /** The last time this status was updated (in seconds) */
  var lastUpdateTimeSeconds: js.UndefOr[java.lang.String] = js.undefined
  /** The status code of this stream */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object LiveStreamHealthStatus {
  @scala.inline
  def apply(
    configurationIssues: js.Array[LiveStreamConfigurationIssue] = null,
    lastUpdateTimeSeconds: java.lang.String = null,
    status: java.lang.String = null
  ): LiveStreamHealthStatus = {
    val __obj = js.Dynamic.literal()
    if (configurationIssues != null) __obj.updateDynamic("configurationIssues")(configurationIssues)
    if (lastUpdateTimeSeconds != null) __obj.updateDynamic("lastUpdateTimeSeconds")(lastUpdateTimeSeconds)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[LiveStreamHealthStatus]
  }
}

