package typings.esquery.mod

import typings.esquery.esqueryStrings.`nth-child`
import typings.esquery.esqueryStrings.`nth-last-child`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.esquery.mod.NthChild
  - typings.esquery.mod.NthLastChild
*/
trait NthSelector extends SubjectSelector

object NthSelector {
  @scala.inline
  def NthChild(index: NumericLiteral, `type`: `nth-child`, subject: js.UndefOr[Boolean] = js.undefined): NthSelector = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NthSelector]
  }
  @scala.inline
  def NthLastChild(index: NumericLiteral, `type`: `nth-last-child`, subject: js.UndefOr[Boolean] = js.undefined): NthSelector = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NthSelector]
  }
}

