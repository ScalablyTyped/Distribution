package typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.Message

import typings.dingtalkDashRobotDashSender.Anon_0
import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod.MessageType
import typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderStrings.actionCard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCard extends MessageType {
  var actionCard: Anon_0
  var msgtype: actionCard
}

object ActionCard {
  @scala.inline
  def apply(actionCard: Anon_0, msgtype: actionCard): ActionCard = {
    val __obj = js.Dynamic.literal(actionCard = actionCard, msgtype = msgtype)
  
    __obj.asInstanceOf[ActionCard]
  }
}

