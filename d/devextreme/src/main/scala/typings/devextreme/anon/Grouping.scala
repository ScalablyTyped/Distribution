package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grouping extends js.Object {
  var filtering: js.UndefOr[Boolean] = js.undefined
  var grouping: js.UndefOr[Boolean] = js.undefined
  var sorting: js.UndefOr[Boolean] = js.undefined
}

object Grouping {
  @scala.inline
  def apply(
    filtering: js.UndefOr[Boolean] = js.undefined,
    grouping: js.UndefOr[Boolean] = js.undefined,
    sorting: js.UndefOr[Boolean] = js.undefined
  ): Grouping = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filtering)) __obj.updateDynamic("filtering")(filtering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grouping)) __obj.updateDynamic("grouping")(grouping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sorting)) __obj.updateDynamic("sorting")(sorting.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grouping]
  }
}

