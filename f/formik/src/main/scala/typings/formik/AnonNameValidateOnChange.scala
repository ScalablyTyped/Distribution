package typings.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameValidateOnChange extends js.Object {
  var name: String
  var validateOnChange: js.UndefOr[Boolean] = js.undefined
}

object AnonNameValidateOnChange {
  @scala.inline
  def apply(name: String, validateOnChange: js.UndefOr[Boolean] = js.undefined): AnonNameValidateOnChange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameValidateOnChange]
  }
}

