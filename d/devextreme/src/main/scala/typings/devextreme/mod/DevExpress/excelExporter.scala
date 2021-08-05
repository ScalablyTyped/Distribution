package typings.devextreme.mod.DevExpress

import typings.devextreme.anon.ExcelCell
import typings.devextreme.anon.NameValue
import typings.devextreme.anon.PivotCell
import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridColumn
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid
import typings.devextreme.mod.DevExpress.ui.dxPivotGridPivotGridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object excelExporter {
  
  trait CellAddress extends StObject {
    
    /**
      * [descr:CellAddress.column]
      */
    var column: js.UndefOr[Double] = js.undefined
    
    /**
      * [descr:CellAddress.row]
      */
    var row: js.UndefOr[Double] = js.undefined
  }
  object CellAddress {
    
    inline def apply(): CellAddress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellAddress]
    }
    
    extension [Self <: CellAddress](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  trait CellRange extends StObject {
    
    /**
      * [descr:CellRange.from]
      */
    var from: js.UndefOr[CellAddress] = js.undefined
    
    /**
      * [descr:CellRange.to]
      */
    var to: js.UndefOr[CellAddress] = js.undefined
  }
  object CellRange {
    
    inline def apply(): CellRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellRange]
    }
    
    extension [Self <: CellRange](x: Self) {
      
      inline def setFrom(value: CellAddress): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: CellAddress): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait ExcelDataGridCell extends StObject {
    
    /**
      * [descr:ExcelDataGridCell.column]
      */
    var column: js.UndefOr[dxDataGridColumn] = js.undefined
    
    /**
      * [descr:ExcelDataGridCell.data]
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /**
      * [descr:ExcelDataGridCell.groupIndex]
      */
    var groupIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * [descr:ExcelDataGridCell.groupSummaryItems]
      */
    var groupSummaryItems: js.UndefOr[js.Array[NameValue]] = js.undefined
    
    /**
      * [descr:ExcelDataGridCell.rowType]
      */
    var rowType: js.UndefOr[String] = js.undefined
    
    /**
      * [descr:ExcelDataGridCell.totalSummaryItemName]
      */
    var totalSummaryItemName: js.UndefOr[String] = js.undefined
    
    /**
      * [descr:ExcelDataGridCell.value]
      */
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object ExcelDataGridCell {
    
    inline def apply(): ExcelDataGridCell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcelDataGridCell]
    }
    
    extension [Self <: ExcelDataGridCell](x: Self) {
      
      inline def setColumn(value: dxDataGridColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
      
      inline def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
      
      inline def setGroupSummaryItems(value: js.Array[NameValue]): Self = StObject.set(x, "groupSummaryItems", value.asInstanceOf[js.Any])
      
      inline def setGroupSummaryItemsUndefined: Self = StObject.set(x, "groupSummaryItems", js.undefined)
      
      inline def setGroupSummaryItemsVarargs(value: NameValue*): Self = StObject.set(x, "groupSummaryItems", js.Array(value :_*))
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
      
      inline def setTotalSummaryItemName(value: String): Self = StObject.set(x, "totalSummaryItemName", value.asInstanceOf[js.Any])
      
      inline def setTotalSummaryItemNameUndefined: Self = StObject.set(x, "totalSummaryItemName", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ExcelExportBaseProps extends StObject {
    
    /**
      * [descr:ExcelExportBaseProps.keepColumnWidths]
      */
    var keepColumnWidths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [descr:ExcelExportBaseProps.loadPanel]
      */
    var loadPanel: js.UndefOr[ExportLoadPanel] = js.undefined
    
    /**
      * [descr:ExcelExportBaseProps.topLeftCell]
      */
    var topLeftCell: js.UndefOr[CellAddress | String] = js.undefined
    
    /**
      * [descr:ExcelExportBaseProps.worksheet]
      */
    var worksheet: js.UndefOr[js.Any] = js.undefined
  }
  object ExcelExportBaseProps {
    
    inline def apply(): ExcelExportBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcelExportBaseProps]
    }
    
    extension [Self <: ExcelExportBaseProps](x: Self) {
      
      inline def setKeepColumnWidths(value: Boolean): Self = StObject.set(x, "keepColumnWidths", value.asInstanceOf[js.Any])
      
      inline def setKeepColumnWidthsUndefined: Self = StObject.set(x, "keepColumnWidths", js.undefined)
      
      inline def setLoadPanel(value: ExportLoadPanel): Self = StObject.set(x, "loadPanel", value.asInstanceOf[js.Any])
      
      inline def setLoadPanelUndefined: Self = StObject.set(x, "loadPanel", js.undefined)
      
      inline def setTopLeftCell(value: CellAddress | String): Self = StObject.set(x, "topLeftCell", value.asInstanceOf[js.Any])
      
      inline def setTopLeftCellUndefined: Self = StObject.set(x, "topLeftCell", js.undefined)
      
      inline def setWorksheet(value: js.Any): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
      
      inline def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
    }
  }
  
  trait ExcelExportDataGridProps
    extends StObject
       with ExcelExportBaseProps {
    
    /**
      * [descr:ExcelExportDataGridProps.autoFilterEnabled]
      */
    var autoFilterEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [descr:ExcelExportDataGridProps.component]
      */
    var component: js.UndefOr[dxDataGrid] = js.undefined
    
    /**
      * [descr:ExcelExportDataGridProps.customizeCell]
      */
    var customizeCell: js.UndefOr[js.Function1[/* options */ ExcelCell, js.Any]] = js.undefined
    
    /**
      * [descr:ExcelExportDataGridProps.selectedRowsOnly]
      */
    var selectedRowsOnly: js.UndefOr[Boolean] = js.undefined
  }
  object ExcelExportDataGridProps {
    
    inline def apply(): ExcelExportDataGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcelExportDataGridProps]
    }
    
    extension [Self <: ExcelExportDataGridProps](x: Self) {
      
      inline def setAutoFilterEnabled(value: Boolean): Self = StObject.set(x, "autoFilterEnabled", value.asInstanceOf[js.Any])
      
      inline def setAutoFilterEnabledUndefined: Self = StObject.set(x, "autoFilterEnabled", js.undefined)
      
      inline def setComponent(value: dxDataGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setCustomizeCell(value: /* options */ ExcelCell => js.Any): Self = StObject.set(x, "customizeCell", js.Any.fromFunction1(value))
      
      inline def setCustomizeCellUndefined: Self = StObject.set(x, "customizeCell", js.undefined)
      
      inline def setSelectedRowsOnly(value: Boolean): Self = StObject.set(x, "selectedRowsOnly", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowsOnlyUndefined: Self = StObject.set(x, "selectedRowsOnly", js.undefined)
    }
  }
  
  trait ExcelExportPivotGridProps
    extends StObject
       with ExcelExportBaseProps {
    
    /**
      * [descr:ExcelExportPivotGridProps.component]
      */
    var component: js.UndefOr[dxPivotGrid] = js.undefined
    
    /**
      * [descr:ExcelExportPivotGridProps.customizeCell]
      */
    var customizeCell: js.UndefOr[js.Function1[/* options */ PivotCell, js.Any]] = js.undefined
  }
  object ExcelExportPivotGridProps {
    
    inline def apply(): ExcelExportPivotGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcelExportPivotGridProps]
    }
    
    extension [Self <: ExcelExportPivotGridProps](x: Self) {
      
      inline def setComponent(value: dxPivotGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setCustomizeCell(value: /* options */ PivotCell => js.Any): Self = StObject.set(x, "customizeCell", js.Any.fromFunction1(value))
      
      inline def setCustomizeCellUndefined: Self = StObject.set(x, "customizeCell", js.undefined)
    }
  }
  
  trait ExcelPivotGridCell
    extends StObject
       with dxPivotGridPivotGridCell {
    
    /**
      * [descr:ExcelPivotGridCell.area]
      */
    var area: js.UndefOr[String] = js.undefined
    
    /**
      * [descr:ExcelPivotGridCell.columnIndex]
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * [descr:ExcelPivotGridCell.rowIndex]
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
  }
  object ExcelPivotGridCell {
    
    inline def apply(): ExcelPivotGridCell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcelPivotGridCell]
    }
    
    extension [Self <: ExcelPivotGridCell](x: Self) {
      
      inline def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    }
  }
  
  trait ExportLoadPanel extends StObject {
    
    /**
      * [descr:ExportLoadPanel.enabled]
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [descr:ExportLoadPanel.height]
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * [descr:ExportLoadPanel.indicatorSrc]
      */
    var indicatorSrc: js.UndefOr[String] = js.undefined
    
    /**
      * [descr:ExportLoadPanel.shading]
      */
    var shading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [descr:ExportLoadPanel.shadingColor]
      */
    var shadingColor: js.UndefOr[String] = js.undefined
    
    /**
      * [descr:ExportLoadPanel.showIndicator]
      */
    var showIndicator: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [descr:ExportLoadPanel.showPane]
      */
    var showPane: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [descr:ExportLoadPanel.text]
      */
    var text: js.UndefOr[String] = js.undefined
    
    /**
      * [descr:ExportLoadPanel.width]
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ExportLoadPanel {
    
    inline def apply(): ExportLoadPanel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportLoadPanel]
    }
    
    extension [Self <: ExportLoadPanel](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIndicatorSrc(value: String): Self = StObject.set(x, "indicatorSrc", value.asInstanceOf[js.Any])
      
      inline def setIndicatorSrcUndefined: Self = StObject.set(x, "indicatorSrc", js.undefined)
      
      inline def setShading(value: Boolean): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
      
      inline def setShadingColor(value: String): Self = StObject.set(x, "shadingColor", value.asInstanceOf[js.Any])
      
      inline def setShadingColorUndefined: Self = StObject.set(x, "shadingColor", js.undefined)
      
      inline def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
      
      inline def setShowIndicator(value: Boolean): Self = StObject.set(x, "showIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowIndicatorUndefined: Self = StObject.set(x, "showIndicator", js.undefined)
      
      inline def setShowPane(value: Boolean): Self = StObject.set(x, "showPane", value.asInstanceOf[js.Any])
      
      inline def setShowPaneUndefined: Self = StObject.set(x, "showPane", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
