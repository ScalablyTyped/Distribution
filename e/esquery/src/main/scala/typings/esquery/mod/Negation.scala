package typings.esquery.mod

import typings.esquery.esqueryStrings.not
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Negation
  extends MultiSelectorAtom
     with MultiSelector
     with Selector {
  @JSName("type")
  var type_Negation: not = js.native
}

object Negation {
  @scala.inline
  def apply(selectors: js.Array[SubjectSelector], `type`: not): Negation = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Negation]
  }
  @scala.inline
  implicit class NegationOps[Self <: Negation] (val x: Self) extends AnyVal {
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
    def setType(value: not): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

