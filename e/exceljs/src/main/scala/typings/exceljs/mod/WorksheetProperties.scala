package typings.exceljs.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetProperties extends js.Object {
  /**
  	 * Default column width (optional)
  	 */
  var defaultColWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * Default row height (default: 15)
  	 */
  var defaultRowHeight: Double
  /**
  	 * default: 55
  	 */
  var dyDescent: Double
  /**
  	 * The worksheet column outline level (default: 0)
  	 */
  var outlineLevelCol: Double
  /**
  	 * The worksheet row outline level (default: 0)
  	 */
  var outlineLevelRow: Double
  var showGridLines: Boolean
  /**
  	 * Color of the tab
  	 */
  var tabColor: Partial[Color]
}

object WorksheetProperties {
  @scala.inline
  def apply(
    defaultRowHeight: Double,
    dyDescent: Double,
    outlineLevelCol: Double,
    outlineLevelRow: Double,
    showGridLines: Boolean,
    tabColor: Partial[Color],
    defaultColWidth: Int | Double = null
  ): WorksheetProperties = {
    val __obj = js.Dynamic.literal(defaultRowHeight = defaultRowHeight.asInstanceOf[js.Any], dyDescent = dyDescent.asInstanceOf[js.Any], outlineLevelCol = outlineLevelCol.asInstanceOf[js.Any], outlineLevelRow = outlineLevelRow.asInstanceOf[js.Any], showGridLines = showGridLines.asInstanceOf[js.Any], tabColor = tabColor.asInstanceOf[js.Any])
    if (defaultColWidth != null) __obj.updateDynamic("defaultColWidth")(defaultColWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetProperties]
  }
}

