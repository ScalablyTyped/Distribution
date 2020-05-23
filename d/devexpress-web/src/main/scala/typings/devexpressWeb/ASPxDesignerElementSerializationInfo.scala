package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxDesignerElementSerializationInfo extends js.Object {
  var array: Boolean
  var defaultVal: js.Any
  var disabled: js.Any
  var displayName: String
  var editor: ASPxDesignerElementEditor
  var info: js.Array[ASPxDesignerElementSerializationInfo]
  var link: Boolean
  var modelName: String
  var propertyName: String
  var validationRules: js.Array[_]
  var valuesArray: js.Array[ASPxDesignerElementEditorItem]
  var visible: js.Any
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
}

