package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeFieldsListResponse extends js.Object {
  var creativeFields: js.UndefOr[js.Array[CreativeField]] = js.native
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object CreativeFieldsListResponse {
  @scala.inline
  def apply(): CreativeFieldsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeFieldsListResponse]
  }
  @scala.inline
  implicit class CreativeFieldsListResponseOps[Self <: CreativeFieldsListResponse] (val x: Self) extends AnyVal {
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
    def setCreativeFieldsVarargs(value: CreativeField*): Self = this.set("creativeFields", js.Array(value :_*))
    @scala.inline
    def setCreativeFields(value: js.Array[CreativeField]): Self = this.set("creativeFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeFields: Self = this.set("creativeFields", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

