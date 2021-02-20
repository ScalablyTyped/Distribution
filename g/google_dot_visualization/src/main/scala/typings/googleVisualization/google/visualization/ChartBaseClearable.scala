package typings.googleVisualization.google.visualization

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ChartBaseClearableMutableBuilder[Self <: ChartBaseClearable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearChart(value: () => Unit): Self = StObject.set(x, "clearChart", js.Any.fromFunction0(value))
  }
}
