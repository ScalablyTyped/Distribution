package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualizationSelectionArray extends js.Object {
  var column: js.UndefOr[scala.Double] = js.undefined
  var row: js.UndefOr[scala.Double] = js.undefined
}

object VisualizationSelectionArray {
  @scala.inline
  def apply(column: scala.Int | scala.Double = null, row: scala.Int | scala.Double = null): VisualizationSelectionArray = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualizationSelectionArray]
  }
}

