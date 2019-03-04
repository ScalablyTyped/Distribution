package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetViewSplit extends js.Object {
  /**
  	 * Which pane will be active
  	 */
  var activePane: js.UndefOr[
    exceljsLib.exceljsLibStrings.topLeft | exceljsLib.exceljsLibStrings.topRight | exceljsLib.exceljsLibStrings.bottomLeft | exceljsLib.exceljsLibStrings.bottomRight
  ] = js.undefined
  /**
  	 * Where the view is split into 4 sections, each semi-independently scrollable.
  	 */
  var state: exceljsLib.exceljsLibStrings.split
  /**
  	 * Presentation style
  	 */
  var style: js.UndefOr[
    exceljsLib.exceljsLibStrings.pageBreakPreview | exceljsLib.exceljsLibStrings.pageLayout
  ] = js.undefined
  /**
  	 * Which cell will be top-left in the bottom-right pane
  	 */
  var topLeftCell: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * How many points from the left to place the splitter.
  	 * To split vertically, set this to 0 or undefined
  	 */
  var xSplit: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * How many points from the top to place the splitter.
  	 * To split horizontally, set this to 0 or undefined
  	 */
  var ySplit: js.UndefOr[scala.Double] = js.undefined
}

object WorksheetViewSplit {
  @scala.inline
  def apply(
    state: exceljsLib.exceljsLibStrings.split,
    activePane: exceljsLib.exceljsLibStrings.topLeft | exceljsLib.exceljsLibStrings.topRight | exceljsLib.exceljsLibStrings.bottomLeft | exceljsLib.exceljsLibStrings.bottomRight = null,
    style: exceljsLib.exceljsLibStrings.pageBreakPreview | exceljsLib.exceljsLibStrings.pageLayout = null,
    topLeftCell: java.lang.String = null,
    xSplit: scala.Int | scala.Double = null,
    ySplit: scala.Int | scala.Double = null
  ): WorksheetViewSplit = {
    val __obj = js.Dynamic.literal(state = state)
    if (activePane != null) __obj.updateDynamic("activePane")(activePane.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (topLeftCell != null) __obj.updateDynamic("topLeftCell")(topLeftCell)
    if (xSplit != null) __obj.updateDynamic("xSplit")(xSplit.asInstanceOf[js.Any])
    if (ySplit != null) __obj.updateDynamic("ySplit")(ySplit.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewSplit]
  }
}

