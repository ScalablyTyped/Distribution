package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DanglingIndicesListDanglingIndicesDanglingIndex extends StObject {
  
  var creation_date_millis: EpochTime[UnitMillis]
  
  var index_name: String
  
  var index_uuid: String
  
  var node_ids: Ids
}
object DanglingIndicesListDanglingIndicesDanglingIndex {
  
  inline def apply(creation_date_millis: EpochTime[UnitMillis], index_name: String, index_uuid: String, node_ids: Ids): DanglingIndicesListDanglingIndicesDanglingIndex = {
    val __obj = js.Dynamic.literal(creation_date_millis = creation_date_millis.asInstanceOf[js.Any], index_name = index_name.asInstanceOf[js.Any], index_uuid = index_uuid.asInstanceOf[js.Any], node_ids = node_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[DanglingIndicesListDanglingIndicesDanglingIndex]
  }
  
  extension [Self <: DanglingIndicesListDanglingIndicesDanglingIndex](x: Self) {
    
    inline def setCreation_date_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "creation_date_millis", value.asInstanceOf[js.Any])
    
    inline def setIndex_name(value: String): Self = StObject.set(x, "index_name", value.asInstanceOf[js.Any])
    
    inline def setIndex_uuid(value: String): Self = StObject.set(x, "index_uuid", value.asInstanceOf[js.Any])
    
    inline def setNode_ids(value: Ids): Self = StObject.set(x, "node_ids", value.asInstanceOf[js.Any])
    
    inline def setNode_idsVarargs(value: Id*): Self = StObject.set(x, "node_ids", js.Array(value*))
  }
}
