package typings.formik.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikSharedConfig[Props] extends js.Object {
  var enableReinitialize: js.UndefOr[Boolean] = js.undefined
  var isInitialValid: js.UndefOr[Boolean | (js.Function1[/* props */ Props, Boolean])] = js.undefined
  var validateOnBlur: js.UndefOr[Boolean] = js.undefined
  var validateOnChange: js.UndefOr[Boolean] = js.undefined
}

object FormikSharedConfig {
  @scala.inline
  def apply[Props](
    enableReinitialize: js.UndefOr[Boolean] = js.undefined,
    isInitialValid: Boolean | (js.Function1[/* props */ Props, Boolean]) = null,
    validateOnBlur: js.UndefOr[Boolean] = js.undefined,
    validateOnChange: js.UndefOr[Boolean] = js.undefined
  ): FormikSharedConfig[Props] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableReinitialize)) __obj.updateDynamic("enableReinitialize")(enableReinitialize.asInstanceOf[js.Any])
    if (isInitialValid != null) __obj.updateDynamic("isInitialValid")(isInitialValid.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormikSharedConfig[Props]]
  }
}

