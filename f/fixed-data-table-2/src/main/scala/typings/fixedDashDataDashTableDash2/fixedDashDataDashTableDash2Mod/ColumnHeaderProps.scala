package typings.fixedDashDataDashTableDash2.fixedDashDataDashTableDash2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnHeaderProps extends js.Object {
  var columnKey: js.UndefOr[String] = js.undefined
  /** supplied from the Table or rowHeightGetter */
  var height: Double
  /** supplied from the Column */
  var width: Double
}

object ColumnHeaderProps {
  @scala.inline
  def apply(height: Double, width: Double, columnKey: String = null): ColumnHeaderProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnHeaderProps]
  }
}

