package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.has
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Has extends MultiSelector {
  @JSName("type")
  var type_Has: has
}

object Has {
  @scala.inline
  def apply(selectors: js.Array[Selector], `type`: has, subject: js.UndefOr[Boolean] = js.undefined): Has = {
    val __obj = js.Dynamic.literal(selectors = selectors)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[Has]
  }
}

