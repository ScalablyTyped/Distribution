package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTableBorderPropertiesRequest extends js.Object {
  var borderPosition: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var tableBorderProperties: js.UndefOr[TableBorderProperties] = js.undefined
  var tableRange: js.UndefOr[TableRange] = js.undefined
}

object UpdateTableBorderPropertiesRequest {
  @scala.inline
  def apply(
    borderPosition: String = null,
    fields: String = null,
    objectId: String = null,
    tableBorderProperties: TableBorderProperties = null,
    tableRange: TableRange = null
  ): UpdateTableBorderPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (borderPosition != null) __obj.updateDynamic("borderPosition")(borderPosition.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (tableBorderProperties != null) __obj.updateDynamic("tableBorderProperties")(tableBorderProperties.asInstanceOf[js.Any])
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableBorderPropertiesRequest]
  }
}

