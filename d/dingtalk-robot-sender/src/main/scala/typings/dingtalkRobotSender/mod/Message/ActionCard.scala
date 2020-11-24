package typings.dingtalkRobotSender.mod.Message

import typings.dingtalkRobotSender.anon.BtnOrientation
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.actionCard
import typings.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionCard extends MessageType {
  
  var actionCard: BtnOrientation = js.native
  
  var msgtype: actionCard = js.native
}
object ActionCard {
  
  @scala.inline
  def apply(actionCard: BtnOrientation, msgtype: actionCard): ActionCard = {
    val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCard]
  }
  
  @scala.inline
  implicit class ActionCardOps[Self <: ActionCard] (val x: Self) extends AnyVal {
    
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
    def setActionCard(value: BtnOrientation): Self = this.set("actionCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgtype(value: actionCard): Self = this.set("msgtype", value.asInstanceOf[js.Any])
  }
}
