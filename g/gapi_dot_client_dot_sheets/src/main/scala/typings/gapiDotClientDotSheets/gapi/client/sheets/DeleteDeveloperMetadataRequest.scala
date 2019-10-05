package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDeveloperMetadataRequest extends js.Object {
  /**
    * The data filter describing the criteria used to select which developer
    * metadata entry to delete.
    */
  var dataFilter: js.UndefOr[DataFilter] = js.undefined
}

object DeleteDeveloperMetadataRequest {
  @scala.inline
  def apply(dataFilter: DataFilter = null): DeleteDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(dataFilter)
    __obj.asInstanceOf[DeleteDeveloperMetadataRequest]
  }
}

