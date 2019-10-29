package typings.exceljs.exceljsMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetProperties extends js.Object {
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
    tabColor: Partial[Color]
  ): WorksheetProperties = {
    val __obj = js.Dynamic.literal(defaultRowHeight = defaultRowHeight, dyDescent = dyDescent, outlineLevelCol = outlineLevelCol, outlineLevelRow = outlineLevelRow, showGridLines = showGridLines, tabColor = tabColor)
  
    __obj.asInstanceOf[WorksheetProperties]
  }
}

