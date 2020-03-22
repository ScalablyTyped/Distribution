package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGrouping extends js.Object {
  var filtering: js.UndefOr[Boolean] = js.undefined
  var grouping: js.UndefOr[Boolean] = js.undefined
  var sorting: js.UndefOr[Boolean] = js.undefined
}

object AnonGrouping {
  @scala.inline
  def apply(
    filtering: js.UndefOr[Boolean] = js.undefined,
    grouping: js.UndefOr[Boolean] = js.undefined,
    sorting: js.UndefOr[Boolean] = js.undefined
  ): AnonGrouping = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filtering)) __obj.updateDynamic("filtering")(filtering.asInstanceOf[js.Any])
    if (!js.isUndefined(grouping)) __obj.updateDynamic("grouping")(grouping.asInstanceOf[js.Any])
    if (!js.isUndefined(sorting)) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGrouping]
  }
}

