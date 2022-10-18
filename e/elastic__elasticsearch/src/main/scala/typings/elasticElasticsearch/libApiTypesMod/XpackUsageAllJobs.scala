package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageAllJobs extends StObject {
  
  var count: integer
  
  var created_by: Record[String, String | integer]
  
  var detectors: Record[String, integer]
  
  var forecasts: Record[String, integer]
  
  var model_size: Record[String, integer]
}
object XpackUsageAllJobs {
  
  inline def apply(
    count: integer,
    created_by: Record[String, String | integer],
    detectors: Record[String, integer],
    forecasts: Record[String, integer],
    model_size: Record[String, integer]
  ): XpackUsageAllJobs = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], detectors = detectors.asInstanceOf[js.Any], forecasts = forecasts.asInstanceOf[js.Any], model_size = model_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageAllJobs]
  }
  
  extension [Self <: XpackUsageAllJobs](x: Self) {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCreated_by(value: Record[String, String | integer]): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
    inline def setDetectors(value: Record[String, integer]): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
    
    inline def setForecasts(value: Record[String, integer]): Self = StObject.set(x, "forecasts", value.asInstanceOf[js.Any])
    
    inline def setModel_size(value: Record[String, integer]): Self = StObject.set(x, "model_size", value.asInstanceOf[js.Any])
  }
}
