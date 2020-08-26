package typings.esquery.mod

import typings.esquery.esqueryStrings.literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiteralAtom extends Atom {
  @JSName("type")
  var type_LiteralAtom: literal = js.native
  var value: String | Double = js.native
}

object LiteralAtom {
  @scala.inline
  def apply(`type`: literal, value: String | Double): LiteralAtom = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralAtom]
  }
  @scala.inline
  implicit class LiteralAtomOps[Self <: LiteralAtom] (val x: Self) extends AnyVal {
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
    def setType(value: literal): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

