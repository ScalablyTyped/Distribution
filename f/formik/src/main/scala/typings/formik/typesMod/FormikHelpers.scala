package typings.formik.typesMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormikHelpers[Values] extends js.Object {
  /** Reset form */
  def resetForm(): Unit = js.native
  def resetForm(nextState: Partial[FormikState[Values]]): Unit = js.native
  /** Manually set errors object */
  def setErrors(errors: FormikErrors[Values]): Unit = js.native
  /** Set error message of a form field directly */
  def setFieldError(field: String, message: String): Unit = js.native
  /** Set whether field has been touched directly */
  def setFieldTouched(field: String): Unit = js.native
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
  def setValues(values: Values): Unit = js.native
  def setValues(values: Values, shouldValidate: Boolean): Unit = js.native
  /** Submit the form imperatively */
  def submitForm(): js.Promise[Unit] = js.native
  /** Validate field value */
  def validateField(field: String): Unit = js.native
  /** Validate form values */
  def validateForm(): js.Promise[FormikErrors[Values]] = js.native
  def validateForm(values: js.Any): js.Promise[FormikErrors[Values]] = js.native
}

