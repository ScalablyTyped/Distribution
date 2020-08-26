package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAccountKeysListResponse extends js.Object {
  /** The service account credentials. */
  var serviceAccountKey: js.UndefOr[js.Array[ServiceAccountKey]] = js.native
}

object ServiceAccountKeysListResponse {
  @scala.inline
  def apply(): ServiceAccountKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAccountKeysListResponse]
  }
  @scala.inline
  implicit class ServiceAccountKeysListResponseOps[Self <: ServiceAccountKeysListResponse] (val x: Self) extends AnyVal {
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
    def setServiceAccountKeyVarargs(value: ServiceAccountKey*): Self = this.set("serviceAccountKey", js.Array(value :_*))
    @scala.inline
    def setServiceAccountKey(value: js.Array[ServiceAccountKey]): Self = this.set("serviceAccountKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccountKey: Self = this.set("serviceAccountKey", js.undefined)
  }
  
}

