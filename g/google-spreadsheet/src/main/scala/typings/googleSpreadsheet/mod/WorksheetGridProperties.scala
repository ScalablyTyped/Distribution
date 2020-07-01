package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetGridProperties extends js.Object {
  var columnCount: Double
  var columnGroupControlAfter: Boolean
  var frozenColumnCount: Double
  var frozenRowCount: Double
  var hideGridlines: Boolean
  var rowCount: Double
  var rowGroupControlAfter: Boolean
}

object WorksheetGridProperties {
  @scala.inline
  def apply(
    columnCount: Double,
    columnGroupControlAfter: Boolean,
    frozenColumnCount: Double,
    frozenRowCount: Double,
    hideGridlines: Boolean,
    rowCount: Double,
    rowGroupControlAfter: Boolean
  ): WorksheetGridProperties = {
    val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], columnGroupControlAfter = columnGroupControlAfter.asInstanceOf[js.Any], frozenColumnCount = frozenColumnCount.asInstanceOf[js.Any], frozenRowCount = frozenRowCount.asInstanceOf[js.Any], hideGridlines = hideGridlines.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowGroupControlAfter = rowGroupControlAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetGridProperties]
  }
}

