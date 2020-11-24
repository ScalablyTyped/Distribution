package typings.dingtalkRobotSender.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageUrl extends js.Object {
  
  var messageUrl: String = js.native
  
  var picUrl: String = js.native
  
  var text: String = js.native
  
  var title: String = js.native
}
object MessageUrl {
  
  @scala.inline
  def apply(messageUrl: String, picUrl: String, text: String, title: String): MessageUrl = {
    val __obj = js.Dynamic.literal(messageUrl = messageUrl.asInstanceOf[js.Any], picUrl = picUrl.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageUrl]
  }
  
  @scala.inline
  implicit class MessageUrlOps[Self <: MessageUrl] (val x: Self) extends AnyVal {
    
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
    def setMessageUrl(value: String): Self = this.set("messageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicUrl(value: String): Self = this.set("picUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
