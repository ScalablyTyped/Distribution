package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import typings.gapiClientIdentitytoolkit.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadAccountResponse extends js.Object {
  /** The error encountered while processing the account info. */
  var error: js.UndefOr[js.Array[Index]] = js.native
  /** The fixed string "identitytoolkit#UploadAccountResponse". */
  var kind: js.UndefOr[String] = js.native
}

object UploadAccountResponse {
  @scala.inline
  def apply(): UploadAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadAccountResponse]
  }
  @scala.inline
  implicit class UploadAccountResponseOps[Self <: UploadAccountResponse] (val x: Self) extends AnyVal {
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
    def setErrorVarargs(value: Index*): Self = this.set("error", js.Array(value :_*))
    @scala.inline
    def setError(value: js.Array[Index]): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

