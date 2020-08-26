package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Super
  extends BaseNode
     with Node {
  @JSName("type")
  var type_Super: typings.estree.estreeStrings.Super = js.native
}

object Super {
  @scala.inline
  def apply(`type`: typings.estree.estreeStrings.Super): Super = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Super]
  }
  @scala.inline
  implicit class SuperOps[Self <: Super] (val x: Self) extends AnyVal {
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
    def setType(value: typings.estree.estreeStrings.Super): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

