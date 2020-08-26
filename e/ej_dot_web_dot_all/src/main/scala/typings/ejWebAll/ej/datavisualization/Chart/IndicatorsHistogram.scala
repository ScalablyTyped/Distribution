package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicatorsHistogram extends js.Object {
  /** Options to customize the histogram border in MACD indicator.
    */
  var border: js.UndefOr[IndicatorsHistogramBorder] = js.native
  /** Color of histogram columns in MACD indicator.
    * @Default {#ccccff}
    */
  var fill: js.UndefOr[String] = js.native
  /** Opacity of histogram columns in MACD indicator.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
}

object IndicatorsHistogram {
  @scala.inline
  def apply(): IndicatorsHistogram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicatorsHistogram]
  }
  @scala.inline
  implicit class IndicatorsHistogramOps[Self <: IndicatorsHistogram] (val x: Self) extends AnyVal {
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
    def setBorder(value: IndicatorsHistogramBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
  
}

