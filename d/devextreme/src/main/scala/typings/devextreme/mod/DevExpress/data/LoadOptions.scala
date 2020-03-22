package typings.devextreme.mod.DevExpress.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadOptions extends js.Object {
  /** An object for storing additional settings that should be sent to the server. Relevant to the ODataStore only. */
  var customQueryParams: js.UndefOr[js.Any] = js.undefined
  /** An array of strings that represent the names of navigation properties to be loaded simultaneously with the ODataStore. */
  var expand: js.UndefOr[js.Any] = js.undefined
  /** A filter expression. */
  var filter: js.UndefOr[js.Any] = js.undefined
  /** A group expression. */
  var group: js.UndefOr[js.Any] = js.undefined
  /** A group summary expression. Used with the group setting. */
  var groupSummary: js.UndefOr[js.Any] = js.undefined
  /** The IDs of the rows being expanded. Relevant only when the CustomStore is used in the TreeList widget. */
  var parentIds: js.UndefOr[js.Array[_]] = js.undefined
  /** Indicates whether a top-level group count is required. Used in conjunction with the filter, take, skip, requireTotalCount, and group settings. */
  var requireGroupCount: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether the total count of data objects is needed. */
  var requireTotalCount: js.UndefOr[Boolean] = js.undefined
  /** A data field or expression whose value is compared to the search value. */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
  /** A comparison operation. Can have one of the following values: "=", "<>", ">", ">=", "<", "<=", "startswith", "endswith", "contains", "notcontains", "isblank" and "isnotblank". */
  var searchOperation: js.UndefOr[String] = js.undefined
  /** The current search value. */
  var searchValue: js.UndefOr[js.Any] = js.undefined
  /** A select expression. */
  var select: js.UndefOr[js.Any] = js.undefined
  /** The number of data objects to be skipped from the result set's start. In conjunction with take, used to implement paging. */
  var skip: js.UndefOr[Double] = js.undefined
  /** A sort expression. */
  var sort: js.UndefOr[js.Any] = js.undefined
  /** The number of data objects to be loaded. In conjunction with skip, used to implement paging. */
  var take: js.UndefOr[Double] = js.undefined
  /** A total summary expression. */
  var totalSummary: js.UndefOr[js.Any] = js.undefined
  /** An object for storing additional settings that should be sent to the server. */
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
    skip: Int | Double = null,
    sort: js.Any = null,
    take: Int | Double = null,
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
    if (!js.isUndefined(requireGroupCount)) __obj.updateDynamic("requireGroupCount")(requireGroupCount.asInstanceOf[js.Any])
    if (!js.isUndefined(requireTotalCount)) __obj.updateDynamic("requireTotalCount")(requireTotalCount.asInstanceOf[js.Any])
    if (searchExpr != null) __obj.updateDynamic("searchExpr")(searchExpr.asInstanceOf[js.Any])
    if (searchOperation != null) __obj.updateDynamic("searchOperation")(searchOperation.asInstanceOf[js.Any])
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (take != null) __obj.updateDynamic("take")(take.asInstanceOf[js.Any])
    if (totalSummary != null) __obj.updateDynamic("totalSummary")(totalSummary.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadOptions]
  }
}

