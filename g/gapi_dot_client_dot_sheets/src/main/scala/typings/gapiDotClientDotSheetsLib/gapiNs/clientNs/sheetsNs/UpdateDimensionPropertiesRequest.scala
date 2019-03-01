package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDimensionPropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `properties` is implied and should not be specified.
    * A single `"&#42;"` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Properties to update. */
  var properties: js.UndefOr[DimensionProperties] = js.undefined
  /** The rows or columns to update. */
  var range: js.UndefOr[DimensionRange] = js.undefined
}

object UpdateDimensionPropertiesRequest {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    properties: DimensionProperties = null,
    range: DimensionRange = null
  ): UpdateDimensionPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[UpdateDimensionPropertiesRequest]
  }
}

