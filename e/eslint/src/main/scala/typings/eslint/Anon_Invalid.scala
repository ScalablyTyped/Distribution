package typings.eslint

import typings.eslint.eslintMod.RuleTesterNs.InvalidTestCase
import typings.eslint.eslintMod.RuleTesterNs.ValidTestCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Invalid extends js.Object {
  var invalid: js.UndefOr[js.Array[InvalidTestCase]] = js.undefined
  var valid: js.UndefOr[js.Array[String | ValidTestCase]] = js.undefined
}

object Anon_Invalid {
  @scala.inline
  def apply(invalid: js.Array[InvalidTestCase] = null, valid: js.Array[String | ValidTestCase] = null): Anon_Invalid = {
    val __obj = js.Dynamic.literal()
    if (invalid != null) __obj.updateDynamic("invalid")(invalid)
    if (valid != null) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[Anon_Invalid]
  }
}

