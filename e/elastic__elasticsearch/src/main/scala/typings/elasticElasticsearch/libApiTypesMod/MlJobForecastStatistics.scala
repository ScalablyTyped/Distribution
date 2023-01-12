package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlJobForecastStatistics extends StObject {
  
  var forecasted_jobs: integer
  
  var memory_bytes: js.UndefOr[MlJobStatistics] = js.undefined
  
  var processing_time_ms: js.UndefOr[MlJobStatistics] = js.undefined
  
  var records: js.UndefOr[MlJobStatistics] = js.undefined
  
  var status: js.UndefOr[Record[String, long]] = js.undefined
  
  var total: long
}
object MlJobForecastStatistics {
  
  inline def apply(forecasted_jobs: integer, total: long): MlJobForecastStatistics = {
    val __obj = js.Dynamic.literal(forecasted_jobs = forecasted_jobs.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlJobForecastStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlJobForecastStatistics] (val x: Self) extends AnyVal {
    
    inline def setForecasted_jobs(value: integer): Self = StObject.set(x, "forecasted_jobs", value.asInstanceOf[js.Any])
    
    inline def setMemory_bytes(value: MlJobStatistics): Self = StObject.set(x, "memory_bytes", value.asInstanceOf[js.Any])
    
    inline def setMemory_bytesUndefined: Self = StObject.set(x, "memory_bytes", js.undefined)
    
    inline def setProcessing_time_ms(value: MlJobStatistics): Self = StObject.set(x, "processing_time_ms", value.asInstanceOf[js.Any])
    
    inline def setProcessing_time_msUndefined: Self = StObject.set(x, "processing_time_ms", js.undefined)
    
    inline def setRecords(value: MlJobStatistics): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
    
    inline def setStatus(value: Record[String, long]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTotal(value: long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
