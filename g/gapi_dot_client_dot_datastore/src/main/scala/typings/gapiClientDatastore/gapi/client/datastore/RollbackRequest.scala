package typings.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollbackRequest extends js.Object {
  /**
    * The transaction identifier, returned by a call to
    * Datastore.BeginTransaction.
    */
  var transaction: js.UndefOr[String] = js.native
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
    def setTransaction(value: String): Self = this.set("transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
  
}

