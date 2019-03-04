package typings
package fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps extends js.Object {
  /** supplied from the Table or rowHeightGetter */
  var height: scala.Double
  /** the row index */
  var rowIndex: scala.Double
  /** supplied from the Table */
  var width: scala.Double
}

object RowProps {
  @scala.inline
  def apply(height: scala.Double, rowIndex: scala.Double, width: scala.Double): RowProps = {
    val __obj = js.Dynamic.literal(height = height, rowIndex = rowIndex, width = width)
  
    __obj.asInstanceOf[RowProps]
  }
}

