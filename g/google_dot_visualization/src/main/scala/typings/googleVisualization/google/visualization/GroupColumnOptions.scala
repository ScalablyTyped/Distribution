package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupColumnOptions extends StObject {
  
  def aggregation(values: js.Array[_]): js.Any = js.native
  
  var column: Double = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
}
object GroupColumnOptions {
  
  @scala.inline
  def apply(aggregation: js.Array[_] => js.Any, column: Double, `type`: String): GroupColumnOptions = {
    val __obj = js.Dynamic.literal(aggregation = js.Any.fromFunction1(aggregation), column = column.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupColumnOptions]
  }
  
  @scala.inline
  implicit class GroupColumnOptionsMutableBuilder[Self <: GroupColumnOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregation(value: js.Array[_] => js.Any): Self = StObject.set(x, "aggregation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
