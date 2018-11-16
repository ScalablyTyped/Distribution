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

