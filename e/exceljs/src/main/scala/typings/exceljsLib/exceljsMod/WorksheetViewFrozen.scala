package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WorksheetViewFrozen extends js.Object {
  /**
  	 * Where a number of rows and columns to the top and left are frozen in place.
  	 * Only the bottom left section will scroll
  	 */
  var state: exceljsLib.exceljsLibStrings.frozen
  /**
  	 * Presentation style
  	 */
  var style: js.UndefOr[exceljsLib.exceljsLibStrings.pageBreakPreview] = js.undefined
  /**
  	 * Which cell will be top-left in the bottom-right pane. Note: cannot be a frozen cell.
  	 * Defaults to first unfrozen cell
  	 */
  var topLeftCell: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * How many columns to freeze. To freeze rows only, set this to 0 or undefined
  	 */
  var xSplit: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * How many rows to freeze. To freeze columns only, set this to 0 or undefined
  	 */
  var ySplit: js.UndefOr[scala.Double] = js.undefined
}

