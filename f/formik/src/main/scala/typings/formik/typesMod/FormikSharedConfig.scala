package typings.formik.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikSharedConfig[Props] extends js.Object {
  /** Should Formik reset the form when new initialValues change */
  var enableReinitialize: js.UndefOr[Boolean] = js.undefined
  /** Tell Formik if initial form values are valid or not on first render */
  var isInitialValid: js.UndefOr[Boolean | (js.Function1[/* props */ Props, Boolean])] = js.undefined
  /** Tells Formik to validate the form on each input's onBlur event */
  var validateOnBlur: js.UndefOr[Boolean] = js.undefined
  /** Tells Formik to validate the form on each input's onChange event */
  var validateOnChange: js.UndefOr[Boolean] = js.undefined
  /** Tells Formik to validate upon mount */
  var validateOnMount: js.UndefOr[Boolean] = js.undefined
}

object FormikSharedConfig {
  @scala.inline
  def apply[Props](
    enableReinitialize: js.UndefOr[Boolean] = js.undefined,
    isInitialValid: Boolean | (js.Function1[/* props */ Props, Boolean]) = null,
    validateOnBlur: js.UndefOr[Boolean] = js.undefined,
    validateOnChange: js.UndefOr[Boolean] = js.undefined,
    validateOnMount: js.UndefOr[Boolean] = js.undefined
  ): FormikSharedConfig[Props] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableReinitialize)) __obj.updateDynamic("enableReinitialize")(enableReinitialize.asInstanceOf[js.Any])
    if (isInitialValid != null) __obj.updateDynamic("isInitialValid")(isInitialValid.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnMount)) __obj.updateDynamic("validateOnMount")(validateOnMount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormikSharedConfig[Props]]
  }
}

