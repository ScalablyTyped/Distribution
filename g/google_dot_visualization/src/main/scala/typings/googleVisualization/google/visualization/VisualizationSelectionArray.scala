package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualizationSelectionArray extends StObject {
  
  var column: js.UndefOr[Double] = js.native
  
  var row: js.UndefOr[Double] = js.native
}
object VisualizationSelectionArray {
  
  @scala.inline
  def apply(): VisualizationSelectionArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualizationSelectionArray]
  }
  
  @scala.inline
  implicit class VisualizationSelectionArrayMutableBuilder[Self <: VisualizationSelectionArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
