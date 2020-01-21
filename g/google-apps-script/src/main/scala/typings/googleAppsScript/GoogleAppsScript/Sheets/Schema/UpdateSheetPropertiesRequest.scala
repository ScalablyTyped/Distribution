package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSheetPropertiesRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[SheetProperties] = js.undefined
}

object UpdateSheetPropertiesRequest {
  @scala.inline
  def apply(fields: String = null, properties: SheetProperties = null): UpdateSheetPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSheetPropertiesRequest]
  }
}

