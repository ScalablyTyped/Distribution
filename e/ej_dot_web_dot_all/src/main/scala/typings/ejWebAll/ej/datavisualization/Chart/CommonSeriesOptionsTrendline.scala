package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonSeriesOptionsTrendline extends js.Object {
  
  /** Past trends of the current series.
    * @Default {0}
    */
  var backwardForecast: js.UndefOr[Double] = js.native
  
  /** Pattern of dashes and gaps used to stroke the trendline.
    */
  var dashArray: js.UndefOr[String] = js.native
  
  /** Fill color of the trendlines.
    * @Default {#0000FF}
    */
  var fill: js.UndefOr[String] = js.native
  
  /** Future trends of the current series.
    * @Default {0}
    */
  var forwardForecast: js.UndefOr[Double] = js.native
  
  /** Specifies the intercept value of the trendlines.
    * @Default {null}
    */
  var intercept: js.UndefOr[Double] = js.native
  
  /** Name for the trendlines that is to be displayed in the legend text.
    * @Default {trendline}
    */
  var name: js.UndefOr[String] = js.native
  
  /** Opacity of the trendline.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Specifies the moving average starting period value.
    * @Default {2}
    */
  var period: js.UndefOr[Double] = js.native
  
  /** Specifies the order of the polynomial trendlines.
    * @Default {0}
    */
  var polynomialOrder: js.UndefOr[Double] = js.native
  
  /** Options for customizing the tooltip of the trendlines in the chart.
    */
  var tooltip: js.UndefOr[CommonSeriesOptionsTrendlinesTooltip] = js.native
  
  /** Specifies the type of the trendline for the series.
    * @Default {linear. See TrendlinesType}
    */
  var `type`: js.UndefOr[TrendlinesType | String] = js.native
  
  /** Show/hides the trendline.
    */
  var visibility: js.UndefOr[Boolean] = js.native
  
  /** Show/hides the trendline legend.
    * @Default {visible}
    */
  var visibleOnLegend: js.UndefOr[String] = js.native
  
  /** Width of the trendlines.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}
object CommonSeriesOptionsTrendline {
  
  @scala.inline
  def apply(): CommonSeriesOptionsTrendline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSeriesOptionsTrendline]
  }
  
  @scala.inline
  implicit class CommonSeriesOptionsTrendlineOps[Self <: CommonSeriesOptionsTrendline] (val x: Self) extends AnyVal {
    
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
    def setBackwardForecast(value: Double): Self = this.set("backwardForecast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackwardForecast: Self = this.set("backwardForecast", js.undefined)
    
    @scala.inline
    def setDashArray(value: String): Self = this.set("dashArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashArray: Self = this.set("dashArray", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setForwardForecast(value: Double): Self = this.set("forwardForecast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardForecast: Self = this.set("forwardForecast", js.undefined)
    
    @scala.inline
    def setIntercept(value: Double): Self = this.set("intercept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntercept: Self = this.set("intercept", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setPolynomialOrder(value: Double): Self = this.set("polynomialOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolynomialOrder: Self = this.set("polynomialOrder", js.undefined)
    
    @scala.inline
    def setTooltip(value: CommonSeriesOptionsTrendlinesTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setType(value: TrendlinesType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVisibility(value: Boolean): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    
    @scala.inline
    def setVisibleOnLegend(value: String): Self = this.set("visibleOnLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleOnLegend: Self = this.set("visibleOnLegend", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
