package typings.esquery.mod

import typings.esquery.esqueryStrings.adjacent
import typings.esquery.esqueryStrings.child
import typings.esquery.esqueryStrings.descendant
import typings.esquery.esqueryStrings.sibling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinarySelectorAtom extends SubjectSelectorAtom {
  var left: SubjectSelector = js.native
  var right: SubjectSelector = js.native
  @JSName("type")
  var type_BinarySelectorAtom: child | sibling | adjacent | descendant = js.native
}

object BinarySelectorAtom {
  @scala.inline
  def apply(left: SubjectSelector, right: SubjectSelector, `type`: child | sibling | adjacent | descendant): BinarySelectorAtom = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelectorAtom]
  }
  @scala.inline
  implicit class BinarySelectorAtomOps[Self <: BinarySelectorAtom] (val x: Self) extends AnyVal {
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
    def setLeft(value: SubjectSelector): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: SubjectSelector): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: child | sibling | adjacent | descendant): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

