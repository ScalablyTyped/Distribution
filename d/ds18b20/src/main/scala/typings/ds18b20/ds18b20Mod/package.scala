package typings.ds18b20

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ds18b20Mod {
  import typings.std.Error

  type SensorsCallback = js.Function2[/* err */ Error | Null, /* ids */ js.Array[String], Unit]
  type TemperatureCallback = js.Function2[/* err */ Error | Null, /* value */ Double, Unit]
}
