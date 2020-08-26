package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginTransactionResponse extends js.Object {
  /** The transaction that was started. */
  var transaction: js.UndefOr[String] = js.native
}

object BeginTransactionResponse {
  @scala.inline
  def apply(): BeginTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginTransactionResponse]
  }
  @scala.inline
  implicit class BeginTransactionResponseOps[Self <: BeginTransactionResponse] (val x: Self) extends AnyVal {
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
    def setTransaction(value: String): Self = this.set("transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
  
}

