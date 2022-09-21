package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembershipAdjacencyList extends StObject {
  
  /**
    * Each edge contains information about the member that belongs to this group. Note: Fields returned here will help identify the specific Membership resource (e.g name, preferred_member_key and role), but may not be a comprehensive list of all fields.
    */
  var edges: js.UndefOr[js.Array[SchemaMembership]] = js.undefined
  
  /**
    * Resource name of the group that the members belong to.
    */
  var group: js.UndefOr[String | Null] = js.undefined
}
object SchemaMembershipAdjacencyList {
  
  inline def apply(): SchemaMembershipAdjacencyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipAdjacencyList]
  }
  
  extension [Self <: SchemaMembershipAdjacencyList](x: Self) {
    
    inline def setEdges(value: js.Array[SchemaMembership]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    inline def setEdgesVarargs(value: SchemaMembership*): Self = StObject.set(x, "edges", js.Array(value*))
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
  }
}
