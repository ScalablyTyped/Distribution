package typings.forms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var field: js.UndefOr[js.Array[String]] = js.undefined
  var label: js.UndefOr[js.Array[String]] = js.undefined
}

object Field {
  @scala.inline
  def apply(field: js.Array[String] = null, label: js.Array[String] = null): Field = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

