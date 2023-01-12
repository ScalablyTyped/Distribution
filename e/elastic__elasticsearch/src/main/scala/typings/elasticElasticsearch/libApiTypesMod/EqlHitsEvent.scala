package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EqlHitsEvent[TEvent] extends StObject {
  
  var _id: Id
  
  var _index: IndexName
  
  var _source: TEvent
  
  var fields: js.UndefOr[Record[Field, js.Array[Any]]] = js.undefined
}
object EqlHitsEvent {
  
  inline def apply[TEvent](_id: Id, _index: IndexName, _source: TEvent): EqlHitsEvent[TEvent] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _source = _source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqlHitsEvent[TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EqlHitsEvent[?], TEvent] (val x: Self & EqlHitsEvent[TEvent]) extends AnyVal {
    
    inline def setFields(value: Record[Field, js.Array[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_index(value: IndexName): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_source(value: TEvent): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
  }
}
