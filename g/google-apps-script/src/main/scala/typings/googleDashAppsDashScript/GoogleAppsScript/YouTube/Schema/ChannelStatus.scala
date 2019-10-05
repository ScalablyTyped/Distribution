package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelStatus extends js.Object {
  var isLinked: js.UndefOr[Boolean] = js.undefined
  var longUploadsStatus: js.UndefOr[String] = js.undefined
  var privacyStatus: js.UndefOr[String] = js.undefined
}

object ChannelStatus {
  @scala.inline
  def apply(
    isLinked: js.UndefOr[Boolean] = js.undefined,
    longUploadsStatus: String = null,
    privacyStatus: String = null
  ): ChannelStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isLinked)) __obj.updateDynamic("isLinked")(isLinked)
    if (longUploadsStatus != null) __obj.updateDynamic("longUploadsStatus")(longUploadsStatus)
    if (privacyStatus != null) __obj.updateDynamic("privacyStatus")(privacyStatus)
    __obj.asInstanceOf[ChannelStatus]
  }
}

