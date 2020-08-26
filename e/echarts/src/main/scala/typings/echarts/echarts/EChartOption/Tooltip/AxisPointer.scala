package typings.echarts.echarts.EChartOption.Tooltip

import typings.echarts.anon.Opacity
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.PointerLabel
import typings.echarts.echarts.EChartOption.LineStyle
import typings.echarts.echartsStrings.angle
import typings.echarts.echartsStrings.auto
import typings.echarts.echartsStrings.cross
import typings.echarts.echartsStrings.line
import typings.echarts.echartsStrings.none
import typings.echarts.echartsStrings.radius
import typings.echarts.echartsStrings.shadow
import typings.echarts.echartsStrings.x
import typings.echarts.echartsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisPointer extends js.Object {
  var animation: js.UndefOr[Boolean] = js.native
  var animationDelay: js.UndefOr[Double | js.Function] = js.native
  var animationDelayUpdate: js.UndefOr[Double | js.Function] = js.native
  var animationDuration: js.UndefOr[Double] = js.native
  var animationDurationUpdate: js.UndefOr[Double | js.Function] = js.native
  var animationEasing: js.UndefOr[String] = js.native
  var animationEasingUpdate: js.UndefOr[String] = js.native
  var animationThreshold: js.UndefOr[Double] = js.native
  var axis: js.UndefOr[auto | x | y | radius | angle] = js.native
  // It is valid when axisPointer.type is 'cross'.
  var crossStyle: js.UndefOr[LineStyle] = js.native
  var label: js.UndefOr[PointerLabel] = js.native
  var lineStyle: js.UndefOr[LineStyle] = js.native
  var shadowStyle: js.UndefOr[Opacity] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var snap: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[line | shadow | none | cross] = js.native
  var z: js.UndefOr[Double] = js.native
}

object AxisPointer {
  @scala.inline
  def apply(): AxisPointer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisPointer]
  }
  @scala.inline
  implicit class AxisPointerOps[Self <: AxisPointer] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAnimationDelay(value: Double | js.Function): Self = this.set("animationDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDelay: Self = this.set("animationDelay", js.undefined)
    @scala.inline
    def setAnimationDelayUpdate(value: Double | js.Function): Self = this.set("animationDelayUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDelayUpdate: Self = this.set("animationDelayUpdate", js.undefined)
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationDurationUpdate(value: Double | js.Function): Self = this.set("animationDurationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDurationUpdate: Self = this.set("animationDurationUpdate", js.undefined)
    @scala.inline
    def setAnimationEasing(value: String): Self = this.set("animationEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationEasing: Self = this.set("animationEasing", js.undefined)
    @scala.inline
    def setAnimationEasingUpdate(value: String): Self = this.set("animationEasingUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationEasingUpdate: Self = this.set("animationEasingUpdate", js.undefined)
    @scala.inline
    def setAnimationThreshold(value: Double): Self = this.set("animationThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationThreshold: Self = this.set("animationThreshold", js.undefined)
    @scala.inline
    def setAxis(value: auto | typings.echarts.echartsStrings.x | y | radius | angle): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setCrossStyle(value: LineStyle): Self = this.set("crossStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossStyle: Self = this.set("crossStyle", js.undefined)
    @scala.inline
    def setLabel(value: PointerLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLineStyle(value: LineStyle): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setShadowStyle(value: Opacity): Self = this.set("shadowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowStyle: Self = this.set("shadowStyle", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setSnap(value: Boolean): Self = this.set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    @scala.inline
    def setType(value: line | shadow | none | cross): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
  
}

