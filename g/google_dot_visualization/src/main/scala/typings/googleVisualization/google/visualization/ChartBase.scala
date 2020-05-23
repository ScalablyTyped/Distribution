package typings.googleVisualization.google.visualization

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartBase extends js.Object {
  def getContainer(): Element
  def getSelection(): js.Array[VisualizationSelectionArray]
  def setSelection(selection: js.Array[VisualizationSelectionArray]): Unit
}

object ChartBase {
  @scala.inline
  def apply(
    getContainer: () => Element,
    getSelection: () => js.Array[VisualizationSelectionArray],
    setSelection: js.Array[VisualizationSelectionArray] => Unit
  ): ChartBase = {
    val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction0(getContainer), getSelection = js.Any.fromFunction0(getSelection), setSelection = js.Any.fromFunction1(setSelection))
    __obj.asInstanceOf[ChartBase]
  }
}

