package typings.formik

import typings.formik.typesMod.FieldValidator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValidate extends js.Object {
  var validate: js.UndefOr[FieldValidator] = js.undefined
}

object AnonValidate {
  @scala.inline
  def apply(validate: /* value */ js.Any => String | Unit | (js.Promise[String | Unit]) = null): AnonValidate = {
    val __obj = js.Dynamic.literal()
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    __obj.asInstanceOf[AnonValidate]
  }
}

