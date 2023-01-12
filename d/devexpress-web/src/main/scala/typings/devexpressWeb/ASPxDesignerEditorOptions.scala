package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerEditorOptions extends StObject {
  
  var content: String
  
  var editorType: Any
  
  var header: String
}
object ASPxDesignerEditorOptions {
  
  inline def apply(content: String, editorType: Any, header: String): ASPxDesignerEditorOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], editorType = editorType.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerEditorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxDesignerEditorOptions] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setEditorType(value: Any): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
