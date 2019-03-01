package typings
package dispatchrLib.dispatchrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatcherError extends js.Object {
  var message: java.lang.String
  var meta: dispatchrLib.Anon_ActionName
  var `type`: java.lang.String
}

object DispatcherError {
  @scala.inline
  def apply(message: java.lang.String, meta: dispatchrLib.Anon_ActionName, `type`: java.lang.String): DispatcherError = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[DispatcherError]
  }
}

