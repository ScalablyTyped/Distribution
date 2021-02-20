package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventCallTypeParam extends StObject {
  
  var editor: String = js.native
  
  var field: String = js.native
  
  var label: String = js.native
}
object EventCallTypeParam {
  
  @scala.inline
  def apply(editor: String, field: String, label: String): EventCallTypeParam = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCallTypeParam]
  }
  
  @scala.inline
  implicit class EventCallTypeParamMutableBuilder[Self <: EventCallTypeParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditor(value: String): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
