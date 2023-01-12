package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlForecastResponse extends StObject {
  
  var acknowledged: Boolean
  
  var forecast_id: Id
}
object MlForecastResponse {
  
  inline def apply(acknowledged: Boolean, forecast_id: Id): MlForecastResponse = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], forecast_id = forecast_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlForecastResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlForecastResponse] (val x: Self) extends AnyVal {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setForecast_id(value: Id): Self = StObject.set(x, "forecast_id", value.asInstanceOf[js.Any])
  }
}
