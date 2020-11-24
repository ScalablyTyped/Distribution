package typings.fitbitWeather.appMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
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
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConditionCode(value: Double): Self = this.set("conditionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDay(value: Boolean): Self = this.set("isDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealConditionCode(value: String): Self = this.set("realConditionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSunrise(value: Double): Self = this.set("sunrise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSunset(value: Double): Self = this.set("sunset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemperatureC(value: Double): Self = this.set("temperatureC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemperatureF(value: Double): Self = this.set("temperatureF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
