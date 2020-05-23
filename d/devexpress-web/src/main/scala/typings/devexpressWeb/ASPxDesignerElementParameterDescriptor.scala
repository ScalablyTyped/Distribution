package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxDesignerElementParameterDescriptor extends js.Object {
  var description: String
  var name: String
  var `type`: String
  var value: js.Any
  var visible: Boolean
}

object ASPxDesignerElementParameterDescriptor {
  @scala.inline
  def apply(description: String, name: String, `type`: String, value: js.Any, visible: Boolean): ASPxDesignerElementParameterDescriptor = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerElementParameterDescriptor]
  }
}

