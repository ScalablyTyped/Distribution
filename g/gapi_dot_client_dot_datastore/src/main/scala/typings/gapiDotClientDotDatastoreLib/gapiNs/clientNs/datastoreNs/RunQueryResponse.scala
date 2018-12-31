package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunQueryResponse extends js.Object {
  /** A batch of query results (always present). */
  var batch: js.UndefOr[QueryResultBatch] = js.undefined
  /** The parsed form of the `GqlQuery` from the request, if it was set. */
  var query: js.UndefOr[Query] = js.undefined
}

