package typings.googleVisualization.google.visualization

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartBaseRenderable extends ChartBaseClearable {
  
  def getImageURI(): String = js.native
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
  
  @scala.inline
  implicit class ChartBaseRenderableMutableBuilder[Self <: ChartBaseRenderable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetImageURI(value: () => String): Self = StObject.set(x, "getImageURI", js.Any.fromFunction0(value))
  }
}
