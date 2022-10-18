package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MtermvectorsOperation extends StObject {
  
  var _id: Id
  
  var _index: js.UndefOr[IndexName] = js.undefined
  
  var doc: js.UndefOr[Any] = js.undefined
  
  var field_statistics: js.UndefOr[Boolean] = js.undefined
  
  var fields: js.UndefOr[Fields] = js.undefined
  
  var filter: js.UndefOr[TermvectorsFilter] = js.undefined
  
  var offsets: js.UndefOr[Boolean] = js.undefined
  
  var payloads: js.UndefOr[Boolean] = js.undefined
  
  var positions: js.UndefOr[Boolean] = js.undefined
  
  var routing: js.UndefOr[Routing] = js.undefined
  
  var term_statistics: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[VersionNumber] = js.undefined
  
  var version_type: js.UndefOr[VersionType] = js.undefined
}
object MtermvectorsOperation {
  
  inline def apply(_id: Id): MtermvectorsOperation = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MtermvectorsOperation]
  }
  
  extension [Self <: MtermvectorsOperation](x: Self) {
    
    inline def setDoc(value: Any): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    inline def setField_statistics(value: Boolean): Self = StObject.set(x, "field_statistics", value.asInstanceOf[js.Any])
    
    inline def setField_statisticsUndefined: Self = StObject.set(x, "field_statistics", js.undefined)
    
    inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFilter(value: TermvectorsFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setOffsets(value: Boolean): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
    
    inline def setOffsetsUndefined: Self = StObject.set(x, "offsets", js.undefined)
    
    inline def setPayloads(value: Boolean): Self = StObject.set(x, "payloads", value.asInstanceOf[js.Any])
    
    inline def setPayloadsUndefined: Self = StObject.set(x, "payloads", js.undefined)
    
    inline def setPositions(value: Boolean): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setTerm_statistics(value: Boolean): Self = StObject.set(x, "term_statistics", value.asInstanceOf[js.Any])
    
    inline def setTerm_statisticsUndefined: Self = StObject.set(x, "term_statistics", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersion_type(value: VersionType): Self = StObject.set(x, "version_type", value.asInstanceOf[js.Any])
    
    inline def setVersion_typeUndefined: Self = StObject.set(x, "version_type", js.undefined)
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_index(value: IndexName): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_indexUndefined: Self = StObject.set(x, "_index", js.undefined)
  }
}
