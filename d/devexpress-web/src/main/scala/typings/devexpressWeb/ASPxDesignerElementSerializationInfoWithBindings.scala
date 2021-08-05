package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerElementSerializationInfoWithBindings
  extends StObject
     with ASPxDesignerElementSerializationInfo {
  
  var bindingName: String
}
object ASPxDesignerElementSerializationInfoWithBindings {
  
  inline def apply(
    array: Boolean,
    bindingName: String,
    defaultVal: js.Any,
    disabled: js.Any,
    displayName: String,
    editor: ASPxDesignerElementEditor,
    info: js.Array[ASPxDesignerElementSerializationInfo],
    link: Boolean,
    modelName: String,
    propertyName: String,
    validationRules: js.Array[js.Any],
    valuesArray: js.Array[ASPxDesignerElementEditorItem],
    visible: js.Any
  ): ASPxDesignerElementSerializationInfoWithBindings = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], bindingName = bindingName.asInstanceOf[js.Any], defaultVal = defaultVal.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], validationRules = validationRules.asInstanceOf[js.Any], valuesArray = valuesArray.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerElementSerializationInfoWithBindings]
  }
  
  extension [Self <: ASPxDesignerElementSerializationInfoWithBindings](x: Self) {
    
    inline def setBindingName(value: String): Self = StObject.set(x, "bindingName", value.asInstanceOf[js.Any])
  }
}
