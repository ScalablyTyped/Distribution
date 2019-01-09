package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableList extends js.Object {
  /** A hash of this page of results. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The type of list. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Tables in the requested dataset. */
  var tables: js.UndefOr[js.Array[gapiDotClientDotBigqueryLib.Anon_CreationTime]] = js.undefined
  /** The total number of tables in the dataset. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

