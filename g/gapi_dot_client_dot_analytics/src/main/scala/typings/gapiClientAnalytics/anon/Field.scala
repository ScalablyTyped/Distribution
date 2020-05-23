package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  /** Field to use in the filter. */
  var field: js.UndefOr[String] = js.undefined
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var fieldIndex: js.UndefOr[Double] = js.undefined
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

