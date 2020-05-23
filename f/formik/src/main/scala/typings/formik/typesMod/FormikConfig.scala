package typings.formik.typesMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikConfig[Values]
  extends FormikSharedConfig[js.Object] {
  /**
    * React children or child render callback
    */
  var children: js.UndefOr[(js.Function1[/* props */ FormikProps[Values], ReactNode]) | ReactNode] = js.undefined
  /**
    * Form component to render
    */
  var component: js.UndefOr[ComponentType[FormikProps[Values]] | ReactNode] = js.undefined
  /** Initial object map of field names to specific error for that field */
  var initialErrors: js.UndefOr[FormikErrors[Values]] = js.undefined
  /**
    * Initial status
    */
  var initialStatus: js.UndefOr[js.Any] = js.undefined
  /** Initial object map of field names to whether the field has been touched */
  var initialTouched: js.UndefOr[FormikTouched[Values]] = js.undefined
  /**
    * Initial values of the form
    */
  var initialValues: Values
  /** Inner ref */
  var innerRef: js.UndefOr[js.Function1[/* instance */ js.Any, Unit]] = js.undefined
  /**
    * Reset handler
    */
  var onReset: js.UndefOr[
    js.Function2[/* values */ Values, /* formikHelpers */ FormikHelpers[Values], Unit]
  ] = js.undefined
  /**
    * Render prop (works like React router's <Route render={props =>} />)
    * @deprecated
    */
  var render: js.UndefOr[js.Function1[/* props */ FormikProps[Values], ReactNode]] = js.undefined
  /**
    * Validation function. Must return an error object or promise that
    * throws an error object where that object keys map to corresponding value.
    */
  var validate: js.UndefOr[
    js.Function1[/* values */ Values, Unit | js.Object | js.Promise[FormikErrors[Values]]]
  ] = js.undefined
  /**
    * A Yup Schema or a function that returns a Yup schema
    */
  var validationSchema: js.UndefOr[js.Any | js.Function0[_]] = js.undefined
  /**
    * Submission handler
    */
  def onSubmit(values: Values, formikHelpers: FormikHelpers[Values]): Unit | js.Promise[_]
}

object FormikConfig {
  @scala.inline
  def apply[Values](
    initialValues: Values,
    onSubmit: (Values, FormikHelpers[Values]) => Unit | js.Promise[_],
    children: (js.Function1[/* props */ FormikProps[Values], ReactNode]) | ReactNode = null,
    component: ComponentType[FormikProps[Values]] | ReactNode = null,
    enableReinitialize: js.UndefOr[Boolean] = js.undefined,
    initialErrors: FormikErrors[Values] = null,
    initialStatus: js.Any = null,
    initialTouched: FormikTouched[Values] = null,
    innerRef: /* instance */ js.Any => Unit = null,
    isInitialValid: Boolean | (js.Function1[js.Object, Boolean]) = null,
    onReset: (/* values */ Values, /* formikHelpers */ FormikHelpers[Values]) => Unit = null,
    render: /* props */ FormikProps[Values] => ReactNode = null,
    validate: /* values */ Values => Unit | js.Object | js.Promise[FormikErrors[Values]] = null,
    validateOnBlur: js.UndefOr[Boolean] = js.undefined,
    validateOnChange: js.UndefOr[Boolean] = js.undefined,
    validateOnMount: js.UndefOr[Boolean] = js.undefined,
    validationSchema: js.Any | js.Function0[_] = null
  ): FormikConfig[Values] = {
    val __obj = js.Dynamic.literal(initialValues = initialValues.asInstanceOf[js.Any], onSubmit = js.Any.fromFunction2(onSubmit))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(enableReinitialize)) __obj.updateDynamic("enableReinitialize")(enableReinitialize.get.asInstanceOf[js.Any])
    if (initialErrors != null) __obj.updateDynamic("initialErrors")(initialErrors.asInstanceOf[js.Any])
    if (initialStatus != null) __obj.updateDynamic("initialStatus")(initialStatus.asInstanceOf[js.Any])
    if (initialTouched != null) __obj.updateDynamic("initialTouched")(initialTouched.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (isInitialValid != null) __obj.updateDynamic("isInitialValid")(isInitialValid.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction2(onReset))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur.get.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnMount)) __obj.updateDynamic("validateOnMount")(validateOnMount.get.asInstanceOf[js.Any])
    if (validationSchema != null) __obj.updateDynamic("validationSchema")(validationSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormikConfig[Values]]
  }
}

