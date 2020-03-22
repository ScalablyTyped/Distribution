package typings.firebaseLogger.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/logger/dist/src/logger", "setUserLogHandler")
@js.native
object setUserLogHandler extends js.Object {
  def apply(): Unit = js.native
  def apply(logCallback: Null, options: LogOptions): Unit = js.native
  def apply(logCallback: LogCallback): Unit = js.native
  def apply(logCallback: LogCallback, options: LogOptions): Unit = js.native
}

