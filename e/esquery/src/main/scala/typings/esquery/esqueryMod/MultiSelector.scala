package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.compound
import typings.esquery.esqueryStrings.has
import typings.esquery.esqueryStrings.not
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.esquery.esqueryMod.Sequence
  - typings.esquery.esqueryMod.Negation
  - typings.esquery.esqueryMod.Matches
  - typings.esquery.esqueryMod.Has
*/
trait MultiSelector extends SubjectSelector

object MultiSelector {
  @scala.inline
  def Sequence(
    selectors: js.Array[SubjectSelector],
    `type`: compound,
    subject: js.UndefOr[Boolean] = js.undefined
  ): MultiSelector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelector]
  }
  @scala.inline
  def Negation(selectors: js.Array[SubjectSelector], `type`: not, subject: js.UndefOr[Boolean] = js.undefined): MultiSelector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelector]
  }
  @scala.inline
  def Matches(
    selectors: js.Array[SubjectSelector],
    `type`: typings.esquery.esqueryStrings.matches,
    subject: js.UndefOr[Boolean] = js.undefined
  ): MultiSelector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelector]
  }
  @scala.inline
  def Has(selectors: js.Array[SubjectSelector], `type`: has, subject: js.UndefOr[Boolean] = js.undefined): MultiSelector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelector]
  }
}

