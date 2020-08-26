package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RectangleCornerMixin extends js.Object {
  var bottomLeftRadius: Double = js.native
  var bottomRightRadius: Double = js.native
  var topLeftRadius: Double = js.native
  var topRightRadius: Double = js.native
}

object RectangleCornerMixin {
  @scala.inline
  def apply(bottomLeftRadius: Double, bottomRightRadius: Double, topLeftRadius: Double, topRightRadius: Double): RectangleCornerMixin = {
    val __obj = js.Dynamic.literal(bottomLeftRadius = bottomLeftRadius.asInstanceOf[js.Any], bottomRightRadius = bottomRightRadius.asInstanceOf[js.Any], topLeftRadius = topLeftRadius.asInstanceOf[js.Any], topRightRadius = topRightRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectangleCornerMixin]
  }
  @scala.inline
  implicit class RectangleCornerMixinOps[Self <: RectangleCornerMixin] (val x: Self) extends AnyVal {
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
    def setBottomLeftRadius(value: Double): Self = this.set("bottomLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomRightRadius(value: Double): Self = this.set("bottomRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopLeftRadius(value: Double): Self = this.set("topLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopRightRadius(value: Double): Self = this.set("topRightRadius", value.asInstanceOf[js.Any])
  }
  
}

