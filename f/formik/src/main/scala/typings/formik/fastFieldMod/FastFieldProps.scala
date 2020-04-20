package typings.formik.fastFieldMod

import typings.formik.typesMod.FieldInputProps
import typings.formik.typesMod.FieldMetaProps
import typings.formik.typesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastFieldProps[V] extends js.Object {
  var field: FieldInputProps[V]
  var form: FormikProps[V]
  var meta: FieldMetaProps[V]
}

object FastFieldProps {
  @scala.inline
  def apply[V](field: FieldInputProps[V], form: FormikProps[V], meta: FieldMetaProps[V]): FastFieldProps[V] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastFieldProps[V]]
  }
}

