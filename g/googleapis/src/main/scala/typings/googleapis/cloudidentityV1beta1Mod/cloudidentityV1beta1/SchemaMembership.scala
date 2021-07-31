package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource representing a Membership within a Group
  */
trait SchemaMembership extends StObject {
  
  /**
    * Creation timestamp of the Membership.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * EntityKey of the entity to be added as the member. Must be set while
    * creating a Membership, read-only afterwards.  Currently allowed entity
    * types: `Users`, `Groups`.
    */
  var memberKey: js.UndefOr[SchemaEntityKey] = js.undefined
  
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Membership in the format:
    * `groups/{group_id}/memberships/{member_id}`, where group_id is the unique
    * id assigned to the Group to which Membership belongs to, and member_id is
    * the unique id assigned to the member  Must be left blank while creating a
    * Membership.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Roles for a member within the Group.  Currently supported
    * MembershipRoles: `&quot;MEMBER&quot;`.
    */
  var roles: js.UndefOr[js.Array[SchemaMembershipRole]] = js.undefined
  
  /**
    * Last updated timestamp of the Membership.
    */
  var updateTime: js.UndefOr[String] = js.undefined
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
    def setMemberKey(value: SchemaEntityKey): Self = StObject.set(x, "memberKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberKeyUndefined: Self = StObject.set(x, "memberKey", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
