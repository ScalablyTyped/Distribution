package typings.dingtalkRobotSender.mod.Message

import typings.dingtalkRobotSender.AnonMessageURL_
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.feedCard
import typings.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedCardItem extends MessageType {
  var feedCard: AnonMessageURL_
  var msgtype: feedCard
}

object FeedCardItem {
  @scala.inline
  def apply(feedCard: AnonMessageURL_, msgtype: feedCard): FeedCardItem = {
    val __obj = js.Dynamic.literal(feedCard = feedCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedCardItem]
  }
}

