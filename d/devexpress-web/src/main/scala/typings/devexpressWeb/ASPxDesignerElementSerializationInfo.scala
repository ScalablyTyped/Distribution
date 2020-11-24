package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxDesignerElementSerializationInfo extends js.Object {
  
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
  implicit class ASPxDesignerElementSerializationInfoOps[Self <: ASPxDesignerElementSerializationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArray(value: Boolean): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVal(value: js.Any): Self = this.set("defaultVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: js.Any): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: ASPxDesignerElementEditor): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoVarargs(value: ASPxDesignerElementSerializationInfo*): Self = this.set("info", js.Array(value :_*))
    
    @scala.inline
    def setInfo(value: js.Array[ASPxDesignerElementSerializationInfo]): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: Boolean): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationRulesVarargs(value: js.Any*): Self = this.set("validationRules", js.Array(value :_*))
    
    @scala.inline
    def setValidationRules(value: js.Array[_]): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesArrayVarargs(value: ASPxDesignerElementEditorItem*): Self = this.set("valuesArray", js.Array(value :_*))
    
    @scala.inline
    def setValuesArray(value: js.Array[ASPxDesignerElementEditorItem]): Self = this.set("valuesArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: js.Any): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}
