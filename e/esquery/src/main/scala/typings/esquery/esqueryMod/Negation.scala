package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.not
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Negation extends MultiSelector {
  @JSName("type")
  var type_Negation: not
}

object Negation {
  @scala.inline
  def apply(selectors: js.Array[Selector], `type`: not, subject: js.UndefOr[Boolean] = js.undefined): Negation = {
    val __obj = js.Dynamic.literal(selectors = selectors)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[Negation]
  }
}

