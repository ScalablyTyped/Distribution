package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTypeField extends js.Object {
  /** The different supported formats for each field in a data type. */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the name and format of data. Unlike data type names, field names are not namespaced, and only need to be unique within the data type. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
}

object DataTypeField {
  @scala.inline
  def apply(
    format: java.lang.String = null,
    name: java.lang.String = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined
  ): DataTypeField = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    __obj.asInstanceOf[DataTypeField]
  }
}

