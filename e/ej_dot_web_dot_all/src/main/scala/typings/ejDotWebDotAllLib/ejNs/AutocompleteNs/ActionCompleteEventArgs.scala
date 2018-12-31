package typings
package ejDotWebDotAllLib.ejNs.AutocompleteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCompleteEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns number of times trying to fetch the data
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /** returns the Autocomplete model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the query for data retrieval
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Returns the query for data retrieval from the Database
    */
  var request: js.UndefOr[js.Any] = js.undefined
  /** Returns the number of items fetched from remote data
    */
  var result: js.UndefOr[js.Array[_]] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the requested data
    */
  var xhr: js.UndefOr[js.Any] = js.undefined
}

