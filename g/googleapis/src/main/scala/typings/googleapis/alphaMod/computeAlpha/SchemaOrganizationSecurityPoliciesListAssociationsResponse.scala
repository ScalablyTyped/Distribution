package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(associations: js.Array[SchemaSecurityPolicyAssociation] = null, kind: String = null): SchemaOrganizationSecurityPoliciesListAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    if (associations != null) __obj.updateDynamic("associations")(associations.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrganizationSecurityPoliciesListAssociationsResponse]
  }
}

