package typings
package echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait Pointer extends js.Object {
  var handle: js.UndefOr[echartsLib.Anon_ColorIcon] = js.undefined
  var label: js.UndefOr[PointerLabel] = js.undefined
  var lineStyle: js.UndefOr[echartsLib.Anon_ColorOpacityShadowBlur] = js.undefined
  var shadowStyle: js.UndefOr[echartsLib.Anon_ColorOpacityShadowBlurShadowColor] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var snap: js.UndefOr[scala.Boolean] = js.undefined
  var status: js.UndefOr[scala.Boolean] = js.undefined
  var triggerTooltip: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[
    echartsLib.echartsLibStrings.line | echartsLib.echartsLibStrings.shadow | echartsLib.echartsLibStrings.none
  ] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
  var z: js.UndefOr[scala.Double] = js.undefined
}

object Pointer {
  @scala.inline
  def apply(
    handle: echartsLib.Anon_ColorIcon = null,
    label: PointerLabel = null,
    lineStyle: echartsLib.Anon_ColorOpacityShadowBlur = null,
    shadowStyle: echartsLib.Anon_ColorOpacityShadowBlurShadowColor = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    snap: js.UndefOr[scala.Boolean] = js.undefined,
    status: js.UndefOr[scala.Boolean] = js.undefined,
    triggerTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: echartsLib.echartsLibStrings.line | echartsLib.echartsLibStrings.shadow | echartsLib.echartsLibStrings.none = null,
    value: scala.Int | scala.Double = null,
    z: scala.Int | scala.Double = null
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

