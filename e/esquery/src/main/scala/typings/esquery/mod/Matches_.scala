package typings.esquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matches_
  extends MultiSelectorAtom
     with MultiSelector
     with Selector {
  @JSName("type")
  var type_Matches_ : typings.esquery.esqueryStrings.matches = js.native
}

object Matches_ {
  @scala.inline
  def apply(selectors: js.Array[SubjectSelector], `type`: typings.esquery.esqueryStrings.matches): Matches_ = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matches_]
  }
  @scala.inline
  implicit class Matches_Ops[Self <: Matches_] (val x: Self) extends AnyVal {
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
    def setType(value: typings.esquery.esqueryStrings.matches): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

