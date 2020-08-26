package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVideoPropertiesRequest extends js.Object {
  var fields: js.UndefOr[String] = js.native
  var objectId: js.UndefOr[String] = js.native
  var videoProperties: js.UndefOr[VideoProperties] = js.native
}

object UpdateVideoPropertiesRequest {
  @scala.inline
  def apply(): UpdateVideoPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVideoPropertiesRequest]
  }
  @scala.inline
  implicit class UpdateVideoPropertiesRequestOps[Self <: UpdateVideoPropertiesRequest] (val x: Self) extends AnyVal {
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setVideoProperties(value: VideoProperties): Self = this.set("videoProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoProperties: Self = this.set("videoProperties", js.undefined)
  }
  
}

