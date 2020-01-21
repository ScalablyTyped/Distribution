package typings.formik.fastFieldMod

import typings.formik.AnonE
import typings.formik.typesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastFieldProps[V] extends js.Object {
  var field: AnonE
  var form: FormikProps[V]
}

object FastFieldProps {
  @scala.inline
  def apply[V](field: AnonE, form: FormikProps[V]): FastFieldProps[V] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FastFieldProps[V]]
  }
}

