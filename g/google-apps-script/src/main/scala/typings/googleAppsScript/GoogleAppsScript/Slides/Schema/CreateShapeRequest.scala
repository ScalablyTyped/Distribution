package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateShapeRequest extends js.Object {
  var elementProperties: js.UndefOr[PageElementProperties] = js.native
  var objectId: js.UndefOr[String] = js.native
  var shapeType: js.UndefOr[String] = js.native
}

object CreateShapeRequest {
  @scala.inline
  def apply(): CreateShapeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateShapeRequest]
  }
  @scala.inline
  implicit class CreateShapeRequestOps[Self <: CreateShapeRequest] (val x: Self) extends AnyVal {
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
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setShapeType(value: String): Self = this.set("shapeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeType: Self = this.set("shapeType", js.undefined)
  }
  
}

