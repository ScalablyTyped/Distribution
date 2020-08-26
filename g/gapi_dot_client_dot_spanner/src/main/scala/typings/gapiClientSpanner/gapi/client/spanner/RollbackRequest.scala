package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollbackRequest extends js.Object {
  /** Required. The transaction to roll back. */
  var transactionId: js.UndefOr[String] = js.native
}

object RollbackRequest {
  @scala.inline
  def apply(): RollbackRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackRequest]
  }
  @scala.inline
  implicit class RollbackRequestOps[Self <: RollbackRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTransactionId(value: String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionId: Self = this.set("transactionId", js.undefined)
  }
  
}

