package typings.forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonField extends js.Object {
  var field: js.UndefOr[js.Array[String]] = js.undefined
  var label: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonField {
  @scala.inline
  def apply(field: js.Array[String] = null, label: js.Array[String] = null): AnonField = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonField]
  }
}

