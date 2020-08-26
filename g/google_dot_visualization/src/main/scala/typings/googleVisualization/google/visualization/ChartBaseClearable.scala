package typings.googleVisualization.google.visualization

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartBaseClearable extends ChartBase {
  def clearChart(): Unit = js.native
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
  @scala.inline
  implicit class ChartBaseClearableOps[Self <: ChartBaseClearable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClearChart(value: () => Unit): Self = this.set("clearChart", js.Any.fromFunction0(value))
  }
  
}

