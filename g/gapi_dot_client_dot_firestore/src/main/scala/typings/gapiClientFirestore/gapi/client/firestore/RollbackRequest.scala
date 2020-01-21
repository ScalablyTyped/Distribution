package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollbackRequest extends js.Object {
  /** The transaction to roll back. */
  var transaction: js.UndefOr[String] = js.undefined
}

object RollbackRequest {
  @scala.inline
  def apply(transaction: String = null): RollbackRequest = {
    val __obj = js.Dynamic.literal()
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackRequest]
  }
}

