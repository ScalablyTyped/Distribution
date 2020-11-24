package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a user facing message for a particular data transfer run.
  */
@js.native
trait SchemaTransferMessage extends js.Object {
  
  /**
    * Message text.
    */
  var messageText: js.UndefOr[String] = js.native
  
  /**
    * Time when message was logged.
    */
  var messageTime: js.UndefOr[String] = js.native
  
  /**
    * Message severity.
    */
  var severity: js.UndefOr[String] = js.native
}
object SchemaTransferMessage {
  
  @scala.inline
  def apply(): SchemaTransferMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferMessage]
  }
  
  @scala.inline
  implicit class SchemaTransferMessageOps[Self <: SchemaTransferMessage] (val x: Self) extends AnyVal {
    
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
    def setMessageText(value: String): Self = this.set("messageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageText: Self = this.set("messageText", js.undefined)
    
    @scala.inline
    def setMessageTime(value: String): Self = this.set("messageTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageTime: Self = this.set("messageTime", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
  }
}
