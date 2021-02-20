package typings.devextreme.mod.DevExpress.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadOptions extends StObject {
  
  /**
    * [descr:LoadOptions.customQueryParams]
    */
  var customQueryParams: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:LoadOptions.expand]
    */
  var expand: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:LoadOptions.filter]
    */
  var filter: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:LoadOptions.group]
    */
  var group: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:LoadOptions.groupSummary]
    */
  var groupSummary: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:LoadOptions.parentIds]
    */
  var parentIds: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * [descr:LoadOptions.requireGroupCount]
    */
  var requireGroupCount: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:LoadOptions.requireTotalCount]
    */
  var requireTotalCount: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:LoadOptions.searchExpr]
    */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.native
  
  /**
    * [descr:LoadOptions.searchOperation]
    */
  var searchOperation: js.UndefOr[String] = js.native
  
  /**
    * [descr:LoadOptions.searchValue]
    */
  var searchValue: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:LoadOptions.select]
    */
  var select: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:LoadOptions.skip]
    */
  var skip: js.UndefOr[Double] = js.native
  
  /**
    * [descr:LoadOptions.sort]
    */
  var sort: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:LoadOptions.take]
    */
  var take: js.UndefOr[Double] = js.native
  
  /**
    * [descr:LoadOptions.totalSummary]
    */
  var totalSummary: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:LoadOptions.userData]
    */
  var userData: js.UndefOr[js.Any] = js.native
}
object LoadOptions {
  
  @scala.inline
  def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  
  @scala.inline
  implicit class LoadOptionsMutableBuilder[Self <: LoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomQueryParams(value: js.Any): Self = StObject.set(x, "customQueryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomQueryParamsUndefined: Self = StObject.set(x, "customQueryParams", js.undefined)
    
    @scala.inline
    def setExpand(value: js.Any): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setGroup(value: js.Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSummary(value: js.Any): Self = StObject.set(x, "groupSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSummaryUndefined: Self = StObject.set(x, "groupSummary", js.undefined)
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setParentIds(value: js.Array[_]): Self = StObject.set(x, "parentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdsUndefined: Self = StObject.set(x, "parentIds", js.undefined)
    
    @scala.inline
    def setParentIdsVarargs(value: js.Any*): Self = StObject.set(x, "parentIds", js.Array(value :_*))
    
    @scala.inline
    def setRequireGroupCount(value: Boolean): Self = StObject.set(x, "requireGroupCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireGroupCountUndefined: Self = StObject.set(x, "requireGroupCount", js.undefined)
    
    @scala.inline
    def setRequireTotalCount(value: Boolean): Self = StObject.set(x, "requireTotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireTotalCountUndefined: Self = StObject.set(x, "requireTotalCount", js.undefined)
    
    @scala.inline
    def setSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = StObject.set(x, "searchExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchExprUndefined: Self = StObject.set(x, "searchExpr", js.undefined)
    
    @scala.inline
    def setSearchExprVarargs(value: (String | js.Function)*): Self = StObject.set(x, "searchExpr", js.Array(value :_*))
    
    @scala.inline
    def setSearchOperation(value: String): Self = StObject.set(x, "searchOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchOperationUndefined: Self = StObject.set(x, "searchOperation", js.undefined)
    
    @scala.inline
    def setSearchValue(value: js.Any): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
    
    @scala.inline
    def setSelect(value: js.Any): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setSort(value: js.Any): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setTake(value: Double): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTakeUndefined: Self = StObject.set(x, "take", js.undefined)
    
    @scala.inline
    def setTotalSummary(value: js.Any): Self = StObject.set(x, "totalSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSummaryUndefined: Self = StObject.set(x, "totalSummary", js.undefined)
    
    @scala.inline
    def setUserData(value: js.Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
  }
}
