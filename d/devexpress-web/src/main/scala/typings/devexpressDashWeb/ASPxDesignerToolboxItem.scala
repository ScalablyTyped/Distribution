package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about a toolbox control item.
  */
trait ASPxDesignerToolboxItem extends js.Object {
  /**
    * Provides access to the default property values used for a toolbox control.
    * Value: An object that specifies default propery values.
    */
  var defaultVal: js.Object
  /**
    * Provides access to information required to serialize a toolbox control.
    * Value: An array of ASPxDesignerElementSerializationInfo objects that provide information required to serialize an element.
    */
  var info: js.Array[ASPxDesignerElementSerializationInfo]
  /**
    * Gets whether a control item is displayed in a toolbox.
    * Value: true, if the control is available in the toolbox; otherwise, false.
    */
  var isToolboxItem: Boolean
  /**
    * Provides access to popular properties of a toolbox control.
    * Value: An array of strings that specify names of popular properties.
    */
  var popularProperties: js.Array[String]
  /**
    * Provides access to a surface type of toolbox control.
    * Value: A surface type of toolbox control.
    */
  var surfaceType: js.Any
  /**
    * Provides access to a zero-based index of a control in the toolbox.
    * Value: An integer value that specifies a control index in the toolbox.
    */
  var toolboxIndex: Double
  /**
    * Provides access to a toolbox control type.
    * Value: A toolbox control type.
    */
  var `type`: js.Any
}

object ASPxDesignerToolboxItem {
  @scala.inline
  def apply(
    defaultVal: js.Object,
    info: js.Array[ASPxDesignerElementSerializationInfo],
    isToolboxItem: Boolean,
    popularProperties: js.Array[String],
    surfaceType: js.Any,
    toolboxIndex: Double,
    `type`: js.Any
  ): ASPxDesignerToolboxItem = {
    val __obj = js.Dynamic.literal(defaultVal = defaultVal, info = info, isToolboxItem = isToolboxItem, popularProperties = popularProperties, surfaceType = surfaceType, toolboxIndex = toolboxIndex)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ASPxDesignerToolboxItem]
  }
}

