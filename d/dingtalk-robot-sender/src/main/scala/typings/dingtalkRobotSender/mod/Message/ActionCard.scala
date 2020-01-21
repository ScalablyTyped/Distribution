package typings.dingtalkRobotSender.mod.Message

import typings.dingtalkRobotSender.Anon0
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.actionCard
import typings.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCard extends MessageType {
  var actionCard: Anon0
  var msgtype: actionCard
}

object ActionCard {
  @scala.inline
  def apply(actionCard: Anon0, msgtype: actionCard): ActionCard = {
    val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionCard]
  }
}

