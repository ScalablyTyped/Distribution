package typings.googleVisualization.google.visualization

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartBaseRenderable extends ChartBaseClearable {
  def getImageURI(): String
}

object ChartBaseRenderable {
  @scala.inline
  def apply(
    clearChart: () => Unit,
    getContainer: () => Element,
    getImageURI: () => String,
    getSelection: () => js.Array[VisualizationSelectionArray],
    setSelection: js.Array[VisualizationSelectionArray] => Unit
  ): ChartBaseRenderable = {
    val __obj = js.Dynamic.literal(clearChart = js.Any.fromFunction0(clearChart), getContainer = js.Any.fromFunction0(getContainer), getImageURI = js.Any.fromFunction0(getImageURI), getSelection = js.Any.fromFunction0(getSelection), setSelection = js.Any.fromFunction1(setSelection))
    __obj.asInstanceOf[ChartBaseRenderable]
  }
}

