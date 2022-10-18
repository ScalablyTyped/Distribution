package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexSettingsTimeSeries extends StObject {
  
  var end_time: js.UndefOr[DateTime] = js.undefined
  
  var start_time: js.UndefOr[DateTime] = js.undefined
}
object IndicesIndexSettingsTimeSeries {
  
  inline def apply(): IndicesIndexSettingsTimeSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesIndexSettingsTimeSeries]
  }
  
  extension [Self <: IndicesIndexSettingsTimeSeries](x: Self) {
    
    inline def setEnd_time(value: DateTime): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    inline def setEnd_timeUndefined: Self = StObject.set(x, "end_time", js.undefined)
    
    inline def setStart_time(value: DateTime): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    inline def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
  }
}
