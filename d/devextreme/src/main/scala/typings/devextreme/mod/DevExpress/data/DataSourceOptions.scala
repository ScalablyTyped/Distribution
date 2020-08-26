package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Changes
import typings.devextreme.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceOptions extends js.Object {
  /** @name DataSource.Options.customQueryParams */
  var customQueryParams: js.UndefOr[js.Any] = js.native
  /** @name DataSource.Options.expand */
  var expand: js.UndefOr[js.Array[String] | String] = js.native
  /** @name DataSource.Options.filter */
  var filter: js.UndefOr[String | js.Array[_] | js.Function] = js.native
  /** @name DataSource.Options.group */
  var group: js.UndefOr[String | js.Array[_] | js.Function] = js.native
  /** @name DataSource.Options.map */
  var map: js.UndefOr[js.Function1[/* dataItem */ js.Any, _]] = js.native
  /** @name DataSource.Options.onChanged */
  var onChanged: js.UndefOr[js.Function1[/* e */ Changes, _]] = js.native
  /** @name DataSource.Options.onLoadError */
  var onLoadError: js.UndefOr[js.Function1[/* error */ Message, _]] = js.native
  /** @name DataSource.Options.onLoadingChanged */
  var onLoadingChanged: js.UndefOr[js.Function1[/* isLoading */ Boolean, _]] = js.native
  /** @name DataSource.Options.pageSize */
  var pageSize: js.UndefOr[Double] = js.native
  /** @name DataSource.Options.paginate */
  var paginate: js.UndefOr[Boolean] = js.native
  /** @name DataSource.Options.postProcess */
  var postProcess: js.UndefOr[js.Function1[/* data */ js.Array[_], js.Array[_]]] = js.native
  /** @name DataSource.Options.pushAggregationTimeout */
  var pushAggregationTimeout: js.UndefOr[Double] = js.native
  /** @name DataSource.Options.requireTotalCount */
  var requireTotalCount: js.UndefOr[Boolean] = js.native
  /** @name DataSource.Options.reshapeOnPush */
  var reshapeOnPush: js.UndefOr[Boolean] = js.native
  /** @name DataSource.Options.searchExpr */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.native
  /** @name DataSource.Options.searchOperation */
  var searchOperation: js.UndefOr[String] = js.native
  /** @name DataSource.Options.searchValue */
  var searchValue: js.UndefOr[js.Any] = js.native
  /** @name DataSource.Options.select */
  var select: js.UndefOr[String | js.Array[_] | js.Function] = js.native
  /** @name DataSource.Options.sort */
  var sort: js.UndefOr[String | js.Array[_] | js.Function] = js.native
  /** @name DataSource.Options.store */
  var store: js.UndefOr[Store | StoreOptions[Store] | js.Array[_] | js.Any] = js.native
}

object DataSourceOptions {
  @scala.inline
  def apply(): DataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceOptions]
  }
  @scala.inline
  implicit class DataSourceOptionsOps[Self <: DataSourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomQueryParams(value: js.Any): Self = this.set("customQueryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomQueryParams: Self = this.set("customQueryParams", js.undefined)
    @scala.inline
    def setExpandVarargs(value: String*): Self = this.set("expand", js.Array(value :_*))
    @scala.inline
    def setExpand(value: js.Array[String] | String): Self = this.set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    @scala.inline
    def setFilterVarargs(value: js.Any*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: String | js.Array[_] | js.Function): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setGroupVarargs(value: js.Any*): Self = this.set("group", js.Array(value :_*))
    @scala.inline
    def setGroup(value: String | js.Array[_] | js.Function): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setMap(value: /* dataItem */ js.Any => _): Self = this.set("map", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setOnChanged(value: /* e */ Changes => _): Self = this.set("onChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChanged: Self = this.set("onChanged", js.undefined)
    @scala.inline
    def setOnLoadError(value: /* error */ Message => _): Self = this.set("onLoadError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadError: Self = this.set("onLoadError", js.undefined)
    @scala.inline
    def setOnLoadingChanged(value: /* isLoading */ Boolean => _): Self = this.set("onLoadingChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadingChanged: Self = this.set("onLoadingChanged", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPaginate(value: Boolean): Self = this.set("paginate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginate: Self = this.set("paginate", js.undefined)
    @scala.inline
    def setPostProcess(value: /* data */ js.Array[_] => js.Array[_]): Self = this.set("postProcess", js.Any.fromFunction1(value))
    @scala.inline
    def deletePostProcess: Self = this.set("postProcess", js.undefined)
    @scala.inline
    def setPushAggregationTimeout(value: Double): Self = this.set("pushAggregationTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePushAggregationTimeout: Self = this.set("pushAggregationTimeout", js.undefined)
    @scala.inline
    def setRequireTotalCount(value: Boolean): Self = this.set("requireTotalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireTotalCount: Self = this.set("requireTotalCount", js.undefined)
    @scala.inline
    def setReshapeOnPush(value: Boolean): Self = this.set("reshapeOnPush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReshapeOnPush: Self = this.set("reshapeOnPush", js.undefined)
    @scala.inline
    def setSearchExprVarargs(value: (String | js.Function)*): Self = this.set("searchExpr", js.Array(value :_*))
    @scala.inline
    def setSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = this.set("searchExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchExpr: Self = this.set("searchExpr", js.undefined)
    @scala.inline
    def setSearchOperation(value: String): Self = this.set("searchOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchOperation: Self = this.set("searchOperation", js.undefined)
    @scala.inline
    def setSearchValue(value: js.Any): Self = this.set("searchValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchValue: Self = this.set("searchValue", js.undefined)
    @scala.inline
    def setSelectVarargs(value: js.Any*): Self = this.set("select", js.Array(value :_*))
    @scala.inline
    def setSelect(value: String | js.Array[_] | js.Function): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSortVarargs(value: js.Any*): Self = this.set("sort", js.Array(value :_*))
    @scala.inline
    def setSort(value: String | js.Array[_] | js.Function): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setStoreVarargs(value: js.Any*): Self = this.set("store", js.Array(value :_*))
    @scala.inline
    def setStore(value: Store | StoreOptions[Store] | js.Array[_] | js.Any): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
  }
  
}

