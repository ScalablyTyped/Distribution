package typings.atFirebaseLogger.atFirebaseLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/logger", "Logger")
@js.native
class Logger protected ()
  extends typings.atFirebaseLogger.distSrcLoggerMod.Logger {
  /**
    * Gives you an instance of a Logger to capture messages according to
    * Firebase's logging scheme.
    *
    * @param name The name that the logs will be associated with
    */
  def this(name: String) = this()
}

