package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableCellFilter extends StObject {
  
  var column: Double
  
  var maxValue: js.UndefOr[js.Any] = js.undefined
  
  var minValue: js.UndefOr[js.Any] = js.undefined
  
  var test: js.UndefOr[
    js.Function4[
      /* value */ js.Any, 
      /* row */ js.UndefOr[Double], 
      /* column */ js.UndefOr[Double], 
      /* data */ js.UndefOr[DataTable | DataView], 
      Boolean
    ]
  ] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object DataTableCellFilter {
  
  @scala.inline
  def apply(column: Double): DataTableCellFilter = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableCellFilter]
  }
  
  @scala.inline
  implicit class DataTableCellFilterMutableBuilder[Self <: DataTableCellFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValue(value: js.Any): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: js.Any): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setTest(
      value: (/* value */ js.Any, /* row */ js.UndefOr[Double], /* column */ js.UndefOr[Double], /* data */ js.UndefOr[DataTable | DataView]) => Boolean
    ): Self = StObject.set(x, "test", js.Any.fromFunction4(value))
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
