package typings.devextreme.mod.DevExpress

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pdfExporter {
  
  trait PdfExportDataGridProps extends StObject {
    
    /**
      * [descr:PdfExportDataGridProps.autoTableOptions]
      */
    var autoTableOptions: js.UndefOr[js.Any] = js.undefined
    
    /**
      * [descr:PdfExportDataGridProps.component]
      */
    var component: js.UndefOr[dxDataGrid] = js.undefined
    
    /**
      * [descr:PdfExportDataGridProps.jsPDFDocument]
      */
    var jsPDFDocument: js.UndefOr[js.Any] = js.undefined
    
    /**
      * [descr:PdfExportDataGridProps.keepColumnWidths]
      */
    var keepColumnWidths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [descr:PdfExportDataGridProps.selectedRowsOnly]
      */
    var selectedRowsOnly: js.UndefOr[Boolean] = js.undefined
  }
  object PdfExportDataGridProps {
    
    @scala.inline
    def apply(): PdfExportDataGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PdfExportDataGridProps]
    }
    
    @scala.inline
    implicit class PdfExportDataGridPropsMutableBuilder[Self <: PdfExportDataGridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoTableOptions(value: js.Any): Self = StObject.set(x, "autoTableOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoTableOptionsUndefined: Self = StObject.set(x, "autoTableOptions", js.undefined)
      
      @scala.inline
      def setComponent(value: dxDataGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setJsPDFDocument(value: js.Any): Self = StObject.set(x, "jsPDFDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsPDFDocumentUndefined: Self = StObject.set(x, "jsPDFDocument", js.undefined)
      
      @scala.inline
      def setKeepColumnWidths(value: Boolean): Self = StObject.set(x, "keepColumnWidths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepColumnWidthsUndefined: Self = StObject.set(x, "keepColumnWidths", js.undefined)
      
      @scala.inline
      def setSelectedRowsOnly(value: Boolean): Self = StObject.set(x, "selectedRowsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedRowsOnlyUndefined: Self = StObject.set(x, "selectedRowsOnly", js.undefined)
    }
  }
}
