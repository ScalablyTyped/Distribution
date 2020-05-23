package typings.dingtalkRobotSender.mod.Message

import typings.dingtalkRobotSender.anon.BtnOrientation
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.actionCard
import typings.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCard extends MessageType {
  var actionCard: BtnOrientation
  var msgtype: actionCard
}

object ActionCard {
  @scala.inline
  def apply(actionCard: BtnOrientation, msgtype: actionCard): ActionCard = {
    val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCard]
  }
}

