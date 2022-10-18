package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetRollupIndexCapsRollupJobSummaryField extends StObject {
  
  var agg: String
  
  var calendar_interval: js.UndefOr[Duration] = js.undefined
  
  var time_zone: js.UndefOr[TimeZone] = js.undefined
}
object RollupGetRollupIndexCapsRollupJobSummaryField {
  
  inline def apply(agg: String): RollupGetRollupIndexCapsRollupJobSummaryField = {
    val __obj = js.Dynamic.literal(agg = agg.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupGetRollupIndexCapsRollupJobSummaryField]
  }
  
  extension [Self <: RollupGetRollupIndexCapsRollupJobSummaryField](x: Self) {
    
    inline def setAgg(value: String): Self = StObject.set(x, "agg", value.asInstanceOf[js.Any])
    
    inline def setCalendar_interval(value: Duration): Self = StObject.set(x, "calendar_interval", value.asInstanceOf[js.Any])
    
    inline def setCalendar_intervalUndefined: Self = StObject.set(x, "calendar_interval", js.undefined)
    
    inline def setTime_zone(value: TimeZone): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    inline def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
  }
}
