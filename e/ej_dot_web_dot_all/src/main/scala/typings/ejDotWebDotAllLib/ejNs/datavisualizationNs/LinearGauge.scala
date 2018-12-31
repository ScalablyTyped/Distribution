package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.LinearGauge")
@js.native
class LinearGauge protected ()
  extends ejDotWebDotAllLib.ejNs.Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.Model = js.native
  @JSName("model")
  var model_LinearGauge: ejDotWebDotAllLib.ejNs.Model = js.native
  /** To export Image
    * @param {number} for the Image
    * @param {number} for the Image
    * @returns {void}
    */
  def exportImage(fileName: scala.Double, fileType: scala.Double): scala.Unit = js.native
  /** To get Bar Distance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getBarDistanceFromScale(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get Bar Pointer Value in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getBarPointerValue(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get Bar Width in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getBarWidth(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get CustomLabel Angle in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} customLabelIndex value for the Gauge
    * @returns {any}
    */
  def getCustomLabelAngle(scaleIndex: scala.Double, customLabelIndex: scala.Double): js.Any = js.native
  /** To get CustomLabel Value in string
    * @param {number} scaleIndex value for the Gauge
    * @param {number} customLabelIndex value for the Gauge
    * @returns {any}
    */
  def getCustomLabelValue(scaleIndex: scala.Double, customLabelIndex: scala.Double): js.Any = js.native
  /** To get Label Angle in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getLabelAngle(scaleIndex: scala.Double, labelIndex: scala.Double): js.Any = js.native
  /** To get LabelPlacement in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getLabelPlacement(scaleIndex: scala.Double, labelIndex: scala.Double): js.Any = js.native
  /** To get LabelStyle in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getLabelStyle(scaleIndex: scala.Double, labelIndex: scala.Double): js.Any = js.native
  /** To get Label XDistance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getLabelXDistanceFromScale(scaleIndex: scala.Double, labelIndex: scala.Double): js.Any = js.native
  /** To get PointerValue in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getLabelYDistanceFromScale(scaleIndex: scala.Double, labelIndex: scala.Double): js.Any = js.native
  /** To get Major Interval Value in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMajorIntervalValue(scaleIndex: scala.Double): js.Any = js.native
  /** To get MarkerStyle in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getMarkerStyle(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get Maximum Value in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMaximumValue(scaleIndex: scala.Double): js.Any = js.native
  /** To get PointerValue in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getMinimumValue(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get Minor Interval Value in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMinorIntervalValue(scaleIndex: scala.Double): js.Any = js.native
  /** To get Pointer Distance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerDistanceFromScale(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get PointerHeight in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerHeight(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get Pointer Placement in String
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerPlacement(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get PointerValue in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerValue(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get PointerWidth in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerWidth(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get Range Border Width in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeBorderWidth(scaleIndex: scala.Double, rangeIndex: scala.Double): js.Any = js.native
  /** To get Range Distance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeDistanceFromScale(scaleIndex: scala.Double, rangeIndex: scala.Double): js.Any = js.native
  /** To get Range End Value in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeEndValue(scaleIndex: scala.Double, rangeIndex: scala.Double): js.Any = js.native
  /** To get Range End Width in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeEndWidth(scaleIndex: scala.Double, rangeIndex: scala.Double): js.Any = js.native
  /** To get Range Position in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangePosition(scaleIndex: scala.Double, rangeIndex: scala.Double): js.Any = js.native
  /** To get Range Start Value in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeStartValue(scaleIndex: scala.Double, rangeIndex: scala.Double): js.Any = js.native
  /** To get Range Start Width in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeStartWidth(scaleIndex: scala.Double, rangeIndex: scala.Double): js.Any = js.native
  /** To get ScaleBarLength in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleBarLength(scaleIndex: scala.Double): js.Any = js.native
  /** To get Scale Bar Size in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getScaleBarSize(scaleIndex: scala.Double, pointerIndex: scala.Double): js.Any = js.native
  /** To get Scale Border Width in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleBorderWidth(scaleIndex: scala.Double): js.Any = js.native
  /** To get Scale Direction in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleDirection(scaleIndex: scala.Double): js.Any = js.native
  /** To get Scale Location in object
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleLocation(scaleIndex: scala.Double): js.Any = js.native
  /** To get Scale Style in string
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleStyle(scaleIndex: scala.Double): js.Any = js.native
  /** To get Tick Angle in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickAngle(scaleIndex: scala.Double, tickIndex: scala.Double): js.Any = js.native
  /** To get Tick Height in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickHeight(scaleIndex: scala.Double, tickIndex: scala.Double): js.Any = js.native
  /** To get getTickPlacement in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickPlacement(scaleIndex: scala.Double, tickIndex: scala.Double): js.Any = js.native
  /** To get Tick Style in string
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickStyle(scaleIndex: scala.Double, tickIndex: scala.Double): js.Any = js.native
  /** To get Tick Width in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickWidth(scaleIndex: scala.Double, tickIndex: scala.Double): js.Any = js.native
  /** To get get Tick XDistance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickXDistanceFromScale(scaleIndex: scala.Double, tickIndex: scala.Double): js.Any = js.native
  /** To get Tick YDistance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickYDistanceFromScale(scaleIndex: scala.Double, tickIndex: scala.Double): js.Any = js.native
  /** Specifies the scales.
    * @returns {void}
    */
  def scales(): scala.Unit = js.native
  /** To set setBarDistanceFromScale
    * @param {number} scaleIndex,value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {number} Bar DistanceFromScale value for Gauge
    * @returns {void}
    */
  def setBarDistanceFromScale(scaleIndex: scala.Double, pointerIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setBarPointerValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {number} Bar Pointer Value for Gauge
    * @returns {void}
    */
  def setBarPointerValue(scaleIndex: scala.Double, pointerIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setBarWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {number} Bar Width for Gauge
    * @returns {void}
    */
  def setBarWidth(scaleIndex: scala.Double, pointerIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setCustomLabelAngle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} customLabelIndex value for the Gauge
    * @param {number} Custom Label Angle for Gauge
    * @returns {void}
    */
  def setCustomLabelAngle(scaleIndex: scala.Double, customLabelIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setCustomLabelValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} customLabelIndex value for the Gauge
    * @param {number} CustomLabel value for Gauge
    * @returns {void}
    */
  def setCustomLabelValue(scaleIndex: scala.Double, customLabelIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setLabelAngle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Label Angle for Gauge
    * @returns {void}
    */
  def setLabelAngle(scaleIndex: scala.Double, labelIndex: scala.Double, angle: scala.Double): scala.Unit = js.native
  /** To set setLabelPlacement
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Label Placement for Gauge
    * @returns {void}
    */
  def setLabelPlacement(scaleIndex: scala.Double, labelIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setLabelStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {string} Label Style for Gauge
    * @returns {void}
    */
  def setLabelStyle(scaleIndex: scala.Double, labelIndex: scala.Double, value: java.lang.String): scala.Unit = js.native
  /** To set setLabelXDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Label XDistance From Scale for Gauge
    * @returns {void}
    */
  def setLabelXDistanceFromScale(scaleIndex: scala.Double, labelIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setLabelYDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Label YDistance From Scale for Gauge
    * @returns {void}
    */
  def setLabelYDistanceFromScale(scaleIndex: scala.Double, labelIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setMajorIntervalValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} Major Interval Value for Gauge
    * @returns {void}
    */
  def setMajorIntervalValue(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setMarkerStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {string} marker Style for Gauge
    * @returns {void}
    */
  def setMarkerStyle(scaleIndex: scala.Double, pointerIndex: scala.Double, value: java.lang.String): scala.Unit = js.native
  /** To set setMaximumValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} MaximumValue for Gauge
    * @returns {void}
    */
  def setMaximumValue(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setMinimumValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} MinimumValue for Gauge
    * @returns {void}
    */
  def setMinimumValue(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setMinorIntervalValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} Minor Interval Value for Gauge
    * @returns {void}
    */
  def setMinorIntervalValue(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setPointerDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {number} for Gauge
    * @returns {void}
    */
  def setPointerDistanceFromScale(scaleIndex: scala.Double, pointerIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set PointerHeight
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {number} for Gauge
    * @returns {void}
    */
  def setPointerHeight(scaleIndex: scala.Double, pointerIndex: scala.Double, height: scala.Double): scala.Unit = js.native
  /** To set setPointerPlacement
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {number} pointer placement for Gauge
    * @returns {void}
    */
  def setPointerPlacement(scaleIndex: scala.Double, pointerIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set PointerValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {number} Pointer value for Gauge
    * @returns {void}
    */
  def setPointerValue(scaleIndex: scala.Double, pointerIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set PointerWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {number} Pointer width for Gauge
    * @returns {void}
    */
  def setPointerWidth(scaleIndex: scala.Double, pointerIndex: scala.Double, width: scala.Double): scala.Unit = js.native
  /** To set setRangeBorderWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @param {number} Range Border Width for Gauge
    * @returns {void}
    */
  def setRangeBorderWidth(scaleIndex: scala.Double, rangeIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setRangeDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @param {number} Range Distance FromScale for Gauge
    * @returns {void}
    */
  def setRangeDistanceFromScale(scaleIndex: scala.Double, rangeIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setRangeEndValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @param {number} Range end value for Gauge
    * @returns {void}
    */
  def setRangeEndValue(scaleIndex: scala.Double, rangeIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setRangeEndWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @param {number} Range End Width for Gauge
    * @returns {void}
    */
  def setRangeEndWidth(scaleIndex: scala.Double, rangeIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setRangePosition
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @param {number} Range Position for Gauge
    * @returns {void}
    */
  def setRangePosition(scaleIndex: scala.Double, rangeIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setRangeStartValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @param {number} range start value for Gauge
    * @returns {void}
    */
  def setRangeStartValue(scaleIndex: scala.Double, rangeIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setRangeStartWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @param {number} Range Start Width for Gauge
    * @returns {void}
    */
  def setRangeStartWidth(scaleIndex: scala.Double, rangeIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setScaleBarLength
    * @param {number} scaleIndex value for the Gauge
    * @param {number} Scale Bar Length for Gauge
    * @returns {void}
    */
  def setScaleBarLength(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setScaleBarSize
    * @param {number} scaleIndex value for the Gauge
    * @param {number} ScaleBarSize for Gauge
    * @returns {void}
    */
  def setScaleBarSize(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setScaleBorderWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} Scale Border Width for Gauge
    * @returns {void}
    */
  def setScaleBorderWidth(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setScaleDirection
    * @param {number} scaleIndex value for the Gauge
    * @param {number} Scale Direction for Gauge
    * @returns {void}
    */
  def setScaleDirection(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setScaleLocation
    * @param {number} scaleIndex value for the Gauge
    * @param {any} Scale position for Gauge
    * @returns {void}
    */
  def setScaleLocation(scaleIndex: scala.Double, value: js.Any): scala.Unit = js.native
  /** To set setScaleStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} for Gauge
    * @returns {void}
    */
  def setScaleStyle(scaleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setTickAngle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Tick Angle for Gauge
    * @returns {void}
    */
  def setTickAngle(scaleIndex: scala.Double, tickIndex: scala.Double, angle: scala.Double): scala.Unit = js.native
  /** To set setTickHeight
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Tick Height for Gauge
    * @returns {void}
    */
  def setTickHeight(scaleIndex: scala.Double, tickIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setTickPlacement
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Tick Placement for Gauge
    * @returns {void}
    */
  def setTickPlacement(scaleIndex: scala.Double, tickIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setTickStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {string} Tick Style for Gauge
    * @returns {void}
    */
  def setTickStyle(scaleIndex: scala.Double, tickIndex: scala.Double, value: java.lang.String): scala.Unit = js.native
  /** To set setTickWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Tick Width for Gauge
    * @returns {void}
    */
  def setTickWidth(scaleIndex: scala.Double, tickIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setTickXDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Tick XDistance From Scale for Gauge
    * @returns {void}
    */
  def setTickXDistanceFromScale(scaleIndex: scala.Double, tickIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  /** To set setTickYDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Tick YDistance From Scale for Gauge
    * @returns {void}
    */
  def setTickYDistanceFromScale(scaleIndex: scala.Double, tickIndex: scala.Double, value: scala.Double): scala.Unit = js.native
}

@JSGlobal("ej.datavisualization.LinearGauge")
@js.native
object LinearGauge extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGauge = js.native
}

