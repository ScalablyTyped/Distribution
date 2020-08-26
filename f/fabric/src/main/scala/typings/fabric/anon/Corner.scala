package typings.fabric.anon

import typings.fabric.fabricImplMod.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Corner extends js.Object {
  var corner: String = js.native
  var originX: String = js.native
  var originY: String = js.native
  var original: Object = js.native
  var width: Double = js.native
}

object Corner {
  @scala.inline
  def apply(corner: String, originX: String, originY: String, original: Object, width: Double): Corner = {
    val __obj = js.Dynamic.literal(corner = corner.asInstanceOf[js.Any], originX = originX.asInstanceOf[js.Any], originY = originY.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corner]
  }
  @scala.inline
  implicit class CornerOps[Self <: Corner] (val x: Self) extends AnyVal {
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
    def setCorner(value: String): Self = this.set("corner", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginX(value: String): Self = this.set("originX", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginY(value: String): Self = this.set("originY", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginal(value: Object): Self = this.set("original", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

