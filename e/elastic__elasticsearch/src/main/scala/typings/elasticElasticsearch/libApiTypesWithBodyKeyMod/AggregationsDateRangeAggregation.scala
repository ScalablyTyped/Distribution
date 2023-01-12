package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsDateRangeAggregation
  extends StObject
     with AggregationsAggregation {
  
  var field: js.UndefOr[Field] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var keyed: js.UndefOr[Boolean] = js.undefined
  
  var missing: js.UndefOr[AggregationsMissing] = js.undefined
  
  var ranges: js.UndefOr[js.Array[AggregationsDateRangeExpression]] = js.undefined
  
  var time_zone: js.UndefOr[TimeZone] = js.undefined
}
object AggregationsDateRangeAggregation {
  
  inline def apply(): AggregationsDateRangeAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsDateRangeAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsDateRangeAggregation] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setKeyed(value: Boolean): Self = StObject.set(x, "keyed", value.asInstanceOf[js.Any])
    
    inline def setKeyedUndefined: Self = StObject.set(x, "keyed", js.undefined)
    
    inline def setMissing(value: AggregationsMissing): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setRanges(value: js.Array[AggregationsDateRangeExpression]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: AggregationsDateRangeExpression*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setTime_zone(value: TimeZone): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    inline def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
  }
}
