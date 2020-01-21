package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.JQuery
import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.CircularGauge")
@js.native
class CircularGauge_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
  var defaults: Model = js.native
  @JSName("model")
  var model_CircularGauge_ : Model = js.native
  /** To export Image
    * @param {string} fileName for the Image
    * @param {string} fileType for the Image
    * @returns {boolean}
    */
  def exportImage(fileName: String, fileType: String): Boolean = js.native
  /** To get BackNeedleLength
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getBackNeedleLength(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get CustomLabelAngle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} customLabelIndex value for the Gauge
    * @returns {any}
    */
  def getCustomLabelAngle(scaleIndex: Double, customLabelIndex: Double): js.Any = js.native
  /** To get CustomLabelValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} customLabelIndex value for the Gauge
    * @returns {any}
    */
  def getCustomLabelValue(scaleIndex: Double, customLabelIndex: Double): js.Any = js.native
  /** To get LabelAngle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} labelIndex value for the Gauge
    * @returns {any}
    */
  def getLabelAngle(scaleIndex: Double, labelIndex: Double): js.Any = js.native
  /** To get LabelDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} labelIndex value for the Gauge
    * @returns {any}
    */
  def getLabelDistanceFromScale(scaleIndex: Double, labelIndex: Double): js.Any = js.native
  /** To get LabelPlacement
    * @param {number} scaleIndex value for the Gauge
    * @param {number} labelIndex value for the Gauge
    * @returns {any}
    */
  def getLabelPlacement(scaleIndex: Double, labelIndex: Double): js.Any = js.native
  /** To get LabelStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} labelIndex value for the Gauge
    * @returns {any}
    */
  def getLabelStyle(scaleIndex: Double, labelIndex: Double): js.Any = js.native
  /** To get MajorIntervalValue
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMajorIntervalValue(scaleIndex: Double): js.Any = js.native
  /** To get MarkerDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getMarkerDistanceFromScale(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get MarkerStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getMarkerStyle(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get MaximumValue
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMaximumValue(scaleIndex: Double): js.Any = js.native
  /** To get MinimumValue
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMinimumValue(scaleIndex: Double): js.Any = js.native
  /** To get MinorIntervalValue
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMinorIntervalValue(scaleIndex: Double): js.Any = js.native
  /** To get NeedleStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getNeedleStyle(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get PointerCapBorderWidth
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getPointerCapBorderWidth(scaleIndex: Double): js.Any = js.native
  /** To get PointerCapRadius
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getPointerCapRadius(scaleIndex: Double): js.Any = js.native
  /** To get PointerLength
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerLength(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get PointerNeedleType
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerNeedleType(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get PointerPlacement
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerPlacement(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get PointerValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerValue(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get PointerWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerWidth(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get RangeBorderWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeBorderWidth(scaleIndex: Double, rangeIndex: Double): js.Any = js.native
  /** To get RangeDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeDistanceFromScale(scaleIndex: Double, rangeIndex: Double): js.Any = js.native
  /** To get RangeEndValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeEndValue(scaleIndex: Double, rangeIndex: Double): js.Any = js.native
  /** To get RangePosition
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangePosition(scaleIndex: Double, rangeIndex: Double): js.Any = js.native
  /** To get RangeSize
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeSize(scaleIndex: Double, rangeIndex: Double): js.Any = js.native
  /** To get RangeStartValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeStartValue(scaleIndex: Double, rangeIndex: Double): js.Any = js.native
  /** To get ScaleBarSize
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleBarSize(scaleIndex: Double): js.Any = js.native
  /** To get ScaleBorderWidth
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleBorderWidth(scaleIndex: Double): js.Any = js.native
  /** To get ScaleDirection
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleDirection(scaleIndex: Double): js.Any = js.native
  /** To get ScaleRadius
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleRadius(scaleIndex: Double): js.Any = js.native
  /** To get StartAngle
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getStartAngle(scaleIndex: Double): js.Any = js.native
  /** To get SubGaugeLocation
    * @param {number} scaleIndex value for the Gauge
    * @param {number} GaugeIndex value for the Gauge
    * @returns {any}
    */
  def getSubGaugeLocation(scaleIndex: Double, GaugeIndex: Double): js.Any = js.native
  /** To get SweepAngle
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getSweepAngle(scaleIndex: Double): js.Any = js.native
  /** To get TickAngle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} tickIndex value for the Gauge
    * @returns {any}
    */
  def getTickAngle(scaleIndex: Double, tickIndex: Double): js.Any = js.native
  /** To get TickDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} tickIndex value for the Gauge
    * @returns {any}
    */
  def getTickDistanceFromScale(scaleIndex: Double, tickIndex: Double): js.Any = js.native
  /** To get TickHeight
    * @param {number} scaleIndex value for the Gauge
    * @param {number} labelIndex value for the Gauge
    * @returns {any}
    */
  def getTickHeight(scaleIndex: Double, labelIndex: Double): js.Any = js.native
  /** To get TickPlacement
    * @param {number} scaleIndex value for the Gauge
    * @param {number} tickIndex value for the Gauge
    * @returns {any}
    */
  def getTickPlacement(scaleIndex: Double, tickIndex: Double): js.Any = js.native
  /** To get TickStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} tickIndex value for the Gauge
    * @returns {any}
    */
  def getTickStyle(scaleIndex: Double, tickIndex: Double): js.Any = js.native
  /** To get TickWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} tickIndex value for the Gauge
    * @returns {any}
    */
  def getTickWidth(scaleIndex: Double, tickIndex: Double): js.Any = js.native
  /** To set includeFirstValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} labelIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def includeFirstValue(scaleIndex: Double, labelIndex: Double, value: Double): Unit = js.native
  /** Switching the redraw option for the gauge
    * @param {string} redraw value for the gauge
    * @returns {void}
    */
  def redraw(value: String): Unit = js.native
  /** To set BackNeedleLength
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setBackNeedleLength(scaleIndex: Double, pointerIndex: Double, value: Double): Unit = js.native
  /** To set CustomLabelAngle
    * @param {number} scaleIndex value for the gauge
    * @param {number} customLabelIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setCustomLabelAngle(scaleIndex: Double, customLabelIndex: Double, value: Double): Unit = js.native
  /** To set CustomLabelValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} customLabelIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setCustomLabelValue(scaleIndex: Double, customLabelIndex: Double, value: Double): Unit = js.native
  /** To set LabelAngle
    * @param {number} scaleIndex value for the gauge
    * @param {number} labelIndex value for the gauge
    * @param {number} angle value for the gauge
    * @returns {void}
    */
  def setLabelAngle(scaleIndex: Double, labelIndex: Double, angle: Double): Unit = js.native
  /** To set LabelDistanceFromScale
    * @param {number} scaleIndex value for the gauge
    * @param {number} labelIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setLabelDistanceFromScale(scaleIndex: Double, labelIndex: Double, value: Double): Unit = js.native
  /** To set LabelPlacement
    * @param {number} scaleIndex value for the gauge
    * @param {number} labelIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setLabelPlacement(scaleIndex: Double, labelIndex: Double, value: Double): Unit = js.native
  /** To set LabelStyle
    * @param {number} scaleIndex value for the gauge
    * @param {number} labelIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setLabelStyle(scaleIndex: Double, labelIndex: Double, value: Double): Unit = js.native
  /** To set MajorIntervalValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setMajorIntervalValue(scaleIndex: Double, value: Double): Unit = js.native
  /** To set MarkerDistanceFromScale
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setMarkerDistanceFromScale(scaleIndex: Double, pointerIndex: Double, value: Double): Unit = js.native
  /** To set MarkerStyle
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setMarkerStyle(scaleIndex: Double, pointerIndex: Double, value: Double): Unit = js.native
  /** To set MaximumValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setMaximumValue(scaleIndex: Double, value: Double): Unit = js.native
  /** To set MinimumValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setMinimumValue(scaleIndex: Double, value: Double): Unit = js.native
  /** To set MinorIntervalValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setMinorIntervalValue(scaleIndex: Double, value: Double): Unit = js.native
  /** To set NeedleStyle
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setNeedleStyle(scaleIndex: Double, pointerIndex: Double, value: Double): Unit = js.native
  /** To set PointerCapBorderWidth
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setPointerCapBorderWidth(scaleIndex: Double, value: Double): Unit = js.native
  /** To set PointerCapRadius
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setPointerCapRadius(scaleIndex: Double, value: Double): Unit = js.native
  /** To set PointerLength
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setPointerLength(scaleIndex: Double, pointerIndex: Double, value: Double): Unit = js.native
  /** To set PointerNeedleType
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setPointerNeedleType(scaleIndex: Double, pointerIndex: Double, value: Double): Unit = js.native
  /** To set PointerPlacement
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setPointerPlacement(scaleIndex: Double, pointerIndex: Double, value: Double): Unit = js.native
  /** To set PointerValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setPointerValue(scaleIndex: Double, pointerIndex: Double, value: Double): Unit = js.native
  /** To set PointerWidth
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setPointerWidth(scaleIndex: Double, pointerIndex: Double, value: Double): Unit = js.native
  /** To set RangeBorderWidth
    * @param {number} scaleIndex value for the gauge
    * @param {number} rangeIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setRangeBorderWidth(scaleIndex: Double, rangeIndex: Double, value: Double): Unit = js.native
  /** To set RangeDistanceFromScale
    * @param {number} scaleIndex value for the gauge
    * @param {number} rangeIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setRangeDistanceFromScale(scaleIndex: Double, rangeIndex: Double, value: Double): Unit = js.native
  /** To set RangeEndValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} rangeIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setRangeEndValue(scaleIndex: Double, rangeIndex: Double, value: Double): Unit = js.native
  /** To set RangePosition
    * @param {number} scaleIndex value for the gauge
    * @param {number} rangeIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setRangePosition(scaleIndex: Double, rangeIndex: Double, value: Double): Unit = js.native
  /** To set RangeSize
    * @param {number} scaleIndex value for the gauge
    * @param {number} rangeIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setRangeSize(scaleIndex: Double, rangeIndex: Double, value: Double): Unit = js.native
  /** To set RangeStartValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} rangeIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setRangeStartValue(scaleIndex: Double, rangeIndex: Double, value: Double): Unit = js.native
  /** To set ScaleBarSize
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setScaleBarSize(scaleIndex: Double, value: Double): Unit = js.native
  /** To set ScaleBorderWidth
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setScaleBorderWidth(scaleIndex: Double, value: Double): Unit = js.native
  /** To set ScaleDirection
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setScaleDirection(scaleIndex: Double, value: Double): Unit = js.native
  /** To set ScaleRadius
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setScaleRadius(scaleIndex: Double, value: Double): Unit = js.native
  /** To set StartAngle
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setStartAngle(scaleIndex: Double, value: Double): Unit = js.native
  /** To set SubGaugeLocation
    * @param {number} scaleIndex value for the gauge
    * @param {number} GaugeIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setSubGaugeLocation(scaleIndex: Double, GaugeIndex: Double, value: Double): Unit = js.native
  /** To set SweepAngle
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setSweepAngle(scaleIndex: Double, value: Double): Unit = js.native
  /** To set TickAngle
    * @param {number} scaleIndex value for the gauge
    * @param {number} tickIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setTickAngle(scaleIndex: Double, tickIndex: Double, value: Double): Unit = js.native
  /** To set TickDistanceFromScale
    * @param {number} scaleIndex value for the gauge
    * @param {number} tickIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setTickDistanceFromScale(scaleIndex: Double, tickIndex: Double, value: Double): Unit = js.native
  /** To set TickHeight
    * @param {number} scaleIndex value for the gauge
    * @param {number} tickIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setTickHeight(scaleIndex: Double, tickIndex: Double, value: Double): Unit = js.native
  /** To set TickPlacement
    * @param {number} scaleIndex value for the gauge
    * @param {number} tickIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setTickPlacement(scaleIndex: Double, tickIndex: Double, value: Double): Unit = js.native
  /** To set TickStyle
    * @param {number} scaleIndex value for the gauge
    * @param {number} tickIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setTickStyle(scaleIndex: Double, tickIndex: Double, value: Double): Unit = js.native
  /** To set TickWidth
    * @param {number} scaleIndex value for the gauge
    * @param {number} tickIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setTickWidth(scaleIndex: Double, tickIndex: Double, value: Double): Unit = js.native
}

