package typings.dynatable.JQueryDynatableNs

import typings.dynatable.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dynatable extends js.Object {
  /** The `element` encapsulated inside a jQuery object */
  @JSName("$element")
  var $element: JQuery = js.native
  /** The `dom` API */
  var dom: DOM = js.native
  /** The `domColumns` API */
  var domColumns: DOMColumns = js.native
  /** The native element on which the dynatable plugin was called */
  var element: Element = js.native
  /** The `inputsSearch` API */
  var inputsSearch: InputsSearch = js.native
  /** The `paginationLinks` API */
  var paginationLinks: PaginationLinks = js.native
  /** The `paginationPage` API */
  var paginationPage: PaginationPage = js.native
  /** The `paginationPerPage` API */
  var paginationPerPage: PaginationPerPage = js.native
  /** The `processingIndicator` API */
  var processingIndicator: ProcessingIndicator = js.native
  /** The `queries` API */
  var queries: Queries = js.native
  /** The `records` API */
  var records: Records = js.native
  /** The `recordsCount` API */
  var recordsCount: RecordsCount = js.native
  /** The `settings` API */
  var settings: Settings = js.native
  /** The `sorts` API */
  var sorts: Sorts = js.native
  /** The `sortsHeaders` API */
  var sortsHeaders: SortsHeaders = js.native
  /** The `state` API */
  var state: State = js.native
  /**
    * Initialize Dynatable plugin
    *
    * @param options An optional object that allow you to change the default configuration options
    */
  def apply(): JQuery = js.native
  def apply(options: Options): JQuery = js.native
  /**
    * Each dynatable instance inherits from this,
    * set properties specific to instance
    *
    * @param element The html node to be used by dynatable
    * @param options The JQueryDynatable.Options object which contains all the settings
    * @return A reference to the current and brand new dynatable object
    */
  def init(element: Element, options: Options): Dynatable = js.native
  /**
    * Call the process method on all the components of this dynatable
    *
    * @param skipPushState A boolean allowing to skip the update the query string in the URL
    */
  def process(): Unit = js.native
  def process(skipPushState: Boolean): Unit = js.native
}

