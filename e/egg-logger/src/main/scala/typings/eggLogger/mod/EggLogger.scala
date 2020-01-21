package typings.eggLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg-logger", "EggLogger")
@js.native
class EggLogger () extends Logger[EggLoggerOptions] {
  var consoleLevel: LoggerLevel = js.native
  var level: LoggerLevel = js.native
}

