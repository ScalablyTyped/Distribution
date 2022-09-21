package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateMembershipRolesParams extends StObject {
  
  /**
    * The fully-qualified names of fields to update. May only contain the field `expiry_detail.expire_time`.
    */
  var fieldMask: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The `MembershipRole`s to be updated. Only `MEMBER` `MembershipRoles` can currently be updated. May only contain a `MembershipRole` with `name` `MEMBER`.
    */
  var membershipRole: js.UndefOr[SchemaMembershipRole] = js.undefined
}
object SchemaUpdateMembershipRolesParams {
  
  inline def apply(): SchemaUpdateMembershipRolesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateMembershipRolesParams]
  }
  
  extension [Self <: SchemaUpdateMembershipRolesParams](x: Self) {
    
    inline def setFieldMask(value: String): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    inline def setFieldMaskNull: Self = StObject.set(x, "fieldMask", null)
    
    inline def setFieldMaskUndefined: Self = StObject.set(x, "fieldMask", js.undefined)
    
    inline def setMembershipRole(value: SchemaMembershipRole): Self = StObject.set(x, "membershipRole", value.asInstanceOf[js.Any])
    
    inline def setMembershipRoleUndefined: Self = StObject.set(x, "membershipRole", js.undefined)
  }
}
