package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFilter extends js.Object {
  var a1Range: js.UndefOr[java.lang.String] = js.undefined
  var developerMetadataLookup: js.UndefOr[DeveloperMetadataLookup] = js.undefined
  var gridRange: js.UndefOr[GridRange] = js.undefined
}

object DataFilter {
  @scala.inline
  def apply(
    a1Range: java.lang.String = null,
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

