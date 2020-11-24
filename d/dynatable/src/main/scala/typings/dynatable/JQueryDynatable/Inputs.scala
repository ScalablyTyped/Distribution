package typings.dynatable.JQueryDynatable

import typings.dynatable.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inputs extends js.Object {
  
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
  implicit class InputsOps[Self <: Inputs] (val x: Self) extends AnyVal {
    
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
    def setMultisortVarargs(value: String*): Self = this.set("multisort", js.Array(value :_*))
    
    @scala.inline
    def setMultisort(value: js.Array[String]): Self = this.set("multisort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultisort: Self = this.set("multisort", js.undefined)
    
    @scala.inline
    def setPage(value: js.Any): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPageText(value: String): Self = this.set("pageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageText: Self = this.set("pageText", js.undefined)
    
    @scala.inline
    def setPaginationActiveClass(value: String): Self = this.set("paginationActiveClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationActiveClass: Self = this.set("paginationActiveClass", js.undefined)
    
    @scala.inline
    def setPaginationClass(value: String): Self = this.set("paginationClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationClass: Self = this.set("paginationClass", js.undefined)
    
    @scala.inline
    def setPaginationDisabledClass(value: String): Self = this.set("paginationDisabledClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationDisabledClass: Self = this.set("paginationDisabledClass", js.undefined)
    
    @scala.inline
    def setPaginationGapVarargs(value: Double*): Self = this.set("paginationGap", js.Array(value :_*))
    
    @scala.inline
    def setPaginationGap(value: js.Array[Double]): Self = this.set("paginationGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationGap: Self = this.set("paginationGap", js.undefined)
    
    @scala.inline
    def setPaginationLinkClass(value: String): Self = this.set("paginationLinkClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationLinkClass: Self = this.set("paginationLinkClass", js.undefined)
    
    @scala.inline
    def setPaginationLinkPlacement(value: String): Self = this.set("paginationLinkPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationLinkPlacement: Self = this.set("paginationLinkPlacement", js.undefined)
    
    @scala.inline
    def setPaginationLinkTarget(value: String | Element | JQuery): Self = this.set("paginationLinkTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationLinkTarget: Self = this.set("paginationLinkTarget", js.undefined)
    
    @scala.inline
    def setPaginationNext(value: String): Self = this.set("paginationNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationNext: Self = this.set("paginationNext", js.undefined)
    
    @scala.inline
    def setPaginationNextClass(value: String): Self = this.set("paginationNextClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationNextClass: Self = this.set("paginationNextClass", js.undefined)
    
    @scala.inline
    def setPaginationPrev(value: String): Self = this.set("paginationPrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationPrev: Self = this.set("paginationPrev", js.undefined)
    
    @scala.inline
    def setPaginationPrevClass(value: String): Self = this.set("paginationPrevClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationPrevClass: Self = this.set("paginationPrevClass", js.undefined)
    
    @scala.inline
    def setPerPagePlacement(value: String): Self = this.set("perPagePlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerPagePlacement: Self = this.set("perPagePlacement", js.undefined)
    
    @scala.inline
    def setPerPageTarget(value: String | Element | JQuery): Self = this.set("perPageTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerPageTarget: Self = this.set("perPageTarget", js.undefined)
    
    @scala.inline
    def setPerPageText(value: String): Self = this.set("perPageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerPageText: Self = this.set("perPageText", js.undefined)
    
    @scala.inline
    def setProcessingText(value: String): Self = this.set("processingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingText: Self = this.set("processingText", js.undefined)
    
    @scala.inline
    def setQueries(value: JQuery): Self = this.set("queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
    
    @scala.inline
    def setQueryEvent(value: String): Self = this.set("queryEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryEvent: Self = this.set("queryEvent", js.undefined)
    
    @scala.inline
    def setRecordCountFilteredTemplate(value: String): Self = this.set("recordCountFilteredTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordCountFilteredTemplate: Self = this.set("recordCountFilteredTemplate", js.undefined)
    
    @scala.inline
    def setRecordCountPageBoundTemplate(value: String): Self = this.set("recordCountPageBoundTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordCountPageBoundTemplate: Self = this.set("recordCountPageBoundTemplate", js.undefined)
    
    @scala.inline
    def setRecordCountPageUnboundedTemplate(value: String): Self = this.set("recordCountPageUnboundedTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordCountPageUnboundedTemplate: Self = this.set("recordCountPageUnboundedTemplate", js.undefined)
    
    @scala.inline
    def setRecordCountPlacement(value: String): Self = this.set("recordCountPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordCountPlacement: Self = this.set("recordCountPlacement", js.undefined)
    
    @scala.inline
    def setRecordCountTarget(value: JQuery): Self = this.set("recordCountTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordCountTarget: Self = this.set("recordCountTarget", js.undefined)
    
    @scala.inline
    def setRecordCountTemplate(value: String): Self = this.set("recordCountTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordCountTemplate: Self = this.set("recordCountTemplate", js.undefined)
    
    @scala.inline
    def setRecordCountText(value: String): Self = this.set("recordCountText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordCountText: Self = this.set("recordCountText", js.undefined)
    
    @scala.inline
    def setRecordCountTextTemplate(value: String): Self = this.set("recordCountTextTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordCountTextTemplate: Self = this.set("recordCountTextTemplate", js.undefined)
    
    @scala.inline
    def setRecordCountTotalTemplate(value: String): Self = this.set("recordCountTotalTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordCountTotalTemplate: Self = this.set("recordCountTotalTemplate", js.undefined)
    
    @scala.inline
    def setSearchPlacement(value: String): Self = this.set("searchPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchPlacement: Self = this.set("searchPlacement", js.undefined)
    
    @scala.inline
    def setSearchTarget(value: String | Element | JQuery): Self = this.set("searchTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchTarget: Self = this.set("searchTarget", js.undefined)
    
    @scala.inline
    def setSearchText(value: String): Self = this.set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchText: Self = this.set("searchText", js.undefined)
    
    @scala.inline
    def setSorts(value: js.Any): Self = this.set("sorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorts: Self = this.set("sorts", js.undefined)
  }
}
