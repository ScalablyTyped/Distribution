package typings.exceljs.exceljsMod

import typings.exceljs.exceljsStrings.bottomLeft
import typings.exceljs.exceljsStrings.bottomRight
import typings.exceljs.exceljsStrings.pageBreakPreview
import typings.exceljs.exceljsStrings.pageLayout
import typings.exceljs.exceljsStrings.split
import typings.exceljs.exceljsStrings.topLeft
import typings.exceljs.exceljsStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetViewSplit extends js.Object {
  /**
  	 * Which pane will be active
  	 */
  var activePane: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight] = js.undefined
  /**
  	 * Where the view is split into 4 sections, each semi-independently scrollable.
  	 */
  var state: split
  /**
  	 * Presentation style
  	 */
  var style: js.UndefOr[pageBreakPreview | pageLayout] = js.undefined
  /**
  	 * Which cell will be top-left in the bottom-right pane
  	 */
  var topLeftCell: js.UndefOr[String] = js.undefined
  /**
  	 * How many points from the left to place the splitter.
  	 * To split vertically, set this to 0 or undefined
  	 */
  var xSplit: js.UndefOr[Double] = js.undefined
  /**
  	 * How many points from the top to place the splitter.
  	 * To split horizontally, set this to 0 or undefined
  	 */
  var ySplit: js.UndefOr[Double] = js.undefined
}

object WorksheetViewSplit {
  @scala.inline
  def apply(
    state: split,
    activePane: topLeft | topRight | bottomLeft | bottomRight = null,
    style: pageBreakPreview | pageLayout = null,
    topLeftCell: String = null,
    xSplit: Int | Double = null,
    ySplit: Int | Double = null
  ): WorksheetViewSplit = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (activePane != null) __obj.updateDynamic("activePane")(activePane.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (topLeftCell != null) __obj.updateDynamic("topLeftCell")(topLeftCell.asInstanceOf[js.Any])
    if (xSplit != null) __obj.updateDynamic("xSplit")(xSplit.asInstanceOf[js.Any])
    if (ySplit != null) __obj.updateDynamic("ySplit")(ySplit.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewSplit]
  }
}

