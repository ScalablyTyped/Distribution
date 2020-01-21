package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDuplicatesRequest extends js.Object {
  /**
    * The columns in the range to analyze for duplicate values. If no columns are
    * selected then all columns are analyzed for duplicates.
    */
  var comparisonColumns: js.UndefOr[js.Array[DimensionRange]] = js.undefined
  /** The range to remove duplicates rows from. */
  var range: js.UndefOr[GridRange] = js.undefined
}

object DeleteDuplicatesRequest {
  @scala.inline
  def apply(comparisonColumns: js.Array[DimensionRange] = null, range: GridRange = null): DeleteDuplicatesRequest = {
    val __obj = js.Dynamic.literal()
    if (comparisonColumns != null) __obj.updateDynamic("comparisonColumns")(comparisonColumns.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDuplicatesRequest]
  }
}

