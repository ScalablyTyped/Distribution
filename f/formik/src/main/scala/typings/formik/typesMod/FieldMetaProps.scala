package typings.formik.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldMetaProps[Value] extends js.Object {
  /** Error message of the field */
  var error: js.UndefOr[String] = js.native
  /** Initial error message of the field */
  var initialError: js.UndefOr[String] = js.native
  /** Initial touched state of the field */
  var initialTouched: Boolean = js.native
  /** Initial value of the field */
  var initialValue: js.UndefOr[Value] = js.native
  /** Has the field been visited? */
  var touched: Boolean = js.native
  /** Value of the field */
  var value: Value = js.native
}

object FieldMetaProps {
  @scala.inline
  def apply[Value](initialTouched: Boolean, touched: Boolean, value: Value): FieldMetaProps[Value] = {
    val __obj = js.Dynamic.literal(initialTouched = initialTouched.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldMetaProps[Value]]
  }
  @scala.inline
  implicit class FieldMetaPropsOps[Self <: FieldMetaProps[_], Value] (val x: Self with FieldMetaProps[Value]) extends AnyVal {
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
    def setInitialTouched(value: Boolean): Self = this.set("initialTouched", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouched(value: Boolean): Self = this.set("touched", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setInitialError(value: String): Self = this.set("initialError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialError: Self = this.set("initialError", js.undefined)
    @scala.inline
    def setInitialValue(value: Value): Self = this.set("initialValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialValue: Self = this.set("initialValue", js.undefined)
  }
  
}

