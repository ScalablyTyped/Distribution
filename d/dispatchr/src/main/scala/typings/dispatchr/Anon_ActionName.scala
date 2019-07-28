package typings.dispatchr

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionName extends js.Object {
  var actionName: js.UndefOr[String] = js.undefined
  var error: Error
  var payload: js.UndefOr[js.Any] = js.undefined
}

object Anon_ActionName {
  @scala.inline
  def apply(error: Error, actionName: String = null, payload: js.Any = null): Anon_ActionName = {
    val __obj = js.Dynamic.literal(error = error)
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[Anon_ActionName]
  }
}

