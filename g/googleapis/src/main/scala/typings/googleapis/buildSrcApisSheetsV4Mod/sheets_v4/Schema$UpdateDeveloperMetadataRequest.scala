package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to update properties of developer metadata. Updates the
  * properties of the developer metadata selected by the filters to the values
  * provided in the DeveloperMetadata resource.  Callers must specify the
  * properties they wish to update in the fields parameter, as well as specify
  * at least one DataFilter matching the metadata they wish to update.
  */
@js.native
trait Schema$UpdateDeveloperMetadataRequest extends js.Object {
  /**
    * The filters matching the developer metadata entries to update.
    */
  var dataFilters: js.UndefOr[js.Array[Schema$DataFilter]] = js.native
  /**
    * The value that all metadata matched by the data filters will be updated
    * to.
    */
  var developerMetadata: js.UndefOr[Schema$DeveloperMetadata] = js.native
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `developerMetadata` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
}

object Schema$UpdateDeveloperMetadataRequest {
  @scala.inline
  def apply(
    dataFilters: js.Array[Schema$DataFilter] = null,
    developerMetadata: Schema$DeveloperMetadata = null,
    fields: String = null
  ): Schema$UpdateDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters.asInstanceOf[js.Any])
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateDeveloperMetadataRequest]
  }
}

