package typings.gestalt.mod

import typings.gestalt.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleExpandableProps extends StObject {
  
  var accessibilityCollapseLabel: String = js.native
  
  var accessibilityExpandLabel: String = js.native
  
  var id: String = js.native
  
  var items: js.Array[Children] = js.native
}
object ModuleExpandableProps {
  
  @scala.inline
  def apply(
    accessibilityCollapseLabel: String,
    accessibilityExpandLabel: String,
    id: String,
    items: js.Array[Children]
  ): ModuleExpandableProps = {
    val __obj = js.Dynamic.literal(accessibilityCollapseLabel = accessibilityCollapseLabel.asInstanceOf[js.Any], accessibilityExpandLabel = accessibilityExpandLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleExpandableProps]
  }
  
  @scala.inline
  implicit class ModuleExpandablePropsMutableBuilder[Self <: ModuleExpandableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityCollapseLabel(value: String): Self = StObject.set(x, "accessibilityCollapseLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityExpandLabel(value: String): Self = StObject.set(x, "accessibilityExpandLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[Children]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Children*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
