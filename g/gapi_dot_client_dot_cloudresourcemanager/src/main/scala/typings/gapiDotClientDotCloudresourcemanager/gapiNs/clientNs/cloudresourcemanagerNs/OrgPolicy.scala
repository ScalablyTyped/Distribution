package typings.gapiDotClientDotCloudresourcemanager.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgPolicy extends js.Object {
  /** For boolean `Constraints`, whether to enforce the `Constraint` or not. */
  var booleanPolicy: js.UndefOr[BooleanPolicy] = js.undefined
  /**
    * The name of the `Constraint` the `Policy` is configuring, for example,
    * `constraints/serviceuser.services`.
    *
    * Immutable after creation.
    */
  var constraint: js.UndefOr[String] = js.undefined
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
  var etag: js.UndefOr[String] = js.undefined
  /** List of values either allowed or disallowed. */
  var listPolicy: js.UndefOr[ListPolicy] = js.undefined
  /**
    * Restores the default behavior of the constraint; independent of
    * `Constraint` type.
    */
  var restoreDefault: js.UndefOr[js.Any] = js.undefined
  /**
    * The time stamp the `Policy` was previously updated. This is set by the
    * server, not specified by the caller, and represents the last time a call to
    * `SetOrgPolicy` was made for that `Policy`. Any value set by the client will
    * be ignored.
    */
  var updateTime: js.UndefOr[String] = js.undefined
  /** Version of the `Policy`. Default version is 0; */
  var version: js.UndefOr[Double] = js.undefined
}

object OrgPolicy {
  @scala.inline
  def apply(
    booleanPolicy: BooleanPolicy = null,
    constraint: String = null,
    etag: String = null,
    listPolicy: ListPolicy = null,
    restoreDefault: js.Any = null,
    updateTime: String = null,
    version: Int | Double = null
  ): OrgPolicy = {
    val __obj = js.Dynamic.literal()
    if (booleanPolicy != null) __obj.updateDynamic("booleanPolicy")(booleanPolicy)
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (listPolicy != null) __obj.updateDynamic("listPolicy")(listPolicy)
    if (restoreDefault != null) __obj.updateDynamic("restoreDefault")(restoreDefault)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgPolicy]
  }
}

