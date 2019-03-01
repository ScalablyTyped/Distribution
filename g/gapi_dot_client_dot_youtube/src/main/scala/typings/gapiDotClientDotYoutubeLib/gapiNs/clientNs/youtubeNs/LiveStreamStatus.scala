package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamStatus extends js.Object {
  /** The health status of the stream. */
  var healthStatus: js.UndefOr[LiveStreamHealthStatus] = js.undefined
  var streamStatus: js.UndefOr[java.lang.String] = js.undefined
}

object LiveStreamStatus {
  @scala.inline
  def apply(healthStatus: LiveStreamHealthStatus = null, streamStatus: java.lang.String = null): LiveStreamStatus = {
    val __obj = js.Dynamic.literal()
    if (healthStatus != null) __obj.updateDynamic("healthStatus")(healthStatus)
    if (streamStatus != null) __obj.updateDynamic("streamStatus")(streamStatus)
    __obj.asInstanceOf[LiveStreamStatus]
  }
}

