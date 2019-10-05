package typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message

import typings.dingtalkDashRobotDashSender.Anon_MessageURL
import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.MessageType
import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.feedCard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedCardItem extends MessageType {
  var feedCard: Anon_MessageURL
  var msgtype: feedCard
}

object FeedCardItem {
  @scala.inline
  def apply(feedCard: Anon_MessageURL, msgtype: feedCard): FeedCardItem = {
    val __obj = js.Dynamic.literal(feedCard = feedCard, msgtype = msgtype)
  
    __obj.asInstanceOf[FeedCardItem]
  }
}

