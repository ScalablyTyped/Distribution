package typings.firebaseFirestore.distPrivateMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructuredAggregationQuery extends StObject {
  
  var aggregations: js.UndefOr[js.Array[Aggregation]] = js.undefined
  
  var structuredQuery: js.UndefOr[StructuredQuery] = js.undefined
}
object StructuredAggregationQuery {
  
  inline def apply(): StructuredAggregationQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuredAggregationQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StructuredAggregationQuery] (val x: Self) extends AnyVal {
    
    inline def setAggregations(value: js.Array[Aggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setAggregationsVarargs(value: Aggregation*): Self = StObject.set(x, "aggregations", js.Array(value*))
    
    inline def setStructuredQuery(value: StructuredQuery): Self = StObject.set(x, "structuredQuery", value.asInstanceOf[js.Any])
    
    inline def setStructuredQueryUndefined: Self = StObject.set(x, "structuredQuery", js.undefined)
  }
}
