package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitRequest extends js.Object {
  /**
    * If non-empty, applies all writes in this transaction, and commits it.
    * Otherwise, applies the writes as if they were in their own transaction.
    */
  var transaction: js.UndefOr[String] = js.native
  /**
    * The writes to apply.
    *
    * Always executed atomically and in order.
    */
  var writes: js.UndefOr[js.Array[Write]] = js.native
}

object CommitRequest {
  @scala.inline
  def apply(): CommitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitRequest]
  }
  @scala.inline
  implicit class CommitRequestOps[Self <: CommitRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setWritesVarargs(value: Write*): Self = this.set("writes", js.Array(value :_*))
    @scala.inline
    def setWrites(value: js.Array[Write]): Self = this.set("writes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrites: Self = this.set("writes", js.undefined)
  }
  
}

