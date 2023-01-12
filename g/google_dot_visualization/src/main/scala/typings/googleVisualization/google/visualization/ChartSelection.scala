package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSelection extends StObject {
  
  var column: js.UndefOr[Double | Null] = js.undefined
  
  var row: js.UndefOr[Double | Null] = js.undefined
}
object ChartSelection {
  
  inline def apply(): ChartSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartSelection] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnNull: Self = StObject.set(x, "column", null)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowNull: Self = StObject.set(x, "row", null)
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
