package typings.gapiDotClientDotCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCloudresourcemanager.Anon_Accesstoken
import typings.gapiDotClientDotCloudresourcemanager.Anon_AccesstokenAlt
import typings.gapiDotClientDotCloudresourcemanager.Anon_AccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationsResource extends js.Object {
  /** Clears a `Policy` from a resource. */
  def clearOrgPolicy(request: Anon_Accesstoken): Request[js.Object]
  /** Fetches an Organization resource identified by the specified resource name. */
  def get(request: Anon_AccesstokenAltBearertoken): Request[Organization]
  /**
    * Gets the effective `Policy` on a resource. This is the result of merging
    * `Policies` in the resource hierarchy. The returned `Policy` will not have
    * an `etag`set because it is a computed `Policy` across multiple resources.
    */
  def getEffectiveOrgPolicy(request: Anon_Accesstoken): Request[OrgPolicy]
  /**
    * Gets the access control policy for an Organization resource. May be empty
    * if no such policy or resource exists. The `resource` field should be the
    * organization's resource name, e.g. "organizations/123".
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.organizations.getIamPolicy` on the specified organization
    */
  def getIamPolicy(request: Anon_Accesstoken): Request[Policy]
  /**
    * Gets a `Policy` on a resource.
    *
    * If no `Policy` is set on the resource, a `Policy` is returned with default
    * values including `POLICY_TYPE_NOT_SET` for the `policy_type oneof`. The
    * `etag` value can be used with `SetOrgPolicy()` to create or update a
    * `Policy` during read-modify-write.
    */
  def getOrgPolicy(request: Anon_Accesstoken): Request[OrgPolicy]
  /** Lists `Constraints` that could be applied on the specified resource. */
  def listAvailableOrgPolicyConstraints(request: Anon_Accesstoken): Request[ListAvailableOrgPolicyConstraintsResponse]
  /** Lists all the `Policies` set for a particular resource. */
  def listOrgPolicies(request: Anon_Accesstoken): Request[ListOrgPoliciesResponse]
  /**
    * Searches Organization resources that are visible to the user and satisfy
    * the specified filter. This method returns Organizations in an unspecified
    * order. New Organizations do not necessarily appear at the end of the
    * results.
    *
    * Search will only return organizations on which the user has the permission
    * `resourcemanager.organizations.get`
    */
  def search(request: Anon_AccesstokenAlt): Request[SearchOrganizationsResponse]
  /**
    * Sets the access control policy on an Organization resource. Replaces any
    * existing policy. The `resource` field should be the organization's resource
    * name, e.g. "organizations/123".
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.organizations.setIamPolicy` on the specified organization
    */
  def setIamPolicy(request: Anon_Accesstoken): Request[Policy]
  /**
    * Updates the specified `Policy` on the resource. Creates a new `Policy` for
    * that `Constraint` on the resource if one does not exist.
    *
    * Not supplying an `etag` on the request `Policy` results in an unconditional
    * write of the `Policy`.
    */
  def setOrgPolicy(request: Anon_Accesstoken): Request[OrgPolicy]
  /**
    * Returns permissions that a caller has on the specified Organization.
    * The `resource` field should be the organization's resource name,
    * e.g. "organizations/123".
    *
    * There are no permissions required for making this API call.
    */
  def testIamPermissions(request: Anon_Accesstoken): Request[TestIamPermissionsResponse]
}

object OrganizationsResource {
  @scala.inline
  def apply(
    clearOrgPolicy: Anon_Accesstoken => Request[js.Object],
    get: Anon_AccesstokenAltBearertoken => Request[Organization],
    getEffectiveOrgPolicy: Anon_Accesstoken => Request[OrgPolicy],
    getIamPolicy: Anon_Accesstoken => Request[Policy],
    getOrgPolicy: Anon_Accesstoken => Request[OrgPolicy],
    listAvailableOrgPolicyConstraints: Anon_Accesstoken => Request[ListAvailableOrgPolicyConstraintsResponse],
    listOrgPolicies: Anon_Accesstoken => Request[ListOrgPoliciesResponse],
    search: Anon_AccesstokenAlt => Request[SearchOrganizationsResponse],
    setIamPolicy: Anon_Accesstoken => Request[Policy],
    setOrgPolicy: Anon_Accesstoken => Request[OrgPolicy],
    testIamPermissions: Anon_Accesstoken => Request[TestIamPermissionsResponse]
  ): OrganizationsResource = {
    val __obj = js.Dynamic.literal(clearOrgPolicy = js.Any.fromFunction1(clearOrgPolicy), get = js.Any.fromFunction1(get), getEffectiveOrgPolicy = js.Any.fromFunction1(getEffectiveOrgPolicy), getIamPolicy = js.Any.fromFunction1(getIamPolicy), getOrgPolicy = js.Any.fromFunction1(getOrgPolicy), listAvailableOrgPolicyConstraints = js.Any.fromFunction1(listAvailableOrgPolicyConstraints), listOrgPolicies = js.Any.fromFunction1(listOrgPolicies), search = js.Any.fromFunction1(search), setIamPolicy = js.Any.fromFunction1(setIamPolicy), setOrgPolicy = js.Any.fromFunction1(setOrgPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[OrganizationsResource]
  }
}

