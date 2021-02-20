package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSecurityPolicyAssociation extends StObject {
  
  /**
    * The resource that the security policy is attached to.
    */
  var attachmentId: js.UndefOr[String] = js.native
  
  /**
    * The name for an association.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The security policy ID of the association.
    */
  var securityPolicyId: js.UndefOr[String] = js.native
}
object SchemaSecurityPolicyAssociation {
  
  @scala.inline
  def apply(): SchemaSecurityPolicyAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyAssociation]
  }
  
  @scala.inline
  implicit class SchemaSecurityPolicyAssociationMutableBuilder[Self <: SchemaSecurityPolicyAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSecurityPolicyId(value: String): Self = StObject.set(x, "securityPolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityPolicyIdUndefined: Self = StObject.set(x, "securityPolicyId", js.undefined)
  }
}
