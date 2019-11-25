package typings.gapiDotClientDotFirestore.gapi.client.firestore

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
  var readTime: js.UndefOr[String] = js.undefined
  /**
    * The number of results that have been skipped due to an offset between
    * the last response and the current response.
    */
  var skippedResults: js.UndefOr[Double] = js.undefined
  /**
    * The transaction that was started as part of this request.
    * Can only be set in the first response, and only if
    * RunQueryRequest.new_transaction was set in the request.
    * If set, no other fields will be set in this response.
    */
  var transaction: js.UndefOr[String] = js.undefined
}

object RunQueryResponse {
  @scala.inline
  def apply(
    document: Document = null,
    readTime: String = null,
    skippedResults: Int | Double = null,
    transaction: String = null
  ): RunQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (skippedResults != null) __obj.updateDynamic("skippedResults")(skippedResults.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunQueryResponse]
  }
}

