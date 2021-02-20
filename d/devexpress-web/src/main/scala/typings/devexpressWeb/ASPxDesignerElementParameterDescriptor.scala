package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxDesignerElementParameterDescriptor extends StObject {
  
  var description: String = js.native
  
  var name: String = js.native
  
  var `type`: String = js.native
  
  var value: js.Any = js.native
  
  var visible: Boolean = js.native
}
object ASPxDesignerElementParameterDescriptor {
  
  @scala.inline
  def apply(description: String, name: String, `type`: String, value: js.Any, visible: Boolean): ASPxDesignerElementParameterDescriptor = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerElementParameterDescriptor]
  }
  
  @scala.inline
  implicit class ASPxDesignerElementParameterDescriptorMutableBuilder[Self <: ASPxDesignerElementParameterDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
