package typings.dynatable.JQueryDynatable

import typings.dynatable.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inputs extends StObject {
  
  /**
    * Allows you to define the accepted modifier keys to trigger a multisort action
    *
    * @default ['ctrlKey', 'shiftKey', 'metaKey']
    * @see https://en.wikipedia.org/wiki/Modifier_key
    */
  var multisort: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @todo Find out how this `inputs.page` setting is useful + show an example
    * @default null
    */
  var page: js.UndefOr[Any] = js.undefined
  
  /**
    * Text content introducing the pagination
    *
    * @default 'Pages: '
    */
  var pageText: js.UndefOr[String] = js.undefined
  
  /**
    * The classname to be injected on the current page link
    *
    * @default 'dynatable-active-page'
    */
  var paginationActiveClass: js.UndefOr[String] = js.undefined
  
  /**
    * The classname to be injected on the `<ul>` containing the pagination
    *
    * @default 'dynatable-pagination-links'
    */
  var paginationClass: js.UndefOr[String] = js.undefined
  
  /**
    * The classname to be injected on the disabled page links
    *
    * @default 'dynatable-disabled-page'
    */
  var paginationDisabledClass: js.UndefOr[String] = js.undefined
  
  /**
    * Define the number of page number links shown inside the pagination
    *
    * @default [1,2,2,1]
    */
  var paginationGap: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The classname to be injected on every pagination link
    *
    * @default 'dynatable-page-link'
    */
  var paginationLinkClass: js.UndefOr[String] = js.undefined
  
  /**
    * Determines where the pagination links are inserted
    *
    * ('before', 'after')
    * @default 'after'
    * @see http://api.jquery.com/category/manipulation/dom-insertion-outside/
    */
  var paginationLinkPlacement: js.UndefOr[String] = js.undefined
  
  /**
    * The target inside next to which the pagination block will be inserted (before or after).
    * You can use a selector string, an Element or a JQuery.
    *
    * @default null
    */
  var paginationLinkTarget: js.UndefOr[String | Element | JQuery] = js.undefined
  
  /**
    * Text content for the next page link
    *
    * @default 'Next'
    */
  var paginationNext: js.UndefOr[String] = js.undefined
  
  /**
    * The classname to be injected on the next page link
    *
    * @default 'dynatable-page-next'
    */
  var paginationNextClass: js.UndefOr[String] = js.undefined
  
  /**
    * Text content for the previous page link
    *
    * @default 'Previous'
    */
  var paginationPrev: js.UndefOr[String] = js.undefined
  
  /**
    * The classname to be injected on the previous page link
    *
    * @default 'dynatable-page-prev'
    */
  var paginationPrevClass: js.UndefOr[String] = js.undefined
  
  /**
    * Determines where the perPage menu is inserted
    *
    * ('before', 'after')
    * @default 'before'
    * @see http://api.jquery.com/category/manipulation/dom-insertion-outside/
    */
  var perPagePlacement: js.UndefOr[String] = js.undefined
  
  /**
    * The target next to which the per page pagination block will be inserted (before or after).
    * You can use a selector string, an Element or a jQuery object.
    *
    * @default null
    */
  var perPageTarget: js.UndefOr[String | Element | JQuery] = js.undefined
  
  /**
    * Text content preceding the items per page <select>
    *
    * @default 'Show: '
    */
  var perPageText: js.UndefOr[String] = js.undefined
  
  /**
    * Text content injected inside the processingIndicator
    *
    * @default 'Processing...'
    */
  var processingText: js.UndefOr[String] = js.undefined
  
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
  var queries: js.UndefOr[JQuery] = js.undefined
  
  /**
    * The events attached to the search/filtering inputs elements
    *
    * @default 'blur change'
    */
  var queryEvent: js.UndefOr[String] = js.undefined
  
  /**
    * Text content used inside the recordsCount
    *
    * @default ' (filtered from {recordsTotal} total records)'
    */
  var recordCountFilteredTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Text content used inside the recordsCount
    *
    * @default '{pageLowerBound} to {pageUpperBound} of'
    */
  var recordCountPageBoundTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Text content used inside the recordsCount
    *
    * @default '{recordsShown} of'
    */
  var recordCountPageUnboundedTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Determines where the recordCount is inserted
    *
    * ('before', 'after')
    * @default 'after'
    * @see http://api.jquery.com/category/manipulation/dom-insertion-outside/
    */
  var recordCountPlacement: js.UndefOr[String] = js.undefined
  
  /**
    * The jQuery object pointing to a target where to insert the recordCount html
    *
    * @default null
    *
    * @example
    * $('#chart-status-text')
    */
  var recordCountTarget: js.UndefOr[JQuery] = js.undefined
  
  /**
    * Text content used inside the recordsCount
    *
    * @default '<span id="dynatable-record-count-{elementId}" class="dynatable-record-count">{textTemplate}</span>'
    */
  var recordCountTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Text content used inside the recordsCount
    *
    * @default 'Showing '
    */
  var recordCountText: js.UndefOr[String] = js.undefined
  
  /**
    * Text content used inside the recordsCount
    *
    * @default '{text} {pageTemplate} {totalTemplate} {filteredTemplate}'
    */
  var recordCountTextTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Text content used inside the recordsCount
    *
    * @default '{recordsQueryCount} {collectionName}'
    */
  var recordCountTotalTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Determines where the search field is inserted
    *
    * ('before', 'after')
    * @default 'before'
    * @see http://api.jquery.com/category/manipulation/dom-insertion-outside/
    */
  var searchPlacement: js.UndefOr[String] = js.undefined
  
  /**
    * The target next to which the search block will be inserted (before or after).
    * You can use a selector string, an Element or a JQuery.
    *
    * @default null
    */
  var searchTarget: js.UndefOr[String | Element | JQuery] = js.undefined
  
  /**
    * Text preceding the search field
    *
    * @default 'Search: '
    */
  var searchText: js.UndefOr[String] = js.undefined
  
  /**
    * @todo Find out how this `inputs.sorts` setting is useful + show an example
    * @default null
    * @see http://www.dynatable.com/#sorting
    */
  var sorts: js.UndefOr[Any] = js.undefined
}
object Inputs {
  
  inline def apply(): Inputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inputs] (val x: Self) extends AnyVal {
    
    inline def setMultisort(value: js.Array[String]): Self = StObject.set(x, "multisort", value.asInstanceOf[js.Any])
    
    inline def setMultisortUndefined: Self = StObject.set(x, "multisort", js.undefined)
    
    inline def setMultisortVarargs(value: String*): Self = StObject.set(x, "multisort", js.Array(value*))
    
    inline def setPage(value: Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageText(value: String): Self = StObject.set(x, "pageText", value.asInstanceOf[js.Any])
    
    inline def setPageTextUndefined: Self = StObject.set(x, "pageText", js.undefined)
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPaginationActiveClass(value: String): Self = StObject.set(x, "paginationActiveClass", value.asInstanceOf[js.Any])
    
    inline def setPaginationActiveClassUndefined: Self = StObject.set(x, "paginationActiveClass", js.undefined)
    
    inline def setPaginationClass(value: String): Self = StObject.set(x, "paginationClass", value.asInstanceOf[js.Any])
    
    inline def setPaginationClassUndefined: Self = StObject.set(x, "paginationClass", js.undefined)
    
    inline def setPaginationDisabledClass(value: String): Self = StObject.set(x, "paginationDisabledClass", value.asInstanceOf[js.Any])
    
    inline def setPaginationDisabledClassUndefined: Self = StObject.set(x, "paginationDisabledClass", js.undefined)
    
    inline def setPaginationGap(value: js.Array[Double]): Self = StObject.set(x, "paginationGap", value.asInstanceOf[js.Any])
    
    inline def setPaginationGapUndefined: Self = StObject.set(x, "paginationGap", js.undefined)
    
    inline def setPaginationGapVarargs(value: Double*): Self = StObject.set(x, "paginationGap", js.Array(value*))
    
    inline def setPaginationLinkClass(value: String): Self = StObject.set(x, "paginationLinkClass", value.asInstanceOf[js.Any])
    
    inline def setPaginationLinkClassUndefined: Self = StObject.set(x, "paginationLinkClass", js.undefined)
    
    inline def setPaginationLinkPlacement(value: String): Self = StObject.set(x, "paginationLinkPlacement", value.asInstanceOf[js.Any])
    
    inline def setPaginationLinkPlacementUndefined: Self = StObject.set(x, "paginationLinkPlacement", js.undefined)
    
    inline def setPaginationLinkTarget(value: String | Element | JQuery): Self = StObject.set(x, "paginationLinkTarget", value.asInstanceOf[js.Any])
    
    inline def setPaginationLinkTargetUndefined: Self = StObject.set(x, "paginationLinkTarget", js.undefined)
    
    inline def setPaginationNext(value: String): Self = StObject.set(x, "paginationNext", value.asInstanceOf[js.Any])
    
    inline def setPaginationNextClass(value: String): Self = StObject.set(x, "paginationNextClass", value.asInstanceOf[js.Any])
    
    inline def setPaginationNextClassUndefined: Self = StObject.set(x, "paginationNextClass", js.undefined)
    
    inline def setPaginationNextUndefined: Self = StObject.set(x, "paginationNext", js.undefined)
    
    inline def setPaginationPrev(value: String): Self = StObject.set(x, "paginationPrev", value.asInstanceOf[js.Any])
    
    inline def setPaginationPrevClass(value: String): Self = StObject.set(x, "paginationPrevClass", value.asInstanceOf[js.Any])
    
    inline def setPaginationPrevClassUndefined: Self = StObject.set(x, "paginationPrevClass", js.undefined)
    
    inline def setPaginationPrevUndefined: Self = StObject.set(x, "paginationPrev", js.undefined)
    
    inline def setPerPagePlacement(value: String): Self = StObject.set(x, "perPagePlacement", value.asInstanceOf[js.Any])
    
    inline def setPerPagePlacementUndefined: Self = StObject.set(x, "perPagePlacement", js.undefined)
    
    inline def setPerPageTarget(value: String | Element | JQuery): Self = StObject.set(x, "perPageTarget", value.asInstanceOf[js.Any])
    
    inline def setPerPageTargetUndefined: Self = StObject.set(x, "perPageTarget", js.undefined)
    
    inline def setPerPageText(value: String): Self = StObject.set(x, "perPageText", value.asInstanceOf[js.Any])
    
    inline def setPerPageTextUndefined: Self = StObject.set(x, "perPageText", js.undefined)
    
    inline def setProcessingText(value: String): Self = StObject.set(x, "processingText", value.asInstanceOf[js.Any])
    
    inline def setProcessingTextUndefined: Self = StObject.set(x, "processingText", js.undefined)
    
    inline def setQueries(value: JQuery): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setQueryEvent(value: String): Self = StObject.set(x, "queryEvent", value.asInstanceOf[js.Any])
    
    inline def setQueryEventUndefined: Self = StObject.set(x, "queryEvent", js.undefined)
    
    inline def setRecordCountFilteredTemplate(value: String): Self = StObject.set(x, "recordCountFilteredTemplate", value.asInstanceOf[js.Any])
    
    inline def setRecordCountFilteredTemplateUndefined: Self = StObject.set(x, "recordCountFilteredTemplate", js.undefined)
    
    inline def setRecordCountPageBoundTemplate(value: String): Self = StObject.set(x, "recordCountPageBoundTemplate", value.asInstanceOf[js.Any])
    
    inline def setRecordCountPageBoundTemplateUndefined: Self = StObject.set(x, "recordCountPageBoundTemplate", js.undefined)
    
    inline def setRecordCountPageUnboundedTemplate(value: String): Self = StObject.set(x, "recordCountPageUnboundedTemplate", value.asInstanceOf[js.Any])
    
    inline def setRecordCountPageUnboundedTemplateUndefined: Self = StObject.set(x, "recordCountPageUnboundedTemplate", js.undefined)
    
    inline def setRecordCountPlacement(value: String): Self = StObject.set(x, "recordCountPlacement", value.asInstanceOf[js.Any])
    
    inline def setRecordCountPlacementUndefined: Self = StObject.set(x, "recordCountPlacement", js.undefined)
    
    inline def setRecordCountTarget(value: JQuery): Self = StObject.set(x, "recordCountTarget", value.asInstanceOf[js.Any])
    
    inline def setRecordCountTargetUndefined: Self = StObject.set(x, "recordCountTarget", js.undefined)
    
    inline def setRecordCountTemplate(value: String): Self = StObject.set(x, "recordCountTemplate", value.asInstanceOf[js.Any])
    
    inline def setRecordCountTemplateUndefined: Self = StObject.set(x, "recordCountTemplate", js.undefined)
    
    inline def setRecordCountText(value: String): Self = StObject.set(x, "recordCountText", value.asInstanceOf[js.Any])
    
    inline def setRecordCountTextTemplate(value: String): Self = StObject.set(x, "recordCountTextTemplate", value.asInstanceOf[js.Any])
    
    inline def setRecordCountTextTemplateUndefined: Self = StObject.set(x, "recordCountTextTemplate", js.undefined)
    
    inline def setRecordCountTextUndefined: Self = StObject.set(x, "recordCountText", js.undefined)
    
    inline def setRecordCountTotalTemplate(value: String): Self = StObject.set(x, "recordCountTotalTemplate", value.asInstanceOf[js.Any])
    
    inline def setRecordCountTotalTemplateUndefined: Self = StObject.set(x, "recordCountTotalTemplate", js.undefined)
    
    inline def setSearchPlacement(value: String): Self = StObject.set(x, "searchPlacement", value.asInstanceOf[js.Any])
    
    inline def setSearchPlacementUndefined: Self = StObject.set(x, "searchPlacement", js.undefined)
    
    inline def setSearchTarget(value: String | Element | JQuery): Self = StObject.set(x, "searchTarget", value.asInstanceOf[js.Any])
    
    inline def setSearchTargetUndefined: Self = StObject.set(x, "searchTarget", js.undefined)
    
    inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    inline def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    inline def setSorts(value: Any): Self = StObject.set(x, "sorts", value.asInstanceOf[js.Any])
    
    inline def setSortsUndefined: Self = StObject.set(x, "sorts", js.undefined)
  }
}
