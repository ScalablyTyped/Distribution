package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageVector
  extends StObject
     with XpackUsageBase {
  
  var dense_vector_dims_avg_count: integer
  
  var dense_vector_fields_count: integer
  
  var sparse_vector_fields_count: js.UndefOr[integer] = js.undefined
}
object XpackUsageVector {
  
  inline def apply(
    available: Boolean,
    dense_vector_dims_avg_count: integer,
    dense_vector_fields_count: integer,
    enabled: Boolean
  ): XpackUsageVector = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], dense_vector_dims_avg_count = dense_vector_dims_avg_count.asInstanceOf[js.Any], dense_vector_fields_count = dense_vector_fields_count.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageVector]
  }
  
  extension [Self <: XpackUsageVector](x: Self) {
    
    inline def setDense_vector_dims_avg_count(value: integer): Self = StObject.set(x, "dense_vector_dims_avg_count", value.asInstanceOf[js.Any])
    
    inline def setDense_vector_fields_count(value: integer): Self = StObject.set(x, "dense_vector_fields_count", value.asInstanceOf[js.Any])
    
    inline def setSparse_vector_fields_count(value: integer): Self = StObject.set(x, "sparse_vector_fields_count", value.asInstanceOf[js.Any])
    
    inline def setSparse_vector_fields_countUndefined: Self = StObject.set(x, "sparse_vector_fields_count", js.undefined)
  }
}
