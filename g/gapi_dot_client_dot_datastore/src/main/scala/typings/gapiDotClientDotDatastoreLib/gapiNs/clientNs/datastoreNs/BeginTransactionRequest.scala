package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginTransactionRequest extends js.Object {
  /** Options for a new transaction. */
  var transactionOptions: js.UndefOr[TransactionOptions] = js.undefined
}

object BeginTransactionRequest {
  @scala.inline
  def apply(transactionOptions: TransactionOptions = null): BeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    if (transactionOptions != null) __obj.updateDynamic("transactionOptions")(transactionOptions)
    __obj.asInstanceOf[BeginTransactionRequest]
  }
}

