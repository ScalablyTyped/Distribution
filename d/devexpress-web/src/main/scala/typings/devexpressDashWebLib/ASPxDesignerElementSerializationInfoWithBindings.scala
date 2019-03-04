package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxDesignerElementSerializationInfoWithBindings extends ASPxDesignerElementSerializationInfo {
  var bindingName: java.lang.String
}

object ASPxDesignerElementSerializationInfoWithBindings {
  @scala.inline
  def apply(
    array: scala.Boolean,
    bindingName: java.lang.String,
    defaultVal: js.Object,
    disabled: js.Object,
    displayName: java.lang.String,
    editor: ASPxDesignerElementEditor,
    info: js.Array[ASPxDesignerElementSerializationInfo],
    link: scala.Boolean,
    modelName: java.lang.String,
    propertyName: java.lang.String,
    validationRules: js.Array[js.Object],
    valuesArray: js.Array[ASPxDesignerElementEditorItem],
    visible: js.Object
  ): ASPxDesignerElementSerializationInfoWithBindings = {
    val __obj = js.Dynamic.literal(array = array, bindingName = bindingName, defaultVal = defaultVal, disabled = disabled, displayName = displayName, editor = editor, info = info, link = link, modelName = modelName, propertyName = propertyName, validationRules = validationRules, valuesArray = valuesArray, visible = visible)
  
    __obj.asInstanceOf[ASPxDesignerElementSerializationInfoWithBindings]
  }
}

