package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaServiceAccountKeysListResponse extends js.Object {
  /**
    * The service account credentials.
    */
  var serviceAccountKey: js.UndefOr[js.Array[SchemaServiceAccountKey]] = js.native
}

object SchemaServiceAccountKeysListResponse {
  @scala.inline
  def apply(): SchemaServiceAccountKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountKeysListResponse]
  }
  @scala.inline
  implicit class SchemaServiceAccountKeysListResponseOps[Self <: SchemaServiceAccountKeysListResponse] (val x: Self) extends AnyVal {
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
    def setServiceAccountKeyVarargs(value: SchemaServiceAccountKey*): Self = this.set("serviceAccountKey", js.Array(value :_*))
    @scala.inline
    def setServiceAccountKey(value: js.Array[SchemaServiceAccountKey]): Self = this.set("serviceAccountKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccountKey: Self = this.set("serviceAccountKey", js.undefined)
  }
  
}

