package typings.devtoolsProtocol.mod.Protocol.Accessibility

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AXProperty extends js.Object {
  /**
    * The name of this property.
    */
  var name: AXPropertyName = js.native
  /**
    * The value of this property.
    */
  var value: AXValue = js.native
}

object AXProperty {
  @scala.inline
  def apply(name: AXPropertyName, value: AXValue): AXProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AXProperty]
  }
  @scala.inline
  implicit class AXPropertyOps[Self <: AXProperty] (val x: Self) extends AnyVal {
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
    def setName(value: AXPropertyName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: AXValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

