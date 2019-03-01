package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetProperties extends js.Object {
  /**
  	 * Default row height (default: 15)
  	 */
  var defaultRowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * default: 55
  	 */
  var dyDescent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The worksheet column outline level (default: 0)
  	 */
  var outlineLevelCol: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The worksheet row outline level (default: 0)
  	 */
  var outlineLevelRow: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Color of the tab
  	 */
  var tabColor: js.UndefOr[Color] = js.undefined
}

object WorksheetProperties {
  @scala.inline
  def apply(
    defaultRowHeight: scala.Int | scala.Double = null,
    dyDescent: scala.Int | scala.Double = null,
    outlineLevelCol: scala.Int | scala.Double = null,
    outlineLevelRow: scala.Int | scala.Double = null,
    tabColor: Color = null
  ): WorksheetProperties = {
    val __obj = js.Dynamic.literal()
    if (defaultRowHeight != null) __obj.updateDynamic("defaultRowHeight")(defaultRowHeight.asInstanceOf[js.Any])
    if (dyDescent != null) __obj.updateDynamic("dyDescent")(dyDescent.asInstanceOf[js.Any])
    if (outlineLevelCol != null) __obj.updateDynamic("outlineLevelCol")(outlineLevelCol.asInstanceOf[js.Any])
    if (outlineLevelRow != null) __obj.updateDynamic("outlineLevelRow")(outlineLevelRow.asInstanceOf[js.Any])
    if (tabColor != null) __obj.updateDynamic("tabColor")(tabColor)
    __obj.asInstanceOf[WorksheetProperties]
  }
}

