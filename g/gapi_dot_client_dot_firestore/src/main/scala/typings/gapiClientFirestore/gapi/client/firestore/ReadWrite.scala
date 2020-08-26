package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadWrite extends js.Object {
  /** An optional transaction to retry. */
  var retryTransaction: js.UndefOr[String] = js.native
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
    def setRetryTransaction(value: String): Self = this.set("retryTransaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryTransaction: Self = this.set("retryTransaction", js.undefined)
  }
  
}

