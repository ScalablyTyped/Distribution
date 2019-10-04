package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.`nth-child`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NthChild extends Nth {
  @JSName("type")
  var type_NthChild: `nth-child`
}

object NthChild {
  @scala.inline
  def apply(index: NumericLiteral, `type`: `nth-child`, subject: js.UndefOr[Boolean] = js.undefined): NthChild = {
    val __obj = js.Dynamic.literal(index = index)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[NthChild]
  }
}

