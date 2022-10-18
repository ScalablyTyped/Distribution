package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineGetKeys[TDocument] extends StObject {
  
  var _primary_term: js.UndefOr[long] = js.undefined
  
  var _routing: js.UndefOr[Routing] = js.undefined
  
  var _seq_no: js.UndefOr[SequenceNumber] = js.undefined
  
  var _source: TDocument
  
  var fields: js.UndefOr[Record[String, Any]] = js.undefined
  
  var found: Boolean
}
object InlineGetKeys {
  
  inline def apply[TDocument](_source: TDocument, found: Boolean): InlineGetKeys[TDocument] = {
    val __obj = js.Dynamic.literal(_source = _source.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineGetKeys[TDocument]]
  }
  
  extension [Self <: InlineGetKeys[?], TDocument](x: Self & InlineGetKeys[TDocument]) {
    
    inline def setFields(value: Record[String, Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def set_primary_term(value: long): Self = StObject.set(x, "_primary_term", value.asInstanceOf[js.Any])
    
    inline def set_primary_termUndefined: Self = StObject.set(x, "_primary_term", js.undefined)
    
    inline def set_routing(value: Routing): Self = StObject.set(x, "_routing", value.asInstanceOf[js.Any])
    
    inline def set_routingUndefined: Self = StObject.set(x, "_routing", js.undefined)
    
    inline def set_seq_no(value: SequenceNumber): Self = StObject.set(x, "_seq_no", value.asInstanceOf[js.Any])
    
    inline def set_seq_noUndefined: Self = StObject.set(x, "_seq_no", js.undefined)
    
    inline def set_source(value: TDocument): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
  }
}
