package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxDesignerElementSerializationInfoWithBindings extends ASPxDesignerElementSerializationInfo {
  var bindingName: String
}

object ASPxDesignerElementSerializationInfoWithBindings {
  @scala.inline
  def apply(
    array: Boolean,
    bindingName: String,
    defaultVal: js.Object,
    disabled: js.Object,
    displayName: String,
    editor: ASPxDesignerElementEditor,
    info: js.Array[ASPxDesignerElementSerializationInfo],
    link: Boolean,
    modelName: String,
    propertyName: String,
    validationRules: js.Array[js.Object],
    valuesArray: js.Array[ASPxDesignerElementEditorItem],
    visible: js.Object
  ): ASPxDesignerElementSerializationInfoWithBindings = {
    val __obj = js.Dynamic.literal(array = array, bindingName = bindingName, defaultVal = defaultVal, disabled = disabled, displayName = displayName, editor = editor, info = info, link = link, modelName = modelName, propertyName = propertyName, validationRules = validationRules, valuesArray = valuesArray, visible = visible)
  
    __obj.asInstanceOf[ASPxDesignerElementSerializationInfoWithBindings]
  }
}

