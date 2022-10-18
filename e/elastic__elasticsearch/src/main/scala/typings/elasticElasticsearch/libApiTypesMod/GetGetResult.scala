package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGetResult[TDocument]
  extends StObject
     with MgetResponseItem[TDocument] {
  
  var _id: Id
  
  var _index: IndexName
  
  var _primary_term: js.UndefOr[long] = js.undefined
  
  var _routing: js.UndefOr[String] = js.undefined
  
  var _seq_no: js.UndefOr[SequenceNumber] = js.undefined
  
  var _source: js.UndefOr[TDocument] = js.undefined
  
  var _version: js.UndefOr[VersionNumber] = js.undefined
  
  var fields: js.UndefOr[Record[String, Any]] = js.undefined
  
  var found: Boolean
}
object GetGetResult {
  
  inline def apply[TDocument](_id: Id, _index: IndexName, found: Boolean): GetGetResult[TDocument] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGetResult[TDocument]]
  }
  
  extension [Self <: GetGetResult[?], TDocument](x: Self & GetGetResult[TDocument]) {
    
    inline def setFields(value: Record[String, Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_index(value: IndexName): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_primary_term(value: long): Self = StObject.set(x, "_primary_term", value.asInstanceOf[js.Any])
    
    inline def set_primary_termUndefined: Self = StObject.set(x, "_primary_term", js.undefined)
    
    inline def set_routing(value: String): Self = StObject.set(x, "_routing", value.asInstanceOf[js.Any])
    
    inline def set_routingUndefined: Self = StObject.set(x, "_routing", js.undefined)
    
    inline def set_seq_no(value: SequenceNumber): Self = StObject.set(x, "_seq_no", value.asInstanceOf[js.Any])
    
    inline def set_seq_noUndefined: Self = StObject.set(x, "_seq_no", js.undefined)
    
    inline def set_source(value: TDocument): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_version(value: VersionNumber): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
