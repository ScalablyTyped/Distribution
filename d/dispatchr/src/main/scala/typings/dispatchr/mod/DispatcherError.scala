package typings.dispatchr.mod

import typings.dispatchr.anon.ActionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatcherError extends js.Object {
  var message: String
  var meta: ActionName
  var `type`: String
}

object DispatcherError {
  @scala.inline
  def apply(message: String, meta: ActionName, `type`: String): DispatcherError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatcherError]
  }
}

