package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelStatistics extends js.Object {
  var commentCount: js.UndefOr[String] = js.undefined
  var hiddenSubscriberCount: js.UndefOr[Boolean] = js.undefined
  var subscriberCount: js.UndefOr[String] = js.undefined
  var videoCount: js.UndefOr[String] = js.undefined
  var viewCount: js.UndefOr[String] = js.undefined
}

object ChannelStatistics {
  @scala.inline
  def apply(
    commentCount: String = null,
    hiddenSubscriberCount: js.UndefOr[Boolean] = js.undefined,
    subscriberCount: String = null,
    videoCount: String = null,
    viewCount: String = null
  ): ChannelStatistics = {
    val __obj = js.Dynamic.literal()
    if (commentCount != null) __obj.updateDynamic("commentCount")(commentCount.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenSubscriberCount)) __obj.updateDynamic("hiddenSubscriberCount")(hiddenSubscriberCount.asInstanceOf[js.Any])
    if (subscriberCount != null) __obj.updateDynamic("subscriberCount")(subscriberCount.asInstanceOf[js.Any])
    if (videoCount != null) __obj.updateDynamic("videoCount")(videoCount.asInstanceOf[js.Any])
    if (viewCount != null) __obj.updateDynamic("viewCount")(viewCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelStatistics]
  }
}

