package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyAssociation extends StObject {
  
  /**
    * The resource that the security policy is attached to.
    */
  var attachmentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The display name of the security policy of the association.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name for an association.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The security policy ID of the association.
    */
  var securityPolicyId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecurityPolicyAssociation {
  
  inline def apply(): SchemaSecurityPolicyAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyAssociation]
  }
  
  extension [Self <: SchemaSecurityPolicyAssociation](x: Self) {
    
    inline def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdNull: Self = StObject.set(x, "attachmentId", null)
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecurityPolicyId(value: String): Self = StObject.set(x, "securityPolicyId", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyIdNull: Self = StObject.set(x, "securityPolicyId", null)
    
    inline def setSecurityPolicyIdUndefined: Self = StObject.set(x, "securityPolicyId", js.undefined)
  }
}
