package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFilter extends js.Object {
  /** Selects data that matches the specified A1 range. */
  var a1Range: js.UndefOr[String] = js.undefined
  /**
    * Selects data associated with the developer metadata matching the criteria
    * described by this DeveloperMetadataLookup.
    */
  var developerMetadataLookup: js.UndefOr[DeveloperMetadataLookup] = js.undefined
  /** Selects data that matches the range described by the GridRange. */
  var gridRange: js.UndefOr[GridRange] = js.undefined
}

object DataFilter {
  @scala.inline
  def apply(
    a1Range: String = null,
    developerMetadataLookup: DeveloperMetadataLookup = null,
    gridRange: GridRange = null
  ): DataFilter = {
    val __obj = js.Dynamic.literal()
    if (a1Range != null) __obj.updateDynamic("a1Range")(a1Range)
    if (developerMetadataLookup != null) __obj.updateDynamic("developerMetadataLookup")(developerMetadataLookup)
    if (gridRange != null) __obj.updateDynamic("gridRange")(gridRange)
    __obj.asInstanceOf[DataFilter]
  }
}

