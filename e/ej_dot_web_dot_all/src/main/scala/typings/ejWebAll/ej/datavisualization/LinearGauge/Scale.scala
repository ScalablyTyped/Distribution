package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scale extends js.Object {
  
  /** Specifies the backgroundColor of the Scale.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** Specifies the scaleBar Gradient of bar pointer
    * @Default {Array}
    */
  var barPointers: js.UndefOr[js.Array[ScalesBarPointer]] = js.native
  
  /** Specifies the border of the Scale.
    * @Default {null}
    */
  var border: js.UndefOr[ScalesBorder] = js.native
  
  /** Specifies the customLabel
    * @Default {Array}
    */
  var customLabels: js.UndefOr[js.Array[ScalesCustomLabel]] = js.native
  
  /** Specifies the scale Direction of the Scale. See
    * @Default {CounterClockwise}
    */
  var direction: js.UndefOr[Direction | String] = js.native
  
  /** Specifies the indicator
    * @Default {Array}
    */
  var indicators: js.UndefOr[js.Array[ScalesIndicator]] = js.native
  
  /** Specifies the labels.
    * @Default {Array}
    */
  var labels: js.UndefOr[js.Array[ScalesLabel]] = js.native
  
  /** Specifies the scaleBar Length.
    * @Default {290}
    */
  var length: js.UndefOr[Double] = js.native
  
  /** Specifies the majorIntervalValue of the Scale.
    * @Default {10}
    */
  var majorIntervalValue: js.UndefOr[Double] = js.native
  
  /** Specifies the markerPointers
    * @Default {Array}
    */
  var markerPointers: js.UndefOr[js.Array[ScalesMarkerPointer]] = js.native
  
  /** Specifies the maximum of the Scale.
    * @Default {null}
    */
  var maximum: js.UndefOr[Double] = js.native
  
  /** Specifies the minimum of the Scale.
    * @Default {null}
    */
  var minimum: js.UndefOr[Double] = js.native
  
  /** Specifies the minorIntervalValue of the Scale.
    * @Default {2}
    */
  var minorIntervalValue: js.UndefOr[Double] = js.native
  
  /** Specifies the opacity of the Scale.
    * @Default {NaN}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Specifies the position
    * @Default {null}
    */
  var position: js.UndefOr[ScalesPosition] = js.native
  
  /** Specifies the ranges in the tick.
    * @Default {Array}
    */
  var ranges: js.UndefOr[js.Array[ScalesRange]] = js.native
  
  /** Specifies the shadowOffset.
    * @Default {0}
    */
  var shadowOffset: js.UndefOr[Double] = js.native
  
  /** Specifies the showBarPointers state.
    * @Default {true}
    */
  var showBarPointers: js.UndefOr[Boolean] = js.native
  
  /** Specifies the showCustomLabels state.
    * @Default {false}
    */
  var showCustomLabels: js.UndefOr[Boolean] = js.native
  
  /** Specifies the showIndicators state.
    * @Default {false}
    */
  var showIndicators: js.UndefOr[Boolean] = js.native
  
  /** Specifies the showLabels state.
    * @Default {true}
    */
  var showLabels: js.UndefOr[Boolean] = js.native
  
  /** Specifies the showMarkerPointers state.
    * @Default {true}
    */
  var showMarkerPointers: js.UndefOr[Boolean] = js.native
  
  /** Specifies the showRanges state.
    * @Default {false}
    */
  var showRanges: js.UndefOr[Boolean] = js.native
  
  /** Specifies the showTicks state.
    * @Default {true}
    */
  var showTicks: js.UndefOr[Boolean] = js.native
  
  /** Specifies the ticks in the scale.
    * @Default {Array}
    */
  var ticks: js.UndefOr[js.Array[ScalesTick]] = js.native
  
  /** Specifies the scaleBar type .See
    * @Default {Rectangle}
    */
  var `type`: js.UndefOr[ScaleType | String] = js.native
  
  /** Specifies the scaleBar width.
    * @Default {30}
    */
  var width: js.UndefOr[Double] = js.native
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
    def setBarPointersVarargs(value: ScalesBarPointer*): Self = this.set("barPointers", js.Array(value :_*))
    
    @scala.inline
    def setBarPointers(value: js.Array[ScalesBarPointer]): Self = this.set("barPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarPointers: Self = this.set("barPointers", js.undefined)
    
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setMajorIntervalValue(value: Double): Self = this.set("majorIntervalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorIntervalValue: Self = this.set("majorIntervalValue", js.undefined)
    
    @scala.inline
    def setMarkerPointersVarargs(value: ScalesMarkerPointer*): Self = this.set("markerPointers", js.Array(value :_*))
    
    @scala.inline
    def setMarkerPointers(value: js.Array[ScalesMarkerPointer]): Self = this.set("markerPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerPointers: Self = this.set("markerPointers", js.undefined)
    
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
    def setPosition(value: ScalesPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
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
    def setShowBarPointers(value: Boolean): Self = this.set("showBarPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBarPointers: Self = this.set("showBarPointers", js.undefined)
    
    @scala.inline
    def setShowCustomLabels(value: Boolean): Self = this.set("showCustomLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCustomLabels: Self = this.set("showCustomLabels", js.undefined)
    
    @scala.inline
    def setShowIndicators(value: Boolean): Self = this.set("showIndicators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIndicators: Self = this.set("showIndicators", js.undefined)
    
    @scala.inline
    def setShowLabels(value: Boolean): Self = this.set("showLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLabels: Self = this.set("showLabels", js.undefined)
    
    @scala.inline
    def setShowMarkerPointers(value: Boolean): Self = this.set("showMarkerPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMarkerPointers: Self = this.set("showMarkerPointers", js.undefined)
    
    @scala.inline
    def setShowRanges(value: Boolean): Self = this.set("showRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRanges: Self = this.set("showRanges", js.undefined)
    
    @scala.inline
    def setShowTicks(value: Boolean): Self = this.set("showTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTicks: Self = this.set("showTicks", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: ScalesTick*): Self = this.set("ticks", js.Array(value :_*))
    
    @scala.inline
    def setTicks(value: js.Array[ScalesTick]): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    
    @scala.inline
    def setType(value: ScaleType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
