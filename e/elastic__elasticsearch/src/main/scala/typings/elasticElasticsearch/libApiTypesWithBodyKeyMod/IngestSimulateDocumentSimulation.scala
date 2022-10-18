package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestSimulateDocumentSimulation extends StObject {
  
  var _id: Id
  
  var _index: IndexName
  
  var _ingest: IngestSimulateIngest
  
  var _parent: js.UndefOr[String] = js.undefined
  
  var _routing: js.UndefOr[String] = js.undefined
  
  var _source: Record[String, Any]
}
object IngestSimulateDocumentSimulation {
  
  inline def apply(_id: Id, _index: IndexName, _ingest: IngestSimulateIngest, _source: Record[String, Any]): IngestSimulateDocumentSimulation = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _ingest = _ingest.asInstanceOf[js.Any], _source = _source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestSimulateDocumentSimulation]
  }
  
  extension [Self <: IngestSimulateDocumentSimulation](x: Self) {
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_index(value: IndexName): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_ingest(value: IngestSimulateIngest): Self = StObject.set(x, "_ingest", value.asInstanceOf[js.Any])
    
    inline def set_parent(value: String): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
    
    inline def set_parentUndefined: Self = StObject.set(x, "_parent", js.undefined)
    
    inline def set_routing(value: String): Self = StObject.set(x, "_routing", value.asInstanceOf[js.Any])
    
    inline def set_routingUndefined: Self = StObject.set(x, "_routing", js.undefined)
    
    inline def set_source(value: Record[String, Any]): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
  }
}
