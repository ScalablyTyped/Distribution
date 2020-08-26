package typings.formik.fieldMod

import typings.formik.typesMod.FieldInputProps
import typings.formik.typesMod.FieldMetaProps
import typings.formik.typesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldProps[V, FormValues] extends js.Object {
  var field: FieldInputProps[V] = js.native
  var form: FormikProps[FormValues] = js.native
  var meta: FieldMetaProps[V] = js.native
}

object FieldProps {
  @scala.inline
  def apply[V, FormValues](field: FieldInputProps[V], form: FormikProps[FormValues], meta: FieldMetaProps[V]): FieldProps[V, FormValues] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldProps[V, FormValues]]
  }
  @scala.inline
  implicit class FieldPropsOps[Self <: FieldProps[_, _], V, FormValues] (val x: Self with (FieldProps[V, FormValues])) extends AnyVal {
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
    def setField(value: FieldInputProps[V]): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setForm(value: FormikProps[FormValues]): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: FieldMetaProps[V]): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
  
}

