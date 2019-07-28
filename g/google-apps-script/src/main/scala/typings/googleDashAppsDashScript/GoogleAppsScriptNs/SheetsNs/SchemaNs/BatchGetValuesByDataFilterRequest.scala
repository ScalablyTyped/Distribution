package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetValuesByDataFilterRequest extends js.Object {
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
  var dateTimeRenderOption: js.UndefOr[String] = js.undefined
  var majorDimension: js.UndefOr[String] = js.undefined
  var valueRenderOption: js.UndefOr[String] = js.undefined
}

object BatchGetValuesByDataFilterRequest {
  @scala.inline
  def apply(
    dataFilters: js.Array[DataFilter] = null,
    dateTimeRenderOption: String = null,
    majorDimension: String = null,
    valueRenderOption: String = null
  ): BatchGetValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters)
    if (dateTimeRenderOption != null) __obj.updateDynamic("dateTimeRenderOption")(dateTimeRenderOption)
    if (majorDimension != null) __obj.updateDynamic("majorDimension")(majorDimension)
    if (valueRenderOption != null) __obj.updateDynamic("valueRenderOption")(valueRenderOption)
    __obj.asInstanceOf[BatchGetValuesByDataFilterRequest]
  }
}

