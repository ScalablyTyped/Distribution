package typings.googleDotVisualization.googleNs.visualizationNs

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
    if (headerCell != null) __obj.updateDynamic("headerCell")(headerCell)
    if (headerRow != null) __obj.updateDynamic("headerRow")(headerRow)
    if (hoverTableRow != null) __obj.updateDynamic("hoverTableRow")(hoverTableRow)
    if (oddTableRow != null) __obj.updateDynamic("oddTableRow")(oddTableRow)
    if (rowNumberCell != null) __obj.updateDynamic("rowNumberCell")(rowNumberCell)
    if (selectedTableRow != null) __obj.updateDynamic("selectedTableRow")(selectedTableRow)
    if (tableCell != null) __obj.updateDynamic("tableCell")(tableCell)
    if (tableRow != null) __obj.updateDynamic("tableRow")(tableRow)
    __obj.asInstanceOf[CssClassNames]
  }
}

