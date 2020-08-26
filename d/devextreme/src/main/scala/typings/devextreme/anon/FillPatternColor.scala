package typings.devextreme.anon

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
import typings.devextreme.mod.DevExpress.excelExporter.ExcelDataGridCell
import typings.devextreme.mod.DevExpress.exporter.ExcelFont
import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillPatternColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var component: js.UndefOr[dxDataGrid] = js.native
  var fillPatternColor: js.UndefOr[String] = js.native
  var fillPatternType: js.UndefOr[
    darkDown | darkGray | darkGrid | darkHorizontal | darkTrellis | darkUp | darkVertical | gray0625 | gray125 | lightDown | lightGray | lightGrid | lightHorizontal | lightTrellis | lightUp | lightVertical | mediumGray | none | solid
  ] = js.native
  var font: js.UndefOr[ExcelFont] = js.native
  var gridCell: js.UndefOr[ExcelDataGridCell] = js.native
  var horizontalAlignment: js.UndefOr[
    center | centerContinuous | distributed | fill | general | justify | left | right
  ] = js.native
  var numberFormat: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | Double | typings.std.Date] = js.native
  var verticalAlignment: js.UndefOr[bottom | center | distributed | justify | top] = js.native
  var wrapTextEnabled: js.UndefOr[Boolean] = js.native
}

object FillPatternColor {
  @scala.inline
  def apply(): FillPatternColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillPatternColor]
  }
  @scala.inline
  implicit class FillPatternColorOps[Self <: FillPatternColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setComponent(value: dxDataGrid): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setFillPatternColor(value: String): Self = this.set("fillPatternColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillPatternColor: Self = this.set("fillPatternColor", js.undefined)
    @scala.inline
    def setFillPatternType(
      value: darkDown | darkGray | darkGrid | darkHorizontal | darkTrellis | darkUp | darkVertical | gray0625 | gray125 | lightDown | lightGray | lightGrid | lightHorizontal | lightTrellis | lightUp | lightVertical | mediumGray | none | solid
    ): Self = this.set("fillPatternType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillPatternType: Self = this.set("fillPatternType", js.undefined)
    @scala.inline
    def setFont(value: ExcelFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setGridCell(value: ExcelDataGridCell): Self = this.set("gridCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridCell: Self = this.set("gridCell", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: center | centerContinuous | distributed | fill | general | justify | left | right): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setNumberFormat(value: String): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    @scala.inline
    def setValue(value: String | Double | typings.std.Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: bottom | center | distributed | justify | top): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    @scala.inline
    def setWrapTextEnabled(value: Boolean): Self = this.set("wrapTextEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapTextEnabled: Self = this.set("wrapTextEnabled", js.undefined)
  }
  
}

