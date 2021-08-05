package typings.devextreme.mod.DevExpress.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadOptions extends StObject {
  
  /**
    * [descr:LoadOptions.customQueryParams]
    */
  var customQueryParams: js.UndefOr[js.Any] = js.undefined
  
  /**
    * [descr:LoadOptions.expand]
    */
  var expand: js.UndefOr[js.Any] = js.undefined
  
  /**
    * [descr:LoadOptions.filter]
    */
  var filter: js.UndefOr[js.Any] = js.undefined
  
  /**
    * [descr:LoadOptions.group]
    */
  var group: js.UndefOr[js.Any] = js.undefined
  
  /**
    * [descr:LoadOptions.groupSummary]
    */
  var groupSummary: js.UndefOr[js.Any] = js.undefined
  
  /**
    * [descr:LoadOptions.parentIds]
    */
  var parentIds: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * [descr:LoadOptions.requireGroupCount]
    */
  var requireGroupCount: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:LoadOptions.requireTotalCount]
    */
  var requireTotalCount: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:LoadOptions.searchExpr]
    */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
  
  /**
    * [descr:LoadOptions.searchOperation]
    */
  var searchOperation: js.UndefOr[String] = js.undefined
  
  /**
    * [descr:LoadOptions.searchValue]
    */
  var searchValue: js.UndefOr[js.Any] = js.undefined
  
  /**
    * [descr:LoadOptions.select]
    */
  var select: js.UndefOr[js.Any] = js.undefined
  
  /**
    * [descr:LoadOptions.skip]
    */
  var skip: js.UndefOr[Double] = js.undefined
  
  /**
    * [descr:LoadOptions.sort]
    */
  var sort: js.UndefOr[js.Any] = js.undefined
  
  /**
    * [descr:LoadOptions.take]
    */
  var take: js.UndefOr[Double] = js.undefined
  
  /**
    * [descr:LoadOptions.totalSummary]
    */
  var totalSummary: js.UndefOr[js.Any] = js.undefined
  
  /**
    * [descr:LoadOptions.userData]
    */
  var userData: js.UndefOr[js.Any] = js.undefined
}
object LoadOptions {
  
  inline def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  
  extension [Self <: LoadOptions](x: Self) {
    
    inline def setCustomQueryParams(value: js.Any): Self = StObject.set(x, "customQueryParams", value.asInstanceOf[js.Any])
    
    inline def setCustomQueryParamsUndefined: Self = StObject.set(x, "customQueryParams", js.undefined)
    
    inline def setExpand(value: js.Any): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGroup(value: js.Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupSummary(value: js.Any): Self = StObject.set(x, "groupSummary", value.asInstanceOf[js.Any])
    
    inline def setGroupSummaryUndefined: Self = StObject.set(x, "groupSummary", js.undefined)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setParentIds(value: js.Array[js.Any]): Self = StObject.set(x, "parentIds", value.asInstanceOf[js.Any])
    
    inline def setParentIdsUndefined: Self = StObject.set(x, "parentIds", js.undefined)
    
    inline def setParentIdsVarargs(value: js.Any*): Self = StObject.set(x, "parentIds", js.Array(value :_*))
    
    inline def setRequireGroupCount(value: Boolean): Self = StObject.set(x, "requireGroupCount", value.asInstanceOf[js.Any])
    
    inline def setRequireGroupCountUndefined: Self = StObject.set(x, "requireGroupCount", js.undefined)
    
    inline def setRequireTotalCount(value: Boolean): Self = StObject.set(x, "requireTotalCount", value.asInstanceOf[js.Any])
    
    inline def setRequireTotalCountUndefined: Self = StObject.set(x, "requireTotalCount", js.undefined)
    
    inline def setSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = StObject.set(x, "searchExpr", value.asInstanceOf[js.Any])
    
    inline def setSearchExprUndefined: Self = StObject.set(x, "searchExpr", js.undefined)
    
    inline def setSearchExprVarargs(value: (String | js.Function)*): Self = StObject.set(x, "searchExpr", js.Array(value :_*))
    
    inline def setSearchOperation(value: String): Self = StObject.set(x, "searchOperation", value.asInstanceOf[js.Any])
    
    inline def setSearchOperationUndefined: Self = StObject.set(x, "searchOperation", js.undefined)
    
    inline def setSearchValue(value: js.Any): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
    
    inline def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
    
    inline def setSelect(value: js.Any): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSort(value: js.Any): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setTake(value: Double): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
    
    inline def setTakeUndefined: Self = StObject.set(x, "take", js.undefined)
    
    inline def setTotalSummary(value: js.Any): Self = StObject.set(x, "totalSummary", value.asInstanceOf[js.Any])
    
    inline def setTotalSummaryUndefined: Self = StObject.set(x, "totalSummary", js.undefined)
    
    inline def setUserData(value: js.Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
  }
}
