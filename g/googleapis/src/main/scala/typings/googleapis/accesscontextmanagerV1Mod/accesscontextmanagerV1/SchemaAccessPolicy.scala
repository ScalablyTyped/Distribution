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
  def apply(): SchemaAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessPolicy]
  }
  @scala.inline
  implicit class SchemaAccessPolicyOps[Self <: SchemaAccessPolicy] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
  
}

