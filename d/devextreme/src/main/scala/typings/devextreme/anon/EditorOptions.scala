package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxForm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorOptions extends StObject {
  
  var component: js.UndefOr[dxForm] = js.undefined
  
  var dataField: js.UndefOr[String] = js.undefined
  
  var editorOptions: js.UndefOr[js.Any] = js.undefined
  
  var editorType: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object EditorOptions {
  
  inline def apply(): EditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorOptions]
  }
  
  extension [Self <: EditorOptions](x: Self) {
    
    inline def setComponent(value: dxForm): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setEditorOptions(value: js.Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
    
    inline def setEditorOptionsUndefined: Self = StObject.set(x, "editorOptions", js.undefined)
    
    inline def setEditorType(value: String): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
    
    inline def setEditorTypeUndefined: Self = StObject.set(x, "editorType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
