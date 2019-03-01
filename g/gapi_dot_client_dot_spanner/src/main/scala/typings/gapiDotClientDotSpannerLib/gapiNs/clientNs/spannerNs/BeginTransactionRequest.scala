package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginTransactionRequest extends js.Object {
  /** Required. Options for the new transaction. */
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

