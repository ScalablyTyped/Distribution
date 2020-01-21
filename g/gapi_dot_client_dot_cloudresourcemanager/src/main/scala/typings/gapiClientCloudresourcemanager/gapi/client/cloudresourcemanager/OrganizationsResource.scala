package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudresourcemanager.AnonAccesstoken
import typings.gapiClientCloudresourcemanager.AnonAccesstokenAlt
import typings.gapiClientCloudresourcemanager.AnonAccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationsResource extends js.Object {
  /** Clears a `Policy` from a resource. */
  def clearOrgPolicy(request: AnonAccesstoken): Request_[js.Object]
  /** Fetches an Organization resource identified by the specified resource name. */
  def get(request: AnonAccesstokenAltBearertoken): Request_[Organization]
  /**
    * Gets the effective `Policy` on a resource. This is the result of merging
    * `Policies` in the resource hierarchy. The returned `Policy` will not have
    * an `etag`set because it is a computed `Policy` across multiple resources.
    */
  def getEffectiveOrgPolicy(request: AnonAccesstoken): Request_[OrgPolicy]
  /**
    * Gets the access control policy for an Organization resource. May be empty
    * if no such policy or resource exists. The `resource` field should be the
    * organization's resource name, e.g. "organizations/123".
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.organizations.getIamPolicy` on the specified organization
    */
  def getIamPolicy(request: AnonAccesstoken): Request_[Policy]
  /**
    * Gets a `Policy` on a resource.
    *
    * If no `Policy` is set on the resource, a `Policy` is returned with default
    * values including `POLICY_TYPE_NOT_SET` for the `policy_type oneof`. The
    * `etag` value can be used with `SetOrgPolicy()` to create or update a
    * `Policy` during read-modify-write.
    */
  def getOrgPolicy(request: AnonAccesstoken): Request_[OrgPolicy]
  /** Lists `Constraints` that could be applied on the specified resource. */
  def listAvailableOrgPolicyConstraints(request: AnonAccesstoken): Request_[ListAvailableOrgPolicyConstraintsResponse]
  /** Lists all the `Policies` set for a particular resource. */
  def listOrgPolicies(request: AnonAccesstoken): Request_[ListOrgPoliciesResponse]
  /**
    * Searches Organization resources that are visible to the user and satisfy
    * the specified filter. This method returns Organizations in an unspecified
    * order. New Organizations do not necessarily appear at the end of the
    * results.
    *
    * Search will only return organizations on which the user has the permission
    * `resourcemanager.organizations.get`
    */
  def search(request: AnonAccesstokenAlt): Request_[SearchOrganizationsResponse]
  /**
    * Sets the access control policy on an Organization resource. Replaces any
    * existing policy. The `resource` field should be the organization's resource
    * name, e.g. "organizations/123".
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.organizations.setIamPolicy` on the specified organization
    */
  def setIamPolicy(request: AnonAccesstoken): Request_[Policy]
  /**
    * Updates the specified `Policy` on the resource. Creates a new `Policy` for
    * that `Constraint` on the resource if one does not exist.
    *
    * Not supplying an `etag` on the request `Policy` results in an unconditional
    * write of the `Policy`.
    */
  def setOrgPolicy(request: AnonAccesstoken): Request_[OrgPolicy]
  /**
    * Returns permissions that a caller has on the specified Organization.
    * The `resource` field should be the organization's resource name,
    * e.g. "organizations/123".
    *
    * There are no permissions required for making this API call.
    */
  def testIamPermissions(request: AnonAccesstoken): Request_[TestIamPermissionsResponse]
}

object OrganizationsResource {
  @scala.inline
  def apply(
    clearOrgPolicy: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstokenAltBearertoken => Request_[Organization],
    getEffectiveOrgPolicy: AnonAccesstoken => Request_[OrgPolicy],
    getIamPolicy: AnonAccesstoken => Request_[Policy],
    getOrgPolicy: AnonAccesstoken => Request_[OrgPolicy],
    listAvailableOrgPolicyConstraints: AnonAccesstoken => Request_[ListAvailableOrgPolicyConstraintsResponse],
    listOrgPolicies: AnonAccesstoken => Request_[ListOrgPoliciesResponse],
    search: AnonAccesstokenAlt => Request_[SearchOrganizationsResponse],
    setIamPolicy: AnonAccesstoken => Request_[Policy],
    setOrgPolicy: AnonAccesstoken => Request_[OrgPolicy],
    testIamPermissions: AnonAccesstoken => Request_[TestIamPermissionsResponse]
  ): OrganizationsResource = {
    val __obj = js.Dynamic.literal(clearOrgPolicy = js.Any.fromFunction1(clearOrgPolicy), get = js.Any.fromFunction1(get), getEffectiveOrgPolicy = js.Any.fromFunction1(getEffectiveOrgPolicy), getIamPolicy = js.Any.fromFunction1(getIamPolicy), getOrgPolicy = js.Any.fromFunction1(getOrgPolicy), listAvailableOrgPolicyConstraints = js.Any.fromFunction1(listAvailableOrgPolicyConstraints), listOrgPolicies = js.Any.fromFunction1(listOrgPolicies), search = js.Any.fromFunction1(search), setIamPolicy = js.Any.fromFunction1(setIamPolicy), setOrgPolicy = js.Any.fromFunction1(setOrgPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[OrganizationsResource]
  }
}

