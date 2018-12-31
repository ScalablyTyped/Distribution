package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSessionsResponse extends js.Object {
  /**
    * If includeDeleted is set to true in the request, this list will contain sessions deleted with original end times that are within the startTime and
    * endTime frame.
    */
  var deletedSession: js.UndefOr[js.Array[Session]] = js.undefined
  /** Flag to indicate server has more data to transfer */
  var hasMoreData: js.UndefOr[scala.Boolean] = js.undefined
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Sessions with an end time that is between startTime and endTime of the request. */
  var session: js.UndefOr[js.Array[Session]] = js.undefined
}

