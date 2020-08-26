package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxDesignerToolboxItem extends js.Object {
  var defaultVal: js.Any = js.native
  var info: js.Array[ASPxDesignerElementSerializationInfo] = js.native
  var isToolboxItem: Boolean = js.native
  var popularProperties: js.Array[String] = js.native
  var surfaceType: js.Any = js.native
  var toolboxIndex: Double = js.native
  var `type`: js.Any = js.native
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
  @scala.inline
  implicit class ASPxDesignerToolboxItemOps[Self <: ASPxDesignerToolboxItem] (val x: Self) extends AnyVal {
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
    def setDefaultVal(value: js.Any): Self = this.set("defaultVal", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoVarargs(value: ASPxDesignerElementSerializationInfo*): Self = this.set("info", js.Array(value :_*))
    @scala.inline
    def setInfo(value: js.Array[ASPxDesignerElementSerializationInfo]): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsToolboxItem(value: Boolean): Self = this.set("isToolboxItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopularPropertiesVarargs(value: String*): Self = this.set("popularProperties", js.Array(value :_*))
    @scala.inline
    def setPopularProperties(value: js.Array[String]): Self = this.set("popularProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setSurfaceType(value: js.Any): Self = this.set("surfaceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolboxIndex(value: Double): Self = this.set("toolboxIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

