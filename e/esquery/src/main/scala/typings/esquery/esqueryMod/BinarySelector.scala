package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.adjacent
import typings.esquery.esqueryStrings.child
import typings.esquery.esqueryStrings.descendant
import typings.esquery.esqueryStrings.sibling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinarySelector extends Selector {
  var left: Selector
  var right: Selector
  @JSName("type")
  var type_BinarySelector: child | sibling | adjacent | descendant
}

object BinarySelector {
  @scala.inline
  def apply(
    left: Selector,
    right: Selector,
    `type`: child | sibling | adjacent | descendant,
    subject: js.UndefOr[Boolean] = js.undefined
  ): BinarySelector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelector]
  }
}

