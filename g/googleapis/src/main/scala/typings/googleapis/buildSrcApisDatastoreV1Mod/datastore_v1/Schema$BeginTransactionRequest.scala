package typings.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Datastore.BeginTransaction.
  */
@js.native
trait Schema$BeginTransactionRequest extends js.Object {
  /**
    * Options for a new transaction.
    */
  var transactionOptions: js.UndefOr[Schema$TransactionOptions] = js.native
}

object Schema$BeginTransactionRequest {
  @scala.inline
  def apply(transactionOptions: Schema$TransactionOptions = null): Schema$BeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    if (transactionOptions != null) __obj.updateDynamic("transactionOptions")(transactionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BeginTransactionRequest]
  }
}

