package typings.formik.withFormikMod

import typings.formik.typesMod.FormikErrors
import typings.formik.typesMod.FormikSharedConfig
import typings.formik.typesMod.FormikTouched
import typings.formik.typesMod.FormikValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithFormikConfig[Props, Values /* <: FormikValues */, DeprecatedPayload] extends FormikSharedConfig[Props] {
  /**
    * Set the display name of the component. Useful for React DevTools.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * Map props to the form errors state
    */
  var mapPropsToErrors: js.UndefOr[js.Function1[/* props */ Props, FormikErrors[Values]]] = js.undefined
  /**
    * Map props to the form values
    */
  var mapPropsToStatus: js.UndefOr[js.Function1[/* props */ Props, _]] = js.undefined
  /**
    * Map props to the form touched state
    */
  var mapPropsToTouched: js.UndefOr[js.Function1[/* props */ Props, FormikTouched[Values]]] = js.undefined
  /**
    * Map props to the form values
    */
  var mapPropsToValues: js.UndefOr[js.Function1[/* props */ Props, Values]] = js.undefined
  /**
    * @deprecated in 0.9.0 (but needed to break TS types)
    */
  var mapValuesToPayload: js.UndefOr[js.Function1[/* values */ Values, DeprecatedPayload]] = js.undefined
  /**
    * Validation function. Must return an error object or promise that
    * throws an error object where that object keys map to corresponding value.
    */
  var validate: js.UndefOr[
    js.Function2[/* values */ Values, /* props */ Props, Unit | js.Object | js.Promise[_]]
  ] = js.undefined
  /**
    * A Yup Schema or a function that returns a Yup schema
    */
  var validationSchema: js.UndefOr[js.Any | (js.Function1[/* props */ Props, _])] = js.undefined
  /**
    * Submission handler
    */
  def handleSubmit(values: Values, formikBag: FormikBag[Props, Values]): Unit
}

object WithFormikConfig {
  @scala.inline
  def apply[Props, /* <: typings.formik.typesMod.FormikValues */ Values, DeprecatedPayload](
    handleSubmit: (Values, FormikBag[Props, Values]) => Unit,
    displayName: String = null,
    enableReinitialize: js.UndefOr[Boolean] = js.undefined,
    isInitialValid: Boolean | (js.Function1[Props, Boolean]) = null,
    mapPropsToErrors: /* props */ Props => FormikErrors[Values] = null,
    mapPropsToStatus: /* props */ Props => _ = null,
    mapPropsToTouched: /* props */ Props => FormikTouched[Values] = null,
    mapPropsToValues: /* props */ Props => Values = null,
    mapValuesToPayload: /* values */ Values => DeprecatedPayload = null,
    validate: (/* values */ Values, /* props */ Props) => Unit | js.Object | js.Promise[_] = null,
    validateOnBlur: js.UndefOr[Boolean] = js.undefined,
    validateOnChange: js.UndefOr[Boolean] = js.undefined,
    validateOnMount: js.UndefOr[Boolean] = js.undefined,
    validationSchema: js.Any | (js.Function1[/* props */ Props, _]) = null
  ): WithFormikConfig[Props, Values, DeprecatedPayload] = {
    val __obj = js.Dynamic.literal(handleSubmit = js.Any.fromFunction2(handleSubmit))
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableReinitialize)) __obj.updateDynamic("enableReinitialize")(enableReinitialize.get.asInstanceOf[js.Any])
    if (isInitialValid != null) __obj.updateDynamic("isInitialValid")(isInitialValid.asInstanceOf[js.Any])
    if (mapPropsToErrors != null) __obj.updateDynamic("mapPropsToErrors")(js.Any.fromFunction1(mapPropsToErrors))
    if (mapPropsToStatus != null) __obj.updateDynamic("mapPropsToStatus")(js.Any.fromFunction1(mapPropsToStatus))
    if (mapPropsToTouched != null) __obj.updateDynamic("mapPropsToTouched")(js.Any.fromFunction1(mapPropsToTouched))
    if (mapPropsToValues != null) __obj.updateDynamic("mapPropsToValues")(js.Any.fromFunction1(mapPropsToValues))
    if (mapValuesToPayload != null) __obj.updateDynamic("mapValuesToPayload")(js.Any.fromFunction1(mapValuesToPayload))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur.get.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnMount)) __obj.updateDynamic("validateOnMount")(validateOnMount.get.asInstanceOf[js.Any])
    if (validationSchema != null) __obj.updateDynamic("validationSchema")(validationSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithFormikConfig[Props, Values, DeprecatedPayload]]
  }
}

