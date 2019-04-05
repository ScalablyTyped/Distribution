package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelStatus extends js.Object {
  var isLinked: js.UndefOr[scala.Boolean] = js.undefined
  var longUploadsStatus: js.UndefOr[java.lang.String] = js.undefined
  var privacyStatus: js.UndefOr[java.lang.String] = js.undefined
}

object ChannelStatus {
  @scala.inline
  def apply(
    isLinked: js.UndefOr[scala.Boolean] = js.undefined,
    longUploadsStatus: java.lang.String = null,
    privacyStatus: java.lang.String = null
  ): ChannelStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isLinked)) __obj.updateDynamic("isLinked")(isLinked)
    if (longUploadsStatus != null) __obj.updateDynamic("longUploadsStatus")(longUploadsStatus)
    if (privacyStatus != null) __obj.updateDynamic("privacyStatus")(privacyStatus)
    __obj.asInstanceOf[ChannelStatus]
  }
}

