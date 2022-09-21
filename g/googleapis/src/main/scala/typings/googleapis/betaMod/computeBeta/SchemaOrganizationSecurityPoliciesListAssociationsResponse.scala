package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrganizationSecurityPoliciesListAssociationsResponse extends StObject {
  
  /**
    * A list of associations.
    */
  var associations: js.UndefOr[js.Array[SchemaSecurityPolicyAssociation]] = js.undefined
  
  /**
    * [Output Only] Type of securityPolicy associations. Always compute#organizationSecurityPoliciesListAssociations for lists of securityPolicy associations.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrganizationSecurityPoliciesListAssociationsResponse {
  
  inline def apply(): SchemaOrganizationSecurityPoliciesListAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrganizationSecurityPoliciesListAssociationsResponse]
  }
  
  extension [Self <: SchemaOrganizationSecurityPoliciesListAssociationsResponse](x: Self) {
    
    inline def setAssociations(value: js.Array[SchemaSecurityPolicyAssociation]): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
    
    inline def setAssociationsVarargs(value: SchemaSecurityPolicyAssociation*): Self = StObject.set(x, "associations", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
