package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagesDeleteAllResponse extends js.Object {
  var deleted: js.UndefOr[js.Array[Image]] = js.native
}

object ImagesDeleteAllResponse {
  @scala.inline
  def apply(): ImagesDeleteAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagesDeleteAllResponse]
  }
  @scala.inline
  implicit class ImagesDeleteAllResponseOps[Self <: ImagesDeleteAllResponse] (val x: Self) extends AnyVal {
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
    def setDeletedVarargs(value: Image*): Self = this.set("deleted", js.Array(value :_*))
    @scala.inline
    def setDeleted(value: js.Array[Image]): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
  }
  
}

