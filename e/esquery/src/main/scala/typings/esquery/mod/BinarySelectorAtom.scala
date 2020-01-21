package typings.esquery.mod

import typings.esquery.esqueryStrings.adjacent
import typings.esquery.esqueryStrings.child
import typings.esquery.esqueryStrings.descendant
import typings.esquery.esqueryStrings.sibling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinarySelectorAtom extends SubjectSelectorAtom {
  var left: SubjectSelector
  var right: SubjectSelector
  @JSName("type")
  var type_BinarySelectorAtom: child | sibling | adjacent | descendant
}

object BinarySelectorAtom {
  @scala.inline
  def apply(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: child | sibling | adjacent | descendant,
    subject: js.UndefOr[Boolean] = js.undefined
  ): BinarySelectorAtom = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelectorAtom]
  }
}

