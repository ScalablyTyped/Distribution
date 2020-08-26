package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudresourcemanager.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldersResource extends js.Object {
  /** Clears a `Policy` from a resource. */
  def clearOrgPolicy(request: Accesstoken): Request[js.Object] = js.native
  /**
    * Gets the effective `Policy` on a resource. This is the result of merging
    * `Policies` in the resource hierarchy. The returned `Policy` will not have
    * an `etag`set because it is a computed `Policy` across multiple resources.
    */
  def getEffectiveOrgPolicy(request: Accesstoken): Request[OrgPolicy] = js.native
  /**
    * Gets a `Policy` on a resource.
    *
    * If no `Policy` is set on the resource, a `Policy` is returned with default
    * values including `POLICY_TYPE_NOT_SET` for the `policy_type oneof`. The
    * `etag` value can be used with `SetOrgPolicy()` to create or update a
    * `Policy` during read-modify-write.
    */
  def getOrgPolicy(request: Accesstoken): Request[OrgPolicy] = js.native
  /** Lists `Constraints` that could be applied on the specified resource. */
  def listAvailableOrgPolicyConstraints(request: Accesstoken): Request[ListAvailableOrgPolicyConstraintsResponse] = js.native
  /** Lists all the `Policies` set for a particular resource. */
  def listOrgPolicies(request: Accesstoken): Request[ListOrgPoliciesResponse] = js.native
  /**
    * Updates the specified `Policy` on the resource. Creates a new `Policy` for
    * that `Constraint` on the resource if one does not exist.
    *
    * Not supplying an `etag` on the request `Policy` results in an unconditional
    * write of the `Policy`.
    */
  def setOrgPolicy(request: Accesstoken): Request[OrgPolicy] = js.native
}

object FoldersResource {
  @scala.inline
  def apply(
    clearOrgPolicy: Accesstoken => Request[js.Object],
    getEffectiveOrgPolicy: Accesstoken => Request[OrgPolicy],
    getOrgPolicy: Accesstoken => Request[OrgPolicy],
    listAvailableOrgPolicyConstraints: Accesstoken => Request[ListAvailableOrgPolicyConstraintsResponse],
    listOrgPolicies: Accesstoken => Request[ListOrgPoliciesResponse],
    setOrgPolicy: Accesstoken => Request[OrgPolicy]
  ): FoldersResource = {
    val __obj = js.Dynamic.literal(clearOrgPolicy = js.Any.fromFunction1(clearOrgPolicy), getEffectiveOrgPolicy = js.Any.fromFunction1(getEffectiveOrgPolicy), getOrgPolicy = js.Any.fromFunction1(getOrgPolicy), listAvailableOrgPolicyConstraints = js.Any.fromFunction1(listAvailableOrgPolicyConstraints), listOrgPolicies = js.Any.fromFunction1(listOrgPolicies), setOrgPolicy = js.Any.fromFunction1(setOrgPolicy))
    __obj.asInstanceOf[FoldersResource]
  }
  @scala.inline
  implicit class FoldersResourceOps[Self <: FoldersResource] (val x: Self) extends AnyVal {
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
    def setClearOrgPolicy(value: Accesstoken => Request[js.Object]): Self = this.set("clearOrgPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setGetEffectiveOrgPolicy(value: Accesstoken => Request[OrgPolicy]): Self = this.set("getEffectiveOrgPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setGetOrgPolicy(value: Accesstoken => Request[OrgPolicy]): Self = this.set("getOrgPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setListAvailableOrgPolicyConstraints(value: Accesstoken => Request[ListAvailableOrgPolicyConstraintsResponse]): Self = this.set("listAvailableOrgPolicyConstraints", js.Any.fromFunction1(value))
    @scala.inline
    def setListOrgPolicies(value: Accesstoken => Request[ListOrgPoliciesResponse]): Self = this.set("listOrgPolicies", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOrgPolicy(value: Accesstoken => Request[OrgPolicy]): Self = this.set("setOrgPolicy", js.Any.fromFunction1(value))
  }
  
}

