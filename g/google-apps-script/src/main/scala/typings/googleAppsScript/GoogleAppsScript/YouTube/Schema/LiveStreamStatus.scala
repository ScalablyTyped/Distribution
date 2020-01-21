package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamStatus extends js.Object {
  var healthStatus: js.UndefOr[LiveStreamHealthStatus] = js.undefined
  var streamStatus: js.UndefOr[String] = js.undefined
}

object LiveStreamStatus {
  @scala.inline
  def apply(healthStatus: LiveStreamHealthStatus = null, streamStatus: String = null): LiveStreamStatus = {
    val __obj = js.Dynamic.literal()
    if (healthStatus != null) __obj.updateDynamic("healthStatus")(healthStatus.asInstanceOf[js.Any])
    if (streamStatus != null) __obj.updateDynamic("streamStatus")(streamStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveStreamStatus]
  }
}

