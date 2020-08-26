package typings.esquery.mod

import typings.esquery.esqueryStrings.`nth-child`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NthChild
  extends NthSelectorAtom
     with NthSelector
     with Selector {
  @JSName("type")
  var type_NthChild: `nth-child` = js.native
}

object NthChild {
  @scala.inline
  def apply(index: NumericLiteral, `type`: `nth-child`): NthChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NthChild]
  }
  @scala.inline
  implicit class NthChildOps[Self <: NthChild] (val x: Self) extends AnyVal {
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
    def setType(value: `nth-child`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

