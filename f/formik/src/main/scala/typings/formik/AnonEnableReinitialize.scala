package typings.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnableReinitialize extends js.Object {
  var enableReinitialize: Boolean
  var isInitialValid: Boolean
  var validateOnBlur: Boolean
  var validateOnChange: Boolean
}

object AnonEnableReinitialize {
  @scala.inline
  def apply(
    enableReinitialize: Boolean,
    isInitialValid: Boolean,
    validateOnBlur: Boolean,
    validateOnChange: Boolean
  ): AnonEnableReinitialize = {
    val __obj = js.Dynamic.literal(enableReinitialize = enableReinitialize.asInstanceOf[js.Any], isInitialValid = isInitialValid.asInstanceOf[js.Any], validateOnBlur = validateOnBlur.asInstanceOf[js.Any], validateOnChange = validateOnChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnableReinitialize]
  }
}

