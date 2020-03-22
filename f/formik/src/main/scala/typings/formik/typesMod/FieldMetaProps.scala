package typings.formik.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldMetaProps[Value] extends js.Object {
  /** Error message of the field */
  var error: js.UndefOr[String] = js.undefined
  /** Initial error message of the field */
  var initialError: js.UndefOr[String] = js.undefined
  /** Initial touched state of the field */
  var initialTouched: Boolean
  /** Initial value of the field */
  var initialValue: js.UndefOr[Value] = js.undefined
  /** Has the field been visited? */
  var touched: Boolean
  /** Value of the field */
  var value: Value
}

object FieldMetaProps {
  @scala.inline
  def apply[Value](
    initialTouched: Boolean,
    touched: Boolean,
    value: Value,
    error: String = null,
    initialError: String = null,
    initialValue: Value = null
  ): FieldMetaProps[Value] = {
    val __obj = js.Dynamic.literal(initialTouched = initialTouched.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (initialError != null) __obj.updateDynamic("initialError")(initialError.asInstanceOf[js.Any])
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldMetaProps[Value]]
  }
}

