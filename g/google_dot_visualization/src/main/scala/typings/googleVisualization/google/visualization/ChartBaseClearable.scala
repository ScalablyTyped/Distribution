package typings.googleVisualization.google.visualization

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartBaseClearable extends ChartBase {
  def clearChart(): Unit
}

object ChartBaseClearable {
  @scala.inline
  def apply(
    clearChart: () => Unit,
    getContainer: () => Element,
    getSelection: () => js.Array[VisualizationSelectionArray],
    setSelection: js.Array[VisualizationSelectionArray] => Unit
  ): ChartBaseClearable = {
    val __obj = js.Dynamic.literal(clearChart = js.Any.fromFunction0(clearChart), getContainer = js.Any.fromFunction0(getContainer), getSelection = js.Any.fromFunction0(getSelection), setSelection = js.Any.fromFunction1(setSelection))
    __obj.asInstanceOf[ChartBaseClearable]
  }
}

