package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.`nth-last-child`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NthLastChild extends Nth {
  @JSName("type")
  var type_NthLastChild: `nth-last-child`
}

object NthLastChild {
  @scala.inline
  def apply(index: NumericLiteral, `type`: `nth-last-child`, subject: js.UndefOr[Boolean] = js.undefined): NthLastChild = {
    val __obj = js.Dynamic.literal(index = index)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[NthLastChild]
  }
}

