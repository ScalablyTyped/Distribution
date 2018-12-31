package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResultBatch extends js.Object {
  /** A cursor that points to the position after the last result in the batch. */
  var endCursor: js.UndefOr[java.lang.String] = js.undefined
  /** The result type for every entity in `entity_results`. */
  var entityResultType: js.UndefOr[java.lang.String] = js.undefined
  /** The results for this batch. */
  var entityResults: js.UndefOr[js.Array[EntityResult]] = js.undefined
  /** The state of the query after the current batch. */
  var moreResults: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A cursor that points to the position after the last skipped result.
    * Will be set when `skipped_results` != 0.
    */
  var skippedCursor: js.UndefOr[java.lang.String] = js.undefined
  /** The number of results skipped, typically because of an offset. */
  var skippedResults: js.UndefOr[scala.Double] = js.undefined
  /**
    * The version number of the snapshot this batch was returned from.
    * This applies to the range of results from the query's `start_cursor` (or
    * the beginning of the query if no cursor was given) to this batch's
    * `end_cursor` (not the query's `end_cursor`).
    *
    * In a single transaction, subsequent query result batches for the same query
    * can have a greater snapshot version number. Each batch's snapshot version
    * is valid for all preceding batches.
    * The value will be zero for eventually consistent queries.
    */
  var snapshotVersion: js.UndefOr[java.lang.String] = js.undefined
}

