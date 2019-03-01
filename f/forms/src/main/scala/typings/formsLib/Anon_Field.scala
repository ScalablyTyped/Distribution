package typings
package formsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Field extends js.Object {
  var field: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var label: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Field {
  @scala.inline
  def apply(field: js.Array[java.lang.String] = null, label: js.Array[java.lang.String] = null): Anon_Field = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_Field]
  }
}

