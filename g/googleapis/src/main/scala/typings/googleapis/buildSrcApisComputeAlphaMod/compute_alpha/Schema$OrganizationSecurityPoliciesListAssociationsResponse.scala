package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrganizationSecurityPoliciesListAssociationsResponse extends js.Object {
  /**
    * A list of associations.
    */
  var associations: js.UndefOr[js.Array[Schema$SecurityPolicyAssociation]] = js.native
  /**
    * [Output Only] Type of securityPolicy associations. Always
    * compute#organizationSecurityPoliciesListAssociations for lists of
    * securityPolicy associations.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$OrganizationSecurityPoliciesListAssociationsResponse {
  @scala.inline
  def apply(associations: js.Array[Schema$SecurityPolicyAssociation] = null, kind: String = null): Schema$OrganizationSecurityPoliciesListAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    if (associations != null) __obj.updateDynamic("associations")(associations.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrganizationSecurityPoliciesListAssociationsResponse]
  }
}

