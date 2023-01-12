package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesFieldUsageStatsFieldSummary extends StObject {
  
  var any: uint
  
  var doc_values: uint
  
  var inverted_index: IndicesFieldUsageStatsInvertedIndex
  
  var knn_vectors: uint
  
  var norms: uint
  
  var points: uint
  
  var stored_fields: uint
  
  var term_vectors: uint
}
object IndicesFieldUsageStatsFieldSummary {
  
  inline def apply(
    any: uint,
    doc_values: uint,
    inverted_index: IndicesFieldUsageStatsInvertedIndex,
    knn_vectors: uint,
    norms: uint,
    points: uint,
    stored_fields: uint,
    term_vectors: uint
  ): IndicesFieldUsageStatsFieldSummary = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], doc_values = doc_values.asInstanceOf[js.Any], inverted_index = inverted_index.asInstanceOf[js.Any], knn_vectors = knn_vectors.asInstanceOf[js.Any], norms = norms.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], stored_fields = stored_fields.asInstanceOf[js.Any], term_vectors = term_vectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesFieldUsageStatsFieldSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesFieldUsageStatsFieldSummary] (val x: Self) extends AnyVal {
    
    inline def setAny(value: uint): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    inline def setDoc_values(value: uint): Self = StObject.set(x, "doc_values", value.asInstanceOf[js.Any])
    
    inline def setInverted_index(value: IndicesFieldUsageStatsInvertedIndex): Self = StObject.set(x, "inverted_index", value.asInstanceOf[js.Any])
    
    inline def setKnn_vectors(value: uint): Self = StObject.set(x, "knn_vectors", value.asInstanceOf[js.Any])
    
    inline def setNorms(value: uint): Self = StObject.set(x, "norms", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: uint): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setStored_fields(value: uint): Self = StObject.set(x, "stored_fields", value.asInstanceOf[js.Any])
    
    inline def setTerm_vectors(value: uint): Self = StObject.set(x, "term_vectors", value.asInstanceOf[js.Any])
  }
}
