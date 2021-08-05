package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerEditorOptions extends StObject {
  
  var content: String
  
  var editorType: js.Any
  
  var header: String
}
object ASPxDesignerEditorOptions {
  
  inline def apply(content: String, editorType: js.Any, header: String): ASPxDesignerEditorOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], editorType = editorType.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerEditorOptions]
  }
  
  extension [Self <: ASPxDesignerEditorOptions](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setEditorType(value: js.Any): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
