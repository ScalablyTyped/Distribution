package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.CircularGauge")
@js.native
class CircularGauge protected ()
  extends ejDotWebDotAllLib.ejNs.Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.Model = js.native
  @JSName("model")
  var model_CircularGauge: ejDotWebDotAllLib.ejNs.Model = js.native
  /** To export Image
    * @param {string} fileName for the Image
    * @param {string} fileType for the Image
    * @returns {boolean}
    */
  def exportImage(fileName: java.lang.String, fileType: java.lang.String): scala.Boolean = js.native
  /** To get BackNeedleLength
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getBackNeedleLength(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get CustomLabelAngle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} customLabelIndex value for the Gauge
    * @returns {any}
    */
  def getCustomLabelAngle(scaleIndex: scala.Double, customLabelIndex: scala.Double): js.Any = js.native
  /** To get CustomLabelValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} customLabelIndex value for the Gauge
    * @returns {any}
    */
  def getCustomLabelValue(scaleIndex: scala.Double, customLabelIndex: scala.Double): js.Any = js.native
  /** To get LabelAngle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} labelIndex value for the Gauge
    * @returns {any}
    */
  def getLabelAngle(scaleIndex: scala.Double, labelIndex: scala.Double): js.Any = js.native
  /** To get LabelDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} labelIndex value for the Gauge
    * @returns {any}
    */
  def getLabelDistanceFromScale(scaleIndex: scala.Double, labelIndex: scala.Double): js.Any = js.native
  /** To get LabelPlacement
    * @param {number} scaleIndex value for the Gauge
    * @param {number} labelIndex value for the Gauge
    * @returns {any}
    */
  def getLabelPlacement(scaleIndex: scala.Double, labelIndex: scala.Double): js.Any = js.native
  /** To get LabelStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} labelIndex value for the Gauge
    * @returns {any}
    */
  def getLabelStyle(scaleIndex: scala.Double, labelIndex: scala.Double): js.Any = js.native
  /** To get MajorIntervalValue
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMajorIntervalValue(scaleIndex: scala.Double): js.Any = js.native
  /** To get MarkerDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getMarkerDistanceFromScale(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get MarkerStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getMarkerStyle(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get MaximumValue
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMaximumValue(scaleIndex: scala.Double): js.Any = js.native
  /** To get MinimumValue
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMinimumValue(scaleIndex: scala.Double): js.Any = js.native
  /** To get MinorIntervalValue
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMinorIntervalValue(scaleIndex: scala.Double): js.Any = js.native
  /** To get NeedleStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getNeedleStyle(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get PointerCapBorderWidth
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getPointerCapBorderWidth(scaleIndex: scala.Double): js.Any = js.native
  /** To get PointerCapRadius
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getPointerCapRadius(scaleIndex: scala.Double): js.Any = js.native
  /** To get PointerLength
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerLength(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get PointerNeedleType
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerNeedleType(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get PointerPlacement
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerPlacement(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get PointerValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerValue(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get PointerWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerWidth(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get RangeBorderWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeBorderWidth(scaleIndex: scala.Double, rangeIndex: scala.Double): js.Any = js.native
  /** To get RangeDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeDistanceFromScale(scaleIndex: scala.Double, rangeIndex: scala.Double): js.Any = js.native
  /** To get RangeEndValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeEndValue(scaleIndex: scala.Double, rangeIndex: scala.Double): js.Any = js.native
  /** To get RangePosition
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangePosition(scaleIndex: scala.Double, rangeIndex: scala.Double): js.Any = js.native
  /** To get RangeSize
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeSize(scaleIndex: scala.Double, rangeIndex: scala.Double): js.Any = js.native
  /** To get RangeStartValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeStartValue(scaleIndex: scala.Double, rangeIndex: scala.Double): js.Any = js.native
  /** To get ScaleBarSize
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleBarSize(scaleIndex: scala.Double): js.Any = js.native
  /** To get ScaleBorderWidth
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleBorderWidth(scaleIndex: scala.Double): js.Any = js.native
  /** To get ScaleDirection
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleDirection(scaleIndex: scala.Double): js.Any = js.native
  /** To get ScaleRadius
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleRadius(scaleIndex: scala.Double): js.Any = js.native
  /** To get StartAngle
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getStartAngle(scaleIndex: scala.Double): js.Any = js.native
  /** To get SubGaugeLocation
    * @param {number} scaleIndex value for the Gauge
    * @param {number} GaugeIndex value for the Gauge
    * @returns {any}
    */
  def getSubGaugeLocation(scaleIndex: scala.Double, GaugeIndex: scala.Double): js.Any = js.native
  /** To get SweepAngle
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getSweepAngle(scaleIndex: scala.Double): js.Any = js.native
  /** To get TickAngle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} tickIndex value for the Gauge
    * @returns {any}
    */
  def getTickAngle(scaleIndex: scala.Double, tickIndex: scala.Double): js.Any = js.native
  /** To get TickDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} tickIndex value for the Gauge
    * @returns {any}
    */
  def getTickDistanceFromScale(scaleIndex: scala.Double, tickIndex: scala.Double): js.Any = js.native
  /** To get TickHeight
    * @param {number} scaleIndex value for the Gauge
    * @param {number} labelIndex value for the Gauge
    * @returns {any}
    */
  def getTickHeight(scaleIndex: scala.Double, labelIndex: scala.Double): js.Any = js.native
  /** To get TickPlacement
    * @param {number} scaleIndex value for the Gauge
    * @param {number} tickIndex value for the Gauge
    * @returns {any}
    */
  def getTickPlacement(scaleIndex: scala.Double, tickIndex: scala.Double): js.Any = js.native
  /** To get TickStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} tickIndex value for the Gauge
    * @returns {any}
    */
  def getTickStyle(scaleIndex: scala.Double, tickIndex: scala.Double): js.Any = js.native
  /** To get TickWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} tickIndex value for the Gauge
    * @returns {any}
    */
  def getTickWidth(scaleIndex: scala.Double, tickIndex: scala.Double): js.Any = js.native
  /** To set includeFirstValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} labelIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def includeFirstValue(scaleIndex: scala.Double, labelIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** Switching the redraw option for the gauge
    * @param {string} redraw value for the gauge
    * @returns {void}
    */
  def redraw(value: java.lang.String): scala.Unit = js.native
  /** To set BackNeedleLength
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setBackNeedleLength(scaleIndex: scala.Double, pointerIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set CustomLabelAngle
    * @param {number} scaleIndex value for the gauge
    * @param {number} customLabelIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setCustomLabelAngle(scaleIndex: scala.Double, customLabelIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set CustomLabelValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} customLabelIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setCustomLabelValue(scaleIndex: scala.Double, customLabelIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set LabelAngle
    * @param {number} scaleIndex value for the gauge
    * @param {number} labelIndex value for the gauge
    * @param {number} angle value for the gauge
    * @returns {void}
    */
  def setLabelAngle(scaleIndex: scala.Double, labelIndex: scala.Double, angle: scala.Double): scala.Unit = js.native
  /** To set LabelDistanceFromScale
    * @param {number} scaleIndex value for the gauge
    * @param {number} labelIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setLabelDistanceFromScale(scaleIndex: scala.Double, labelIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set LabelPlacement
    * @param {number} scaleIndex value for the gauge
    * @param {number} labelIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setLabelPlacement(scaleIndex: scala.Double, labelIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set LabelStyle
    * @param {number} scaleIndex value for the gauge
    * @param {number} labelIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setLabelStyle(scaleIndex: scala.Double, labelIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set MajorIntervalValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setMajorIntervalValue(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set MarkerDistanceFromScale
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setMarkerDistanceFromScale(scaleIndex: scala.Double, pointerIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set MarkerStyle
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setMarkerStyle(scaleIndex: scala.Double, pointerIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set MaximumValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setMaximumValue(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set MinimumValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setMinimumValue(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set MinorIntervalValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setMinorIntervalValue(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set NeedleStyle
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setNeedleStyle(scaleIndex: scala.Double, pointerIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set PointerCapBorderWidth
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setPointerCapBorderWidth(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set PointerCapRadius
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setPointerCapRadius(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set PointerLength
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setPointerLength(scaleIndex: scala.Double, pointerIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set PointerNeedleType
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setPointerNeedleType(scaleIndex: scala.Double, pointerIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set PointerPlacement
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setPointerPlacement(scaleIndex: scala.Double, pointerIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set PointerValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setPointerValue(scaleIndex: scala.Double, pointerIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set PointerWidth
    * @param {number} scaleIndex value for the gauge
    * @param {number} pointerIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setPointerWidth(scaleIndex: scala.Double, pointerIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set RangeBorderWidth
    * @param {number} scaleIndex value for the gauge
    * @param {number} rangeIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setRangeBorderWidth(scaleIndex: scala.Double, rangeIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set RangeDistanceFromScale
    * @param {number} scaleIndex value for the gauge
    * @param {number} rangeIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setRangeDistanceFromScale(scaleIndex: scala.Double, rangeIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set RangeEndValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} rangeIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setRangeEndValue(scaleIndex: scala.Double, rangeIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set RangePosition
    * @param {number} scaleIndex value for the gauge
    * @param {number} rangeIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setRangePosition(scaleIndex: scala.Double, rangeIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set RangeSize
    * @param {number} scaleIndex value for the gauge
    * @param {number} rangeIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setRangeSize(scaleIndex: scala.Double, rangeIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set RangeStartValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} rangeIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setRangeStartValue(scaleIndex: scala.Double, rangeIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set ScaleBarSize
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setScaleBarSize(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set ScaleBorderWidth
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setScaleBorderWidth(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set ScaleDirection
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setScaleDirection(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set ScaleRadius
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setScaleRadius(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set StartAngle
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setStartAngle(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set SubGaugeLocation
    * @param {number} scaleIndex value for the gauge
    * @param {number} GaugeIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setSubGaugeLocation(scaleIndex: scala.Double, GaugeIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set SweepAngle
    * @param {number} scaleIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setSweepAngle(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set TickAngle
    * @param {number} scaleIndex value for the gauge
    * @param {number} tickIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setTickAngle(scaleIndex: scala.Double, tickIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set TickDistanceFromScale
    * @param {number} scaleIndex value for the gauge
    * @param {number} tickIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setTickDistanceFromScale(scaleIndex: scala.Double, tickIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set TickHeight
    * @param {number} scaleIndex value for the gauge
    * @param {number} tickIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setTickHeight(scaleIndex: scala.Double, tickIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set TickPlacement
    * @param {number} scaleIndex value for the gauge
    * @param {number} tickIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setTickPlacement(scaleIndex: scala.Double, tickIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set TickStyle
    * @param {number} scaleIndex value for the gauge
    * @param {number} tickIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setTickStyle(scaleIndex: scala.Double, tickIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set TickWidth
    * @param {number} scaleIndex value for the gauge
    * @param {number} tickIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def setTickWidth(scaleIndex: scala.Double, tickIndex: scala.Double, value: scala.Double): scala.Unit = js.native
}

@JSGlobal("ej.datavisualization.CircularGauge")
@js.native
object CircularGauge extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGauge = js.native
}

