package typings.esquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelectorAtom extends SubjectSelectorAtom {
  var selectors: js.Array[SubjectSelector]
}

object MultiSelectorAtom {
  @scala.inline
  def apply(selectors: js.Array[SubjectSelector], `type`: String, subject: js.UndefOr[Boolean] = js.undefined): MultiSelectorAtom = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelectorAtom]
  }
}

