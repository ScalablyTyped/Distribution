package typings.formik.typesMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormikConfig[Values]
  extends FormikSharedConfig[js.Object] {
  /**
    * React children or child render callback
    */
  var children: js.UndefOr[(js.Function1[/* props */ FormikProps[Values], ReactNode]) | ReactNode] = js.native
  /**
    * Form component to render
    */
  var component: js.UndefOr[ComponentType[FormikProps[Values]] | ReactNode] = js.native
  /** Initial object map of field names to specific error for that field */
  var initialErrors: js.UndefOr[FormikErrors[Values]] = js.native
  /**
    * Initial status
    */
  var initialStatus: js.UndefOr[js.Any] = js.native
  /** Initial object map of field names to whether the field has been touched */
  var initialTouched: js.UndefOr[FormikTouched[Values]] = js.native
  /**
    * Initial values of the form
    */
  var initialValues: Values = js.native
  /** Inner ref */
  var innerRef: js.UndefOr[Ref[FormikProps[Values]]] = js.native
  /**
    * Reset handler
    */
  var onReset: js.UndefOr[
    js.Function2[/* values */ Values, /* formikHelpers */ FormikHelpers[Values], Unit]
  ] = js.native
  /**
    * Render prop (works like React router's <Route render={props =>} />)
    * @deprecated
    */
  var render: js.UndefOr[js.Function1[/* props */ FormikProps[Values], ReactNode]] = js.native
  /**
    * Validation function. Must return an error object or promise that
    * throws an error object where that object keys map to corresponding value.
    */
  var validate: js.UndefOr[
    js.Function1[/* values */ Values, Unit | js.Object | js.Promise[FormikErrors[Values]]]
  ] = js.native
  /**
    * A Yup Schema or a function that returns a Yup schema
    */
  var validationSchema: js.UndefOr[js.Any | js.Function0[_]] = js.native
  /**
    * Submission handler
    */
  def onSubmit(values: Values, formikHelpers: FormikHelpers[Values]): Unit | js.Promise[_] = js.native
}

object FormikConfig {
  @scala.inline
  def apply[Values](initialValues: Values, onSubmit: (Values, FormikHelpers[Values]) => Unit | js.Promise[_]): FormikConfig[Values] = {
    val __obj = js.Dynamic.literal(initialValues = initialValues.asInstanceOf[js.Any], onSubmit = js.Any.fromFunction2(onSubmit))
    __obj.asInstanceOf[FormikConfig[Values]]
  }
  @scala.inline
  implicit class FormikConfigOps[Self <: FormikConfig[_], Values] (val x: Self with FormikConfig[Values]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInitialValues(value: Values): Self = this.set("initialValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnSubmit(value: (Values, FormikHelpers[Values]) => Unit | js.Promise[_]): Self = this.set("onSubmit", js.Any.fromFunction2(value))
    @scala.inline
    def setChildrenFunction1(value: /* props */ FormikProps[Values] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: (js.Function1[/* props */ FormikProps[Values], ReactNode]) | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setComponent(value: ComponentType[FormikProps[Values]] | ReactNode): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setInitialErrors(value: FormikErrors[Values]): Self = this.set("initialErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialErrors: Self = this.set("initialErrors", js.undefined)
    @scala.inline
    def setInitialStatus(value: js.Any): Self = this.set("initialStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialStatus: Self = this.set("initialStatus", js.undefined)
    @scala.inline
    def setInitialTouched(value: FormikTouched[Values]): Self = this.set("initialTouched", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialTouched: Self = this.set("initialTouched", js.undefined)
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ FormikProps[Values] | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: Ref[FormikProps[Values]]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    @scala.inline
    def setOnReset(value: (/* values */ Values, /* formikHelpers */ FormikHelpers[Values]) => Unit): Self = this.set("onReset", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    @scala.inline
    def setRender(value: /* props */ FormikProps[Values] => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setValidate(value: /* values */ Values => Unit | js.Object | js.Promise[FormikErrors[Values]]): Self = this.set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    @scala.inline
    def setValidationSchemaFunction0(value: () => _): Self = this.set("validationSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setValidationSchema(value: js.Any | js.Function0[_]): Self = this.set("validationSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationSchema: Self = this.set("validationSchema", js.undefined)
  }
  
}

