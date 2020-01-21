package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `AccessPolicy` is a container for `AccessLevels` (which define the
  * necessary attributes to use GCP services) and `ServicePerimeters` (which
  * define regions of services able to freely pass data within a perimeter). An
  * access policy is globally visible within an organization, and the
  * restrictions it specifies apply to all projects within an organization.
  */
@js.native
trait SchemaAccessPolicy extends js.Object {
  /**
    * Output only. Time the `AccessPolicy` was created in UTC.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. Resource name of the `AccessPolicy`. Format:
    * `accessPolicies/{policy_id}`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required. The parent of this `AccessPolicy` in the Cloud Resource
    * Hierarchy. Currently immutable once created. Format:
    * `organizations/{organization_id}`
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Required. Human readable title. Does not affect behavior.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Output only. Time the `AccessPolicy` was updated in UTC.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaAccessPolicy {
  @scala.inline
  def apply(
    createTime: String = null,
    name: String = null,
    parent: String = null,
    title: String = null,
    updateTime: String = null
  ): SchemaAccessPolicy = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccessPolicy]
  }
}

