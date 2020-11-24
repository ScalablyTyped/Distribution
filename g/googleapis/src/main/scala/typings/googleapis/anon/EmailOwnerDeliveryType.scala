package typings.googleapis.anon

import typings.googleapis.v32Mod.dfareportingV32.SchemaRecipient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailOwnerDeliveryType extends js.Object {
  
  var emailOwner: js.UndefOr[Boolean] = js.native
  
  var emailOwnerDeliveryType: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var recipients: js.UndefOr[js.Array[SchemaRecipient]] = js.native
}
object EmailOwnerDeliveryType {
  
  @scala.inline
  def apply(): EmailOwnerDeliveryType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailOwnerDeliveryType]
  }
  
  @scala.inline
  implicit class EmailOwnerDeliveryTypeOps[Self <: EmailOwnerDeliveryType] (val x: Self) extends AnyVal {
    
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
    def setEmailOwner(value: Boolean): Self = this.set("emailOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailOwner: Self = this.set("emailOwner", js.undefined)
    
    @scala.inline
    def setEmailOwnerDeliveryType(value: String): Self = this.set("emailOwnerDeliveryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailOwnerDeliveryType: Self = this.set("emailOwnerDeliveryType", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: SchemaRecipient*): Self = this.set("recipients", js.Array(value :_*))
    
    @scala.inline
    def setRecipients(value: js.Array[SchemaRecipient]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
  }
}
