package typings.gapiDotClientDotFirebaserules.gapiNs.clientNs.firebaserulesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /** The result is undefined, meaning the result could not be computed. */
  var undefined: js.UndefOr[js.Any] = js.undefined
  /**
    * The result is an actual value. The type of the value must match that
    * of the type declared by the service.
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object Result {
  @scala.inline
  def apply(undefined: js.Any = null, value: js.Any = null): Result = {
    val __obj = js.Dynamic.literal()
    if (undefined != null) __obj.updateDynamic("undefined")(undefined)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Result]
  }
}

