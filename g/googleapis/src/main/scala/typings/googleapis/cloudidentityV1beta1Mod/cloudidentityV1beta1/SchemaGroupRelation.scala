package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupRelation extends StObject {
  
  /**
    * Display name for this group.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name for this group.
    */
  var group: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Entity key has an id and a namespace. In case of discussion forums, the id will be an email address without a namespace.
    */
  var groupKey: js.UndefOr[SchemaEntityKey] = js.undefined
  
  /**
    * Labels for Group resource.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The relation between the member and the transitive group.
    */
  var relationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Membership roles of the member for the group.
    */
  var roles: js.UndefOr[js.Array[SchemaTransitiveMembershipRole]] = js.undefined
}
object SchemaGroupRelation {
  
  inline def apply(): SchemaGroupRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupRelation]
  }
  
  extension [Self <: SchemaGroupRelation](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupKey(value: SchemaEntityKey): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    inline def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setRelationType(value: String): Self = StObject.set(x, "relationType", value.asInstanceOf[js.Any])
    
    inline def setRelationTypeNull: Self = StObject.set(x, "relationType", null)
    
    inline def setRelationTypeUndefined: Self = StObject.set(x, "relationType", js.undefined)
    
    inline def setRoles(value: js.Array[SchemaTransitiveMembershipRole]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: SchemaTransitiveMembershipRole*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}
