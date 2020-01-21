package typings.flot.jquery.flot

import typings.jquery.JQuery_
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hooks extends js.Object {
  var bindEvents: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* eventHolder */ JQuery_[HTMLElement], Unit]]
  ] = js.undefined
  var draw: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]
  ] = js.undefined
  var drawBackground: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]
  ] = js.undefined
  var drawOverlay: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]
  ] = js.undefined
  var drawSeries: js.UndefOr[
    js.Array[
      js.Function3[/* plot */ plot, /* context */ CanvasRenderingContext2D, /* series */ dataSeries, Unit]
    ]
  ] = js.undefined
  var processDatapoints: js.UndefOr[
    js.Array[
      js.Function3[/* plot */ plot, /* series */ dataSeries, /* datapoints */ datapoints, Unit]
    ]
  ] = js.undefined
  var processOffset: js.UndefOr[js.Array[js.Function2[/* plot */ plot, /* offset */ canvasPoint, Unit]]] = js.undefined
  var processOptions: js.UndefOr[js.Array[js.Function2[/* plot */ plot, /* options */ plotOptions, Unit]]] = js.undefined
  var processRawData: js.UndefOr[
    js.Array[
      js.Function4[
        /* plot */ plot, 
        /* series */ dataSeries, 
        /* data */ js.Array[_], 
        /* datapoints */ datapoints, 
        Unit
      ]
    ]
  ] = js.undefined
  var shutdown: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* eventHolder */ JQuery_[HTMLElement], Unit]]
  ] = js.undefined
}

object hooks {
  @scala.inline
  def apply(
    bindEvents: js.Array[js.Function2[/* plot */ plot, /* eventHolder */ JQuery_[HTMLElement], Unit]] = null,
    draw: js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]] = null,
    drawBackground: js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]] = null,
    drawOverlay: js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]] = null,
    drawSeries: js.Array[
      js.Function3[/* plot */ plot, /* context */ CanvasRenderingContext2D, /* series */ dataSeries, Unit]
    ] = null,
    processDatapoints: js.Array[
      js.Function3[/* plot */ plot, /* series */ dataSeries, /* datapoints */ datapoints, Unit]
    ] = null,
    processOffset: js.Array[js.Function2[/* plot */ plot, /* offset */ canvasPoint, Unit]] = null,
    processOptions: js.Array[js.Function2[/* plot */ plot, /* options */ plotOptions, Unit]] = null,
    processRawData: js.Array[
      js.Function4[
        /* plot */ plot, 
        /* series */ dataSeries, 
        /* data */ js.Array[_], 
        /* datapoints */ datapoints, 
        Unit
      ]
    ] = null,
    shutdown: js.Array[js.Function2[/* plot */ plot, /* eventHolder */ JQuery_[HTMLElement], Unit]] = null
  ): hooks = {
    val __obj = js.Dynamic.literal()
    if (bindEvents != null) __obj.updateDynamic("bindEvents")(bindEvents.asInstanceOf[js.Any])
    if (draw != null) __obj.updateDynamic("draw")(draw.asInstanceOf[js.Any])
    if (drawBackground != null) __obj.updateDynamic("drawBackground")(drawBackground.asInstanceOf[js.Any])
    if (drawOverlay != null) __obj.updateDynamic("drawOverlay")(drawOverlay.asInstanceOf[js.Any])
    if (drawSeries != null) __obj.updateDynamic("drawSeries")(drawSeries.asInstanceOf[js.Any])
    if (processDatapoints != null) __obj.updateDynamic("processDatapoints")(processDatapoints.asInstanceOf[js.Any])
    if (processOffset != null) __obj.updateDynamic("processOffset")(processOffset.asInstanceOf[js.Any])
    if (processOptions != null) __obj.updateDynamic("processOptions")(processOptions.asInstanceOf[js.Any])
    if (processRawData != null) __obj.updateDynamic("processRawData")(processRawData.asInstanceOf[js.Any])
    if (shutdown != null) __obj.updateDynamic("shutdown")(shutdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[hooks]
  }
}

