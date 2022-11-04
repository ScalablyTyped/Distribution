package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Field
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.KnnSearchQuery
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslFieldAndFormat
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslQueryContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchSourceConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Docvaluefields extends StObject {
  
  var _source: js.UndefOr[SearchSourceConfig] = js.undefined
  
  var docvalue_fields: js.UndefOr[js.Array[QueryDslFieldAndFormat | Field]] = js.undefined
  
  var fields: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Fields] = js.undefined
  
  var filter: js.UndefOr[QueryDslQueryContainer | js.Array[QueryDslQueryContainer]] = js.undefined
  
  var knn: KnnSearchQuery
  
  var stored_fields: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Fields] = js.undefined
}
object Docvaluefields {
  
  inline def apply(knn: KnnSearchQuery): Docvaluefields = {
    val __obj = js.Dynamic.literal(knn = knn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Docvaluefields]
  }
  
  extension [Self <: Docvaluefields](x: Self) {
    
    inline def setDocvalue_fields(value: js.Array[QueryDslFieldAndFormat | Field]): Self = StObject.set(x, "docvalue_fields", value.asInstanceOf[js.Any])
    
    inline def setDocvalue_fieldsUndefined: Self = StObject.set(x, "docvalue_fields", js.undefined)
    
    inline def setDocvalue_fieldsVarargs(value: (QueryDslFieldAndFormat | Field)*): Self = StObject.set(x, "docvalue_fields", js.Array(value*))
    
    inline def setFields(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFilter(value: QueryDslQueryContainer | js.Array[QueryDslQueryContainer]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: QueryDslQueryContainer*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setKnn(value: KnnSearchQuery): Self = StObject.set(x, "knn", value.asInstanceOf[js.Any])
    
    inline def setStored_fields(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Fields): Self = StObject.set(x, "stored_fields", value.asInstanceOf[js.Any])
    
    inline def setStored_fieldsUndefined: Self = StObject.set(x, "stored_fields", js.undefined)
    
    inline def setStored_fieldsVarargs(value: Field*): Self = StObject.set(x, "stored_fields", js.Array(value*))
    
    inline def set_source(value: SearchSourceConfig): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_sourceVarargs(value: Field*): Self = StObject.set(x, "_source", js.Array(value*))
  }
}
