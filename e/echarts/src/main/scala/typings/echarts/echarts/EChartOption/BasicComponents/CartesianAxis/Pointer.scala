package typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import typings.echarts.anon.Icon
import typings.echarts.anon.Opacity
import typings.echarts.echarts.EChartOption.LineStyle
import typings.echarts.echartsStrings.line
import typings.echarts.echartsStrings.none
import typings.echarts.echartsStrings.shadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
@js.native
trait Pointer extends js.Object {
  var handle: js.UndefOr[Icon] = js.native
  var label: js.UndefOr[PointerLabel] = js.native
  var lineStyle: js.UndefOr[LineStyle] = js.native
  var shadowStyle: js.UndefOr[Opacity] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var snap: js.UndefOr[Boolean] = js.native
  var status: js.UndefOr[Boolean] = js.native
  var triggerTooltip: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[line | shadow | none] = js.native
  var value: js.UndefOr[Double] = js.native
  var z: js.UndefOr[Double] = js.native
}

object Pointer {
  @scala.inline
  def apply(): Pointer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pointer]
  }
  @scala.inline
  implicit class PointerOps[Self <: Pointer] (val x: Self) extends AnyVal {
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
    def setHandle(value: Icon): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
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
    def setStatus(value: Boolean): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTriggerTooltip(value: Boolean): Self = this.set("triggerTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerTooltip: Self = this.set("triggerTooltip", js.undefined)
    @scala.inline
    def setType(value: line | shadow | none): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
  
}

