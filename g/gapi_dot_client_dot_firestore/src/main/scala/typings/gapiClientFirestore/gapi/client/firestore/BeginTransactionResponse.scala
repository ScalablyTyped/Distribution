package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginTransactionResponse extends js.Object {
  /** The transaction that was started. */
  var transaction: js.UndefOr[String] = js.undefined
}

object BeginTransactionResponse {
  @scala.inline
  def apply(transaction: String = null): BeginTransactionResponse = {
    val __obj = js.Dynamic.literal()
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginTransactionResponse]
  }
}

