package typings.gapiDotClientDotFirestore.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginTransactionRequest extends js.Object {
  /**
    * The options for the transaction.
    * Defaults to a read-write transaction.
    */
  var options: js.UndefOr[TransactionOptions] = js.undefined
}

object BeginTransactionRequest {
  @scala.inline
  def apply(options: TransactionOptions = null): BeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[BeginTransactionRequest]
  }
}

