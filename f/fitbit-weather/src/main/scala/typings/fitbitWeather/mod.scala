package typings.fitbitWeather

import typings.fitbitWeather.appMod.Result
import typings.fitbitWeather.companionMod.Configuration
import typings.fitbitWeather.companionMod.ProvidersCodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fitbit-weather", "Providers")
  @js.native
  val Providers: ProvidersCodes = js.native
  
  @JSImport("fitbit-weather", "fetch")
  @js.native
  def fetch(age: Double): js.Promise[Result] = js.native
  
  @JSImport("fitbit-weather", "setup")
  @js.native
  def setup(configuration: Configuration): Unit = js.native
}
