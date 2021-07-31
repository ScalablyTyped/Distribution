package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupKeyOptions extends StObject {
  
  var column: Double
  
  var id: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var modifier: js.UndefOr[js.Function1[/* value */ js.Any, js.Any]] = js.undefined
  
  var `type`: String
}
object GroupKeyOptions {
  
  @scala.inline
  def apply(column: Double, `type`: String): GroupKeyOptions = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupKeyOptions]
  }
  
  @scala.inline
  implicit class GroupKeyOptionsMutableBuilder[Self <: GroupKeyOptions] (val x: Self) extends AnyVal {
    
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
    def setModifier(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "modifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
