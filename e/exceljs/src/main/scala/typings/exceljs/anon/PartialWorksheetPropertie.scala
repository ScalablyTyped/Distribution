package typings.exceljs.anon

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
    defaultColWidth: js.UndefOr[Double] = js.undefined,
    defaultRowHeight: js.UndefOr[Double] = js.undefined,
    dyDescent: js.UndefOr[Double] = js.undefined,
    outlineLevelCol: js.UndefOr[Double] = js.undefined,
    outlineLevelRow: js.UndefOr[Double] = js.undefined,
    showGridLines: js.UndefOr[Boolean] = js.undefined,
    tabColor: PartialColor = null
  ): PartialWorksheetPropertie = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultColWidth)) __obj.updateDynamic("defaultColWidth")(defaultColWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultRowHeight)) __obj.updateDynamic("defaultRowHeight")(defaultRowHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dyDescent)) __obj.updateDynamic("dyDescent")(dyDescent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outlineLevelCol)) __obj.updateDynamic("outlineLevelCol")(outlineLevelCol.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outlineLevelRow)) __obj.updateDynamic("outlineLevelRow")(outlineLevelRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showGridLines)) __obj.updateDynamic("showGridLines")(showGridLines.get.asInstanceOf[js.Any])
    if (tabColor != null) __obj.updateDynamic("tabColor")(tabColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialWorksheetPropertie]
  }
}

