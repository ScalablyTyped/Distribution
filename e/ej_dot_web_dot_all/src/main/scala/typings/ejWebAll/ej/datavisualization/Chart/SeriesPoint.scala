package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesPoint extends js.Object {
  /** Options for customizing the border of a point. This is applicable only for column type series and accumulation type series.
    */
  var border: js.UndefOr[SeriesPointsBorder] = js.native
  /** Close value of the point. Close value is applicable only for financial type series.
    * @Default {null}
    */
  var close: js.UndefOr[Double] = js.native
  /** Background color of the point. This is applicable only for column type series and accumulation type series.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  /** High value of the point. High value is applicable only for financial type series, range area series and range column series.
    * @Default {null}
    */
  var high: js.UndefOr[Double] = js.native
  /** Low value of the point. Low value is applicable only for financial type series, range area series and range column series.
    * @Default {null}
    */
  var low: js.UndefOr[Double] = js.native
  /** Options for displaying and customizing marker for a data point. Marker contains shapes and/or data labels.
    */
  var marker: js.UndefOr[SeriesPointsMarker] = js.native
  /** Open value of the point. This is applicable only for financial type series.
    * @Default {null}
    */
  var open: js.UndefOr[Double] = js.native
  /** To show/hide the intermediate summary from the last intermediate point.
    * @Default {false}
    */
  var showIntermediateSum: js.UndefOr[Boolean] = js.native
  /** To show/hide the total summary of the waterfall series.
    * @Default {false}
    */
  var showTotalSum: js.UndefOr[Boolean] = js.native
  /** Size of a bubble in the bubble series. This is applicable only for the bubble series.
    * @Default {null}
    */
  var size: js.UndefOr[Double] = js.native
  /** Datalabel text for the point.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  /** Enables or disables the visibility of legend item.
    * @Default {visible}
    */
  var visibleOnLegend: js.UndefOr[String] = js.native
  /** X value of the point.
    * @Default {null}
    */
  var x: js.UndefOr[Double] = js.native
  /** Y value of the point.
    * @Default {null}
    */
  var y: js.UndefOr[Double] = js.native
}

object SeriesPoint {
  @scala.inline
  def apply(): SeriesPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesPoint]
  }
  @scala.inline
  implicit class SeriesPointOps[Self <: SeriesPoint] (val x: Self) extends AnyVal {
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
    def setBorder(value: SeriesPointsBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setClose(value: Double): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    @scala.inline
    def setMarker(value: SeriesPointsMarker): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setOpen(value: Double): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setShowIntermediateSum(value: Boolean): Self = this.set("showIntermediateSum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowIntermediateSum: Self = this.set("showIntermediateSum", js.undefined)
    @scala.inline
    def setShowTotalSum(value: Boolean): Self = this.set("showTotalSum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTotalSum: Self = this.set("showTotalSum", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVisibleOnLegend(value: String): Self = this.set("visibleOnLegend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleOnLegend: Self = this.set("visibleOnLegend", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

