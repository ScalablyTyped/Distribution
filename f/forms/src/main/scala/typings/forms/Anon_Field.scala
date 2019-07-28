package typings.forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Field extends js.Object {
  var field: js.UndefOr[js.Array[String]] = js.undefined
  var label: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Field {
  @scala.inline
  def apply(field: js.Array[String] = null, label: js.Array[String] = null): Anon_Field = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_Field]
  }
}

