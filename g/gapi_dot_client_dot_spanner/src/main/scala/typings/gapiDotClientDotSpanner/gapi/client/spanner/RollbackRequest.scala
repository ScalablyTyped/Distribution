package typings.gapiDotClientDotSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollbackRequest extends js.Object {
  /** Required. The transaction to roll back. */
  var transactionId: js.UndefOr[String] = js.undefined
}

object RollbackRequest {
  @scala.inline
  def apply(transactionId: String = null): RollbackRequest = {
    val __obj = js.Dynamic.literal()
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId)
    __obj.asInstanceOf[RollbackRequest]
  }
}

