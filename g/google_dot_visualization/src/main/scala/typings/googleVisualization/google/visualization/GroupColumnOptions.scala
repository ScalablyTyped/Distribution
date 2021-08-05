package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupColumnOptions extends StObject {
  
  def aggregation(values: js.Array[js.Any]): js.Any
  
  var column: Double
  
  var id: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object GroupColumnOptions {
  
  inline def apply(aggregation: js.Array[js.Any] => js.Any, column: Double, `type`: String): GroupColumnOptions = {
    val __obj = js.Dynamic.literal(aggregation = js.Any.fromFunction1(aggregation), column = column.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupColumnOptions]
  }
  
  extension [Self <: GroupColumnOptions](x: Self) {
    
    inline def setAggregation(value: js.Array[js.Any] => js.Any): Self = StObject.set(x, "aggregation", js.Any.fromFunction1(value))
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
