package typings.esquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSelectorAtom extends SubjectSelectorAtom {
  var selectors: js.Array[SubjectSelector] = js.native
}

object MultiSelectorAtom {
  @scala.inline
  def apply(selectors: js.Array[SubjectSelector], `type`: String): MultiSelectorAtom = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelectorAtom]
  }
  @scala.inline
  implicit class MultiSelectorAtomOps[Self <: MultiSelectorAtom] (val x: Self) extends AnyVal {
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
    def setSelectorsVarargs(value: SubjectSelector*): Self = this.set("selectors", js.Array(value :_*))
    @scala.inline
    def setSelectors(value: js.Array[SubjectSelector]): Self = this.set("selectors", value.asInstanceOf[js.Any])
  }
  
}

