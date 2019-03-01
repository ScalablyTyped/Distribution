package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Field extends js.Object {
  /** Field to use in the filter. */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var fieldIndex: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Field {
  @scala.inline
  def apply(field: java.lang.String = null, fieldIndex: scala.Int | scala.Double = null): Anon_Field = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (fieldIndex != null) __obj.updateDynamic("fieldIndex")(fieldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Field]
  }
}

