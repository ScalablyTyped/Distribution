package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformPivot extends StObject {
  
  var aggregations: js.UndefOr[Record[String, AggregationsAggregationContainer]] = js.undefined
  
  var aggs: js.UndefOr[Record[String, AggregationsAggregationContainer]] = js.undefined
  
  var group_by: js.UndefOr[Record[String, TransformPivotGroupByContainer]] = js.undefined
}
object TransformPivot {
  
  inline def apply(): TransformPivot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformPivot]
  }
  
  extension [Self <: TransformPivot](x: Self) {
    
    inline def setAggregations(value: Record[String, AggregationsAggregationContainer]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setAggs(value: Record[String, AggregationsAggregationContainer]): Self = StObject.set(x, "aggs", value.asInstanceOf[js.Any])
    
    inline def setAggsUndefined: Self = StObject.set(x, "aggs", js.undefined)
    
    inline def setGroup_by(value: Record[String, TransformPivotGroupByContainer]): Self = StObject.set(x, "group_by", value.asInstanceOf[js.Any])
    
    inline def setGroup_byUndefined: Self = StObject.set(x, "group_by", js.undefined)
  }
}
