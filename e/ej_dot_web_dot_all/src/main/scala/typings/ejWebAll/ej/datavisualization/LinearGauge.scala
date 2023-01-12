package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearGauge
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
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
  def getBarDistanceFromScale(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get Bar Pointer Value in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getBarPointerValue(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get Bar Width in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getBarWidth(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get CustomLabel Angle in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} customLabelIndex value for the Gauge
    * @returns {any}
    */
  def getCustomLabelAngle(scaleIndex: Double, customLabelIndex: Double): Any = js.native
  
  /** To get CustomLabel Value in string
    * @param {number} scaleIndex value for the Gauge
    * @param {number} customLabelIndex value for the Gauge
    * @returns {any}
    */
  def getCustomLabelValue(scaleIndex: Double, customLabelIndex: Double): Any = js.native
  
  /** To get Label Angle in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getLabelAngle(scaleIndex: Double, labelIndex: Double): Any = js.native
  
  /** To get LabelPlacement in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getLabelPlacement(scaleIndex: Double, labelIndex: Double): Any = js.native
  
  /** To get LabelStyle in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getLabelStyle(scaleIndex: Double, labelIndex: Double): Any = js.native
  
  /** To get Label XDistance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getLabelXDistanceFromScale(scaleIndex: Double, labelIndex: Double): Any = js.native
  
  /** To get PointerValue in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getLabelYDistanceFromScale(scaleIndex: Double, labelIndex: Double): Any = js.native
  
  /** To get Major Interval Value in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMajorIntervalValue(scaleIndex: Double): Any = js.native
  
  /** To get MarkerStyle in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getMarkerStyle(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get Maximum Value in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMaximumValue(scaleIndex: Double): Any = js.native
  
  /** To get PointerValue in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getMinimumValue(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get Minor Interval Value in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMinorIntervalValue(scaleIndex: Double): Any = js.native
  
  /** To get Pointer Distance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerDistanceFromScale(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get PointerHeight in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerHeight(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get Pointer Placement in String
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerPlacement(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get PointerValue in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerValue(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get PointerWidth in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerWidth(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get Range Border Width in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeBorderWidth(scaleIndex: Double, rangeIndex: Double): Any = js.native
  
  /** To get Range Distance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeDistanceFromScale(scaleIndex: Double, rangeIndex: Double): Any = js.native
  
  /** To get Range End Value in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeEndValue(scaleIndex: Double, rangeIndex: Double): Any = js.native
  
  /** To get Range End Width in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeEndWidth(scaleIndex: Double, rangeIndex: Double): Any = js.native
  
  /** To get Range Position in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangePosition(scaleIndex: Double, rangeIndex: Double): Any = js.native
  
  /** To get Range Start Value in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeStartValue(scaleIndex: Double, rangeIndex: Double): Any = js.native
  
  /** To get Range Start Width in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeStartWidth(scaleIndex: Double, rangeIndex: Double): Any = js.native
  
  /** To get ScaleBarLength in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleBarLength(scaleIndex: Double): Any = js.native
  
  /** To get Scale Bar Size in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getScaleBarSize(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get Scale Border Width in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleBorderWidth(scaleIndex: Double): Any = js.native
  
  /** To get Scale Direction in number
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleDirection(scaleIndex: Double): Any = js.native
  
  /** To get Scale Location in object
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleLocation(scaleIndex: Double): Any = js.native
  
  /** To get Scale Style in string
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleStyle(scaleIndex: Double): Any = js.native
  
  /** To get Tick Angle in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickAngle(scaleIndex: Double, tickIndex: Double): Any = js.native
  
  /** To get Tick Height in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickHeight(scaleIndex: Double, tickIndex: Double): Any = js.native
  
  /** To get getTickPlacement in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickPlacement(scaleIndex: Double, tickIndex: Double): Any = js.native
  
  /** To get Tick Style in string
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickStyle(scaleIndex: Double, tickIndex: Double): Any = js.native
  
  /** To get Tick Width in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickWidth(scaleIndex: Double, tickIndex: Double): Any = js.native
  
  /** To get get Tick XDistance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickXDistanceFromScale(scaleIndex: Double, tickIndex: Double): Any = js.native
  
  /** To get Tick YDistance From Scale in number
    * @param {number} scaleIndex value for the Gauge
    * @param {number} value for the Gauge
    * @returns {any}
    */
  def getTickYDistanceFromScale(scaleIndex: Double, tickIndex: Double): Any = js.native
  
  @JSName("model")
  var model_LinearGauge: Model = js.native
  
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
  def setScaleLocation(scaleIndex: Double, value: Any): Unit = js.native
  
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
object LinearGauge {
  
  @js.native
  sealed trait Direction extends StObject
  @JSGlobal("ej.datavisualization.LinearGauge.Direction")
  @js.native
  object Direction extends StObject {
    
    //string
    @js.native
    sealed trait Clockwise
      extends StObject
         with Direction
    
    //string
    @js.native
    sealed trait CounterClockwise
      extends StObject
         with Direction
  }
  
  @js.native
  sealed trait ExportingMode extends StObject
  @JSGlobal("ej.datavisualization.LinearGauge.ExportingMode")
  @js.native
  object ExportingMode extends StObject {
    
    //string
    @js.native
    sealed trait ClientSide
      extends StObject
         with ExportingMode
    
    //string
    @js.native
    sealed trait ServerSide
      extends StObject
         with ExportingMode
  }
  
  @js.native
  sealed trait ExportingType extends StObject
  @JSGlobal("ej.datavisualization.LinearGauge.ExportingType")
  @js.native
  object ExportingType extends StObject {
    
    //string
    @js.native
    sealed trait JPG
      extends StObject
         with ExportingType
    
    //string
    @js.native
    sealed trait PNG
      extends StObject
         with ExportingType
  }
  
  @js.native
  sealed trait FontStyle extends StObject
  @JSGlobal("ej.datavisualization.LinearGauge.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    //string
    @js.native
    sealed trait Bold
      extends StObject
         with FontStyle
    
    //string
    @js.native
    sealed trait Italic
      extends StObject
         with FontStyle
    
    //string
    @js.native
    sealed trait Regular
      extends StObject
         with FontStyle
    
    //string
    @js.native
    sealed trait Strikeout
      extends StObject
         with FontStyle
    
    //string
    @js.native
    sealed trait Underline
      extends StObject
         with FontStyle
  }
  
  @js.native
  sealed trait IndicatorTypes extends StObject
  @JSGlobal("ej.datavisualization.LinearGauge.IndicatorTypes")
  @js.native
  object IndicatorTypes extends StObject {
    
    //string
    @js.native
    sealed trait Circle
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Rectangle
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait RoundedRectangle
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Text
      extends StObject
         with IndicatorTypes
  }
  
  @js.native
  sealed trait MarkerType extends StObject
  @JSGlobal("ej.datavisualization.LinearGauge.MarkerType")
  @js.native
  object MarkerType extends StObject {
    
    //string
    @js.native
    sealed trait Circle
      extends StObject
         with MarkerType
    
    //string
    @js.native
    sealed trait Diamond
      extends StObject
         with MarkerType
    
    //string
    @js.native
    sealed trait Ellipse
      extends StObject
         with MarkerType
    
    //string
    @js.native
    sealed trait Pentagon
      extends StObject
         with MarkerType
    
    //string
    @js.native
    sealed trait Pointer
      extends StObject
         with MarkerType
    
    //string
    @js.native
    sealed trait Rectangle
      extends StObject
         with MarkerType
    
    //string
    @js.native
    sealed trait RoundedRectangle
      extends StObject
         with MarkerType
    
    //string
    @js.native
    sealed trait Slider
      extends StObject
         with MarkerType
    
    //string
    @js.native
    sealed trait Star
      extends StObject
         with MarkerType
    
    //string
    @js.native
    sealed trait Trapezoid
      extends StObject
         with MarkerType
    
    //string
    @js.native
    sealed trait Triangle
      extends StObject
         with MarkerType
    
    //string
    @js.native
    sealed trait Wedge
      extends StObject
         with MarkerType
  }
  
  @js.native
  sealed trait OuterCustomLabelPosition extends StObject
  @JSGlobal("ej.datavisualization.LinearGauge.OuterCustomLabelPosition")
  @js.native
  object OuterCustomLabelPosition extends StObject {
    
    //string
    @js.native
    sealed trait Bottom
      extends StObject
         with OuterCustomLabelPosition
    
    //string
    @js.native
    sealed trait Left
      extends StObject
         with OuterCustomLabelPosition
    
    //string
    @js.native
    sealed trait Right
      extends StObject
         with OuterCustomLabelPosition
    
    //string
    @js.native
    sealed trait Top
      extends StObject
         with OuterCustomLabelPosition
  }
  
  @js.native
  sealed trait PointerPlacement extends StObject
  @JSGlobal("ej.datavisualization.LinearGauge.PointerPlacement")
  @js.native
  object PointerPlacement extends StObject {
    
    //string
    @js.native
    sealed trait Center
      extends StObject
         with PointerPlacement
    
    //string
    @js.native
    sealed trait Far
      extends StObject
         with PointerPlacement
    
    //string
    @js.native
    sealed trait Near
      extends StObject
         with PointerPlacement
  }
  
  @js.native
  sealed trait ScaleType extends StObject
  @JSGlobal("ej.datavisualization.LinearGauge.ScaleType")
  @js.native
  object ScaleType extends StObject {
    
    //string
    @js.native
    sealed trait Major
      extends StObject
         with ScaleType
    
    //string
    @js.native
    sealed trait Minor
      extends StObject
         with ScaleType
  }
  
  @js.native
  sealed trait Themes extends StObject
  @JSGlobal("ej.datavisualization.LinearGauge.Themes")
  @js.native
  object Themes extends StObject {
    
    //string
    @js.native
    sealed trait FlatDark
      extends StObject
         with Themes
    
    //string
    @js.native
    sealed trait FlatLight
      extends StObject
         with Themes
  }
  
  @js.native
  sealed trait TicksType extends StObject
  @JSGlobal("ej.datavisualization.LinearGauge.TicksType")
  @js.native
  object TicksType extends StObject {
    
    //string
    @js.native
    sealed trait Majorinterval
      extends StObject
         with TicksType
    
    //string
    @js.native
    sealed trait Minorinterval
      extends StObject
         with TicksType
  }
  
  @js.native
  sealed trait UnitTextPlacement extends StObject
  @JSGlobal("ej.datavisualization.LinearGauge.UnitTextPlacement")
  @js.native
  object UnitTextPlacement extends StObject {
    
    //string
    @js.native
    sealed trait Back
      extends StObject
         with UnitTextPlacement
    
    //string
    @js.native
    sealed trait From
      extends StObject
         with UnitTextPlacement
  }
  
  trait DoubleClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the points with respect to gauge area.id - ID of the target element.    size - Width and height of the gauge.    pageX - x-coordinate of the
      * pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the gauge model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DoubleClickEventArgs {
    
    inline def apply(): DoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DoubleClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DrawBarPointersEventArgs extends StObject {
    
    /** returns the gauge model
      */
    var Model: js.UndefOr[Any] = js.undefined
    
    /** returns the value of the bar pointer.
      */
    var PointerValue: js.UndefOr[Double] = js.undefined
    
    /** returns the current Bar pointer element.
      */
    var barElement: js.UndefOr[Any] = js.undefined
    
    /** returns the index of the bar pointer.
      */
    var barPointerIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the startX and startY of the pointer
      */
    var position: js.UndefOr[Any] = js.undefined
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[Any] = js.undefined
    
    /** returns the scaleIndex to which the pointer belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the pointer style
      */
    var style: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[Any] = js.undefined
  }
  object DrawBarPointersEventArgs {
    
    inline def apply(): DrawBarPointersEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawBarPointersEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawBarPointersEventArgs] (val x: Self) extends AnyVal {
      
      inline def setBarElement(value: Any): Self = StObject.set(x, "barElement", value.asInstanceOf[js.Any])
      
      inline def setBarElementUndefined: Self = StObject.set(x, "barElement", js.undefined)
      
      inline def setBarPointerIndex(value: Double): Self = StObject.set(x, "barPointerIndex", value.asInstanceOf[js.Any])
      
      inline def setBarPointerIndexUndefined: Self = StObject.set(x, "barPointerIndex", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setPointerValue(value: Double): Self = StObject.set(x, "PointerValue", value.asInstanceOf[js.Any])
      
      inline def setPointerValueUndefined: Self = StObject.set(x, "PointerValue", js.undefined)
      
      inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScaleElement(value: Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      inline def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DrawCustomLabelEventArgs extends StObject {
    
    /** returns the gauge model
      */
    var Model: js.UndefOr[Any] = js.undefined
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the current customLabel element.
      */
    var customLabelElement: js.UndefOr[Any] = js.undefined
    
    /** returns the index of the customLabel.
      */
    var customLabelIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the startX and startY of the customLabel
      */
    var position: js.UndefOr[Any] = js.undefined
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[Any] = js.undefined
    
    /** returns the scaleIndex to which the pointer belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the customLabel style
      */
    var style: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[Any] = js.undefined
  }
  object DrawCustomLabelEventArgs {
    
    inline def apply(): DrawCustomLabelEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawCustomLabelEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawCustomLabelEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setCustomLabelElement(value: Any): Self = StObject.set(x, "customLabelElement", value.asInstanceOf[js.Any])
      
      inline def setCustomLabelElementUndefined: Self = StObject.set(x, "customLabelElement", js.undefined)
      
      inline def setCustomLabelIndex(value: Double): Self = StObject.set(x, "customLabelIndex", value.asInstanceOf[js.Any])
      
      inline def setCustomLabelIndexUndefined: Self = StObject.set(x, "customLabelIndex", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScaleElement(value: Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      inline def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DrawIndicatorsEventArgs extends StObject {
    
    /** returns the current Indicator element.
      */
    var IndicatorElement: js.UndefOr[Any] = js.undefined
    
    /** returns the index of the Indicator.
      */
    var IndicatorIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the gauge model
      */
    var Model: js.UndefOr[Any] = js.undefined
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the startX and startY of the Indicator
      */
    var position: js.UndefOr[Any] = js.undefined
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[Any] = js.undefined
    
    /** returns the scaleIndex to which the pointer belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the Indicator style
      */
    var style: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[Any] = js.undefined
  }
  object DrawIndicatorsEventArgs {
    
    inline def apply(): DrawIndicatorsEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawIndicatorsEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawIndicatorsEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setIndicatorElement(value: Any): Self = StObject.set(x, "IndicatorElement", value.asInstanceOf[js.Any])
      
      inline def setIndicatorElementUndefined: Self = StObject.set(x, "IndicatorElement", js.undefined)
      
      inline def setIndicatorIndex(value: Double): Self = StObject.set(x, "IndicatorIndex", value.asInstanceOf[js.Any])
      
      inline def setIndicatorIndexUndefined: Self = StObject.set(x, "IndicatorIndex", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScaleElement(value: Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      inline def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DrawLabelsEventArgs extends StObject {
    
    /** returns the gauge model
      */
    var Model: js.UndefOr[Any] = js.undefined
    
    /** returns the angle of the label.
      */
    var angle: js.UndefOr[Double] = js.undefined
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the current label element.
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** returns the index of the label.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the startX and startY of the label
      */
    var position: js.UndefOr[Any] = js.undefined
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[Any] = js.undefined
    
    /** returns the scaleIndex to which the label belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the label style
      */
    var style: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[Any] = js.undefined
    
    /** returns the label value of the label.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object DrawLabelsEventArgs {
    
    inline def apply(): DrawLabelsEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawLabelsEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawLabelsEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScaleElement(value: Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      inline def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DrawMarkerPointersEventArgs extends StObject {
    
    /** returns the gauge model
      */
    var Model: js.UndefOr[Any] = js.undefined
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the current marker pointer element.
      */
    var markerElement: js.UndefOr[Any] = js.undefined
    
    /** returns the index of the marker pointer.
      */
    var markerPointerIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the angle of the marker pointer.
      */
    var pointerAngle: js.UndefOr[Double] = js.undefined
    
    /** returns the value of the marker pointer.
      */
    var pointerValue: js.UndefOr[Double] = js.undefined
    
    /** returns the startX and startY of the pointer
      */
    var position: js.UndefOr[Any] = js.undefined
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[Any] = js.undefined
    
    /** returns the scaleIndex to which the pointer belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the ticks style
      */
    var style: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[Any] = js.undefined
  }
  object DrawMarkerPointersEventArgs {
    
    inline def apply(): DrawMarkerPointersEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawMarkerPointersEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawMarkerPointersEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setMarkerElement(value: Any): Self = StObject.set(x, "markerElement", value.asInstanceOf[js.Any])
      
      inline def setMarkerElementUndefined: Self = StObject.set(x, "markerElement", js.undefined)
      
      inline def setMarkerPointerIndex(value: Double): Self = StObject.set(x, "markerPointerIndex", value.asInstanceOf[js.Any])
      
      inline def setMarkerPointerIndexUndefined: Self = StObject.set(x, "markerPointerIndex", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setPointerAngle(value: Double): Self = StObject.set(x, "pointerAngle", value.asInstanceOf[js.Any])
      
      inline def setPointerAngleUndefined: Self = StObject.set(x, "pointerAngle", js.undefined)
      
      inline def setPointerValue(value: Double): Self = StObject.set(x, "pointerValue", value.asInstanceOf[js.Any])
      
      inline def setPointerValueUndefined: Self = StObject.set(x, "pointerValue", js.undefined)
      
      inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScaleElement(value: Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      inline def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DrawRangeEventArgs extends StObject {
    
    /** returns the gauge model
      */
    var Model: js.UndefOr[Any] = js.undefined
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the startX and startY of the range
      */
    var position: js.UndefOr[Any] = js.undefined
    
    /** returns the current range element.
      */
    var rangeElement: js.UndefOr[Any] = js.undefined
    
    /** returns the index of the range.
      */
    var rangeIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[Any] = js.undefined
    
    /** returns the scaleIndex to which the pointer belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the range style
      */
    var style: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[Any] = js.undefined
  }
  object DrawRangeEventArgs {
    
    inline def apply(): DrawRangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawRangeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawRangeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRangeElement(value: Any): Self = StObject.set(x, "rangeElement", value.asInstanceOf[js.Any])
      
      inline def setRangeElementUndefined: Self = StObject.set(x, "rangeElement", js.undefined)
      
      inline def setRangeIndex(value: Double): Self = StObject.set(x, "rangeIndex", value.asInstanceOf[js.Any])
      
      inline def setRangeIndexUndefined: Self = StObject.set(x, "rangeIndex", js.undefined)
      
      inline def setScaleElement(value: Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      inline def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DrawTicksEventArgs extends StObject {
    
    /** returns the gauge model
      */
    var Model: js.UndefOr[Any] = js.undefined
    
    /** returns the angle of the tick.
      */
    var angle: js.UndefOr[Double] = js.undefined
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the current tick element.
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** returns the index of the tick.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the startX and startY of the ticks
      */
    var position: js.UndefOr[Any] = js.undefined
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[Any] = js.undefined
    
    /** returns the scaleIndex to which the tick belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the ticks style
      */
    var style: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[Any] = js.undefined
    
    /** returns the tick value of the tick.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object DrawTicksEventArgs {
    
    inline def apply(): DrawTicksEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawTicksEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawTicksEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScaleElement(value: Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      inline def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ExportSettings extends StObject {
    
    /** Specifies the name of the action URL
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** Specifies the downloading filename
      * @Default {LinearGauge}
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /** Specifies the mode of exporting
      * @Default {client}
      */
    var mode: js.UndefOr[ExportingMode | String] = js.undefined
    
    /** Specifies the format of the file to export
      * @Default {png}
      */
    var `type`: js.UndefOr[ExportingType | String] = js.undefined
  }
  object ExportSettings {
    
    inline def apply(): ExportSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportSettings] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setMode(value: ExportingMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setType(value: ExportingType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Frame extends StObject {
    
    /** Specifies the frame background image URL of linear gauge
      * @Default {null}
      */
    var backgroundImageUrl: js.UndefOr[String] = js.undefined
    
    /** Specifies the frame InnerWidth
      * @Default {8}
      */
    var innerWidth: js.UndefOr[Double] = js.undefined
    
    /** Specifies the frame OuterWidth
      * @Default {12}
      */
    var outerWidth: js.UndefOr[Double] = js.undefined
  }
  object Frame {
    
    inline def apply(): Frame = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Frame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
      
      inline def setBackgroundImageUrl(value: String): Self = StObject.set(x, "backgroundImageUrl", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUrlUndefined: Self = StObject.set(x, "backgroundImageUrl", js.undefined)
      
      inline def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
      
      inline def setInnerWidthUndefined: Self = StObject.set(x, "innerWidth", js.undefined)
      
      inline def setOuterWidth(value: Double): Self = StObject.set(x, "outerWidth", value.asInstanceOf[js.Any])
      
      inline def setOuterWidthUndefined: Self = StObject.set(x, "outerWidth", js.undefined)
    }
  }
  
  trait InitEventArgs extends StObject {
    
    /** returns the gauge model
      */
    var Model: js.UndefOr[Any] = js.undefined
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the entire scale element.
      */
    var scaleElement: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object InitEventArgs {
    
    inline def apply(): InitEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InitEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setScaleElement(value: Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait LoadEventArgs extends StObject {
    
    /** returns the gauge model
      */
    var Model: js.UndefOr[Any] = js.undefined
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the entire scale element.
      */
    var scaleElement: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[Any] = js.undefined
  }
  object LoadEventArgs {
    
    inline def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setScaleElement(value: Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Specifies the animationSpeed
      * @Default {500}
      */
    var animationSpeed: js.UndefOr[Double] = js.undefined
    
    /** Specifies the backgroundColor for Linear gauge.
      * @Default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the borderColor for Linear gauge.
      * @Default {null}
      */
    var borderColor: js.UndefOr[String] = js.undefined
    
    /** Fires, on double clicking the gauge.
      */
    var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
    
    /** Triggers while the bar pointer are being drawn on the gauge.
      */
    var drawBarPointers: js.UndefOr[js.Function1[/* e */ DrawBarPointersEventArgs, Unit]] = js.undefined
    
    /** Triggers while the customLabel are being drawn on the gauge.
      */
    var drawCustomLabel: js.UndefOr[js.Function1[/* e */ DrawCustomLabelEventArgs, Unit]] = js.undefined
    
    /** Triggers while the Indicator are being drawn on the gauge.
      */
    var drawIndicators: js.UndefOr[js.Function1[/* e */ DrawIndicatorsEventArgs, Unit]] = js.undefined
    
    /** Triggers while the label are being drawn on the gauge.
      */
    var drawLabels: js.UndefOr[js.Function1[/* e */ DrawLabelsEventArgs, Unit]] = js.undefined
    
    /** Triggers while the marker are being drawn on the gauge.
      */
    var drawMarkerPointers: js.UndefOr[js.Function1[/* e */ DrawMarkerPointersEventArgs, Unit]] = js.undefined
    
    /** Triggers while the range are being drawn on the gauge.
      */
    var drawRange: js.UndefOr[js.Function1[/* e */ DrawRangeEventArgs, Unit]] = js.undefined
    
    /** Triggers while the ticks are being drawn on the gauge.
      */
    var drawTicks: js.UndefOr[js.Function1[/* e */ DrawTicksEventArgs, Unit]] = js.undefined
    
    /** Specifies the animate state
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Used to Convert the date object to  string while using the  locale settings
      * @Default {false}
      */
    var enableGroupSeparator: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the animate state for marker pointer
      * @Default {true}
      */
    var enableMarkerPointerAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Responsiveness of the linear gauge is controlled
      * @Default {false}
      */
    var enableResize: js.UndefOr[Boolean] = js.undefined
    
    /** This provides options for customizing export settings
      */
    var exportSettings: js.UndefOr[ExportSettings] = js.undefined
    
    /** Specify frame of linear gauge
      * @Default {null}
      */
    var frame: js.UndefOr[Frame] = js.undefined
    
    /** Specifies the height of Linear gauge.
      * @Default {400}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Triggers when the gauge is initialized.
      */
    var init: js.UndefOr[js.Function1[/* e */ InitEventArgs, Unit]] = js.undefined
    
    /** Specifies the can resize state.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the labelColor for Linear gauge.
      * @Default {null}
      */
    var labelColor: js.UndefOr[String] = js.undefined
    
    /** Triggers while the gauge start to Load.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Set the  localization culture  for the Linear gauge
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Specifies the maximum value of Linear gauge.
      * @Default {100}
      */
    var maximum: js.UndefOr[Double] = js.undefined
    
    /** Specifies the minimum value of Linear gauge.
      * @Default {0}
      */
    var minimum: js.UndefOr[Double] = js.undefined
    
    /** Triggers when the left mouse button is clicked.
      */
    var mouseClick: js.UndefOr[js.Function1[/* e */ MouseClickEventArgs, Unit]] = js.undefined
    
    /** Triggers when clicking and dragging the mouse pointer over the gauge pointer.
      */
    var mouseClickMove: js.UndefOr[js.Function1[/* e */ MouseClickMoveEventArgs, Unit]] = js.undefined
    
    /** Triggers when the mouse click is released.
      */
    var mouseClickUp: js.UndefOr[js.Function1[/* e */ MouseClickUpEventArgs, Unit]] = js.undefined
    
    /** Specifies the orientation for Linear gauge.
      * @Default {Vertical}
      */
    var orientation: js.UndefOr[String] = js.undefined
    
    /** Specify labelPosition value of Linear gauge See
      * @Default {bottom}
      */
    var outerCustomLabelPosition: js.UndefOr[OuterCustomLabelPosition | String] = js.undefined
    
    /** Specifies the pointerGradient1 for Linear gauge.
      * @Default {null}
      */
    var pointerGradient1: js.UndefOr[Any] = js.undefined
    
    /** Specifies the pointerGradient2 for Linear gauge.
      * @Default {null}
      */
    var pointerGradient2: js.UndefOr[Any] = js.undefined
    
    /** Specifies the read only state.
      * @Default {true}
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Triggers while the rendering of the gauge completed.
      */
    var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.undefined
    
    /** Fires, on right clicking the gauge.
      */
    var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
    
    /** Specifies the scales
      * @Default {null}
      */
    var scales: js.UndefOr[js.Array[Scale]] = js.undefined
    
    /** Specifies the theme for Linear gauge. See LinearGauge.Themes
      * @Default {flatlight}
      */
    var theme: js.UndefOr[Themes | String] = js.undefined
    
    /** Specifies the tick Color for Linear gauge.
      * @Default {null}
      */
    var tickColor: js.UndefOr[String] = js.undefined
    
    /** Specify tooltip options of linear gauge
      * @Default {false}
      */
    var tooltip: js.UndefOr[Tooltip] = js.undefined
    
    /** Specifies the value of the Gauge.
      * @Default {0}
      */
    var value: js.UndefOr[Double] = js.undefined
    
    /** Specifies the width of Linear gauge.
      * @Default {150}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.datavisualization.LinearGauge.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.LinearGauge.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.LinearGauge.Model] (val x: Self) extends AnyVal {
      
      inline def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      inline def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
      
      inline def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
      
      inline def setDrawBarPointers(value: /* e */ DrawBarPointersEventArgs => Unit): Self = StObject.set(x, "drawBarPointers", js.Any.fromFunction1(value))
      
      inline def setDrawBarPointersUndefined: Self = StObject.set(x, "drawBarPointers", js.undefined)
      
      inline def setDrawCustomLabel(value: /* e */ DrawCustomLabelEventArgs => Unit): Self = StObject.set(x, "drawCustomLabel", js.Any.fromFunction1(value))
      
      inline def setDrawCustomLabelUndefined: Self = StObject.set(x, "drawCustomLabel", js.undefined)
      
      inline def setDrawIndicators(value: /* e */ DrawIndicatorsEventArgs => Unit): Self = StObject.set(x, "drawIndicators", js.Any.fromFunction1(value))
      
      inline def setDrawIndicatorsUndefined: Self = StObject.set(x, "drawIndicators", js.undefined)
      
      inline def setDrawLabels(value: /* e */ DrawLabelsEventArgs => Unit): Self = StObject.set(x, "drawLabels", js.Any.fromFunction1(value))
      
      inline def setDrawLabelsUndefined: Self = StObject.set(x, "drawLabels", js.undefined)
      
      inline def setDrawMarkerPointers(value: /* e */ DrawMarkerPointersEventArgs => Unit): Self = StObject.set(x, "drawMarkerPointers", js.Any.fromFunction1(value))
      
      inline def setDrawMarkerPointersUndefined: Self = StObject.set(x, "drawMarkerPointers", js.undefined)
      
      inline def setDrawRange(value: /* e */ DrawRangeEventArgs => Unit): Self = StObject.set(x, "drawRange", js.Any.fromFunction1(value))
      
      inline def setDrawRangeUndefined: Self = StObject.set(x, "drawRange", js.undefined)
      
      inline def setDrawTicks(value: /* e */ DrawTicksEventArgs => Unit): Self = StObject.set(x, "drawTicks", js.Any.fromFunction1(value))
      
      inline def setDrawTicksUndefined: Self = StObject.set(x, "drawTicks", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setEnableGroupSeparator(value: Boolean): Self = StObject.set(x, "enableGroupSeparator", value.asInstanceOf[js.Any])
      
      inline def setEnableGroupSeparatorUndefined: Self = StObject.set(x, "enableGroupSeparator", js.undefined)
      
      inline def setEnableMarkerPointerAnimation(value: Boolean): Self = StObject.set(x, "enableMarkerPointerAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableMarkerPointerAnimationUndefined: Self = StObject.set(x, "enableMarkerPointerAnimation", js.undefined)
      
      inline def setEnableResize(value: Boolean): Self = StObject.set(x, "enableResize", value.asInstanceOf[js.Any])
      
      inline def setEnableResizeUndefined: Self = StObject.set(x, "enableResize", js.undefined)
      
      inline def setExportSettings(value: ExportSettings): Self = StObject.set(x, "exportSettings", value.asInstanceOf[js.Any])
      
      inline def setExportSettingsUndefined: Self = StObject.set(x, "exportSettings", js.undefined)
      
      inline def setFrame(value: Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInit(value: /* e */ InitEventArgs => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      inline def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setMouseClick(value: /* e */ MouseClickEventArgs => Unit): Self = StObject.set(x, "mouseClick", js.Any.fromFunction1(value))
      
      inline def setMouseClickMove(value: /* e */ MouseClickMoveEventArgs => Unit): Self = StObject.set(x, "mouseClickMove", js.Any.fromFunction1(value))
      
      inline def setMouseClickMoveUndefined: Self = StObject.set(x, "mouseClickMove", js.undefined)
      
      inline def setMouseClickUndefined: Self = StObject.set(x, "mouseClick", js.undefined)
      
      inline def setMouseClickUp(value: /* e */ MouseClickUpEventArgs => Unit): Self = StObject.set(x, "mouseClickUp", js.Any.fromFunction1(value))
      
      inline def setMouseClickUpUndefined: Self = StObject.set(x, "mouseClickUp", js.undefined)
      
      inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOuterCustomLabelPosition(value: OuterCustomLabelPosition | String): Self = StObject.set(x, "outerCustomLabelPosition", value.asInstanceOf[js.Any])
      
      inline def setOuterCustomLabelPositionUndefined: Self = StObject.set(x, "outerCustomLabelPosition", js.undefined)
      
      inline def setPointerGradient1(value: Any): Self = StObject.set(x, "pointerGradient1", value.asInstanceOf[js.Any])
      
      inline def setPointerGradient1Undefined: Self = StObject.set(x, "pointerGradient1", js.undefined)
      
      inline def setPointerGradient2(value: Any): Self = StObject.set(x, "pointerGradient2", value.asInstanceOf[js.Any])
      
      inline def setPointerGradient2Undefined: Self = StObject.set(x, "pointerGradient2", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRenderComplete(value: /* e */ RenderCompleteEventArgs => Unit): Self = StObject.set(x, "renderComplete", js.Any.fromFunction1(value))
      
      inline def setRenderCompleteUndefined: Self = StObject.set(x, "renderComplete", js.undefined)
      
      inline def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = StObject.set(x, "rightClick", js.Any.fromFunction1(value))
      
      inline def setRightClickUndefined: Self = StObject.set(x, "rightClick", js.undefined)
      
      inline def setScales(value: js.Array[Scale]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      inline def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
      
      inline def setScalesVarargs(value: Scale*): Self = StObject.set(x, "scales", js.Array(value*))
      
      inline def setTheme(value: Themes | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTickColor(value: String): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
      
      inline def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
      
      inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MouseClickEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element* @param {Object} args.markerpointer returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the pointer element.
      */
    var markerPointerElement: js.UndefOr[Any] = js.undefined
    
    /** returns the pointer Index
      */
    var markerPointerIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the value of the pointer.
      */
    var markerPointerValue: js.UndefOr[Double] = js.undefined
    
    /** returns the gauge model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the startX and startY of the pointer.
      */
    var position: js.UndefOr[Any] = js.undefined
    
    /** returns the scale element.
      */
    var scaleElement: js.UndefOr[Any] = js.undefined
    
    /** returns the scaleIndex to which the pointer belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the pointer style
      */
    var style: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[Any] = js.undefined
  }
  object MouseClickEventArgs {
    
    inline def apply(): MouseClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setMarkerPointerElement(value: Any): Self = StObject.set(x, "markerPointerElement", value.asInstanceOf[js.Any])
      
      inline def setMarkerPointerElementUndefined: Self = StObject.set(x, "markerPointerElement", js.undefined)
      
      inline def setMarkerPointerIndex(value: Double): Self = StObject.set(x, "markerPointerIndex", value.asInstanceOf[js.Any])
      
      inline def setMarkerPointerIndexUndefined: Self = StObject.set(x, "markerPointerIndex", js.undefined)
      
      inline def setMarkerPointerValue(value: Double): Self = StObject.set(x, "markerPointerValue", value.asInstanceOf[js.Any])
      
      inline def setMarkerPointerValueUndefined: Self = StObject.set(x, "markerPointerValue", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScaleElement(value: Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      inline def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MouseClickMoveEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the pointer element.
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** returns the pointer Index
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** returns the gauge model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the startX and startY of the pointer.
      */
    var position: js.UndefOr[Any] = js.undefined
    
    /** returns the scale element.
      */
    var scaleElement: js.UndefOr[Any] = js.undefined
    
    /** returns the scaleIndex to which the pointer belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the pointer style
      */
    var style: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[Any] = js.undefined
    
    /** returns the value of the pointer.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object MouseClickMoveEventArgs {
    
    inline def apply(): MouseClickMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseClickMoveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseClickMoveEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScaleElement(value: Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      inline def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait MouseClickUpEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element* @param {Object} args.markerPointer returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the pointer element.
      */
    var markerPointerElement: js.UndefOr[Any] = js.undefined
    
    /** returns the pointer Index
      */
    var markerPointerIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the value of the pointer.
      */
    var markerPointerValue: js.UndefOr[Double] = js.undefined
    
    /** returns the gauge model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the startX and startY of the pointer.
      */
    var position: js.UndefOr[Any] = js.undefined
    
    /** returns the scale element.
      */
    var scaleElement: js.UndefOr[Any] = js.undefined
    
    /** returns the scaleIndex to which the pointer belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the pointer style
      */
    var style: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[Any] = js.undefined
  }
  object MouseClickUpEventArgs {
    
    inline def apply(): MouseClickUpEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseClickUpEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseClickUpEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setMarkerPointerElement(value: Any): Self = StObject.set(x, "markerPointerElement", value.asInstanceOf[js.Any])
      
      inline def setMarkerPointerElementUndefined: Self = StObject.set(x, "markerPointerElement", js.undefined)
      
      inline def setMarkerPointerIndex(value: Double): Self = StObject.set(x, "markerPointerIndex", value.asInstanceOf[js.Any])
      
      inline def setMarkerPointerIndexUndefined: Self = StObject.set(x, "markerPointerIndex", js.undefined)
      
      inline def setMarkerPointerValue(value: Double): Self = StObject.set(x, "markerPointerValue", value.asInstanceOf[js.Any])
      
      inline def setMarkerPointerValueUndefined: Self = StObject.set(x, "markerPointerValue", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScaleElement(value: Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      inline def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RenderCompleteEventArgs extends StObject {
    
    /** returns the gauge model
      */
    var Model: js.UndefOr[Any] = js.undefined
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the entire scale element.
      */
    var scaleElement: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[Any] = js.undefined
  }
  object RenderCompleteEventArgs {
    
    inline def apply(): RenderCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderCompleteEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderCompleteEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setScaleElement(value: Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RightClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the points with respect to gauge area.id - ID of the target element.    size - Width and height of the gauge.    pageX - x-coordinate of the
      * pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the gauge model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RightClickEventArgs {
    
    inline def apply(): RightClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RightClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RightClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Scale extends StObject {
    
    /** Specifies the backgroundColor of the Scale.
      * @Default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the scaleBar Gradient of bar pointer
      * @Default {Array}
      */
    var barPointers: js.UndefOr[js.Array[ScalesBarPointer]] = js.undefined
    
    /** Specifies the border of the Scale.
      * @Default {null}
      */
    var border: js.UndefOr[ScalesBorder] = js.undefined
    
    /** Specifies the customLabel
      * @Default {Array}
      */
    var customLabels: js.UndefOr[js.Array[ScalesCustomLabel]] = js.undefined
    
    /** Specifies the scale Direction of the Scale. See
      * @Default {CounterClockwise}
      */
    var direction: js.UndefOr[typings.ejWebAll.ej.Direction | String] = js.undefined
    
    /** Specifies the indicator
      * @Default {Array}
      */
    var indicators: js.UndefOr[js.Array[ScalesIndicator]] = js.undefined
    
    /** Specifies the labels.
      * @Default {Array}
      */
    var labels: js.UndefOr[js.Array[ScalesLabel]] = js.undefined
    
    /** Specifies the scaleBar Length.
      * @Default {290}
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /** Specifies the majorIntervalValue of the Scale.
      * @Default {10}
      */
    var majorIntervalValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the markerPointers
      * @Default {Array}
      */
    var markerPointers: js.UndefOr[js.Array[ScalesMarkerPointer]] = js.undefined
    
    /** Specifies the maximum of the Scale.
      * @Default {null}
      */
    var maximum: js.UndefOr[Double] = js.undefined
    
    /** Specifies the minimum of the Scale.
      * @Default {null}
      */
    var minimum: js.UndefOr[Double] = js.undefined
    
    /** Specifies the minorIntervalValue of the Scale.
      * @Default {2}
      */
    var minorIntervalValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the opacity of the Scale.
      * @Default {NaN}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the position
      * @Default {null}
      */
    var position: js.UndefOr[ScalesPosition] = js.undefined
    
    /** Specifies the ranges in the tick.
      * @Default {Array}
      */
    var ranges: js.UndefOr[js.Array[ScalesRange]] = js.undefined
    
    /** Specifies the shadowOffset.
      * @Default {0}
      */
    var shadowOffset: js.UndefOr[Double] = js.undefined
    
    /** Specifies the showBarPointers state.
      * @Default {true}
      */
    var showBarPointers: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the showCustomLabels state.
      * @Default {false}
      */
    var showCustomLabels: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the showIndicators state.
      * @Default {false}
      */
    var showIndicators: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the showLabels state.
      * @Default {true}
      */
    var showLabels: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the showMarkerPointers state.
      * @Default {true}
      */
    var showMarkerPointers: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the showRanges state.
      * @Default {false}
      */
    var showRanges: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the showTicks state.
      * @Default {true}
      */
    var showTicks: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the ticks in the scale.
      * @Default {Array}
      */
    var ticks: js.UndefOr[js.Array[ScalesTick]] = js.undefined
    
    /** Specifies the scaleBar type .See
      * @Default {Rectangle}
      */
    var `type`: js.UndefOr[ScaleType | String] = js.undefined
    
    /** Specifies the scaleBar width.
      * @Default {30}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Scale {
    
    inline def apply(): Scale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBarPointers(value: js.Array[ScalesBarPointer]): Self = StObject.set(x, "barPointers", value.asInstanceOf[js.Any])
      
      inline def setBarPointersUndefined: Self = StObject.set(x, "barPointers", js.undefined)
      
      inline def setBarPointersVarargs(value: ScalesBarPointer*): Self = StObject.set(x, "barPointers", js.Array(value*))
      
      inline def setBorder(value: ScalesBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setCustomLabels(value: js.Array[ScalesCustomLabel]): Self = StObject.set(x, "customLabels", value.asInstanceOf[js.Any])
      
      inline def setCustomLabelsUndefined: Self = StObject.set(x, "customLabels", js.undefined)
      
      inline def setCustomLabelsVarargs(value: ScalesCustomLabel*): Self = StObject.set(x, "customLabels", js.Array(value*))
      
      inline def setDirection(value: typings.ejWebAll.ej.Direction | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setIndicators(value: js.Array[ScalesIndicator]): Self = StObject.set(x, "indicators", value.asInstanceOf[js.Any])
      
      inline def setIndicatorsUndefined: Self = StObject.set(x, "indicators", js.undefined)
      
      inline def setIndicatorsVarargs(value: ScalesIndicator*): Self = StObject.set(x, "indicators", js.Array(value*))
      
      inline def setLabels(value: js.Array[ScalesLabel]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLabelsVarargs(value: ScalesLabel*): Self = StObject.set(x, "labels", js.Array(value*))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMajorIntervalValue(value: Double): Self = StObject.set(x, "majorIntervalValue", value.asInstanceOf[js.Any])
      
      inline def setMajorIntervalValueUndefined: Self = StObject.set(x, "majorIntervalValue", js.undefined)
      
      inline def setMarkerPointers(value: js.Array[ScalesMarkerPointer]): Self = StObject.set(x, "markerPointers", value.asInstanceOf[js.Any])
      
      inline def setMarkerPointersUndefined: Self = StObject.set(x, "markerPointers", js.undefined)
      
      inline def setMarkerPointersVarargs(value: ScalesMarkerPointer*): Self = StObject.set(x, "markerPointers", js.Array(value*))
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setMinorIntervalValue(value: Double): Self = StObject.set(x, "minorIntervalValue", value.asInstanceOf[js.Any])
      
      inline def setMinorIntervalValueUndefined: Self = StObject.set(x, "minorIntervalValue", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPosition(value: ScalesPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRanges(value: js.Array[ScalesRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setRangesVarargs(value: ScalesRange*): Self = StObject.set(x, "ranges", js.Array(value*))
      
      inline def setShadowOffset(value: Double): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
      
      inline def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
      
      inline def setShowBarPointers(value: Boolean): Self = StObject.set(x, "showBarPointers", value.asInstanceOf[js.Any])
      
      inline def setShowBarPointersUndefined: Self = StObject.set(x, "showBarPointers", js.undefined)
      
      inline def setShowCustomLabels(value: Boolean): Self = StObject.set(x, "showCustomLabels", value.asInstanceOf[js.Any])
      
      inline def setShowCustomLabelsUndefined: Self = StObject.set(x, "showCustomLabels", js.undefined)
      
      inline def setShowIndicators(value: Boolean): Self = StObject.set(x, "showIndicators", value.asInstanceOf[js.Any])
      
      inline def setShowIndicatorsUndefined: Self = StObject.set(x, "showIndicators", js.undefined)
      
      inline def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
      
      inline def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
      
      inline def setShowMarkerPointers(value: Boolean): Self = StObject.set(x, "showMarkerPointers", value.asInstanceOf[js.Any])
      
      inline def setShowMarkerPointersUndefined: Self = StObject.set(x, "showMarkerPointers", js.undefined)
      
      inline def setShowRanges(value: Boolean): Self = StObject.set(x, "showRanges", value.asInstanceOf[js.Any])
      
      inline def setShowRangesUndefined: Self = StObject.set(x, "showRanges", js.undefined)
      
      inline def setShowTicks(value: Boolean): Self = StObject.set(x, "showTicks", value.asInstanceOf[js.Any])
      
      inline def setShowTicksUndefined: Self = StObject.set(x, "showTicks", js.undefined)
      
      inline def setTicks(value: js.Array[ScalesTick]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTicksVarargs(value: ScalesTick*): Self = StObject.set(x, "ticks", js.Array(value*))
      
      inline def setType(value: ScaleType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ScalesBarPointer extends StObject {
    
    /** Specifies the backgroundColor of bar pointer
      * @Default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the border of bar pointer
      * @Default {null}
      */
    var border: js.UndefOr[ScalesBarPointersBorder] = js.undefined
    
    /** Specifies the distanceFromScale of bar pointer
      * @Default {0}
      */
    var distanceFromScale: js.UndefOr[Double] = js.undefined
    
    /** Specifies the scaleBar Gradient of bar pointer
      * @Default {null}
      */
    var gradients: js.UndefOr[Any] = js.undefined
    
    /** Specifies the opacity of bar pointer
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the value of bar pointer
      * @Default {null}
      */
    var value: js.UndefOr[Double] = js.undefined
    
    /** Specifies the pointer Width of bar pointer
      * @Default {width=30}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ScalesBarPointer {
    
    inline def apply(): ScalesBarPointer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesBarPointer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesBarPointer] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorder(value: ScalesBarPointersBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setDistanceFromScale(value: Double): Self = StObject.set(x, "distanceFromScale", value.asInstanceOf[js.Any])
      
      inline def setDistanceFromScaleUndefined: Self = StObject.set(x, "distanceFromScale", js.undefined)
      
      inline def setGradients(value: Any): Self = StObject.set(x, "gradients", value.asInstanceOf[js.Any])
      
      inline def setGradientsUndefined: Self = StObject.set(x, "gradients", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ScalesBarPointersBorder extends StObject {
    
    /** Specifies the border Color of bar pointer
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the border Width of bar pointer
      * @Default {1.5}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ScalesBarPointersBorder {
    
    inline def apply(): ScalesBarPointersBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesBarPointersBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesBarPointersBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ScalesBorder extends StObject {
    
    /** Specifies the border color of the Scale.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the border width of the Scale.
      * @Default {1.5}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ScalesBorder {
    
    inline def apply(): ScalesBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ScalesCustomLabel extends StObject {
    
    /** Specifies the label Color in customLabels
      * @Default {null}
      */
    var color: js.UndefOr[Double] = js.undefined
    
    /** Specifies the font in customLabels
      * @Default {null}
      */
    var font: js.UndefOr[ScalesCustomLabelsFont] = js.undefined
    
    /** Specifies the opacity in customLabels
      * @Default {0}
      */
    var opacity: js.UndefOr[String] = js.undefined
    
    /** Specifies the position in customLabels
      * @Default {null}
      */
    var position: js.UndefOr[ScalesCustomLabelsPosition] = js.undefined
    
    /** Specifies the positionType in customLabels.See CustomLabelPositionType
      * @Default {null}
      */
    var positionType: js.UndefOr[Any] = js.undefined
    
    /** Specifies the textAngle in customLabels
      * @Default {0}
      */
    var textAngle: js.UndefOr[Double] = js.undefined
    
    /** Specifies the label Value in customLabels
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ScalesCustomLabel {
    
    inline def apply(): ScalesCustomLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesCustomLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesCustomLabel] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFont(value: ScalesCustomLabelsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPosition(value: ScalesCustomLabelsPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionType(value: Any): Self = StObject.set(x, "positionType", value.asInstanceOf[js.Any])
      
      inline def setPositionTypeUndefined: Self = StObject.set(x, "positionType", js.undefined)
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTextAngle(value: Double): Self = StObject.set(x, "textAngle", value.asInstanceOf[js.Any])
      
      inline def setTextAngleUndefined: Self = StObject.set(x, "textAngle", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ScalesCustomLabelsFont extends StObject {
    
    /** Specifies the fontFamily in customLabels
      * @Default {Arial}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specifies the fontStyle in customLabels. See
      * @Default {Bold}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Specifies the font size in customLabels
      * @Default {11px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object ScalesCustomLabelsFont {
    
    inline def apply(): ScalesCustomLabelsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesCustomLabelsFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesCustomLabelsFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ScalesCustomLabelsPosition extends StObject {
    
    /** Specifies the position x in customLabels
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Specifies the y in customLabels
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object ScalesCustomLabelsPosition {
    
    inline def apply(): ScalesCustomLabelsPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesCustomLabelsPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesCustomLabelsPosition] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ScalesIndicator extends StObject {
    
    /** Specifies the backgroundColor in bar indicators
      * @Default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the border in bar indicators
      * @Default {null}
      */
    var border: js.UndefOr[ScalesIndicatorsBorder] = js.undefined
    
    /** Specifies the font of bar indicators
      * @Default {null}
      */
    var font: js.UndefOr[ScalesIndicatorsFont] = js.undefined
    
    /** Specifies the indicator Height of bar indicators
      * @Default {30}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Specifies the opacity in bar indicators
      * @Default {null}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the position in bar indicators
      * @Default {null}
      */
    var position: js.UndefOr[ScalesIndicatorsPosition] = js.undefined
    
    /** Specifies the state ranges in bar indicators
      * @Default {Array}
      */
    var stateRanges: js.UndefOr[js.Array[ScalesIndicatorsStateRange]] = js.undefined
    
    /** Specifies the textLocation in bar indicators
      * @Default {null}
      */
    var textLocation: js.UndefOr[ScalesIndicatorsTextLocation] = js.undefined
    
    /** Specifies the indicator Style of font in bar indicators
      * @Default {ej.datavisualization.LinearGauge.IndicatorType.Rectangle}
      */
    var `type`: js.UndefOr[IndicatorTypes | String] = js.undefined
    
    /** Specifies the indicator Width in bar indicators
      * @Default {30}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ScalesIndicator {
    
    inline def apply(): ScalesIndicator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesIndicator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesIndicator] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorder(value: ScalesIndicatorsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setFont(value: ScalesIndicatorsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPosition(value: ScalesIndicatorsPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStateRanges(value: js.Array[ScalesIndicatorsStateRange]): Self = StObject.set(x, "stateRanges", value.asInstanceOf[js.Any])
      
      inline def setStateRangesUndefined: Self = StObject.set(x, "stateRanges", js.undefined)
      
      inline def setStateRangesVarargs(value: ScalesIndicatorsStateRange*): Self = StObject.set(x, "stateRanges", js.Array(value*))
      
      inline def setTextLocation(value: ScalesIndicatorsTextLocation): Self = StObject.set(x, "textLocation", value.asInstanceOf[js.Any])
      
      inline def setTextLocationUndefined: Self = StObject.set(x, "textLocation", js.undefined)
      
      inline def setType(value: IndicatorTypes | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ScalesIndicatorsBorder extends StObject {
    
    /** Specifies the border Color in bar indicators
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the border Width in bar indicators
      * @Default {1.5}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ScalesIndicatorsBorder {
    
    inline def apply(): ScalesIndicatorsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesIndicatorsBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesIndicatorsBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ScalesIndicatorsFont extends StObject {
    
    /** Specifies the fontFamily of font in bar indicators
      * @Default {Arial}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specifies the fontStyle of font in bar indicators. See FontStyle
      * @Default {ej.datavisualization.LinearGauge.FontStyle.Bold}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Specifies the size of font in bar indicators
      * @Default {11px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object ScalesIndicatorsFont {
    
    inline def apply(): ScalesIndicatorsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesIndicatorsFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesIndicatorsFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ScalesIndicatorsPosition extends StObject {
    
    /** Specifies the x position in bar indicators
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Specifies the y position in bar indicators
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object ScalesIndicatorsPosition {
    
    inline def apply(): ScalesIndicatorsPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesIndicatorsPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesIndicatorsPosition] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ScalesIndicatorsStateRange extends StObject {
    
    /** Specifies the backgroundColor in bar indicators state ranges
      * @Default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the borderColor in bar indicators state ranges
      * @Default {null}
      */
    var borderColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the endValue in bar indicators state ranges
      * @Default {60}
      */
    var endValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the startValue in bar indicators state ranges
      * @Default {50}
      */
    var startValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the text in bar indicators state ranges
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the textColor in bar indicators state ranges
      * @Default {null}
      */
    var textColor: js.UndefOr[String] = js.undefined
  }
  object ScalesIndicatorsStateRange {
    
    inline def apply(): ScalesIndicatorsStateRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesIndicatorsStateRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesIndicatorsStateRange] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
      
      inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
      
      inline def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait ScalesIndicatorsTextLocation extends StObject {
    
    /** Specifies the textLocation position in bar indicators
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Specifies the Y position in bar indicators
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object ScalesIndicatorsTextLocation {
    
    inline def apply(): ScalesIndicatorsTextLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesIndicatorsTextLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesIndicatorsTextLocation] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ScalesLabel extends StObject {
    
    /** Specifies the angle of labels.
      * @Default {0}
      */
    var angle: js.UndefOr[Double] = js.undefined
    
    /** Specifies the DistanceFromScale of labels.
      * @Default {null}
      */
    var distanceFromScale: js.UndefOr[ScalesLabelsDistanceFromScale] = js.undefined
    
    /** Specifies the font of labels.
      * @Default {null}
      */
    var font: js.UndefOr[ScalesLabelsFont] = js.undefined
    
    /** need to includeFirstValue.
      * @Default {true}
      */
    var includeFirstValue: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the opacity of label.
      * @Default {0}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the label Placement of label. See
      * @Default {Near}
      */
    var placement: js.UndefOr[PointerPlacement | String] = js.undefined
    
    /** Specifies the textColor of font.
      * @Default {null}
      */
    var textColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the label Style of label. See
      * @Default {ej.datavisualization.LinearGauge.LabelType.Major}
      */
    var `type`: js.UndefOr[ScaleType | String] = js.undefined
    
    /** Specifies the unitText of label.
      */
    var unitText: js.UndefOr[String] = js.undefined
    
    /** Specifies the unitText Position of label.See
      * @Default {Back}
      */
    var unitTextPlacement: js.UndefOr[UnitTextPlacement | String] = js.undefined
  }
  object ScalesLabel {
    
    inline def apply(): ScalesLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesLabel] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setDistanceFromScale(value: ScalesLabelsDistanceFromScale): Self = StObject.set(x, "distanceFromScale", value.asInstanceOf[js.Any])
      
      inline def setDistanceFromScaleUndefined: Self = StObject.set(x, "distanceFromScale", js.undefined)
      
      inline def setFont(value: ScalesLabelsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setIncludeFirstValue(value: Boolean): Self = StObject.set(x, "includeFirstValue", value.asInstanceOf[js.Any])
      
      inline def setIncludeFirstValueUndefined: Self = StObject.set(x, "includeFirstValue", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPlacement(value: PointerPlacement | String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setType(value: ScaleType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnitText(value: String): Self = StObject.set(x, "unitText", value.asInstanceOf[js.Any])
      
      inline def setUnitTextPlacement(value: UnitTextPlacement | String): Self = StObject.set(x, "unitTextPlacement", value.asInstanceOf[js.Any])
      
      inline def setUnitTextPlacementUndefined: Self = StObject.set(x, "unitTextPlacement", js.undefined)
      
      inline def setUnitTextUndefined: Self = StObject.set(x, "unitText", js.undefined)
    }
  }
  
  trait ScalesLabelsDistanceFromScale extends StObject {
    
    /** Specifies the xDistanceFromScale of labels.
      * @Default {-10}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Specifies the yDistanceFromScale of labels.
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object ScalesLabelsDistanceFromScale {
    
    inline def apply(): ScalesLabelsDistanceFromScale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesLabelsDistanceFromScale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesLabelsDistanceFromScale] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ScalesLabelsFont extends StObject {
    
    /** Specifies the fontFamily of font.
      * @Default {Arial}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specifies the fontStyle of font.See FontStyle
      * @Default {ej.datavisualization.LinearGauge.FontStyle.Bold}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Specifies the size of font.
      * @Default {11px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object ScalesLabelsFont {
    
    inline def apply(): ScalesLabelsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesLabelsFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesLabelsFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ScalesMarkerPointer extends StObject {
    
    /** Specifies the backgroundColor of marker pointer
      * @Default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the border of marker pointer
      * @Default {null}
      */
    var border: js.UndefOr[ScalesMarkerPointersBorder] = js.undefined
    
    /** Specifies the distanceFromScale of marker pointer
      * @Default {0}
      */
    var distanceFromScale: js.UndefOr[Double] = js.undefined
    
    /** Specifies the pointer Gradient of marker pointer
      * @Default {null}
      */
    var gradients: js.UndefOr[Any] = js.undefined
    
    /** Specifies the pointer Length of marker pointer
      * @Default {30}
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /** Specifies the opacity of marker pointer
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the pointer Placement of marker pointer See PointerPlacement
      * @Default {Far}
      */
    var placement: js.UndefOr[PointerPlacement | String] = js.undefined
    
    /** Specifies the marker Style of marker pointerSee
      * @Default {Triangle}
      */
    var `type`: js.UndefOr[MarkerType | String] = js.undefined
    
    /** Specifies the value of marker pointer
      * @Default {null}
      */
    var value: js.UndefOr[Double] = js.undefined
    
    /** Specifies the pointer Width of marker pointer
      * @Default {30}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ScalesMarkerPointer {
    
    inline def apply(): ScalesMarkerPointer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesMarkerPointer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesMarkerPointer] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorder(value: ScalesMarkerPointersBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setDistanceFromScale(value: Double): Self = StObject.set(x, "distanceFromScale", value.asInstanceOf[js.Any])
      
      inline def setDistanceFromScaleUndefined: Self = StObject.set(x, "distanceFromScale", js.undefined)
      
      inline def setGradients(value: Any): Self = StObject.set(x, "gradients", value.asInstanceOf[js.Any])
      
      inline def setGradientsUndefined: Self = StObject.set(x, "gradients", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPlacement(value: PointerPlacement | String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setType(value: MarkerType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ScalesMarkerPointersBorder extends StObject {
    
    /** Specifies the border color of marker pointer
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the border of marker pointer
      * @Default {number}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ScalesMarkerPointersBorder {
    
    inline def apply(): ScalesMarkerPointersBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesMarkerPointersBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesMarkerPointersBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ScalesPosition extends StObject {
    
    /** Specifies the Horizontal position
      * @Default {50}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Specifies the vertical position
      * @Default {50}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object ScalesPosition {
    
    inline def apply(): ScalesPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesPosition] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ScalesRange extends StObject {
    
    /** Specifies the backgroundColor in the ranges.
      * @Default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the border in the ranges.
      * @Default {null}
      */
    var border: js.UndefOr[ScalesRangesBorder] = js.undefined
    
    /** Specifies the distanceFromScale in the ranges.
      * @Default {0}
      */
    var distanceFromScale: js.UndefOr[Double] = js.undefined
    
    /** Specifies the endValue in the ranges.
      * @Default {60}
      */
    var endValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the endWidth in the ranges.
      * @Default {10}
      */
    var endWidth: js.UndefOr[Double] = js.undefined
    
    /** Specifies the range Gradient in the ranges.
      * @Default {null}
      */
    var gradients: js.UndefOr[Any] = js.undefined
    
    /** Specifies the opacity in the ranges.
      * @Default {null}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the range Position in the ranges. See RangePlacement
      * @Default {Center}
      */
    var placement: js.UndefOr[PointerPlacement | String] = js.undefined
    
    /** Specifies the startValue in the ranges.
      * @Default {20}
      */
    var startValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the startWidth in the ranges.
      * @Default {10}
      */
    var startWidth: js.UndefOr[Double] = js.undefined
  }
  object ScalesRange {
    
    inline def apply(): ScalesRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesRange] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorder(value: ScalesRangesBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setDistanceFromScale(value: Double): Self = StObject.set(x, "distanceFromScale", value.asInstanceOf[js.Any])
      
      inline def setDistanceFromScaleUndefined: Self = StObject.set(x, "distanceFromScale", js.undefined)
      
      inline def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
      
      inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
      
      inline def setEndWidth(value: Double): Self = StObject.set(x, "endWidth", value.asInstanceOf[js.Any])
      
      inline def setEndWidthUndefined: Self = StObject.set(x, "endWidth", js.undefined)
      
      inline def setGradients(value: Any): Self = StObject.set(x, "gradients", value.asInstanceOf[js.Any])
      
      inline def setGradientsUndefined: Self = StObject.set(x, "gradients", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPlacement(value: PointerPlacement | String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
      
      inline def setStartWidth(value: Double): Self = StObject.set(x, "startWidth", value.asInstanceOf[js.Any])
      
      inline def setStartWidthUndefined: Self = StObject.set(x, "startWidth", js.undefined)
    }
  }
  
  trait ScalesRangesBorder extends StObject {
    
    /** Specifies the border color in the ranges.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the border width in the ranges.
      * @Default {1.5}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ScalesRangesBorder {
    
    inline def apply(): ScalesRangesBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesRangesBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesRangesBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ScalesTick extends StObject {
    
    /** Specifies the angle in the tick.
      * @Default {0}
      */
    var angle: js.UndefOr[Double] = js.undefined
    
    /** Specifies the tick Color in the tick.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the DistanceFromScale in the tick.
      * @Default {null}
      */
    var distanceFromScale: js.UndefOr[ScalesTicksDistanceFromScale] = js.undefined
    
    /** Specifies the tick Height in the tick.
      * @Default {10}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Specifies the opacity in the tick.
      * @Default {0}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the tick Placement in the tick. See TickPlacement
      * @Default {Near}
      */
    var placement: js.UndefOr[PointerPlacement | String] = js.undefined
    
    /** Specifies the tick Style in the tick. See
      * @Default {MajorInterval}
      */
    var `type`: js.UndefOr[TicksType | String] = js.undefined
    
    /** Specifies the tick Width in the tick.
      * @Default {3}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ScalesTick {
    
    inline def apply(): ScalesTick = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesTick]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesTick] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDistanceFromScale(value: ScalesTicksDistanceFromScale): Self = StObject.set(x, "distanceFromScale", value.asInstanceOf[js.Any])
      
      inline def setDistanceFromScaleUndefined: Self = StObject.set(x, "distanceFromScale", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPlacement(value: PointerPlacement | String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setType(value: TicksType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ScalesTicksDistanceFromScale extends StObject {
    
    /** Specifies the xDistanceFromScale in the tick.
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Specifies the yDistanceFromScale in the tick.
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object ScalesTicksDistanceFromScale {
    
    inline def apply(): ScalesTicksDistanceFromScale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesTicksDistanceFromScale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesTicksDistanceFromScale] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait Tooltip extends StObject {
    
    /** Specify showCustomLabelTooltip value of linear gauge
      * @Default {false}
      */
    var showCustomLabelTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Specify showLabelTooltip value of linear gauge
      * @Default {false}
      */
    var showLabelTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Specify templateID value of linear gauge
      * @Default {false}
      */
    var templateID: js.UndefOr[String] = js.undefined
  }
  object Tooltip {
    
    inline def apply(): Tooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tooltip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
      
      inline def setShowCustomLabelTooltip(value: Boolean): Self = StObject.set(x, "showCustomLabelTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowCustomLabelTooltipUndefined: Self = StObject.set(x, "showCustomLabelTooltip", js.undefined)
      
      inline def setShowLabelTooltip(value: Boolean): Self = StObject.set(x, "showLabelTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowLabelTooltipUndefined: Self = StObject.set(x, "showLabelTooltip", js.undefined)
      
      inline def setTemplateID(value: String): Self = StObject.set(x, "templateID", value.asInstanceOf[js.Any])
      
      inline def setTemplateIDUndefined: Self = StObject.set(x, "templateID", js.undefined)
    }
  }
}
