package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunQueryResponse extends js.Object {
  /**
    * A query result.
    * Not set when reporting partial progress.
    */
  var document: js.UndefOr[Document] = js.undefined
  /**
    * The time at which the document was read. This may be monotonically
    * increasing; in this case, the previous documents in the result stream are
    * guaranteed not to have changed between their `read_time` and this one.
    *
    * If the query returns no results, a response with `read_time` and no
    * `document` will be sent, and this represents the time at which the query
    * was run.
    */
  var readTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of results that have been skipped due to an offset between
    * the last response and the current response.
    */
  var skippedResults: js.UndefOr[scala.Double] = js.undefined
  /**
    * The transaction that was started as part of this request.
    * Can only be set in the first response, and only if
    * RunQueryRequest.new_transaction was set in the request.
    * If set, no other fields will be set in this response.
    */
  var transaction: js.UndefOr[java.lang.String] = js.undefined
}

