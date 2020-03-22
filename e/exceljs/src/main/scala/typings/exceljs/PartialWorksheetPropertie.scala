package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.WorksheetProperties> */
trait PartialWorksheetPropertie extends js.Object {
  var defaultColWidth: js.UndefOr[Double] = js.undefined
  var defaultRowHeight: js.UndefOr[Double] = js.undefined
  var dyDescent: js.UndefOr[Double] = js.undefined
  var outlineLevelCol: js.UndefOr[Double] = js.undefined
  var outlineLevelRow: js.UndefOr[Double] = js.undefined
  var showGridLines: js.UndefOr[Boolean] = js.undefined
  var tabColor: js.UndefOr[PartialColor] = js.undefined
}

object PartialWorksheetPropertie {
  @scala.inline
  def apply(
    defaultColWidth: Int | Double = null,
    defaultRowHeight: Int | Double = null,
    dyDescent: Int | Double = null,
    outlineLevelCol: Int | Double = null,
    outlineLevelRow: Int | Double = null,
    showGridLines: js.UndefOr[Boolean] = js.undefined,
    tabColor: PartialColor = null
  ): PartialWorksheetPropertie = {
    val __obj = js.Dynamic.literal()
    if (defaultColWidth != null) __obj.updateDynamic("defaultColWidth")(defaultColWidth.asInstanceOf[js.Any])
    if (defaultRowHeight != null) __obj.updateDynamic("defaultRowHeight")(defaultRowHeight.asInstanceOf[js.Any])
    if (dyDescent != null) __obj.updateDynamic("dyDescent")(dyDescent.asInstanceOf[js.Any])
    if (outlineLevelCol != null) __obj.updateDynamic("outlineLevelCol")(outlineLevelCol.asInstanceOf[js.Any])
    if (outlineLevelRow != null) __obj.updateDynamic("outlineLevelRow")(outlineLevelRow.asInstanceOf[js.Any])
    if (!js.isUndefined(showGridLines)) __obj.updateDynamic("showGridLines")(showGridLines.asInstanceOf[js.Any])
    if (tabColor != null) __obj.updateDynamic("tabColor")(tabColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialWorksheetPropertie]
  }
}

