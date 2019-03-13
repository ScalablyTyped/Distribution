package typings
package dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderMod.MessageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedCardItem extends js.Object {
  var feedCard: dingtalkDashRobotDashSenderLib.Anon_MessageURL
  var msgtype: dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.feedCard
}

object FeedCardItem {
  @scala.inline
  def apply(
    feedCard: dingtalkDashRobotDashSenderLib.Anon_MessageURL,
    msgtype: dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.feedCard
  ): FeedCardItem = {
    val __obj = js.Dynamic.literal(feedCard = feedCard, msgtype = msgtype)
  
    __obj.asInstanceOf[FeedCardItem]
  }
}

