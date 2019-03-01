package typings
package gapiDotClientDotFirebaserulesLib.gapiNs.clientNs.firebaserulesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arg extends js.Object {
  /** Argument matches any value provided. */
  var anyValue: js.UndefOr[js.Any] = js.undefined
  /** Argument exactly matches value provided. */
  var exactValue: js.UndefOr[js.Any] = js.undefined
}

object Arg {
  @scala.inline
  def apply(anyValue: js.Any = null, exactValue: js.Any = null): Arg = {
    val __obj = js.Dynamic.literal()
    if (anyValue != null) __obj.updateDynamic("anyValue")(anyValue)
    if (exactValue != null) __obj.updateDynamic("exactValue")(exactValue)
    __obj.asInstanceOf[Arg]
  }
}

