package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationsResource extends js.Object {
  /** Clears a `Policy` from a resource. */
  def clearOrgPolicy(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Fetches an Organization resource identified by the specified resource name. */
  def get(request: gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Organization]
  /**
    * Gets the effective `Policy` on a resource. This is the result of merging
    * `Policies` in the resource hierarchy. The returned `Policy` will not have
    * an `etag`set because it is a computed `Policy` across multiple resources.
    */
  def getEffectiveOrgPolicy(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy]
  /**
    * Gets the access control policy for an Organization resource. May be empty
    * if no such policy or resource exists. The `resource` field should be the
    * organization's resource name, e.g. "organizations/123".
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.organizations.getIamPolicy` on the specified organization
    */
  def getIamPolicy(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /**
    * Gets a `Policy` on a resource.
    *
    * If no `Policy` is set on the resource, a `Policy` is returned with default
    * values including `POLICY_TYPE_NOT_SET` for the `policy_type oneof`. The
    * `etag` value can be used with `SetOrgPolicy()` to create or update a
    * `Policy` during read-modify-write.
    */
  def getOrgPolicy(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy]
  /** Lists `Constraints` that could be applied on the specified resource. */
  def listAvailableOrgPolicyConstraints(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListAvailableOrgPolicyConstraintsResponse]
  /** Lists all the `Policies` set for a particular resource. */
  def listOrgPolicies(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListOrgPoliciesResponse]
  /**
    * Searches Organization resources that are visible to the user and satisfy
    * the specified filter. This method returns Organizations in an unspecified
    * order. New Organizations do not necessarily appear at the end of the
    * results.
    *
    * Search will only return organizations on which the user has the permission
    * `resourcemanager.organizations.get`
    */
  def search(request: gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[SearchOrganizationsResponse]
  /**
    * Sets the access control policy on an Organization resource. Replaces any
    * existing policy. The `resource` field should be the organization's resource
    * name, e.g. "organizations/123".
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.organizations.setIamPolicy` on the specified organization
    */
  def setIamPolicy(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /**
    * Updates the specified `Policy` on the resource. Creates a new `Policy` for
    * that `Constraint` on the resource if one does not exist.
    *
    * Not supplying an `etag` on the request `Policy` results in an unconditional
    * write of the `Policy`.
    */
  def setOrgPolicy(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy]
  /**
    * Returns permissions that a caller has on the specified Organization.
    * The `resource` field should be the organization's resource name,
    * e.g. "organizations/123".
    *
    * There are no permissions required for making this API call.
    */
  def testIamPermissions(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
}

object OrganizationsResource {
  @scala.inline
  def apply(
    clearOrgPolicy: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Organization]
    ],
    getEffectiveOrgPolicy: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy]
    ],
    getIamPolicy: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Policy]
    ],
    getOrgPolicy: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy]
    ],
    listAvailableOrgPolicyConstraints: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListAvailableOrgPolicyConstraintsResponse]
    ],
    listOrgPolicies: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListOrgPoliciesResponse]
    ],
    search: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[SearchOrganizationsResponse]
    ],
    setIamPolicy: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Policy]
    ],
    setOrgPolicy: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy]
    ],
    testIamPermissions: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
    ]
  ): OrganizationsResource = {
    val __obj = js.Dynamic.literal(clearOrgPolicy = clearOrgPolicy, get = get, getEffectiveOrgPolicy = getEffectiveOrgPolicy, getIamPolicy = getIamPolicy, getOrgPolicy = getOrgPolicy, listAvailableOrgPolicyConstraints = listAvailableOrgPolicyConstraints, listOrgPolicies = listOrgPolicies, search = search, setIamPolicy = setIamPolicy, setOrgPolicy = setOrgPolicy, testIamPermissions = testIamPermissions)
  
    __obj.asInstanceOf[OrganizationsResource]
  }
}

