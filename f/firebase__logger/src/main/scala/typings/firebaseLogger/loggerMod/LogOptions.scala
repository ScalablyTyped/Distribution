package typings.firebaseLogger.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogOptions extends js.Object {
  var level: LogLevelString
}

object LogOptions {
  @scala.inline
  def apply(level: LogLevelString): LogOptions = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogOptions]
  }
}

