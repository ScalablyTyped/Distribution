package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxFilterBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorElement extends StObject {
  
  var component: js.UndefOr[dxFilterBuilder] = js.undefined
  
  var dataField: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var editorElement: js.UndefOr[dxElement] = js.undefined
  
  var editorName: js.UndefOr[String] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var filterOperation: js.UndefOr[String] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var rtlEnabled: js.UndefOr[Boolean] = js.undefined
  
  var setValue: js.UndefOr[js.Any] = js.undefined
  
  var updateValueTimeout: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object EditorElement {
  
  inline def apply(): EditorElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorElement]
  }
  
  extension [Self <: EditorElement](x: Self) {
    
    inline def setComponent(value: dxFilterBuilder): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEditorElement(value: dxElement): Self = StObject.set(x, "editorElement", value.asInstanceOf[js.Any])
    
    inline def setEditorElementUndefined: Self = StObject.set(x, "editorElement", js.undefined)
    
    inline def setEditorName(value: String): Self = StObject.set(x, "editorName", value.asInstanceOf[js.Any])
    
    inline def setEditorNameUndefined: Self = StObject.set(x, "editorName", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setFilterOperation(value: String): Self = StObject.set(x, "filterOperation", value.asInstanceOf[js.Any])
    
    inline def setFilterOperationUndefined: Self = StObject.set(x, "filterOperation", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
    
    inline def setRtlEnabledUndefined: Self = StObject.set(x, "rtlEnabled", js.undefined)
    
    inline def setSetValue(value: js.Any): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setUpdateValueTimeout(value: Double): Self = StObject.set(x, "updateValueTimeout", value.asInstanceOf[js.Any])
    
    inline def setUpdateValueTimeoutUndefined: Self = StObject.set(x, "updateValueTimeout", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
