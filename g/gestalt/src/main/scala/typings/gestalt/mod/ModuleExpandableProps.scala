package typings.gestalt.mod

import typings.gestalt.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleExpandableProps extends js.Object {
  
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
  implicit class ModuleExpandablePropsOps[Self <: ModuleExpandableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessibilityCollapseLabel(value: String): Self = this.set("accessibilityCollapseLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityExpandLabel(value: String): Self = this.set("accessibilityExpandLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Children*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Children]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
}
