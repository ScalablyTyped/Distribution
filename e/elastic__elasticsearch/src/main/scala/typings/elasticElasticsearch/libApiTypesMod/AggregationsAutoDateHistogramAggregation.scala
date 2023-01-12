package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsAutoDateHistogramAggregation
  extends StObject
     with AggregationsAggregation {
  
  var buckets: js.UndefOr[integer] = js.undefined
  
  var field: js.UndefOr[Field] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var minimum_interval: js.UndefOr[AggregationsMinimumInterval] = js.undefined
  
  var missing: js.UndefOr[DateTime] = js.undefined
  
  var offset: js.UndefOr[String] = js.undefined
  
  var params: js.UndefOr[Record[String, Any]] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
  
  var time_zone: js.UndefOr[TimeZone] = js.undefined
}
object AggregationsAutoDateHistogramAggregation {
  
  inline def apply(): AggregationsAutoDateHistogramAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsAutoDateHistogramAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsAutoDateHistogramAggregation] (val x: Self) extends AnyVal {
    
    inline def setBuckets(value: integer): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMinimum_interval(value: AggregationsMinimumInterval): Self = StObject.set(x, "minimum_interval", value.asInstanceOf[js.Any])
    
    inline def setMinimum_intervalUndefined: Self = StObject.set(x, "minimum_interval", js.undefined)
    
    inline def setMissing(value: DateTime): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setTime_zone(value: TimeZone): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    inline def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
  }
}
