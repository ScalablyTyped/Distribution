package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldStatsResponseField extends StObject {
  
  var density: Double
  
  var doc_count: Double
  
  var is_aggregatable: String
  
  var is_searchable: String
  
  var max_doc: Double
  
  var max_value: Any
  
  var min_value: Any
  
  var sum_doc_freq: Double
  
  var sum_total_term_freq: Double
}
object FieldStatsResponseField {
  
  inline def apply(
    density: Double,
    doc_count: Double,
    is_aggregatable: String,
    is_searchable: String,
    max_doc: Double,
    max_value: Any,
    min_value: Any,
    sum_doc_freq: Double,
    sum_total_term_freq: Double
  ): FieldStatsResponseField = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], doc_count = doc_count.asInstanceOf[js.Any], is_aggregatable = is_aggregatable.asInstanceOf[js.Any], is_searchable = is_searchable.asInstanceOf[js.Any], max_doc = max_doc.asInstanceOf[js.Any], max_value = max_value.asInstanceOf[js.Any], min_value = min_value.asInstanceOf[js.Any], sum_doc_freq = sum_doc_freq.asInstanceOf[js.Any], sum_total_term_freq = sum_total_term_freq.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldStatsResponseField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldStatsResponseField] (val x: Self) extends AnyVal {
    
    inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDoc_count(value: Double): Self = StObject.set(x, "doc_count", value.asInstanceOf[js.Any])
    
    inline def setIs_aggregatable(value: String): Self = StObject.set(x, "is_aggregatable", value.asInstanceOf[js.Any])
    
    inline def setIs_searchable(value: String): Self = StObject.set(x, "is_searchable", value.asInstanceOf[js.Any])
    
    inline def setMax_doc(value: Double): Self = StObject.set(x, "max_doc", value.asInstanceOf[js.Any])
    
    inline def setMax_value(value: Any): Self = StObject.set(x, "max_value", value.asInstanceOf[js.Any])
    
    inline def setMin_value(value: Any): Self = StObject.set(x, "min_value", value.asInstanceOf[js.Any])
    
    inline def setSum_doc_freq(value: Double): Self = StObject.set(x, "sum_doc_freq", value.asInstanceOf[js.Any])
    
    inline def setSum_total_term_freq(value: Double): Self = StObject.set(x, "sum_total_term_freq", value.asInstanceOf[js.Any])
  }
}
