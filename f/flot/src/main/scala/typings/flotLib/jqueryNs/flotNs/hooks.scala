package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hooks extends js.Object {
  var bindEvents: js.UndefOr[js.Array[flotLib.Fn_EventHolder]] = js.undefined
  var draw: js.UndefOr[js.Array[flotLib.Fn_Context]] = js.undefined
  var drawBackground: js.UndefOr[js.Array[flotLib.Fn_Context]] = js.undefined
  var drawOverlay: js.UndefOr[js.Array[flotLib.Fn_Context]] = js.undefined
  var drawSeries: js.UndefOr[js.Array[flotLib.Fn_ContextPlot]] = js.undefined
  var processDatapoints: js.UndefOr[js.Array[flotLib.Fn_Datapoints]] = js.undefined
  var processOffset: js.UndefOr[js.Array[flotLib.Fn_Offset]] = js.undefined
  var processOptions: js.UndefOr[js.Array[flotLib.Fn_Options]] = js.undefined
  var processRawData: js.UndefOr[js.Array[flotLib.Fn_Data]] = js.undefined
  var shutdown: js.UndefOr[js.Array[flotLib.Fn_EventHolder]] = js.undefined
}

object hooks {
  @scala.inline
  def apply(
    bindEvents: js.Array[flotLib.Fn_EventHolder] = null,
    draw: js.Array[flotLib.Fn_Context] = null,
    drawBackground: js.Array[flotLib.Fn_Context] = null,
    drawOverlay: js.Array[flotLib.Fn_Context] = null,
    drawSeries: js.Array[flotLib.Fn_ContextPlot] = null,
    processDatapoints: js.Array[flotLib.Fn_Datapoints] = null,
    processOffset: js.Array[flotLib.Fn_Offset] = null,
    processOptions: js.Array[flotLib.Fn_Options] = null,
    processRawData: js.Array[flotLib.Fn_Data] = null,
    shutdown: js.Array[flotLib.Fn_EventHolder] = null
  ): hooks = {
    val __obj = js.Dynamic.literal()
    if (bindEvents != null) __obj.updateDynamic("bindEvents")(bindEvents)
    if (draw != null) __obj.updateDynamic("draw")(draw)
    if (drawBackground != null) __obj.updateDynamic("drawBackground")(drawBackground)
    if (drawOverlay != null) __obj.updateDynamic("drawOverlay")(drawOverlay)
    if (drawSeries != null) __obj.updateDynamic("drawSeries")(drawSeries)
    if (processDatapoints != null) __obj.updateDynamic("processDatapoints")(processDatapoints)
    if (processOffset != null) __obj.updateDynamic("processOffset")(processOffset)
    if (processOptions != null) __obj.updateDynamic("processOptions")(processOptions)
    if (processRawData != null) __obj.updateDynamic("processRawData")(processRawData)
    if (shutdown != null) __obj.updateDynamic("shutdown")(shutdown)
    __obj.asInstanceOf[hooks]
  }
}

