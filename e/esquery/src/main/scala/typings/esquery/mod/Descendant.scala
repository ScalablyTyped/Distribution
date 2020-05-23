package typings.esquery.mod

import typings.esquery.esqueryStrings.descendant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descendant
  extends BinarySelectorAtom
     with BinarySelector
     with Selector {
  @JSName("type")
  var type_Descendant: descendant
}

object Descendant {
  @scala.inline
  def apply(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: descendant,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Descendant = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descendant]
  }
}

