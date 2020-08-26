package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait seriesOptions extends js.Object {
  var bars: js.UndefOr[barsOptions] = js.native
  var clickable: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[js.Any] = js.native
  var highlightColor: js.UndefOr[js.Any] = js.native
  var hoverable: js.UndefOr[Boolean] = js.native
              // color or number
  var label: js.UndefOr[String] = js.native
  var lines: js.UndefOr[linesOptions] = js.native
  var points: js.UndefOr[pointsOptions] = js.native
  var shadowSize: js.UndefOr[Double] = js.native
  var xaxis: js.UndefOr[Double] = js.native
  var yaxis: js.UndefOr[Double] = js.native
}

object seriesOptions {
  @scala.inline
  def apply(): seriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[seriesOptions]
  }
  @scala.inline
  implicit class seriesOptionsOps[Self <: seriesOptions] (val x: Self) extends AnyVal {
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
    def setBars(value: barsOptions): Self = this.set("bars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBars: Self = this.set("bars", js.undefined)
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    @scala.inline
    def setColor(value: js.Any): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setHighlightColor(value: js.Any): Self = this.set("highlightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightColor: Self = this.set("highlightColor", js.undefined)
    @scala.inline
    def setHoverable(value: Boolean): Self = this.set("hoverable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverable: Self = this.set("hoverable", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLines(value: linesOptions): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    @scala.inline
    def setPoints(value: pointsOptions): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    @scala.inline
    def setShadowSize(value: Double): Self = this.set("shadowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowSize: Self = this.set("shadowSize", js.undefined)
    @scala.inline
    def setXaxis(value: Double): Self = this.set("xaxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXaxis: Self = this.set("xaxis", js.undefined)
    @scala.inline
    def setYaxis(value: Double): Self = this.set("yaxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYaxis: Self = this.set("yaxis", js.undefined)
  }
  
}

