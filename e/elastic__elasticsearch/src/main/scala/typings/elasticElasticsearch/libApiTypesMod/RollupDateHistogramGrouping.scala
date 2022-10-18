package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupDateHistogramGrouping extends StObject {
  
  var calendar_interval: js.UndefOr[Duration] = js.undefined
  
  var delay: js.UndefOr[Duration] = js.undefined
  
  var field: Field
  
  var fixed_interval: js.UndefOr[Duration] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var interval: js.UndefOr[Duration] = js.undefined
  
  var time_zone: js.UndefOr[TimeZone] = js.undefined
}
object RollupDateHistogramGrouping {
  
  inline def apply(field: Field): RollupDateHistogramGrouping = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupDateHistogramGrouping]
  }
  
  extension [Self <: RollupDateHistogramGrouping](x: Self) {
    
    inline def setCalendar_interval(value: Duration): Self = StObject.set(x, "calendar_interval", value.asInstanceOf[js.Any])
    
    inline def setCalendar_intervalUndefined: Self = StObject.set(x, "calendar_interval", js.undefined)
    
    inline def setDelay(value: Duration): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFixed_interval(value: Duration): Self = StObject.set(x, "fixed_interval", value.asInstanceOf[js.Any])
    
    inline def setFixed_intervalUndefined: Self = StObject.set(x, "fixed_interval", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInterval(value: Duration): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setTime_zone(value: TimeZone): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    inline def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
  }
}
