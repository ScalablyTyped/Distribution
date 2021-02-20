package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxForm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorOptions extends StObject {
  
  var component: js.UndefOr[dxForm] = js.native
  
  var dataField: js.UndefOr[String] = js.native
  
  var editorOptions: js.UndefOr[js.Any] = js.native
  
  var editorType: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object EditorOptions {
  
  @scala.inline
  def apply(): EditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorOptions]
  }
  
  @scala.inline
  implicit class EditorOptionsMutableBuilder[Self <: EditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxForm): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    @scala.inline
    def setEditorOptions(value: js.Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorOptionsUndefined: Self = StObject.set(x, "editorOptions", js.undefined)
    
    @scala.inline
    def setEditorType(value: String): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorTypeUndefined: Self = StObject.set(x, "editorType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
