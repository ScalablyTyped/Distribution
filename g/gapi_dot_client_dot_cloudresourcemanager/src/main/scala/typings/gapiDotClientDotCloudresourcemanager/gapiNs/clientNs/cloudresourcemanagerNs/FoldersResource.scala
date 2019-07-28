package typings.gapiDotClientDotCloudresourcemanager.gapiNs.clientNs.cloudresourcemanagerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCloudresourcemanager.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldersResource extends js.Object {
  /** Clears a `Policy` from a resource. */
  def clearOrgPolicy(request: Anon_Accesstoken): Request[js.Object]
  /**
    * Gets the effective `Policy` on a resource. This is the result of merging
    * `Policies` in the resource hierarchy. The returned `Policy` will not have
    * an `etag`set because it is a computed `Policy` across multiple resources.
    */
  def getEffectiveOrgPolicy(request: Anon_Accesstoken): Request[OrgPolicy]
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
    * Updates the specified `Policy` on the resource. Creates a new `Policy` for
    * that `Constraint` on the resource if one does not exist.
    *
    * Not supplying an `etag` on the request `Policy` results in an unconditional
    * write of the `Policy`.
    */
  def setOrgPolicy(request: Anon_Accesstoken): Request[OrgPolicy]
}

object FoldersResource {
  @scala.inline
  def apply(
    clearOrgPolicy: Anon_Accesstoken => Request[js.Object],
    getEffectiveOrgPolicy: Anon_Accesstoken => Request[OrgPolicy],
    getOrgPolicy: Anon_Accesstoken => Request[OrgPolicy],
    listAvailableOrgPolicyConstraints: Anon_Accesstoken => Request[ListAvailableOrgPolicyConstraintsResponse],
    listOrgPolicies: Anon_Accesstoken => Request[ListOrgPoliciesResponse],
    setOrgPolicy: Anon_Accesstoken => Request[OrgPolicy]
  ): FoldersResource = {
    val __obj = js.Dynamic.literal(clearOrgPolicy = js.Any.fromFunction1(clearOrgPolicy), getEffectiveOrgPolicy = js.Any.fromFunction1(getEffectiveOrgPolicy), getOrgPolicy = js.Any.fromFunction1(getOrgPolicy), listAvailableOrgPolicyConstraints = js.Any.fromFunction1(listAvailableOrgPolicyConstraints), listOrgPolicies = js.Any.fromFunction1(listOrgPolicies), setOrgPolicy = js.Any.fromFunction1(setOrgPolicy))
  
    __obj.asInstanceOf[FoldersResource]
  }
}

