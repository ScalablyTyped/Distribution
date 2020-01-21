package typings.formik.fieldMod

import typings.formik.AnonName
import typings.formik.typesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldProps[V] extends js.Object {
  var field: AnonName
  var form: FormikProps[V]
}

object FieldProps {
  @scala.inline
  def apply[V](field: AnonName, form: FormikProps[V]): FieldProps[V] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldProps[V]]
  }
}

