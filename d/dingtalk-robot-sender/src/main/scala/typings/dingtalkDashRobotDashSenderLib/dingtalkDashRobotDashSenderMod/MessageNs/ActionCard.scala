package typings
package dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderMod.MessageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCard extends js.Object {
  var actionCard: dingtalkDashRobotDashSenderLib.Anon_0
  var msgtype: dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.actionCard
}

object ActionCard {
  @scala.inline
  def apply(
    actionCard: dingtalkDashRobotDashSenderLib.Anon_0,
    msgtype: dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderLibStrings.actionCard
  ): ActionCard = {
    val __obj = js.Dynamic.literal(actionCard = actionCard, msgtype = msgtype)
  
    __obj.asInstanceOf[ActionCard]
  }
}

