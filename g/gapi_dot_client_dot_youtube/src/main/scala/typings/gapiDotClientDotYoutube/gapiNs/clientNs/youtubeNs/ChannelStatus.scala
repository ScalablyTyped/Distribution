package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelStatus extends js.Object {
  /** If true, then the user is linked to either a YouTube username or G+ account. Otherwise, the user doesn't have a public YouTube identity. */
  var isLinked: js.UndefOr[Boolean] = js.undefined
  /** The long uploads status of this channel. See */
  var longUploadsStatus: js.UndefOr[String] = js.undefined
  /** Privacy status of the channel. */
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

