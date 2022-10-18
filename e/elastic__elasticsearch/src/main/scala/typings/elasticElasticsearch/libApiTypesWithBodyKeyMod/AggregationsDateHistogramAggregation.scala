package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsDateHistogramAggregation
  extends StObject
     with AggregationsAggregation {
  
  var calendar_interval: js.UndefOr[AggregationsCalendarInterval] = js.undefined
  
  var extended_bounds: js.UndefOr[AggregationsExtendedBounds[AggregationsFieldDateMath]] = js.undefined
  
  var field: js.UndefOr[Field] = js.undefined
  
  var fixed_interval: js.UndefOr[Duration] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var hard_bounds: js.UndefOr[AggregationsExtendedBounds[AggregationsFieldDateMath]] = js.undefined
  
  var interval: js.UndefOr[Duration] = js.undefined
  
  var keyed: js.UndefOr[Boolean] = js.undefined
  
  var min_doc_count: js.UndefOr[integer] = js.undefined
  
  var missing: js.UndefOr[DateTime] = js.undefined
  
  var offset: js.UndefOr[Duration] = js.undefined
  
  var order: js.UndefOr[AggregationsAggregateOrder] = js.undefined
  
  var params: js.UndefOr[Record[String, Any]] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
  
  var time_zone: js.UndefOr[TimeZone] = js.undefined
}
object AggregationsDateHistogramAggregation {
  
  inline def apply(): AggregationsDateHistogramAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsDateHistogramAggregation]
  }
  
  extension [Self <: AggregationsDateHistogramAggregation](x: Self) {
    
    inline def setCalendar_interval(value: AggregationsCalendarInterval): Self = StObject.set(x, "calendar_interval", value.asInstanceOf[js.Any])
    
    inline def setCalendar_intervalUndefined: Self = StObject.set(x, "calendar_interval", js.undefined)
    
    inline def setExtended_bounds(value: AggregationsExtendedBounds[AggregationsFieldDateMath]): Self = StObject.set(x, "extended_bounds", value.asInstanceOf[js.Any])
    
    inline def setExtended_boundsUndefined: Self = StObject.set(x, "extended_bounds", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFixed_interval(value: Duration): Self = StObject.set(x, "fixed_interval", value.asInstanceOf[js.Any])
    
    inline def setFixed_intervalUndefined: Self = StObject.set(x, "fixed_interval", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHard_bounds(value: AggregationsExtendedBounds[AggregationsFieldDateMath]): Self = StObject.set(x, "hard_bounds", value.asInstanceOf[js.Any])
    
    inline def setHard_boundsUndefined: Self = StObject.set(x, "hard_bounds", js.undefined)
    
    inline def setInterval(value: Duration): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setKeyed(value: Boolean): Self = StObject.set(x, "keyed", value.asInstanceOf[js.Any])
    
    inline def setKeyedUndefined: Self = StObject.set(x, "keyed", js.undefined)
    
    inline def setMin_doc_count(value: integer): Self = StObject.set(x, "min_doc_count", value.asInstanceOf[js.Any])
    
    inline def setMin_doc_countUndefined: Self = StObject.set(x, "min_doc_count", js.undefined)
    
    inline def setMissing(value: DateTime): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setOffset(value: Duration): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrder(value: AggregationsAggregateOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: (Partial[Record[Field, SortOrder]])*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setTime_zone(value: TimeZone): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    inline def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
  }
}
