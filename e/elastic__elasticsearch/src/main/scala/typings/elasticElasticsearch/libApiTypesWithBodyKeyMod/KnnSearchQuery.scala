package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnnSearchQuery extends StObject {
  
  var field: Field
  
  var k: long
  
  var num_candidates: long
  
  var query_vector: KnnSearchQueryVector
}
object KnnSearchQuery {
  
  inline def apply(field: Field, k: long, num_candidates: long, query_vector: KnnSearchQueryVector): KnnSearchQuery = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], num_candidates = num_candidates.asInstanceOf[js.Any], query_vector = query_vector.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnnSearchQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnnSearchQuery] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setK(value: long): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setNum_candidates(value: long): Self = StObject.set(x, "num_candidates", value.asInstanceOf[js.Any])
    
    inline def setQuery_vector(value: KnnSearchQueryVector): Self = StObject.set(x, "query_vector", value.asInstanceOf[js.Any])
    
    inline def setQuery_vectorVarargs(value: double*): Self = StObject.set(x, "query_vector", js.Array(value*))
  }
}
