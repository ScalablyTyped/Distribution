package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetValuesByDataFilterRequest extends js.Object {
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
  var dateTimeRenderOption: js.UndefOr[java.lang.String] = js.undefined
  var majorDimension: js.UndefOr[java.lang.String] = js.undefined
  var valueRenderOption: js.UndefOr[java.lang.String] = js.undefined
}

object BatchGetValuesByDataFilterRequest {
  @scala.inline
  def apply(
    dataFilters: js.Array[DataFilter] = null,
    dateTimeRenderOption: java.lang.String = null,
    majorDimension: java.lang.String = null,
    valueRenderOption: java.lang.String = null
  ): BatchGetValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters)
    if (dateTimeRenderOption != null) __obj.updateDynamic("dateTimeRenderOption")(dateTimeRenderOption)
    if (majorDimension != null) __obj.updateDynamic("majorDimension")(majorDimension)
    if (valueRenderOption != null) __obj.updateDynamic("valueRenderOption")(valueRenderOption)
    __obj.asInstanceOf[BatchGetValuesByDataFilterRequest]
  }
}

