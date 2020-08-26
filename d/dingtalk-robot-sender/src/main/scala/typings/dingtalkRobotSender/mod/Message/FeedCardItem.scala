package typings.dingtalkRobotSender.mod.Message

import typings.dingtalkRobotSender.anon.MessageURL_
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.feedCard
import typings.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedCardItem extends MessageType {
  var feedCard: MessageURL_ = js.native
  var msgtype: feedCard = js.native
}

object FeedCardItem {
  @scala.inline
  def apply(feedCard: MessageURL_, msgtype: feedCard): FeedCardItem = {
    val __obj = js.Dynamic.literal(feedCard = feedCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedCardItem]
  }
  @scala.inline
  implicit class FeedCardItemOps[Self <: FeedCardItem] (val x: Self) extends AnyVal {
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
    def setFeedCard(value: MessageURL_): Self = this.set("feedCard", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsgtype(value: feedCard): Self = this.set("msgtype", value.asInstanceOf[js.Any])
  }
  
}

