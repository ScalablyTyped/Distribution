package typings.esquery.esqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelector extends Selector {
  var selectors: js.Array[Selector]
}

object MultiSelector {
  @scala.inline
  def apply(selectors: js.Array[Selector], `type`: String, subject: js.UndefOr[Boolean] = js.undefined): MultiSelector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelector]
  }
}

