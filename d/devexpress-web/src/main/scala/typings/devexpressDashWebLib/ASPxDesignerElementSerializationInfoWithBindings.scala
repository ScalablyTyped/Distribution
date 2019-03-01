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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("array")(array)
    __obj.updateDynamic("bindingName")(bindingName)
    __obj.updateDynamic("defaultVal")(defaultVal)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("editor")(editor)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("modelName")(modelName)
    __obj.updateDynamic("propertyName")(propertyName)
    __obj.updateDynamic("validationRules")(validationRules)
    __obj.updateDynamic("valuesArray")(valuesArray)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ASPxDesignerElementSerializationInfoWithBindings]
  }
}

