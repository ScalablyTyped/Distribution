package typings.formik.fieldMod

import typings.formik.typesMod.FieldInputProps
import typings.formik.typesMod.FieldMetaProps
import typings.formik.typesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldProps[V, FormValues] extends js.Object {
  var field: FieldInputProps[V]
  var form: FormikProps[FormValues]
  var meta: FieldMetaProps[V]
}

object FieldProps {
  @scala.inline
  def apply[V, FormValues](field: FieldInputProps[V], form: FormikProps[FormValues], meta: FieldMetaProps[V]): FieldProps[V, FormValues] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldProps[V, FormValues]]
  }
}

