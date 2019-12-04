package typings.expo.buildLogsRemoteLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogErrorData extends js.Object {
  var message: String
  var stack: String
}

object LogErrorData {
  @scala.inline
  def apply(message: String, stack: String): LogErrorData = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogErrorData]
  }
}

