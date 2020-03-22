package typings.firebaseLogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loggerMod {
  type LogCallback = js.Function1[
    /* callbackParams */ typings.firebaseLogger.loggerMod.LogCallbackParams, 
    scala.Unit
  ]
  type LogHandler = js.Function3[
    /* loggerInstance */ typings.firebaseLogger.loggerMod.Logger, 
    /* logType */ typings.firebaseLogger.loggerMod.LogLevel, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
}
