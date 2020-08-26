package typings.esquery.mod

import typings.esquery.esqueryStrings.child
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Child
  extends BinarySelectorAtom
     with BinarySelector
     with Selector {
  @JSName("type")
  var type_Child: child = js.native
}

object Child {
  @scala.inline
  def apply(left: SubjectSelector, right: SubjectSelector, `type`: child): Child = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Child]
  }
  @scala.inline
  implicit class ChildOps[Self <: Child] (val x: Self) extends AnyVal {
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
    def setType(value: child): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

