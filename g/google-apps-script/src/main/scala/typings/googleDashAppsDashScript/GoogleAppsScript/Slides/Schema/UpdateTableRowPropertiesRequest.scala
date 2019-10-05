package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTableRowPropertiesRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var rowIndices: js.UndefOr[js.Array[Double]] = js.undefined
  var tableRowProperties: js.UndefOr[TableRowProperties] = js.undefined
}

object UpdateTableRowPropertiesRequest {
  @scala.inline
  def apply(
    fields: String = null,
    objectId: String = null,
    rowIndices: js.Array[Double] = null,
    tableRowProperties: TableRowProperties = null
  ): UpdateTableRowPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (rowIndices != null) __obj.updateDynamic("rowIndices")(rowIndices)
    if (tableRowProperties != null) __obj.updateDynamic("tableRowProperties")(tableRowProperties)
    __obj.asInstanceOf[UpdateTableRowPropertiesRequest]
  }
}

