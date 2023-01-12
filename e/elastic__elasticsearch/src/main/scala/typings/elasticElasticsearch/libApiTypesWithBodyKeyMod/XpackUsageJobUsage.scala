package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageJobUsage extends StObject {
  
  var count: integer
  
  var created_by: Record[String, long]
  
  var detectors: MlJobStatistics
  
  var forecasts: XpackUsageMlJobForecasts
  
  var model_size: MlJobStatistics
}
object XpackUsageJobUsage {
  
  inline def apply(
    count: integer,
    created_by: Record[String, long],
    detectors: MlJobStatistics,
    forecasts: XpackUsageMlJobForecasts,
    model_size: MlJobStatistics
  ): XpackUsageJobUsage = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], detectors = detectors.asInstanceOf[js.Any], forecasts = forecasts.asInstanceOf[js.Any], model_size = model_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageJobUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageJobUsage] (val x: Self) extends AnyVal {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCreated_by(value: Record[String, long]): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
    inline def setDetectors(value: MlJobStatistics): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
    
    inline def setForecasts(value: XpackUsageMlJobForecasts): Self = StObject.set(x, "forecasts", value.asInstanceOf[js.Any])
    
    inline def setModel_size(value: MlJobStatistics): Self = StObject.set(x, "model_size", value.asInstanceOf[js.Any])
  }
}
