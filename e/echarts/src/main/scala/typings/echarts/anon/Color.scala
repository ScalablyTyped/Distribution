package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var color: js.UndefOr[js.Array[String]] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var shadowBlur: js.UndefOr[Double] = js.native
  var shadowColor: js.UndefOr[String] = js.native
  var shadowOffsetX: js.UndefOr[Double] = js.native
  var shadowOffsetY: js.UndefOr[Double] = js.native
}

object Color {
  @scala.inline
  def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
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
    def setColorVarargs(value: String*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: js.Array[String]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setShadowBlur(value: Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowBlur: Self = this.set("shadowBlur", js.undefined)
    @scala.inline
    def setShadowColor(value: String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    @scala.inline
    def setShadowOffsetX(value: Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOffsetX: Self = this.set("shadowOffsetX", js.undefined)
    @scala.inline
    def setShadowOffsetY(value: Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOffsetY: Self = this.set("shadowOffsetY", js.undefined)
  }
  
}

