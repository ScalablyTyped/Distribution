package typings.dingtalkRobotSender.mod.Message

import typings.dingtalkRobotSender.anon.MessageURL_
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.feedCard
import typings.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedCardItem extends MessageType {
  var feedCard: MessageURL_
  var msgtype: feedCard
}

object FeedCardItem {
  @scala.inline
  def apply(feedCard: MessageURL_, msgtype: feedCard): FeedCardItem = {
    val __obj = js.Dynamic.literal(feedCard = feedCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedCardItem]
  }
}

