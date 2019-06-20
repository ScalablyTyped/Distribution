package typings
package formikLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormikActions[Values] extends js.Object {
  def resetForm(): scala.Unit = js.native
  def resetForm(nextValues: Values): scala.Unit = js.native
  def setError(e: js.Any): scala.Unit = js.native
  def setErrors(errors: FormikErrors[Values]): scala.Unit = js.native
  def setFieldError(field: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def setFieldTouched(field: java.lang.String): scala.Unit = js.native
  def setFieldTouched(field: java.lang.String, isTouched: scala.Boolean): scala.Unit = js.native
  def setFieldTouched(field: java.lang.String, isTouched: scala.Boolean, shouldValidate: scala.Boolean): scala.Unit = js.native
  def setFieldValue(field: java.lang.String, value: js.Any): scala.Unit = js.native
  def setFieldValue(field: java.lang.String, value: js.Any, shouldValidate: scala.Boolean): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_error(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.error]
    ]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_error(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.error]
    ],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_error(state: stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.error]): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_error(
    state: stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.error],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_errors(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.errors]
    ]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_errors(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.errors]
    ],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_errors(state: stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.errors]): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_errors(
    state: stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.errors],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isSubmitting(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.isSubmitting]
    ]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isSubmitting(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.isSubmitting]
    ],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isSubmitting(state: stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.isSubmitting]): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isSubmitting(
    state: stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.isSubmitting],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isValidating(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.isValidating]
    ]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isValidating(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.isValidating]
    ],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isValidating(state: stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.isValidating]): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isValidating(
    state: stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.isValidating],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_status(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.status]
    ]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_status(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.status]
    ],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_status(state: stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.status]): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_status(
    state: stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.status],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_submitCount(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.submitCount]
    ]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_submitCount(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.submitCount]
    ],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_submitCount(state: stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.submitCount]): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_submitCount(
    state: stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.submitCount],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_touched(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.touched]
    ]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_touched(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.touched]
    ],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_touched(state: stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.touched]): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_touched(
    state: stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.touched],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_values(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.values]
    ]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_values(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.values]
    ],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_values(state: stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.values]): scala.Unit = js.native
  @JSName("setFormikState")
  def setFormikState_values(
    state: stdLib.Pick[FormikState[Values], formikLib.formikLibStrings.values],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  def setStatus(): scala.Unit = js.native
  def setStatus(status: js.Any): scala.Unit = js.native
  def setSubmitting(isSubmitting: scala.Boolean): scala.Unit = js.native
  def setTouched(touched: FormikTouched[Values]): scala.Unit = js.native
  def setValues(values: Values): scala.Unit = js.native
  def submitForm(): scala.Unit = js.native
  def validateField(field: java.lang.String): scala.Unit = js.native
  def validateForm(): js.Promise[FormikErrors[Values]] = js.native
  def validateForm(values: js.Any): js.Promise[FormikErrors[Values]] = js.native
}

