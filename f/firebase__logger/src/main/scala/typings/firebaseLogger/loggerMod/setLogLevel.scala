package typings.firebaseLogger.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/logger/dist/src/logger", "setLogLevel")
@js.native
object setLogLevel extends js.Object {
  def apply(level: LogLevel): Unit = js.native
  def apply(level: LogLevelString): Unit = js.native
}

