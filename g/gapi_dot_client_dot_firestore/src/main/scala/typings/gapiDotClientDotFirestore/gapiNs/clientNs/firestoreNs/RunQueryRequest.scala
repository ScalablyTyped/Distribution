package typings.gapiDotClientDotFirestore.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunQueryRequest extends js.Object {
  /**
    * Starts a new transaction and reads the documents.
    * Defaults to a read-only transaction.
    * The new transaction ID will be returned as the first response in the
    * stream.
    */
  var newTransaction: js.UndefOr[TransactionOptions] = js.undefined
  /**
    * Reads documents as they were at the given time.
    * This may not be older than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.undefined
  /** A structured query. */
  var structuredQuery: js.UndefOr[StructuredQuery] = js.undefined
  /** Reads documents in a transaction. */
  var transaction: js.UndefOr[String] = js.undefined
}

object RunQueryRequest {
  @scala.inline
  def apply(
    newTransaction: TransactionOptions = null,
    readTime: String = null,
    structuredQuery: StructuredQuery = null,
    transaction: String = null
  ): RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    if (newTransaction != null) __obj.updateDynamic("newTransaction")(newTransaction)
    if (readTime != null) __obj.updateDynamic("readTime")(readTime)
    if (structuredQuery != null) __obj.updateDynamic("structuredQuery")(structuredQuery)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    __obj.asInstanceOf[RunQueryRequest]
  }
}

