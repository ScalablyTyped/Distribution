package typings.dynatable.JQueryDynatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Features extends StObject {
  
  /**
    * Enable the pagination feature
    *
    * @default true
    */
  var paginate: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable the perPageSelect feature
    * The perPageSelect will insert a form control filled with the options from `perPageOptions`
    *
    * @default true
    */
  var perPageSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable the pushState feature
    * Used to update the page URL parameters and cache the query result for the browser's forward- and back-buttons
    *
    * @default true
    */
  var pushState: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable the recordCount feature
    * When pagination is enabled, dynatable will also show the currently displayed records and the total number of records
    *
    * @default true
    */
  var recordCount: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable the search feature
    *
    * @default true
    */
  var search: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable the sorting feature
    *
    * @default true
    */
  var sort: js.UndefOr[Boolean] = js.native
}
object Features {
  
  @scala.inline
  def apply(): Features = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Features]
  }
  
  @scala.inline
  implicit class FeaturesMutableBuilder[Self <: Features] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaginate(value: Boolean): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
    
    @scala.inline
    def setPerPageSelect(value: Boolean): Self = StObject.set(x, "perPageSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerPageSelectUndefined: Self = StObject.set(x, "perPageSelect", js.undefined)
    
    @scala.inline
    def setPushState(value: Boolean): Self = StObject.set(x, "pushState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushStateUndefined: Self = StObject.set(x, "pushState", js.undefined)
    
    @scala.inline
    def setRecordCount(value: Boolean): Self = StObject.set(x, "recordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordCountUndefined: Self = StObject.set(x, "recordCount", js.undefined)
    
    @scala.inline
    def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
