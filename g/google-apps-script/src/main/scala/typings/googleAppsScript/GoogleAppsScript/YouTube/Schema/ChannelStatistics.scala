package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelStatistics extends js.Object {
  var commentCount: js.UndefOr[String] = js.native
  var hiddenSubscriberCount: js.UndefOr[Boolean] = js.native
  var subscriberCount: js.UndefOr[String] = js.native
  var videoCount: js.UndefOr[String] = js.native
  var viewCount: js.UndefOr[String] = js.native
}

object ChannelStatistics {
  @scala.inline
  def apply(): ChannelStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelStatistics]
  }
  @scala.inline
  implicit class ChannelStatisticsOps[Self <: ChannelStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommentCount(value: String): Self = this.set("commentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentCount: Self = this.set("commentCount", js.undefined)
    @scala.inline
    def setHiddenSubscriberCount(value: Boolean): Self = this.set("hiddenSubscriberCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenSubscriberCount: Self = this.set("hiddenSubscriberCount", js.undefined)
    @scala.inline
    def setSubscriberCount(value: String): Self = this.set("subscriberCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriberCount: Self = this.set("subscriberCount", js.undefined)
    @scala.inline
    def setVideoCount(value: String): Self = this.set("videoCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoCount: Self = this.set("videoCount", js.undefined)
    @scala.inline
    def setViewCount(value: String): Self = this.set("viewCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewCount: Self = this.set("viewCount", js.undefined)
  }
  
}

