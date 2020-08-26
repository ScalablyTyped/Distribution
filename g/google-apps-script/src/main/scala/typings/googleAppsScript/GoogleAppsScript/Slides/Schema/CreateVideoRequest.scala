package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVideoRequest extends js.Object {
  var elementProperties: js.UndefOr[PageElementProperties] = js.native
  var id: js.UndefOr[String] = js.native
  var objectId: js.UndefOr[String] = js.native
  var source: js.UndefOr[String] = js.native
}

object CreateVideoRequest {
  @scala.inline
  def apply(): CreateVideoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVideoRequest]
  }
  @scala.inline
  implicit class CreateVideoRequestOps[Self <: CreateVideoRequest] (val x: Self) extends AnyVal {
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
    def setElementProperties(value: PageElementProperties): Self = this.set("elementProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementProperties: Self = this.set("elementProperties", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

