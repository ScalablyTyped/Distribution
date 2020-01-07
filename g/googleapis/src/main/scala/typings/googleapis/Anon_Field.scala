package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Field extends js.Object {
  var field: js.UndefOr[String] = js.native
  var fieldIndex: js.UndefOr[Double] = js.native
}

object Anon_Field {
  @scala.inline
  def apply(field: String = null, fieldIndex: Int | Double = null): Anon_Field = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (fieldIndex != null) __obj.updateDynamic("fieldIndex")(fieldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Field]
  }
}

