package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputedStyle extends js.Object {
  /**
    * Name/value pairs of computed style properties.
    */
  var properties: js.Array[NameValue] = js.native
}

object ComputedStyle {
  @scala.inline
  def apply(properties: js.Array[NameValue]): ComputedStyle = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedStyle]
  }
  @scala.inline
  implicit class ComputedStyleOps[Self <: ComputedStyle] (val x: Self) extends AnyVal {
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
    def setPropertiesVarargs(value: NameValue*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[NameValue]): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
  
}

