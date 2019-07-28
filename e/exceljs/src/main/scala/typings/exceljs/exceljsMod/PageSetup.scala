package typings.exceljs.exceljsMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSetup extends js.Object {
  /**
  	 * Print without colour
  	 *
  	 * false by default
  	 */
  var blackAndWhite: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Where to place comments
  	 *
  	 * Default is `None`
  	 */
  var cellComments: js.UndefOr[atEnd | asDisplayed | None] = js.undefined
  /**
  	 * Print with less quality (and ink)
  	 *
  	 * false by default
  	 */
  var draft: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Where to show errors
  	 *
  	 * Default is `displayed`
  	 */
  var errors: js.UndefOr[dash | blank | NA | displayed] = js.undefined
  /**
  	 * Which number to use for the first page
  	 */
  var firstPageNumber: js.UndefOr[Double] = js.undefined
  /**
  	 * How many pages high the sheet should print on to. Active when fitToPage is true
  	 *
  	 * Default is 1
  	 */
  var fitToHeight: js.UndefOr[Double] = js.undefined
  /**
  	 * Whether to use fitToWidth and fitToHeight or scale settings.
  	 *
  	 * Default is based on presence of these settings in the pageSetup object - if both are present,
  	 * scale wins (i.e. default will be false)
  	 */
  var fitToPage: js.UndefOr[Boolean] = js.undefined
  /**
  	 * How many pages wide the sheet should print on to. Active when fitToPage is true
  	 *
  	 * Default is 1
  	 */
  var fitToWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * 	Whether to center the sheet data horizontally, `false` by default
  	 */
  var horizontalCentered: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Horizontal Dots per Inch. Default value is 4294967295
  	 */
  var horizontalDpi: js.UndefOr[Double] = js.undefined
  /**
  	 * Whitespace on the borders of the page. Units are inches.
  	 */
  var margins: js.UndefOr[Margins] = js.undefined
  /**
  	 * Orientation of the page - i.e. taller (`'portrait'`) or wider (`'landscape'`).
  	 *
  	 * `'portrait'` by default
  	 */
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
  /**
  	 * Which order to print the pages.
  	 *
  	 * Default is `downThenOver`
  	 */
  var pageOrder: js.UndefOr[downThenOver | overThenDown] = js.undefined
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
  var paperSize: js.UndefOr[PaperSize] = js.undefined
  /**
  	 * Set Print Area for a sheet, e.g. `'A1:G20'`
  	 */
  var printArea: js.UndefOr[String] = js.undefined
  /**
  	 * Repeat specific rows on every printed page, e.g. `'1:3'`
  	 */
  var printTitlesRow: js.UndefOr[String] = js.undefined
  /**
  	 * Percentage value to increase or reduce the size of the print. Active when fitToPage is false
  	 *
  	 * Default is 100
  	 */
  var scale: js.UndefOr[Double] = js.undefined
  /**
  	 * Whether to show grid lines, `false` by default
  	 */
  var showGridLines: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Whether to show the row numbers and column letters, `false` by default
  	 */
  var showRowColHeaders: js.UndefOr[Boolean] = js.undefined
  /**
  	 * 	Whether to center the sheet data vertically, `false` by default
  	 */
  var verticalCentered: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Vertical Dots per Inch. Default value is 4294967295
  	 */
  var verticalDpi: js.UndefOr[Double] = js.undefined
}

object PageSetup {
  @scala.inline
  def apply(
    blackAndWhite: js.UndefOr[Boolean] = js.undefined,
    cellComments: atEnd | asDisplayed | None = null,
    draft: js.UndefOr[Boolean] = js.undefined,
    errors: dash | blank | NA | displayed = null,
    firstPageNumber: Int | Double = null,
    fitToHeight: Int | Double = null,
    fitToPage: js.UndefOr[Boolean] = js.undefined,
    fitToWidth: Int | Double = null,
    horizontalCentered: js.UndefOr[Boolean] = js.undefined,
    horizontalDpi: Int | Double = null,
    margins: Margins = null,
    orientation: portrait | landscape = null,
    pageOrder: downThenOver | overThenDown = null,
    paperSize: PaperSize = null,
    printArea: String = null,
    printTitlesRow: String = null,
    scale: Int | Double = null,
    showGridLines: js.UndefOr[Boolean] = js.undefined,
    showRowColHeaders: js.UndefOr[Boolean] = js.undefined,
    verticalCentered: js.UndefOr[Boolean] = js.undefined,
    verticalDpi: Int | Double = null
  ): PageSetup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blackAndWhite)) __obj.updateDynamic("blackAndWhite")(blackAndWhite)
    if (cellComments != null) __obj.updateDynamic("cellComments")(cellComments.asInstanceOf[js.Any])
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft)
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (firstPageNumber != null) __obj.updateDynamic("firstPageNumber")(firstPageNumber.asInstanceOf[js.Any])
    if (fitToHeight != null) __obj.updateDynamic("fitToHeight")(fitToHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(fitToPage)) __obj.updateDynamic("fitToPage")(fitToPage)
    if (fitToWidth != null) __obj.updateDynamic("fitToWidth")(fitToWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalCentered)) __obj.updateDynamic("horizontalCentered")(horizontalCentered)
    if (horizontalDpi != null) __obj.updateDynamic("horizontalDpi")(horizontalDpi.asInstanceOf[js.Any])
    if (margins != null) __obj.updateDynamic("margins")(margins)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pageOrder != null) __obj.updateDynamic("pageOrder")(pageOrder.asInstanceOf[js.Any])
    if (paperSize != null) __obj.updateDynamic("paperSize")(paperSize)
    if (printArea != null) __obj.updateDynamic("printArea")(printArea)
    if (printTitlesRow != null) __obj.updateDynamic("printTitlesRow")(printTitlesRow)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(showGridLines)) __obj.updateDynamic("showGridLines")(showGridLines)
    if (!js.isUndefined(showRowColHeaders)) __obj.updateDynamic("showRowColHeaders")(showRowColHeaders)
    if (!js.isUndefined(verticalCentered)) __obj.updateDynamic("verticalCentered")(verticalCentered)
    if (verticalDpi != null) __obj.updateDynamic("verticalDpi")(verticalDpi.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSetup]
  }
}

