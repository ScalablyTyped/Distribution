package typings.dynatable.JQueryDynatable

import typings.dynatable.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inputs extends StObject {
  
  /**
    * Allows you to define the accepted modifier keys to trigger a multisort action
    *
    * @default ['ctrlKey', 'shiftKey', 'metaKey']
    * @see https://en.wikipedia.org/wiki/Modifier_key
    */
  var multisort: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * @todo Find out how this `inputs.page` setting is useful + show an example
    * @default null
    */
  var page: js.UndefOr[js.Any] = js.native
  
  /**
    * Text content introducing the pagination
    *
    * @default 'Pages: '
    */
  var pageText: js.UndefOr[String] = js.native
  
  /**
    * The classname to be injected on the current page link
    *
    * @default 'dynatable-active-page'
    */
  var paginationActiveClass: js.UndefOr[String] = js.native
  
  /**
    * The classname to be injected on the `<ul>` containing the pagination
    *
    * @default 'dynatable-pagination-links'
    */
  var paginationClass: js.UndefOr[String] = js.native
  
  /**
    * The classname to be injected on the disabled page links
    *
    * @default 'dynatable-disabled-page'
    */
  var paginationDisabledClass: js.UndefOr[String] = js.native
  
  /**
    * Define the number of page number links shown inside the pagination
    *
    * @default [1,2,2,1]
    */
  var paginationGap: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The classname to be injected on every pagination link
    *
    * @default 'dynatable-page-link'
    */
  var paginationLinkClass: js.UndefOr[String] = js.native
  
  /**
    * Determines where the pagination links are inserted
    *
    * @enum('before', 'after')
    * @default 'after'
    * @see http://api.jquery.com/category/manipulation/dom-insertion-outside/
    */
  var paginationLinkPlacement: js.UndefOr[String] = js.native
  
  /**
    * The target inside next to which the pagination block will be inserted (before or after).
    * You can use a selector string, an Element or a JQuery.
    *
    * @default null
    */
  var paginationLinkTarget: js.UndefOr[String | Element | JQuery] = js.native
  
  /**
    * Text content for the next page link
    *
    * @default 'Next'
    */
  var paginationNext: js.UndefOr[String] = js.native
  
  /**
    * The classname to be injected on the next page link
    *
    * @default 'dynatable-page-next'
    */
  var paginationNextClass: js.UndefOr[String] = js.native
  
  /**
    * Text content for the previous page link
    *
    * @default 'Previous'
    */
  var paginationPrev: js.UndefOr[String] = js.native
  
  /**
    * The classname to be injected on the previous page link
    *
    * @default 'dynatable-page-prev'
    */
  var paginationPrevClass: js.UndefOr[String] = js.native
  
  /**
    * Determines where the perPage menu is inserted
    *
    * @enum('before', 'after')
    * @default 'before'
    * @see http://api.jquery.com/category/manipulation/dom-insertion-outside/
    */
  var perPagePlacement: js.UndefOr[String] = js.native
  
  /**
    * The target next to which the per page pagination block will be inserted (before or after).
    * You can use a selector string, an Element or a jQuery object.
    *
    * @default null
    */
  var perPageTarget: js.UndefOr[String | Element | JQuery] = js.native
  
  /**
    * Text content preceding the items per page <select>
    *
    * @default 'Show: '
    */
  var perPageText: js.UndefOr[String] = js.native
  
  /**
    * Text content injected inside the processingIndicator
    *
    * @default 'Processing...'
    */
  var processingText: js.UndefOr[String] = js.native
  
  /**
    * Allows you to provide an array of jQuery objects which point to our filter inputs.
    * The inputs musts have a name attribute value matching a columnId in order to work.
    * Input values must strictly match the data from the cell...
    * Searching for "Lux" won't show "Luxembourg" event if it starts if the same letters!
    *
    * @default null
    * @see http://www.dynatable.com/#querying
    *
    * @example
    * $('#search-year')
    */
  var queries: js.UndefOr[JQuery] = js.native
  
  /**
    * The events attached to the search/filtering inputs elements
    *
    * @default 'blur change'
    */
  var queryEvent: js.UndefOr[String] = js.native
  
  /**
    * Text content used inside the recordsCount
    *
    * @default ' (filtered from {recordsTotal} total records)'
    */
  var recordCountFilteredTemplate: js.UndefOr[String] = js.native
  
  /**
    * Text content used inside the recordsCount
    *
    * @default '{pageLowerBound} to {pageUpperBound} of'
    */
  var recordCountPageBoundTemplate: js.UndefOr[String] = js.native
  
  /**
    * Text content used inside the recordsCount
    *
    * @default '{recordsShown} of'
    */
  var recordCountPageUnboundedTemplate: js.UndefOr[String] = js.native
  
  /**
    * Determines where the recordCount is inserted
    *
    * @enum('before', 'after')
    * @default 'after'
    * @see http://api.jquery.com/category/manipulation/dom-insertion-outside/
    */
  var recordCountPlacement: js.UndefOr[String] = js.native
  
  /**
    * The jQuery object pointing to a target where to insert the recordCount html
    *
    * @default null
    *
    * @example
    * $('#chart-status-text')
    */
  var recordCountTarget: js.UndefOr[JQuery] = js.native
  
  /**
    * Text content used inside the recordsCount
    *
    * @default '<span id="dynatable-record-count-{elementId}" class="dynatable-record-count">{textTemplate}</span>'
    */
  var recordCountTemplate: js.UndefOr[String] = js.native
  
  /**
    * Text content used inside the recordsCount
    *
    * @default 'Showing '
    */
  var recordCountText: js.UndefOr[String] = js.native
  
  /**
    * Text content used inside the recordsCount
    *
    * @default '{text} {pageTemplate} {totalTemplate} {filteredTemplate}'
    */
  var recordCountTextTemplate: js.UndefOr[String] = js.native
  
  /**
    * Text content used inside the recordsCount
    *
    * @default '{recordsQueryCount} {collectionName}'
    */
  var recordCountTotalTemplate: js.UndefOr[String] = js.native
  
  /**
    * Determines where the search field is inserted
    *
    * @enum('before', 'after')
    * @default 'before'
    * @see http://api.jquery.com/category/manipulation/dom-insertion-outside/
    */
  var searchPlacement: js.UndefOr[String] = js.native
  
  /**
    * The target next to which the search block will be inserted (before or after).
    * You can use a selector string, an Element or a JQuery.
    *
    * @default null
    */
  var searchTarget: js.UndefOr[String | Element | JQuery] = js.native
  
  /**
    * Text preceding the search field
    *
    * @default 'Search: '
    */
  var searchText: js.UndefOr[String] = js.native
  
  /**
    * @todo Find out how this `inputs.sorts` setting is useful + show an example
    * @default null
    * @see http://www.dynatable.com/#sorting
    */
  var sorts: js.UndefOr[js.Any] = js.native
}
object Inputs {
  
  @scala.inline
  def apply(): Inputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inputs]
  }
  
  @scala.inline
  implicit class InputsMutableBuilder[Self <: Inputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultisort(value: js.Array[String]): Self = StObject.set(x, "multisort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultisortUndefined: Self = StObject.set(x, "multisort", js.undefined)
    
    @scala.inline
    def setMultisortVarargs(value: String*): Self = StObject.set(x, "multisort", js.Array(value :_*))
    
    @scala.inline
    def setPage(value: js.Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageText(value: String): Self = StObject.set(x, "pageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTextUndefined: Self = StObject.set(x, "pageText", js.undefined)
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPaginationActiveClass(value: String): Self = StObject.set(x, "paginationActiveClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationActiveClassUndefined: Self = StObject.set(x, "paginationActiveClass", js.undefined)
    
    @scala.inline
    def setPaginationClass(value: String): Self = StObject.set(x, "paginationClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationClassUndefined: Self = StObject.set(x, "paginationClass", js.undefined)
    
    @scala.inline
    def setPaginationDisabledClass(value: String): Self = StObject.set(x, "paginationDisabledClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationDisabledClassUndefined: Self = StObject.set(x, "paginationDisabledClass", js.undefined)
    
    @scala.inline
    def setPaginationGap(value: js.Array[Double]): Self = StObject.set(x, "paginationGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationGapUndefined: Self = StObject.set(x, "paginationGap", js.undefined)
    
    @scala.inline
    def setPaginationGapVarargs(value: Double*): Self = StObject.set(x, "paginationGap", js.Array(value :_*))
    
    @scala.inline
    def setPaginationLinkClass(value: String): Self = StObject.set(x, "paginationLinkClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationLinkClassUndefined: Self = StObject.set(x, "paginationLinkClass", js.undefined)
    
    @scala.inline
    def setPaginationLinkPlacement(value: String): Self = StObject.set(x, "paginationLinkPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationLinkPlacementUndefined: Self = StObject.set(x, "paginationLinkPlacement", js.undefined)
    
    @scala.inline
    def setPaginationLinkTarget(value: String | Element | JQuery): Self = StObject.set(x, "paginationLinkTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationLinkTargetUndefined: Self = StObject.set(x, "paginationLinkTarget", js.undefined)
    
    @scala.inline
    def setPaginationNext(value: String): Self = StObject.set(x, "paginationNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationNextClass(value: String): Self = StObject.set(x, "paginationNextClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationNextClassUndefined: Self = StObject.set(x, "paginationNextClass", js.undefined)
    
    @scala.inline
    def setPaginationNextUndefined: Self = StObject.set(x, "paginationNext", js.undefined)
    
    @scala.inline
    def setPaginationPrev(value: String): Self = StObject.set(x, "paginationPrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationPrevClass(value: String): Self = StObject.set(x, "paginationPrevClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationPrevClassUndefined: Self = StObject.set(x, "paginationPrevClass", js.undefined)
    
    @scala.inline
    def setPaginationPrevUndefined: Self = StObject.set(x, "paginationPrev", js.undefined)
    
    @scala.inline
    def setPerPagePlacement(value: String): Self = StObject.set(x, "perPagePlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerPagePlacementUndefined: Self = StObject.set(x, "perPagePlacement", js.undefined)
    
    @scala.inline
    def setPerPageTarget(value: String | Element | JQuery): Self = StObject.set(x, "perPageTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerPageTargetUndefined: Self = StObject.set(x, "perPageTarget", js.undefined)
    
    @scala.inline
    def setPerPageText(value: String): Self = StObject.set(x, "perPageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerPageTextUndefined: Self = StObject.set(x, "perPageText", js.undefined)
    
    @scala.inline
    def setProcessingText(value: String): Self = StObject.set(x, "processingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingTextUndefined: Self = StObject.set(x, "processingText", js.undefined)
    
    @scala.inline
    def setQueries(value: JQuery): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    @scala.inline
    def setQueryEvent(value: String): Self = StObject.set(x, "queryEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryEventUndefined: Self = StObject.set(x, "queryEvent", js.undefined)
    
    @scala.inline
    def setRecordCountFilteredTemplate(value: String): Self = StObject.set(x, "recordCountFilteredTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordCountFilteredTemplateUndefined: Self = StObject.set(x, "recordCountFilteredTemplate", js.undefined)
    
    @scala.inline
    def setRecordCountPageBoundTemplate(value: String): Self = StObject.set(x, "recordCountPageBoundTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordCountPageBoundTemplateUndefined: Self = StObject.set(x, "recordCountPageBoundTemplate", js.undefined)
    
    @scala.inline
    def setRecordCountPageUnboundedTemplate(value: String): Self = StObject.set(x, "recordCountPageUnboundedTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordCountPageUnboundedTemplateUndefined: Self = StObject.set(x, "recordCountPageUnboundedTemplate", js.undefined)
    
    @scala.inline
    def setRecordCountPlacement(value: String): Self = StObject.set(x, "recordCountPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordCountPlacementUndefined: Self = StObject.set(x, "recordCountPlacement", js.undefined)
    
    @scala.inline
    def setRecordCountTarget(value: JQuery): Self = StObject.set(x, "recordCountTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordCountTargetUndefined: Self = StObject.set(x, "recordCountTarget", js.undefined)
    
    @scala.inline
    def setRecordCountTemplate(value: String): Self = StObject.set(x, "recordCountTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordCountTemplateUndefined: Self = StObject.set(x, "recordCountTemplate", js.undefined)
    
    @scala.inline
    def setRecordCountText(value: String): Self = StObject.set(x, "recordCountText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordCountTextTemplate(value: String): Self = StObject.set(x, "recordCountTextTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordCountTextTemplateUndefined: Self = StObject.set(x, "recordCountTextTemplate", js.undefined)
    
    @scala.inline
    def setRecordCountTextUndefined: Self = StObject.set(x, "recordCountText", js.undefined)
    
    @scala.inline
    def setRecordCountTotalTemplate(value: String): Self = StObject.set(x, "recordCountTotalTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordCountTotalTemplateUndefined: Self = StObject.set(x, "recordCountTotalTemplate", js.undefined)
    
    @scala.inline
    def setSearchPlacement(value: String): Self = StObject.set(x, "searchPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPlacementUndefined: Self = StObject.set(x, "searchPlacement", js.undefined)
    
    @scala.inline
    def setSearchTarget(value: String | Element | JQuery): Self = StObject.set(x, "searchTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTargetUndefined: Self = StObject.set(x, "searchTarget", js.undefined)
    
    @scala.inline
    def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    @scala.inline
    def setSorts(value: js.Any): Self = StObject.set(x, "sorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortsUndefined: Self = StObject.set(x, "sorts", js.undefined)
  }
}
