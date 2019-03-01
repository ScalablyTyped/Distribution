package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssClassNames extends js.Object {
  var headerCell: js.UndefOr[java.lang.String] = js.undefined
  var headerRow: js.UndefOr[java.lang.String] = js.undefined
  var hoverTableRow: js.UndefOr[java.lang.String] = js.undefined
  var oddTableRow: js.UndefOr[java.lang.String] = js.undefined
  var rowNumberCell: js.UndefOr[java.lang.String] = js.undefined
  var selectedTableRow: js.UndefOr[java.lang.String] = js.undefined
  var tableCell: js.UndefOr[java.lang.String] = js.undefined
  var tableRow: js.UndefOr[java.lang.String] = js.undefined
}

object CssClassNames {
  @scala.inline
  def apply(
    headerCell: java.lang.String = null,
    headerRow: java.lang.String = null,
    hoverTableRow: java.lang.String = null,
    oddTableRow: java.lang.String = null,
    rowNumberCell: java.lang.String = null,
    selectedTableRow: java.lang.String = null,
    tableCell: java.lang.String = null,
    tableRow: java.lang.String = null
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

