package typings.atFormatjsIntlDashUtils.distListDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPatternFieldsData extends js.Object {
  var conjunction: js.UndefOr[ListPatternData] = js.undefined
  var disjunction: js.UndefOr[ListPatternData] = js.undefined
  var unit: js.UndefOr[ListPatternData] = js.undefined
}

object ListPatternFieldsData {
  @scala.inline
  def apply(
    conjunction: ListPatternData = null,
    disjunction: ListPatternData = null,
    unit: ListPatternData = null
  ): ListPatternFieldsData = {
    val __obj = js.Dynamic.literal()
    if (conjunction != null) __obj.updateDynamic("conjunction")(conjunction.asInstanceOf[js.Any])
    if (disjunction != null) __obj.updateDynamic("disjunction")(disjunction.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPatternFieldsData]
  }
}

