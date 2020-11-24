package typings.dingtalkRobotSender.mod.Message

import typings.dingtalkRobotSender.anon.AtMobiles
import typings.dingtalkRobotSender.anon.Content
import typings.dingtalkRobotSender.dingtalkRobotSenderStrings.text
import typings.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Text extends MessageType {
  
  var at: js.UndefOr[AtMobiles] = js.native
  
  var msgtype: text = js.native
  
  var text: Content = js.native
}
object Text {
  
  @scala.inline
  def apply(msgtype: text, text: Content): Text = {
    val __obj = js.Dynamic.literal(msgtype = msgtype.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit class TextOps[Self <: Text] (val x: Self) extends AnyVal {
    
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
    def setMsgtype(value: text): Self = this.set("msgtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: Content): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAt(value: AtMobiles): Self = this.set("at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAt: Self = this.set("at", js.undefined)
  }
}
