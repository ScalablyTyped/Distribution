package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerElementSerializationInfo extends StObject {
  
  var array: Boolean
  
  var defaultVal: Any
  
  var disabled: Any
  
  var displayName: String
  
  var editor: ASPxDesignerElementEditor
  
  var info: js.Array[ASPxDesignerElementSerializationInfo]
  
  var link: Boolean
  
  var modelName: String
  
  var propertyName: String
  
  var validationRules: js.Array[Any]
  
  var valuesArray: js.Array[ASPxDesignerElementEditorItem]
  
  var visible: Any
}
object ASPxDesignerElementSerializationInfo {
  
  inline def apply(
    array: Boolean,
    defaultVal: Any,
    disabled: Any,
    displayName: String,
    editor: ASPxDesignerElementEditor,
    info: js.Array[ASPxDesignerElementSerializationInfo],
    link: Boolean,
    modelName: String,
    propertyName: String,
    validationRules: js.Array[Any],
    valuesArray: js.Array[ASPxDesignerElementEditorItem],
    visible: Any
  ): ASPxDesignerElementSerializationInfo = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], defaultVal = defaultVal.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], validationRules = validationRules.asInstanceOf[js.Any], valuesArray = valuesArray.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerElementSerializationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxDesignerElementSerializationInfo] (val x: Self) extends AnyVal {
    
    inline def setArray(value: Boolean): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setDefaultVal(value: Any): Self = StObject.set(x, "defaultVal", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEditor(value: ASPxDesignerElementEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: js.Array[ASPxDesignerElementSerializationInfo]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoVarargs(value: ASPxDesignerElementSerializationInfo*): Self = StObject.set(x, "info", js.Array(value*))
    
    inline def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setValidationRules(value: js.Array[Any]): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
    
    inline def setValidationRulesVarargs(value: Any*): Self = StObject.set(x, "validationRules", js.Array(value*))
    
    inline def setValuesArray(value: js.Array[ASPxDesignerElementEditorItem]): Self = StObject.set(x, "valuesArray", value.asInstanceOf[js.Any])
    
    inline def setValuesArrayVarargs(value: ASPxDesignerElementEditorItem*): Self = StObject.set(x, "valuesArray", js.Array(value*))
    
    inline def setVisible(value: Any): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
