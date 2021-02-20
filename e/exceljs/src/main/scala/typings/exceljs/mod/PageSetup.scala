package typings.exceljs.mod

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageSetup extends StObject {
  
  /**
  	 * Print without colour
  	 *
  	 * false by default
  	 */
  var blackAndWhite: Boolean = js.native
  
  /**
  	 * Where to place comments
  	 *
  	 * Default is `None`
  	 */
  var cellComments: atEnd | asDisplayed | None = js.native
  
  /**
  	 * Print with less quality (and ink)
  	 *
  	 * false by default
  	 */
  var draft: Boolean = js.native
  
  /**
  	 * Where to show errors
  	 *
  	 * Default is `displayed`
  	 */
  var errors: dash | blank | NA | displayed = js.native
  
  /**
  	 * Which number to use for the first page
  	 */
  var firstPageNumber: Double = js.native
  
  /**
  	 * How many pages high the sheet should print on to. Active when fitToPage is true
  	 *
  	 * Default is 1
  	 */
  var fitToHeight: Double = js.native
  
  /**
  	 * Whether to use fitToWidth and fitToHeight or scale settings.
  	 *
  	 * Default is based on presence of these settings in the pageSetup object - if both are present,
  	 * scale wins (i.e. default will be false)
  	 */
  var fitToPage: Boolean = js.native
  
  /**
  	 * How many pages wide the sheet should print on to. Active when fitToPage is true
  	 *
  	 * Default is 1
  	 */
  var fitToWidth: Double = js.native
  
  /**
  	 * 	Whether to center the sheet data horizontally, `false` by default
  	 */
  var horizontalCentered: Boolean = js.native
  
  /**
  	 * Horizontal Dots per Inch. Default value is 4294967295
  	 */
  var horizontalDpi: Double = js.native
  
  /**
  	 * Whitespace on the borders of the page. Units are inches.
  	 */
  var margins: Margins = js.native
  
  /**
  	 * Orientation of the page - i.e. taller (`'portrait'`) or wider (`'landscape'`).
  	 *
  	 * `'portrait'` by default
  	 */
  var orientation: portrait | landscape = js.native
  
  /**
  	 * Which order to print the pages.
  	 *
  	 * Default is `downThenOver`
  	 */
  var pageOrder: downThenOver | overThenDown = js.native
  
  /**
  	 * 	What paper size to use (see below)
  	 *
  	 * | Name                          | Value       |
  	 * | ----------------------------- | ---------   |
  	 * | Letter                        | `undefined` |
  	 * | Legal                         |  `5`        |
  	 * | Executive                     |  `7`        |
  	 * | A4                            |  `9`        |
  	 * | A5                            |  `11`       |
  	 * | B5 (JIS)                      |  `13`       |
  	 * | Envelope #10                  |  `20`       |
  	 * | Envelope DL                   |  `27`       |
  	 * | Envelope C5                   |  `28`       |
  	 * | Envelope B5                   |  `34`       |
  	 * | Envelope Monarch              |  `37`       |
  	 * | Double Japan Postcard Rotated |  `82`       |
  	 * | 16K 197x273 mm                |  `119`      |
  	 */
  var paperSize: PaperSize = js.native
  
  /**
  	 * Set Print Area for a sheet, e.g. `'A1:G20'`
  	 */
  var printArea: String = js.native
  
  /**
  	 * Repeat specific columns on every printed page, e.g. `'A:C'`
  	 */
  var printTitlesColumn: String = js.native
  
  /**
  	 * Repeat specific rows on every printed page, e.g. `'1:3'`
  	 */
  var printTitlesRow: String = js.native
  
  /**
  	 * Percentage value to increase or reduce the size of the print. Active when fitToPage is false
  	 *
  	 * Default is 100
  	 */
  var scale: Double = js.native
  
  /**
  	 * Whether to show grid lines, `false` by default
  	 */
  var showGridLines: Boolean = js.native
  
  /**
  	 * Whether to show the row numbers and column letters, `false` by default
  	 */
  var showRowColHeaders: Boolean = js.native
  
  /**
  	 * 	Whether to center the sheet data vertically, `false` by default
  	 */
  var verticalCentered: Boolean = js.native
  
  /**
  	 * Vertical Dots per Inch. Default value is 4294967295
  	 */
  var verticalDpi: Double = js.native
}
object PageSetup {
  
  @scala.inline
  def apply(
    blackAndWhite: Boolean,
    cellComments: atEnd | asDisplayed | None,
    draft: Boolean,
    errors: dash | blank | NA | displayed,
    firstPageNumber: Double,
    fitToHeight: Double,
    fitToPage: Boolean,
    fitToWidth: Double,
    horizontalCentered: Boolean,
    horizontalDpi: Double,
    margins: Margins,
    orientation: portrait | landscape,
    pageOrder: downThenOver | overThenDown,
    paperSize: PaperSize,
    printArea: String,
    printTitlesColumn: String,
    printTitlesRow: String,
    scale: Double,
    showGridLines: Boolean,
    showRowColHeaders: Boolean,
    verticalCentered: Boolean,
    verticalDpi: Double
  ): PageSetup = {
    val __obj = js.Dynamic.literal(blackAndWhite = blackAndWhite.asInstanceOf[js.Any], cellComments = cellComments.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], firstPageNumber = firstPageNumber.asInstanceOf[js.Any], fitToHeight = fitToHeight.asInstanceOf[js.Any], fitToPage = fitToPage.asInstanceOf[js.Any], fitToWidth = fitToWidth.asInstanceOf[js.Any], horizontalCentered = horizontalCentered.asInstanceOf[js.Any], horizontalDpi = horizontalDpi.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pageOrder = pageOrder.asInstanceOf[js.Any], paperSize = paperSize.asInstanceOf[js.Any], printArea = printArea.asInstanceOf[js.Any], printTitlesColumn = printTitlesColumn.asInstanceOf[js.Any], printTitlesRow = printTitlesRow.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], showGridLines = showGridLines.asInstanceOf[js.Any], showRowColHeaders = showRowColHeaders.asInstanceOf[js.Any], verticalCentered = verticalCentered.asInstanceOf[js.Any], verticalDpi = verticalDpi.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSetup]
  }
  
  @scala.inline
  implicit class PageSetupMutableBuilder[Self <: PageSetup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlackAndWhite(value: Boolean): Self = StObject.set(x, "blackAndWhite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellComments(value: atEnd | asDisplayed | None): Self = StObject.set(x, "cellComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: dash | blank | NA | displayed): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageNumber(value: Double): Self = StObject.set(x, "firstPageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitToHeight(value: Double): Self = StObject.set(x, "fitToHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitToPage(value: Boolean): Self = StObject.set(x, "fitToPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitToWidth(value: Double): Self = StObject.set(x, "fitToWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalCentered(value: Boolean): Self = StObject.set(x, "horizontalCentered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalDpi(value: Double): Self = StObject.set(x, "horizontalDpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargins(value: Margins): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageOrder(value: downThenOver | overThenDown): Self = StObject.set(x, "pageOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperSize(value: PaperSize): Self = StObject.set(x, "paperSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintArea(value: String): Self = StObject.set(x, "printArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintTitlesColumn(value: String): Self = StObject.set(x, "printTitlesColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintTitlesRow(value: String): Self = StObject.set(x, "printTitlesRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGridLines(value: Boolean): Self = StObject.set(x, "showGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRowColHeaders(value: Boolean): Self = StObject.set(x, "showRowColHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalCentered(value: Boolean): Self = StObject.set(x, "verticalCentered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalDpi(value: Double): Self = StObject.set(x, "verticalDpi", value.asInstanceOf[js.Any])
  }
}
