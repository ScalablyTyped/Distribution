package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTableRowPropertiesRequest extends js.Object {
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var rowIndices: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var tableRowProperties: js.UndefOr[TableRowProperties] = js.undefined
}

object UpdateTableRowPropertiesRequest {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    objectId: java.lang.String = null,
    rowIndices: js.Array[scala.Double] = null,
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

