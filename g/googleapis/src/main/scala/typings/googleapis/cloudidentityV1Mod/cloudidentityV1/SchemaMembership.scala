package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembership extends StObject {
  
  /**
    * Output only. The time when the `Membership` was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The [resource name](https://cloud.google.com/apis/design/resource_names) of the `Membership`. Shall be of the form `groups/{group\}/memberships/{membership\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The `EntityKey` of the member.
    */
  var preferredMemberKey: js.UndefOr[SchemaEntityKey] = js.undefined
  
  /**
    * The `MembershipRole`s that apply to the `Membership`. If unspecified, defaults to a single `MembershipRole` with `name` `MEMBER`. Must not contain duplicate `MembershipRole`s with the same `name`.
    */
  var roles: js.UndefOr[js.Array[SchemaMembershipRole]] = js.undefined
  
  /**
    * Output only. The type of the membership.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the `Membership` was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaMembership {
  
  inline def apply(): SchemaMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembership]
  }
  
  extension [Self <: SchemaMembership](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPreferredMemberKey(value: SchemaEntityKey): Self = StObject.set(x, "preferredMemberKey", value.asInstanceOf[js.Any])
    
    inline def setPreferredMemberKeyUndefined: Self = StObject.set(x, "preferredMemberKey", js.undefined)
    
    inline def setRoles(value: js.Array[SchemaMembershipRole]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: SchemaMembershipRole*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
