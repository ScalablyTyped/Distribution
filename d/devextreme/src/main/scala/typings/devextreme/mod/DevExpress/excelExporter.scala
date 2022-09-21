package typings.devextreme.mod.DevExpress

import typings.devextreme.anon.ExcelCell
import typings.devextreme.anon.Name
import typings.devextreme.anon.PivotCell
import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.Column
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid
import typings.devextreme.mod.DevExpress.ui.dxPivotGridPivotGridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object excelExporter {
  
  trait CellAddress extends StObject {
    
    /**
      * The index of a column that contains the cell.
      */
    var column: js.UndefOr[Double] = js.undefined
    
    /**
      * The index of a row that contains the cell.
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
      * Coordinates of the top left cell.
      */
    var from: js.UndefOr[CellAddress] = js.undefined
    
    /**
      * Coordinates of the bottom right cell.
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
  
  type DataGridCell = ExcelDataGridCell
  
  trait ExcelDataGridCell extends StObject {
    
    /**
      * The configuration of the cell&apos;s column.
      */
    var column: js.UndefOr[Column[Any, Any]] = js.undefined
    
    /**
      * The data object of the cell&apos;s row.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /**
      * The group index of the cell&apos;s row. Available when the rowType is &apos;group&apos;.
      */
    var groupIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Information about group summary items the cell represents.
      */
    var groupSummaryItems: js.UndefOr[js.Array[Name]] = js.undefined
    
    /**
      * The type of the cell&apos;s row.
      */
    var rowType: js.UndefOr[String] = js.undefined
    
    /**
      * The identifier of the total summary item that the cell represents.
      */
    var totalSummaryItemName: js.UndefOr[String] = js.undefined
    
    /**
      * The cell&apos;s raw value.
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object ExcelDataGridCell {
    
    inline def apply(): ExcelDataGridCell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcelDataGridCell]
    }
    
    extension [Self <: ExcelDataGridCell](x: Self) {
      
      inline def setColumn(value: Column[Any, Any]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
      
      inline def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
      
      inline def setGroupSummaryItems(value: js.Array[Name]): Self = StObject.set(x, "groupSummaryItems", value.asInstanceOf[js.Any])
      
      inline def setGroupSummaryItemsUndefined: Self = StObject.set(x, "groupSummaryItems", js.undefined)
      
      inline def setGroupSummaryItemsVarargs(value: Name*): Self = StObject.set(x, "groupSummaryItems", js.Array(value*))
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
      
      inline def setTotalSummaryItemName(value: String): Self = StObject.set(x, "totalSummaryItemName", value.asInstanceOf[js.Any])
      
      inline def setTotalSummaryItemNameUndefined: Self = StObject.set(x, "totalSummaryItemName", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ExcelExportBaseProps extends StObject {
    
    /**
      * Specifies whether Excel columns should have the same width as their source UI component&apos;s columns.
      */
    var keepColumnWidths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configures the load panel.
      */
    var loadPanel: js.UndefOr[ExportLoadPanel] = js.undefined
    
    /**
      * A cell used as a start position for export.
      */
    var topLeftCell: js.UndefOr[CellAddress | String] = js.undefined
    
    /**
      * An Excel worksheet to which the grid should be exported.
      */
    var worksheet: js.UndefOr[js.Object] = js.undefined
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
      
      inline def setWorksheet(value: js.Object): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
      
      inline def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
    }
  }
  
  trait ExcelExportDataGridProps
    extends StObject
       with ExcelExportBaseProps {
    
    /**
      * Specifies whether to enable Excel filtering in the document.
      */
    var autoFilterEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A DataGrid instance. This setting is required.
      */
    var component: js.UndefOr[dxDataGrid[Any, Any]] = js.undefined
    
    /**
      * Customizes an Excel cell after creation.
      */
    var customizeCell: js.UndefOr[js.Function1[/* options */ ExcelCell, Unit]] = js.undefined
    
    /**
      * Specifies whether to export only selected rows.
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
      
      inline def setComponent(value: dxDataGrid[Any, Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setCustomizeCell(value: /* options */ ExcelCell => Unit): Self = StObject.set(x, "customizeCell", js.Any.fromFunction1(value))
      
      inline def setCustomizeCellUndefined: Self = StObject.set(x, "customizeCell", js.undefined)
      
      inline def setSelectedRowsOnly(value: Boolean): Self = StObject.set(x, "selectedRowsOnly", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowsOnlyUndefined: Self = StObject.set(x, "selectedRowsOnly", js.undefined)
    }
  }
  
  trait ExcelExportPivotGridProps
    extends StObject
       with ExcelExportBaseProps {
    
    /**
      * A PivotGrid instance. This setting is required.
      */
    var component: js.UndefOr[dxPivotGrid] = js.undefined
    
    /**
      * Customizes an Excel cell after creation.
      */
    var customizeCell: js.UndefOr[js.Function1[/* options */ PivotCell, Unit]] = js.undefined
    
    /**
      * Specifies whether to merge neighbouring cells in the column field if they have the same values.
      */
    var mergeColumnFieldValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether to merge neighbouring cells in the row field if they have the same values.
      */
    var mergeRowFieldValues: js.UndefOr[Boolean] = js.undefined
  }
  object ExcelExportPivotGridProps {
    
    inline def apply(): ExcelExportPivotGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcelExportPivotGridProps]
    }
    
    extension [Self <: ExcelExportPivotGridProps](x: Self) {
      
      inline def setComponent(value: dxPivotGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setCustomizeCell(value: /* options */ PivotCell => Unit): Self = StObject.set(x, "customizeCell", js.Any.fromFunction1(value))
      
      inline def setCustomizeCellUndefined: Self = StObject.set(x, "customizeCell", js.undefined)
      
      inline def setMergeColumnFieldValues(value: Boolean): Self = StObject.set(x, "mergeColumnFieldValues", value.asInstanceOf[js.Any])
      
      inline def setMergeColumnFieldValuesUndefined: Self = StObject.set(x, "mergeColumnFieldValues", js.undefined)
      
      inline def setMergeRowFieldValues(value: Boolean): Self = StObject.set(x, "mergeRowFieldValues", value.asInstanceOf[js.Any])
      
      inline def setMergeRowFieldValuesUndefined: Self = StObject.set(x, "mergeRowFieldValues", js.undefined)
    }
  }
  
  trait ExcelPivotGridCell
    extends StObject
       with dxPivotGridPivotGridCell {
    
    /**
      * The area to which the cell belongs.
      */
    var area: js.UndefOr[String] = js.undefined
    
    /**
      * A zero-based index that indicates the position of the cell&apos;s column.
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * A zero-based index that indicates the position of the cell&apos;s row.
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
  
  type PivotGridCell = ExcelPivotGridCell
}
