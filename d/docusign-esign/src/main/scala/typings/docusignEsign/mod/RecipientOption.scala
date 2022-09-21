package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientOption extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var recipientLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Optional element. Specifies the role name associated with the recipient.
    *
    * This property is required when you are working with template recipients.
    */
  var roleName: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw
    * signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing
    * a signature/initial once).
    */
  var signingGroupId: js.UndefOr[String] = js.undefined
}
object RecipientOption {
  
  inline def apply(): RecipientOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientOption]
  }
  
  extension [Self <: RecipientOption](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRecipientLabel(value: String): Self = StObject.set(x, "recipientLabel", value.asInstanceOf[js.Any])
    
    inline def setRecipientLabelUndefined: Self = StObject.set(x, "recipientLabel", js.undefined)
    
    inline def setRoleName(value: String): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    inline def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    
    inline def setSigningGroupId(value: String): Self = StObject.set(x, "signingGroupId", value.asInstanceOf[js.Any])
    
    inline def setSigningGroupIdUndefined: Self = StObject.set(x, "signingGroupId", js.undefined)
  }
}
