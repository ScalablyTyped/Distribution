package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchDeveloperMetadataRequest extends js.Object {
  /**
    * The data filters describing the criteria used to determine which
    * DeveloperMetadata entries to return.  DeveloperMetadata matching any of the
    * specified filters are included in the response.
    */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
}

object SearchDeveloperMetadataRequest {
  @scala.inline
  def apply(dataFilters: js.Array[DataFilter] = null): SearchDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDeveloperMetadataRequest]
  }
}

