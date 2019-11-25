package typings.formik.distFieldMod

import typings.formik.Anon_Name
import typings.formik.distTypesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldProps[V] extends js.Object {
  var field: Anon_Name
  var form: FormikProps[V]
}

object FieldProps {
  @scala.inline
  def apply[V](field: Anon_Name, form: FormikProps[V]): FieldProps[V] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldProps[V]]
  }
}

