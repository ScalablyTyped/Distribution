package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxDesignerElementParameterDescriptor extends js.Object {
  var description: String = js.native
  var name: String = js.native
  var `type`: String = js.native
  var value: js.Any = js.native
  var visible: Boolean = js.native
}

object ASPxDesignerElementParameterDescriptor {
  @scala.inline
  def apply(description: String, name: String, `type`: String, value: js.Any, visible: Boolean): ASPxDesignerElementParameterDescriptor = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerElementParameterDescriptor]
  }
  @scala.inline
  implicit class ASPxDesignerElementParameterDescriptorOps[Self <: ASPxDesignerElementParameterDescriptor] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

