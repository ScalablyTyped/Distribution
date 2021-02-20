package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxDesignerElementEditor extends StObject {
  
  var content: String = js.native
  
  var editorType: js.Any = js.native
  
  var extendedOptions: js.Any = js.native
  
  var header: String = js.native
}
object ASPxDesignerElementEditor {
  
  @scala.inline
  def apply(content: String, editorType: js.Any, extendedOptions: js.Any, header: String): ASPxDesignerElementEditor = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], editorType = editorType.asInstanceOf[js.Any], extendedOptions = extendedOptions.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerElementEditor]
  }
  
  @scala.inline
  implicit class ASPxDesignerElementEditorMutableBuilder[Self <: ASPxDesignerElementEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorType(value: js.Any): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedOptions(value: js.Any): Self = StObject.set(x, "extendedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
