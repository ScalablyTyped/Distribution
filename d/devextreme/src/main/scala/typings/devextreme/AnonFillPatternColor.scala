package typings.devextreme

import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.centerContinuous
import typings.devextreme.devextremeStrings.darkDown
import typings.devextreme.devextremeStrings.darkGray
import typings.devextreme.devextremeStrings.darkGrid
import typings.devextreme.devextremeStrings.darkHorizontal
import typings.devextreme.devextremeStrings.darkTrellis
import typings.devextreme.devextremeStrings.darkUp
import typings.devextreme.devextremeStrings.darkVertical
import typings.devextreme.devextremeStrings.distributed
import typings.devextreme.devextremeStrings.fill
import typings.devextreme.devextremeStrings.general
import typings.devextreme.devextremeStrings.gray0625
import typings.devextreme.devextremeStrings.gray125
import typings.devextreme.devextremeStrings.justify
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.lightDown
import typings.devextreme.devextremeStrings.lightGray
import typings.devextreme.devextremeStrings.lightGrid
import typings.devextreme.devextremeStrings.lightHorizontal
import typings.devextreme.devextremeStrings.lightTrellis
import typings.devextreme.devextremeStrings.lightUp
import typings.devextreme.devextremeStrings.lightVertical
import typings.devextreme.devextremeStrings.mediumGray
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.solid
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.DevExpress.exporter.ExcelDataGridCell
import typings.devextreme.mod.DevExpress.exporter.ExcelFont
import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFillPatternColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[dxDataGrid] = js.undefined
  var fillPatternColor: js.UndefOr[String] = js.undefined
  var fillPatternType: js.UndefOr[
    darkDown | darkGray | darkGrid | darkHorizontal | darkTrellis | darkUp | darkVertical | gray0625 | gray125 | lightDown | lightGray | lightGrid | lightHorizontal | lightTrellis | lightUp | lightVertical | mediumGray | none | solid
  ] = js.undefined
  var font: js.UndefOr[ExcelFont] = js.undefined
  var gridCell: js.UndefOr[ExcelDataGridCell] = js.undefined
  var horizontalAlignment: js.UndefOr[
    center | centerContinuous | distributed | fill | general | justify | left | right
  ] = js.undefined
  var numberFormat: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double | Date] = js.undefined
  var verticalAlignment: js.UndefOr[bottom | center | distributed | justify | top] = js.undefined
  var wrapTextEnabled: js.UndefOr[Boolean] = js.undefined
}

object AnonFillPatternColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    component: dxDataGrid = null,
    fillPatternColor: String = null,
    fillPatternType: darkDown | darkGray | darkGrid | darkHorizontal | darkTrellis | darkUp | darkVertical | gray0625 | gray125 | lightDown | lightGray | lightGrid | lightHorizontal | lightTrellis | lightUp | lightVertical | mediumGray | none | solid = null,
    font: ExcelFont = null,
    gridCell: ExcelDataGridCell = null,
    horizontalAlignment: center | centerContinuous | distributed | fill | general | justify | left | right = null,
    numberFormat: String = null,
    value: String | Double | Date = null,
    verticalAlignment: bottom | center | distributed | justify | top = null,
    wrapTextEnabled: js.UndefOr[Boolean] = js.undefined
  ): AnonFillPatternColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (fillPatternColor != null) __obj.updateDynamic("fillPatternColor")(fillPatternColor.asInstanceOf[js.Any])
    if (fillPatternType != null) __obj.updateDynamic("fillPatternType")(fillPatternType.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (gridCell != null) __obj.updateDynamic("gridCell")(gridCell.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapTextEnabled)) __obj.updateDynamic("wrapTextEnabled")(wrapTextEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFillPatternColor]
  }
}

