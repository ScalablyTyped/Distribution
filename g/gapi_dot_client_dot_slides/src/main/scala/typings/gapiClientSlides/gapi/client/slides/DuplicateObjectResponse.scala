package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DuplicateObjectResponse extends js.Object {
  /** The ID of the new duplicate object. */
  var objectId: js.UndefOr[String] = js.native
}

object DuplicateObjectResponse {
  @scala.inline
  def apply(): DuplicateObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateObjectResponse]
  }
  @scala.inline
  implicit class DuplicateObjectResponseOps[Self <: DuplicateObjectResponse] (val x: Self) extends AnyVal {
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
  }
  
}

