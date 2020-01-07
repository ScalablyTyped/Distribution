package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A developer metadata entry and the data filters specified in the original
  * request that matched it.
  */
@js.native
trait Schema$MatchedDeveloperMetadata extends js.Object {
  /**
    * All filters matching the returned developer metadata.
    */
  var dataFilters: js.UndefOr[js.Array[Schema$DataFilter]] = js.native
  /**
    * The developer metadata matching the specified filters.
    */
  var developerMetadata: js.UndefOr[Schema$DeveloperMetadata] = js.native
}

object Schema$MatchedDeveloperMetadata {
  @scala.inline
  def apply(
    dataFilters: js.Array[Schema$DataFilter] = null,
    developerMetadata: Schema$DeveloperMetadata = null
  ): Schema$MatchedDeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters.asInstanceOf[js.Any])
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MatchedDeveloperMetadata]
  }
}

