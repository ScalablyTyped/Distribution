package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnnSearchRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var _source: js.UndefOr[SearchSourceConfig] = js.undefined
  
  var docvalue_fields: js.UndefOr[js.Array[QueryDslFieldAndFormat | Field]] = js.undefined
  
  var fields: js.UndefOr[Fields] = js.undefined
  
  var filter: js.UndefOr[QueryDslQueryContainer | js.Array[QueryDslQueryContainer]] = js.undefined
  
  var index: Indices
  
  var knn: KnnSearchQuery
  
  var routing: js.UndefOr[Routing] = js.undefined
  
  var stored_fields: js.UndefOr[Fields] = js.undefined
}
object KnnSearchRequest {
  
  inline def apply(index: Indices, knn: KnnSearchQuery): KnnSearchRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], knn = knn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnnSearchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnnSearchRequest] (val x: Self) extends AnyVal {
    
    inline def setDocvalue_fields(value: js.Array[QueryDslFieldAndFormat | Field]): Self = StObject.set(x, "docvalue_fields", value.asInstanceOf[js.Any])
    
    inline def setDocvalue_fieldsUndefined: Self = StObject.set(x, "docvalue_fields", js.undefined)
    
    inline def setDocvalue_fieldsVarargs(value: (QueryDslFieldAndFormat | Field)*): Self = StObject.set(x, "docvalue_fields", js.Array(value*))
    
    inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFilter(value: QueryDslQueryContainer | js.Array[QueryDslQueryContainer]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: QueryDslQueryContainer*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setKnn(value: KnnSearchQuery): Self = StObject.set(x, "knn", value.asInstanceOf[js.Any])
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setStored_fields(value: Fields): Self = StObject.set(x, "stored_fields", value.asInstanceOf[js.Any])
    
    inline def setStored_fieldsUndefined: Self = StObject.set(x, "stored_fields", js.undefined)
    
    inline def setStored_fieldsVarargs(value: Field*): Self = StObject.set(x, "stored_fields", js.Array(value*))
    
    inline def set_source(value: SearchSourceConfig): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_sourceVarargs(value: Field*): Self = StObject.set(x, "_source", js.Array(value*))
  }
}
