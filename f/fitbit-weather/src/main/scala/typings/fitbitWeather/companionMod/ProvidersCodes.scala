package typings.fitbitWeather.companionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvidersCodes extends js.Object {
  
  var darksky: Double = js.native
  
  var openweathermap: Double = js.native
  
  var weatherbit: Double = js.native
}
object ProvidersCodes {
  
  @scala.inline
  def apply(darksky: Double, openweathermap: Double, weatherbit: Double): ProvidersCodes = {
    val __obj = js.Dynamic.literal(darksky = darksky.asInstanceOf[js.Any], openweathermap = openweathermap.asInstanceOf[js.Any], weatherbit = weatherbit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvidersCodes]
  }
  
  @scala.inline
  implicit class ProvidersCodesOps[Self <: ProvidersCodes] (val x: Self) extends AnyVal {
    
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
    def setDarksky(value: Double): Self = this.set("darksky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenweathermap(value: Double): Self = this.set("openweathermap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeatherbit(value: Double): Self = this.set("weatherbit", value.asInstanceOf[js.Any])
  }
}
