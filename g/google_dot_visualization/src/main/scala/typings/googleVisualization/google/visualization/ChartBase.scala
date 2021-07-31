package typings.googleVisualization.google.visualization

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartBase extends StObject {
  
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
  
  @scala.inline
  implicit class ChartBaseMutableBuilder[Self <: ChartBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetContainer(value: () => Element): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelection(value: () => js.Array[VisualizationSelectionArray]): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSelection(value: js.Array[VisualizationSelectionArray] => Unit): Self = StObject.set(x, "setSelection", js.Any.fromFunction1(value))
  }
}
