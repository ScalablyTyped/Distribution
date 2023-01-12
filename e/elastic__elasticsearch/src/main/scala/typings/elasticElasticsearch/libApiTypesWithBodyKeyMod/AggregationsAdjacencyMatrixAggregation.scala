package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsAdjacencyMatrixAggregation
  extends StObject
     with AggregationsAggregation {
  
  var filters: js.UndefOr[Record[String, QueryDslQueryContainer]] = js.undefined
}
object AggregationsAdjacencyMatrixAggregation {
  
  inline def apply(): AggregationsAdjacencyMatrixAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsAdjacencyMatrixAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsAdjacencyMatrixAggregation] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: Record[String, QueryDslQueryContainer]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
  }
}
