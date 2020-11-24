package typings.formik.fastFieldMod

import typings.formik.typesMod.FieldInputProps
import typings.formik.typesMod.FieldMetaProps
import typings.formik.typesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastFieldProps[V] extends js.Object {
  
  var field: FieldInputProps[V] = js.native
  
  var form: FormikProps[V] = js.native
  
  var meta: FieldMetaProps[V] = js.native
}
object FastFieldProps {
  
  @scala.inline
  def apply[V](field: FieldInputProps[V], form: FormikProps[V], meta: FieldMetaProps[V]): FastFieldProps[V] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastFieldProps[V]]
  }
  
  @scala.inline
  implicit class FastFieldPropsOps[Self <: FastFieldProps[_], V] (val x: Self with FastFieldProps[V]) extends AnyVal {
    
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
    def setForm(value: FormikProps[V]): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: FieldMetaProps[V]): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
}
