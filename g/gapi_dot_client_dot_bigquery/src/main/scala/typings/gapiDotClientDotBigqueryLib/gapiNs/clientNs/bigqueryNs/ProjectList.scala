package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectList extends js.Object {
  /** A hash of the page of results */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The type of list. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Projects to which you have at least READ access. */
  var projects: js.UndefOr[js.Array[gapiDotClientDotBigqueryLib.Anon_ProjectReference]] = js.undefined
  /** The total number of projects in the list. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

