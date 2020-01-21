package typings.dispatchr.mod

import typings.dispatchr.AnonActionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatcherError extends js.Object {
  var message: String
  var meta: AnonActionName
  var `type`: String
}

object DispatcherError {
  @scala.inline
  def apply(message: String, meta: AnonActionName, `type`: String): DispatcherError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatcherError]
  }
}

