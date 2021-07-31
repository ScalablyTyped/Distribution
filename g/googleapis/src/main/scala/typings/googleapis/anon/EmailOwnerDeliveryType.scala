package typings.googleapis.anon

import typings.googleapis.v32Mod.dfareportingV32.SchemaRecipient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailOwnerDeliveryType extends StObject {
  
  var emailOwner: js.UndefOr[Boolean] = js.undefined
  
  var emailOwnerDeliveryType: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var recipients: js.UndefOr[js.Array[SchemaRecipient]] = js.undefined
}
object EmailOwnerDeliveryType {
  
  @scala.inline
  def apply(): EmailOwnerDeliveryType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailOwnerDeliveryType]
  }
  
  @scala.inline
  implicit class EmailOwnerDeliveryTypeMutableBuilder[Self <: EmailOwnerDeliveryType] (val x: Self) extends AnyVal {
    
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
