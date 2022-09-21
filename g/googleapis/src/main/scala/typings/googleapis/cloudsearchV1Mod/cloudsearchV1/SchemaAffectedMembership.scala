package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAffectedMembership extends StObject {
  
  var affectedMember: js.UndefOr[SchemaMemberId] = js.undefined
  
  var priorMembershipRole: js.UndefOr[String | Null] = js.undefined
  
  var priorMembershipState: js.UndefOr[String | Null] = js.undefined
  
  var targetMembershipRole: js.UndefOr[String | Null] = js.undefined
}
object SchemaAffectedMembership {
  
  inline def apply(): SchemaAffectedMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAffectedMembership]
  }
  
  extension [Self <: SchemaAffectedMembership](x: Self) {
    
    inline def setAffectedMember(value: SchemaMemberId): Self = StObject.set(x, "affectedMember", value.asInstanceOf[js.Any])
    
    inline def setAffectedMemberUndefined: Self = StObject.set(x, "affectedMember", js.undefined)
    
    inline def setPriorMembershipRole(value: String): Self = StObject.set(x, "priorMembershipRole", value.asInstanceOf[js.Any])
    
    inline def setPriorMembershipRoleNull: Self = StObject.set(x, "priorMembershipRole", null)
    
    inline def setPriorMembershipRoleUndefined: Self = StObject.set(x, "priorMembershipRole", js.undefined)
    
    inline def setPriorMembershipState(value: String): Self = StObject.set(x, "priorMembershipState", value.asInstanceOf[js.Any])
    
    inline def setPriorMembershipStateNull: Self = StObject.set(x, "priorMembershipState", null)
    
    inline def setPriorMembershipStateUndefined: Self = StObject.set(x, "priorMembershipState", js.undefined)
    
    inline def setTargetMembershipRole(value: String): Self = StObject.set(x, "targetMembershipRole", value.asInstanceOf[js.Any])
    
    inline def setTargetMembershipRoleNull: Self = StObject.set(x, "targetMembershipRole", null)
    
    inline def setTargetMembershipRoleUndefined: Self = StObject.set(x, "targetMembershipRole", js.undefined)
  }
}
