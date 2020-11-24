package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrganizationSecurityPoliciesListAssociationsResponse extends js.Object {
  
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
  implicit class SchemaOrganizationSecurityPoliciesListAssociationsResponseOps[Self <: SchemaOrganizationSecurityPoliciesListAssociationsResponse] (val x: Self) extends AnyVal {
    
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
    def setAssociationsVarargs(value: SchemaSecurityPolicyAssociation*): Self = this.set("associations", js.Array(value :_*))
    
    @scala.inline
    def setAssociations(value: js.Array[SchemaSecurityPolicyAssociation]): Self = this.set("associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociations: Self = this.set("associations", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
