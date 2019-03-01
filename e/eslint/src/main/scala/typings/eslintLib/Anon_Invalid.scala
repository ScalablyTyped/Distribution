package typings
package eslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Invalid extends js.Object {
  var invalid: js.UndefOr[js.Array[eslintLib.eslintMod.RuleTesterNs.InvalidTestCase]] = js.undefined
  var valid: js.UndefOr[js.Array[java.lang.String | eslintLib.eslintMod.RuleTesterNs.ValidTestCase]] = js.undefined
}

object Anon_Invalid {
  @scala.inline
  def apply(
    invalid: js.Array[eslintLib.eslintMod.RuleTesterNs.InvalidTestCase] = null,
    valid: js.Array[java.lang.String | eslintLib.eslintMod.RuleTesterNs.ValidTestCase] = null
  ): Anon_Invalid = {
    val __obj = js.Dynamic.literal()
    if (invalid != null) __obj.updateDynamic("invalid")(invalid)
    if (valid != null) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[Anon_Invalid]
  }
}

