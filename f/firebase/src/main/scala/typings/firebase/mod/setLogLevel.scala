package typings.firebase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "setLogLevel")
@js.native
object setLogLevel extends js.Object {
  /**
    * Sets log level for all Firebase packages.
    *
    * All of the log types above the current log level are captured (i.e. if
    * you set the log level to `info`, errors are logged, but `debug` and
    * `verbose` logs are not).
    */
  def apply(logLevel: LogLevel): Unit = js.native
}

