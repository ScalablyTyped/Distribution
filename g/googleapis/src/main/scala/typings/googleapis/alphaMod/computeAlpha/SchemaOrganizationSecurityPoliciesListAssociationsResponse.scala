package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrganizationSecurityPoliciesListAssociationsResponse extends StObject {
  
  /**
    * A list of associations.
    */
  var associations: js.UndefOr[js.Array[SchemaSecurityPolicyAssociation]] = js.native
  
  /**
    * [Output Only] Type of securityPolicy associations. Always
    * compute#organizationSecurityPoliciesListAssociations for lists of
    * securityPolicy associations.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaOrganizationSecurityPoliciesListAssociationsResponse {
  
  @scala.inline
  def apply(): SchemaOrganizationSecurityPoliciesListAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrganizationSecurityPoliciesListAssociationsResponse]
  }
  
  @scala.inline
  implicit class SchemaOrganizationSecurityPoliciesListAssociationsResponseMutableBuilder[Self <: SchemaOrganizationSecurityPoliciesListAssociationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociations(value: js.Array[SchemaSecurityPolicyAssociation]): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
    
    @scala.inline
    def setAssociationsVarargs(value: SchemaSecurityPolicyAssociation*): Self = StObject.set(x, "associations", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
