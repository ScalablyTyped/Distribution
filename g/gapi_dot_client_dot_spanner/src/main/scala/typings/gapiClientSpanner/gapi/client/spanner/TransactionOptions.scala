package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionOptions extends js.Object {
  /**
    * Transaction will not write.
    *
    * Authorization to begin a read-only transaction requires
    * `spanner.databases.beginReadOnlyTransaction` permission
    * on the `session` resource.
    */
  var readOnly: js.UndefOr[ReadOnly] = js.native
  /**
    * Transaction may write.
    *
    * Authorization to begin a read-write transaction requires
    * `spanner.databases.beginOrRollbackReadWriteTransaction` permission
    * on the `session` resource.
    */
  var readWrite: js.UndefOr[js.Any] = js.native
}

object TransactionOptions {
  @scala.inline
  def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  @scala.inline
  implicit class TransactionOptionsOps[Self <: TransactionOptions] (val x: Self) extends AnyVal {
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
    def setReadOnly(value: ReadOnly): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setReadWrite(value: js.Any): Self = this.set("readWrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadWrite: Self = this.set("readWrite", js.undefined)
  }
  
}

