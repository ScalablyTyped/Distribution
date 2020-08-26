package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServiceAccountKeysResponse extends js.Object {
  /** The public keys for the service account. */
  var keys: js.UndefOr[js.Array[ServiceAccountKey]] = js.native
}

object ListServiceAccountKeysResponse {
  @scala.inline
  def apply(): ListServiceAccountKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceAccountKeysResponse]
  }
  @scala.inline
  implicit class ListServiceAccountKeysResponseOps[Self <: ListServiceAccountKeysResponse] (val x: Self) extends AnyVal {
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
    def setKeysVarargs(value: ServiceAccountKey*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[ServiceAccountKey]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
  }
  
}

