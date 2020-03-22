package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFiltering extends js.Object {
  var filtering: js.UndefOr[Boolean] = js.undefined
  var groupPaging: js.UndefOr[Boolean] = js.undefined
  var grouping: js.UndefOr[Boolean] = js.undefined
  var paging: js.UndefOr[Boolean] = js.undefined
  var sorting: js.UndefOr[Boolean] = js.undefined
  var summary: js.UndefOr[Boolean] = js.undefined
}

object AnonFiltering {
  @scala.inline
  def apply(
    filtering: js.UndefOr[Boolean] = js.undefined,
    groupPaging: js.UndefOr[Boolean] = js.undefined,
    grouping: js.UndefOr[Boolean] = js.undefined,
    paging: js.UndefOr[Boolean] = js.undefined,
    sorting: js.UndefOr[Boolean] = js.undefined,
    summary: js.UndefOr[Boolean] = js.undefined
  ): AnonFiltering = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filtering)) __obj.updateDynamic("filtering")(filtering.asInstanceOf[js.Any])
    if (!js.isUndefined(groupPaging)) __obj.updateDynamic("groupPaging")(groupPaging.asInstanceOf[js.Any])
    if (!js.isUndefined(grouping)) __obj.updateDynamic("grouping")(grouping.asInstanceOf[js.Any])
    if (!js.isUndefined(paging)) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (!js.isUndefined(sorting)) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (!js.isUndefined(summary)) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFiltering]
  }
}

