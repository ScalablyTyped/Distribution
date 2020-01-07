package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Firestore.BeginTransaction.
  */
@js.native
trait Schema$BeginTransactionRequest extends js.Object {
  /**
    * The options for the transaction. Defaults to a read-write transaction.
    */
  var options: js.UndefOr[Schema$TransactionOptions] = js.native
}

object Schema$BeginTransactionRequest {
  @scala.inline
  def apply(options: Schema$TransactionOptions = null): Schema$BeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BeginTransactionRequest]
  }
}

