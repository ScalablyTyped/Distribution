package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginTransactionRequest extends js.Object {
  /** Required. Options for the new transaction. */
  var options: js.UndefOr[TransactionOptions] = js.native
}

object BeginTransactionRequest {
  @scala.inline
  def apply(): BeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginTransactionRequest]
  }
  @scala.inline
  implicit class BeginTransactionRequestOps[Self <: BeginTransactionRequest] (val x: Self) extends AnyVal {
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
    def setOptions(value: TransactionOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

