package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircularGauge extends Widget_ {
  
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
    sealed trait Inner extends CustomLabelPositionType
    
    //string
    @js.native
    sealed trait Outer extends CustomLabelPositionType
  }
  
  @js.native
  sealed trait Direction extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.Direction")
  @js.native
  object Direction extends StObject {
    
    //string
    @js.native
    sealed trait Clockwise extends Direction
    
    //string
    @js.native
    sealed trait CounterClockwise extends Direction
  }
  
  @js.native
  sealed trait ExportingMode extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.ExportingMode")
  @js.native
  object ExportingMode extends StObject {
    
    //string
    @js.native
    sealed trait ClientSide extends ExportingMode
    
    //string
    @js.native
    sealed trait ServerSide extends ExportingMode
  }
  
  @js.native
  sealed trait ExportingType extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.ExportingType")
  @js.native
  object ExportingType extends StObject {
    
    //string
    @js.native
    sealed trait JPG extends ExportingType
    
    //string
    @js.native
    sealed trait PNG extends ExportingType
  }
  
  @js.native
  sealed trait FrameType extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.FrameType")
  @js.native
  object FrameType extends StObject {
    
    //string
    @js.native
    sealed trait FullCircle extends FrameType
    
    //string
    @js.native
    sealed trait HalfCircle extends FrameType
  }
  
  @js.native
  sealed trait IndicatorTypes extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.IndicatorTypes")
  @js.native
  object IndicatorTypes extends StObject {
    
    //string
    @js.native
    sealed trait Circle extends IndicatorTypes
    
    //string
    @js.native
    sealed trait Cross extends IndicatorTypes
    
    //string
    @js.native
    sealed trait Diamond extends IndicatorTypes
    
    //string
    @js.native
    sealed trait Downarrow extends IndicatorTypes
    
    //string
    @js.native
    sealed trait HorizontalLine extends IndicatorTypes
    
    //string
    @js.native
    sealed trait Image extends IndicatorTypes
    
    //string
    @js.native
    sealed trait InvertedTriangle extends IndicatorTypes
    
    //string
    @js.native
    sealed trait Leftarrow extends IndicatorTypes
    
    //string
    @js.native
    sealed trait Pentagon extends IndicatorTypes
    
    //string
    @js.native
    sealed trait Rectangle extends IndicatorTypes
    
    //string
    @js.native
    sealed trait Rightarrow extends IndicatorTypes
    
    //string
    @js.native
    sealed trait RoundedRectangle extends IndicatorTypes
    
    //string
    @js.native
    sealed trait Star extends IndicatorTypes
    
    //string
    @js.native
    sealed trait Text extends IndicatorTypes
    
    //string
    @js.native
    sealed trait Trapezoid extends IndicatorTypes
    
    //string
    @js.native
    sealed trait Triangle extends IndicatorTypes
    
    //string
    @js.native
    sealed trait Uparrow extends IndicatorTypes
    
    //string
    @js.native
    sealed trait Verticalline extends IndicatorTypes
    
    //string
    @js.native
    sealed trait Wedge extends IndicatorTypes
  }
  
  @js.native
  sealed trait LabelType extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.LabelType")
  @js.native
  object LabelType extends StObject {
    
    //string
    @js.native
    sealed trait Major extends LabelType
    
    //string
    @js.native
    sealed trait Minor extends LabelType
  }
  
  @js.native
  sealed trait LegendAlignment extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.LegendAlignment")
  @js.native
  object LegendAlignment extends StObject {
    
    //string
    @js.native
    sealed trait Center extends LegendAlignment
    
    //string
    @js.native
    sealed trait Far extends LegendAlignment
    
    //string
    @js.native
    sealed trait Near extends LegendAlignment
  }
  
  @js.native
  sealed trait LegendPosition extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.LegendPosition")
  @js.native
  object LegendPosition extends StObject {
    
    //string
    @js.native
    sealed trait Bottom extends LegendPosition
    
    //string
    @js.native
    sealed trait Left extends LegendPosition
    
    //string
    @js.native
    sealed trait Right extends LegendPosition
    
    //string
    @js.native
    sealed trait Top extends LegendPosition
  }
  
  @js.native
  sealed trait LegendShape extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.LegendShape")
  @js.native
  object LegendShape extends StObject {
    
    //string
    @js.native
    sealed trait Circle extends LegendShape
    
    //string
    @js.native
    sealed trait Diamond extends LegendShape
    
    //string
    @js.native
    sealed trait Ellipse extends LegendShape
    
    //string
    @js.native
    sealed trait Line extends LegendShape
    
    //string
    @js.native
    sealed trait Pentagon extends LegendShape
    
    //string
    @js.native
    sealed trait Rectangle extends LegendShape
    
    //string
    @js.native
    sealed trait Slider extends LegendShape
    
    //string
    @js.native
    sealed trait Trapezoid extends LegendShape
    
    //string
    @js.native
    sealed trait Triangle extends LegendShape
  }
  
  @js.native
  sealed trait MarkerType extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.MarkerType")
  @js.native
  object MarkerType extends StObject {
    
    //string
    @js.native
    sealed trait Circle extends MarkerType
    
    //string
    @js.native
    sealed trait Diamond extends MarkerType
    
    //string
    @js.native
    sealed trait Ellipse extends MarkerType
    
    //string
    @js.native
    sealed trait Image extends MarkerType
    
    //string
    @js.native
    sealed trait Pentagon extends MarkerType
    
    //string
    @js.native
    sealed trait Pointer extends MarkerType
    
    //string
    @js.native
    sealed trait Rectangle extends MarkerType
    
    //string
    @js.native
    sealed trait RoundedRectangle extends MarkerType
    
    //string
    @js.native
    sealed trait Slider extends MarkerType
    
    //string
    @js.native
    sealed trait Trapezoid extends MarkerType
    
    //string
    @js.native
    sealed trait Triangle extends MarkerType
    
    //string
    @js.native
    sealed trait Wedge extends MarkerType
  }
  
  @js.native
  sealed trait NeedleType extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.NeedleType")
  @js.native
  object NeedleType extends StObject {
    
    //string
    @js.native
    sealed trait Arrow extends NeedleType
    
    //string
    @js.native
    sealed trait Image extends NeedleType
    
    //string
    @js.native
    sealed trait Rectangle extends NeedleType
    
    //string
    @js.native
    sealed trait Trapezoid extends NeedleType
    
    //string
    @js.native
    sealed trait Triangle extends NeedleType
  }
  
  @js.native
  sealed trait OuterCustomLabelPosition extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.OuterCustomLabelPosition")
  @js.native
  object OuterCustomLabelPosition extends StObject {
    
    //string
    @js.native
    sealed trait Bottom extends OuterCustomLabelPosition
    
    //string
    @js.native
    sealed trait Left extends OuterCustomLabelPosition
    
    //string
    @js.native
    sealed trait Right extends OuterCustomLabelPosition
    
    //string
    @js.native
    sealed trait Top extends OuterCustomLabelPosition
  }
  
  @js.native
  sealed trait Placement extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.Placement")
  @js.native
  object Placement extends StObject {
    
    //string
    @js.native
    sealed trait Far extends Placement
    
    //string
    @js.native
    sealed trait Near extends Placement
  }
  
  @js.native
  sealed trait PointerType extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.PointerType")
  @js.native
  object PointerType extends StObject {
    
    //string
    @js.native
    sealed trait Marker extends PointerType
    
    //string
    @js.native
    sealed trait Needle extends PointerType
  }
  
  @js.native
  sealed trait RangeZOrderPlacement extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.RangeZOrderPlacement")
  @js.native
  object RangeZOrderPlacement extends StObject {
    
    //string
    @js.native
    sealed trait Front extends RangeZOrderPlacement
    
    //string
    @js.native
    sealed trait Rear extends RangeZOrderPlacement
  }
  
  @js.native
  sealed trait UnitTextPlacement extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.UnitTextPlacement")
  @js.native
  object UnitTextPlacement extends StObject {
    
    //string
    @js.native
    sealed trait Back extends UnitTextPlacement
    
    //string
    @js.native
    sealed trait Front extends UnitTextPlacement
  }
  
  @js.native
  sealed trait gaugePosition extends StObject
  @JSGlobal("ej.datavisualization.CircularGauge.gaugePosition")
  @js.native
  object gaugePosition extends StObject {
    
    //string
    @js.native
    sealed trait BottomCenter extends gaugePosition
    
    //string
    @js.native
    sealed trait BottomLeft extends gaugePosition
    
    //string
    @js.native
    sealed trait BottomRight extends gaugePosition
    
    //string
    @js.native
    sealed trait Center extends gaugePosition
    
    //string
    @js.native
    sealed trait MiddleLeft extends gaugePosition
    
    //string
    @js.native
    sealed trait MiddleRight extends gaugePosition
    
    //string
    @js.native
    sealed trait TopCenter extends gaugePosition
    
    //string
    @js.native
    sealed trait TopLeft extends gaugePosition
    
    //string
    @js.native
    sealed trait TopRight extends gaugePosition
  }
  
  @js.native
  trait DoubleClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - X and Y co-ordinate of the points with respect to circular gauge area.id - ID of the target element.    size - Width and height of the circular gauge.    pageX -
      * x-coordinate of the pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the circular gauge model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DoubleClickEventArgs {
    
    @scala.inline
    def apply(): DoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleClickEventArgs]
    }
    
    @scala.inline
    implicit class DoubleClickEventArgsMutableBuilder[Self <: DoubleClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DrawCustomLabelEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the context element
      */
    var context: js.UndefOr[js.Any] = js.native
    
    /** returns the current custom label element.
      */
    var customLabelElement: js.UndefOr[js.Any] = js.native
    
    /** returns the index of the custom label.
      */
    var customLabelIndex: js.UndefOr[Double] = js.native
    
    /** returns the gauge model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[js.Any] = js.native
    
    /** returns the startX and startY of the custom label
      */
    var position: js.UndefOr[js.Any] = js.native
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[js.Any] = js.native
    
    /** returns the scaleIndex to which the custom label belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.native
    
    /** returns the custom label style
      */
    var style: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DrawCustomLabelEventArgs {
    
    @scala.inline
    def apply(): DrawCustomLabelEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawCustomLabelEventArgs]
    }
    
    @scala.inline
    implicit class DrawCustomLabelEventArgsMutableBuilder[Self <: DrawCustomLabelEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setCustomLabelElement(value: js.Any): Self = StObject.set(x, "customLabelElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomLabelElementUndefined: Self = StObject.set(x, "customLabelElement", js.undefined)
      
      @scala.inline
      def setCustomLabelIndex(value: Double): Self = StObject.set(x, "customLabelIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomLabelIndexUndefined: Self = StObject.set(x, "customLabelIndex", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setScaleElement(value: js.Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      @scala.inline
      def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DrawIndicatorsEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the context element
      */
    var context: js.UndefOr[js.Any] = js.native
    
    /** returns the current indicator element.
      */
    var indicatorElement: js.UndefOr[js.Any] = js.native
    
    /** returns the index of the indicator.
      */
    var indicatorIndex: js.UndefOr[Double] = js.native
    
    /** returns the gauge model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[js.Any] = js.native
    
    /** returns the startX and startY of the indicator
      */
    var position: js.UndefOr[js.Any] = js.native
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[js.Any] = js.native
    
    /** returns the scaleIndex to which the indicator belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.native
    
    /** returns the indicator style
      */
    var style: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DrawIndicatorsEventArgs {
    
    @scala.inline
    def apply(): DrawIndicatorsEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawIndicatorsEventArgs]
    }
    
    @scala.inline
    implicit class DrawIndicatorsEventArgsMutableBuilder[Self <: DrawIndicatorsEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setIndicatorElement(value: js.Any): Self = StObject.set(x, "indicatorElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorElementUndefined: Self = StObject.set(x, "indicatorElement", js.undefined)
      
      @scala.inline
      def setIndicatorIndex(value: Double): Self = StObject.set(x, "indicatorIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorIndexUndefined: Self = StObject.set(x, "indicatorIndex", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setScaleElement(value: js.Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      @scala.inline
      def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DrawLabelsEventArgs extends StObject {
    
    /** returns the angle of the labels.
      */
    var angle: js.UndefOr[Double] = js.native
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the context element
      */
    var context: js.UndefOr[js.Any] = js.native
    
    /** returns the current label element.
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the index of the label.
      */
    var index: js.UndefOr[Double] = js.native
    
    /** returns the gauge model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[js.Any] = js.native
    
    /** returns the value of the label.
      */
    var pointerValue: js.UndefOr[Double] = js.native
    
    /** returns the startX and startY of the labels
      */
    var position: js.UndefOr[js.Any] = js.native
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[js.Any] = js.native
    
    /** returns the scaleIndex to which the label belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.native
    
    /** returns the label style
      */
    var style: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DrawLabelsEventArgs {
    
    @scala.inline
    def apply(): DrawLabelsEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawLabelsEventArgs]
    }
    
    @scala.inline
    implicit class DrawLabelsEventArgsMutableBuilder[Self <: DrawLabelsEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setPointerValue(value: Double): Self = StObject.set(x, "pointerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerValueUndefined: Self = StObject.set(x, "pointerValue", js.undefined)
      
      @scala.inline
      def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setScaleElement(value: js.Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      @scala.inline
      def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DrawPointerCapEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the context element
      */
    var context: js.UndefOr[js.Any] = js.native
    
    /** returns the gauge model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[js.Any] = js.native
    
    /** returns the startX and startY of the pointer cap.
      */
    var position: js.UndefOr[js.Any] = js.native
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[js.Any] = js.native
    
    /** returns the pointer cap style
      */
    var style: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DrawPointerCapEventArgs {
    
    @scala.inline
    def apply(): DrawPointerCapEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawPointerCapEventArgs]
    }
    
    @scala.inline
    implicit class DrawPointerCapEventArgsMutableBuilder[Self <: DrawPointerCapEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setScaleElement(value: js.Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DrawPointersEventArgs extends StObject {
    
    /** returns the angle of the pointer.
      */
    var angle: js.UndefOr[Double] = js.native
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the context element
      */
    var context: js.UndefOr[js.Any] = js.native
    
    /** returns the current pointer element.
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the index of the pointer.
      */
    var index: js.UndefOr[Double] = js.native
    
    /** returns the gauge model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[js.Any] = js.native
    
    /** returns the startX and startY of the pointer
      */
    var position: js.UndefOr[js.Any] = js.native
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[js.Any] = js.native
    
    /** returns the scaleIndex to which the pointer belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.native
    
    /** returns the pointer style
      */
    var style: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the value of the pointer.
      */
    var value: js.UndefOr[Double] = js.native
  }
  object DrawPointersEventArgs {
    
    @scala.inline
    def apply(): DrawPointersEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawPointersEventArgs]
    }
    
    @scala.inline
    implicit class DrawPointersEventArgsMutableBuilder[Self <: DrawPointersEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setScaleElement(value: js.Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      @scala.inline
      def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait DrawRangeEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the context element
      */
    var context: js.UndefOr[js.Any] = js.native
    
    /** returns the gauge model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[js.Any] = js.native
    
    /** returns the startX and startY of the range
      */
    var position: js.UndefOr[js.Any] = js.native
    
    /** returns the current range element.
      */
    var rangeElement: js.UndefOr[js.Any] = js.native
    
    /** returns the index of the range.
      */
    var rangeIndex: js.UndefOr[Double] = js.native
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[js.Any] = js.native
    
    /** returns the scaleIndex to which the range belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.native
    
    /** returns the range style
      */
    var style: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DrawRangeEventArgs {
    
    @scala.inline
    def apply(): DrawRangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawRangeEventArgs]
    }
    
    @scala.inline
    implicit class DrawRangeEventArgsMutableBuilder[Self <: DrawRangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRangeElement(value: js.Any): Self = StObject.set(x, "rangeElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeElementUndefined: Self = StObject.set(x, "rangeElement", js.undefined)
      
      @scala.inline
      def setRangeIndex(value: Double): Self = StObject.set(x, "rangeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeIndexUndefined: Self = StObject.set(x, "rangeIndex", js.undefined)
      
      @scala.inline
      def setScaleElement(value: js.Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      @scala.inline
      def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DrawTicksEventArgs extends StObject {
    
    /** returns the angle of the tick.
      */
    var angle: js.UndefOr[Double] = js.native
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the context element
      */
    var context: js.UndefOr[js.Any] = js.native
    
    /** returns the current tick element.
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the index of the tick.
      */
    var index: js.UndefOr[Double] = js.native
    
    /** returns the gauge model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[js.Any] = js.native
    
    /** returns the label value of the tick.
      */
    var pointerValue: js.UndefOr[Double] = js.native
    
    /** returns the startX and startY of the ticks
      */
    var position: js.UndefOr[js.Any] = js.native
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[js.Any] = js.native
    
    /** returns the scaleIndex to which the tick belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.native
    
    /** returns the ticks style
      */
    var style: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DrawTicksEventArgs {
    
    @scala.inline
    def apply(): DrawTicksEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawTicksEventArgs]
    }
    
    @scala.inline
    implicit class DrawTicksEventArgsMutableBuilder[Self <: DrawTicksEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setPointerValue(value: Double): Self = StObject.set(x, "pointerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerValueUndefined: Self = StObject.set(x, "pointerValue", js.undefined)
      
      @scala.inline
      def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setScaleElement(value: js.Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      @scala.inline
      def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ExportSettings extends StObject {
    
    /** Specifies the name of the action URL
      */
    var action: js.UndefOr[String] = js.native
    
    /** Specifies the downloading filename
      * @Default {CircularGauge}
      */
    var filename: js.UndefOr[String] = js.native
    
    /** Specifies the mode of exporting
      * @Default {client}
      */
    var mode: js.UndefOr[ExportingMode | String] = js.native
    
    /** Specifies the format of the file to export
      * @Default {png}
      */
    var `type`: js.UndefOr[ExportingType | String] = js.native
  }
  object ExportSettings {
    
    @scala.inline
    def apply(): ExportSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportSettings]
    }
    
    @scala.inline
    implicit class ExportSettingsMutableBuilder[Self <: ExportSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setMode(value: ExportingMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setType(value: ExportingType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Frame extends StObject {
    
    /** Specify the URL of the frame background image for circular gauge
      * @Default {null}
      */
    var backgroundImageUrl: js.UndefOr[String] = js.native
    
    /** Specifies the frameType of circular gauge. See
      * @Default {FullCircle}
      */
    var frameType: js.UndefOr[FrameType | String] = js.native
    
    /** Specifies the end angle for the half circular frame.
      * @Default {360}
      */
    var halfCircleFrameEndAngle: js.UndefOr[Double] = js.native
    
    /** Specifies the start angle for the half circular frame.
      * @Default {180}
      */
    var halfCircleFrameStartAngle: js.UndefOr[Double] = js.native
  }
  object Frame {
    
    @scala.inline
    def apply(): Frame = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Frame]
    }
    
    @scala.inline
    implicit class FrameMutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundImageUrl(value: String): Self = StObject.set(x, "backgroundImageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundImageUrlUndefined: Self = StObject.set(x, "backgroundImageUrl", js.undefined)
      
      @scala.inline
      def setFrameType(value: FrameType | String): Self = StObject.set(x, "frameType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameTypeUndefined: Self = StObject.set(x, "frameType", js.undefined)
      
      @scala.inline
      def setHalfCircleFrameEndAngle(value: Double): Self = StObject.set(x, "halfCircleFrameEndAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCircleFrameEndAngleUndefined: Self = StObject.set(x, "halfCircleFrameEndAngle", js.undefined)
      
      @scala.inline
      def setHalfCircleFrameStartAngle(value: Double): Self = StObject.set(x, "halfCircleFrameStartAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCircleFrameStartAngleUndefined: Self = StObject.set(x, "halfCircleFrameStartAngle", js.undefined)
    }
  }
  
  @js.native
  trait Legend extends StObject {
    
    /** Specifies the alignment of the legend.
      * @Default {Center. See Alignment}
      */
    var alignment: js.UndefOr[LegendAlignment | String] = js.native
    
    /** Options for customizing the legend border.
      */
    var border: js.UndefOr[LegendBorder] = js.native
    
    /** Fill color for the legend items. By using this property, it displays all legend item shapes in same color.Legend items representing invisible ranges is displayed in gray color.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Options to customize the font used for legend item text.
      */
    var font: js.UndefOr[LegendFont] = js.native
    
    /** Gap or padding between the legend items.
      * @Default {20}
      */
    var itemPadding: js.UndefOr[Double] = js.native
    
    /** Options to customize the style of legend items.
      */
    var itemStyle: js.UndefOr[LegendItemStyle] = js.native
    
    /** Opacity of the legend.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Places the legend at specified position. Legend can be placed at **left**, **right**, **top** or **bottom** of the circular gauge.
      * @Default {Bottom. See Position}
      */
    var position: js.UndefOr[LegendPosition | String] = js.native
    
    /** Shape of the legend items.
      * @Default {Circle. See Shape}
      */
    var shape: js.UndefOr[LegendShape | String] = js.native
    
    /** Options to customize the size of the legend.
      */
    var size: js.UndefOr[LegendSize] = js.native
    
    /** Toggles the visibility of the ranges.
      * @Default {true}
      */
    var toggleVisibility: js.UndefOr[Boolean] = js.native
    
    /** Toggles the visibility of the legend.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object Legend {
    
    @scala.inline
    def apply(): Legend = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Legend]
    }
    
    @scala.inline
    implicit class LegendMutableBuilder[Self <: Legend] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: LegendAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBorder(value: LegendBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: LegendFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setItemPadding(value: Double): Self = StObject.set(x, "itemPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPaddingUndefined: Self = StObject.set(x, "itemPadding", js.undefined)
      
      @scala.inline
      def setItemStyle(value: LegendItemStyle): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPosition(value: LegendPosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setShape(value: LegendShape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: LegendSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setToggleVisibility(value: Boolean): Self = StObject.set(x, "toggleVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleVisibilityUndefined: Self = StObject.set(x, "toggleVisibility", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait LegendBorder extends StObject {
    
    /** Border color of the legend.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the legend.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object LegendBorder {
    
    @scala.inline
    def apply(): LegendBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendBorder]
    }
    
    @scala.inline
    implicit class LegendBorderMutableBuilder[Self <: LegendBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait LegendFont extends StObject {
    
    /** Font color of the text for legend items.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Font family for legend item text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style for legend item text.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[String] = js.native
    
    /** Font weight for legend item text.
      * @Default {Regular}
      */
    var fontWeight: js.UndefOr[String] = js.native
    
    /** Font size for legend item text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object LegendFont {
    
    @scala.inline
    def apply(): LegendFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendFont]
    }
    
    @scala.inline
    implicit class LegendFontMutableBuilder[Self <: LegendFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait LegendItemClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the legend item object that is about to be rendered
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the circulargauge model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LegendItemClickEventArgs {
    
    @scala.inline
    def apply(): LegendItemClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemClickEventArgs]
    }
    
    @scala.inline
    implicit class LegendItemClickEventArgsMutableBuilder[Self <: LegendItemClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait LegendItemRenderEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the legend item object that is about to be rendered
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the circulargauge model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LegendItemRenderEventArgs {
    
    @scala.inline
    def apply(): LegendItemRenderEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemRenderEventArgs]
    }
    
    @scala.inline
    implicit class LegendItemRenderEventArgsMutableBuilder[Self <: LegendItemRenderEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait LegendItemStyle extends StObject {
    
    /** Options for customizing the border of legend items.
      */
    var border: js.UndefOr[LegendItemStyleBorder] = js.native
    
    /** Specifies the height of the  legend item shapes.
      * @Default {10}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Specifies the width of the  legend item shapes.
      * @Default {10}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object LegendItemStyle {
    
    @scala.inline
    def apply(): LegendItemStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemStyle]
    }
    
    @scala.inline
    implicit class LegendItemStyleMutableBuilder[Self <: LegendItemStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: LegendItemStyleBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait LegendItemStyleBorder extends StObject {
    
    /** Border color of the legend items.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the legend items.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object LegendItemStyleBorder {
    
    @scala.inline
    def apply(): LegendItemStyleBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemStyleBorder]
    }
    
    @scala.inline
    implicit class LegendItemStyleBorderMutableBuilder[Self <: LegendItemStyleBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait LegendSize extends StObject {
    
    /** Specify the height of the legend. Height can be specified in pixel.
      * @Default {null}
      */
    var height: js.UndefOr[String] = js.native
    
    /** Specify the width of the legend. Width can be specified in pixel.
      * @Default {null}
      */
    var width: js.UndefOr[String] = js.native
  }
  object LegendSize {
    
    @scala.inline
    def apply(): LegendSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendSize]
    }
    
    @scala.inline
    implicit class LegendSizeMutableBuilder[Self <: LegendSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait LoadEventArgs extends StObject {
    
    /** returns the gauge model
      */
    var Model: js.UndefOr[js.Any] = js.native
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the context element
      */
    var context: js.UndefOr[js.Any] = js.native
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[js.Any] = js.native
    
    /** returns the entire scale element.
      */
    var scaleElement: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LoadEventArgs {
    
    @scala.inline
    def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit class LoadEventArgsMutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setScaleElement(value: js.Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Specifies animationSpeed of circular gauge
      * @Default {500}
      */
    var animationSpeed: js.UndefOr[Double] = js.native
    
    /** Specifies the background color of circular gauge.
      * @Default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.native
    
    /** Specify distanceFromCorner value of circular gauge
      * @Default {center}
      */
    var distanceFromCorner: js.UndefOr[Double] = js.native
    
    /** Fires, on double clicking the circular gauge.
      */
    var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
    
    /** Triggers while the custom labels are being drawn on the gauge.
      */
    var drawCustomLabel: js.UndefOr[js.Function1[/* e */ DrawCustomLabelEventArgs, Unit]] = js.native
    
    /** Triggers while the indicators are being started to drawn on the gauge.
      */
    var drawIndicators: js.UndefOr[js.Function1[/* e */ DrawIndicatorsEventArgs, Unit]] = js.native
    
    /** Triggers while the labels are being drawn on the gauge.
      */
    var drawLabels: js.UndefOr[js.Function1[/* e */ DrawLabelsEventArgs, Unit]] = js.native
    
    /** Triggers while the pointer cap is being drawn on the gauge.
      */
    var drawPointerCap: js.UndefOr[js.Function1[/* e */ DrawPointerCapEventArgs, Unit]] = js.native
    
    /** Triggers while the pointers are being drawn on the gauge.
      */
    var drawPointers: js.UndefOr[js.Function1[/* e */ DrawPointersEventArgs, Unit]] = js.native
    
    /** Triggers when the ranges begin to be getting drawn on the gauge.
      */
    var drawRange: js.UndefOr[js.Function1[/* e */ DrawRangeEventArgs, Unit]] = js.native
    
    /** Triggers while the ticks are being drawn on the gauge.
      */
    var drawTicks: js.UndefOr[js.Function1[/* e */ DrawTicksEventArgs, Unit]] = js.native
    
    /** Specify animate value of circular gauge
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Specify to convert the  date object to  string, using locale settings.
      * @Default {false}
      */
    var enableGroupSeparator: js.UndefOr[Boolean] = js.native
    
    /** Controls whether circular gauge has to be responsive while resizing.
      * @Default {false}
      */
    var enableResize: js.UndefOr[Boolean] = js.native
    
    /** This provides options for customizing export settings
      */
    var exportSettings: js.UndefOr[ExportSettings] = js.native
    
    /** Specify the frame of circular gauge
      * @Default {Object}
      */
    var frame: js.UndefOr[Frame] = js.native
    
    /** Specify gaugePosition value of circular gauge See GaugePosition
      * @Default {center}
      */
    var gaugePosition: js.UndefOr[typings.ejWebAll.ej.datavisualization.CircularGauge.gaugePosition | String] = js.native
    
    /** Specifies the height of circular gauge.
      * @Default {360}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Specifies the interiorGradient of circular gauge.
      * @Default {null}
      */
    var interiorGradient: js.UndefOr[js.Any] = js.native
    
    /** Specify isRadialGradient value of circular gauge
      * @Default {false}
      */
    var isRadialGradient: js.UndefOr[Boolean] = js.native
    
    /** Specify isResponsive value of circular gauge
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.native
    
    /** Options to customize the legend.
      */
    var legend: js.UndefOr[Legend] = js.native
    
    /** Fires on clicking the legend item.
      */
    var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, Unit]] = js.native
    
    /** Fires before rendering the legend item. This event is fired for each legend item in CircularGauge. You can use this event to customize legend item shape or add custom text to
      * legend item.
      */
    var legendItemRender: js.UndefOr[js.Function1[/* e */ LegendItemRenderEventArgs, Unit]] = js.native
    
    /** Triggers while the gauge start to Load.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
    
    /** Name of the culture based on which circular gauge should be localized.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.native
    
    /** Specifies the maximum value of circular gauge.
      * @Default {100}
      */
    var maximum: js.UndefOr[Double] = js.native
    
    /** Specifies the minimum value of circular gauge.
      * @Default {0}
      */
    var minimum: js.UndefOr[Double] = js.native
    
    /** Triggers when the left mouse button is clicked.
      */
    var mouseClick: js.UndefOr[js.Function1[/* e */ MouseClickEventArgs, Unit]] = js.native
    
    /** Triggers when clicking and dragging the mouse pointer over the gauge pointer.
      */
    var mouseClickMove: js.UndefOr[js.Function1[/* e */ MouseClickMoveEventArgs, Unit]] = js.native
    
    /** Triggers when the mouse click is released.
      */
    var mouseClickUp: js.UndefOr[js.Function1[/* e */ MouseClickUpEventArgs, Unit]] = js.native
    
    /** Specify outerCustomLabelPosition value of circular gauge See
      * @Default {bottom}
      */
    var outerCustomLabelPosition: js.UndefOr[OuterCustomLabelPosition | String] = js.native
    
    /** Specifies the radius of circular gauge.
      * @Default {180}
      */
    var radius: js.UndefOr[Double] = js.native
    
    /** Fires when mouse moving on ranges.
      */
    var rangeMouseMove: js.UndefOr[js.Function1[/* e */ RangeMouseMoveEventArgs, Unit]] = js.native
    
    /** Specify range Z-order placement of circular gauge.
      * @Default {Rear}
      */
    var rangeZOrder: js.UndefOr[RangeZOrderPlacement | String] = js.native
    
    /** Specify readonly value of circular gauge
      * @Default {true}
      */
    var readOnly: js.UndefOr[Boolean] = js.native
    
    /** Triggers when the rendering of the gauge is completed.
      */
    var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.native
    
    /** Fires, on right clicking the circular gauge.
      */
    var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
    
    /** Specify the pointers, ticks, labels, indicators, ranges of circular gauge
      * @Default {null}
      */
    var scales: js.UndefOr[js.Array[Scale]] = js.native
    
    /** Specify the theme of circular gauge.
      * @Default {flatlight}
      */
    var theme: js.UndefOr[String] = js.native
    
    /** Specify tooltip option of circular gauge
      * @Default {object}
      */
    var tooltip: js.UndefOr[Tooltip] = js.native
    
    /** Specifies the value of circular gauge.
      * @Default {0}
      */
    var value: js.UndefOr[Double] = js.native
    
    /** Specifies the width of circular gauge.
      * @Default {360}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.datavisualization.CircularGauge.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.CircularGauge.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.CircularGauge.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setDistanceFromCorner(value: Double): Self = StObject.set(x, "distanceFromCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceFromCornerUndefined: Self = StObject.set(x, "distanceFromCorner", js.undefined)
      
      @scala.inline
      def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
      
      @scala.inline
      def setDrawCustomLabel(value: /* e */ DrawCustomLabelEventArgs => Unit): Self = StObject.set(x, "drawCustomLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawCustomLabelUndefined: Self = StObject.set(x, "drawCustomLabel", js.undefined)
      
      @scala.inline
      def setDrawIndicators(value: /* e */ DrawIndicatorsEventArgs => Unit): Self = StObject.set(x, "drawIndicators", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawIndicatorsUndefined: Self = StObject.set(x, "drawIndicators", js.undefined)
      
      @scala.inline
      def setDrawLabels(value: /* e */ DrawLabelsEventArgs => Unit): Self = StObject.set(x, "drawLabels", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawLabelsUndefined: Self = StObject.set(x, "drawLabels", js.undefined)
      
      @scala.inline
      def setDrawPointerCap(value: /* e */ DrawPointerCapEventArgs => Unit): Self = StObject.set(x, "drawPointerCap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawPointerCapUndefined: Self = StObject.set(x, "drawPointerCap", js.undefined)
      
      @scala.inline
      def setDrawPointers(value: /* e */ DrawPointersEventArgs => Unit): Self = StObject.set(x, "drawPointers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawPointersUndefined: Self = StObject.set(x, "drawPointers", js.undefined)
      
      @scala.inline
      def setDrawRange(value: /* e */ DrawRangeEventArgs => Unit): Self = StObject.set(x, "drawRange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawRangeUndefined: Self = StObject.set(x, "drawRange", js.undefined)
      
      @scala.inline
      def setDrawTicks(value: /* e */ DrawTicksEventArgs => Unit): Self = StObject.set(x, "drawTicks", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawTicksUndefined: Self = StObject.set(x, "drawTicks", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setEnableGroupSeparator(value: Boolean): Self = StObject.set(x, "enableGroupSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGroupSeparatorUndefined: Self = StObject.set(x, "enableGroupSeparator", js.undefined)
      
      @scala.inline
      def setEnableResize(value: Boolean): Self = StObject.set(x, "enableResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableResizeUndefined: Self = StObject.set(x, "enableResize", js.undefined)
      
      @scala.inline
      def setExportSettings(value: ExportSettings): Self = StObject.set(x, "exportSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportSettingsUndefined: Self = StObject.set(x, "exportSettings", js.undefined)
      
      @scala.inline
      def setFrame(value: Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setGaugePosition(value: gaugePosition | String): Self = StObject.set(x, "gaugePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaugePositionUndefined: Self = StObject.set(x, "gaugePosition", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setInteriorGradient(value: js.Any): Self = StObject.set(x, "interiorGradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteriorGradientUndefined: Self = StObject.set(x, "interiorGradient", js.undefined)
      
      @scala.inline
      def setIsRadialGradient(value: Boolean): Self = StObject.set(x, "isRadialGradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRadialGradientUndefined: Self = StObject.set(x, "isRadialGradient", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setLegend(value: Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendItemClick(value: /* e */ LegendItemClickEventArgs => Unit): Self = StObject.set(x, "legendItemClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLegendItemClickUndefined: Self = StObject.set(x, "legendItemClick", js.undefined)
      
      @scala.inline
      def setLegendItemRender(value: /* e */ LegendItemRenderEventArgs => Unit): Self = StObject.set(x, "legendItemRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLegendItemRenderUndefined: Self = StObject.set(x, "legendItemRender", js.undefined)
      
      @scala.inline
      def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      @scala.inline
      def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      @scala.inline
      def setMouseClick(value: /* e */ MouseClickEventArgs => Unit): Self = StObject.set(x, "mouseClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseClickMove(value: /* e */ MouseClickMoveEventArgs => Unit): Self = StObject.set(x, "mouseClickMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseClickMoveUndefined: Self = StObject.set(x, "mouseClickMove", js.undefined)
      
      @scala.inline
      def setMouseClickUndefined: Self = StObject.set(x, "mouseClick", js.undefined)
      
      @scala.inline
      def setMouseClickUp(value: /* e */ MouseClickUpEventArgs => Unit): Self = StObject.set(x, "mouseClickUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseClickUpUndefined: Self = StObject.set(x, "mouseClickUp", js.undefined)
      
      @scala.inline
      def setOuterCustomLabelPosition(value: OuterCustomLabelPosition | String): Self = StObject.set(x, "outerCustomLabelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterCustomLabelPositionUndefined: Self = StObject.set(x, "outerCustomLabelPosition", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRangeMouseMove(value: /* e */ RangeMouseMoveEventArgs => Unit): Self = StObject.set(x, "rangeMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRangeMouseMoveUndefined: Self = StObject.set(x, "rangeMouseMove", js.undefined)
      
      @scala.inline
      def setRangeZOrder(value: RangeZOrderPlacement | String): Self = StObject.set(x, "rangeZOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeZOrderUndefined: Self = StObject.set(x, "rangeZOrder", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRenderComplete(value: /* e */ RenderCompleteEventArgs => Unit): Self = StObject.set(x, "renderComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderCompleteUndefined: Self = StObject.set(x, "renderComplete", js.undefined)
      
      @scala.inline
      def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = StObject.set(x, "rightClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRightClickUndefined: Self = StObject.set(x, "rightClick", js.undefined)
      
      @scala.inline
      def setScales(value: js.Array[Scale]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
      
      @scala.inline
      def setScalesVarargs(value: Scale*): Self = StObject.set(x, "scales", js.Array(value :_*))
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait MouseClickEventArgs extends StObject {
    
    /** returns the angle of the pointer.
      */
    var angle: js.UndefOr[Double] = js.native
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the context element
      */
    var context: js.UndefOr[js.Any] = js.native
    
    /** returns the pointer element.
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the pointer Index
      */
    var index: js.UndefOr[Double] = js.native
    
    /** returns the gauge model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[js.Any] = js.native
    
    /** returns the startX and startY of the pointer.
      */
    var position: js.UndefOr[js.Any] = js.native
    
    /** returns the scale element.
      */
    var scaleElement: js.UndefOr[js.Any] = js.native
    
    /** returns the scaleIndex to which the pointer belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.native
    
    /** returns the pointer style
      */
    var style: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[js.Any] = js.native
    
    /** returns the value of the pointer.
      */
    var value: js.UndefOr[Double] = js.native
  }
  object MouseClickEventArgs {
    
    @scala.inline
    def apply(): MouseClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseClickEventArgs]
    }
    
    @scala.inline
    implicit class MouseClickEventArgsMutableBuilder[Self <: MouseClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setScaleElement(value: js.Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      @scala.inline
      def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait MouseClickMoveEventArgs extends StObject {
    
    /** returns the angle of the pointer.
      */
    var angle: js.UndefOr[Double] = js.native
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the context element
      */
    var context: js.UndefOr[js.Any] = js.native
    
    /** returns the pointer element.
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the pointer Index
      */
    var index: js.UndefOr[Double] = js.native
    
    /** returns the gauge model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[js.Any] = js.native
    
    /** returns the startX and startY of the pointer.
      */
    var position: js.UndefOr[js.Any] = js.native
    
    /** returns the scale element.
      */
    var scaleElement: js.UndefOr[js.Any] = js.native
    
    /** returns the scaleIndex to which the pointer belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.native
    
    /** returns the pointer style
      */
    var style: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[js.Any] = js.native
    
    /** returns the value of the pointer.
      */
    var value: js.UndefOr[Double] = js.native
  }
  object MouseClickMoveEventArgs {
    
    @scala.inline
    def apply(): MouseClickMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseClickMoveEventArgs]
    }
    
    @scala.inline
    implicit class MouseClickMoveEventArgsMutableBuilder[Self <: MouseClickMoveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setScaleElement(value: js.Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      @scala.inline
      def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait MouseClickUpEventArgs extends StObject {
    
    /** returns the angle of the pointer.
      */
    var angle: js.UndefOr[Double] = js.native
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the context element
      */
    var context: js.UndefOr[js.Any] = js.native
    
    /** returns the pointer element.
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the pointer Index
      */
    var index: js.UndefOr[Double] = js.native
    
    /** returns the gauge model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[js.Any] = js.native
    
    /** returns the startX and startY of the pointer.
      */
    var position: js.UndefOr[js.Any] = js.native
    
    /** returns the scale element.
      */
    var scaleElement: js.UndefOr[js.Any] = js.native
    
    /** returns the scaleIndex to which the pointer belongs.
      */
    var scaleIndex: js.UndefOr[Double] = js.native
    
    /** returns the pointer style
      */
    var style: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[js.Any] = js.native
    
    /** returns the value of the pointer.
      */
    var value: js.UndefOr[Double] = js.native
  }
  object MouseClickUpEventArgs {
    
    @scala.inline
    def apply(): MouseClickUpEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseClickUpEventArgs]
    }
    
    @scala.inline
    implicit class MouseClickUpEventArgsMutableBuilder[Self <: MouseClickUpEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setScaleElement(value: js.Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      @scala.inline
      def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleIndexUndefined: Self = StObject.set(x, "scaleIndex", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait RangeMouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Region of ranges
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the circulargauge model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RangeMouseMoveEventArgs {
    
    @scala.inline
    def apply(): RangeMouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeMouseMoveEventArgs]
    }
    
    @scala.inline
    implicit class RangeMouseMoveEventArgsMutableBuilder[Self <: RangeMouseMoveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RenderCompleteEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the context element
      */
    var context: js.UndefOr[js.Any] = js.native
    
    /** returns the gauge model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[js.Any] = js.native
    
    /** returns the entire scale element.
      */
    var scaleElement: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RenderCompleteEventArgs {
    
    @scala.inline
    def apply(): RenderCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderCompleteEventArgs]
    }
    
    @scala.inline
    implicit class RenderCompleteEventArgsMutableBuilder[Self <: RenderCompleteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setScaleElement(value: js.Any): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RightClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - X and Y co-ordinate of the points with respect to circular gauge area.id - ID of the target element.    size - Width and height of the circular gauge.    pageX -
      * x-coordinate of the pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the circular gauge model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RightClickEventArgs {
    
    @scala.inline
    def apply(): RightClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RightClickEventArgs]
    }
    
    @scala.inline
    implicit class RightClickEventArgsMutableBuilder[Self <: RightClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Scale extends StObject {
    
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
    var direction: js.UndefOr[typings.ejWebAll.ej.Direction | String] = js.native
    
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
    implicit class ScaleMutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorder(value: ScalesBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setCustomLabels(value: js.Array[ScalesCustomLabel]): Self = StObject.set(x, "customLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomLabelsUndefined: Self = StObject.set(x, "customLabels", js.undefined)
      
      @scala.inline
      def setCustomLabelsVarargs(value: ScalesCustomLabel*): Self = StObject.set(x, "customLabels", js.Array(value :_*))
      
      @scala.inline
      def setDirection(value: typings.ejWebAll.ej.Direction | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setIndicators(value: js.Array[ScalesIndicator]): Self = StObject.set(x, "indicators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorsUndefined: Self = StObject.set(x, "indicators", js.undefined)
      
      @scala.inline
      def setIndicatorsVarargs(value: ScalesIndicator*): Self = StObject.set(x, "indicators", js.Array(value :_*))
      
      @scala.inline
      def setLabels(value: js.Array[ScalesLabel]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setLabelsVarargs(value: ScalesLabel*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      @scala.inline
      def setMajorIntervalValue(value: Double): Self = StObject.set(x, "majorIntervalValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorIntervalValueUndefined: Self = StObject.set(x, "majorIntervalValue", js.undefined)
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      @scala.inline
      def setMinorIntervalValue(value: Double): Self = StObject.set(x, "minorIntervalValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorIntervalValueUndefined: Self = StObject.set(x, "minorIntervalValue", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPointerCap(value: ScalesPointerCap): Self = StObject.set(x, "pointerCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerCapUndefined: Self = StObject.set(x, "pointerCap", js.undefined)
      
      @scala.inline
      def setPointers(value: js.Array[ScalesPointer]): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointersUndefined: Self = StObject.set(x, "pointers", js.undefined)
      
      @scala.inline
      def setPointersVarargs(value: ScalesPointer*): Self = StObject.set(x, "pointers", js.Array(value :_*))
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRanges(value: js.Array[ScalesRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      @scala.inline
      def setRangesVarargs(value: ScalesRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
      
      @scala.inline
      def setShadowOffset(value: Double): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
      
      @scala.inline
      def setShowIndicators(value: Boolean): Self = StObject.set(x, "showIndicators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIndicatorsUndefined: Self = StObject.set(x, "showIndicators", js.undefined)
      
      @scala.inline
      def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
      
      @scala.inline
      def setShowPointers(value: Boolean): Self = StObject.set(x, "showPointers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPointersUndefined: Self = StObject.set(x, "showPointers", js.undefined)
      
      @scala.inline
      def setShowRanges(value: Boolean): Self = StObject.set(x, "showRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRangesUndefined: Self = StObject.set(x, "showRanges", js.undefined)
      
      @scala.inline
      def setShowScaleBar(value: Boolean): Self = StObject.set(x, "showScaleBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowScaleBarUndefined: Self = StObject.set(x, "showScaleBar", js.undefined)
      
      @scala.inline
      def setShowTicks(value: Boolean): Self = StObject.set(x, "showTicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTicksUndefined: Self = StObject.set(x, "showTicks", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      @scala.inline
      def setSubGauges(value: js.Array[ScalesSubGauge]): Self = StObject.set(x, "subGauges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubGaugesUndefined: Self = StObject.set(x, "subGauges", js.undefined)
      
      @scala.inline
      def setSubGaugesVarargs(value: ScalesSubGauge*): Self = StObject.set(x, "subGauges", js.Array(value :_*))
      
      @scala.inline
      def setSweepAngle(value: Double): Self = StObject.set(x, "sweepAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSweepAngleUndefined: Self = StObject.set(x, "sweepAngle", js.undefined)
      
      @scala.inline
      def setTicks(value: js.Array[ScalesTick]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      @scala.inline
      def setTicksVarargs(value: ScalesTick*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ScalesBorder extends StObject {
    
    /** Specify border color for scales of circular gauge
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specify border width of circular gauge
      * @Default {1.5}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object ScalesBorder {
    
    @scala.inline
    def apply(): ScalesBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesBorder]
    }
    
    @scala.inline
    implicit class ScalesBorderMutableBuilder[Self <: ScalesBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ScalesCustomLabel extends StObject {
    
    /** Color of the custom labels.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specify font for custom labels
      * @Default {Object}
      */
    var font: js.UndefOr[ScalesCustomLabelsFont] = js.native
    
    /** Specify position of custom labels
      * @Default {Object}
      */
    var position: js.UndefOr[ScalesCustomLabelsPosition] = js.native
    
    /** Specifies the position of the  custom labels. See
      * @Default {inner}
      */
    var positionType: js.UndefOr[CustomLabelPositionType | String] = js.native
    
    /** Specify angle for the rotation of the custom labels in degrees.
      * @Default {0}
      */
    var textAngle: js.UndefOr[Double] = js.native
    
    /** Value of the custom labels.
      */
    var value: js.UndefOr[String] = js.native
  }
  object ScalesCustomLabel {
    
    @scala.inline
    def apply(): ScalesCustomLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesCustomLabel]
    }
    
    @scala.inline
    implicit class ScalesCustomLabelMutableBuilder[Self <: ScalesCustomLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFont(value: ScalesCustomLabelsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setPosition(value: ScalesCustomLabelsPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionType(value: CustomLabelPositionType | String): Self = StObject.set(x, "positionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionTypeUndefined: Self = StObject.set(x, "positionType", js.undefined)
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTextAngle(value: Double): Self = StObject.set(x, "textAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAngleUndefined: Self = StObject.set(x, "textAngle", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ScalesCustomLabelsFont extends StObject {
    
    /** Specify font fontFamily for custom labels.
      * @Default {Arial}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Specify font Style for custom labels.
      * @Default {Bold}
      */
    var fontStyle: js.UndefOr[String] = js.native
    
    /** Specify font size for custom labels.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object ScalesCustomLabelsFont {
    
    @scala.inline
    def apply(): ScalesCustomLabelsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesCustomLabelsFont]
    }
    
    @scala.inline
    implicit class ScalesCustomLabelsFontMutableBuilder[Self <: ScalesCustomLabelsFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait ScalesCustomLabelsPosition extends StObject {
    
    /** Specify x-axis position of label
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.native
    
    /** Specify y-axis  position of labels.
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.native
  }
  object ScalesCustomLabelsPosition {
    
    @scala.inline
    def apply(): ScalesCustomLabelsPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesCustomLabelsPosition]
    }
    
    @scala.inline
    implicit class ScalesCustomLabelsPositionMutableBuilder[Self <: ScalesCustomLabelsPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait ScalesIndicator extends StObject {
    
    /** Specify indicator height of circular gauge
      * @Default {15}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Specify imageUrl of circular gauge
      * @Default {null}
      */
    var imageUrl: js.UndefOr[String] = js.native
    
    /** Specify position of circular gauge
      * @Default {Object}
      */
    var position: js.UndefOr[ScalesIndicatorsPosition] = js.native
    
    /** Specify the various states of circular gauge
      * @Default {Array}
      */
    var stateRanges: js.UndefOr[js.Array[ScalesIndicatorsStateRange]] = js.native
    
    /** Specify indicator style of circular gauge. See
      * @Default {Circle}
      */
    var `type`: js.UndefOr[IndicatorTypes | String] = js.native
    
    /** Specify indicator width of circular gauge
      * @Default {15}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object ScalesIndicator {
    
    @scala.inline
    def apply(): ScalesIndicator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesIndicator]
    }
    
    @scala.inline
    implicit class ScalesIndicatorMutableBuilder[Self <: ScalesIndicator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      @scala.inline
      def setPosition(value: ScalesIndicatorsPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStateRanges(value: js.Array[ScalesIndicatorsStateRange]): Self = StObject.set(x, "stateRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateRangesUndefined: Self = StObject.set(x, "stateRanges", js.undefined)
      
      @scala.inline
      def setStateRangesVarargs(value: ScalesIndicatorsStateRange*): Self = StObject.set(x, "stateRanges", js.Array(value :_*))
      
      @scala.inline
      def setType(value: IndicatorTypes | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ScalesIndicatorsPosition extends StObject {
    
    /** Specify x-axis of position of circular gauge
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.native
    
    /** Specify y-axis of position of circular gauge
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.native
  }
  object ScalesIndicatorsPosition {
    
    @scala.inline
    def apply(): ScalesIndicatorsPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesIndicatorsPosition]
    }
    
    @scala.inline
    implicit class ScalesIndicatorsPositionMutableBuilder[Self <: ScalesIndicatorsPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait ScalesIndicatorsStateRange extends StObject {
    
    /** Specify backgroundColor for indicator of circular gauge
      * @Default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.native
    
    /** Specify borderColor for indicator of circular gauge
      * @Default {null}
      */
    var borderColor: js.UndefOr[String] = js.native
    
    /** Specify end value for each specified state of circular gauge
      * @Default {0}
      */
    var endValue: js.UndefOr[Double] = js.native
    
    /** Specify value of the font as the indicator when the indicator style is set with the value &quot;text&quot; of circular gauge
      * @Default {null}
      */
    var font: js.UndefOr[js.Any] = js.native
    
    /** Specify start value for each specified state of circular gauge
      * @Default {0}
      */
    var startValue: js.UndefOr[Double] = js.native
    
    /** Specify value of the text as the indicator when the indicator style is set with the value &quot;text&quot; of circular gauge
      */
    var text: js.UndefOr[String] = js.native
    
    /** Specify value of the textColor as the indicator when the indicator style is set with the value &quot;text&quot; of circular gauge
      * @Default {null}
      */
    var textColor: js.UndefOr[String] = js.native
  }
  object ScalesIndicatorsStateRange {
    
    @scala.inline
    def apply(): ScalesIndicatorsStateRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesIndicatorsStateRange]
    }
    
    @scala.inline
    implicit class ScalesIndicatorsStateRangeMutableBuilder[Self <: ScalesIndicatorsStateRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
      
      @scala.inline
      def setFont(value: js.Any): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait ScalesLabel extends StObject {
    
    /** Specify the angle for the labels of circular gauge
      * @Default {0}
      */
    var angle: js.UndefOr[Double] = js.native
    
    /** Specify labels autoAngle value of circular gauge
      * @Default {false}
      */
    var autoAngle: js.UndefOr[Boolean] = js.native
    
    /** Specify label color of circular gauge
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specify distanceFromScale value for labels of circular gauge
      * @Default {0}
      */
    var distanceFromScale: js.UndefOr[Double] = js.native
    
    /** Specify font for labels of circular gauge
      * @Default {Object}
      */
    var font: js.UndefOr[ScalesLabelsFont] = js.native
    
    /** Specify includeFirstValue of circular gauge
      * @Default {true}
      */
    var includeFirstValue: js.UndefOr[Boolean] = js.native
    
    /** Specify opacity value for labels of circular gauge
      * @Default {null}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specify label placement of circular gauge. See
      * @Default {Near}
      */
    var placement: js.UndefOr[Placement | String] = js.native
    
    /** Specify label Style of circular gauge. See
      * @Default {Major}
      */
    var `type`: js.UndefOr[LabelType | String] = js.native
    
    /** Specify unitText of circular gauge
      */
    var unitText: js.UndefOr[String] = js.native
    
    /** Specify unitTextPosition of circular gauge. See UnitTextPosition
      * @Default {Back}
      */
    var unitTextPosition: js.UndefOr[UnitTextPlacement | String] = js.native
  }
  object ScalesLabel {
    
    @scala.inline
    def apply(): ScalesLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesLabel]
    }
    
    @scala.inline
    implicit class ScalesLabelMutableBuilder[Self <: ScalesLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setAutoAngle(value: Boolean): Self = StObject.set(x, "autoAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAngleUndefined: Self = StObject.set(x, "autoAngle", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDistanceFromScale(value: Double): Self = StObject.set(x, "distanceFromScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceFromScaleUndefined: Self = StObject.set(x, "distanceFromScale", js.undefined)
      
      @scala.inline
      def setFont(value: ScalesLabelsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setIncludeFirstValue(value: Boolean): Self = StObject.set(x, "includeFirstValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeFirstValueUndefined: Self = StObject.set(x, "includeFirstValue", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement | String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setType(value: LabelType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnitText(value: String): Self = StObject.set(x, "unitText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitTextPosition(value: UnitTextPlacement | String): Self = StObject.set(x, "unitTextPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitTextPositionUndefined: Self = StObject.set(x, "unitTextPosition", js.undefined)
      
      @scala.inline
      def setUnitTextUndefined: Self = StObject.set(x, "unitText", js.undefined)
    }
  }
  
  @js.native
  trait ScalesLabelsFont extends StObject {
    
    /** Specify font fontFamily for labels of circular gauge
      * @Default {Arial}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Specify font Style for labels of circular gauge
      * @Default {Bold}
      */
    var fontStyle: js.UndefOr[String] = js.native
    
    /** Specify font size for labels of circular gauge
      * @Default {11px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object ScalesLabelsFont {
    
    @scala.inline
    def apply(): ScalesLabelsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesLabelsFont]
    }
    
    @scala.inline
    implicit class ScalesLabelsFontMutableBuilder[Self <: ScalesLabelsFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait ScalesPointer extends StObject {
    
    /** Specify backNeedleLength of circular gauge
      * @Default {10}
      */
    var backNeedleLength: js.UndefOr[Double] = js.native
    
    /** Specify backgroundColor for the pointer of circular gauge
      * @Default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.native
    
    /** Specify the border for pointers of circular gauge
      * @Default {Object}
      */
    var border: js.UndefOr[ScalesPointersBorder] = js.native
    
    /** Specify distanceFromScale value for pointers of circular gauge
      * @Default {0}
      */
    var distanceFromScale: js.UndefOr[Double] = js.native
    
    /** Specify pointer gradients of circular gauge
      * @Default {null}
      */
    var gradients: js.UndefOr[js.Any] = js.native
    
    /** Specify pointer image of circular gauge.It is applicable for both marker as well as needle type pointers.
      * @Default {NULL}
      */
    var imageUrl: js.UndefOr[String] = js.native
    
    /** Specify pointer length of circular gauge
      * @Default {150}
      */
    var length: js.UndefOr[Double] = js.native
    
    /** Specify marker Style value of circular gauge. See
      * @Default {Rectangle}
      */
    var markerType: js.UndefOr[MarkerType | String] = js.native
    
    /** Specify needle Style value of circular gauge. See
      * @Default {Triangle}
      */
    var needleType: js.UndefOr[NeedleType | String] = js.native
    
    /** Specify opacity value for pointer of circular gauge
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specify pointer Placement value of circular gauge. See PointerPlacement
      * @Default {Near}
      */
    var placement: js.UndefOr[Placement | String] = js.native
    
    /** Specify pointer value text of circular gauge.
      * @Default {Object}
      */
    var pointerValueText: js.UndefOr[ScalesPointersPointerValueText] = js.native
    
    /** Specify radius value for pointer of circular gauge
      * @Default {null}
      */
    var radius: js.UndefOr[Double] = js.native
    
    /** Specify showBackNeedle value of circular gauge
      * @Default {false}
      */
    var showBackNeedle: js.UndefOr[Boolean] = js.native
    
    /** Specify pointer type value of circular gauge. See
      * @Default {Needle}
      */
    var `type`: js.UndefOr[PointerType | String] = js.native
    
    /** Specify value of the pointer of circular gauge
      * @Default {null}
      */
    var value: js.UndefOr[Double] = js.native
    
    /** Specify pointer width of circular gauge
      * @Default {7}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object ScalesPointer {
    
    @scala.inline
    def apply(): ScalesPointer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesPointer]
    }
    
    @scala.inline
    implicit class ScalesPointerMutableBuilder[Self <: ScalesPointer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackNeedleLength(value: Double): Self = StObject.set(x, "backNeedleLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackNeedleLengthUndefined: Self = StObject.set(x, "backNeedleLength", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorder(value: ScalesPointersBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setDistanceFromScale(value: Double): Self = StObject.set(x, "distanceFromScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceFromScaleUndefined: Self = StObject.set(x, "distanceFromScale", js.undefined)
      
      @scala.inline
      def setGradients(value: js.Any): Self = StObject.set(x, "gradients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientsUndefined: Self = StObject.set(x, "gradients", js.undefined)
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setMarkerType(value: MarkerType | String): Self = StObject.set(x, "markerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerTypeUndefined: Self = StObject.set(x, "markerType", js.undefined)
      
      @scala.inline
      def setNeedleType(value: NeedleType | String): Self = StObject.set(x, "needleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedleTypeUndefined: Self = StObject.set(x, "needleType", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement | String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPointerValueText(value: ScalesPointersPointerValueText): Self = StObject.set(x, "pointerValueText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerValueTextUndefined: Self = StObject.set(x, "pointerValueText", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setShowBackNeedle(value: Boolean): Self = StObject.set(x, "showBackNeedle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowBackNeedleUndefined: Self = StObject.set(x, "showBackNeedle", js.undefined)
      
      @scala.inline
      def setType(value: PointerType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ScalesPointerCap extends StObject {
    
    /** Specify cap backgroundColor of circular gauge
      * @Default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.native
    
    /** Specify cap borderColor of circular gauge
      * @Default {null}
      */
    var borderColor: js.UndefOr[String] = js.native
    
    /** Specify pointerCap borderWidth value of circular gauge
      * @Default {3}
      */
    var borderWidth: js.UndefOr[Double] = js.native
    
    /** Specify cap interiorGradient value of circular gauge
      * @Default {null}
      */
    var interiorGradient: js.UndefOr[js.Any] = js.native
    
    /** Specify pointerCap Radius value of circular gauge
      * @Default {7}
      */
    var radius: js.UndefOr[Double] = js.native
  }
  object ScalesPointerCap {
    
    @scala.inline
    def apply(): ScalesPointerCap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesPointerCap]
    }
    
    @scala.inline
    implicit class ScalesPointerCapMutableBuilder[Self <: ScalesPointerCap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setInteriorGradient(value: js.Any): Self = StObject.set(x, "interiorGradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteriorGradientUndefined: Self = StObject.set(x, "interiorGradient", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  @js.native
  trait ScalesPointersBorder extends StObject {
    
    /** Specify border color for pointer of circular gauge
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specify border width for pointers of circular gauge
      * @Default {1.5}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object ScalesPointersBorder {
    
    @scala.inline
    def apply(): ScalesPointersBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesPointersBorder]
    }
    
    @scala.inline
    implicit class ScalesPointersBorderMutableBuilder[Self <: ScalesPointersBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ScalesPointersPointerValueText extends StObject {
    
    /** Specify pointer text angle of circular gauge.
      * @Default {0}
      */
    var angle: js.UndefOr[Double] = js.native
    
    /** Specify pointer text auto angle of circular gauge.
      * @Default {false}
      */
    var autoAngle: js.UndefOr[Boolean] = js.native
    
    /** Specify pointer value text color of circular gauge.
      * @Default {#8c8c8c}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specify pointer value text distance from pointer of circular gauge.
      * @Default {20}
      */
    var distance: js.UndefOr[Double] = js.native
    
    /** Specify pointer value text font option of circular gauge.
      * @Default {object}
      */
    var font: js.UndefOr[ScalesPointersPointerValueTextFont] = js.native
    
    /** Specify pointer value text opacity of circular gauge.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** enable pointer value text visibility of circular gauge.
      * @Default {false}
      */
    var showValue: js.UndefOr[Boolean] = js.native
  }
  object ScalesPointersPointerValueText {
    
    @scala.inline
    def apply(): ScalesPointersPointerValueText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesPointersPointerValueText]
    }
    
    @scala.inline
    implicit class ScalesPointersPointerValueTextMutableBuilder[Self <: ScalesPointersPointerValueText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setAutoAngle(value: Boolean): Self = StObject.set(x, "autoAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAngleUndefined: Self = StObject.set(x, "autoAngle", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      @scala.inline
      def setFont(value: ScalesPointersPointerValueTextFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setShowValue(value: Boolean): Self = StObject.set(x, "showValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowValueUndefined: Self = StObject.set(x, "showValue", js.undefined)
    }
  }
  
  @js.native
  trait ScalesPointersPointerValueTextFont extends StObject {
    
    /** Specify pointer value text font family of circular gauge.
      * @Default {Arial}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Specify pointer value text font style of circular gauge.
      * @Default {Bold}
      */
    var fontStyle: js.UndefOr[String] = js.native
    
    /** Specify pointer value text size of circular gauge.
      * @Default {11px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object ScalesPointersPointerValueTextFont {
    
    @scala.inline
    def apply(): ScalesPointersPointerValueTextFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesPointersPointerValueTextFont]
    }
    
    @scala.inline
    implicit class ScalesPointersPointerValueTextFontMutableBuilder[Self <: ScalesPointersPointerValueTextFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait ScalesRange extends StObject {
    
    /** Specify backgroundColor for the ranges of circular gauge
      * @Default {#32b3c6}
      */
    var backgroundColor: js.UndefOr[String] = js.native
    
    /** Specify border for ranges of circular gauge
      * @Default {Object}
      */
    var border: js.UndefOr[ScalesRangesBorder] = js.native
    
    /** Specify distanceFromScale value for ranges of circular gauge
      * @Default {25}
      */
    var distanceFromScale: js.UndefOr[Double] = js.native
    
    /** Specify endValue for ranges of circular gauge
      * @Default {null}
      */
    var endValue: js.UndefOr[Double] = js.native
    
    /** Specify endWidth for ranges of circular gauge
      * @Default {10}
      */
    var endWidth: js.UndefOr[Double] = js.native
    
    /** Specify range gradients of circular gauge
      * @Default {null}
      */
    var gradients: js.UndefOr[js.Any] = js.native
    
    /** Specify text for the ranges of circular gauge
      * @Default {null}
      */
    var legendText: js.UndefOr[String] = js.native
    
    /** Specify opacity value for ranges of circular gauge
      * @Default {null}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specify placement of circular gauge. See RangePlacement
      * @Default {Near}
      */
    var placement: js.UndefOr[Placement | String] = js.native
    
    /** Specify size of the range value of circular gauge
      * @Default {5}
      */
    var size: js.UndefOr[Double] = js.native
    
    /** Specify startValue for ranges of circular gauge
      * @Default {null}
      */
    var startValue: js.UndefOr[Double] = js.native
    
    /** Specify startWidth of circular gauge
      * @Default {[Array.number] scale.ranges.startWidth = 10}
      */
    var startWidth: js.UndefOr[Double] = js.native
  }
  object ScalesRange {
    
    @scala.inline
    def apply(): ScalesRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesRange]
    }
    
    @scala.inline
    implicit class ScalesRangeMutableBuilder[Self <: ScalesRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorder(value: ScalesRangesBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setDistanceFromScale(value: Double): Self = StObject.set(x, "distanceFromScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceFromScaleUndefined: Self = StObject.set(x, "distanceFromScale", js.undefined)
      
      @scala.inline
      def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
      
      @scala.inline
      def setEndWidth(value: Double): Self = StObject.set(x, "endWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndWidthUndefined: Self = StObject.set(x, "endWidth", js.undefined)
      
      @scala.inline
      def setGradients(value: js.Any): Self = StObject.set(x, "gradients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientsUndefined: Self = StObject.set(x, "gradients", js.undefined)
      
      @scala.inline
      def setLegendText(value: String): Self = StObject.set(x, "legendText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendTextUndefined: Self = StObject.set(x, "legendText", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement | String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
      
      @scala.inline
      def setStartWidth(value: Double): Self = StObject.set(x, "startWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartWidthUndefined: Self = StObject.set(x, "startWidth", js.undefined)
    }
  }
  
  @js.native
  trait ScalesRangesBorder extends StObject {
    
    /** Specify border color for ranges of circular gauge
      * @Default {#32b3c6}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specify border width for ranges of circular gauge
      * @Default {1.5}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object ScalesRangesBorder {
    
    @scala.inline
    def apply(): ScalesRangesBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesRangesBorder]
    }
    
    @scala.inline
    implicit class ScalesRangesBorderMutableBuilder[Self <: ScalesRangesBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ScalesSubGauge extends StObject {
    
    /** Specify subGauge Height of circular gauge
      * @Default {150}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Specify position for sub-gauge of circular gauge
      * @Default {Object}
      */
    var position: js.UndefOr[ScalesSubGaugesPosition] = js.native
    
    /** Specify subGauge Width of circular gauge
      * @Default {150}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object ScalesSubGauge {
    
    @scala.inline
    def apply(): ScalesSubGauge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesSubGauge]
    }
    
    @scala.inline
    implicit class ScalesSubGaugeMutableBuilder[Self <: ScalesSubGauge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPosition(value: ScalesSubGaugesPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ScalesSubGaugesPosition extends StObject {
    
    /** Specify x-axis position for sub-gauge of circular gauge
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.native
    
    /** Specify y-axis position for sub-gauge of circular gauge
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.native
  }
  object ScalesSubGaugesPosition {
    
    @scala.inline
    def apply(): ScalesSubGaugesPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesSubGaugesPosition]
    }
    
    @scala.inline
    implicit class ScalesSubGaugesPositionMutableBuilder[Self <: ScalesSubGaugesPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait ScalesTick extends StObject {
    
    /** Specify the angle for the ticks of circular gauge
      * @Default {0}
      */
    var angle: js.UndefOr[Double] = js.native
    
    /** Specify tick color of circular gauge
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specify distanceFromScale value for ticks of circular gauge
      * @Default {0}
      */
    var distanceFromScale: js.UndefOr[Double] = js.native
    
    /** Specify tick height of circular gauge
      * @Default {16}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Specify tick placement of circular gauge. See TickPlacement
      * @Default {Near}
      */
    var placement: js.UndefOr[Placement | String] = js.native
    
    /** Specify tick Style of circular gauge. See TickType
      * @Default {Major}
      */
    var `type`: js.UndefOr[LabelType | String] = js.native
    
    /** Specify tick width of circular gauge
      * @Default {3}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object ScalesTick {
    
    @scala.inline
    def apply(): ScalesTick = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalesTick]
    }
    
    @scala.inline
    implicit class ScalesTickMutableBuilder[Self <: ScalesTick] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDistanceFromScale(value: Double): Self = StObject.set(x, "distanceFromScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceFromScaleUndefined: Self = StObject.set(x, "distanceFromScale", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement | String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setType(value: LabelType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Tooltip extends StObject {
    
    /** enable showCustomLabelTooltip of circular gauge
      * @Default {false}
      */
    var showCustomLabelTooltip: js.UndefOr[Boolean] = js.native
    
    /** enable showLabelTooltip of circular gauge
      * @Default {false}
      */
    var showLabelTooltip: js.UndefOr[Boolean] = js.native
    
    /** Specify tooltip templateID of circular gauge
      * @Default {false}
      */
    var templateID: js.UndefOr[String] = js.native
  }
  object Tooltip {
    
    @scala.inline
    def apply(): Tooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tooltip]
    }
    
    @scala.inline
    implicit class TooltipMutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowCustomLabelTooltip(value: Boolean): Self = StObject.set(x, "showCustomLabelTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCustomLabelTooltipUndefined: Self = StObject.set(x, "showCustomLabelTooltip", js.undefined)
      
      @scala.inline
      def setShowLabelTooltip(value: Boolean): Self = StObject.set(x, "showLabelTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLabelTooltipUndefined: Self = StObject.set(x, "showLabelTooltip", js.undefined)
      
      @scala.inline
      def setTemplateID(value: String): Self = StObject.set(x, "templateID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateIDUndefined: Self = StObject.set(x, "templateID", js.undefined)
    }
  }
}
