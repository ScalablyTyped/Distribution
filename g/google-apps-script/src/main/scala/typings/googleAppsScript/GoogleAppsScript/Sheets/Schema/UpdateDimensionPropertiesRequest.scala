package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDimensionPropertiesRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[DimensionProperties] = js.undefined
  var range: js.UndefOr[DimensionRange] = js.undefined
}

object UpdateDimensionPropertiesRequest {
  @scala.inline
  def apply(fields: String = null, properties: DimensionProperties = null, range: DimensionRange = null): UpdateDimensionPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDimensionPropertiesRequest]
  }
}

