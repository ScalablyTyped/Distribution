package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingAllField extends StObject {
  
  var analyzer: String
  
  var enabled: Boolean
  
  var omit_norms: Boolean
  
  var search_analyzer: String
  
  var similarity: String
  
  var store: Boolean
  
  var store_term_vector_offsets: Boolean
  
  var store_term_vector_payloads: Boolean
  
  var store_term_vector_positions: Boolean
  
  var store_term_vectors: Boolean
}
object MappingAllField {
  
  inline def apply(
    analyzer: String,
    enabled: Boolean,
    omit_norms: Boolean,
    search_analyzer: String,
    similarity: String,
    store: Boolean,
    store_term_vector_offsets: Boolean,
    store_term_vector_payloads: Boolean,
    store_term_vector_positions: Boolean,
    store_term_vectors: Boolean
  ): MappingAllField = {
    val __obj = js.Dynamic.literal(analyzer = analyzer.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], omit_norms = omit_norms.asInstanceOf[js.Any], search_analyzer = search_analyzer.asInstanceOf[js.Any], similarity = similarity.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], store_term_vector_offsets = store_term_vector_offsets.asInstanceOf[js.Any], store_term_vector_payloads = store_term_vector_payloads.asInstanceOf[js.Any], store_term_vector_positions = store_term_vector_positions.asInstanceOf[js.Any], store_term_vectors = store_term_vectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingAllField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingAllField] (val x: Self) extends AnyVal {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setOmit_norms(value: Boolean): Self = StObject.set(x, "omit_norms", value.asInstanceOf[js.Any])
    
    inline def setSearch_analyzer(value: String): Self = StObject.set(x, "search_analyzer", value.asInstanceOf[js.Any])
    
    inline def setSimilarity(value: String): Self = StObject.set(x, "similarity", value.asInstanceOf[js.Any])
    
    inline def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStore_term_vector_offsets(value: Boolean): Self = StObject.set(x, "store_term_vector_offsets", value.asInstanceOf[js.Any])
    
    inline def setStore_term_vector_payloads(value: Boolean): Self = StObject.set(x, "store_term_vector_payloads", value.asInstanceOf[js.Any])
    
    inline def setStore_term_vector_positions(value: Boolean): Self = StObject.set(x, "store_term_vector_positions", value.asInstanceOf[js.Any])
    
    inline def setStore_term_vectors(value: Boolean): Self = StObject.set(x, "store_term_vectors", value.asInstanceOf[js.Any])
  }
}
