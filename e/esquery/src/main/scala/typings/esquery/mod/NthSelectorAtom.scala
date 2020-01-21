package typings.esquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NthSelectorAtom extends SubjectSelectorAtom {
  var index: NumericLiteral
}

object NthSelectorAtom {
  @scala.inline
  def apply(index: NumericLiteral, `type`: String, subject: js.UndefOr[Boolean] = js.undefined): NthSelectorAtom = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[NthSelectorAtom]
  }
}

