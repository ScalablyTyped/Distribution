package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualizationSelectionArray extends StObject {
  
  var column: js.UndefOr[Double] = js.undefined
  
  var row: js.UndefOr[Double] = js.undefined
}
object VisualizationSelectionArray {
  
  inline def apply(): VisualizationSelectionArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualizationSelectionArray]
  }
  
  extension [Self <: VisualizationSelectionArray](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
