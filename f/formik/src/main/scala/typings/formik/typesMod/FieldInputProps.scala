package typings.formik.typesMod

import typings.formik.anon.FnCall
import typings.formik.anon.FnCallE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldInputProps[Value] extends js.Object {
  /** Is the field checked? */
  var checked: js.UndefOr[Boolean] = js.native
  /** Multiple select? */
  var multiple: js.UndefOr[Boolean] = js.native
  /** Name of the field */
  var name: String = js.native
  /** Blur event handler */
  var onBlur: FnCallE = js.native
  /** Change event handler */
  var onChange: FnCall = js.native
  /** Value of the field */
  var value: Value = js.native
}

object FieldInputProps {
  @scala.inline
  def apply[Value](name: String, onBlur: FnCallE, onChange: FnCall, value: Value): FieldInputProps[Value] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInputProps[Value]]
  }
  @scala.inline
  implicit class FieldInputPropsOps[Self <: FieldInputProps[_], Value] (val x: Self with FieldInputProps[Value]) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBlur(value: FnCallE): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: FnCall): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
  }
  
}

