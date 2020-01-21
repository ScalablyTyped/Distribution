package typings.esquery.mod

import typings.esquery.esqueryStrings.`nth-child`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NthChild
  extends NthSelectorAtom
     with NthSelector
     with Selector {
  @JSName("type")
  var type_NthChild: `nth-child`
}

object NthChild {
  @scala.inline
  def apply(index: NumericLiteral, `type`: `nth-child`, subject: js.UndefOr[Boolean] = js.undefined): NthChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[NthChild]
  }
}

