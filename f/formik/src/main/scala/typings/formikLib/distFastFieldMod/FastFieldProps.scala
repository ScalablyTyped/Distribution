package typings
package formikLib.distFastFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastFieldProps[V] extends js.Object {
  var field: formikLib.Anon_E
  var form: formikLib.distTypesMod.FormikProps[V]
}

object FastFieldProps {
  @scala.inline
  def apply[V](field: formikLib.Anon_E, form: formikLib.distTypesMod.FormikProps[V]): FastFieldProps[V] = {
    val __obj = js.Dynamic.literal(field = field, form = form)
  
    __obj.asInstanceOf[FastFieldProps[V]]
  }
}

