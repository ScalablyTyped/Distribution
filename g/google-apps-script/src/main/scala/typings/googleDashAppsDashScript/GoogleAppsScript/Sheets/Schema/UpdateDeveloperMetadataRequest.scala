package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDeveloperMetadataRequest extends js.Object {
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
  var developerMetadata: js.UndefOr[DeveloperMetadata] = js.undefined
  var fields: js.UndefOr[String] = js.undefined
}

object UpdateDeveloperMetadataRequest {
  @scala.inline
  def apply(
    dataFilters: js.Array[DataFilter] = null,
    developerMetadata: DeveloperMetadata = null,
    fields: String = null
  ): UpdateDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters.asInstanceOf[js.Any])
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeveloperMetadataRequest]
  }
}

