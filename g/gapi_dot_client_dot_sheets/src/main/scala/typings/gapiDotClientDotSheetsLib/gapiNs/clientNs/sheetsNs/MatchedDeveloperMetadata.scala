package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchedDeveloperMetadata extends js.Object {
  /** All filters matching the returned developer metadata. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
  /** The developer metadata matching the specified filters. */
  var developerMetadata: js.UndefOr[DeveloperMetadata] = js.undefined
}

object MatchedDeveloperMetadata {
  @scala.inline
  def apply(dataFilters: js.Array[DataFilter] = null, developerMetadata: DeveloperMetadata = null): MatchedDeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters)
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata)
    __obj.asInstanceOf[MatchedDeveloperMetadata]
  }
}

