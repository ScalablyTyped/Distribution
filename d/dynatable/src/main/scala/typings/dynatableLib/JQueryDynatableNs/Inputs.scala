package typings
package dynatableLib.JQueryDynatableNs

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
  var multisort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
  var pageText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The classname to be injected on the current page link
    *
    * @default 'dynatable-active-page'
    */
  var paginationActiveClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The classname to be injected on the `<ul>` containing the pagination
    *
    * @default 'dynatable-pagination-links'
    */
  var paginationClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The classname to be injected on the disabled page links
    *
    * @default 'dynatable-disabled-page'
    */
  var paginationDisabledClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Define the number of page number links shown inside the pagination
    *
    * @default [1,2,2,1]
    */
  var paginationGap: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The classname to be injected on every pagination link
    *
    * @default 'dynatable-page-link'
    */
  var paginationLinkClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Determines where the pagination links are inserted
    *
    * @enum('before', 'after')
    * @default 'after'
    * @see http://api.jquery.com/category/manipulation/dom-insertion-outside/
    */
  var paginationLinkPlacement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The target inside next to which the pagination block will be inserted (before or after).
    * You can use a selector string, an Element or a JQuery.
    *
    * @default null
    */
  var paginationLinkTarget: js.UndefOr[java.lang.String | stdLib.Element | dynatableLib.JQuery] = js.undefined
  /**
    * Text content for the next page link
    *
    * @default 'Next'
    */
  var paginationNext: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The classname to be injected on the next page link
    *
    * @default 'dynatable-page-next'
    */
  var paginationNextClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text content for the previous page link
    *
    * @default 'Previous'
    */
  var paginationPrev: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The classname to be injected on the previous page link
    *
    * @default 'dynatable-page-prev'
    */
  var paginationPrevClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Determines where the perPage menu is inserted
    *
    * @enum('before', 'after')
    * @default 'before'
    * @see http://api.jquery.com/category/manipulation/dom-insertion-outside/
    */
  var perPagePlacement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The target next to which the per page pagination block will be inserted (before or after).
    * You can use a selector string, an Element or a jQuery object.
    *
    * @default null
    */
  var perPageTarget: js.UndefOr[java.lang.String | stdLib.Element | dynatableLib.JQuery] = js.undefined
  /**
    * Text content preceding the items per page <select>
    *
    * @default 'Show: '
    */
  var perPageText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text content injected inside the processingIndicator
    *
    * @default 'Processing...'
    */
  var processingText: js.UndefOr[java.lang.String] = js.undefined
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
  var queries: js.UndefOr[dynatableLib.JQuery] = js.undefined
  /**
    * The events attached to the search/filtering inputs elements
    *
    * @default 'blur change'
    */
  var queryEvent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text content used inside the recordsCount
    *
    * @default ' (filtered from {recordsTotal} total records)'
    */
  var recordCountFilteredTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text content used inside the recordsCount
    *
    * @default '{pageLowerBound} to {pageUpperBound} of'
    */
  var recordCountPageBoundTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text content used inside the recordsCount
    *
    * @default '{recordsShown} of'
    */
  var recordCountPageUnboundedTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Determines where the recordCount is inserted
    *
    * @enum('before', 'after')
    * @default 'after'
    * @see http://api.jquery.com/category/manipulation/dom-insertion-outside/
    */
  var recordCountPlacement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The jQuery object pointing to a target where to insert the recordCount html
    *
    * @default null
    *
    * @example
    * $('#chart-status-text')
    */
  var recordCountTarget: js.UndefOr[dynatableLib.JQuery] = js.undefined
  /**
    * Text content used inside the recordsCount
    *
    * @default '<span id="dynatable-record-count-{elementId}" class="dynatable-record-count">{textTemplate}</span>'
    */
  var recordCountTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text content used inside the recordsCount
    *
    * @default 'Showing '
    */
  var recordCountText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text content used inside the recordsCount
    *
    * @default '{text} {pageTemplate} {totalTemplate} {filteredTemplate}'
    */
  var recordCountTextTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text content used inside the recordsCount
    *
    * @default '{recordsQueryCount} {collectionName}'
    */
  var recordCountTotalTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Determines where the search field is inserted
    *
    * @enum('before', 'after')
    * @default 'before'
    * @see http://api.jquery.com/category/manipulation/dom-insertion-outside/
    */
  var searchPlacement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The target next to which the search block will be inserted (before or after).
    * You can use a selector string, an Element or a JQuery.
    *
    * @default null
    */
  var searchTarget: js.UndefOr[java.lang.String | stdLib.Element | dynatableLib.JQuery] = js.undefined
  /**
    * Text preceding the search field
    *
    * @default 'Search: '
    */
  var searchText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @todo Find out how this `inputs.sorts` setting is useful + show an example
    * @default null
    * @see http://www.dynatable.com/#sorting
    */
  var sorts: js.UndefOr[js.Any] = js.undefined
}

