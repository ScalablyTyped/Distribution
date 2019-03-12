package typings
package formikLib.distFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldProps[V] extends js.Object {
  var field: formikLib.Anon_EField
  var form: formikLib.distTypesMod.FormikProps[V]
}

object FieldProps {
  @scala.inline
  def apply[V](field: formikLib.Anon_EField, form: formikLib.distTypesMod.FormikProps[V]): FieldProps[V] = {
    val __obj = js.Dynamic.literal(field = field, form = form)
  
    __obj.asInstanceOf[FieldProps[V]]
  }
}

