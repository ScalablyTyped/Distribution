package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMemberRelation extends StObject {
  
  /**
    * Resource name for this member.
    */
  var member: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Entity key has an id and a namespace. In case of discussion forums, the id will be an email address without a namespace.
    */
  var preferredMemberKey: js.UndefOr[js.Array[SchemaEntityKey]] = js.undefined
  
  /**
    * The relation between the group and the transitive membership.
    */
  var relationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The membership role details (i.e name of role and expiry time).
    */
  var roles: js.UndefOr[js.Array[SchemaTransitiveMembershipRole]] = js.undefined
}
object SchemaMemberRelation {
  
  inline def apply(): SchemaMemberRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMemberRelation]
  }
  
  extension [Self <: SchemaMemberRelation](x: Self) {
    
    inline def setMember(value: String): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberNull: Self = StObject.set(x, "member", null)
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setPreferredMemberKey(value: js.Array[SchemaEntityKey]): Self = StObject.set(x, "preferredMemberKey", value.asInstanceOf[js.Any])
    
    inline def setPreferredMemberKeyUndefined: Self = StObject.set(x, "preferredMemberKey", js.undefined)
    
    inline def setPreferredMemberKeyVarargs(value: SchemaEntityKey*): Self = StObject.set(x, "preferredMemberKey", js.Array(value*))
    
    inline def setRelationType(value: String): Self = StObject.set(x, "relationType", value.asInstanceOf[js.Any])
    
    inline def setRelationTypeNull: Self = StObject.set(x, "relationType", null)
    
    inline def setRelationTypeUndefined: Self = StObject.set(x, "relationType", js.undefined)
    
    inline def setRoles(value: js.Array[SchemaTransitiveMembershipRole]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: SchemaTransitiveMembershipRole*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}
