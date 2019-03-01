package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginTransactionResponse extends js.Object {
  /** The transaction identifier (always present). */
  var transaction: js.UndefOr[java.lang.String] = js.undefined
}

object BeginTransactionResponse {
  @scala.inline
  def apply(transaction: java.lang.String = null): BeginTransactionResponse = {
    val __obj = js.Dynamic.literal()
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    __obj.asInstanceOf[BeginTransactionResponse]
  }
}

