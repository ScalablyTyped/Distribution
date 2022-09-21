package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembershipRole extends StObject {
  
  /**
    * The expiry details of the `MembershipRole`. Expiry details are only supported for `MEMBER` `MembershipRoles`. May be set if `name` is `MEMBER`. Must not be set if `name` is any other value.
    */
  var expiryDetail: js.UndefOr[SchemaExpiryDetail] = js.undefined
  
  /**
    * The name of the `MembershipRole`. Must be one of `OWNER`, `MANAGER`, `MEMBER`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Evaluations of restrictions applied to parent group on this membership.
    */
  var restrictionEvaluations: js.UndefOr[SchemaRestrictionEvaluations] = js.undefined
}
object SchemaMembershipRole {
  
  inline def apply(): SchemaMembershipRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipRole]
  }
  
  extension [Self <: SchemaMembershipRole](x: Self) {
    
    inline def setExpiryDetail(value: SchemaExpiryDetail): Self = StObject.set(x, "expiryDetail", value.asInstanceOf[js.Any])
    
    inline def setExpiryDetailUndefined: Self = StObject.set(x, "expiryDetail", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRestrictionEvaluations(value: SchemaRestrictionEvaluations): Self = StObject.set(x, "restrictionEvaluations", value.asInstanceOf[js.Any])
    
    inline def setRestrictionEvaluationsUndefined: Self = StObject.set(x, "restrictionEvaluations", js.undefined)
  }
}
