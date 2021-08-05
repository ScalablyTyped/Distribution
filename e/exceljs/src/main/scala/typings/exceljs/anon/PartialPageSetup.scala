package typings.exceljs.anon

import typings.exceljs.exceljsStrings.NA
import typings.exceljs.exceljsStrings.None
import typings.exceljs.exceljsStrings.asDisplayed
import typings.exceljs.exceljsStrings.atEnd
import typings.exceljs.exceljsStrings.blank
import typings.exceljs.exceljsStrings.dash
import typings.exceljs.exceljsStrings.displayed
import typings.exceljs.exceljsStrings.downThenOver
import typings.exceljs.exceljsStrings.landscape
import typings.exceljs.exceljsStrings.overThenDown
import typings.exceljs.exceljsStrings.portrait
import typings.exceljs.mod.Margins
import typings.exceljs.mod.PaperSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.PageSetup> */
trait PartialPageSetup extends StObject {
  
  var blackAndWhite: js.UndefOr[Boolean] = js.undefined
  
  var cellComments: js.UndefOr[atEnd | asDisplayed | None] = js.undefined
  
  var draft: js.UndefOr[Boolean] = js.undefined
  
  var errors: js.UndefOr[dash | blank | NA | displayed] = js.undefined
  
  var firstPageNumber: js.UndefOr[Double] = js.undefined
  
  var fitToHeight: js.UndefOr[Double] = js.undefined
  
  var fitToPage: js.UndefOr[Boolean] = js.undefined
  
  var fitToWidth: js.UndefOr[Double] = js.undefined
  
  var horizontalCentered: js.UndefOr[Boolean] = js.undefined
  
  var horizontalDpi: js.UndefOr[Double] = js.undefined
  
  var margins: js.UndefOr[Margins] = js.undefined
  
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
  
  var pageOrder: js.UndefOr[downThenOver | overThenDown] = js.undefined
  
  var paperSize: js.UndefOr[PaperSize] = js.undefined
  
  var printArea: js.UndefOr[String] = js.undefined
  
  var printTitlesColumn: js.UndefOr[String] = js.undefined
  
  var printTitlesRow: js.UndefOr[String] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
  
  var showGridLines: js.UndefOr[Boolean] = js.undefined
  
  var showRowColHeaders: js.UndefOr[Boolean] = js.undefined
  
  var verticalCentered: js.UndefOr[Boolean] = js.undefined
  
  var verticalDpi: js.UndefOr[Double] = js.undefined
}
object PartialPageSetup {
  
  inline def apply(): PartialPageSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPageSetup]
  }
  
  extension [Self <: PartialPageSetup](x: Self) {
    
    inline def setBlackAndWhite(value: Boolean): Self = StObject.set(x, "blackAndWhite", value.asInstanceOf[js.Any])
    
    inline def setBlackAndWhiteUndefined: Self = StObject.set(x, "blackAndWhite", js.undefined)
    
    inline def setCellComments(value: atEnd | asDisplayed | None): Self = StObject.set(x, "cellComments", value.asInstanceOf[js.Any])
    
    inline def setCellCommentsUndefined: Self = StObject.set(x, "cellComments", js.undefined)
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setErrors(value: dash | blank | NA | displayed): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setFirstPageNumber(value: Double): Self = StObject.set(x, "firstPageNumber", value.asInstanceOf[js.Any])
    
    inline def setFirstPageNumberUndefined: Self = StObject.set(x, "firstPageNumber", js.undefined)
    
    inline def setFitToHeight(value: Double): Self = StObject.set(x, "fitToHeight", value.asInstanceOf[js.Any])
    
    inline def setFitToHeightUndefined: Self = StObject.set(x, "fitToHeight", js.undefined)
    
    inline def setFitToPage(value: Boolean): Self = StObject.set(x, "fitToPage", value.asInstanceOf[js.Any])
    
    inline def setFitToPageUndefined: Self = StObject.set(x, "fitToPage", js.undefined)
    
    inline def setFitToWidth(value: Double): Self = StObject.set(x, "fitToWidth", value.asInstanceOf[js.Any])
    
    inline def setFitToWidthUndefined: Self = StObject.set(x, "fitToWidth", js.undefined)
    
    inline def setHorizontalCentered(value: Boolean): Self = StObject.set(x, "horizontalCentered", value.asInstanceOf[js.Any])
    
    inline def setHorizontalCenteredUndefined: Self = StObject.set(x, "horizontalCentered", js.undefined)
    
    inline def setHorizontalDpi(value: Double): Self = StObject.set(x, "horizontalDpi", value.asInstanceOf[js.Any])
    
    inline def setHorizontalDpiUndefined: Self = StObject.set(x, "horizontalDpi", js.undefined)
    
    inline def setMargins(value: Margins): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    inline def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
    
    inline def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPageOrder(value: downThenOver | overThenDown): Self = StObject.set(x, "pageOrder", value.asInstanceOf[js.Any])
    
    inline def setPageOrderUndefined: Self = StObject.set(x, "pageOrder", js.undefined)
    
    inline def setPaperSize(value: PaperSize): Self = StObject.set(x, "paperSize", value.asInstanceOf[js.Any])
    
    inline def setPaperSizeUndefined: Self = StObject.set(x, "paperSize", js.undefined)
    
    inline def setPrintArea(value: String): Self = StObject.set(x, "printArea", value.asInstanceOf[js.Any])
    
    inline def setPrintAreaUndefined: Self = StObject.set(x, "printArea", js.undefined)
    
    inline def setPrintTitlesColumn(value: String): Self = StObject.set(x, "printTitlesColumn", value.asInstanceOf[js.Any])
    
    inline def setPrintTitlesColumnUndefined: Self = StObject.set(x, "printTitlesColumn", js.undefined)
    
    inline def setPrintTitlesRow(value: String): Self = StObject.set(x, "printTitlesRow", value.asInstanceOf[js.Any])
    
    inline def setPrintTitlesRowUndefined: Self = StObject.set(x, "printTitlesRow", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setShowGridLines(value: Boolean): Self = StObject.set(x, "showGridLines", value.asInstanceOf[js.Any])
    
    inline def setShowGridLinesUndefined: Self = StObject.set(x, "showGridLines", js.undefined)
    
    inline def setShowRowColHeaders(value: Boolean): Self = StObject.set(x, "showRowColHeaders", value.asInstanceOf[js.Any])
    
    inline def setShowRowColHeadersUndefined: Self = StObject.set(x, "showRowColHeaders", js.undefined)
    
    inline def setVerticalCentered(value: Boolean): Self = StObject.set(x, "verticalCentered", value.asInstanceOf[js.Any])
    
    inline def setVerticalCenteredUndefined: Self = StObject.set(x, "verticalCentered", js.undefined)
    
    inline def setVerticalDpi(value: Double): Self = StObject.set(x, "verticalDpi", value.asInstanceOf[js.Any])
    
    inline def setVerticalDpiUndefined: Self = StObject.set(x, "verticalDpi", js.undefined)
  }
}
