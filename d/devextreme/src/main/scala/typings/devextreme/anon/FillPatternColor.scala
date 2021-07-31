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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillPatternColor extends StObject {
  
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
  
  var value: js.UndefOr[String | Double | typings.std.Date] = js.undefined
  
  var verticalAlignment: js.UndefOr[bottom | center | distributed | justify | top] = js.undefined
  
  var wrapTextEnabled: js.UndefOr[Boolean] = js.undefined
}
object FillPatternColor {
  
  @scala.inline
  def apply(): FillPatternColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillPatternColor]
  }
  
  @scala.inline
  implicit class FillPatternColorMutableBuilder[Self <: FillPatternColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setComponent(value: dxDataGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setFillPatternColor(value: String): Self = StObject.set(x, "fillPatternColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillPatternColorUndefined: Self = StObject.set(x, "fillPatternColor", js.undefined)
    
    @scala.inline
    def setFillPatternType(
      value: darkDown | darkGray | darkGrid | darkHorizontal | darkTrellis | darkUp | darkVertical | gray0625 | gray125 | lightDown | lightGray | lightGrid | lightHorizontal | lightTrellis | lightUp | lightVertical | mediumGray | none | solid
    ): Self = StObject.set(x, "fillPatternType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillPatternTypeUndefined: Self = StObject.set(x, "fillPatternType", js.undefined)
    
    @scala.inline
    def setFont(value: ExcelFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setGridCell(value: ExcelDataGridCell): Self = StObject.set(x, "gridCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridCellUndefined: Self = StObject.set(x, "gridCell", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: center | centerContinuous | distributed | fill | general | justify | left | right): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double | typings.std.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: bottom | center | distributed | justify | top): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    @scala.inline
    def setWrapTextEnabled(value: Boolean): Self = StObject.set(x, "wrapTextEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapTextEnabledUndefined: Self = StObject.set(x, "wrapTextEnabled", js.undefined)
  }
}
