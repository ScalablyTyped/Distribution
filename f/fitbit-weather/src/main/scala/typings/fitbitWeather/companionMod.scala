package typings.fitbitWeather

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object companionMod {
  
  @JSImport("fitbit-weather/companion", "Providers")
  @js.native
  val Providers: ProvidersCodes = js.native
  
  @JSImport("fitbit-weather/companion", "setup")
  @js.native
  def setup(configuration: Configuration): Unit = js.native
  
  @js.native
  trait Configuration extends StObject {
    
    var apiKey: String = js.native
    
    var provider: Double = js.native
  }
  object Configuration {
    
    @scala.inline
    def apply(apiKey: String, provider: Double): Configuration = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider(value: Double): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProvidersCodes extends StObject {
    
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
    implicit class ProvidersCodesMutableBuilder[Self <: ProvidersCodes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDarksky(value: Double): Self = StObject.set(x, "darksky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenweathermap(value: Double): Self = StObject.set(x, "openweathermap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeatherbit(value: Double): Self = StObject.set(x, "weatherbit", value.asInstanceOf[js.Any])
    }
  }
}
