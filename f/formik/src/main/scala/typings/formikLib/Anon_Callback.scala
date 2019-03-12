package typings
package formikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback[Values] extends js.Object {
  var dirty: scala.Boolean = js.native
  var error: js.UndefOr[js.Any] = js.native
  var errors: formikLib.distTypesMod.FormikErrors[Values] = js.native
  var initialValues: Values = js.native
  var isSubmitting: scala.Boolean = js.native
  var isValid: scala.Boolean = js.native
  var isValidating: scala.Boolean = js.native
  var status: js.UndefOr[js.Any] = js.native
  var submitCount: scala.Double = js.native
  var touched: formikLib.distTypesMod.FormikTouched[Values] = js.native
  var validateOnBlur: js.UndefOr[scala.Boolean] = js.native
  var validateOnChange: js.UndefOr[scala.Boolean] = js.native
  var values: Values = js.native
  def handleBlur(eventOrString: js.Any): scala.Unit | (js.Function1[/* e */ js.Any, scala.Unit]) = js.native
  def handleChange(eventOrPath: java.lang.String): scala.Unit | (js.Function1[
    /* eventOrTextValue */ java.lang.String | reactLib.reactMod.ReactNs.ChangeEvent[_], 
    scala.Unit
  ]) = js.native
  def handleChange(eventOrPath: reactLib.reactMod.ReactNs.ChangeEvent[_]): scala.Unit | (js.Function1[
    /* eventOrTextValue */ java.lang.String | reactLib.reactMod.ReactNs.ChangeEvent[_], 
    scala.Unit
  ]) = js.native
  def handleReset(): scala.Unit = js.native
  def handleSubmit(): scala.Unit = js.native
  def handleSubmit(e: reactLib.reactMod.ReactNs.FormEvent[stdLib.HTMLFormElement]): scala.Unit = js.native
  def registerField(name: java.lang.String, Comp: reactLib.reactMod.Component[_, js.Object, _]): scala.Unit = js.native
  def resetForm(): scala.Unit = js.native
  def resetForm(nextValues: Values): scala.Unit = js.native
  def setError(e: js.Any): scala.Unit = js.native
  def setErrors(errors: formikLib.distTypesMod.FormikErrors[Values]): scala.Unit = js.native
  def setFieldError(field: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def setFieldTouched(field: java.lang.String): scala.Unit = js.native
  def setFieldTouched(field: java.lang.String, isTouched: js.UndefOr[scala.Nothing], shouldValidate: scala.Boolean): scala.Unit = js.native
  def setFieldTouched(field: java.lang.String, isTouched: scala.Boolean): scala.Unit = js.native
  def setFieldTouched(field: java.lang.String, isTouched: scala.Boolean, shouldValidate: scala.Boolean): scala.Unit = js.native
  def setFieldValue(field: java.lang.String, value: js.Any): scala.Unit = js.native
  def setFieldValue(field: java.lang.String, value: js.Any, shouldValidate: scala.Boolean): scala.Unit = js.native
  def setFormikState[K /* <: formikLib.formikLibStrings.error | formikLib.formikLibStrings.values | formikLib.formikLibStrings.errors | formikLib.formikLibStrings.touched | formikLib.formikLibStrings.isValidating | formikLib.formikLibStrings.isSubmitting | formikLib.formikLibStrings.status | formikLib.formikLibStrings.submitCount */](
    f: js.Function2[
      /* prevState */ stdLib.Readonly[formikLib.distTypesMod.FormikState[Values]], 
      /* props */ js.Any, 
      stdLib.Pick[formikLib.distTypesMod.FormikState[Values], K]
    ]
  ): scala.Unit = js.native
  def setFormikState[K /* <: formikLib.formikLibStrings.error | formikLib.formikLibStrings.values | formikLib.formikLibStrings.errors | formikLib.formikLibStrings.touched | formikLib.formikLibStrings.isValidating | formikLib.formikLibStrings.isSubmitting | formikLib.formikLibStrings.status | formikLib.formikLibStrings.submitCount */](
    f: js.Function2[
      /* prevState */ stdLib.Readonly[formikLib.distTypesMod.FormikState[Values]], 
      /* props */ js.Any, 
      stdLib.Pick[formikLib.distTypesMod.FormikState[Values], K]
    ],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  def setFormikState[K /* <: formikLib.formikLibStrings.error | formikLib.formikLibStrings.values | formikLib.formikLibStrings.errors | formikLib.formikLibStrings.touched | formikLib.formikLibStrings.isValidating | formikLib.formikLibStrings.isSubmitting | formikLib.formikLibStrings.status | formikLib.formikLibStrings.submitCount */](state: stdLib.Pick[formikLib.distTypesMod.FormikState[Values], K]): scala.Unit = js.native
  def setFormikState[K /* <: formikLib.formikLibStrings.error | formikLib.formikLibStrings.values | formikLib.formikLibStrings.errors | formikLib.formikLibStrings.touched | formikLib.formikLibStrings.isValidating | formikLib.formikLibStrings.isSubmitting | formikLib.formikLibStrings.status | formikLib.formikLibStrings.submitCount */](state: stdLib.Pick[formikLib.distTypesMod.FormikState[Values], K], callback: js.Function0[_]): scala.Unit = js.native
  def setStatus(): scala.Unit = js.native
  def setStatus(status: js.Any): scala.Unit = js.native
  def setSubmitting(isSubmitting: scala.Boolean): scala.Unit = js.native
  def setTouched(touched: formikLib.distTypesMod.FormikTouched[Values]): scala.Unit = js.native
  def setValues(values: Values): scala.Unit = js.native
  def submitForm(): scala.Unit = js.native
  def unregisterField(name: java.lang.String): scala.Unit = js.native
  def validateField(field: java.lang.String): scala.Unit = js.native
  def validateForm(): js.Promise[formikLib.distTypesMod.FormikErrors[Values]] = js.native
  def validateForm(values: js.Any): js.Promise[formikLib.distTypesMod.FormikErrors[Values]] = js.native
}

