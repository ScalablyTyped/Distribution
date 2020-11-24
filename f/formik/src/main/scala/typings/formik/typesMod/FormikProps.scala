package typings.formik.typesMod

import typings.formik.anon.Validate
import typings.react.mod.ChangeEvent
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.SetStateAction
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLFormElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined formik.formik/dist/types.FormikSharedConfig<{}> & formik.formik/dist/types.FormikState<Values> & formik.formik/dist/types.FormikHelpers<Values> & formik.formik/dist/types.FormikHandlers & formik.formik/dist/types.FormikComputedProps<Values> & formik.formik/dist/types.FormikRegistration & {submitForm (): std.Promise<any>} */
@js.native
trait FormikProps[Values] extends js.Object {
  
  /** True if any input has been touched. False otherwise. */
  val dirty: Boolean = js.native
  
  /** Should Formik reset the form when new initialValues change */
  var enableReinitialize: js.UndefOr[Boolean] = js.native
  
  /** map of field names to specific error for that field */
  var errors: FormikErrors[Values] = js.native
  
  def getFieldHelpers[Value](name: String): FieldHelperProps[Value] = js.native
  
  def getFieldMeta[Value](name: String): FieldMetaProps[Value] = js.native
  
  def getFieldProps[Value](props: js.Any): FieldInputProps[Value] = js.native
  
  def handleBlur(e: FocusEvent[_]): Unit = js.native
  def handleBlur[T](fieldOrEvent: T): Unit | (js.Function1[/* e */ js.Any, Unit]) = js.native
  
  def handleChange(e: ChangeEvent[_]): Unit = js.native
  def handleChange[T](field: T): (js.Function1[/* e */ String | ChangeEvent[_], Unit]) | Unit = js.native
  
  /** Reset form event handler  */
  def handleReset(): Unit = js.native
  def handleReset(e: SyntheticEvent[_, Event]): Unit = js.native
  
  /** Form submit handler */
  def handleSubmit(): Unit = js.native
  def handleSubmit(e: FormEvent[HTMLFormElement]): Unit = js.native
  
  /** The initial errors of the form */
  val initialErrors: FormikErrors[Values] = js.native
  
  /** The initial status of the form */
  val initialStatus: js.UndefOr[js.Any] = js.native
  
  /** The initial visited fields of the form */
  val initialTouched: FormikTouched[Values] = js.native
  
  /** The initial values of the form */
  val initialValues: Values = js.native
  
  /** Tell Formik if initial form values are valid or not on first render */
  var isInitialValid: js.UndefOr[Boolean | (js.Function1[/* props */ js.Object, Boolean])] = js.native
  
  /** whether the form is currently submitting */
  var isSubmitting: Boolean = js.native
  
  /** True if state.errors is empty */
  val isValid: Boolean = js.native
  
  /** whether the form is currently validating (prior to submission) */
  var isValidating: Boolean = js.native
  
  def registerField(name: String, fns: Validate): Unit = js.native
  
  /** Reset form */
  def resetForm(): Unit = js.native
  def resetForm(nextState: Partial[FormikState[Values]]): Unit = js.native
  
  /** Manually set errors object */
  def setErrors(errors: FormikErrors[Values]): Unit = js.native
  
  /** Set error message of a form field directly */
  def setFieldError(field: String, message: String): Unit = js.native
  
  /** Set whether field has been touched directly */
  def setFieldTouched(field: String): Unit = js.native
  def setFieldTouched(field: String, isTouched: js.UndefOr[scala.Nothing], shouldValidate: Boolean): Unit = js.native
  def setFieldTouched(field: String, isTouched: Boolean): Unit = js.native
  def setFieldTouched(field: String, isTouched: Boolean, shouldValidate: Boolean): Unit = js.native
  
  /** Set value of form field directly */
  def setFieldValue(field: String, value: js.Any): Unit = js.native
  def setFieldValue(field: String, value: js.Any, shouldValidate: Boolean): Unit = js.native
  
  def setFormikState(f: js.Function1[/* prevState */ FormikState[Values], FormikState[Values]]): Unit = js.native
  def setFormikState(f: js.Function1[/* prevState */ FormikState[Values], FormikState[Values]], cb: js.Function0[Unit]): Unit = js.native
  /** Set Formik state, careful! */
  def setFormikState(f: FormikState[Values]): Unit = js.native
  def setFormikState(f: FormikState[Values], cb: js.Function0[Unit]): Unit = js.native
  
  /** Manually set top level status. */
  def setStatus(): Unit = js.native
  def setStatus(status: js.Any): Unit = js.native
  
  /** Manually set isSubmitting */
  def setSubmitting(isSubmitting: Boolean): Unit = js.native
  
  /** Manually set touched object */
  def setTouched(touched: FormikTouched[Values]): Unit = js.native
  def setTouched(touched: FormikTouched[Values], shouldValidate: Boolean): Unit = js.native
  
  /** Manually set values object  */
  def setValues(values: SetStateAction[Values]): Unit = js.native
  def setValues(values: SetStateAction[Values], shouldValidate: Boolean): Unit = js.native
  
  /** Top level status state, in case you need it */
  var status: js.UndefOr[js.Any] = js.native
  
  /** Number of times user tried to submit the form */
  var submitCount: Double = js.native
  
  /** Submit the form imperatively */
  def submitForm(): js.Promise[Unit] = js.native
  
  /** map of field names to whether the field has been touched */
  var touched: FormikTouched[Values] = js.native
  
  def unregisterField(name: String): Unit = js.native
  
  /** Validate field value */
  def validateField(field: String): Unit = js.native
  
  /** Validate form values */
  def validateForm(): js.Promise[FormikErrors[Values]] = js.native
  def validateForm(values: js.Any): js.Promise[FormikErrors[Values]] = js.native
  
  /** Tells Formik to validate the form on each input's onBlur event */
  var validateOnBlur: js.UndefOr[Boolean] = js.native
  
  /** Tells Formik to validate the form on each input's onChange event */
  var validateOnChange: js.UndefOr[Boolean] = js.native
  
  /** Tells Formik to validate upon mount */
  var validateOnMount: js.UndefOr[Boolean] = js.native
  
  /** Form values */
  var values: Values = js.native
}
