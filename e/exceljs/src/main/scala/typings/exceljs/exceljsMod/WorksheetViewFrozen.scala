package typings.exceljs.exceljsMod

import typings.exceljs.exceljsStrings.frozen
import typings.exceljs.exceljsStrings.pageBreakPreview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetViewFrozen extends js.Object {
  /**
  	 * Where a number of rows and columns to the top and left are frozen in place.
  	 * Only the bottom left section will scroll
  	 */
  var state: frozen
  /**
  	 * Presentation style
  	 */
  var style: js.UndefOr[pageBreakPreview] = js.undefined
  /**
  	 * Which cell will be top-left in the bottom-right pane. Note: cannot be a frozen cell.
  	 * Defaults to first unfrozen cell
  	 */
  var topLeftCell: js.UndefOr[String] = js.undefined
  /**
  	 * How many columns to freeze. To freeze rows only, set this to 0 or undefined
  	 */
  var xSplit: js.UndefOr[Double] = js.undefined
  /**
  	 * How many rows to freeze. To freeze columns only, set this to 0 or undefined
  	 */
  var ySplit: js.UndefOr[Double] = js.undefined
}

object WorksheetViewFrozen {
  @scala.inline
  def apply(
    state: frozen,
    style: pageBreakPreview = null,
    topLeftCell: String = null,
    xSplit: Int | Double = null,
    ySplit: Int | Double = null
  ): WorksheetViewFrozen = {
    val __obj = js.Dynamic.literal(state = state)
    if (style != null) __obj.updateDynamic("style")(style)
    if (topLeftCell != null) __obj.updateDynamic("topLeftCell")(topLeftCell)
    if (xSplit != null) __obj.updateDynamic("xSplit")(xSplit.asInstanceOf[js.Any])
    if (ySplit != null) __obj.updateDynamic("ySplit")(ySplit.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewFrozen]
  }
}

