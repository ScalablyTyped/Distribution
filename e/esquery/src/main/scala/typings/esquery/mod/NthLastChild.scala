package typings.esquery.mod

import typings.esquery.esqueryStrings.`nth-last-child`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NthLastChild
  extends NthSelectorAtom
     with NthSelector
     with Selector {
  @JSName("type")
  var type_NthLastChild: `nth-last-child`
}

object NthLastChild {
  @scala.inline
  def apply(index: NumericLiteral, `type`: `nth-last-child`, subject: js.UndefOr[Boolean] = js.undefined): NthLastChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[NthLastChild]
  }
}

