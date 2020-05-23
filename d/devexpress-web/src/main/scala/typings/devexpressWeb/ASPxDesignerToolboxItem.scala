package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxDesignerToolboxItem extends js.Object {
  var defaultVal: js.Any
  var info: js.Array[ASPxDesignerElementSerializationInfo]
  var isToolboxItem: Boolean
  var popularProperties: js.Array[String]
  var surfaceType: js.Any
  var toolboxIndex: Double
  var `type`: js.Any
}

object ASPxDesignerToolboxItem {
  @scala.inline
  def apply(
    defaultVal: js.Any,
    info: js.Array[ASPxDesignerElementSerializationInfo],
    isToolboxItem: Boolean,
    popularProperties: js.Array[String],
    surfaceType: js.Any,
    toolboxIndex: Double,
    `type`: js.Any
  ): ASPxDesignerToolboxItem = {
    val __obj = js.Dynamic.literal(defaultVal = defaultVal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], isToolboxItem = isToolboxItem.asInstanceOf[js.Any], popularProperties = popularProperties.asInstanceOf[js.Any], surfaceType = surfaceType.asInstanceOf[js.Any], toolboxIndex = toolboxIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerToolboxItem]
  }
}

