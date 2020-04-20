package typings.fixedDataTable2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnGroupHeaderProps extends js.Object {
  /* supplied from the groupHeaderHeight */
  var height: Double
  /* supplied from the Column */
  var width: Double
}

object ColumnGroupHeaderProps {
  @scala.inline
  def apply(height: Double, width: Double): ColumnGroupHeaderProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupHeaderProps]
  }
}

