package typings
package fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnGroupHeaderProps extends js.Object {
  /* supplied from the groupHeaderHeight */
  var height: scala.Double
  /* supplied from the Column */
  var width: scala.Double
}

object ColumnGroupHeaderProps {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): ColumnGroupHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ColumnGroupHeaderProps]
  }
}

