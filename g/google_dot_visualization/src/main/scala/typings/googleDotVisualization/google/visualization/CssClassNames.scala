package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssClassNames extends js.Object {
  var headerCell: js.UndefOr[String] = js.undefined
  var headerRow: js.UndefOr[String] = js.undefined
  var hoverTableRow: js.UndefOr[String] = js.undefined
  var oddTableRow: js.UndefOr[String] = js.undefined
  var rowNumberCell: js.UndefOr[String] = js.undefined
  var selectedTableRow: js.UndefOr[String] = js.undefined
  var tableCell: js.UndefOr[String] = js.undefined
  var tableRow: js.UndefOr[String] = js.undefined
}

object CssClassNames {
  @scala.inline
  def apply(
    headerCell: String = null,
    headerRow: String = null,
    hoverTableRow: String = null,
    oddTableRow: String = null,
    rowNumberCell: String = null,
    selectedTableRow: String = null,
    tableCell: String = null,
    tableRow: String = null
  ): CssClassNames = {
    val __obj = js.Dynamic.literal()
    if (headerCell != null) __obj.updateDynamic("headerCell")(headerCell.asInstanceOf[js.Any])
    if (headerRow != null) __obj.updateDynamic("headerRow")(headerRow.asInstanceOf[js.Any])
    if (hoverTableRow != null) __obj.updateDynamic("hoverTableRow")(hoverTableRow.asInstanceOf[js.Any])
    if (oddTableRow != null) __obj.updateDynamic("oddTableRow")(oddTableRow.asInstanceOf[js.Any])
    if (rowNumberCell != null) __obj.updateDynamic("rowNumberCell")(rowNumberCell.asInstanceOf[js.Any])
    if (selectedTableRow != null) __obj.updateDynamic("selectedTableRow")(selectedTableRow.asInstanceOf[js.Any])
    if (tableCell != null) __obj.updateDynamic("tableCell")(tableCell.asInstanceOf[js.Any])
    if (tableRow != null) __obj.updateDynamic("tableRow")(tableRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssClassNames]
  }
}

