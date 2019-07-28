package typings.formik.distFastFieldMod

import typings.formik.Anon_E
import typings.formik.distTypesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastFieldProps[V] extends js.Object {
  var field: Anon_E
  var form: FormikProps[V]
}

object FastFieldProps {
  @scala.inline
  def apply[V](field: Anon_E, form: FormikProps[V]): FastFieldProps[V] = {
    val __obj = js.Dynamic.literal(field = field, form = form)
  
    __obj.asInstanceOf[FastFieldProps[V]]
  }
}

