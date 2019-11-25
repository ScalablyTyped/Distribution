package typings.dynatable.JQueryDynatable

import typings.dynatable.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inputs extends js.Object {
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
  var page: js.UndefOr[js.Any] = js.undefined
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
    * @enum('before', 'after')
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
    * @enum('before', 'after')
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
    * @enum('before', 'after')
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
    * @enum('before', 'after')
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
  var sorts: js.UndefOr[js.Any] = js.undefined
}

object Inputs {
  @scala.inline
  def apply(
    multisort: js.Array[String] = null,
    page: js.Any = null,
    pageText: String = null,
    paginationActiveClass: String = null,
    paginationClass: String = null,
    paginationDisabledClass: String = null,
    paginationGap: js.Array[Double] = null,
    paginationLinkClass: String = null,
    paginationLinkPlacement: String = null,
    paginationLinkTarget: String | Element | JQuery = null,
    paginationNext: String = null,
    paginationNextClass: String = null,
    paginationPrev: String = null,
    paginationPrevClass: String = null,
    perPagePlacement: String = null,
    perPageTarget: String | Element | JQuery = null,
    perPageText: String = null,
    processingText: String = null,
    queries: JQuery = null,
    queryEvent: String = null,
    recordCountFilteredTemplate: String = null,
    recordCountPageBoundTemplate: String = null,
    recordCountPageUnboundedTemplate: String = null,
    recordCountPlacement: String = null,
    recordCountTarget: JQuery = null,
    recordCountTemplate: String = null,
    recordCountText: String = null,
    recordCountTextTemplate: String = null,
    recordCountTotalTemplate: String = null,
    searchPlacement: String = null,
    searchTarget: String | Element | JQuery = null,
    searchText: String = null,
    sorts: js.Any = null
  ): Inputs = {
    val __obj = js.Dynamic.literal()
    if (multisort != null) __obj.updateDynamic("multisort")(multisort.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageText != null) __obj.updateDynamic("pageText")(pageText.asInstanceOf[js.Any])
    if (paginationActiveClass != null) __obj.updateDynamic("paginationActiveClass")(paginationActiveClass.asInstanceOf[js.Any])
    if (paginationClass != null) __obj.updateDynamic("paginationClass")(paginationClass.asInstanceOf[js.Any])
    if (paginationDisabledClass != null) __obj.updateDynamic("paginationDisabledClass")(paginationDisabledClass.asInstanceOf[js.Any])
    if (paginationGap != null) __obj.updateDynamic("paginationGap")(paginationGap.asInstanceOf[js.Any])
    if (paginationLinkClass != null) __obj.updateDynamic("paginationLinkClass")(paginationLinkClass.asInstanceOf[js.Any])
    if (paginationLinkPlacement != null) __obj.updateDynamic("paginationLinkPlacement")(paginationLinkPlacement.asInstanceOf[js.Any])
    if (paginationLinkTarget != null) __obj.updateDynamic("paginationLinkTarget")(paginationLinkTarget.asInstanceOf[js.Any])
    if (paginationNext != null) __obj.updateDynamic("paginationNext")(paginationNext.asInstanceOf[js.Any])
    if (paginationNextClass != null) __obj.updateDynamic("paginationNextClass")(paginationNextClass.asInstanceOf[js.Any])
    if (paginationPrev != null) __obj.updateDynamic("paginationPrev")(paginationPrev.asInstanceOf[js.Any])
    if (paginationPrevClass != null) __obj.updateDynamic("paginationPrevClass")(paginationPrevClass.asInstanceOf[js.Any])
    if (perPagePlacement != null) __obj.updateDynamic("perPagePlacement")(perPagePlacement.asInstanceOf[js.Any])
    if (perPageTarget != null) __obj.updateDynamic("perPageTarget")(perPageTarget.asInstanceOf[js.Any])
    if (perPageText != null) __obj.updateDynamic("perPageText")(perPageText.asInstanceOf[js.Any])
    if (processingText != null) __obj.updateDynamic("processingText")(processingText.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (queryEvent != null) __obj.updateDynamic("queryEvent")(queryEvent.asInstanceOf[js.Any])
    if (recordCountFilteredTemplate != null) __obj.updateDynamic("recordCountFilteredTemplate")(recordCountFilteredTemplate.asInstanceOf[js.Any])
    if (recordCountPageBoundTemplate != null) __obj.updateDynamic("recordCountPageBoundTemplate")(recordCountPageBoundTemplate.asInstanceOf[js.Any])
    if (recordCountPageUnboundedTemplate != null) __obj.updateDynamic("recordCountPageUnboundedTemplate")(recordCountPageUnboundedTemplate.asInstanceOf[js.Any])
    if (recordCountPlacement != null) __obj.updateDynamic("recordCountPlacement")(recordCountPlacement.asInstanceOf[js.Any])
    if (recordCountTarget != null) __obj.updateDynamic("recordCountTarget")(recordCountTarget.asInstanceOf[js.Any])
    if (recordCountTemplate != null) __obj.updateDynamic("recordCountTemplate")(recordCountTemplate.asInstanceOf[js.Any])
    if (recordCountText != null) __obj.updateDynamic("recordCountText")(recordCountText.asInstanceOf[js.Any])
    if (recordCountTextTemplate != null) __obj.updateDynamic("recordCountTextTemplate")(recordCountTextTemplate.asInstanceOf[js.Any])
    if (recordCountTotalTemplate != null) __obj.updateDynamic("recordCountTotalTemplate")(recordCountTotalTemplate.asInstanceOf[js.Any])
    if (searchPlacement != null) __obj.updateDynamic("searchPlacement")(searchPlacement.asInstanceOf[js.Any])
    if (searchTarget != null) __obj.updateDynamic("searchTarget")(searchTarget.asInstanceOf[js.Any])
    if (searchText != null) __obj.updateDynamic("searchText")(searchText.asInstanceOf[js.Any])
    if (sorts != null) __obj.updateDynamic("sorts")(sorts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inputs]
  }
}

