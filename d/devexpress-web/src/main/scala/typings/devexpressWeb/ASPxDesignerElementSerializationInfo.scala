package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxDesignerElementSerializationInfo extends StObject {
  
  var array: Boolean = js.native
  
  var defaultVal: js.Any = js.native
  
  var disabled: js.Any = js.native
  
  var displayName: String = js.native
  
  var editor: ASPxDesignerElementEditor = js.native
  
  var info: js.Array[ASPxDesignerElementSerializationInfo] = js.native
  
  var link: Boolean = js.native
  
  var modelName: String = js.native
  
  var propertyName: String = js.native
  
  var validationRules: js.Array[_] = js.native
  
  var valuesArray: js.Array[ASPxDesignerElementEditorItem] = js.native
  
  var visible: js.Any = js.native
}
object ASPxDesignerElementSerializationInfo {
  
  @scala.inline
  def apply(
    array: Boolean,
    defaultVal: js.Any,
    disabled: js.Any,
    displayName: String,
    editor: ASPxDesignerElementEditor,
    info: js.Array[ASPxDesignerElementSerializationInfo],
    link: Boolean,
    modelName: String,
    propertyName: String,
    validationRules: js.Array[_],
    valuesArray: js.Array[ASPxDesignerElementEditorItem],
    visible: js.Any
  ): ASPxDesignerElementSerializationInfo = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], defaultVal = defaultVal.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], validationRules = validationRules.asInstanceOf[js.Any], valuesArray = valuesArray.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerElementSerializationInfo]
  }
  
  @scala.inline
  implicit class ASPxDesignerElementSerializationInfoMutableBuilder[Self <: ASPxDesignerElementSerializationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: Boolean): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVal(value: js.Any): Self = StObject.set(x, "defaultVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: js.Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: ASPxDesignerElementEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: js.Array[ASPxDesignerElementSerializationInfo]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoVarargs(value: ASPxDesignerElementSerializationInfo*): Self = StObject.set(x, "info", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationRules(value: js.Array[_]): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationRulesVarargs(value: js.Any*): Self = StObject.set(x, "validationRules", js.Array(value :_*))
    
    @scala.inline
    def setValuesArray(value: js.Array[ASPxDesignerElementEditorItem]): Self = StObject.set(x, "valuesArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesArrayVarargs(value: ASPxDesignerElementEditorItem*): Self = StObject.set(x, "valuesArray", js.Array(value :_*))
    
    @scala.inline
    def setVisible(value: js.Any): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
