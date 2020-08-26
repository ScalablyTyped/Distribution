package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateAsyncRequest extends js.Object {
  var content: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var uploaderName: js.UndefOr[String] = js.native
}

object ValidateAsyncRequest {
  @scala.inline
  def apply(): ValidateAsyncRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateAsyncRequest]
  }
  @scala.inline
  implicit class ValidateAsyncRequestOps[Self <: ValidateAsyncRequest] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setUploaderName(value: String): Self = this.set("uploaderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploaderName: Self = this.set("uploaderName", js.undefined)
  }
  
}

