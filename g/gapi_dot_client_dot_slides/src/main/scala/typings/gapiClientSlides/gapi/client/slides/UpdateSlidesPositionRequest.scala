package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSlidesPositionRequest extends js.Object {
  /**
    * The index where the slides should be inserted, based on the slide
    * arrangement before the move takes place. Must be between zero and the
    * number of slides in the presentation, inclusive.
    */
  var insertionIndex: js.UndefOr[Double] = js.native
  /**
    * The IDs of the slides in the presentation that should be moved.
    * The slides in this list must be in existing presentation order, without
    * duplicates.
    */
  var slideObjectIds: js.UndefOr[js.Array[String]] = js.native
}

object UpdateSlidesPositionRequest {
  @scala.inline
  def apply(): UpdateSlidesPositionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSlidesPositionRequest]
  }
  @scala.inline
  implicit class UpdateSlidesPositionRequestOps[Self <: UpdateSlidesPositionRequest] (val x: Self) extends AnyVal {
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
    def setSlideObjectIdsVarargs(value: String*): Self = this.set("slideObjectIds", js.Array(value :_*))
    @scala.inline
    def setSlideObjectIds(value: js.Array[String]): Self = this.set("slideObjectIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideObjectIds: Self = this.set("slideObjectIds", js.undefined)
  }
  
}

