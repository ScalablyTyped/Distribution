package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.descendant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descendant extends BinarySelector {
  @JSName("type")
  var type_Descendant: descendant
}

object Descendant {
  @scala.inline
  def apply(left: Selector, right: Selector, `type`: descendant, subject: js.UndefOr[Boolean] = js.undefined): Descendant = {
    val __obj = js.Dynamic.literal(left = left, right = right)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[Descendant]
  }
}

