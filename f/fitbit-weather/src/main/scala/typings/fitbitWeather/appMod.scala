package typings.fitbitWeather

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMod {
  
  @JSImport("fitbit-weather/app", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetch(age: Double): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(age.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  trait Result extends StObject {
    
    var conditionCode: Double
    
    var description: String
    
    var isDay: Boolean
    
    var location: String
    
    var realConditionCode: String
    
    var sunrise: Double
    
    var sunset: Double
    
    var temperatureC: Double
    
    var temperatureF: Double
    
    var timestamp: Double
  }
  object Result {
    
    inline def apply(
      conditionCode: Double,
      description: String,
      isDay: Boolean,
      location: String,
      realConditionCode: String,
      sunrise: Double,
      sunset: Double,
      temperatureC: Double,
      temperatureF: Double,
      timestamp: Double
    ): Result = {
      val __obj = js.Dynamic.literal(conditionCode = conditionCode.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isDay = isDay.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], realConditionCode = realConditionCode.asInstanceOf[js.Any], sunrise = sunrise.asInstanceOf[js.Any], sunset = sunset.asInstanceOf[js.Any], temperatureC = temperatureC.asInstanceOf[js.Any], temperatureF = temperatureF.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setConditionCode(value: Double): Self = StObject.set(x, "conditionCode", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setIsDay(value: Boolean): Self = StObject.set(x, "isDay", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setRealConditionCode(value: String): Self = StObject.set(x, "realConditionCode", value.asInstanceOf[js.Any])
      
      inline def setSunrise(value: Double): Self = StObject.set(x, "sunrise", value.asInstanceOf[js.Any])
      
      inline def setSunset(value: Double): Self = StObject.set(x, "sunset", value.asInstanceOf[js.Any])
      
      inline def setTemperatureC(value: Double): Self = StObject.set(x, "temperatureC", value.asInstanceOf[js.Any])
      
      inline def setTemperatureF(value: Double): Self = StObject.set(x, "temperatureF", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
