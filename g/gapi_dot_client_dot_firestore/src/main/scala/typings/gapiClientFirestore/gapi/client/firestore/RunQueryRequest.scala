package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunQueryRequest extends js.Object {
  /**
    * Starts a new transaction and reads the documents.
    * Defaults to a read-only transaction.
    * The new transaction ID will be returned as the first response in the
    * stream.
    */
  var newTransaction: js.UndefOr[TransactionOptions] = js.native
  /**
    * Reads documents as they were at the given time.
    * This may not be older than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.native
  /** A structured query. */
  var structuredQuery: js.UndefOr[StructuredQuery] = js.native
  /** Reads documents in a transaction. */
  var transaction: js.UndefOr[String] = js.native
}

object RunQueryRequest {
  @scala.inline
  def apply(): RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunQueryRequest]
  }
  @scala.inline
  implicit class RunQueryRequestOps[Self <: RunQueryRequest] (val x: Self) extends AnyVal {
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
    def setNewTransaction(value: TransactionOptions): Self = this.set("newTransaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewTransaction: Self = this.set("newTransaction", js.undefined)
    @scala.inline
    def setReadTime(value: String): Self = this.set("readTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadTime: Self = this.set("readTime", js.undefined)
    @scala.inline
    def setStructuredQuery(value: StructuredQuery): Self = this.set("structuredQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructuredQuery: Self = this.set("structuredQuery", js.undefined)
    @scala.inline
    def setTransaction(value: String): Self = this.set("transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
  
}

