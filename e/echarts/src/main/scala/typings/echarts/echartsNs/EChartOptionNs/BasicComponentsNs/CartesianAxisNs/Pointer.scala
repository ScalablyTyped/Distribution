package typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs

import typings.echarts.Anon_ColorIcon
import typings.echarts.Anon_ColorOpacityShadowBlur
import typings.echarts.Anon_ColorOpacityShadowBlurShadowColor
import typings.echarts.echartsStrings.line
import typings.echarts.echartsStrings.none
import typings.echarts.echartsStrings.shadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait Pointer extends js.Object {
  var handle: js.UndefOr[Anon_ColorIcon] = js.undefined
  var label: js.UndefOr[PointerLabel] = js.undefined
  var lineStyle: js.UndefOr[Anon_ColorOpacityShadowBlur] = js.undefined
  var shadowStyle: js.UndefOr[Anon_ColorOpacityShadowBlurShadowColor] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var snap: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[Boolean] = js.undefined
  var triggerTooltip: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[line | shadow | none] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var z: js.UndefOr[Double] = js.undefined
}

object Pointer {
  @scala.inline
  def apply(
    handle: Anon_ColorIcon = null,
    label: PointerLabel = null,
    lineStyle: Anon_ColorOpacityShadowBlur = null,
    shadowStyle: Anon_ColorOpacityShadowBlurShadowColor = null,
    show: js.UndefOr[Boolean] = js.undefined,
    snap: js.UndefOr[Boolean] = js.undefined,
    status: js.UndefOr[Boolean] = js.undefined,
    triggerTooltip: js.UndefOr[Boolean] = js.undefined,
    `type`: line | shadow | none = null,
    value: Int | Double = null,
    z: Int | Double = null
  ): Pointer = {
    val __obj = js.Dynamic.literal()
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (shadowStyle != null) __obj.updateDynamic("shadowStyle")(shadowStyle)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap)
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status)
    if (!js.isUndefined(triggerTooltip)) __obj.updateDynamic("triggerTooltip")(triggerTooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pointer]
  }
}

