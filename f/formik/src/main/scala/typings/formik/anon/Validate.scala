package typings.formik.anon

import typings.formik.typesMod.FieldValidator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validate extends js.Object {
  var validate: js.UndefOr[FieldValidator] = js.undefined
}

object Validate {
  @scala.inline
  def apply(validate: /* value */ js.Any => String | Unit | (js.Promise[String | Unit]) = null): Validate = {
    val __obj = js.Dynamic.literal()
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Validate]
  }
}

