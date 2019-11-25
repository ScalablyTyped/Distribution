package typings.dispatchr.dispatchrMod

import typings.dispatchr.Anon_ActionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatcherError extends js.Object {
  var message: String
  var meta: Anon_ActionName
  var `type`: String
}

object DispatcherError {
  @scala.inline
  def apply(message: String, meta: Anon_ActionName, `type`: String): DispatcherError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatcherError]
  }
}

