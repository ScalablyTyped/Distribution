package typings.formik.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldHelperProps[Value] extends js.Object {
  /** Set the field's error value */
  def setError(value: Value): Unit
  /** Set the field's touched value */
  def setTouched(value: Boolean): Unit
  /** Set the field's value */
  def setValue(value: Value): Unit
}

object FieldHelperProps {
  @scala.inline
  def apply[Value](setError: Value => Unit, setTouched: Boolean => Unit, setValue: Value => Unit): FieldHelperProps[Value] = {
    val __obj = js.Dynamic.literal(setError = js.Any.fromFunction1(setError), setTouched = js.Any.fromFunction1(setTouched), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[FieldHelperProps[Value]]
  }
}

