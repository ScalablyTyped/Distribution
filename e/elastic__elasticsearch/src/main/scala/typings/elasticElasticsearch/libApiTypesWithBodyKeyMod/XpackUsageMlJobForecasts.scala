package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageMlJobForecasts extends StObject {
  
  var forecasted_jobs: long
  
  var total: long
}
object XpackUsageMlJobForecasts {
  
  inline def apply(forecasted_jobs: long, total: long): XpackUsageMlJobForecasts = {
    val __obj = js.Dynamic.literal(forecasted_jobs = forecasted_jobs.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageMlJobForecasts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageMlJobForecasts] (val x: Self) extends AnyVal {
    
    inline def setForecasted_jobs(value: long): Self = StObject.set(x, "forecasted_jobs", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
