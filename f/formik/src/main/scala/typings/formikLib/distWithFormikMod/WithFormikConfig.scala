package typings
package formikLib.distWithFormikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithFormikConfig[Props, Values /* <: formikLib.distTypesMod.FormikValues */, DeprecatedPayload]
  extends formikLib.distTypesMod.FormikSharedConfig[Props] {
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var mapPropsToStatus: js.UndefOr[js.Function1[/* props */ Props, _]] = js.undefined
  var mapPropsToValues: js.UndefOr[js.Function1[/* props */ Props, Values]] = js.undefined
  var mapValuesToPayload: js.UndefOr[js.Function1[/* values */ Values, DeprecatedPayload]] = js.undefined
  var validate: js.UndefOr[
    js.Function2[/* values */ Values, /* props */ Props, scala.Unit | js.Object | js.Promise[_]]
  ] = js.undefined
  var validationSchema: js.UndefOr[js.Any | (js.Function1[/* props */ Props, _])] = js.undefined
  def handleSubmit(values: Values, formikBag: FormikBag[Props, Values]): scala.Unit
}

object WithFormikConfig {
  @scala.inline
  def apply[Props, Values /* <: formikLib.distTypesMod.FormikValues */, DeprecatedPayload](
    handleSubmit: (Values, FormikBag[Props, Values]) => scala.Unit,
    displayName: java.lang.String = null,
    enableReinitialize: js.UndefOr[scala.Boolean] = js.undefined,
    isInitialValid: scala.Boolean | (js.Function1[Props, scala.Boolean]) = null,
    mapPropsToStatus: /* props */ Props => _ = null,
    mapPropsToValues: /* props */ Props => Values = null,
    mapValuesToPayload: /* values */ Values => DeprecatedPayload = null,
    validate: (/* values */ Values, /* props */ Props) => scala.Unit | js.Object | js.Promise[_] = null,
    validateOnBlur: js.UndefOr[scala.Boolean] = js.undefined,
    validateOnChange: js.UndefOr[scala.Boolean] = js.undefined,
    validationSchema: js.Any | (js.Function1[/* props */ Props, _]) = null
  ): WithFormikConfig[Props, Values, DeprecatedPayload] = {
    val __obj = js.Dynamic.literal(handleSubmit = js.Any.fromFunction2(handleSubmit))
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(enableReinitialize)) __obj.updateDynamic("enableReinitialize")(enableReinitialize)
    if (isInitialValid != null) __obj.updateDynamic("isInitialValid")(isInitialValid.asInstanceOf[js.Any])
    if (mapPropsToStatus != null) __obj.updateDynamic("mapPropsToStatus")(js.Any.fromFunction1(mapPropsToStatus))
    if (mapPropsToValues != null) __obj.updateDynamic("mapPropsToValues")(js.Any.fromFunction1(mapPropsToValues))
    if (mapValuesToPayload != null) __obj.updateDynamic("mapValuesToPayload")(js.Any.fromFunction1(mapValuesToPayload))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur)
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange)
    if (validationSchema != null) __obj.updateDynamic("validationSchema")(validationSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithFormikConfig[Props, Values, DeprecatedPayload]]
  }
}

