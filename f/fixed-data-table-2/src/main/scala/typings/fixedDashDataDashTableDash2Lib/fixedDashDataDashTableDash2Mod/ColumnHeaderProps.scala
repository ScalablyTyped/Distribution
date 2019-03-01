package typings
package fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnHeaderProps extends js.Object {
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /** supplied from the Table or rowHeightGetter */
  var height: scala.Double
  /** supplied from the Column */
  var width: scala.Double
}

object ColumnHeaderProps {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, columnKey: java.lang.String = null): ColumnHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    __obj.asInstanceOf[ColumnHeaderProps]
  }
}

