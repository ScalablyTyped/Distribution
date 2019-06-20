package typings
package formikLib.distFormikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/Formik", "Formik")
@js.native
class Formik[Values] protected ()
  extends reactLib.reactMod.Component[
      formikLib.distTypesMod.FormikConfig[Values], 
      formikLib.distTypesMod.FormikState[Values], 
      js.Any
    ] {
  def this(props: formikLib.distTypesMod.FormikConfig[Values]) = this()
  var didMount: scala.Boolean = js.native
  var fields: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.Component[_, js.Object, _]] = js.native
  var hbCache: org.scalablytyped.runtime.StringDictionary[js.Function1[/* e */ js.Any, scala.Unit]] = js.native
  var hcCache: org.scalablytyped.runtime.StringDictionary[js.Function1[/* e */ js.Any | reactLib.reactMod.ChangeEvent[_], scala.Unit]] = js.native
  var initialValues: Values = js.native
  var validator: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MFormik(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MFormik(prevProps: formikLib.distTypesMod.FormikConfig[Values]): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MFormik(): scala.Unit = js.native
  def executeSubmit(): scala.Unit = js.native
  def getFormikActions(): formikLib.distTypesMod.FormikActions[Values] = js.native
  def getFormikBag(): formikLib.Anon_Callback[Values] = js.native
  def getFormikComputedProps(): formikLib.Anon_Dirty[Values] = js.native
  def getFormikContext(): formikLib.Anon_CallbackComp[Values] = js.native
  def handleBlur(eventOrPath: java.lang.String): scala.Unit | (js.Function1[/* e */ js.UndefOr[reactLib.reactMod.FocusEvent[_]], scala.Unit]) = js.native
  def handleBlur(eventOrPath: reactLib.reactMod.FocusEvent[_]): scala.Unit | (js.Function1[/* e */ js.UndefOr[reactLib.reactMod.FocusEvent[_]], scala.Unit]) = js.native
  def handleChange(eventOrPath: java.lang.String): scala.Unit | (js.Function1[/* eventOrValue */ js.Any, scala.Unit]) = js.native
  def handleChange(eventOrPath: reactLib.reactMod.ChangeEvent[_]): scala.Unit | (js.Function1[/* eventOrValue */ js.Any, scala.Unit]) = js.native
  def handleReset(): scala.Unit = js.native
  def handleSubmit(): scala.Unit = js.native
  def handleSubmit(e: reactLib.reactMod.FormEvent[stdLib.HTMLFormElement]): scala.Unit = js.native
  def registerField(name: java.lang.String, Comp: reactLib.reactMod.Component[_, js.Object, _]): scala.Unit = js.native
  def resetForm(): scala.Unit = js.native
  def resetForm(nextValues: Values): scala.Unit = js.native
  def runFieldLevelValidations(values: formikLib.distTypesMod.FormikValues): js.Promise[formikLib.distTypesMod.FormikErrors[Values]] = js.native
  def runSingleFieldLevelValidation(field: java.lang.String, value: java.lang.String): js.Promise[java.lang.String] = js.native
  def runSingleFieldLevelValidation(field: java.lang.String, value: scala.Unit): js.Promise[java.lang.String] = js.native
  def runValidateHandler(values: formikLib.distTypesMod.FormikValues): js.Promise[formikLib.distTypesMod.FormikErrors[Values]] = js.native
  def runValidationSchema(values: formikLib.distTypesMod.FormikValues): js.Promise[js.Object] = js.native
  def runValidations(): js.Promise[formikLib.distTypesMod.FormikErrors[Values]] = js.native
  def runValidations(values: formikLib.distTypesMod.FormikValues): js.Promise[formikLib.distTypesMod.FormikErrors[Values]] = js.native
  def setError(error: js.Any): scala.Unit = js.native
  def setErrors(errors: formikLib.distTypesMod.FormikErrors[Values]): scala.Unit = js.native
  def setFieldError(field: java.lang.String): scala.Unit = js.native
  def setFieldError(field: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def setFieldTouched(field: java.lang.String): scala.Unit = js.native
  def setFieldTouched(field: java.lang.String, touched: scala.Boolean): scala.Unit = js.native
  def setFieldTouched(field: java.lang.String, touched: scala.Boolean, shouldValidate: scala.Boolean): scala.Unit = js.native
  def setFieldValue(field: java.lang.String, value: js.Any): scala.Unit = js.native
  def setFieldValue(field: java.lang.String, value: js.Any, shouldValidate: scala.Boolean): scala.Unit = js.native
  def setFormikState(s: js.Any): scala.Unit = js.native
  def setFormikState(s: js.Any, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setStatus(): scala.Unit = js.native
  def setStatus(status: js.Any): scala.Unit = js.native
  def setSubmitting(isSubmitting: scala.Boolean): scala.Unit = js.native
  def setTouched(touched: formikLib.distTypesMod.FormikTouched[Values]): scala.Unit = js.native
  def setValues(values: Values): scala.Unit = js.native
  def submitForm(): js.Promise[scala.Unit] = js.native
  def unregisterField(name: java.lang.String): scala.Unit = js.native
  def validateField(field: java.lang.String): js.Promise[js.Object] = js.native
  def validateForm(values: Values): js.Promise[formikLib.distTypesMod.FormikErrors[Values]] = js.native
}

/* static members */
@JSImport("formik/dist/Formik", "Formik")
@js.native
object Formik extends js.Object {
  var defaultProps: formikLib.Anon_EnableReinitialize = js.native
}

