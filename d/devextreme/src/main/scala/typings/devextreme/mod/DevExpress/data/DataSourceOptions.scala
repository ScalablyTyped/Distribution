package typings.devextreme.mod.DevExpress.data

import typings.devextreme.AnonChanges
import typings.devextreme.AnonMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceOptions extends js.Object {
  /** @name DataSource.Options.customQueryParams */
  var customQueryParams: js.UndefOr[js.Any] = js.undefined
  /** @name DataSource.Options.expand */
  var expand: js.UndefOr[js.Array[String] | String] = js.undefined
  /** @name DataSource.Options.filter */
  var filter: js.UndefOr[String | js.Array[_] | js.Function] = js.undefined
  /** @name DataSource.Options.group */
  var group: js.UndefOr[String | js.Array[_] | js.Function] = js.undefined
  /** @name DataSource.Options.map */
  var map: js.UndefOr[js.Function1[/* dataItem */ js.Any, _]] = js.undefined
  /** @name DataSource.Options.onChanged */
  var onChanged: js.UndefOr[js.Function1[/* e */ AnonChanges, _]] = js.undefined
  /** @name DataSource.Options.onLoadError */
  var onLoadError: js.UndefOr[js.Function1[/* error */ AnonMessage, _]] = js.undefined
  /** @name DataSource.Options.onLoadingChanged */
  var onLoadingChanged: js.UndefOr[js.Function1[/* isLoading */ Boolean, _]] = js.undefined
  /** @name DataSource.Options.pageSize */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** @name DataSource.Options.paginate */
  var paginate: js.UndefOr[Boolean] = js.undefined
  /** @name DataSource.Options.postProcess */
  var postProcess: js.UndefOr[js.Function1[/* data */ js.Array[_], js.Array[_]]] = js.undefined
  /** @name DataSource.Options.pushAggregationTimeout */
  var pushAggregationTimeout: js.UndefOr[Double] = js.undefined
  /** @name DataSource.Options.requireTotalCount */
  var requireTotalCount: js.UndefOr[Boolean] = js.undefined
  /** @name DataSource.Options.reshapeOnPush */
  var reshapeOnPush: js.UndefOr[Boolean] = js.undefined
  /** @name DataSource.Options.searchExpr */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
  /** @name DataSource.Options.searchOperation */
  var searchOperation: js.UndefOr[String] = js.undefined
  /** @name DataSource.Options.searchValue */
  var searchValue: js.UndefOr[js.Any] = js.undefined
  /** @name DataSource.Options.select */
  var select: js.UndefOr[String | js.Array[_] | js.Function] = js.undefined
  /** @name DataSource.Options.sort */
  var sort: js.UndefOr[String | js.Array[_] | js.Function] = js.undefined
  /** @name DataSource.Options.store */
  var store: js.UndefOr[Store | StoreOptions[Store] | js.Array[_] | js.Any] = js.undefined
}

object DataSourceOptions {
  @scala.inline
  def apply(
    customQueryParams: js.Any = null,
    expand: js.Array[String] | String = null,
    filter: String | js.Array[_] | js.Function = null,
    group: String | js.Array[_] | js.Function = null,
    map: /* dataItem */ js.Any => _ = null,
    onChanged: /* e */ AnonChanges => _ = null,
    onLoadError: /* error */ AnonMessage => _ = null,
    onLoadingChanged: /* isLoading */ Boolean => _ = null,
    pageSize: Int | Double = null,
    paginate: js.UndefOr[Boolean] = js.undefined,
    postProcess: /* data */ js.Array[_] => js.Array[_] = null,
    pushAggregationTimeout: Int | Double = null,
    requireTotalCount: js.UndefOr[Boolean] = js.undefined,
    reshapeOnPush: js.UndefOr[Boolean] = js.undefined,
    searchExpr: String | js.Function | (js.Array[String | js.Function]) = null,
    searchOperation: String = null,
    searchValue: js.Any = null,
    select: String | js.Array[_] | js.Function = null,
    sort: String | js.Array[_] | js.Function = null,
    store: Store | StoreOptions[Store] | js.Array[_] | js.Any = null
  ): DataSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (customQueryParams != null) __obj.updateDynamic("customQueryParams")(customQueryParams.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (onChanged != null) __obj.updateDynamic("onChanged")(js.Any.fromFunction1(onChanged))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (onLoadingChanged != null) __obj.updateDynamic("onLoadingChanged")(js.Any.fromFunction1(onLoadingChanged))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(paginate)) __obj.updateDynamic("paginate")(paginate.asInstanceOf[js.Any])
    if (postProcess != null) __obj.updateDynamic("postProcess")(js.Any.fromFunction1(postProcess))
    if (pushAggregationTimeout != null) __obj.updateDynamic("pushAggregationTimeout")(pushAggregationTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(requireTotalCount)) __obj.updateDynamic("requireTotalCount")(requireTotalCount.asInstanceOf[js.Any])
    if (!js.isUndefined(reshapeOnPush)) __obj.updateDynamic("reshapeOnPush")(reshapeOnPush.asInstanceOf[js.Any])
    if (searchExpr != null) __obj.updateDynamic("searchExpr")(searchExpr.asInstanceOf[js.Any])
    if (searchOperation != null) __obj.updateDynamic("searchOperation")(searchOperation.asInstanceOf[js.Any])
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceOptions]
  }
}

