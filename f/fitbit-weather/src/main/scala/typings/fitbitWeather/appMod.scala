package typings.fitbitWeather

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMod {
  
  @JSImport("fitbit-weather/app", "fetch")
  @js.native
  def fetch(age: Double): js.Promise[Result] = js.native
  
  @js.native
  trait Result extends StObject {
    
    var conditionCode: Double = js.native
    
    var description: String = js.native
    
    var isDay: Boolean = js.native
    
    var location: String = js.native
    
    var realConditionCode: String = js.native
    
    var sunrise: Double = js.native
    
    var sunset: Double = js.native
    
    var temperatureC: Double = js.native
    
    var temperatureF: Double = js.native
    
    var timestamp: Double = js.native
  }
  object Result {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConditionCode(value: Double): Self = StObject.set(x, "conditionCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDay(value: Boolean): Self = StObject.set(x, "isDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealConditionCode(value: String): Self = StObject.set(x, "realConditionCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSunrise(value: Double): Self = StObject.set(x, "sunrise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSunset(value: Double): Self = StObject.set(x, "sunset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemperatureC(value: Double): Self = StObject.set(x, "temperatureC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemperatureF(value: Double): Self = StObject.set(x, "temperatureF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
