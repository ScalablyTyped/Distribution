package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerElementEditor extends StObject {
  
  var content: String
  
  var editorType: Any
  
  var extendedOptions: Any
  
  var header: String
}
object ASPxDesignerElementEditor {
  
  inline def apply(content: String, editorType: Any, extendedOptions: Any, header: String): ASPxDesignerElementEditor = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], editorType = editorType.asInstanceOf[js.Any], extendedOptions = extendedOptions.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerElementEditor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxDesignerElementEditor] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setEditorType(value: Any): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
    
    inline def setExtendedOptions(value: Any): Self = StObject.set(x, "extendedOptions", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
