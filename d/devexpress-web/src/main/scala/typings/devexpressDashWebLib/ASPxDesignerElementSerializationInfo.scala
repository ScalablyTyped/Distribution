package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information required to serialize an element.
  */
trait ASPxDesignerElementSerializationInfo extends js.Object {
  /**
    * Gets a value indicating whether or not the property returns an array.
    * Value: true if the property returns an array; otherwise false.
    */
  var array: scala.Boolean
  /**
    * Gets the default property value used for serialization.
    * Value: A Object value.
    */
  var defaultVal: js.Object
  /**
    * Gets a value, indicating whether or not the property value can be edited.
    * Value: true to disable the property editing; otherwise false.
    */
  var disabled: js.Object
  /**
    * Gets the property name in the model that is displayed in the Property grid.
    * Value: A String value.
    */
  var displayName: java.lang.String
  /**
    * Gets a value specifying the type of value editor for the Property Grid.
    * Value: An ASPxDesignerElementEditor object.
    */
  var editor: ASPxDesignerElementEditor
  /**
    * Gets the information about a complex object's content.
    * Value: An array of ASPxDesignerElementSerializationInfo objects.
    */
  var info: js.Array[ASPxDesignerElementSerializationInfo]
  /**
    * Gets a value indicating whether an object should be serialized to the ComponentStorage property.
    * Value: true to serialize an object to the ObjectStorage; otherwise false.
    */
  var link: scala.Boolean
  /**
    * Gets the property name that will be used during serialization to store the property value.
    * Value: A String value.
    */
  var modelName: java.lang.String
  /**
    * Gets the property name that will be used in the model to store the property value.
    * Value: A String value.
    */
  var propertyName: java.lang.String
  /**
    * Gets the rules for validating the property value entered into its editor.
    * Value: An array of Object values.
    */
  var validationRules: js.Array[js.Object]
  /**
    * Gets the collection of values displayed in the Property grid.
    * Value: An array of ASPxDesignerElementEditorItem objects.
    */
  var valuesArray: js.Array[ASPxDesignerElementEditorItem]
  /**
    * Gets the visibility state of the value editor in the Property Grid.
    * Value: A Object value.
    */
  var visible: js.Object
}

object ASPxDesignerElementSerializationInfo {
  @scala.inline
  def apply(
    array: scala.Boolean,
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
  ): ASPxDesignerElementSerializationInfo = {
    val __obj = js.Dynamic.literal(array = array, defaultVal = defaultVal, disabled = disabled, displayName = displayName, editor = editor, info = info, link = link, modelName = modelName, propertyName = propertyName, validationRules = validationRules, valuesArray = valuesArray, visible = visible)
  
    __obj.asInstanceOf[ASPxDesignerElementSerializationInfo]
  }
}

