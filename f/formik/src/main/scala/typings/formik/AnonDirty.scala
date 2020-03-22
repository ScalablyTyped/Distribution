package typings.formik

import typings.formik.typesMod.FieldHelperProps
import typings.formik.typesMod.FieldInputProps
import typings.formik.typesMod.FieldMetaProps
import typings.formik.typesMod.FormikErrors
import typings.formik.typesMod.FormikState
import typings.formik.typesMod.FormikTouched
import typings.formik.typesMod.FormikValues
import typings.react.mod.ChangeEvent
import typings.react.mod.FormEvent
import typings.std.HTMLFormElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDirty[Values /* <: FormikValues */] extends js.Object {
  var dirty: Boolean = js.native
  var errors: FormikErrors[Values] = js.native
  var initialErrors: FormikErrors[_] = js.native
  var initialStatus: js.Any = js.native
  var initialTouched: FormikTouched[_] = js.native
  var initialValues: Values = js.native
  var isSubmitting: Boolean = js.native
  var isValid: Boolean = js.native
  var isValidating: Boolean = js.native
  var status: js.UndefOr[js.Any] = js.native
  var submitCount: Double = js.native
  var touched: FormikTouched[Values] = js.native
  var validateOnBlur: Boolean = js.native
  var validateOnChange: Boolean = js.native
  var validateOnMount: Boolean = js.native
  var values: Values = js.native
  def getFieldHelpers(name: String): FieldHelperProps[_] = js.native
  def getFieldMeta(name: String): FieldMetaProps[_] = js.native
  def getFieldProps(nameOrOptions: js.Any): FieldInputProps[_] = js.native
  def handleBlur(eventOrString: js.Any): Unit | (js.Function1[/* e */ js.Any, Unit]) = js.native
  def handleChange(eventOrPath: String): Unit | (js.Function1[/* eventOrTextValue */ String | ChangeEvent[_], Unit]) = js.native
  def handleChange(eventOrPath: ChangeEvent[_]): Unit | (js.Function1[/* eventOrTextValue */ String | ChangeEvent[_], Unit]) = js.native
  def handleReset(e: js.Any): Unit = js.native
  def handleSubmit(): Unit = js.native
  def handleSubmit(e: FormEvent[HTMLFormElement]): Unit = js.native
  def registerField(name: String, hasValidate: js.Any): Unit = js.native
  def resetForm(): Unit = js.native
  def resetForm(nextState: Partial[FormikState[Values]]): Unit = js.native
  def setErrors(errors: FormikErrors[Values]): Unit = js.native
  def setFieldError(field: String): Unit = js.native
  def setFieldError(field: String, value: String): Unit = js.native
  def setFieldTouched(field: String): js.Any = js.native
  def setFieldTouched(field: String, touched: Boolean): js.Any = js.native
  def setFieldTouched(field: String, touched: Boolean, shouldValidate: Boolean): js.Any = js.native
  def setFieldValue(field: String, value: js.Any): js.Any = js.native
  def setFieldValue(field: String, value: js.Any, shouldValidate: Boolean): js.Any = js.native
  def setFormikState(stateOrCb: js.Function1[/* state */ FormikState[Values], FormikState[Values]]): Unit = js.native
  def setFormikState(stateOrCb: FormikState[Values]): Unit = js.native
  def setStatus(status: js.Any): Unit = js.native
  def setSubmitting(isSubmitting: Boolean): Unit = js.native
  def setTouched(touched: FormikTouched[Values]): js.Any = js.native
  def setTouched(touched: FormikTouched[Values], shouldValidate: Boolean): js.Any = js.native
  def setValues(values: Values): js.Any = js.native
  def setValues(values: Values, shouldValidate: Boolean): js.Any = js.native
  def submitForm(): js.Promise[js.UndefOr[Unit]] = js.native
  def unregisterField(name: String): Unit = js.native
  def validateField(name: String): js.Promise[js.UndefOr[String | Unit]] = js.native
  def validateForm(): js.Promise[FormikErrors[Values]] = js.native
  def validateForm(values: Values): js.Promise[FormikErrors[Values]] = js.native
}

