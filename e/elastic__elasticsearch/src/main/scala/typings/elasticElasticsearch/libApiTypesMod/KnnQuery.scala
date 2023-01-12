package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnnQuery extends StObject {
  
  var boost: js.UndefOr[float] = js.undefined
  
  var field: Field
  
  var filter: js.UndefOr[QueryDslQueryContainer | js.Array[QueryDslQueryContainer]] = js.undefined
  
  var k: long
  
  var num_candidates: long
  
  var query_vector: js.Array[double]
}
object KnnQuery {
  
  inline def apply(field: Field, k: long, num_candidates: long, query_vector: js.Array[double]): KnnQuery = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], num_candidates = num_candidates.asInstanceOf[js.Any], query_vector = query_vector.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnnQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnnQuery] (val x: Self) extends AnyVal {
    
    inline def setBoost(value: float): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: QueryDslQueryContainer | js.Array[QueryDslQueryContainer]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: QueryDslQueryContainer*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setK(value: long): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setNum_candidates(value: long): Self = StObject.set(x, "num_candidates", value.asInstanceOf[js.Any])
    
    inline def setQuery_vector(value: js.Array[double]): Self = StObject.set(x, "query_vector", value.asInstanceOf[js.Any])
    
    inline def setQuery_vectorVarargs(value: double*): Self = StObject.set(x, "query_vector", js.Array(value*))
  }
}
