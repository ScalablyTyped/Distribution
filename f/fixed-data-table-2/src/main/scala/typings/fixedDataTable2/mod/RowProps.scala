package typings.fixedDataTable2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps extends js.Object {
  /** supplied from the Table or rowHeightGetter */
  var height: Double
  /** the row index */
  var rowIndex: Double
  /** supplied from the Table */
  var width: Double
}

object RowProps {
  @scala.inline
  def apply(height: Double, rowIndex: Double, width: Double): RowProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowProps]
  }
}

