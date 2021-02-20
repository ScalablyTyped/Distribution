package typings.googleapis.anon

import typings.googleapis.v31Mod.dfareportingV31.SchemaRecipient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailOwner extends StObject {
  
  var emailOwner: js.UndefOr[Boolean] = js.native
  
  var emailOwnerDeliveryType: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var recipients: js.UndefOr[js.Array[SchemaRecipient]] = js.native
}
object EmailOwner {
  
  @scala.inline
  def apply(): EmailOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailOwner]
  }
  
  @scala.inline
  implicit class EmailOwnerMutableBuilder[Self <: EmailOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailOwner(value: Boolean): Self = StObject.set(x, "emailOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailOwnerDeliveryType(value: String): Self = StObject.set(x, "emailOwnerDeliveryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailOwnerDeliveryTypeUndefined: Self = StObject.set(x, "emailOwnerDeliveryType", js.undefined)
    
    @scala.inline
    def setEmailOwnerUndefined: Self = StObject.set(x, "emailOwner", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setRecipients(value: js.Array[SchemaRecipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: SchemaRecipient*): Self = StObject.set(x, "recipients", js.Array(value :_*))
  }
}
