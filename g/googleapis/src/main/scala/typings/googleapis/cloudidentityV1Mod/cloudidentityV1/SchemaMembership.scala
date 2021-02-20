package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource representing a Membership within a Group
  */
@js.native
trait SchemaMembership extends StObject {
  
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
  def apply(): SchemaMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembership]
  }
  
  @scala.inline
  implicit class SchemaMembershipMutableBuilder[Self <: SchemaMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPreferredMemberKey(value: SchemaEntityKey): Self = StObject.set(x, "preferredMemberKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMemberKeyUndefined: Self = StObject.set(x, "preferredMemberKey", js.undefined)
    
    @scala.inline
    def setRoles(value: js.Array[SchemaMembershipRole]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: SchemaMembershipRole*): Self = StObject.set(x, "roles", js.Array(value :_*))
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
