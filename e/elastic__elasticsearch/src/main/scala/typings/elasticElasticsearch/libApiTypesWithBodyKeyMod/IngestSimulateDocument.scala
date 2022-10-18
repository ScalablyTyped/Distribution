package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestSimulateDocument extends StObject {
  
  var _id: js.UndefOr[Id] = js.undefined
  
  var _index: js.UndefOr[IndexName] = js.undefined
  
  var _source: Any
}
object IngestSimulateDocument {
  
  inline def apply(_source: Any): IngestSimulateDocument = {
    val __obj = js.Dynamic.literal(_source = _source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestSimulateDocument]
  }
  
  extension [Self <: IngestSimulateDocument](x: Self) {
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    
    inline def set_index(value: IndexName): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_indexUndefined: Self = StObject.set(x, "_index", js.undefined)
    
    inline def set_source(value: Any): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
  }
}
