package typings.gamequery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationOptions extends js.Object {
  var delta: js.UndefOr[Double] = js.native
  var distance: js.UndefOr[Double] = js.native
  var imageURL: String = js.native
  var numberOfFrame: js.UndefOr[Double] = js.native
  var offsetx: js.UndefOr[Double] = js.native
  var offsety: js.UndefOr[Double] = js.native
  var rate: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[Double] = js.native
}

object AnimationOptions {
  @scala.inline
  def apply(imageURL: String): AnimationOptions = {
    val __obj = js.Dynamic.literal(imageURL = imageURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions]
  }
  @scala.inline
  implicit class AnimationOptionsOps[Self <: AnimationOptions] (val x: Self) extends AnyVal {
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
    def setImageURL(value: String): Self = this.set("imageURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelta: Self = this.set("delta", js.undefined)
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setNumberOfFrame(value: Double): Self = this.set("numberOfFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfFrame: Self = this.set("numberOfFrame", js.undefined)
    @scala.inline
    def setOffsetx(value: Double): Self = this.set("offsetx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetx: Self = this.set("offsetx", js.undefined)
    @scala.inline
    def setOffsety(value: Double): Self = this.set("offsety", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsety: Self = this.set("offsety", js.undefined)
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

