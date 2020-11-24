package typings.ds18b20.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ds18b20", "temperatureSync")
@js.native
object temperatureSync extends js.Object {
  
  def apply(sensorId: String): Double = js.native
  def apply(sensorId: String, options: TemperatureOptions): Double = js.native
}
