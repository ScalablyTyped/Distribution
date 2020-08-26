package typings.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadWrite extends js.Object {
  /** The transaction identifier of the transaction being retried. */
  var previousTransaction: js.UndefOr[String] = js.native
}

object ReadWrite {
  @scala.inline
  def apply(): ReadWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadWrite]
  }
  @scala.inline
  implicit class ReadWriteOps[Self <: ReadWrite] (val x: Self) extends AnyVal {
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
    def setPreviousTransaction(value: String): Self = this.set("previousTransaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousTransaction: Self = this.set("previousTransaction", js.undefined)
  }
  
}

