package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends js.Object {
  
  var color: js.UndefOr[LabelColor] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var labelListVisibility: js.UndefOr[String] = js.native
  
  var messageListVisibility: js.UndefOr[String] = js.native
  
  var messagesTotal: js.UndefOr[Double] = js.native
  
  var messagesUnread: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var threadsTotal: js.UndefOr[Double] = js.native
  
  var threadsUnread: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object Label {
  
  @scala.inline
  def apply(): Label = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    
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
    def setColor(value: LabelColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLabelListVisibility(value: String): Self = this.set("labelListVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelListVisibility: Self = this.set("labelListVisibility", js.undefined)
    
    @scala.inline
    def setMessageListVisibility(value: String): Self = this.set("messageListVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageListVisibility: Self = this.set("messageListVisibility", js.undefined)
    
    @scala.inline
    def setMessagesTotal(value: Double): Self = this.set("messagesTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessagesTotal: Self = this.set("messagesTotal", js.undefined)
    
    @scala.inline
    def setMessagesUnread(value: Double): Self = this.set("messagesUnread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessagesUnread: Self = this.set("messagesUnread", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setThreadsTotal(value: Double): Self = this.set("threadsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreadsTotal: Self = this.set("threadsTotal", js.undefined)
    
    @scala.inline
    def setThreadsUnread(value: Double): Self = this.set("threadsUnread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreadsUnread: Self = this.set("threadsUnread", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
