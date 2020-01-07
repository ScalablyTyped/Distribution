package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Brief description of the live stream status.
  */
@js.native
trait Schema$LiveStreamStatus extends js.Object {
  /**
    * The health status of the stream.
    */
  var healthStatus: js.UndefOr[Schema$LiveStreamHealthStatus] = js.native
  var streamStatus: js.UndefOr[String] = js.native
}

object Schema$LiveStreamStatus {
  @scala.inline
  def apply(healthStatus: Schema$LiveStreamHealthStatus = null, streamStatus: String = null): Schema$LiveStreamStatus = {
    val __obj = js.Dynamic.literal()
    if (healthStatus != null) __obj.updateDynamic("healthStatus")(healthStatus.asInstanceOf[js.Any])
    if (streamStatus != null) __obj.updateDynamic("streamStatus")(streamStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveStreamStatus]
  }
}

