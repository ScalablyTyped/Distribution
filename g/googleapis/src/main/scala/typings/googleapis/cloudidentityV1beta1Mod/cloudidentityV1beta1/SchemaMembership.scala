package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource representing a Membership within a Group
  */
@js.native
trait SchemaMembership extends js.Object {
  /**
    * Creation timestamp of the Membership.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * EntityKey of the entity to be added as the member. Must be set while
    * creating a Membership, read-only afterwards.  Currently allowed entity
    * types: `Users`, `Groups`.
    */
  var memberKey: js.UndefOr[SchemaEntityKey] = js.native
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Membership in the format:
    * `groups/{group_id}/memberships/{member_id}`, where group_id is the unique
    * id assigned to the Group to which Membership belongs to, and member_id is
    * the unique id assigned to the member  Must be left blank while creating a
    * Membership.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Roles for a member within the Group.  Currently supported
    * MembershipRoles: `&quot;MEMBER&quot;`.
    */
  var roles: js.UndefOr[js.Array[SchemaMembershipRole]] = js.native
  /**
    * Last updated timestamp of the Membership.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaMembership {
  @scala.inline
  def apply(): SchemaMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembership]
  }
  @scala.inline
  implicit class SchemaMembershipOps[Self <: SchemaMembership] (val x: Self) extends AnyVal {
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
    def setMemberKey(value: SchemaEntityKey): Self = this.set("memberKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberKey: Self = this.set("memberKey", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRolesVarargs(value: SchemaMembershipRole*): Self = this.set("roles", js.Array(value :_*))
    @scala.inline
    def setRoles(value: js.Array[SchemaMembershipRole]): Self = this.set("roles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
  
}

