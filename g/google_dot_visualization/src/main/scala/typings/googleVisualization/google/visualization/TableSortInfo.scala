package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableSortInfo extends js.Object {
  var ascending: Boolean
  var column: Double
  var sortedIndexes: js.Array[Double]
}

object TableSortInfo {
  @scala.inline
  def apply(ascending: Boolean, column: Double, sortedIndexes: js.Array[Double]): TableSortInfo = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], sortedIndexes = sortedIndexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSortInfo]
  }
}

