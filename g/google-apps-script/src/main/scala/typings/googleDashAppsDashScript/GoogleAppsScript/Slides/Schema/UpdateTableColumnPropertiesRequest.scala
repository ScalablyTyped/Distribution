package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTableColumnPropertiesRequest extends js.Object {
  var columnIndices: js.UndefOr[js.Array[Double]] = js.undefined
  var fields: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var tableColumnProperties: js.UndefOr[TableColumnProperties] = js.undefined
}

object UpdateTableColumnPropertiesRequest {
  @scala.inline
  def apply(
    columnIndices: js.Array[Double] = null,
    fields: String = null,
    objectId: String = null,
    tableColumnProperties: TableColumnProperties = null
  ): UpdateTableColumnPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (columnIndices != null) __obj.updateDynamic("columnIndices")(columnIndices.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (tableColumnProperties != null) __obj.updateDynamic("tableColumnProperties")(tableColumnProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableColumnPropertiesRequest]
  }
}

