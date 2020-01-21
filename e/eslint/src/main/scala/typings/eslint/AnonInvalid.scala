package typings.eslint

import typings.eslint.mod.RuleTester.InvalidTestCase
import typings.eslint.mod.RuleTester.ValidTestCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvalid extends js.Object {
  var invalid: js.UndefOr[js.Array[InvalidTestCase]] = js.undefined
  var valid: js.UndefOr[js.Array[String | ValidTestCase]] = js.undefined
}

object AnonInvalid {
  @scala.inline
  def apply(invalid: js.Array[InvalidTestCase] = null, valid: js.Array[String | ValidTestCase] = null): AnonInvalid = {
    val __obj = js.Dynamic.literal()
    if (invalid != null) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    if (valid != null) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInvalid]
  }
}

