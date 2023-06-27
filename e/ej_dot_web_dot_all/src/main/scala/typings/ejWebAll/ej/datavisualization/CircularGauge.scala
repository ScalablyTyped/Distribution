package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircularGauge
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
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
  def getBackNeedleLength(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get CustomLabelAngle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} customLabelIndex value for the Gauge
    * @returns {any}
    */
  def getCustomLabelAngle(scaleIndex: Double, customLabelIndex: Double): Any = js.native
  
  /** To get CustomLabelValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} customLabelIndex value for the Gauge
    * @returns {any}
    */
  def getCustomLabelValue(scaleIndex: Double, customLabelIndex: Double): Any = js.native
  
  /** To get LabelAngle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} labelIndex value for the Gauge
    * @returns {any}
    */
  def getLabelAngle(scaleIndex: Double, labelIndex: Double): Any = js.native
  
  /** To get LabelDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} labelIndex value for the Gauge
    * @returns {any}
    */
  def getLabelDistanceFromScale(scaleIndex: Double, labelIndex: Double): Any = js.native
  
  /** To get LabelPlacement
    * @param {number} scaleIndex value for the Gauge
    * @param {number} labelIndex value for the Gauge
    * @returns {any}
    */
  def getLabelPlacement(scaleIndex: Double, labelIndex: Double): Any = js.native
  
  /** To get LabelStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} labelIndex value for the Gauge
    * @returns {any}
    */
  def getLabelStyle(scaleIndex: Double, labelIndex: Double): Any = js.native
  
  /** To get MajorIntervalValue
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMajorIntervalValue(scaleIndex: Double): Any = js.native
  
  /** To get MarkerDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getMarkerDistanceFromScale(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get MarkerStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getMarkerStyle(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get MaximumValue
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMaximumValue(scaleIndex: Double): Any = js.native
  
  /** To get MinimumValue
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMinimumValue(scaleIndex: Double): Any = js.native
  
  /** To get MinorIntervalValue
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getMinorIntervalValue(scaleIndex: Double): Any = js.native
  
  /** To get NeedleStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getNeedleStyle(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get PointerCapBorderWidth
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getPointerCapBorderWidth(scaleIndex: Double): Any = js.native
  
  /** To get PointerCapRadius
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getPointerCapRadius(scaleIndex: Double): Any = js.native
  
  /** To get PointerLength
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerLength(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get PointerNeedleType
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerNeedleType(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get PointerPlacement
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerPlacement(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get PointerValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerValue(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get PointerWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} pointerIndex value for the Gauge
    * @returns {any}
    */
  def getPointerWidth(scaleIndex: Double, pointerIndex: Double): Any = js.native
  
  /** To get RangeBorderWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeBorderWidth(scaleIndex: Double, rangeIndex: Double): Any = js.native
  
  /** To get RangeDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeDistanceFromScale(scaleIndex: Double, rangeIndex: Double): Any = js.native
  
  /** To get RangeEndValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeEndValue(scaleIndex: Double, rangeIndex: Double): Any = js.native
  
  /** To get RangePosition
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangePosition(scaleIndex: Double, rangeIndex: Double): Any = js.native
  
  /** To get RangeSize
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeSize(scaleIndex: Double, rangeIndex: Double): Any = js.native
  
  /** To get RangeStartValue
    * @param {number} scaleIndex value for the Gauge
    * @param {number} rangeIndex value for the Gauge
    * @returns {any}
    */
  def getRangeStartValue(scaleIndex: Double, rangeIndex: Double): Any = js.native
  
  /** To get ScaleBarSize
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleBarSize(scaleIndex: Double): Any = js.native
  
  /** To get ScaleBorderWidth
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleBorderWidth(scaleIndex: Double): Any = js.native
  
  /** To get ScaleDirection
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleDirection(scaleIndex: Double): Any = js.native
  
  /** To get ScaleRadius
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getScaleRadius(scaleIndex: Double): Any = js.native
  
  /** To get StartAngle
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getStartAngle(scaleIndex: Double): Any = js.native
  
  /** To get SubGaugeLocation
    * @param {number} scaleIndex value for the Gauge
    * @param {number} GaugeIndex value for the Gauge
    * @returns {any}
    */
  def getSubGaugeLocation(scaleIndex: Double, GaugeIndex: Double): Any = js.native
  
  /** To get SweepAngle
    * @param {number} scaleIndex value for the Gauge
    * @returns {any}
    */
  def getSweepAngle(scaleIndex: Double): Any = js.native
  
  /** To get TickAngle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} tickIndex value for the Gauge
    * @returns {any}
    */
  def getTickAngle(scaleIndex: Double, tickIndex: Double): Any = js.native
  
  /** To get TickDistanceFromScale
    * @param {number} scaleIndex value for the Gauge
    * @param {number} tickIndex value for the Gauge
    * @returns {any}
    */
  def getTickDistanceFromScale(scaleIndex: Double, tickIndex: Double): Any = js.native
  
  /** To get TickHeight
    * @param {number} scaleIndex value for the Gauge
    * @param {number} labelIndex value for the Gauge
    * @returns {any}
    */
  def getTickHeight(scaleIndex: Double, labelIndex: Double): Any = js.native
  
  /** To get TickPlacement
    * @param {number} scaleIndex value for the Gauge
    * @param {number} tickIndex value for the Gauge
    * @returns {any}
    */
  def getTickPlacement(scaleIndex: Double, tickIndex: Double): Any = js.native
  
  /** To get TickStyle
    * @param {number} scaleIndex value for the Gauge
    * @param {number} tickIndex value for the Gauge
    * @returns {any}
    */
  def getTickStyle(scaleIndex: Double, tickIndex: Double): Any = js.native
  
  /** To get TickWidth
    * @param {number} scaleIndex value for the Gauge
    * @param {number} tickIndex value for the Gauge
    * @returns {any}
    */
  def getTickWidth(scaleIndex: Double, tickIndex: Double): Any = js.native
  
  /** To set includeFirstValue
    * @param {number} scaleIndex value for the gauge
    * @param {number} labelIndex value for the gauge
    * @param {number} value for the gauge
    * @returns {void}
    */
  def includeFirstValue(scaleIndex: Double, labelIndex: Double, value: Double): Unit = js.native
  
  @JSName("model")
  var model_CircularGauge: Model = js.native
  
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
object CircularGauge {
  
  @js.native
  sealed trait CustomLabelPositionType extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.CustomLabelPositionType")
  @js.native
  object CustomLabelPositionType extends StObject {
    
    //string
    @js.native
    sealed trait Inner
      extends StObject
         with CustomLabelPositionType
    
    //string
    @js.native
    sealed trait Outer
      extends StObject
         with CustomLabelPositionType
  }
  
  @js.native
  sealed trait Direction extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.Direction")
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
  @JSGlobal("ej.datavisualization.CircularGauge.ExportingMode")
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
  @JSGlobal("ej.datavisualization.CircularGauge.ExportingType")
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
  sealed trait FrameType extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.FrameType")
  @js.native
  object FrameType extends StObject {
    
    //string
    @js.native
    sealed trait FullCircle
      extends StObject
         with FrameType
    
    //string
    @js.native
    sealed trait HalfCircle
      extends StObject
         with FrameType
  }
  
  @js.native
  sealed trait IndicatorTypes extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.IndicatorTypes")
  @js.native
  object IndicatorTypes extends StObject {
    
    //string
    @js.native
    sealed trait Circle
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Cross
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Diamond
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Downarrow
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait HorizontalLine
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Image
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait InvertedTriangle
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Leftarrow
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Pentagon
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Rectangle
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Rightarrow
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait RoundedRectangle
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Star
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Text
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Trapezoid
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Triangle
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Uparrow
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Verticalline
      extends StObject
         with IndicatorTypes
    
    //string
    @js.native
    sealed trait Wedge
      extends StObject
         with IndicatorTypes
  }
  
  @js.native
  sealed trait LabelType extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.LabelType")
  @js.native
  object LabelType extends StObject {
    
    //string
    @js.native
    sealed trait Major
      extends StObject
         with LabelType
    
    //string
    @js.native
    sealed trait Minor
      extends StObject
         with LabelType
  }
  
  @js.native
  sealed trait LegendAlignment extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.LegendAlignment")
  @js.native
  object LegendAlignment extends StObject {
    
    //string
    @js.native
    sealed trait Center
      extends StObject
         with LegendAlignment
    
    //string
    @js.native
    sealed trait Far
      extends StObject
         with LegendAlignment
    
    //string
    @js.native
    sealed trait Near
      extends StObject
         with LegendAlignment
  }
  
  @js.native
  sealed trait LegendPosition extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.LegendPosition")
  @js.native
  object LegendPosition extends StObject {
    
    //string
    @js.native
    sealed trait Bottom
      extends StObject
         with LegendPosition
    
    //string
    @js.native
    sealed trait Left
      extends StObject
         with LegendPosition
    
    //string
    @js.native
    sealed trait Right
      extends StObject
         with LegendPosition
    
    //string
    @js.native
    sealed trait Top
      extends StObject
         with LegendPosition
  }
  
  @js.native
  sealed trait LegendShape extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.LegendShape")
  @js.native
  object LegendShape extends StObject {
    
    //string
    @js.native
    sealed trait Circle
      extends StObject
         with LegendShape
    
    //string
    @js.native
    sealed trait Diamond
      extends StObject
         with LegendShape
    
    //string
    @js.native
    sealed trait Ellipse
      extends StObject
         with LegendShape
    
    //string
    @js.native
    sealed trait Line
      extends StObject
         with LegendShape
    
    //string
    @js.native
    sealed trait Pentagon
      extends StObject
         with LegendShape
    
    //string
    @js.native
    sealed trait Rectangle
      extends StObject
         with LegendShape
    
    //string
    @js.native
    sealed trait Slider
      extends StObject
         with LegendShape
    
    //string
    @js.native
    sealed trait Trapezoid
      extends StObject
         with LegendShape
    
    //string
    @js.native
    sealed trait Triangle
      extends StObject
         with LegendShape
  }
  
  @js.native
  sealed trait MarkerType extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.MarkerType")
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
    sealed trait Image
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
  sealed trait NeedleType extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.NeedleType")
  @js.native
  object NeedleType extends StObject {
    
    //string
    @js.native
    sealed trait Arrow
      extends StObject
         with NeedleType
    
    //string
    @js.native
    sealed trait Image
      extends StObject
         with NeedleType
    
    //string
    @js.native
    sealed trait Rectangle
      extends StObject
         with NeedleType
    
    //string
    @js.native
    sealed trait Trapezoid
      extends StObject
         with NeedleType
    
    //string
    @js.native
    sealed trait Triangle
      extends StObject
         with NeedleType
  }
  
  @js.native
  sealed trait OuterCustomLabelPosition extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.OuterCustomLabelPosition")
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
  sealed trait Placement extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.Placement")
  @js.native
  object Placement extends StObject {
    
    //string
    @js.native
    sealed trait Far
      extends StObject
         with Placement
    
    //string
    @js.native
    sealed trait Near
      extends StObject
         with Placement
  }
  
  @js.native
  sealed trait PointerType extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.PointerType")
  @js.native
  object PointerType extends StObject {
    
    //string
    @js.native
    sealed trait Marker
      extends StObject
         with PointerType
    
    //string
    @js.native
    sealed trait Needle
      extends StObject
         with PointerType
  }
  
  @js.native
  sealed trait RangeZOrderPlacement extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.RangeZOrderPlacement")
  @js.native
  object RangeZOrderPlacement extends StObject {
    
    //string
    @js.native
    sealed trait Front
      extends StObject
         with RangeZOrderPlacement
    
    //string
    @js.native
    sealed trait Rear
      extends StObject
         with RangeZOrderPlacement
  }
  
  @js.native
  sealed trait UnitTextPlacement extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.UnitTextPlacement")
  @js.native
  object UnitTextPlacement extends StObject {
    
    //string
    @js.native
    sealed trait Back
      extends StObject
         with UnitTextPlacement
    
    //string
    @js.native
    sealed trait Front
      extends StObject
         with UnitTextPlacement
  }
  
  @js.native
  sealed trait gaugePosition extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.gaugePosition")
  @js.native
  object gaugePosition extends StObject {
    
    //string
    @js.native
    sealed trait BottomCenter
      extends StObject
         with gaugePosition
    
    //string
    @js.native
    sealed trait BottomLeft
      extends StObject
         with gaugePosition
    
    //string
    @js.native
    sealed trait BottomRight
      extends StObject
         with gaugePosition
    
    //string
    @js.native
    sealed trait Center
      extends StObject
         with gaugePosition
    
    //string
    @js.native
    sealed trait MiddleLeft
      extends StObject
         with gaugePosition
    
    //string
    @js.native
    sealed trait MiddleRight
      extends StObject
         with gaugePosition
    
    //string
    @js.native
    sealed trait TopCenter
      extends StObject
         with gaugePosition
    
    //string
    @js.native
    sealed trait TopLeft
      extends StObject
         with gaugePosition
    
    //string
    @js.native
    sealed trait TopRight
      extends StObject
         with gaugePosition
  }
  
  trait DoubleClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the points with respect to circular gauge area.id - ID of the target element.    size - Width and height of the circular gauge.    pageX -
      * x-coordinate of the pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the circular gauge model object
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
  
  trait DrawCustomLabelEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the current custom label element.
      */
    var customLabelElement: js.UndefOr[Any] = js.undefined
    
    /** returns the index of the custom label.
      */
    var customLabelIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the gauge model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the startX and startY of the custom label
      */
    var position: js.UndefOr[Any] = js.undefined
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[Any] = js.undefined
    
    /** returns the scaleIndex to which the custom label belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the custom label style
      */
    var style: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
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
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DrawIndicatorsEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the current indicator element.
      */
    var indicatorElement: js.UndefOr[Any] = js.undefined
    
    /** returns the index of the indicator.
      */
    var indicatorIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the gauge model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the startX and startY of the indicator
      */
    var position: js.UndefOr[Any] = js.undefined
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[Any] = js.undefined
    
    /** returns the scaleIndex to which the indicator belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the indicator style
      */
    var style: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
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
      
      inline def setIndicatorElement(value: Any): Self = StObject.set(x, "indicatorElement", value.asInstanceOf[js.Any])
      
      inline def setIndicatorElementUndefined: Self = StObject.set(x, "indicatorElement", js.undefined)
      
      inline def setIndicatorIndex(value: Double): Self = StObject.set(x, "indicatorIndex", value.asInstanceOf[js.Any])
      
      inline def setIndicatorIndexUndefined: Self = StObject.set(x, "indicatorIndex", js.undefined)
      
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
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DrawLabelsEventArgs extends StObject {
    
    /** returns the angle of the labels.
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
    
    /** returns the gauge model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the value of the label.
      */
    var pointerValue: js.UndefOr[Double] = js.undefined
    
    /** returns the startX and startY of the labels
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
    var `type`: js.UndefOr[String] = js.undefined
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
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
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
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DrawPointerCapEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the gauge model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the startX and startY of the pointer cap.
      */
    var position: js.UndefOr[Any] = js.undefined
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[Any] = js.undefined
    
    /** returns the pointer cap style
      */
    var style: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DrawPointerCapEventArgs {
    
    inline def apply(): DrawPointerCapEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawPointerCapEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawPointerCapEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScaleElement(value: Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DrawPointersEventArgs extends StObject {
    
    /** returns the angle of the pointer.
      */
    var angle: js.UndefOr[Double] = js.undefined
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the current pointer element.
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** returns the index of the pointer.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** returns the gauge model
      */
    var model: js.UndefOr[Any] = js.undefined
    
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
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the value of the pointer.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object DrawPointersEventArgs {
    
    inline def apply(): DrawPointersEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawPointersEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawPointersEventArgs] (val x: Self) extends AnyVal {
      
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
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DrawRangeEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the gauge model
      */
    var model: js.UndefOr[Any] = js.undefined
    
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
    
    /** returns the scaleIndex to which the range belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the range style
      */
    var style: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
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
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
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
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DrawTicksEventArgs extends StObject {
    
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
    
    /** returns the gauge model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the label value of the tick.
      */
    var pointerValue: js.UndefOr[Double] = js.undefined
    
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
    var `type`: js.UndefOr[String] = js.undefined
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
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
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
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ExportSettings extends StObject {
    
    /** Specifies the name of the action URL
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** Specifies the downloading filename
      * @default {CircularGauge}
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /** Specifies the mode of exporting
      * @default {client}
      */
    var mode: js.UndefOr[ExportingMode | String] = js.undefined
    
    /** Specifies the format of the file to export
      * @default {png}
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
    
    /** Specify the URL of the frame background image for circular gauge
      * @default {null}
      */
    var backgroundImageUrl: js.UndefOr[String] = js.undefined
    
    /** Specifies the frameType of circular gauge. See
      * @default {FullCircle}
      */
    var frameType: js.UndefOr[FrameType | String] = js.undefined
    
    /** Specifies the end angle for the half circular frame.
      * @default {360}
      */
    var halfCircleFrameEndAngle: js.UndefOr[Double] = js.undefined
    
    /** Specifies the start angle for the half circular frame.
      * @default {180}
      */
    var halfCircleFrameStartAngle: js.UndefOr[Double] = js.undefined
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
      
      inline def setFrameType(value: FrameType | String): Self = StObject.set(x, "frameType", value.asInstanceOf[js.Any])
      
      inline def setFrameTypeUndefined: Self = StObject.set(x, "frameType", js.undefined)
      
      inline def setHalfCircleFrameEndAngle(value: Double): Self = StObject.set(x, "halfCircleFrameEndAngle", value.asInstanceOf[js.Any])
      
      inline def setHalfCircleFrameEndAngleUndefined: Self = StObject.set(x, "halfCircleFrameEndAngle", js.undefined)
      
      inline def setHalfCircleFrameStartAngle(value: Double): Self = StObject.set(x, "halfCircleFrameStartAngle", value.asInstanceOf[js.Any])
      
      inline def setHalfCircleFrameStartAngleUndefined: Self = StObject.set(x, "halfCircleFrameStartAngle", js.undefined)
    }
  }
  
  trait Legend extends StObject {
    
    /** Specifies the alignment of the legend.
      * @default {Center. See Alignment}
      */
    var alignment: js.UndefOr[LegendAlignment | String] = js.undefined
    
    /** Options for customizing the legend border.
      */
    var border: js.UndefOr[LegendBorder] = js.undefined
    
    /** Fill color for the legend items. By using this property, it displays all legend item shapes in same color.Legend items representing invisible ranges is displayed in gray color.
      * @default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Options to customize the font used for legend item text.
      */
    var font: js.UndefOr[LegendFont] = js.undefined
    
    /** Gap or padding between the legend items.
      * @default {20}
      */
    var itemPadding: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the style of legend items.
      */
    var itemStyle: js.UndefOr[LegendItemStyle] = js.undefined
    
    /** Opacity of the legend.
      * @default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Places the legend at specified position. Legend can be placed at **left**, **right**, **top** or **bottom** of the circular gauge.
      * @default {Bottom. See Position}
      */
    var position: js.UndefOr[LegendPosition | String] = js.undefined
    
    /** Shape of the legend items.
      * @default {Circle. See Shape}
      */
    var shape: js.UndefOr[LegendShape | String] = js.undefined
    
    /** Options to customize the size of the legend.
      */
    var size: js.UndefOr[LegendSize] = js.undefined
    
    /** Toggles the visibility of the ranges.
      * @default {true}
      */
    var toggleVisibility: js.UndefOr[Boolean] = js.undefined
    
    /** Toggles the visibility of the legend.
      * @default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object Legend {
    
    inline def apply(): Legend = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Legend]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Legend] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: LegendAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setBorder(value: LegendBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: LegendFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setItemPadding(value: Double): Self = StObject.set(x, "itemPadding", value.asInstanceOf[js.Any])
      
      inline def setItemPaddingUndefined: Self = StObject.set(x, "itemPadding", js.undefined)
      
      inline def setItemStyle(value: LegendItemStyle): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPosition(value: LegendPosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShape(value: LegendShape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: LegendSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setToggleVisibility(value: Boolean): Self = StObject.set(x, "toggleVisibility", value.asInstanceOf[js.Any])
      
      inline def setToggleVisibilityUndefined: Self = StObject.set(x, "toggleVisibility", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait LegendBorder extends StObject {
    
    /** Border color of the legend.
      * @default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the legend.
      * @default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object LegendBorder {
    
    inline def apply(): LegendBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LegendFont extends StObject {
    
    /** Font color of the text for legend items.
      * @default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Font family for legend item text.
      * @default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style for legend item text.
      * @default {Normal}
      */
    var fontStyle: js.UndefOr[String] = js.undefined
    
    /** Font weight for legend item text.
      * @default {Regular}
      */
    var fontWeight: js.UndefOr[String] = js.undefined
    
    /** Font size for legend item text.
      * @default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object LegendFont {
    
    inline def apply(): LegendFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendFont] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait LegendItemClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the legend item object that is about to be rendered
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the circulargauge model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LegendItemClickEventArgs {
    
    inline def apply(): LegendItemClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendItemClickEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait LegendItemRenderEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the legend item object that is about to be rendered
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the circulargauge model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LegendItemRenderEventArgs {
    
    inline def apply(): LegendItemRenderEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemRenderEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendItemRenderEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait LegendItemStyle extends StObject {
    
    /** Options for customizing the border of legend items.
      */
    var border: js.UndefOr[LegendItemStyleBorder] = js.undefined
    
    /** Specifies the height of the  legend item shapes.
      * @default {10}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Specifies the width of the  legend item shapes.
      * @default {10}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object LegendItemStyle {
    
    inline def apply(): LegendItemStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendItemStyle] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: LegendItemStyleBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LegendItemStyleBorder extends StObject {
    
    /** Border color of the legend items.
      * @default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the legend items.
      * @default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object LegendItemStyleBorder {
    
    inline def apply(): LegendItemStyleBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemStyleBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendItemStyleBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LegendSize extends StObject {
    
    /** Specify the height of the legend. Height can be specified in pixel.
      * @default {null}
      */
    var height: js.UndefOr[String] = js.undefined
    
    /** Specify the width of the legend. Width can be specified in pixel.
      * @default {null}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object LegendSize {
    
    inline def apply(): LegendSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
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
    var `type`: js.UndefOr[String] = js.undefined
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
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Specifies animationSpeed of circular gauge
      * @default {500}
      */
    var animationSpeed: js.UndefOr[Double] = js.undefined
    
    /** Specifies the background color of circular gauge.
      * @default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specify distanceFromCorner value of circular gauge
      * @default {center}
      */
    var distanceFromCorner: js.UndefOr[Double] = js.undefined
    
    /** Fires, on double clicking the circular gauge.
      */
    var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
    
    /** Triggers while the custom labels are being drawn on the gauge.
      */
    var drawCustomLabel: js.UndefOr[js.Function1[/* e */ DrawCustomLabelEventArgs, Unit]] = js.undefined
    
    /** Triggers while the indicators are being started to drawn on the gauge.
      */
    var drawIndicators: js.UndefOr[js.Function1[/* e */ DrawIndicatorsEventArgs, Unit]] = js.undefined
    
    /** Triggers while the labels are being drawn on the gauge.
      */
    var drawLabels: js.UndefOr[js.Function1[/* e */ DrawLabelsEventArgs, Unit]] = js.undefined
    
    /** Triggers while the pointer cap is being drawn on the gauge.
      */
    var drawPointerCap: js.UndefOr[js.Function1[/* e */ DrawPointerCapEventArgs, Unit]] = js.undefined
    
    /** Triggers while the pointers are being drawn on the gauge.
      */
    var drawPointers: js.UndefOr[js.Function1[/* e */ DrawPointersEventArgs, Unit]] = js.undefined
    
    /** Triggers when the ranges begin to be getting drawn on the gauge.
      */
    var drawRange: js.UndefOr[js.Function1[/* e */ DrawRangeEventArgs, Unit]] = js.undefined
    
    /** Triggers while the ticks are being drawn on the gauge.
      */
    var drawTicks: js.UndefOr[js.Function1[/* e */ DrawTicksEventArgs, Unit]] = js.undefined
    
    /** Specify animate value of circular gauge
      * @default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Specify to convert the  date object to  string, using locale settings.
      * @default {false}
      */
    var enableGroupSeparator: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether circular gauge has to be responsive while resizing.
      * @default {false}
      */
    var enableResize: js.UndefOr[Boolean] = js.undefined
    
    /** This provides options for customizing export settings
      */
    var exportSettings: js.UndefOr[ExportSettings] = js.undefined
    
    /** Specify the frame of circular gauge
      * @default {Object}
      */
    var frame: js.UndefOr[Frame] = js.undefined
    
    /** Specify gaugePosition value of circular gauge See GaugePosition
      * @default {center}
      */
    var gaugePosition: js.UndefOr[typings.ejWebAll.ej.datavisualization.CircularGauge.gaugePosition | String] = js.undefined
    
    /** Specifies the height of circular gauge.
      * @default {360}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Specifies the interiorGradient of circular gauge.
      * @default {null}
      */
    var interiorGradient: js.UndefOr[Any] = js.undefined
    
    /** Specify isRadialGradient value of circular gauge
      * @default {false}
      */
    var isRadialGradient: js.UndefOr[Boolean] = js.undefined
    
    /** Specify isResponsive value of circular gauge
      * @default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Options to customize the legend.
      */
    var legend: js.UndefOr[Legend] = js.undefined
    
    /** Fires on clicking the legend item.
      */
    var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, Unit]] = js.undefined
    
    /** Fires before rendering the legend item. This event is fired for each legend item in CircularGauge. You can use this event to customize legend item shape or add custom text to
      * legend item.
      */
    var legendItemRender: js.UndefOr[js.Function1[/* e */ LegendItemRenderEventArgs, Unit]] = js.undefined
    
    /** Triggers while the gauge start to Load.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Name of the culture based on which circular gauge should be localized.
      * @default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Specifies the maximum value of circular gauge.
      * @default {100}
      */
    var maximum: js.UndefOr[Double] = js.undefined
    
    /** Specifies the minimum value of circular gauge.
      * @default {0}
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
    
    /** Specify outerCustomLabelPosition value of circular gauge See
      * @default {bottom}
      */
    var outerCustomLabelPosition: js.UndefOr[OuterCustomLabelPosition | String] = js.undefined
    
    /** Specifies the radius of circular gauge.
      * @default {180}
      */
    var radius: js.UndefOr[Double] = js.undefined
    
    /** Fires when mouse moving on ranges.
      */
    var rangeMouseMove: js.UndefOr[js.Function1[/* e */ RangeMouseMoveEventArgs, Unit]] = js.undefined
    
    /** Specify range Z-order placement of circular gauge.
      * @default {Rear}
      */
    var rangeZOrder: js.UndefOr[RangeZOrderPlacement | String] = js.undefined
    
    /** Specify readonly value of circular gauge
      * @default {true}
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Triggers when the rendering of the gauge is completed.
      */
    var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.undefined
    
    /** Fires, on right clicking the circular gauge.
      */
    var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
    
    /** Specify the pointers, ticks, labels, indicators, ranges of circular gauge
      * @default {null}
      */
    var scales: js.UndefOr[js.Array[Scale]] = js.undefined
    
    /** Specify the theme of circular gauge.
      * @default {flatlight}
      */
    var theme: js.UndefOr[String] = js.undefined
    
    /** Specify tooltip option of circular gauge
      * @default {object}
      */
    var tooltip: js.UndefOr[Tooltip] = js.undefined
    
    /** Specifies the value of circular gauge.
      * @default {0}
      */
    var value: js.UndefOr[Double] = js.undefined
    
    /** Specifies the width of circular gauge.
      * @default {360}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.datavisualization.CircularGauge.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.CircularGauge.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.CircularGauge.Model] (val x: Self) extends AnyVal {
      
      inline def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      inline def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setDistanceFromCorner(value: Double): Self = StObject.set(x, "distanceFromCorner", value.asInstanceOf[js.Any])
      
      inline def setDistanceFromCornerUndefined: Self = StObject.set(x, "distanceFromCorner", js.undefined)
      
      inline def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
      
      inline def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
      
      inline def setDrawCustomLabel(value: /* e */ DrawCustomLabelEventArgs => Unit): Self = StObject.set(x, "drawCustomLabel", js.Any.fromFunction1(value))
      
      inline def setDrawCustomLabelUndefined: Self = StObject.set(x, "drawCustomLabel", js.undefined)
      
      inline def setDrawIndicators(value: /* e */ DrawIndicatorsEventArgs => Unit): Self = StObject.set(x, "drawIndicators", js.Any.fromFunction1(value))
      
      inline def setDrawIndicatorsUndefined: Self = StObject.set(x, "drawIndicators", js.undefined)
      
      inline def setDrawLabels(value: /* e */ DrawLabelsEventArgs => Unit): Self = StObject.set(x, "drawLabels", js.Any.fromFunction1(value))
      
      inline def setDrawLabelsUndefined: Self = StObject.set(x, "drawLabels", js.undefined)
      
      inline def setDrawPointerCap(value: /* e */ DrawPointerCapEventArgs => Unit): Self = StObject.set(x, "drawPointerCap", js.Any.fromFunction1(value))
      
      inline def setDrawPointerCapUndefined: Self = StObject.set(x, "drawPointerCap", js.undefined)
      
      inline def setDrawPointers(value: /* e */ DrawPointersEventArgs => Unit): Self = StObject.set(x, "drawPointers", js.Any.fromFunction1(value))
      
      inline def setDrawPointersUndefined: Self = StObject.set(x, "drawPointers", js.undefined)
      
      inline def setDrawRange(value: /* e */ DrawRangeEventArgs => Unit): Self = StObject.set(x, "drawRange", js.Any.fromFunction1(value))
      
      inline def setDrawRangeUndefined: Self = StObject.set(x, "drawRange", js.undefined)
      
      inline def setDrawTicks(value: /* e */ DrawTicksEventArgs => Unit): Self = StObject.set(x, "drawTicks", js.Any.fromFunction1(value))
      
      inline def setDrawTicksUndefined: Self = StObject.set(x, "drawTicks", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setEnableGroupSeparator(value: Boolean): Self = StObject.set(x, "enableGroupSeparator", value.asInstanceOf[js.Any])
      
      inline def setEnableGroupSeparatorUndefined: Self = StObject.set(x, "enableGroupSeparator", js.undefined)
      
      inline def setEnableResize(value: Boolean): Self = StObject.set(x, "enableResize", value.asInstanceOf[js.Any])
      
      inline def setEnableResizeUndefined: Self = StObject.set(x, "enableResize", js.undefined)
      
      inline def setExportSettings(value: ExportSettings): Self = StObject.set(x, "exportSettings", value.asInstanceOf[js.Any])
      
      inline def setExportSettingsUndefined: Self = StObject.set(x, "exportSettings", js.undefined)
      
      inline def setFrame(value: Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setGaugePosition(value: gaugePosition | String): Self = StObject.set(x, "gaugePosition", value.asInstanceOf[js.Any])
      
      inline def setGaugePositionUndefined: Self = StObject.set(x, "gaugePosition", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInteriorGradient(value: Any): Self = StObject.set(x, "interiorGradient", value.asInstanceOf[js.Any])
      
      inline def setInteriorGradientUndefined: Self = StObject.set(x, "interiorGradient", js.undefined)
      
      inline def setIsRadialGradient(value: Boolean): Self = StObject.set(x, "isRadialGradient", value.asInstanceOf[js.Any])
      
      inline def setIsRadialGradientUndefined: Self = StObject.set(x, "isRadialGradient", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setLegend(value: Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendItemClick(value: /* e */ LegendItemClickEventArgs => Unit): Self = StObject.set(x, "legendItemClick", js.Any.fromFunction1(value))
      
      inline def setLegendItemClickUndefined: Self = StObject.set(x, "legendItemClick", js.undefined)
      
      inline def setLegendItemRender(value: /* e */ LegendItemRenderEventArgs => Unit): Self = StObject.set(x, "legendItemRender", js.Any.fromFunction1(value))
      
      inline def setLegendItemRenderUndefined: Self = StObject.set(x, "legendItemRender", js.undefined)
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
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
      
      inline def setOuterCustomLabelPosition(value: OuterCustomLabelPosition | String): Self = StObject.set(x, "outerCustomLabelPosition", value.asInstanceOf[js.Any])
      
      inline def setOuterCustomLabelPositionUndefined: Self = StObject.set(x, "outerCustomLabelPosition", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRangeMouseMove(value: /* e */ RangeMouseMoveEventArgs => Unit): Self = StObject.set(x, "rangeMouseMove", js.Any.fromFunction1(value))
      
      inline def setRangeMouseMoveUndefined: Self = StObject.set(x, "rangeMouseMove", js.undefined)
      
      inline def setRangeZOrder(value: RangeZOrderPlacement | String): Self = StObject.set(x, "rangeZOrder", value.asInstanceOf[js.Any])
      
      inline def setRangeZOrderUndefined: Self = StObject.set(x, "rangeZOrder", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRenderComplete(value: /* e */ RenderCompleteEventArgs => Unit): Self = StObject.set(x, "renderComplete", js.Any.fromFunction1(value))
      
      inline def setRenderCompleteUndefined: Self = StObject.set(x, "renderComplete", js.undefined)
      
      inline def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = StObject.set(x, "rightClick", js.Any.fromFunction1(value))
      
      inline def setRightClickUndefined: Self = StObject.set(x, "rightClick", js.undefined)
      
      inline def setScales(value: js.Array[Scale]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      inline def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
      
      inline def setScalesVarargs(value: Scale*): Self = StObject.set(x, "scales", js.Array(value*))
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MouseClickEventArgs extends StObject {
    
    /** returns the angle of the pointer.
      */
    var angle: js.UndefOr[Double] = js.undefined
    
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
  object MouseClickEventArgs {
    
    inline def apply(): MouseClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseClickEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait MouseClickMoveEventArgs extends StObject {
    
    /** returns the angle of the pointer.
      */
    var angle: js.UndefOr[Double] = js.undefined
    
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
    
    /** returns the angle of the pointer.
      */
    var angle: js.UndefOr[Double] = js.undefined
    
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
  object MouseClickUpEventArgs {
    
    inline def apply(): MouseClickUpEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseClickUpEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseClickUpEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait RangeMouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Region of ranges
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the circulargauge model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RangeMouseMoveEventArgs {
    
    inline def apply(): RangeMouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeMouseMoveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RangeMouseMoveEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait RenderCompleteEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the gauge model
      */
    var model: js.UndefOr[Any] = js.undefined
    
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
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setScaleElement(value: Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RightClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the points with respect to circular gauge area.id - ID of the target element.    size - Width and height of the circular gauge.    pageX -
      * x-coordinate of the pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the circular gauge model object
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
    
    /** Specify backgroundColor for the scale of circular gauge
      * @default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specify border for scales of circular gauge
      * @default {Object}
      */
    var border: js.UndefOr[ScalesBorder] = js.undefined
    
    /** Specify the custom labels for the scales.
      * @default {Array}
      */
    var customLabels: js.UndefOr[js.Array[ScalesCustomLabel]] = js.undefined
    
    /** Specify scale direction of circular gauge. See
      * @default {Clockwise}
      */
    var direction: js.UndefOr[typings.ejWebAll.ej.Direction | String] = js.undefined
    
    /** Specify representing state of circular gauge
      * @default {Array}
      */
    var indicators: js.UndefOr[js.Array[ScalesIndicator]] = js.undefined
    
    /** Specify the text values displayed in a meaningful manner alongside the ticks of circular gauge
      * @default {Array}
      */
    var labels: js.UndefOr[js.Array[ScalesLabel]] = js.undefined
    
    /** Specify majorIntervalValue of circular gauge
      * @default {10}
      */
    var majorIntervalValue: js.UndefOr[Double] = js.undefined
    
    /** Specify maximum scale value of circular gauge
      * @default {null}
      */
    var maximum: js.UndefOr[Double] = js.undefined
    
    /** Specify minimum scale value of circular gauge
      * @default {null}
      */
    var minimum: js.UndefOr[Double] = js.undefined
    
    /** Specify minorIntervalValue of circular gauge
      * @default {2}
      */
    var minorIntervalValue: js.UndefOr[Double] = js.undefined
    
    /** Specify opacity value of circular gauge
      * @default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specify pointer cap of circular gauge
      * @default {Object}
      */
    var pointerCap: js.UndefOr[ScalesPointerCap] = js.undefined
    
    /** Specify pointers value of circular gauge
      * @default {Array}
      */
    var pointers: js.UndefOr[js.Array[ScalesPointer]] = js.undefined
    
    /** Specify scale radius of circular gauge
      * @default {170}
      */
    var radius: js.UndefOr[Double] = js.undefined
    
    /** Specify ranges value of circular gauge
      * @default {Array}
      */
    var ranges: js.UndefOr[js.Array[ScalesRange]] = js.undefined
    
    /** Specify shadowOffset value of circular gauge
      * @default {0}
      */
    var shadowOffset: js.UndefOr[Double] = js.undefined
    
    /** Specify showIndicators of circular gauge
      * @default {false}
      */
    var showIndicators: js.UndefOr[Boolean] = js.undefined
    
    /** Specify showLabels of circular gauge
      * @default {true}
      */
    var showLabels: js.UndefOr[Boolean] = js.undefined
    
    /** Specify showPointers of circular gauge
      * @default {true}
      */
    var showPointers: js.UndefOr[Boolean] = js.undefined
    
    /** Specify showRanges of circular gauge
      * @default {false}
      */
    var showRanges: js.UndefOr[Boolean] = js.undefined
    
    /** Specify showScaleBar of circular gauge
      * @default {false}
      */
    var showScaleBar: js.UndefOr[Boolean] = js.undefined
    
    /** Specify showTicks of circular gauge
      * @default {true}
      */
    var showTicks: js.UndefOr[Boolean] = js.undefined
    
    /** Specify scaleBar size of circular gauge
      * @default {6}
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Specify startAngle of circular gauge
      * @default {115}
      */
    var startAngle: js.UndefOr[Double] = js.undefined
    
    /** Specify subGauge of circular gauge
      * @default {Array}
      */
    var subGauges: js.UndefOr[js.Array[ScalesSubGauge]] = js.undefined
    
    /** Specify sweepAngle of circular gauge
      * @default {310}
      */
    var sweepAngle: js.UndefOr[Double] = js.undefined
    
    /** Specify ticks of circular gauge
      * @default {Array}
      */
    var ticks: js.UndefOr[js.Array[ScalesTick]] = js.undefined
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
      
      inline def setMajorIntervalValue(value: Double): Self = StObject.set(x, "majorIntervalValue", value.asInstanceOf[js.Any])
      
      inline def setMajorIntervalValueUndefined: Self = StObject.set(x, "majorIntervalValue", js.undefined)
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setMinorIntervalValue(value: Double): Self = StObject.set(x, "minorIntervalValue", value.asInstanceOf[js.Any])
      
      inline def setMinorIntervalValueUndefined: Self = StObject.set(x, "minorIntervalValue", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPointerCap(value: ScalesPointerCap): Self = StObject.set(x, "pointerCap", value.asInstanceOf[js.Any])
      
      inline def setPointerCapUndefined: Self = StObject.set(x, "pointerCap", js.undefined)
      
      inline def setPointers(value: js.Array[ScalesPointer]): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
      
      inline def setPointersUndefined: Self = StObject.set(x, "pointers", js.undefined)
      
      inline def setPointersVarargs(value: ScalesPointer*): Self = StObject.set(x, "pointers", js.Array(value*))
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRanges(value: js.Array[ScalesRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setRangesVarargs(value: ScalesRange*): Self = StObject.set(x, "ranges", js.Array(value*))
      
      inline def setShadowOffset(value: Double): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
      
      inline def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
      
      inline def setShowIndicators(value: Boolean): Self = StObject.set(x, "showIndicators", value.asInstanceOf[js.Any])
      
      inline def setShowIndicatorsUndefined: Self = StObject.set(x, "showIndicators", js.undefined)
      
      inline def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
      
      inline def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
      
      inline def setShowPointers(value: Boolean): Self = StObject.set(x, "showPointers", value.asInstanceOf[js.Any])
      
      inline def setShowPointersUndefined: Self = StObject.set(x, "showPointers", js.undefined)
      
      inline def setShowRanges(value: Boolean): Self = StObject.set(x, "showRanges", value.asInstanceOf[js.Any])
      
      inline def setShowRangesUndefined: Self = StObject.set(x, "showRanges", js.undefined)
      
      inline def setShowScaleBar(value: Boolean): Self = StObject.set(x, "showScaleBar", value.asInstanceOf[js.Any])
      
      inline def setShowScaleBarUndefined: Self = StObject.set(x, "showScaleBar", js.undefined)
      
      inline def setShowTicks(value: Boolean): Self = StObject.set(x, "showTicks", value.asInstanceOf[js.Any])
      
      inline def setShowTicksUndefined: Self = StObject.set(x, "showTicks", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setSubGauges(value: js.Array[ScalesSubGauge]): Self = StObject.set(x, "subGauges", value.asInstanceOf[js.Any])
      
      inline def setSubGaugesUndefined: Self = StObject.set(x, "subGauges", js.undefined)
      
      inline def setSubGaugesVarargs(value: ScalesSubGauge*): Self = StObject.set(x, "subGauges", js.Array(value*))
      
      inline def setSweepAngle(value: Double): Self = StObject.set(x, "sweepAngle", value.asInstanceOf[js.Any])
      
      inline def setSweepAngleUndefined: Self = StObject.set(x, "sweepAngle", js.undefined)
      
      inline def setTicks(value: js.Array[ScalesTick]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTicksVarargs(value: ScalesTick*): Self = StObject.set(x, "ticks", js.Array(value*))
    }
  }
  
  trait ScalesBorder extends StObject {
    
    /** Specify border color for scales of circular gauge
      * @default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specify border width of circular gauge
      * @default {1.5}
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
    
    /** Color of the custom labels.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specify font for custom labels
      * @default {Object}
      */
    var font: js.UndefOr[ScalesCustomLabelsFont] = js.undefined
    
    /** Specify position of custom labels
      * @default {Object}
      */
    var position: js.UndefOr[ScalesCustomLabelsPosition] = js.undefined
    
    /** Specifies the position of the  custom labels. See
      * @default {inner}
      */
    var positionType: js.UndefOr[CustomLabelPositionType | String] = js.undefined
    
    /** Specify angle for the rotation of the custom labels in degrees.
      * @default {0}
      */
    var textAngle: js.UndefOr[Double] = js.undefined
    
    /** Value of the custom labels.
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
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFont(value: ScalesCustomLabelsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setPosition(value: ScalesCustomLabelsPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionType(value: CustomLabelPositionType | String): Self = StObject.set(x, "positionType", value.asInstanceOf[js.Any])
      
      inline def setPositionTypeUndefined: Self = StObject.set(x, "positionType", js.undefined)
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTextAngle(value: Double): Self = StObject.set(x, "textAngle", value.asInstanceOf[js.Any])
      
      inline def setTextAngleUndefined: Self = StObject.set(x, "textAngle", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ScalesCustomLabelsFont extends StObject {
    
    /** Specify font fontFamily for custom labels.
      * @default {Arial}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specify font Style for custom labels.
      * @default {Bold}
      */
    var fontStyle: js.UndefOr[String] = js.undefined
    
    /** Specify font size for custom labels.
      * @default {12px}
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
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ScalesCustomLabelsPosition extends StObject {
    
    /** Specify x-axis position of label
      * @default {0}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Specify y-axis  position of labels.
      * @default {0}
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
    
    /** Specify indicator height of circular gauge
      * @default {15}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Specify imageUrl of circular gauge
      * @default {null}
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** Specify position of circular gauge
      * @default {Object}
      */
    var position: js.UndefOr[ScalesIndicatorsPosition] = js.undefined
    
    /** Specify the various states of circular gauge
      * @default {Array}
      */
    var stateRanges: js.UndefOr[js.Array[ScalesIndicatorsStateRange]] = js.undefined
    
    /** Specify indicator style of circular gauge. See
      * @default {Circle}
      */
    var `type`: js.UndefOr[IndicatorTypes | String] = js.undefined
    
    /** Specify indicator width of circular gauge
      * @default {15}
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
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setPosition(value: ScalesIndicatorsPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStateRanges(value: js.Array[ScalesIndicatorsStateRange]): Self = StObject.set(x, "stateRanges", value.asInstanceOf[js.Any])
      
      inline def setStateRangesUndefined: Self = StObject.set(x, "stateRanges", js.undefined)
      
      inline def setStateRangesVarargs(value: ScalesIndicatorsStateRange*): Self = StObject.set(x, "stateRanges", js.Array(value*))
      
      inline def setType(value: IndicatorTypes | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ScalesIndicatorsPosition extends StObject {
    
    /** Specify x-axis of position of circular gauge
      * @default {0}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Specify y-axis of position of circular gauge
      * @default {0}
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
    
    /** Specify backgroundColor for indicator of circular gauge
      * @default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specify borderColor for indicator of circular gauge
      * @default {null}
      */
    var borderColor: js.UndefOr[String] = js.undefined
    
    /** Specify end value for each specified state of circular gauge
      * @default {0}
      */
    var endValue: js.UndefOr[Double] = js.undefined
    
    /** Specify value of the font as the indicator when the indicator style is set with the value &quot;text&quot; of circular gauge
      * @default {null}
      */
    var font: js.UndefOr[Any] = js.undefined
    
    /** Specify start value for each specified state of circular gauge
      * @default {0}
      */
    var startValue: js.UndefOr[Double] = js.undefined
    
    /** Specify value of the text as the indicator when the indicator style is set with the value &quot;text&quot; of circular gauge
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specify value of the textColor as the indicator when the indicator style is set with the value &quot;text&quot; of circular gauge
      * @default {null}
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
      
      inline def setFont(value: Any): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait ScalesLabel extends StObject {
    
    /** Specify the angle for the labels of circular gauge
      * @default {0}
      */
    var angle: js.UndefOr[Double] = js.undefined
    
    /** Specify labels autoAngle value of circular gauge
      * @default {false}
      */
    var autoAngle: js.UndefOr[Boolean] = js.undefined
    
    /** Specify label color of circular gauge
      * @default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specify distanceFromScale value for labels of circular gauge
      * @default {0}
      */
    var distanceFromScale: js.UndefOr[Double] = js.undefined
    
    /** Specify font for labels of circular gauge
      * @default {Object}
      */
    var font: js.UndefOr[ScalesLabelsFont] = js.undefined
    
    /** Specify includeFirstValue of circular gauge
      * @default {true}
      */
    var includeFirstValue: js.UndefOr[Boolean] = js.undefined
    
    /** Specify opacity value for labels of circular gauge
      * @default {null}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specify label placement of circular gauge. See
      * @default {Near}
      */
    var placement: js.UndefOr[Placement | String] = js.undefined
    
    /** Specify label Style of circular gauge. See
      * @default {Major}
      */
    var `type`: js.UndefOr[LabelType | String] = js.undefined
    
    /** Specify unitText of circular gauge
      */
    var unitText: js.UndefOr[String] = js.undefined
    
    /** Specify unitTextPosition of circular gauge. See UnitTextPosition
      * @default {Back}
      */
    var unitTextPosition: js.UndefOr[UnitTextPlacement | String] = js.undefined
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
      
      inline def setAutoAngle(value: Boolean): Self = StObject.set(x, "autoAngle", value.asInstanceOf[js.Any])
      
      inline def setAutoAngleUndefined: Self = StObject.set(x, "autoAngle", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDistanceFromScale(value: Double): Self = StObject.set(x, "distanceFromScale", value.asInstanceOf[js.Any])
      
      inline def setDistanceFromScaleUndefined: Self = StObject.set(x, "distanceFromScale", js.undefined)
      
      inline def setFont(value: ScalesLabelsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setIncludeFirstValue(value: Boolean): Self = StObject.set(x, "includeFirstValue", value.asInstanceOf[js.Any])
      
      inline def setIncludeFirstValueUndefined: Self = StObject.set(x, "includeFirstValue", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPlacement(value: Placement | String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setType(value: LabelType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnitText(value: String): Self = StObject.set(x, "unitText", value.asInstanceOf[js.Any])
      
      inline def setUnitTextPosition(value: UnitTextPlacement | String): Self = StObject.set(x, "unitTextPosition", value.asInstanceOf[js.Any])
      
      inline def setUnitTextPositionUndefined: Self = StObject.set(x, "unitTextPosition", js.undefined)
      
      inline def setUnitTextUndefined: Self = StObject.set(x, "unitText", js.undefined)
    }
  }
  
  trait ScalesLabelsFont extends StObject {
    
    /** Specify font fontFamily for labels of circular gauge
      * @default {Arial}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specify font Style for labels of circular gauge
      * @default {Bold}
      */
    var fontStyle: js.UndefOr[String] = js.undefined
    
    /** Specify font size for labels of circular gauge
      * @default {11px}
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
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ScalesPointer extends StObject {
    
    /** Specify backNeedleLength of circular gauge
      * @default {10}
      */
    var backNeedleLength: js.UndefOr[Double] = js.undefined
    
    /** Specify backgroundColor for the pointer of circular gauge
      * @default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specify the border for pointers of circular gauge
      * @default {Object}
      */
    var border: js.UndefOr[ScalesPointersBorder] = js.undefined
    
    /** Specify distanceFromScale value for pointers of circular gauge
      * @default {0}
      */
    var distanceFromScale: js.UndefOr[Double] = js.undefined
    
    /** Specify pointer gradients of circular gauge
      * @default {null}
      */
    var gradients: js.UndefOr[Any] = js.undefined
    
    /** Specify pointer image of circular gauge.It is applicable for both marker as well as needle type pointers.
      * @default {NULL}
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** Specify pointer length of circular gauge
      * @default {150}
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /** Specify marker Style value of circular gauge. See
      * @default {Rectangle}
      */
    var markerType: js.UndefOr[MarkerType | String] = js.undefined
    
    /** Specify needle Style value of circular gauge. See
      * @default {Triangle}
      */
    var needleType: js.UndefOr[NeedleType | String] = js.undefined
    
    /** Specify opacity value for pointer of circular gauge
      * @default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specify pointer Placement value of circular gauge. See PointerPlacement
      * @default {Near}
      */
    var placement: js.UndefOr[Placement | String] = js.undefined
    
    /** Specify pointer value text of circular gauge.
      * @default {Object}
      */
    var pointerValueText: js.UndefOr[ScalesPointersPointerValueText] = js.undefined
    
    /** Specify radius value for pointer of circular gauge
      * @default {null}
      */
    var radius: js.UndefOr[Double] = js.undefined
    
    /** Specify showBackNeedle value of circular gauge
      * @default {false}
      */
    var showBackNeedle: js.UndefOr[Boolean] = js.undefined
    
    /** Specify pointer type value of circular gauge. See
      * @default {Needle}
      */
    var `type`: js.UndefOr[PointerType | String] = js.undefined
    
    /** Specify value of the pointer of circular gauge
      * @default {null}
      */
    var value: js.UndefOr[Double] = js.undefined
    
    /** Specify pointer width of circular gauge
      * @default {7}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ScalesPointer {
    
    inline def apply(): ScalesPointer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesPointer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesPointer] (val x: Self) extends AnyVal {
      
      inline def setBackNeedleLength(value: Double): Self = StObject.set(x, "backNeedleLength", value.asInstanceOf[js.Any])
      
      inline def setBackNeedleLengthUndefined: Self = StObject.set(x, "backNeedleLength", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorder(value: ScalesPointersBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setDistanceFromScale(value: Double): Self = StObject.set(x, "distanceFromScale", value.asInstanceOf[js.Any])
      
      inline def setDistanceFromScaleUndefined: Self = StObject.set(x, "distanceFromScale", js.undefined)
      
      inline def setGradients(value: Any): Self = StObject.set(x, "gradients", value.asInstanceOf[js.Any])
      
      inline def setGradientsUndefined: Self = StObject.set(x, "gradients", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMarkerType(value: MarkerType | String): Self = StObject.set(x, "markerType", value.asInstanceOf[js.Any])
      
      inline def setMarkerTypeUndefined: Self = StObject.set(x, "markerType", js.undefined)
      
      inline def setNeedleType(value: NeedleType | String): Self = StObject.set(x, "needleType", value.asInstanceOf[js.Any])
      
      inline def setNeedleTypeUndefined: Self = StObject.set(x, "needleType", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPlacement(value: Placement | String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPointerValueText(value: ScalesPointersPointerValueText): Self = StObject.set(x, "pointerValueText", value.asInstanceOf[js.Any])
      
      inline def setPointerValueTextUndefined: Self = StObject.set(x, "pointerValueText", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setShowBackNeedle(value: Boolean): Self = StObject.set(x, "showBackNeedle", value.asInstanceOf[js.Any])
      
      inline def setShowBackNeedleUndefined: Self = StObject.set(x, "showBackNeedle", js.undefined)
      
      inline def setType(value: PointerType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ScalesPointerCap extends StObject {
    
    /** Specify cap backgroundColor of circular gauge
      * @default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specify cap borderColor of circular gauge
      * @default {null}
      */
    var borderColor: js.UndefOr[String] = js.undefined
    
    /** Specify pointerCap borderWidth value of circular gauge
      * @default {3}
      */
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    /** Specify cap interiorGradient value of circular gauge
      * @default {null}
      */
    var interiorGradient: js.UndefOr[Any] = js.undefined
    
    /** Specify pointerCap Radius value of circular gauge
      * @default {7}
      */
    var radius: js.UndefOr[Double] = js.undefined
  }
  object ScalesPointerCap {
    
    inline def apply(): ScalesPointerCap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesPointerCap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesPointerCap] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setInteriorGradient(value: Any): Self = StObject.set(x, "interiorGradient", value.asInstanceOf[js.Any])
      
      inline def setInteriorGradientUndefined: Self = StObject.set(x, "interiorGradient", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  trait ScalesPointersBorder extends StObject {
    
    /** Specify border color for pointer of circular gauge
      * @default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specify border width for pointers of circular gauge
      * @default {1.5}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ScalesPointersBorder {
    
    inline def apply(): ScalesPointersBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesPointersBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesPointersBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ScalesPointersPointerValueText extends StObject {
    
    /** Specify pointer text angle of circular gauge.
      * @default {0}
      */
    var angle: js.UndefOr[Double] = js.undefined
    
    /** Specify pointer text auto angle of circular gauge.
      * @default {false}
      */
    var autoAngle: js.UndefOr[Boolean] = js.undefined
    
    /** Specify pointer value text color of circular gauge.
      * @default {#8c8c8c}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specify pointer value text distance from pointer of circular gauge.
      * @default {20}
      */
    var distance: js.UndefOr[Double] = js.undefined
    
    /** Specify pointer value text font option of circular gauge.
      * @default {object}
      */
    var font: js.UndefOr[ScalesPointersPointerValueTextFont] = js.undefined
    
    /** Specify pointer value text opacity of circular gauge.
      * @default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** enable pointer value text visibility of circular gauge.
      * @default {false}
      */
    var showValue: js.UndefOr[Boolean] = js.undefined
  }
  object ScalesPointersPointerValueText {
    
    inline def apply(): ScalesPointersPointerValueText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesPointersPointerValueText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesPointersPointerValueText] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setAutoAngle(value: Boolean): Self = StObject.set(x, "autoAngle", value.asInstanceOf[js.Any])
      
      inline def setAutoAngleUndefined: Self = StObject.set(x, "autoAngle", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setFont(value: ScalesPointersPointerValueTextFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setShowValue(value: Boolean): Self = StObject.set(x, "showValue", value.asInstanceOf[js.Any])
      
      inline def setShowValueUndefined: Self = StObject.set(x, "showValue", js.undefined)
    }
  }
  
  trait ScalesPointersPointerValueTextFont extends StObject {
    
    /** Specify pointer value text font family of circular gauge.
      * @default {Arial}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specify pointer value text font style of circular gauge.
      * @default {Bold}
      */
    var fontStyle: js.UndefOr[String] = js.undefined
    
    /** Specify pointer value text size of circular gauge.
      * @default {11px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object ScalesPointersPointerValueTextFont {
    
    inline def apply(): ScalesPointersPointerValueTextFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesPointersPointerValueTextFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesPointersPointerValueTextFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ScalesRange extends StObject {
    
    /** Specify backgroundColor for the ranges of circular gauge
      * @default {#32b3c6}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specify border for ranges of circular gauge
      * @default {Object}
      */
    var border: js.UndefOr[ScalesRangesBorder] = js.undefined
    
    /** Specify distanceFromScale value for ranges of circular gauge
      * @default {25}
      */
    var distanceFromScale: js.UndefOr[Double] = js.undefined
    
    /** Specify endValue for ranges of circular gauge
      * @default {null}
      */
    var endValue: js.UndefOr[Double] = js.undefined
    
    /** Specify endWidth for ranges of circular gauge
      * @default {10}
      */
    var endWidth: js.UndefOr[Double] = js.undefined
    
    /** Specify range gradients of circular gauge
      * @default {null}
      */
    var gradients: js.UndefOr[Any] = js.undefined
    
    /** Specify text for the ranges of circular gauge
      * @default {null}
      */
    var legendText: js.UndefOr[String] = js.undefined
    
    /** Specify opacity value for ranges of circular gauge
      * @default {null}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specify placement of circular gauge. See RangePlacement
      * @default {Near}
      */
    var placement: js.UndefOr[Placement | String] = js.undefined
    
    /** Specify size of the range value of circular gauge
      * @default {5}
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Specify startValue for ranges of circular gauge
      * @default {null}
      */
    var startValue: js.UndefOr[Double] = js.undefined
    
    /** Specify startWidth of circular gauge
      * @default {[Array.number] scale.ranges.startWidth = 10}
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
      
      inline def setLegendText(value: String): Self = StObject.set(x, "legendText", value.asInstanceOf[js.Any])
      
      inline def setLegendTextUndefined: Self = StObject.set(x, "legendText", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPlacement(value: Placement | String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
      
      inline def setStartWidth(value: Double): Self = StObject.set(x, "startWidth", value.asInstanceOf[js.Any])
      
      inline def setStartWidthUndefined: Self = StObject.set(x, "startWidth", js.undefined)
    }
  }
  
  trait ScalesRangesBorder extends StObject {
    
    /** Specify border color for ranges of circular gauge
      * @default {#32b3c6}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specify border width for ranges of circular gauge
      * @default {1.5}
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
  
  trait ScalesSubGauge extends StObject {
    
    /** Specify subGauge Height of circular gauge
      * @default {150}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Specify position for sub-gauge of circular gauge
      * @default {Object}
      */
    var position: js.UndefOr[ScalesSubGaugesPosition] = js.undefined
    
    /** Specify subGauge Width of circular gauge
      * @default {150}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ScalesSubGauge {
    
    inline def apply(): ScalesSubGauge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesSubGauge]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesSubGauge] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPosition(value: ScalesSubGaugesPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ScalesSubGaugesPosition extends StObject {
    
    /** Specify x-axis position for sub-gauge of circular gauge
      * @default {0}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Specify y-axis position for sub-gauge of circular gauge
      * @default {0}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object ScalesSubGaugesPosition {
    
    inline def apply(): ScalesSubGaugesPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesSubGaugesPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalesSubGaugesPosition] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ScalesTick extends StObject {
    
    /** Specify the angle for the ticks of circular gauge
      * @default {0}
      */
    var angle: js.UndefOr[Double] = js.undefined
    
    /** Specify tick color of circular gauge
      * @default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specify distanceFromScale value for ticks of circular gauge
      * @default {0}
      */
    var distanceFromScale: js.UndefOr[Double] = js.undefined
    
    /** Specify tick height of circular gauge
      * @default {16}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Specify tick placement of circular gauge. See TickPlacement
      * @default {Near}
      */
    var placement: js.UndefOr[Placement | String] = js.undefined
    
    /** Specify tick Style of circular gauge. See TickType
      * @default {Major}
      */
    var `type`: js.UndefOr[LabelType | String] = js.undefined
    
    /** Specify tick width of circular gauge
      * @default {3}
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
      
      inline def setDistanceFromScale(value: Double): Self = StObject.set(x, "distanceFromScale", value.asInstanceOf[js.Any])
      
      inline def setDistanceFromScaleUndefined: Self = StObject.set(x, "distanceFromScale", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPlacement(value: Placement | String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setType(value: LabelType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Tooltip extends StObject {
    
    /** enable showCustomLabelTooltip of circular gauge
      * @default {false}
      */
    var showCustomLabelTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** enable showLabelTooltip of circular gauge
      * @default {false}
      */
    var showLabelTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Specify tooltip templateID of circular gauge
      * @default {false}
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
