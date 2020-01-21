package typings.esquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matches_
  extends MultiSelectorAtom
     with MultiSelector
     with Selector {
  @JSName("type")
  var type_Matches_ : typings.esquery.esqueryStrings.matches
}

object Matches_ {
  @scala.inline
  def apply(
    selectors: js.Array[SubjectSelector],
    `type`: typings.esquery.esqueryStrings.matches,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Matches_ = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matches_]
  }
}

