package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualizationSelectionArray extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var row: js.UndefOr[Double] = js.undefined
}

object VisualizationSelectionArray {
  @scala.inline
  def apply(column: js.UndefOr[Double] = js.undefined, row: js.UndefOr[Double] = js.undefined): VisualizationSelectionArray = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualizationSelectionArray]
  }
}

