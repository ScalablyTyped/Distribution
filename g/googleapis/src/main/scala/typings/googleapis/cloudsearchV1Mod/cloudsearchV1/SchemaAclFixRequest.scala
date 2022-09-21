package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAclFixRequest extends StObject {
  
  /**
    * For Spaces messages: This field is ignored. For DMs messages: The list of email addresses that should be added to the Drive item's ACL. In general, the list should not be empty when the boolean "should_fix" field is set; otherwise, the list should be empty. During transition - when clients do not specify this field but the "should_fix" is true, we follow the legacy behavior: share to all users in the DM regardless of emails. This behavior is being phased out.
    */
  var recipientEmails: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var role: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to attempt to fix the ACL by adding the room or DM members to the Drive file's ACL.
    */
  var shouldFix: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAclFixRequest {
  
  inline def apply(): SchemaAclFixRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAclFixRequest]
  }
  
  extension [Self <: SchemaAclFixRequest](x: Self) {
    
    inline def setRecipientEmails(value: js.Array[String]): Self = StObject.set(x, "recipientEmails", value.asInstanceOf[js.Any])
    
    inline def setRecipientEmailsNull: Self = StObject.set(x, "recipientEmails", null)
    
    inline def setRecipientEmailsUndefined: Self = StObject.set(x, "recipientEmails", js.undefined)
    
    inline def setRecipientEmailsVarargs(value: String*): Self = StObject.set(x, "recipientEmails", js.Array(value*))
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setShouldFix(value: Boolean): Self = StObject.set(x, "shouldFix", value.asInstanceOf[js.Any])
    
    inline def setShouldFixNull: Self = StObject.set(x, "shouldFix", null)
    
    inline def setShouldFixUndefined: Self = StObject.set(x, "shouldFix", js.undefined)
  }
}
