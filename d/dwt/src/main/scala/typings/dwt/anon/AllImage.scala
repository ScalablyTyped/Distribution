package typings.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllImage extends js.Object {
  var allImage: js.UndefOr[DisplayName] = js.native
  var besides: js.UndefOr[`0`] = js.native
  var viewPort: js.UndefOr[`0`] = js.native
  var visibility: js.UndefOr[Boolean] = js.native
}

object AllImage {
  @scala.inline
  def apply(): AllImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllImage]
  }
  @scala.inline
  implicit class AllImageOps[Self <: AllImage] (val x: Self) extends AnyVal {
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
    def setAllImage(value: DisplayName): Self = this.set("allImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllImage: Self = this.set("allImage", js.undefined)
    @scala.inline
    def setBesides(value: `0`): Self = this.set("besides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBesides: Self = this.set("besides", js.undefined)
    @scala.inline
    def setViewPort(value: `0`): Self = this.set("viewPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewPort: Self = this.set("viewPort", js.undefined)
    @scala.inline
    def setVisibility(value: Boolean): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

