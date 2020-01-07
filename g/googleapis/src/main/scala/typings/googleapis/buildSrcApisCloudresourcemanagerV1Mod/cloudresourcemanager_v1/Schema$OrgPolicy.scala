package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a Cloud Organization `Policy` which is used to specify
  * `Constraints` for configurations of Cloud Platform resources.
  */
@js.native
trait Schema$OrgPolicy extends js.Object {
  /**
    * For boolean `Constraints`, whether to enforce the `Constraint` or not.
    */
  var booleanPolicy: js.UndefOr[Schema$BooleanPolicy] = js.native
  /**
    * The name of the `Constraint` the `Policy` is configuring, for example,
    * `constraints/serviceuser.services`.  Immutable after creation.
    */
  var constraint: js.UndefOr[String] = js.native
  /**
    * An opaque tag indicating the current version of the `Policy`, used for
    * concurrency control.  When the `Policy` is returned from either a
    * `GetPolicy` or a `ListOrgPolicy` request, this `etag` indicates the
    * version of the current `Policy` to use when executing a read-modify-write
    * loop.  When the `Policy` is returned from a `GetEffectivePolicy` request,
    * the `etag` will be unset.  When the `Policy` is used in a `SetOrgPolicy`
    * method, use the `etag` value that was returned from a `GetOrgPolicy`
    * request as part of a read-modify-write loop for concurrency control. Not
    * setting the `etag`in a `SetOrgPolicy` request will result in an
    * unconditional write of the `Policy`.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * List of values either allowed or disallowed.
    */
  var listPolicy: js.UndefOr[Schema$ListPolicy] = js.native
  /**
    * Restores the default behavior of the constraint; independent of
    * `Constraint` type.
    */
  var restoreDefault: js.UndefOr[Schema$RestoreDefault] = js.native
  /**
    * The time stamp the `Policy` was previously updated. This is set by the
    * server, not specified by the caller, and represents the last time a call
    * to `SetOrgPolicy` was made for that `Policy`. Any value set by the client
    * will be ignored.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Version of the `Policy`. Default version is 0;
    */
  var version: js.UndefOr[Double] = js.native
}

object Schema$OrgPolicy {
  @scala.inline
  def apply(
    booleanPolicy: Schema$BooleanPolicy = null,
    constraint: String = null,
    etag: String = null,
    listPolicy: Schema$ListPolicy = null,
    restoreDefault: Schema$RestoreDefault = null,
    updateTime: String = null,
    version: Int | Double = null
  ): Schema$OrgPolicy = {
    val __obj = js.Dynamic.literal()
    if (booleanPolicy != null) __obj.updateDynamic("booleanPolicy")(booleanPolicy.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (listPolicy != null) __obj.updateDynamic("listPolicy")(listPolicy.asInstanceOf[js.Any])
    if (restoreDefault != null) __obj.updateDynamic("restoreDefault")(restoreDefault.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrgPolicy]
  }
}

