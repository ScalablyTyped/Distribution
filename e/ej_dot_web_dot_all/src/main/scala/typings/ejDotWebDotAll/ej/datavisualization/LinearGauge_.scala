package typings.ejDotWebDotAll.ej.datavisualization

import typings.ejDotWebDotAll.JQuery
import typings.ejDotWebDotAll.ej.Model
import typings.ejDotWebDotAll.ej.Widget
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.LinearGauge")
@js.native
class LinearGauge_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
  var defaults: Model = js.native
  @JSName("model")
  var model_LinearGauge_ : Model = js.native
  /** To export Image
    * @param {number} for the Image
    * @param {number} for the Image
    * @returns {void}
    */
  def exportImage(fileName: Double, fileType: Double): Unit = js.native
  /** To get Bar Distance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getBarDistanceFromScale(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get Bar Pointer Value in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getBarPointerValue(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get Bar Width in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getBarWidth(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get CustomLabel Angle in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} customLabelIndex value for the Gauge
    * @returns {any}
    */
  def getCustomLabelAngle(scaleIndex: Double, customLabelIndex: Double): js.Any = js.native
  /** To get CustomLabel Value in string
    * @param {number} scaleIndex value for the Gauge
    * @param {number} customLabelIndex value for the Gauge
    * @returns {any}
    */
  def getCustomLabelValue(scaleIndex: Double, customLabelIndex: Double): js.Any = js.native
  /** To get Label Angle in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getLabelAngle(scaleIndex: Double, labelIndex: Double): js.Any = js.native
  /** To get LabelPlacement in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getLabelPlacement(scaleIndex: Double, labelIndex: Double): js.Any = js.native
  /** To get LabelStyle in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getLabelStyle(scaleIndex: Double, labelIndex: Double): js.Any = js.native
  /** To get Label XDistance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getLabelXDistanceFromScale(scaleIndex: Double, labelIndex: Double): js.Any = js.native
  /** To get PointerValue in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getLabelYDistanceFromScale(scaleIndex: Double, labelIndex: Double): js.Any = js.native
  /** To get Major Interval Value in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMajorIntervalValue(scaleIndex: Double): js.Any = js.native
  /** To get MarkerStyle in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getMarkerStyle(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get Maximum Value in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMaximumValue(scaleIndex: Double): js.Any = js.native
  /** To get PointerValue in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getMinimumValue(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get Minor Interval Value in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMinorIntervalValue(scaleIndex: Double): js.Any = js.native
  /** To get Pointer Distance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerDistanceFromScale(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get PointerHeight in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerHeight(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get Pointer Placement in String
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerPlacement(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get PointerValue in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerValue(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get PointerWidth in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerWidth(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get Range Border Width in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeBorderWidth(scaleIndex: Double, rangeIndex: Double): js.Any = js.native
  /** To get Range Distance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeDistanceFromScale(scaleIndex: Double, rangeIndex: Double): js.Any = js.native
  /** To get Range End Value in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeEndValue(scaleIndex: Double, rangeIndex: Double): js.Any = js.native
  /** To get Range End Width in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeEndWidth(scaleIndex: Double, rangeIndex: Double): js.Any = js.native
  /** To get Range Position in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangePosition(scaleIndex: Double, rangeIndex: Double): js.Any = js.native
  /** To get Range Start Value in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeStartValue(scaleIndex: Double, rangeIndex: Double): js.Any = js.native
  /** To get Range Start Width in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeStartWidth(scaleIndex: Double, rangeIndex: Double): js.Any = js.native
  /** To get ScaleBarLength in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleBarLength(scaleIndex: Double): js.Any = js.native
  /** To get Scale Bar Size in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getScaleBarSize(scaleIndex: Double, pointerIndex: Double): js.Any = js.native
  /** To get Scale Border Width in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleBorderWidth(scaleIndex: Double): js.Any = js.native
  /** To get Scale Direction in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleDirection(scaleIndex: Double): js.Any = js.native
  /** To get Scale Location in object
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleLocation(scaleIndex: Double): js.Any = js.native
  /** To get Scale Style in string
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleStyle(scaleIndex: Double): js.Any = js.native
  /** To get Tick Angle in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickAngle(scaleIndex: Double, tickIndex: Double): js.Any = js.native
  /** To get Tick Height in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickHeight(scaleIndex: Double, tickIndex: Double): js.Any = js.native
  /** To get getTickPlacement in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickPlacement(scaleIndex: Double, tickIndex: Double): js.Any = js.native
  /** To get Tick Style in string
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickStyle(scaleIndex: Double, tickIndex: Double): js.Any = js.native
  /** To get Tick Width in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickWidth(scaleIndex: Double, tickIndex: Double): js.Any = js.native
  /** To get get Tick XDistance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickXDistanceFromScale(scaleIndex: Double, tickIndex: Double): js.Any = js.native
  /** To get Tick YDistance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickYDistanceFromScale(scaleIndex: Double, tickIndex: Double): js.Any = js.native
  /** Specifies the scales.
    * @returns {void}
    */
  def scales(): Unit = js.native
  /** To set setBarDistanceFromScale
    * @param {number} scaleIndex,value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {number} Bar DistanceFromScale value for Gauge
    * @returns {void}
    */
  def setBarDistanceFromScale(scaleIndex: Double, pointerIndex: Double, value: Double): Unit = js.native
  /** To set setBarPointerValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {number} Bar Pointer Value for Gauge
    * @returns {void}
    */
  def setBarPointerValue(scaleIndex: Double, pointerIndex: Double, value: Double): Unit = js.native
  /** To set setBarWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {number} Bar Width for Gauge
    * @returns {void}
    */
  def setBarWidth(scaleIndex: Double, pointerIndex: Double, value: Double): Unit = js.native
  /** To set setCustomLabelAngle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} customLabelIndex value for the Gauge
    * @param {number} Custom Label Angle for Gauge
    * @returns {void}
    */
  def setCustomLabelAngle(scaleIndex: Double, customLabelIndex: Double, value: Double): Unit = js.native
  /** To set setCustomLabelValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} customLabelIndex value for the Gauge
    * @param {number} CustomLabel value for Gauge
    * @returns {void}
    */
  def setCustomLabelValue(scaleIndex: Double, customLabelIndex: Double, value: Double): Unit = js.native
  /** To set setLabelAngle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Label Angle for Gauge
    * @returns {void}
    */
  def setLabelAngle(scaleIndex: Double, labelIndex: Double, angle: Double): Unit = js.native
  /** To set setLabelPlacement
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Label Placement for Gauge
    * @returns {void}
    */
  def setLabelPlacement(scaleIndex: Double, labelIndex: Double, value: Double): Unit = js.native
  /** To set setLabelStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {string} Label Style for Gauge
    * @returns {void}
    */
  def setLabelStyle(scaleIndex: Double, labelIndex: Double, value: String): Unit = js.native
  /** To set setLabelXDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Label XDistance From Scale for Gauge
    * @returns {void}
    */
  def setLabelXDistanceFromScale(scaleIndex: Double, labelIndex: Double, value: Double): Unit = js.native
  /** To set setLabelYDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Label YDistance From Scale for Gauge
    * @returns {void}
    */
  def setLabelYDistanceFromScale(scaleIndex: Double, labelIndex: Double, value: Double): Unit = js.native
  /** To set setMajorIntervalValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} Major Interval Value for Gauge
    * @returns {void}
    */
  def setMajorIntervalValue(scaleIndex: Double, value: Double): Unit = js.native
  /** To set setMarkerStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {string} marker Style for Gauge
    * @returns {void}
    */
  def setMarkerStyle(scaleIndex: Double, pointerIndex: Double, value: String): Unit = js.native
  /** To set setMaximumValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} MaximumValue for Gauge
    * @returns {void}
    */
  def setMaximumValue(scaleIndex: Double, value: Double): Unit = js.native
  /** To set setMinimumValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} MinimumValue for Gauge
    * @returns {void}
    */
  def setMinimumValue(scaleIndex: Double, value: Double): Unit = js.native
  /** To set setMinorIntervalValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} Minor Interval Value for Gauge
    * @returns {void}
    */
  def setMinorIntervalValue(scaleIndex: Double, value: Double): Unit = js.native
  /** To set setPointerDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {number} for Gauge
    * @returns {void}
    */
  def setPointerDistanceFromScale(scaleIndex: Double, pointerIndex: Double, value: Double): Unit = js.native
  /** To set PointerHeight
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {number} for Gauge
    * @returns {void}
    */
  def setPointerHeight(scaleIndex: Double, pointerIndex: Double, height: Double): Unit = js.native
  /** To set setPointerPlacement
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {number} pointer placement for Gauge
    * @returns {void}
    */
  def setPointerPlacement(scaleIndex: Double, pointerIndex: Double, value: Double): Unit = js.native
  /** To set PointerValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {number} Pointer value for Gauge
    * @returns {void}
    */
  def setPointerValue(scaleIndex: Double, pointerIndex: Double, value: Double): Unit = js.native
  /** To set PointerWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @param {number} Pointer width for Gauge
    * @returns {void}
    */
  def setPointerWidth(scaleIndex: Double, pointerIndex: Double, width: Double): Unit = js.native
  /** To set setRangeBorderWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @param {number} Range Border Width for Gauge
    * @returns {void}
    */
  def setRangeBorderWidth(scaleIndex: Double, rangeIndex: Double, value: Double): Unit = js.native
  /** To set setRangeDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @param {number} Range Distance FromScale for Gauge
    * @returns {void}
    */
  def setRangeDistanceFromScale(scaleIndex: Double, rangeIndex: Double, value: Double): Unit = js.native
  /** To set setRangeEndValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @param {number} Range end value for Gauge
    * @returns {void}
    */
  def setRangeEndValue(scaleIndex: Double, rangeIndex: Double, value: Double): Unit = js.native
  /** To set setRangeEndWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @param {number} Range End Width for Gauge
    * @returns {void}
    */
  def setRangeEndWidth(scaleIndex: Double, rangeIndex: Double, value: Double): Unit = js.native
  /** To set setRangePosition
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @param {number} Range Position for Gauge
    * @returns {void}
    */
  def setRangePosition(scaleIndex: Double, rangeIndex: Double, value: Double): Unit = js.native
  /** To set setRangeStartValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @param {number} range start value for Gauge
    * @returns {void}
    */
  def setRangeStartValue(scaleIndex: Double, rangeIndex: Double, value: Double): Unit = js.native
  /** To set setRangeStartWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @param {number} Range Start Width for Gauge
    * @returns {void}
    */
  def setRangeStartWidth(scaleIndex: Double, rangeIndex: Double, value: Double): Unit = js.native
  /** To set setScaleBarLength
    * @param {number} scaleIndex value for the Gauge
    * @param {number} Scale Bar Length for Gauge
    * @returns {void}
    */
  def setScaleBarLength(scaleIndex: Double, value: Double): Unit = js.native
  /** To set setScaleBarSize
    * @param {number} scaleIndex value for the Gauge
    * @param {number} ScaleBarSize for Gauge
    * @returns {void}
    */
  def setScaleBarSize(scaleIndex: Double, value: Double): Unit = js.native
  /** To set setScaleBorderWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} Scale Border Width for Gauge
    * @returns {void}
    */
  def setScaleBorderWidth(scaleIndex: Double, value: Double): Unit = js.native
  /** To set setScaleDirection
    * @param {number} scaleIndex value for the Gauge
    * @param {number} Scale Direction for Gauge
    * @returns {void}
    */
  def setScaleDirection(scaleIndex: Double, value: Double): Unit = js.native
  /** To set setScaleLocation
    * @param {number} scaleIndex value for the Gauge
    * @param {any} Scale position for Gauge
    * @returns {void}
    */
  def setScaleLocation(scaleIndex: Double, value: js.Any): Unit = js.native
  /** To set setScaleStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} for Gauge
    * @returns {void}
    */
  def setScaleStyle(scaleIndex: Double, value: Double): Unit = js.native
  /** To set setTickAngle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Tick Angle for Gauge
    * @returns {void}
    */
  def setTickAngle(scaleIndex: Double, tickIndex: Double, angle: Double): Unit = js.native
  /** To set setTickHeight
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Tick Height for Gauge
    * @returns {void}
    */
  def setTickHeight(scaleIndex: Double, tickIndex: Double, value: Double): Unit = js.native
  /** To set setTickPlacement
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Tick Placement for Gauge
    * @returns {void}
    */
  def setTickPlacement(scaleIndex: Double, tickIndex: Double, value: Double): Unit = js.native
  /** To set setTickStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {string} Tick Style for Gauge
    * @returns {void}
    */
  def setTickStyle(scaleIndex: Double, tickIndex: Double, value: String): Unit = js.native
  /** To set setTickWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Tick Width for Gauge
    * @returns {void}
    */
  def setTickWidth(scaleIndex: Double, tickIndex: Double, value: Double): Unit = js.native
  /** To set setTickXDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Tick XDistance From Scale for Gauge
    * @returns {void}
    */
  def setTickXDistanceFromScale(scaleIndex: Double, tickIndex: Double, value: Double): Unit = js.native
  /** To set setTickYDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @param {number} Tick YDistance From Scale for Gauge
    * @returns {void}
    */
  def setTickYDistanceFromScale(scaleIndex: Double, tickIndex: Double, value: Double): Unit = js.native
}

