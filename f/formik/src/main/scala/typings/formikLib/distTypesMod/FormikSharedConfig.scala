package typings
package formikLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikSharedConfig extends js.Object {
  var enableReinitialize: js.UndefOr[scala.Boolean] = js.undefined
  var isInitialValid: js.UndefOr[scala.Boolean | (js.Function1[/* props */ js.Object, js.UndefOr[scala.Boolean]])] = js.undefined
  var validateOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  var validateOnChange: js.UndefOr[scala.Boolean] = js.undefined
}

object FormikSharedConfig {
  @scala.inline
  def apply(
    enableReinitialize: js.UndefOr[scala.Boolean] = js.undefined,
    isInitialValid: scala.Boolean | (js.Function1[/* props */ js.Object, js.UndefOr[scala.Boolean]]) = null,
    validateOnBlur: js.UndefOr[scala.Boolean] = js.undefined,
    validateOnChange: js.UndefOr[scala.Boolean] = js.undefined
  ): FormikSharedConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableReinitialize)) __obj.updateDynamic("enableReinitialize")(enableReinitialize)
    if (isInitialValid != null) __obj.updateDynamic("isInitialValid")(isInitialValid.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur)
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange)
    __obj.asInstanceOf[FormikSharedConfig]
  }
}

