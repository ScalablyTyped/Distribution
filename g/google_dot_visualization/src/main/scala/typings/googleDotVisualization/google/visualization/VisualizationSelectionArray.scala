package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualizationSelectionArray extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var row: js.UndefOr[Double] = js.undefined
}

object VisualizationSelectionArray {
  @scala.inline
  def apply(column: Int | Double = null, row: Int | Double = null): VisualizationSelectionArray = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualizationSelectionArray]
  }
}

