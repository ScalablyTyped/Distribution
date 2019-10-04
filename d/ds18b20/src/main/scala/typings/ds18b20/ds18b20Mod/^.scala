package typings.ds18b20.ds18b20Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ds18b20", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def sensors(callback: SensorsCallback): Unit = js.native
  def temperature(sensorId: String, callback: TemperatureCallback): Unit = js.native
  def temperature(sensorId: String, options: TemperatureOptions, callback: TemperatureCallback): Unit = js.native
  def temperatureSync(sensorId: String): Double = js.native
  def temperatureSync(sensorId: String, options: TemperatureOptions): Double = js.native
}

