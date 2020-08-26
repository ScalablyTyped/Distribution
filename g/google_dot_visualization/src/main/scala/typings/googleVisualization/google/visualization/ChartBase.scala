package typings.googleVisualization.google.visualization

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartBase extends js.Object {
  def getContainer(): Element = js.native
  def getSelection(): js.Array[VisualizationSelectionArray] = js.native
  def setSelection(selection: js.Array[VisualizationSelectionArray]): Unit = js.native
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
  @scala.inline
  implicit class ChartBaseOps[Self <: ChartBase] (val x: Self) extends AnyVal {
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
    def setGetContainer(value: () => Element): Self = this.set("getContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSelection(value: () => js.Array[VisualizationSelectionArray]): Self = this.set("getSelection", js.Any.fromFunction0(value))
    @scala.inline
    def setSetSelection(value: js.Array[VisualizationSelectionArray] => Unit): Self = this.set("setSelection", js.Any.fromFunction1(value))
  }
  
}

