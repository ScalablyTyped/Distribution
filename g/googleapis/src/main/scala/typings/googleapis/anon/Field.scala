package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  var field: js.UndefOr[String] = js.native
  var fieldIndex: js.UndefOr[Double] = js.native
}

object Field {
  @scala.inline
  def apply(field: String = null, fieldIndex: js.UndefOr[Double] = js.undefined): Field = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldIndex)) __obj.updateDynamic("fieldIndex")(fieldIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

