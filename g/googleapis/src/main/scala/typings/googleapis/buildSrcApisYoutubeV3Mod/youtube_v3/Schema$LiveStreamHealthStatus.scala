package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiveStreamHealthStatus extends js.Object {
  /**
    * The configurations issues on this stream
    */
  var configurationIssues: js.UndefOr[js.Array[Schema$LiveStreamConfigurationIssue]] = js.native
  /**
    * The last time this status was updated (in seconds)
    */
  var lastUpdateTimeSeconds: js.UndefOr[String] = js.native
  /**
    * The status code of this stream
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$LiveStreamHealthStatus {
  @scala.inline
  def apply(
    configurationIssues: js.Array[Schema$LiveStreamConfigurationIssue] = null,
    lastUpdateTimeSeconds: String = null,
    status: String = null
  ): Schema$LiveStreamHealthStatus = {
    val __obj = js.Dynamic.literal()
    if (configurationIssues != null) __obj.updateDynamic("configurationIssues")(configurationIssues.asInstanceOf[js.Any])
    if (lastUpdateTimeSeconds != null) __obj.updateDynamic("lastUpdateTimeSeconds")(lastUpdateTimeSeconds.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveStreamHealthStatus]
  }
}

