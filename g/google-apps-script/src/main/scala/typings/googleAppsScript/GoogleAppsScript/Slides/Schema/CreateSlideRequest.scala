package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSlideRequest extends js.Object {
  var insertionIndex: js.UndefOr[Double] = js.native
  var objectId: js.UndefOr[String] = js.native
  var placeholderIdMappings: js.UndefOr[js.Array[LayoutPlaceholderIdMapping]] = js.native
  var slideLayoutReference: js.UndefOr[LayoutReference] = js.native
}

object CreateSlideRequest {
  @scala.inline
  def apply(): CreateSlideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSlideRequest]
  }
  @scala.inline
  implicit class CreateSlideRequestOps[Self <: CreateSlideRequest] (val x: Self) extends AnyVal {
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
    def setInsertionIndex(value: Double): Self = this.set("insertionIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertionIndex: Self = this.set("insertionIndex", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setPlaceholderIdMappingsVarargs(value: LayoutPlaceholderIdMapping*): Self = this.set("placeholderIdMappings", js.Array(value :_*))
    @scala.inline
    def setPlaceholderIdMappings(value: js.Array[LayoutPlaceholderIdMapping]): Self = this.set("placeholderIdMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderIdMappings: Self = this.set("placeholderIdMappings", js.undefined)
    @scala.inline
    def setSlideLayoutReference(value: LayoutReference): Self = this.set("slideLayoutReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideLayoutReference: Self = this.set("slideLayoutReference", js.undefined)
  }
  
}

