package typings.devextreme.mod.DevExpress.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadOptions extends js.Object {
  /** @name LoadOptions.customQueryParams */
  var customQueryParams: js.UndefOr[js.Any] = js.undefined
  /** @name LoadOptions.expand */
  var expand: js.UndefOr[js.Any] = js.undefined
  /** @name LoadOptions.filter */
  var filter: js.UndefOr[js.Any] = js.undefined
  /** @name LoadOptions.group */
  var group: js.UndefOr[js.Any] = js.undefined
  /** @name LoadOptions.groupSummary */
  var groupSummary: js.UndefOr[js.Any] = js.undefined
  /** @name LoadOptions.parentIds */
  var parentIds: js.UndefOr[js.Array[_]] = js.undefined
  /** @name LoadOptions.requireGroupCount */
  var requireGroupCount: js.UndefOr[Boolean] = js.undefined
  /** @name LoadOptions.requireTotalCount */
  var requireTotalCount: js.UndefOr[Boolean] = js.undefined
  /** @name LoadOptions.searchExpr */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
  /** @name LoadOptions.searchOperation */
  var searchOperation: js.UndefOr[String] = js.undefined
  /** @name LoadOptions.searchValue */
  var searchValue: js.UndefOr[js.Any] = js.undefined
  /** @name LoadOptions.select */
  var select: js.UndefOr[js.Any] = js.undefined
  /** @name LoadOptions.skip */
  var skip: js.UndefOr[Double] = js.undefined
  /** @name LoadOptions.sort */
  var sort: js.UndefOr[js.Any] = js.undefined
  /** @name LoadOptions.take */
  var take: js.UndefOr[Double] = js.undefined
  /** @name LoadOptions.totalSummary */
  var totalSummary: js.UndefOr[js.Any] = js.undefined
  /** @name LoadOptions.userData */
  var userData: js.UndefOr[js.Any] = js.undefined
}

object LoadOptions {
  @scala.inline
  def apply(
    customQueryParams: js.Any = null,
    expand: js.Any = null,
    filter: js.Any = null,
    group: js.Any = null,
    groupSummary: js.Any = null,
    parentIds: js.Array[_] = null,
    requireGroupCount: js.UndefOr[Boolean] = js.undefined,
    requireTotalCount: js.UndefOr[Boolean] = js.undefined,
    searchExpr: String | js.Function | (js.Array[String | js.Function]) = null,
    searchOperation: String = null,
    searchValue: js.Any = null,
    select: js.Any = null,
    skip: js.UndefOr[Double] = js.undefined,
    sort: js.Any = null,
    take: js.UndefOr[Double] = js.undefined,
    totalSummary: js.Any = null,
    userData: js.Any = null
  ): LoadOptions = {
    val __obj = js.Dynamic.literal()
    if (customQueryParams != null) __obj.updateDynamic("customQueryParams")(customQueryParams.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (groupSummary != null) __obj.updateDynamic("groupSummary")(groupSummary.asInstanceOf[js.Any])
    if (parentIds != null) __obj.updateDynamic("parentIds")(parentIds.asInstanceOf[js.Any])
    if (!js.isUndefined(requireGroupCount)) __obj.updateDynamic("requireGroupCount")(requireGroupCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requireTotalCount)) __obj.updateDynamic("requireTotalCount")(requireTotalCount.get.asInstanceOf[js.Any])
    if (searchExpr != null) __obj.updateDynamic("searchExpr")(searchExpr.asInstanceOf[js.Any])
    if (searchOperation != null) __obj.updateDynamic("searchOperation")(searchOperation.asInstanceOf[js.Any])
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(take)) __obj.updateDynamic("take")(take.get.asInstanceOf[js.Any])
    if (totalSummary != null) __obj.updateDynamic("totalSummary")(totalSummary.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadOptions]
  }
}

