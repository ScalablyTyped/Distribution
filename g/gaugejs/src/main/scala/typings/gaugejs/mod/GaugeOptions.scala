package typings.gaugejs.mod

import typings.gaugejs.anon.Color
import typings.gaugejs.anon.DivColor
import typings.gaugejs.anon.PointerOptionsiconPathstr
import typings.gaugejs.anon.StaticZoneOptionsheightnu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaugeOptions extends BaseOptions {
  var percentColors: js.UndefOr[js.Array[js.Tuple2[Double, String]]] = js.undefined
  @JSName("pointer")
  var pointer_GaugeOptions: PointerOptionsiconPathstr
  var renderTicks: js.UndefOr[DivColor] = js.undefined
  var staticLabels: js.UndefOr[Color] = js.undefined
  var staticZones: js.UndefOr[js.Array[StaticZoneOptions | StaticZoneOptionsheightnu]] = js.undefined
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
    strokeColor: String,
    percentColors: js.Array[js.Tuple2[Double, String]] = null,
    renderTicks: DivColor = null,
    staticLabels: Color = null,
    staticZones: js.Array[StaticZoneOptions | StaticZoneOptionsheightnu] = null
  ): GaugeOptions = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], colorStart = colorStart.asInstanceOf[js.Any], colorStop = colorStop.asInstanceOf[js.Any], generateGradient = generateGradient.asInstanceOf[js.Any], highDpiSupport = highDpiSupport.asInstanceOf[js.Any], limitMax = limitMax.asInstanceOf[js.Any], limitMin = limitMin.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], radiusScale = radiusScale.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any])
    if (percentColors != null) __obj.updateDynamic("percentColors")(percentColors.asInstanceOf[js.Any])
    if (renderTicks != null) __obj.updateDynamic("renderTicks")(renderTicks.asInstanceOf[js.Any])
    if (staticLabels != null) __obj.updateDynamic("staticLabels")(staticLabels.asInstanceOf[js.Any])
    if (staticZones != null) __obj.updateDynamic("staticZones")(staticZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeOptions]
  }
}

