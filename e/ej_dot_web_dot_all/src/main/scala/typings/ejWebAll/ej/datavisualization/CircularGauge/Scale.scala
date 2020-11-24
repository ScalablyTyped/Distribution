package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scale extends js.Object {
  
  /** Specify backgroundColor for the scale of circular gauge
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** Specify border for scales of circular gauge
    * @Default {Object}
    */
  var border: js.UndefOr[ScalesBorder] = js.native
  
  /** Specify the custom labels for the scales.
    * @Default {Array}
    */
  var customLabels: js.UndefOr[js.Array[ScalesCustomLabel]] = js.native
  
  /** Specify scale direction of circular gauge. See
    * @Default {Clockwise}
    */
  var direction: js.UndefOr[Direction | String] = js.native
  
  /** Specify representing state of circular gauge
    * @Default {Array}
    */
  var indicators: js.UndefOr[js.Array[ScalesIndicator]] = js.native
  
  /** Specify the text values displayed in a meaningful manner alongside the ticks of circular gauge
    * @Default {Array}
    */
  var labels: js.UndefOr[js.Array[ScalesLabel]] = js.native
  
  /** Specify majorIntervalValue of circular gauge
    * @Default {10}
    */
  var majorIntervalValue: js.UndefOr[Double] = js.native
  
  /** Specify maximum scale value of circular gauge
    * @Default {null}
    */
  var maximum: js.UndefOr[Double] = js.native
  
  /** Specify minimum scale value of circular gauge
    * @Default {null}
    */
  var minimum: js.UndefOr[Double] = js.native
  
  /** Specify minorIntervalValue of circular gauge
    * @Default {2}
    */
  var minorIntervalValue: js.UndefOr[Double] = js.native
  
  /** Specify opacity value of circular gauge
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Specify pointer cap of circular gauge
    * @Default {Object}
    */
  var pointerCap: js.UndefOr[ScalesPointerCap] = js.native
  
  /** Specify pointers value of circular gauge
    * @Default {Array}
    */
  var pointers: js.UndefOr[js.Array[ScalesPointer]] = js.native
  
  /** Specify scale radius of circular gauge
    * @Default {170}
    */
  var radius: js.UndefOr[Double] = js.native
  
  /** Specify ranges value of circular gauge
    * @Default {Array}
    */
  var ranges: js.UndefOr[js.Array[ScalesRange]] = js.native
  
  /** Specify shadowOffset value of circular gauge
    * @Default {0}
    */
  var shadowOffset: js.UndefOr[Double] = js.native
  
  /** Specify showIndicators of circular gauge
    * @Default {false}
    */
  var showIndicators: js.UndefOr[Boolean] = js.native
  
  /** Specify showLabels of circular gauge
    * @Default {true}
    */
  var showLabels: js.UndefOr[Boolean] = js.native
  
  /** Specify showPointers of circular gauge
    * @Default {true}
    */
  var showPointers: js.UndefOr[Boolean] = js.native
  
  /** Specify showRanges of circular gauge
    * @Default {false}
    */
  var showRanges: js.UndefOr[Boolean] = js.native
  
  /** Specify showScaleBar of circular gauge
    * @Default {false}
    */
  var showScaleBar: js.UndefOr[Boolean] = js.native
  
  /** Specify showTicks of circular gauge
    * @Default {true}
    */
  var showTicks: js.UndefOr[Boolean] = js.native
  
  /** Specify scaleBar size of circular gauge
    * @Default {6}
    */
  var size: js.UndefOr[Double] = js.native
  
  /** Specify startAngle of circular gauge
    * @Default {115}
    */
  var startAngle: js.UndefOr[Double] = js.native
  
  /** Specify subGauge of circular gauge
    * @Default {Array}
    */
  var subGauges: js.UndefOr[js.Array[ScalesSubGauge]] = js.native
  
  /** Specify sweepAngle of circular gauge
    * @Default {310}
    */
  var sweepAngle: js.UndefOr[Double] = js.native
  
  /** Specify ticks of circular gauge
    * @Default {Array}
    */
  var ticks: js.UndefOr[js.Array[ScalesTick]] = js.native
}
object Scale {
  
  @scala.inline
  def apply(): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  implicit class ScaleOps[Self <: Scale] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorder(value: ScalesBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setCustomLabelsVarargs(value: ScalesCustomLabel*): Self = this.set("customLabels", js.Array(value :_*))
    
    @scala.inline
    def setCustomLabels(value: js.Array[ScalesCustomLabel]): Self = this.set("customLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLabels: Self = this.set("customLabels", js.undefined)
    
    @scala.inline
    def setDirection(value: Direction | String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setIndicatorsVarargs(value: ScalesIndicator*): Self = this.set("indicators", js.Array(value :_*))
    
    @scala.inline
    def setIndicators(value: js.Array[ScalesIndicator]): Self = this.set("indicators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicators: Self = this.set("indicators", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: ScalesLabel*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[ScalesLabel]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMajorIntervalValue(value: Double): Self = this.set("majorIntervalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorIntervalValue: Self = this.set("majorIntervalValue", js.undefined)
    
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    
    @scala.inline
    def setMinorIntervalValue(value: Double): Self = this.set("minorIntervalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorIntervalValue: Self = this.set("minorIntervalValue", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPointerCap(value: ScalesPointerCap): Self = this.set("pointerCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerCap: Self = this.set("pointerCap", js.undefined)
    
    @scala.inline
    def setPointersVarargs(value: ScalesPointer*): Self = this.set("pointers", js.Array(value :_*))
    
    @scala.inline
    def setPointers(value: js.Array[ScalesPointer]): Self = this.set("pointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointers: Self = this.set("pointers", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: ScalesRange*): Self = this.set("ranges", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[ScalesRange]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    
    @scala.inline
    def setShadowOffset(value: Double): Self = this.set("shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffset: Self = this.set("shadowOffset", js.undefined)
    
    @scala.inline
    def setShowIndicators(value: Boolean): Self = this.set("showIndicators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIndicators: Self = this.set("showIndicators", js.undefined)
    
    @scala.inline
    def setShowLabels(value: Boolean): Self = this.set("showLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLabels: Self = this.set("showLabels", js.undefined)
    
    @scala.inline
    def setShowPointers(value: Boolean): Self = this.set("showPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPointers: Self = this.set("showPointers", js.undefined)
    
    @scala.inline
    def setShowRanges(value: Boolean): Self = this.set("showRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRanges: Self = this.set("showRanges", js.undefined)
    
    @scala.inline
    def setShowScaleBar(value: Boolean): Self = this.set("showScaleBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowScaleBar: Self = this.set("showScaleBar", js.undefined)
    
    @scala.inline
    def setShowTicks(value: Boolean): Self = this.set("showTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTicks: Self = this.set("showTicks", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    
    @scala.inline
    def setSubGaugesVarargs(value: ScalesSubGauge*): Self = this.set("subGauges", js.Array(value :_*))
    
    @scala.inline
    def setSubGauges(value: js.Array[ScalesSubGauge]): Self = this.set("subGauges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubGauges: Self = this.set("subGauges", js.undefined)
    
    @scala.inline
    def setSweepAngle(value: Double): Self = this.set("sweepAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSweepAngle: Self = this.set("sweepAngle", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: ScalesTick*): Self = this.set("ticks", js.Array(value :_*))
    
    @scala.inline
    def setTicks(value: js.Array[ScalesTick]): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
  }
}
