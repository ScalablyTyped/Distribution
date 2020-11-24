package typings.ds18b20.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ds18b20", "temperature")
@js.native
object temperature extends js.Object {
  
  def apply(sensorId: String, callback: TemperatureCallback): Unit = js.native
  def apply(sensorId: String, options: TemperatureOptions, callback: TemperatureCallback): Unit = js.native
}
