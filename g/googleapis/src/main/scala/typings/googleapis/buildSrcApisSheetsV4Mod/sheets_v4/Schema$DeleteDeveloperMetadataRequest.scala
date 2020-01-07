package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to delete developer metadata.
  */
@js.native
trait Schema$DeleteDeveloperMetadataRequest extends js.Object {
  /**
    * The data filter describing the criteria used to select which developer
    * metadata entry to delete.
    */
  var dataFilter: js.UndefOr[Schema$DataFilter] = js.native
}

object Schema$DeleteDeveloperMetadataRequest {
  @scala.inline
  def apply(dataFilter: Schema$DataFilter = null): Schema$DeleteDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(dataFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteDeveloperMetadataRequest]
  }
}

