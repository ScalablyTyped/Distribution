package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSpreadsheetPropertiesRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[SpreadsheetProperties] = js.undefined
}

object UpdateSpreadsheetPropertiesRequest {
  @scala.inline
  def apply(fields: String = null, properties: SpreadsheetProperties = null): UpdateSpreadsheetPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSpreadsheetPropertiesRequest]
  }
}

