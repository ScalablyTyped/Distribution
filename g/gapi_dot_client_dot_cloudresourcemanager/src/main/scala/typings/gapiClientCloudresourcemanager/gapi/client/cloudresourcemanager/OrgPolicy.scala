package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgPolicy extends js.Object {
  /** For boolean `Constraints`, whether to enforce the `Constraint` or not. */
  var booleanPolicy: js.UndefOr[BooleanPolicy] = js.native
  /**
    * The name of the `Constraint` the `Policy` is configuring, for example,
    * `constraints/serviceuser.services`.
    *
    * Immutable after creation.
    */
  var constraint: js.UndefOr[String] = js.native
  /**
    * An opaque tag indicating the current version of the `Policy`, used for
    * concurrency control.
    *
    * When the `Policy` is returned from either a `GetPolicy` or a
    * `ListOrgPolicy` request, this `etag` indicates the version of the current
    * `Policy` to use when executing a read-modify-write loop.
    *
    * When the `Policy` is returned from a `GetEffectivePolicy` request, the
    * `etag` will be unset.
    *
    * When the `Policy` is used in a `SetOrgPolicy` method, use the `etag` value
    * that was returned from a `GetOrgPolicy` request as part of a
    * read-modify-write loop for concurrency control. Not setting the `etag`in a
    * `SetOrgPolicy` request will result in an unconditional write of the
    * `Policy`.
    */
  var etag: js.UndefOr[String] = js.native
  /** List of values either allowed or disallowed. */
  var listPolicy: js.UndefOr[ListPolicy] = js.native
  /**
    * Restores the default behavior of the constraint; independent of
    * `Constraint` type.
    */
  var restoreDefault: js.UndefOr[js.Any] = js.native
  /**
    * The time stamp the `Policy` was previously updated. This is set by the
    * server, not specified by the caller, and represents the last time a call to
    * `SetOrgPolicy` was made for that `Policy`. Any value set by the client will
    * be ignored.
    */
  var updateTime: js.UndefOr[String] = js.native
  /** Version of the `Policy`. Default version is 0; */
  var version: js.UndefOr[Double] = js.native
}

object OrgPolicy {
  @scala.inline
  def apply(): OrgPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgPolicy]
  }
  @scala.inline
  implicit class OrgPolicyOps[Self <: OrgPolicy] (val x: Self) extends AnyVal {
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
    def setBooleanPolicy(value: BooleanPolicy): Self = this.set("booleanPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanPolicy: Self = this.set("booleanPolicy", js.undefined)
    @scala.inline
    def setConstraint(value: String): Self = this.set("constraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraint: Self = this.set("constraint", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setListPolicy(value: ListPolicy): Self = this.set("listPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListPolicy: Self = this.set("listPolicy", js.undefined)
    @scala.inline
    def setRestoreDefault(value: js.Any): Self = this.set("restoreDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreDefault: Self = this.set("restoreDefault", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

