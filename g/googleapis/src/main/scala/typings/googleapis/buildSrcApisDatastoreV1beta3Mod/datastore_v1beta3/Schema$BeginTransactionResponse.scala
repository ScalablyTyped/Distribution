package typings.googleapis.buildSrcApisDatastoreV1beta3Mod.datastore_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Datastore.BeginTransaction.
  */
@js.native
trait Schema$BeginTransactionResponse extends js.Object {
  /**
    * The transaction identifier (always present).
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

