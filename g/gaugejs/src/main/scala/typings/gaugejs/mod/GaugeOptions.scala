package typings.gaugejs.mod

import typings.gaugejs.anon.Color
import typings.gaugejs.anon.DivColor
import typings.gaugejs.anon.PointerOptionsiconPathstr
import typings.gaugejs.anon.StaticZoneOptionsheightnu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GaugeOptions extends BaseOptions {
  var percentColors: js.UndefOr[js.Array[js.Tuple2[Double, String]]] = js.native
  @JSName("pointer")
  var pointer_GaugeOptions: PointerOptionsiconPathstr = js.native
  var renderTicks: js.UndefOr[DivColor] = js.native
  var staticLabels: js.UndefOr[Color] = js.native
  var staticZones: js.UndefOr[js.Array[StaticZoneOptions | StaticZoneOptionsheightnu]] = js.native
}

object GaugeOptions {
  @scala.inline
  def apply(
    angle: Double,
    colorStart: String,
    colorStop: String,
    generateGradient: Boolean,
    highDpiSupport: Boolean,
    limitMax: Boolean,
    limitMin: Boolean,
    lineWidth: Double,
    pointer: PointerOptionsiconPathstr,
    radiusScale: Double,
    strokeColor: String
  ): GaugeOptions = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], colorStart = colorStart.asInstanceOf[js.Any], colorStop = colorStop.asInstanceOf[js.Any], generateGradient = generateGradient.asInstanceOf[js.Any], highDpiSupport = highDpiSupport.asInstanceOf[js.Any], limitMax = limitMax.asInstanceOf[js.Any], limitMin = limitMin.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], radiusScale = radiusScale.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeOptions]
  }
  @scala.inline
  implicit class GaugeOptionsOps[Self <: GaugeOptions] (val x: Self) extends AnyVal {
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
    def setPointer(value: PointerOptionsiconPathstr): Self = this.set("pointer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentColorsVarargs(value: (js.Tuple2[Double, String])*): Self = this.set("percentColors", js.Array(value :_*))
    @scala.inline
    def setPercentColors(value: js.Array[js.Tuple2[Double, String]]): Self = this.set("percentColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentColors: Self = this.set("percentColors", js.undefined)
    @scala.inline
    def setRenderTicks(value: DivColor): Self = this.set("renderTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderTicks: Self = this.set("renderTicks", js.undefined)
    @scala.inline
    def setStaticLabels(value: Color): Self = this.set("staticLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticLabels: Self = this.set("staticLabels", js.undefined)
    @scala.inline
    def setStaticZonesVarargs(value: (StaticZoneOptions | StaticZoneOptionsheightnu)*): Self = this.set("staticZones", js.Array(value :_*))
    @scala.inline
    def setStaticZones(value: js.Array[StaticZoneOptions | StaticZoneOptionsheightnu]): Self = this.set("staticZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticZones: Self = this.set("staticZones", js.undefined)
  }
  
}

