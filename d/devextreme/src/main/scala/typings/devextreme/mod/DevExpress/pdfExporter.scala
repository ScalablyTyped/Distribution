package typings.devextreme.mod.DevExpress

import typings.devextreme.anon.Bottom
import typings.devextreme.anon.Cancel
import typings.devextreme.anon.GridCell
import typings.devextreme.anon.RowCells
import typings.devextreme.anon.Size
import typings.devextreme.anon.Y
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.middle
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxGantt
import typings.devextreme.mod.DevExpress.ui.dxGantt.GanttPdfExportDateRange
import typings.devextreme.mod.DevExpress.ui.dxGantt.GanttPdfExportMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pdfExporter {
  
  trait Cell extends StObject {
    
    /**
      * 
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * 
      */
    var borderColor: js.UndefOr[String] = js.undefined
    
    /**
      * 
      */
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * 
      */
    var drawBottomBorder: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 
      */
    var drawLeftBorder: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 
      */
    var drawRightBorder: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 
      */
    var drawTopBorder: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 
      */
    var font: js.UndefOr[Size] = js.undefined
    
    /**
      * 
      */
    var horizontalAlign: js.UndefOr[left | center | right] = js.undefined
    
    /**
      * 
      */
    var padding: js.UndefOr[Bottom] = js.undefined
    
    /**
      * 
      */
    var text: js.UndefOr[String] = js.undefined
    
    /**
      * 
      */
    var textColor: js.UndefOr[String] = js.undefined
    
    /**
      * 
      */
    var verticalAlign: js.UndefOr[top | middle | bottom] = js.undefined
    
    /**
      * 
      */
    var wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object Cell {
    
    inline def apply(): Cell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cell]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cell] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setDrawBottomBorder(value: Boolean): Self = StObject.set(x, "drawBottomBorder", value.asInstanceOf[js.Any])
      
      inline def setDrawBottomBorderUndefined: Self = StObject.set(x, "drawBottomBorder", js.undefined)
      
      inline def setDrawLeftBorder(value: Boolean): Self = StObject.set(x, "drawLeftBorder", value.asInstanceOf[js.Any])
      
      inline def setDrawLeftBorderUndefined: Self = StObject.set(x, "drawLeftBorder", js.undefined)
      
      inline def setDrawRightBorder(value: Boolean): Self = StObject.set(x, "drawRightBorder", value.asInstanceOf[js.Any])
      
      inline def setDrawRightBorderUndefined: Self = StObject.set(x, "drawRightBorder", js.undefined)
      
      inline def setDrawTopBorder(value: Boolean): Self = StObject.set(x, "drawTopBorder", value.asInstanceOf[js.Any])
      
      inline def setDrawTopBorderUndefined: Self = StObject.set(x, "drawTopBorder", js.undefined)
      
      inline def setFont(value: Size): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHorizontalAlign(value: left | center | right): Self = StObject.set(x, "horizontalAlign", value.asInstanceOf[js.Any])
      
      inline def setHorizontalAlignUndefined: Self = StObject.set(x, "horizontalAlign", js.undefined)
      
      inline def setPadding(value: Bottom): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVerticalAlign(value: top | middle | bottom): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setWordWrapEnabled(value: Boolean): Self = StObject.set(x, "wordWrapEnabled", value.asInstanceOf[js.Any])
      
      inline def setWordWrapEnabledUndefined: Self = StObject.set(x, "wordWrapEnabled", js.undefined)
    }
  }
  
  type DataGridCell = PdfDataGridCell
  
  type PdfDataGridCell = typings.devextreme.mod.DevExpress.excelExporter.DataGridCell
  
  trait PdfExportDataGridProps extends StObject {
    
    /**
      * 
      */
    var columnWidths: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * A DataGrid instance. This setting is required.
      */
    var component: js.UndefOr[dxDataGrid[Any, Any]] = js.undefined
    
    /**
      * 
      */
    var customDrawCell: js.UndefOr[js.Function1[/* options */ Cancel, Unit]] = js.undefined
    
    /**
      * Customizes a cell in PDF after creation.
      */
    var customizeCell: js.UndefOr[js.Function1[/* options */ GridCell, Unit]] = js.undefined
    
    /**
      * 
      */
    var indent: js.UndefOr[Double] = js.undefined
    
    /**
      * A jsPDF instance. This setting is required.
      */
    var jsPDFDocument: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Configures the load panel.
      */
    var loadPanel: js.UndefOr[ExportLoadPanel] = js.undefined
    
    /**
      * 
      */
    var margin: js.UndefOr[Bottom] = js.undefined
    
    /**
      * 
      */
    var onRowExporting: js.UndefOr[js.Function1[/* options */ RowCells, Unit]] = js.undefined
    
    /**
      * 
      */
    var repeatHeaders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether or not to export only selected rows.
      */
    var selectedRowsOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 
      */
    var topLeft: js.UndefOr[Y] = js.undefined
  }
  object PdfExportDataGridProps {
    
    inline def apply(): PdfExportDataGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PdfExportDataGridProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PdfExportDataGridProps] (val x: Self) extends AnyVal {
      
      inline def setColumnWidths(value: js.Array[Double]): Self = StObject.set(x, "columnWidths", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthsUndefined: Self = StObject.set(x, "columnWidths", js.undefined)
      
      inline def setColumnWidthsVarargs(value: Double*): Self = StObject.set(x, "columnWidths", js.Array(value*))
      
      inline def setComponent(value: dxDataGrid[Any, Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setCustomDrawCell(value: /* options */ Cancel => Unit): Self = StObject.set(x, "customDrawCell", js.Any.fromFunction1(value))
      
      inline def setCustomDrawCellUndefined: Self = StObject.set(x, "customDrawCell", js.undefined)
      
      inline def setCustomizeCell(value: /* options */ GridCell => Unit): Self = StObject.set(x, "customizeCell", js.Any.fromFunction1(value))
      
      inline def setCustomizeCellUndefined: Self = StObject.set(x, "customizeCell", js.undefined)
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setJsPDFDocument(value: js.Object): Self = StObject.set(x, "jsPDFDocument", value.asInstanceOf[js.Any])
      
      inline def setJsPDFDocumentUndefined: Self = StObject.set(x, "jsPDFDocument", js.undefined)
      
      inline def setLoadPanel(value: ExportLoadPanel): Self = StObject.set(x, "loadPanel", value.asInstanceOf[js.Any])
      
      inline def setLoadPanelUndefined: Self = StObject.set(x, "loadPanel", js.undefined)
      
      inline def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnRowExporting(value: /* options */ RowCells => Unit): Self = StObject.set(x, "onRowExporting", js.Any.fromFunction1(value))
      
      inline def setOnRowExportingUndefined: Self = StObject.set(x, "onRowExporting", js.undefined)
      
      inline def setRepeatHeaders(value: Boolean): Self = StObject.set(x, "repeatHeaders", value.asInstanceOf[js.Any])
      
      inline def setRepeatHeadersUndefined: Self = StObject.set(x, "repeatHeaders", js.undefined)
      
      inline def setSelectedRowsOnly(value: Boolean): Self = StObject.set(x, "selectedRowsOnly", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowsOnlyUndefined: Self = StObject.set(x, "selectedRowsOnly", js.undefined)
      
      inline def setTopLeft(value: Y): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
    }
  }
  
  trait PdfExportGanttProps extends StObject {
    
    /**
      * A Gantt instance. This setting is required.
      */
    var component: js.UndefOr[dxGantt] = js.undefined
    
    /**
      * A function that creates a PDF document.
      */
    var createDocumentMethod: js.UndefOr[js.Function1[/* options */ Any, js.Object]] = js.undefined
    
    /**
      * Specifies the date range for which to export tasks.
      */
    var dateRange: js.UndefOr[GanttPdfExportDateRange | js.Object] = js.undefined
    
    /**
      * Specifies which part of the component to export (chart area, tree list area, or the entire component).
      */
    var exportMode: js.UndefOr[GanttPdfExportMode] = js.undefined
    
    /**
      * Specifies the file name.
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /**
      * 
      */
    var font: js.UndefOr[PdfExportGanttFont] = js.undefined
    
    /**
      * Specifies the document size.
      */
    var format: js.UndefOr[String | js.Object] = js.undefined
    
    /**
      * A jsPDF instance. This setting is required.
      */
    var jsPDFDocument: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Specifies whether to use horizontal orientation for the document.
      */
    var landscape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the outer indents of the exported area.
      */
    var margins: js.UndefOr[js.Object] = js.undefined
  }
  object PdfExportGanttProps {
    
    inline def apply(): PdfExportGanttProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PdfExportGanttProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PdfExportGanttProps] (val x: Self) extends AnyVal {
      
      inline def setComponent(value: dxGantt): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setCreateDocumentMethod(value: /* options */ Any => js.Object): Self = StObject.set(x, "createDocumentMethod", js.Any.fromFunction1(value))
      
      inline def setCreateDocumentMethodUndefined: Self = StObject.set(x, "createDocumentMethod", js.undefined)
      
      inline def setDateRange(value: GanttPdfExportDateRange | js.Object): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
      
      inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
      
      inline def setExportMode(value: GanttPdfExportMode): Self = StObject.set(x, "exportMode", value.asInstanceOf[js.Any])
      
      inline def setExportModeUndefined: Self = StObject.set(x, "exportMode", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFont(value: PdfExportGanttFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFormat(value: String | js.Object): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setJsPDFDocument(value: js.Object): Self = StObject.set(x, "jsPDFDocument", value.asInstanceOf[js.Any])
      
      inline def setJsPDFDocumentUndefined: Self = StObject.set(x, "jsPDFDocument", js.undefined)
      
      inline def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
      
      inline def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
      
      inline def setMargins(value: js.Object): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
      
      inline def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
    }
  }
}
