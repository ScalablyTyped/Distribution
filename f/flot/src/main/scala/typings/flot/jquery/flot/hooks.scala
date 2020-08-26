package typings.flot.jquery.flot

import typings.jquery.JQuery
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hooks extends js.Object {
  var bindEvents: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* eventHolder */ JQuery[HTMLElement], Unit]]
  ] = js.native
  var draw: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]
  ] = js.native
  var drawBackground: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]
  ] = js.native
  var drawOverlay: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]
  ] = js.native
  var drawSeries: js.UndefOr[
    js.Array[
      js.Function3[/* plot */ plot, /* context */ CanvasRenderingContext2D, /* series */ dataSeries, Unit]
    ]
  ] = js.native
  var processDatapoints: js.UndefOr[
    js.Array[
      js.Function3[/* plot */ plot, /* series */ dataSeries, /* datapoints */ datapoints, Unit]
    ]
  ] = js.native
  var processOffset: js.UndefOr[js.Array[js.Function2[/* plot */ plot, /* offset */ canvasPoint, Unit]]] = js.native
  var processOptions: js.UndefOr[js.Array[js.Function2[/* plot */ plot, /* options */ plotOptions, Unit]]] = js.native
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
  ] = js.native
  var shutdown: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* eventHolder */ JQuery[HTMLElement], Unit]]
  ] = js.native
}

object hooks {
  @scala.inline
  def apply(): hooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[hooks]
  }
  @scala.inline
  implicit class hooksOps[Self <: hooks] (val x: Self) extends AnyVal {
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
    def setBindEventsVarargs(value: (js.Function2[/* plot */ plot, /* eventHolder */ JQuery[HTMLElement], Unit])*): Self = this.set("bindEvents", js.Array(value :_*))
    @scala.inline
    def setBindEvents(value: js.Array[js.Function2[/* plot */ plot, /* eventHolder */ JQuery[HTMLElement], Unit]]): Self = this.set("bindEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindEvents: Self = this.set("bindEvents", js.undefined)
    @scala.inline
    def setDrawVarargs(value: (js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit])*): Self = this.set("draw", js.Array(value :_*))
    @scala.inline
    def setDraw(value: js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]): Self = this.set("draw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraw: Self = this.set("draw", js.undefined)
    @scala.inline
    def setDrawBackgroundVarargs(value: (js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit])*): Self = this.set("drawBackground", js.Array(value :_*))
    @scala.inline
    def setDrawBackground(value: js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]): Self = this.set("drawBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawBackground: Self = this.set("drawBackground", js.undefined)
    @scala.inline
    def setDrawOverlayVarargs(value: (js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit])*): Self = this.set("drawOverlay", js.Array(value :_*))
    @scala.inline
    def setDrawOverlay(value: js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]): Self = this.set("drawOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawOverlay: Self = this.set("drawOverlay", js.undefined)
    @scala.inline
    def setDrawSeriesVarargs(
      value: (js.Function3[/* plot */ plot, /* context */ CanvasRenderingContext2D, /* series */ dataSeries, Unit])*
    ): Self = this.set("drawSeries", js.Array(value :_*))
    @scala.inline
    def setDrawSeries(
      value: js.Array[
          js.Function3[/* plot */ plot, /* context */ CanvasRenderingContext2D, /* series */ dataSeries, Unit]
        ]
    ): Self = this.set("drawSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawSeries: Self = this.set("drawSeries", js.undefined)
    @scala.inline
    def setProcessDatapointsVarargs(
      value: (js.Function3[/* plot */ plot, /* series */ dataSeries, /* datapoints */ datapoints, Unit])*
    ): Self = this.set("processDatapoints", js.Array(value :_*))
    @scala.inline
    def setProcessDatapoints(
      value: js.Array[
          js.Function3[/* plot */ plot, /* series */ dataSeries, /* datapoints */ datapoints, Unit]
        ]
    ): Self = this.set("processDatapoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessDatapoints: Self = this.set("processDatapoints", js.undefined)
    @scala.inline
    def setProcessOffsetVarargs(value: (js.Function2[/* plot */ plot, /* offset */ canvasPoint, Unit])*): Self = this.set("processOffset", js.Array(value :_*))
    @scala.inline
    def setProcessOffset(value: js.Array[js.Function2[/* plot */ plot, /* offset */ canvasPoint, Unit]]): Self = this.set("processOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessOffset: Self = this.set("processOffset", js.undefined)
    @scala.inline
    def setProcessOptionsVarargs(value: (js.Function2[/* plot */ plot, /* options */ plotOptions, Unit])*): Self = this.set("processOptions", js.Array(value :_*))
    @scala.inline
    def setProcessOptions(value: js.Array[js.Function2[/* plot */ plot, /* options */ plotOptions, Unit]]): Self = this.set("processOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessOptions: Self = this.set("processOptions", js.undefined)
    @scala.inline
    def setProcessRawDataVarargs(
      value: (js.Function4[
          /* plot */ plot, 
          /* series */ dataSeries, 
          /* data */ js.Array[js.Any], 
          /* datapoints */ datapoints, 
          Unit
        ])*
    ): Self = this.set("processRawData", js.Array(value :_*))
    @scala.inline
    def setProcessRawData(
      value: js.Array[
          js.Function4[
            /* plot */ plot, 
            /* series */ dataSeries, 
            /* data */ js.Array[_], 
            /* datapoints */ datapoints, 
            Unit
          ]
        ]
    ): Self = this.set("processRawData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessRawData: Self = this.set("processRawData", js.undefined)
    @scala.inline
    def setShutdownVarargs(value: (js.Function2[/* plot */ plot, /* eventHolder */ JQuery[HTMLElement], Unit])*): Self = this.set("shutdown", js.Array(value :_*))
    @scala.inline
    def setShutdown(value: js.Array[js.Function2[/* plot */ plot, /* eventHolder */ JQuery[HTMLElement], Unit]]): Self = this.set("shutdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShutdown: Self = this.set("shutdown", js.undefined)
  }
  
}

