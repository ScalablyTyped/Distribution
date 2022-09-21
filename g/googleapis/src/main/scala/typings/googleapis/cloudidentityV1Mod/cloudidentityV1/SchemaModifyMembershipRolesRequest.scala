package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModifyMembershipRolesRequest extends StObject {
  
  /**
    * The `MembershipRole`s to be added. Adding or removing roles in the same request as updating roles is not supported. Must not be set if `update_roles_params` is set.
    */
  var addRoles: js.UndefOr[js.Array[SchemaMembershipRole]] = js.undefined
  
  /**
    * The `name`s of the `MembershipRole`s to be removed. Adding or removing roles in the same request as updating roles is not supported. It is not possible to remove the `MEMBER` `MembershipRole`. If you wish to delete a `Membership`, call MembershipsService.DeleteMembership instead. Must not contain `MEMBER`. Must not be set if `update_roles_params` is set.
    */
  var removeRoles: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The `MembershipRole`s to be updated. Updating roles in the same request as adding or removing roles is not supported. Must not be set if either `add_roles` or `remove_roles` is set.
    */
  var updateRolesParams: js.UndefOr[js.Array[SchemaUpdateMembershipRolesParams]] = js.undefined
}
object SchemaModifyMembershipRolesRequest {
  
  inline def apply(): SchemaModifyMembershipRolesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyMembershipRolesRequest]
  }
  
  extension [Self <: SchemaModifyMembershipRolesRequest](x: Self) {
    
    inline def setAddRoles(value: js.Array[SchemaMembershipRole]): Self = StObject.set(x, "addRoles", value.asInstanceOf[js.Any])
    
    inline def setAddRolesUndefined: Self = StObject.set(x, "addRoles", js.undefined)
    
    inline def setAddRolesVarargs(value: SchemaMembershipRole*): Self = StObject.set(x, "addRoles", js.Array(value*))
    
    inline def setRemoveRoles(value: js.Array[String]): Self = StObject.set(x, "removeRoles", value.asInstanceOf[js.Any])
    
    inline def setRemoveRolesNull: Self = StObject.set(x, "removeRoles", null)
    
    inline def setRemoveRolesUndefined: Self = StObject.set(x, "removeRoles", js.undefined)
    
    inline def setRemoveRolesVarargs(value: String*): Self = StObject.set(x, "removeRoles", js.Array(value*))
    
    inline def setUpdateRolesParams(value: js.Array[SchemaUpdateMembershipRolesParams]): Self = StObject.set(x, "updateRolesParams", value.asInstanceOf[js.Any])
    
    inline def setUpdateRolesParamsUndefined: Self = StObject.set(x, "updateRolesParams", js.undefined)
    
    inline def setUpdateRolesParamsVarargs(value: SchemaUpdateMembershipRolesParams*): Self = StObject.set(x, "updateRolesParams", js.Array(value*))
  }
}
