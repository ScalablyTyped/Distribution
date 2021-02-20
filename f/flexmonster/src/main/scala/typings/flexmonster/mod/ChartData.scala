package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartData extends StObject {
  
  var columns: js.UndefOr[js.Array[js.Object]] = js.native
  
  var element: js.Any = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var measure: js.UndefOr[MeasureObject] = js.native
  
  var rows: js.UndefOr[js.Array[js.Object]] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object ChartData {
  
  @scala.inline
  def apply(element: js.Any): ChartData = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData]
  }
  
  @scala.inline
  implicit class ChartDataMutableBuilder[Self <: ChartData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[js.Object]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: js.Object*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMeasure(value: MeasureObject): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[js.Object]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Object*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
