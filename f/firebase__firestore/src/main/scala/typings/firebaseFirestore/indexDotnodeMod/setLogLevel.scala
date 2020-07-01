package typings.firebaseFirestore.indexDotnodeMod

import typings.firebaseLogger.loggerMod.LogLevel
import typings.firebaseLogger.loggerMod.LogLevelString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "setLogLevel")
@js.native
object setLogLevel extends js.Object {
  def apply(newLevel: LogLevel): Unit = js.native
  def apply(newLevel: LogLevelString): Unit = js.native
}

