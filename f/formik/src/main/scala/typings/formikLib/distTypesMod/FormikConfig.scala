package typings
package formikLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikConfig[Values]
  extends FormikSharedConfig[js.Object] {
  var children: js.UndefOr[
    (js.Function1[/* props */ FormikProps[Values], reactLib.reactMod.ReactNode]) | reactLib.reactMod.ReactNode
  ] = js.undefined
  var component: js.UndefOr[
    reactLib.reactMod.ComponentType[FormikProps[Values]] | reactLib.reactMod.ReactNode
  ] = js.undefined
  var initialStatus: js.UndefOr[js.Any] = js.undefined
  var initialValues: Values
  var onReset: js.UndefOr[
    js.Function2[/* values */ Values, /* formikActions */ FormikActions[Values], scala.Unit]
  ] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ FormikProps[Values], reactLib.reactMod.ReactNode]] = js.undefined
  var validate: js.UndefOr[
    js.Function1[/* values */ Values, scala.Unit | js.Object | js.Promise[FormikErrors[Values]]]
  ] = js.undefined
  var validationSchema: js.UndefOr[js.Any | js.Function0[_]] = js.undefined
  def onSubmit(values: Values, formikActions: FormikActions[Values]): scala.Unit
}

object FormikConfig {
  @scala.inline
  def apply[Values](
    initialValues: Values,
    onSubmit: (Values, FormikActions[Values]) => scala.Unit,
    children: (js.Function1[/* props */ FormikProps[Values], reactLib.reactMod.ReactNode]) | reactLib.reactMod.ReactNode = null,
    component: reactLib.reactMod.ComponentType[FormikProps[Values]] | reactLib.reactMod.ReactNode = null,
    enableReinitialize: js.UndefOr[scala.Boolean] = js.undefined,
    initialStatus: js.Any = null,
    isInitialValid: scala.Boolean | (js.Function1[js.Object, scala.Boolean]) = null,
    onReset: (/* values */ Values, /* formikActions */ FormikActions[Values]) => scala.Unit = null,
    render: /* props */ FormikProps[Values] => reactLib.reactMod.ReactNode = null,
    validate: /* values */ Values => scala.Unit | js.Object | js.Promise[FormikErrors[Values]] = null,
    validateOnBlur: js.UndefOr[scala.Boolean] = js.undefined,
    validateOnChange: js.UndefOr[scala.Boolean] = js.undefined,
    validationSchema: js.Any | js.Function0[_] = null
  ): FormikConfig[Values] = {
    val __obj = js.Dynamic.literal(initialValues = initialValues.asInstanceOf[js.Any], onSubmit = js.Any.fromFunction2(onSubmit))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(enableReinitialize)) __obj.updateDynamic("enableReinitialize")(enableReinitialize)
    if (initialStatus != null) __obj.updateDynamic("initialStatus")(initialStatus)
    if (isInitialValid != null) __obj.updateDynamic("isInitialValid")(isInitialValid.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction2(onReset))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur)
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange)
    if (validationSchema != null) __obj.updateDynamic("validationSchema")(validationSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormikConfig[Values]]
  }
}

