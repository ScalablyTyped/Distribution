package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetMembershipGraphResponse extends StObject {
  
  /**
    * The membership graph's path information represented as an adjacency list.
    */
  var adjacencyList: js.UndefOr[js.Array[SchemaMembershipAdjacencyList]] = js.undefined
  
  /**
    * The resources representing each group in the adjacency list. Each group in this list can be correlated to a 'group' of the MembershipAdjacencyList using the 'name' of the Group resource.
    */
  var groups: js.UndefOr[js.Array[SchemaGroup]] = js.undefined
}
object SchemaGetMembershipGraphResponse {
  
  inline def apply(): SchemaGetMembershipGraphResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetMembershipGraphResponse]
  }
  
  extension [Self <: SchemaGetMembershipGraphResponse](x: Self) {
    
    inline def setAdjacencyList(value: js.Array[SchemaMembershipAdjacencyList]): Self = StObject.set(x, "adjacencyList", value.asInstanceOf[js.Any])
    
    inline def setAdjacencyListUndefined: Self = StObject.set(x, "adjacencyList", js.undefined)
    
    inline def setAdjacencyListVarargs(value: SchemaMembershipAdjacencyList*): Self = StObject.set(x, "adjacencyList", js.Array(value*))
    
    inline def setGroups(value: js.Array[SchemaGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: SchemaGroup*): Self = StObject.set(x, "groups", js.Array(value*))
  }
}
