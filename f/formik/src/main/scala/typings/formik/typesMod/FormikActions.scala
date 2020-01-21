package typings.formik.typesMod

import typings.formik.formikStrings.error
import typings.formik.formikStrings.errors
import typings.formik.formikStrings.isSubmitting
import typings.formik.formikStrings.isValidating
import typings.formik.formikStrings.status
import typings.formik.formikStrings.submitCount
import typings.formik.formikStrings.touched
import typings.formik.formikStrings.values
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormikActions[Values] extends js.Object {
  def resetForm(): Unit = js.native
  def resetForm(nextValues: Values): Unit = js.native
  def setError(e: js.Any): Unit = js.native
  def setErrors(errors: FormikErrors[Values]): Unit = js.native
  def setFieldError(field: String, message: String): Unit = js.native
  def setFieldTouched(field: String): Unit = js.native
  def setFieldTouched(field: String, isTouched: Boolean): Unit = js.native
  def setFieldTouched(field: String, isTouched: Boolean, shouldValidate: Boolean): Unit = js.native
  def setFieldValue(field: String, value: js.Any): Unit = js.native
  def setFieldValue(field: String, value: js.Any, shouldValidate: Boolean): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_error(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], error]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_error(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], error]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_error(state: Pick[FormikState[Values], error]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_error(state: Pick[FormikState[Values], error], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_errors(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], errors]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_errors(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], errors]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_errors(state: Pick[FormikState[Values], errors]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_errors(state: Pick[FormikState[Values], errors], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isSubmitting(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], isSubmitting]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isSubmitting(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], isSubmitting]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isSubmitting(state: Pick[FormikState[Values], isSubmitting]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isSubmitting(state: Pick[FormikState[Values], isSubmitting], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isValidating(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], isValidating]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isValidating(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], isValidating]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isValidating(state: Pick[FormikState[Values], isValidating]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_isValidating(state: Pick[FormikState[Values], isValidating], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_status(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], status]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_status(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], status]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_status(state: Pick[FormikState[Values], status]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_status(state: Pick[FormikState[Values], status], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_submitCount(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], submitCount]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_submitCount(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], submitCount]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_submitCount(state: Pick[FormikState[Values], submitCount]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_submitCount(state: Pick[FormikState[Values], submitCount], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_touched(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], touched]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_touched(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], touched]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_touched(state: Pick[FormikState[Values], touched]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_touched(state: Pick[FormikState[Values], touched], callback: js.Function0[_]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_values(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], values]
    ]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_values(
    f: js.Function2[
      /* prevState */ FormikState[Values], 
      /* props */ js.Any, 
      Pick[FormikState[Values], values]
    ],
    callback: js.Function0[_]
  ): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_values(state: Pick[FormikState[Values], values]): Unit = js.native
  @JSName("setFormikState")
  def setFormikState_values(state: Pick[FormikState[Values], values], callback: js.Function0[_]): Unit = js.native
  def setStatus(): Unit = js.native
  def setStatus(status: js.Any): Unit = js.native
  def setSubmitting(isSubmitting: Boolean): Unit = js.native
  def setTouched(touched: FormikTouched[Values]): Unit = js.native
  def setValues(values: Values): Unit = js.native
  def submitForm(): Unit = js.native
  def validateField(field: String): Unit = js.native
  def validateForm(): js.Promise[FormikErrors[Values]] = js.native
  def validateForm(values: js.Any): js.Promise[FormikErrors[Values]] = js.native
}

