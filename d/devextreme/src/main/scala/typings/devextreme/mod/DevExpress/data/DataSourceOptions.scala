package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Changes
import typings.devextreme.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceOptions extends StObject {
  
  /**
    * [descr:DataSource.Options.customQueryParams]
    */
  var customQueryParams: js.UndefOr[js.Any] = js.undefined
  
  /**
    * [descr:DataSource.Options.expand]
    */
  var expand: js.UndefOr[js.Array[String] | String] = js.undefined
  
  /**
    * [descr:DataSource.Options.filter]
    */
  var filter: js.UndefOr[String | js.Array[js.Any] | js.Function] = js.undefined
  
  /**
    * [descr:DataSource.Options.group]
    */
  var group: js.UndefOr[String | js.Array[js.Any] | js.Function] = js.undefined
  
  /**
    * [descr:DataSource.Options.map]
    */
  var map: js.UndefOr[js.Function1[/* dataItem */ js.Any, js.Any]] = js.undefined
  
  /**
    * [descr:DataSource.Options.onChanged]
    */
  var onChanged: js.UndefOr[js.Function1[/* e */ Changes, js.Any]] = js.undefined
  
  /**
    * [descr:DataSource.Options.onLoadError]
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ Message, js.Any]] = js.undefined
  
  /**
    * [descr:DataSource.Options.onLoadingChanged]
    */
  var onLoadingChanged: js.UndefOr[js.Function1[/* isLoading */ Boolean, js.Any]] = js.undefined
  
  /**
    * [descr:DataSource.Options.pageSize]
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * [descr:DataSource.Options.paginate]
    */
  var paginate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:DataSource.Options.postProcess]
    */
  var postProcess: js.UndefOr[js.Function1[/* data */ js.Array[js.Any], js.Array[js.Any]]] = js.undefined
  
  /**
    * [descr:DataSource.Options.pushAggregationTimeout]
    */
  var pushAggregationTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * [descr:DataSource.Options.requireTotalCount]
    */
  var requireTotalCount: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:DataSource.Options.reshapeOnPush]
    */
  var reshapeOnPush: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:DataSource.Options.searchExpr]
    */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
  
  /**
    * [descr:DataSource.Options.searchOperation]
    */
  var searchOperation: js.UndefOr[String] = js.undefined
  
  /**
    * [descr:DataSource.Options.searchValue]
    */
  var searchValue: js.UndefOr[js.Any] = js.undefined
  
  /**
    * [descr:DataSource.Options.select]
    */
  var select: js.UndefOr[String | js.Array[js.Any] | js.Function] = js.undefined
  
  /**
    * [descr:DataSource.Options.sort]
    */
  var sort: js.UndefOr[String | js.Array[js.Any] | js.Function] = js.undefined
  
  /**
    * [descr:DataSource.Options.store]
    */
  var store: js.UndefOr[Store | StoreOptions[Store] | js.Array[js.Any] | js.Any] = js.undefined
}
object DataSourceOptions {
  
  inline def apply(): DataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceOptions]
  }
  
  extension [Self <: DataSourceOptions](x: Self) {
    
    inline def setCustomQueryParams(value: js.Any): Self = StObject.set(x, "customQueryParams", value.asInstanceOf[js.Any])
    
    inline def setCustomQueryParamsUndefined: Self = StObject.set(x, "customQueryParams", js.undefined)
    
    inline def setExpand(value: js.Array[String] | String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setExpandVarargs(value: String*): Self = StObject.set(x, "expand", js.Array(value :_*))
    
    inline def setFilter(value: String | js.Array[js.Any] | js.Function): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: js.Any*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    inline def setGroup(value: String | js.Array[js.Any] | js.Function): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupVarargs(value: js.Any*): Self = StObject.set(x, "group", js.Array(value :_*))
    
    inline def setMap(value: /* dataItem */ js.Any => js.Any): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setOnChanged(value: /* e */ Changes => js.Any): Self = StObject.set(x, "onChanged", js.Any.fromFunction1(value))
    
    inline def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
    
    inline def setOnLoadError(value: /* error */ Message => js.Any): Self = StObject.set(x, "onLoadError", js.Any.fromFunction1(value))
    
    inline def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
    
    inline def setOnLoadingChanged(value: /* isLoading */ Boolean => js.Any): Self = StObject.set(x, "onLoadingChanged", js.Any.fromFunction1(value))
    
    inline def setOnLoadingChangedUndefined: Self = StObject.set(x, "onLoadingChanged", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPaginate(value: Boolean): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
    
    inline def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
    
    inline def setPostProcess(value: /* data */ js.Array[js.Any] => js.Array[js.Any]): Self = StObject.set(x, "postProcess", js.Any.fromFunction1(value))
    
    inline def setPostProcessUndefined: Self = StObject.set(x, "postProcess", js.undefined)
    
    inline def setPushAggregationTimeout(value: Double): Self = StObject.set(x, "pushAggregationTimeout", value.asInstanceOf[js.Any])
    
    inline def setPushAggregationTimeoutUndefined: Self = StObject.set(x, "pushAggregationTimeout", js.undefined)
    
    inline def setRequireTotalCount(value: Boolean): Self = StObject.set(x, "requireTotalCount", value.asInstanceOf[js.Any])
    
    inline def setRequireTotalCountUndefined: Self = StObject.set(x, "requireTotalCount", js.undefined)
    
    inline def setReshapeOnPush(value: Boolean): Self = StObject.set(x, "reshapeOnPush", value.asInstanceOf[js.Any])
    
    inline def setReshapeOnPushUndefined: Self = StObject.set(x, "reshapeOnPush", js.undefined)
    
    inline def setSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = StObject.set(x, "searchExpr", value.asInstanceOf[js.Any])
    
    inline def setSearchExprUndefined: Self = StObject.set(x, "searchExpr", js.undefined)
    
    inline def setSearchExprVarargs(value: (String | js.Function)*): Self = StObject.set(x, "searchExpr", js.Array(value :_*))
    
    inline def setSearchOperation(value: String): Self = StObject.set(x, "searchOperation", value.asInstanceOf[js.Any])
    
    inline def setSearchOperationUndefined: Self = StObject.set(x, "searchOperation", js.undefined)
    
    inline def setSearchValue(value: js.Any): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
    
    inline def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
    
    inline def setSelect(value: String | js.Array[js.Any] | js.Function): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelectVarargs(value: js.Any*): Self = StObject.set(x, "select", js.Array(value :_*))
    
    inline def setSort(value: String | js.Array[js.Any] | js.Function): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: js.Any*): Self = StObject.set(x, "sort", js.Array(value :_*))
    
    inline def setStore(value: Store | StoreOptions[Store] | js.Array[js.Any] | js.Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setStoreVarargs(value: js.Any*): Self = StObject.set(x, "store", js.Array(value :_*))
  }
}
