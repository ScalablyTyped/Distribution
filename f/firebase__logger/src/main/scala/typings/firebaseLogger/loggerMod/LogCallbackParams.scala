package typings.firebaseLogger.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogCallbackParams extends js.Object {
  var args: js.Array[_]
  var level: LogLevelString
  var message: String
  var `type`: String
}

object LogCallbackParams {
  @scala.inline
  def apply(args: js.Array[_], level: LogLevelString, message: String, `type`: String): LogCallbackParams = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogCallbackParams]
  }
}

