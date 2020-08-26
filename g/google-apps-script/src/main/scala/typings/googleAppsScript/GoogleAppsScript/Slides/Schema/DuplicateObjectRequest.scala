package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DuplicateObjectRequest extends js.Object {
  var objectId: js.UndefOr[String] = js.native
  var objectIds: js.UndefOr[js.Object] = js.native
}

object DuplicateObjectRequest {
  @scala.inline
  def apply(): DuplicateObjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateObjectRequest]
  }
  @scala.inline
  implicit class DuplicateObjectRequestOps[Self <: DuplicateObjectRequest] (val x: Self) extends AnyVal {
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
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setObjectIds(value: js.Object): Self = this.set("objectIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectIds: Self = this.set("objectIds", js.undefined)
  }
  
}

