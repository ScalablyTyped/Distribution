package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModifyMembershipRolesResponse extends StObject {
  
  /**
    * The `Membership` resource after modifying its `MembershipRole`s.
    */
  var membership: js.UndefOr[SchemaMembership] = js.undefined
}
object SchemaModifyMembershipRolesResponse {
  
  inline def apply(): SchemaModifyMembershipRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyMembershipRolesResponse]
  }
  
  extension [Self <: SchemaModifyMembershipRolesResponse](x: Self) {
    
    inline def setMembership(value: SchemaMembership): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    inline def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
  }
}
