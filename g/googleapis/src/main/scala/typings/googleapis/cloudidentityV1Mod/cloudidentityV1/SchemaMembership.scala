package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource representing a Membership within a Group
  */
@js.native
trait SchemaMembership extends js.Object {
  /**
    * Creation timestamp of the Membership. Output only.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Membership in the format:
    * `groups/{group_id}/memberships/{member_id}`, where group_id is the unique
    * ID assigned to the Group to which Membership belongs to, and member_id is
    * the unique ID assigned to the member  Must be left blank while creating a
    * Membership.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * EntityKey of the entity to be added as the member. Must be set while
    * creating a Membership, read-only afterwards.  Currently allowed entity
    * types: `Users`, `Groups`.
    */
  var preferredMemberKey: js.UndefOr[SchemaEntityKey] = js.native
  /**
    * Roles for a member within the Group.  Currently supported
    * MembershipRoles: `&quot;MEMBER&quot;`.
    */
  var roles: js.UndefOr[js.Array[SchemaMembershipRole]] = js.native
  /**
    * Last updated timestamp of the Membership. Output only.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaMembership {
  @scala.inline
  def apply(
    createTime: String = null,
    name: String = null,
    preferredMemberKey: SchemaEntityKey = null,
    roles: js.Array[SchemaMembershipRole] = null,
    updateTime: String = null
  ): SchemaMembership = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (preferredMemberKey != null) __obj.updateDynamic("preferredMemberKey")(preferredMemberKey.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMembership]
  }
}

