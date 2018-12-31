package typings
package dynatableLib.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features extends js.Object {
  /**
    * Enable the pagination feature
    *
    * @default true
    */
  var paginate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable the perPageSelect feature
    * The perPageSelect will insert a form control filled with the options from `perPageOptions`
    *
    * @default true
    */
  var perPageSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable the pushState feature
    * Used to update the page URL parameters and cache the query result for the browser's forward- and back-buttons
    *
    * @default true
    */
  var pushState: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable the recordCount feature
    * When pagination is enabled, dynatable will also show the currently displayed records and the total number of records
    *
    * @default true
    */
  var recordCount: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable the search feature
    *
    * @default true
    */
  var search: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable the sorting feature
    *
    * @default true
    */
  var sort: js.UndefOr[scala.Boolean] = js.undefined
}

