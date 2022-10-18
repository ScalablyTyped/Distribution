package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslLikeDocument extends StObject {
  
  var _id: js.UndefOr[Id] = js.undefined
  
  var _index: js.UndefOr[IndexName] = js.undefined
  
  var doc: js.UndefOr[Any] = js.undefined
  
  var fields: js.UndefOr[js.Array[Field]] = js.undefined
  
  var per_field_analyzer: js.UndefOr[Record[Field, String]] = js.undefined
  
  var routing: js.UndefOr[Routing] = js.undefined
  
  var version: js.UndefOr[VersionNumber] = js.undefined
  
  var version_type: js.UndefOr[VersionType] = js.undefined
}
object QueryDslLikeDocument {
  
  inline def apply(): QueryDslLikeDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslLikeDocument]
  }
  
  extension [Self <: QueryDslLikeDocument](x: Self) {
    
    inline def setDoc(value: Any): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setPer_field_analyzer(value: Record[Field, String]): Self = StObject.set(x, "per_field_analyzer", value.asInstanceOf[js.Any])
    
    inline def setPer_field_analyzerUndefined: Self = StObject.set(x, "per_field_analyzer", js.undefined)
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersion_type(value: VersionType): Self = StObject.set(x, "version_type", value.asInstanceOf[js.Any])
    
    inline def setVersion_typeUndefined: Self = StObject.set(x, "version_type", js.undefined)
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    
    inline def set_index(value: IndexName): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_indexUndefined: Self = StObject.set(x, "_index", js.undefined)
  }
}
