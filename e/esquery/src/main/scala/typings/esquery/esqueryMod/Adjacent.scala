package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.adjacent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adjacent extends BinarySelector {
  @JSName("type")
  var type_Adjacent: adjacent
}

object Adjacent {
  @scala.inline
  def apply(left: Selector, right: Selector, `type`: adjacent, subject: js.UndefOr[Boolean] = js.undefined): Adjacent = {
    val __obj = js.Dynamic.literal(left = left, right = right)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[Adjacent]
  }
}

