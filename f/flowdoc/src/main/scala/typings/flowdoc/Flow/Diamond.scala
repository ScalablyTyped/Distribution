package typings.flowdoc.Flow

import typings.flowdoc.Shape
import typings.flowdoc.flowdocStrings.DIAMOND
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Diamond extends Shape {
  @JSName("type")
  var type_Diamond: DIAMOND = js.native
}

object Diamond {
  @scala.inline
  def apply(id: String, name: String, position: Point, size: Size, `type`: DIAMOND): Diamond = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diamond]
  }
  @scala.inline
  implicit class DiamondOps[Self <: Diamond] (val x: Self) extends AnyVal {
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
    def setType(value: DIAMOND): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

