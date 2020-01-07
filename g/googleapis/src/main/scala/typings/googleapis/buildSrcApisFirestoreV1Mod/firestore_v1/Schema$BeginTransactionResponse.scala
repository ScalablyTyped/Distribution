package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Firestore.BeginTransaction.
  */
@js.native
trait Schema$BeginTransactionResponse extends js.Object {
  /**
    * The transaction that was started.
    */
  var transaction: js.UndefOr[String] = js.native
}

object Schema$BeginTransactionResponse {
  @scala.inline
  def apply(transaction: String = null): Schema$BeginTransactionResponse = {
    val __obj = js.Dynamic.literal()
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BeginTransactionResponse]
  }
}

