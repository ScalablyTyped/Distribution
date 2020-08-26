package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostalCodesListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var postalCodes: js.UndefOr[js.Array[PostalCode]] = js.native
}

object PostalCodesListResponse {
  @scala.inline
  def apply(): PostalCodesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostalCodesListResponse]
  }
  @scala.inline
  implicit class PostalCodesListResponseOps[Self <: PostalCodesListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPostalCodesVarargs(value: PostalCode*): Self = this.set("postalCodes", js.Array(value :_*))
    @scala.inline
    def setPostalCodes(value: js.Array[PostalCode]): Self = this.set("postalCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCodes: Self = this.set("postalCodes", js.undefined)
  }
  
}

