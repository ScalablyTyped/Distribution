package typings.gapiDotClientDotSpanner.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  /**
    * `id` may be used to identify the transaction in subsequent
    * Read,
    * ExecuteSql,
    * Commit, or
    * Rollback calls.
    *
    * Single-use read-only transactions do not have IDs, because
    * single-use transactions do not support multiple requests.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * For snapshot read-only transactions, the read timestamp chosen
    * for the transaction. Not returned by default: see
    * TransactionOptions.ReadOnly.return_read_timestamp.
    */
  var readTimestamp: js.UndefOr[String] = js.undefined
}

object Transaction {
  @scala.inline
  def apply(id: String = null, readTimestamp: String = null): Transaction = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (readTimestamp != null) __obj.updateDynamic("readTimestamp")(readTimestamp)
    __obj.asInstanceOf[Transaction]
  }
}

