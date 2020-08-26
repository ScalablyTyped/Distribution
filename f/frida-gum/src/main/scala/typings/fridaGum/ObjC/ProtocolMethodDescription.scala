package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtocolMethodDescription extends js.Object {
  /**
    * Whether this method is required or optional.
    */
  var required: Boolean = js.native
  /**
    * Method signature.
    */
  var types: String = js.native
}

object ProtocolMethodDescription {
  @scala.inline
  def apply(required: Boolean, types: String): ProtocolMethodDescription = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolMethodDescription]
  }
  @scala.inline
  implicit class ProtocolMethodDescriptionOps[Self <: ProtocolMethodDescription] (val x: Self) extends AnyVal {
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
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypes(value: String): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

