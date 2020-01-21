package typings.formik.withFormikMod

import typings.formik.typesMod.FormikSharedConfig
import typings.formik.typesMod.FormikValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithFormikConfig[Props, Values /* <: FormikValues */, DeprecatedPayload] extends FormikSharedConfig[Props] {
  var displayName: js.UndefOr[String] = js.undefined
  var mapPropsToStatus: js.UndefOr[js.Function1[/* props */ Props, _]] = js.undefined
  var mapPropsToValues: js.UndefOr[js.Function1[/* props */ Props, Values]] = js.undefined
  var mapValuesToPayload: js.UndefOr[js.Function1[/* values */ Values, DeprecatedPayload]] = js.undefined
  var validate: js.UndefOr[
    js.Function2[/* values */ Values, /* props */ Props, Unit | js.Object | js.Promise[_]]
  ] = js.undefined
  var validationSchema: js.UndefOr[js.Any | (js.Function1[/* props */ Props, _])] = js.undefined
  def handleSubmit(values: Values, formikBag: FormikBag[Props, Values]): Unit
}

object WithFormikConfig {
  @scala.inline
  def apply[Props, Values /* <: FormikValues */, DeprecatedPayload](
    handleSubmit: (Values, FormikBag[Props, Values]) => Unit,
    displayName: String = null,
    enableReinitialize: js.UndefOr[Boolean] = js.undefined,
    isInitialValid: Boolean | (js.Function1[Props, Boolean]) = null,
    mapPropsToStatus: /* props */ Props => _ = null,
    mapPropsToValues: /* props */ Props => Values = null,
    mapValuesToPayload: /* values */ Values => DeprecatedPayload = null,
    validate: (/* values */ Values, /* props */ Props) => Unit | js.Object | js.Promise[_] = null,
    validateOnBlur: js.UndefOr[Boolean] = js.undefined,
    validateOnChange: js.UndefOr[Boolean] = js.undefined,
    validationSchema: js.Any | (js.Function1[/* props */ Props, _]) = null
  ): WithFormikConfig[Props, Values, DeprecatedPayload] = {
    val __obj = js.Dynamic.literal(handleSubmit = js.Any.fromFunction2(handleSubmit))
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableReinitialize)) __obj.updateDynamic("enableReinitialize")(enableReinitialize.asInstanceOf[js.Any])
    if (isInitialValid != null) __obj.updateDynamic("isInitialValid")(isInitialValid.asInstanceOf[js.Any])
    if (mapPropsToStatus != null) __obj.updateDynamic("mapPropsToStatus")(js.Any.fromFunction1(mapPropsToStatus))
    if (mapPropsToValues != null) __obj.updateDynamic("mapPropsToValues")(js.Any.fromFunction1(mapPropsToValues))
    if (mapValuesToPayload != null) __obj.updateDynamic("mapValuesToPayload")(js.Any.fromFunction1(mapValuesToPayload))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.asInstanceOf[js.Any])
    if (validationSchema != null) __obj.updateDynamic("validationSchema")(validationSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithFormikConfig[Props, Values, DeprecatedPayload]]
  }
}

