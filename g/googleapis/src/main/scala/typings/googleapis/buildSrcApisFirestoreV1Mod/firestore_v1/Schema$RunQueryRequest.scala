package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Firestore.RunQuery.
  */
@js.native
trait Schema$RunQueryRequest extends js.Object {
  /**
    * Starts a new transaction and reads the documents. Defaults to a read-only
    * transaction. The new transaction ID will be returned as the first
    * response in the stream.
    */
  var newTransaction: js.UndefOr[Schema$TransactionOptions] = js.native
  /**
    * Reads documents as they were at the given time. This may not be older
    * than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * A structured query.
    */
  var structuredQuery: js.UndefOr[Schema$StructuredQuery] = js.native
  /**
    * Reads documents in a transaction.
    */
  var transaction: js.UndefOr[String] = js.native
}

object Schema$RunQueryRequest {
  @scala.inline
  def apply(
    newTransaction: Schema$TransactionOptions = null,
    readTime: String = null,
    structuredQuery: Schema$StructuredQuery = null,
    transaction: String = null
  ): Schema$RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    if (newTransaction != null) __obj.updateDynamic("newTransaction")(newTransaction.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (structuredQuery != null) __obj.updateDynamic("structuredQuery")(structuredQuery.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RunQueryRequest]
  }
}

