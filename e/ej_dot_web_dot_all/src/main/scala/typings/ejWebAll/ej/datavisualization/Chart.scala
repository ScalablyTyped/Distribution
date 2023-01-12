package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart
  extends StObject
     with Widget_ {
  
  /** Animates the series and/or indicators in Chart. When parameter is not passed to this method, then all the series and indicators present in Chart are animated.
    * @param {any} If an array collection is passed as parameter, series and indicator objects passed in array collection are animated.ExampleIf a series or indicator object is passed
    * to this method, then the specific series or indicator is animated.Example,
    * @returns {void}
    */
  def animate(options: Any): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Exports chart as an image or to an excel file. Chart can be exported as an image only when exportCanvasRendering option is set to true.
    * @param {string} Type of the export operation to be performed. Following are the two export types that are supported now,1. 'image'2. 'excel'Example
    * @param {string} URL of the service, where the chart will be exported to excel.Example,
    * @param {boolean} When this parameter is true, all the chart objects initialized to the same document are exported to a single excel file. This is an optional parameter. By
    * default, it is false.Example,
    * @returns {any}
    */
  def `export`(`type`: String, URL: String, exportMultipleChart: Boolean): Any = js.native
  
  @JSName("model")
  var model_Chart: Model = js.native
  
  /** Prints the rendered chart.
    * @returns {void}
    */
  def print(): Unit = js.native
  
  /** Redraws the entire chart. You can call this method whenever you update, add or remove points from the data source or whenever you want to refresh the UI.
    * @returns {void}
    */
  def redraw(): Unit = js.native
}
object Chart {
  
  @js.native
  sealed trait Alignment extends StObject
  @JSGlobal("ej.datavisualization.Chart.Alignment")
  @js.native
  object Alignment extends StObject {
    
    //string
    @js.native
    sealed trait Center
      extends StObject
         with Alignment
    
    //string
    @js.native
    sealed trait Far
      extends StObject
         with Alignment
    
    //string
    @js.native
    sealed trait Near
      extends StObject
         with Alignment
  }
  
  @js.native
  sealed trait AxisOrientation extends StObject
  @JSGlobal("ej.datavisualization.Chart.AxisOrientation")
  @js.native
  object AxisOrientation extends StObject {
    
    //string
    @js.native
    sealed trait Horizontal
      extends StObject
         with AxisOrientation
    
    //string
    @js.native
    sealed trait Vertical
      extends StObject
         with AxisOrientation
  }
  
  @js.native
  sealed trait ColumnFacet extends StObject
  @JSGlobal("ej.datavisualization.Chart.ColumnFacet")
  @js.native
  object ColumnFacet extends StObject {
    
    //string
    @js.native
    sealed trait Cylinder
      extends StObject
         with ColumnFacet
    
    //string
    @js.native
    sealed trait Rectangle
      extends StObject
         with ColumnFacet
  }
  
  @js.native
  sealed trait ConnectorLineType extends StObject
  @JSGlobal("ej.datavisualization.Chart.ConnectorLineType")
  @js.native
  object ConnectorLineType extends StObject {
    
    //string
    @js.native
    sealed trait Bezier
      extends StObject
         with ConnectorLineType
    
    //string
    @js.native
    sealed trait Line
      extends StObject
         with ConnectorLineType
  }
  
  @js.native
  sealed trait CoordinateUnit extends StObject
  @JSGlobal("ej.datavisualization.Chart.CoordinateUnit")
  @js.native
  object CoordinateUnit extends StObject {
    
    //string
    @js.native
    sealed trait None
      extends StObject
         with CoordinateUnit
    
    //string
    @js.native
    sealed trait Pixels
      extends StObject
         with CoordinateUnit
    
    //string
    @js.native
    sealed trait Points
      extends StObject
         with CoordinateUnit
  }
  
  @js.native
  sealed trait CrosshairMode extends StObject
  @JSGlobal("ej.datavisualization.Chart.CrosshairMode")
  @js.native
  object CrosshairMode extends StObject {
    
    //string
    @js.native
    sealed trait Float
      extends StObject
         with CrosshairMode
    
    //string
    @js.native
    sealed trait Grouping
      extends StObject
         with CrosshairMode
  }
  
  @js.native
  sealed trait CrosshairType extends StObject
  @JSGlobal("ej.datavisualization.Chart.CrosshairType")
  @js.native
  object CrosshairType extends StObject {
    
    //string
    @js.native
    sealed trait Crosshair
      extends StObject
         with CrosshairType
    
    //string
    @js.native
    sealed trait Trackball
      extends StObject
         with CrosshairType
  }
  
  @js.native
  sealed trait DrawType extends StObject
  @JSGlobal("ej.datavisualization.Chart.DrawType")
  @js.native
  object DrawType extends StObject {
    
    //string
    @js.native
    sealed trait Area
      extends StObject
         with DrawType
    
    //string
    @js.native
    sealed trait Column
      extends StObject
         with DrawType
    
    //string
    @js.native
    sealed trait Line
      extends StObject
         with DrawType
  }
  
  @js.native
  sealed trait EdgeLabelPlacement extends StObject
  @JSGlobal("ej.datavisualization.Chart.EdgeLabelPlacement")
  @js.native
  object EdgeLabelPlacement extends StObject {
    
    //string
    @js.native
    sealed trait Hide
      extends StObject
         with EdgeLabelPlacement
    
    //string
    @js.native
    sealed trait None
      extends StObject
         with EdgeLabelPlacement
    
    //string
    @js.native
    sealed trait Shift
      extends StObject
         with EdgeLabelPlacement
  }
  
  @js.native
  sealed trait EmptyPointMode extends StObject
  @JSGlobal("ej.datavisualization.Chart.EmptyPointMode")
  @js.native
  object EmptyPointMode extends StObject {
    
    //string
    @js.native
    sealed trait Average
      extends StObject
         with EmptyPointMode
    
    //string
    @js.native
    sealed trait Gap
      extends StObject
         with EmptyPointMode
    
    //string
    @js.native
    sealed trait Zero
      extends StObject
         with EmptyPointMode
  }
  
  @js.native
  sealed trait ErrorBarDirection extends StObject
  @JSGlobal("ej.datavisualization.Chart.ErrorBarDirection")
  @js.native
  object ErrorBarDirection extends StObject {
    
    //string
    @js.native
    sealed trait Both
      extends StObject
         with ErrorBarDirection
    
    //string
    @js.native
    sealed trait Minus
      extends StObject
         with ErrorBarDirection
    
    //string
    @js.native
    sealed trait Plus
      extends StObject
         with ErrorBarDirection
  }
  
  @js.native
  sealed trait ErrorBarMode extends StObject
  @JSGlobal("ej.datavisualization.Chart.ErrorBarMode")
  @js.native
  object ErrorBarMode extends StObject {
    
    //string
    @js.native
    sealed trait Both
      extends StObject
         with ErrorBarMode
    
    //string
    @js.native
    sealed trait Horizontal
      extends StObject
         with ErrorBarMode
    
    //string
    @js.native
    sealed trait Vertical
      extends StObject
         with ErrorBarMode
  }
  
  @js.native
  sealed trait ErrorBarType extends StObject
  @JSGlobal("ej.datavisualization.Chart.ErrorBarType")
  @js.native
  object ErrorBarType extends StObject {
    
    //string
    @js.native
    sealed trait FixedValue
      extends StObject
         with ErrorBarType
    
    //string
    @js.native
    sealed trait Percentage
      extends StObject
         with ErrorBarType
    
    //string
    @js.native
    sealed trait StandardDeviation
      extends StObject
         with ErrorBarType
    
    //string
    @js.native
    sealed trait StandardError
      extends StObject
         with ErrorBarType
  }
  
  @js.native
  sealed trait ExportingMode extends StObject
  @JSGlobal("ej.datavisualization.Chart.ExportingMode")
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
  sealed trait ExportingOrientation extends StObject
  @JSGlobal("ej.datavisualization.Chart.ExportingOrientation")
  @js.native
  object ExportingOrientation extends StObject {
    
    //string
    @js.native
    sealed trait Landscape
      extends StObject
         with ExportingOrientation
    
    //string
    @js.native
    sealed trait Portrait
      extends StObject
         with ExportingOrientation
  }
  
  @js.native
  sealed trait ExportingType extends StObject
  @JSGlobal("ej.datavisualization.Chart.ExportingType")
  @js.native
  object ExportingType extends StObject {
    
    //string
    @js.native
    sealed trait DOCX
      extends StObject
         with ExportingType
    
    //string
    @js.native
    sealed trait JPG
      extends StObject
         with ExportingType
    
    //string
    @js.native
    sealed trait PDF
      extends StObject
         with ExportingType
    
    //string
    @js.native
    sealed trait PNG
      extends StObject
         with ExportingType
    
    //string
    @js.native
    sealed trait SVG
      extends StObject
         with ExportingType
    
    //string
    @js.native
    sealed trait XLSX
      extends StObject
         with ExportingType
  }
  
  @js.native
  sealed trait FontStyle extends StObject
  @JSGlobal("ej.datavisualization.Chart.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    //string
    @js.native
    sealed trait Italic
      extends StObject
         with FontStyle
    
    //string
    @js.native
    sealed trait Normal
      extends StObject
         with FontStyle
  }
  
  @js.native
  sealed trait FontWeight extends StObject
  @JSGlobal("ej.datavisualization.Chart.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    //string
    @js.native
    sealed trait Bold
      extends StObject
         with FontWeight
    
    //string
    @js.native
    sealed trait Lighter
      extends StObject
         with FontWeight
    
    //string
    @js.native
    sealed trait Regular
      extends StObject
         with FontWeight
  }
  
  @js.native
  sealed trait HorizontalAlignment extends StObject
  @JSGlobal("ej.datavisualization.Chart.HorizontalAlignment")
  @js.native
  object HorizontalAlignment extends StObject {
    
    //string
    @js.native
    sealed trait Left
      extends StObject
         with HorizontalAlignment
    
    //string
    @js.native
    sealed trait Middle
      extends StObject
         with HorizontalAlignment
    
    //string
    @js.native
    sealed trait Right
      extends StObject
         with HorizontalAlignment
  }
  
  @js.native
  sealed trait HorizontalTextAlignment extends StObject
  @JSGlobal("ej.datavisualization.Chart.HorizontalTextAlignment")
  @js.native
  object HorizontalTextAlignment extends StObject {
    
    //string
    @js.native
    sealed trait Center
      extends StObject
         with HorizontalTextAlignment
    
    //string
    @js.native
    sealed trait Far
      extends StObject
         with HorizontalTextAlignment
    
    //string
    @js.native
    sealed trait Near
      extends StObject
         with HorizontalTextAlignment
  }
  
  @js.native
  sealed trait IntervalType extends StObject
  @JSGlobal("ej.datavisualization.Chart.IntervalType")
  @js.native
  object IntervalType extends StObject {
    
    //string
    @js.native
    sealed trait Days
      extends StObject
         with IntervalType
    
    //string
    @js.native
    sealed trait Hours
      extends StObject
         with IntervalType
    
    //string
    @js.native
    sealed trait Milliseconds
      extends StObject
         with IntervalType
    
    //string
    @js.native
    sealed trait Minutes
      extends StObject
         with IntervalType
    
    //string
    @js.native
    sealed trait Months
      extends StObject
         with IntervalType
    
    //string
    @js.native
    sealed trait Seconds
      extends StObject
         with IntervalType
    
    //string
    @js.native
    sealed trait Years
      extends StObject
         with IntervalType
  }
  
  @js.native
  sealed trait LabelAlignment extends StObject
  @JSGlobal("ej.datavisualization.Chart.LabelAlignment")
  @js.native
  object LabelAlignment extends StObject {
    
    //string
    @js.native
    sealed trait Center
      extends StObject
         with LabelAlignment
    
    //string
    @js.native
    sealed trait Far
      extends StObject
         with LabelAlignment
    
    //string
    @js.native
    sealed trait Near
      extends StObject
         with LabelAlignment
  }
  
  @js.native
  sealed trait LabelIntersectAction extends StObject
  @JSGlobal("ej.datavisualization.Chart.LabelIntersectAction")
  @js.native
  object LabelIntersectAction extends StObject {
    
    //string
    @js.native
    sealed trait Hide
      extends StObject
         with LabelIntersectAction
    
    //string
    @js.native
    sealed trait MultipleRows
      extends StObject
         with LabelIntersectAction
    
    //string
    @js.native
    sealed trait None
      extends StObject
         with LabelIntersectAction
    
    //string
    @js.native
    sealed trait Rotate45
      extends StObject
         with LabelIntersectAction
    
    //string
    @js.native
    sealed trait Rotate90
      extends StObject
         with LabelIntersectAction
    
    //string
    @js.native
    sealed trait Trim
      extends StObject
         with LabelIntersectAction
    
    //string
    @js.native
    sealed trait Wrap
      extends StObject
         with LabelIntersectAction
    
    //string
    @js.native
    sealed trait WrapByword
      extends StObject
         with LabelIntersectAction
  }
  
  @js.native
  sealed trait LabelPlacement extends StObject
  @JSGlobal("ej.datavisualization.Chart.LabelPlacement")
  @js.native
  object LabelPlacement extends StObject {
    
    //string
    @js.native
    sealed trait BetweenTicks
      extends StObject
         with LabelPlacement
    
    //string
    @js.native
    sealed trait OnTicks
      extends StObject
         with LabelPlacement
  }
  
  @js.native
  sealed trait LabelPosition extends StObject
  @JSGlobal("ej.datavisualization.Chart.LabelPosition")
  @js.native
  object LabelPosition extends StObject {
    
    //string
    @js.native
    sealed trait Inside
      extends StObject
         with LabelPosition
    
    //string
    @js.native
    sealed trait Outside
      extends StObject
         with LabelPosition
    
    //string
    @js.native
    sealed trait OutsideExtended
      extends StObject
         with LabelPosition
  }
  
  @js.native
  sealed trait LineCap extends StObject
  @JSGlobal("ej.datavisualization.Chart.LineCap")
  @js.native
  object LineCap extends StObject {
    
    //string
    @js.native
    sealed trait Butt
      extends StObject
         with LineCap
    
    //string
    @js.native
    sealed trait Round
      extends StObject
         with LineCap
    
    //string
    @js.native
    sealed trait Square
      extends StObject
         with LineCap
  }
  
  @js.native
  sealed trait LineJoin extends StObject
  @JSGlobal("ej.datavisualization.Chart.LineJoin")
  @js.native
  object LineJoin extends StObject {
    
    //string
    @js.native
    sealed trait Bevel
      extends StObject
         with LineJoin
    
    //string
    @js.native
    sealed trait Miter
      extends StObject
         with LineJoin
    
    //string
    @js.native
    sealed trait Round
      extends StObject
         with LineJoin
  }
  
  @js.native
  sealed trait Mode extends StObject
  @JSGlobal("ej.datavisualization.Chart.Mode")
  @js.native
  object Mode extends StObject {
    
    //string
    @js.native
    sealed trait Cluster
      extends StObject
         with Mode
    
    //string
    @js.native
    sealed trait Point
      extends StObject
         with Mode
    
    //string
    @js.native
    sealed trait Range
      extends StObject
         with Mode
    
    //string
    @js.native
    sealed trait Series
      extends StObject
         with Mode
  }
  
  @js.native
  sealed trait MultiLevelLabelsBorderType extends StObject
  @JSGlobal("ej.datavisualization.Chart.MultiLevelLabelsBorderType")
  @js.native
  object MultiLevelLabelsBorderType extends StObject {
    
    //string
    @js.native
    sealed trait Brace
      extends StObject
         with MultiLevelLabelsBorderType
    
    //string
    @js.native
    sealed trait CurlyBrace
      extends StObject
         with MultiLevelLabelsBorderType
    
    //string
    @js.native
    sealed trait None
      extends StObject
         with MultiLevelLabelsBorderType
    
    //string
    @js.native
    sealed trait Rectangle
      extends StObject
         with MultiLevelLabelsBorderType
    
    //string
    @js.native
    sealed trait WithoutTopAndBottom
      extends StObject
         with MultiLevelLabelsBorderType
  }
  
  @js.native
  sealed trait Position extends StObject
  @JSGlobal("ej.datavisualization.Chart.Position")
  @js.native
  object Position extends StObject {
    
    //string
    @js.native
    sealed trait Bottom
      extends StObject
         with Position
    
    //string
    @js.native
    sealed trait Left
      extends StObject
         with Position
    
    //string
    @js.native
    sealed trait Right
      extends StObject
         with Position
    
    //string
    @js.native
    sealed trait Top
      extends StObject
         with Position
  }
  
  @js.native
  sealed trait PyramidMode extends StObject
  @JSGlobal("ej.datavisualization.Chart.PyramidMode")
  @js.native
  object PyramidMode extends StObject {
    
    //string
    @js.native
    sealed trait Linear
      extends StObject
         with PyramidMode
    
    //string
    @js.native
    sealed trait Surface
      extends StObject
         with PyramidMode
  }
  
  @js.native
  sealed trait RadiusMode extends StObject
  @JSGlobal("ej.datavisualization.Chart.RadiusMode")
  @js.native
  object RadiusMode extends StObject {
    
    //string
    @js.native
    sealed trait Auto
      extends StObject
         with RadiusMode
    
    //string
    @js.native
    sealed trait MinMax
      extends StObject
         with RadiusMode
  }
  
  @js.native
  sealed trait RangePadding extends StObject
  @JSGlobal("ej.datavisualization.Chart.RangePadding")
  @js.native
  object RangePadding extends StObject {
    
    //string
    @js.native
    sealed trait Additional
      extends StObject
         with RangePadding
    
    //string
    @js.native
    sealed trait None
      extends StObject
         with RangePadding
    
    //string
    @js.native
    sealed trait Normal
      extends StObject
         with RangePadding
    
    //string
    @js.native
    sealed trait Round
      extends StObject
         with RangePadding
  }
  
  @js.native
  sealed trait RangeType extends StObject
  @JSGlobal("ej.datavisualization.Chart.RangeType")
  @js.native
  object RangeType extends StObject {
    
    //string
    @js.native
    sealed trait X
      extends StObject
         with RangeType
    
    //string
    @js.native
    sealed trait XY
      extends StObject
         with RangeType
    
    //string
    @js.native
    sealed trait Y
      extends StObject
         with RangeType
  }
  
  @js.native
  sealed trait Region extends StObject
  @JSGlobal("ej.datavisualization.Chart.Region")
  @js.native
  object Region extends StObject {
    
    //string
    @js.native
    sealed trait Chart
      extends StObject
         with Region
    
    //string
    @js.native
    sealed trait Series
      extends StObject
         with Region
  }
  
  @js.native
  sealed trait SelectionType extends StObject
  @JSGlobal("ej.datavisualization.Chart.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    //string
    @js.native
    sealed trait Multiple
      extends StObject
         with SelectionType
    
    //string
    @js.native
    sealed trait Single
      extends StObject
         with SelectionType
  }
  
  @js.native
  sealed trait Shape extends StObject
  @JSGlobal("ej.datavisualization.Chart.Shape")
  @js.native
  object Shape extends StObject {
    
    //string
    @js.native
    sealed trait Circle
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait Cross
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait Diamond
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait DownArrow
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait Ellipse
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait Hexagon
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait HorizLine
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait Image
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait LeftArrow
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait None
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait Pentagon
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait Rectangle
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait RightArrow
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait SeriesType
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait Star
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait Trapezoid
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait Triangle
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait UpArrow
      extends StObject
         with Shape
    
    //string
    @js.native
    sealed trait VertLine
      extends StObject
         with Shape
  }
  
  @js.native
  sealed trait SplineType extends StObject
  @JSGlobal("ej.datavisualization.Chart.SplineType")
  @js.native
  object SplineType extends StObject {
    
    //string
    @js.native
    sealed trait Cardinal
      extends StObject
         with SplineType
    
    //string
    @js.native
    sealed trait Clamped
      extends StObject
         with SplineType
    
    //string
    @js.native
    sealed trait Monotonic
      extends StObject
         with SplineType
    
    //string
    @js.native
    sealed trait Natural
      extends StObject
         with SplineType
  }
  
  @js.native
  sealed trait SplitMode extends StObject
  @JSGlobal("ej.datavisualization.Chart.SplitMode")
  @js.native
  object SplitMode extends StObject {
    
    //string
    @js.native
    sealed trait Indexes
      extends StObject
         with SplitMode
    
    //string
    @js.native
    sealed trait Percentage
      extends StObject
         with SplitMode
    
    //string
    @js.native
    sealed trait Position
      extends StObject
         with SplitMode
    
    //string
    @js.native
    sealed trait Value
      extends StObject
         with SplitMode
  }
  
  @js.native
  sealed trait TextAlignment extends StObject
  @JSGlobal("ej.datavisualization.Chart.TextAlignment")
  @js.native
  object TextAlignment extends StObject {
    
    //string
    @js.native
    sealed trait MiddleBottom
      extends StObject
         with TextAlignment
    
    //string
    @js.native
    sealed trait MiddleCenter
      extends StObject
         with TextAlignment
    
    //string
    @js.native
    sealed trait MiddleTop
      extends StObject
         with TextAlignment
  }
  
  @js.native
  sealed trait TextOverflow extends StObject
  @JSGlobal("ej.datavisualization.Chart.TextOverflow")
  @js.native
  object TextOverflow extends StObject {
    
    //string
    @js.native
    sealed trait None
      extends StObject
         with TextOverflow
    
    //string
    @js.native
    sealed trait Trim
      extends StObject
         with TextOverflow
    
    //string
    @js.native
    sealed trait Wrap
      extends StObject
         with TextOverflow
    
    //string
    @js.native
    sealed trait WrapAndTrim
      extends StObject
         with TextOverflow
  }
  
  @js.native
  sealed trait TextPosition extends StObject
  @JSGlobal("ej.datavisualization.Chart.TextPosition")
  @js.native
  object TextPosition extends StObject {
    
    //string
    @js.native
    sealed trait Bottom
      extends StObject
         with TextPosition
    
    //string
    @js.native
    sealed trait Middle
      extends StObject
         with TextPosition
    
    //string
    @js.native
    sealed trait Top
      extends StObject
         with TextPosition
  }
  
  @js.native
  sealed trait Theme extends StObject
  @JSGlobal("ej.datavisualization.Chart.Theme")
  @js.native
  object Theme extends StObject {
    
    //string
    @js.native
    sealed trait Azure
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait Azuredark
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait FlatDark
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait FlatLight
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait GradientDark
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait GradientLight
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait Lime
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait LimeDark
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait Saffron
      extends StObject
         with Theme
    
    //string
    @js.native
    sealed trait SaffronDark
      extends StObject
         with Theme
  }
  
  @js.native
  sealed trait TickLinesPosition extends StObject
  @JSGlobal("ej.datavisualization.Chart.TickLinesPosition")
  @js.native
  object TickLinesPosition extends StObject {
    
    //string
    @js.native
    sealed trait Inside
      extends StObject
         with TickLinesPosition
    
    //string
    @js.native
    sealed trait Outside
      extends StObject
         with TickLinesPosition
  }
  
  @js.native
  sealed trait TrendlinesType extends StObject
  @JSGlobal("ej.datavisualization.Chart.TrendlinesType")
  @js.native
  object TrendlinesType extends StObject {
    
    //string
    @js.native
    sealed trait Exponential
      extends StObject
         with TrendlinesType
    
    //string
    @js.native
    sealed trait Linear
      extends StObject
         with TrendlinesType
    
    //string
    @js.native
    sealed trait Logarithmic
      extends StObject
         with TrendlinesType
    
    //string
    @js.native
    sealed trait Polynomial
      extends StObject
         with TrendlinesType
    
    //string
    @js.native
    sealed trait Power
      extends StObject
         with TrendlinesType
  }
  
  @js.native
  sealed trait Type extends StObject
  @JSGlobal("ej.datavisualization.Chart.Type")
  @js.native
  object Type extends StObject {
    
    //string
    @js.native
    sealed trait Area
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Bar
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Bubble
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Candle
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Column
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Doughnut
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Funnel
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait HiLo
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait HiLoOpenClose
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Line
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Pie
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Polar
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Pyramid
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Radar
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait RangeArea
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait RangeColumn
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Scatter
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait Spline
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait SplineArea
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait StackingArea
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait StackingArea100
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait StackingBar
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait StackingBar100
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait StackingColumn
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait StackingColumn100
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait StackingSplineArea
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait StackingSplineArea100
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait StepArea
      extends StObject
         with Type
    
    //string
    @js.native
    sealed trait StepLine
      extends StObject
         with Type
  }
  
  @js.native
  sealed trait Unit extends StObject
  @JSGlobal("ej.datavisualization.Chart.Unit")
  @js.native
  object Unit extends StObject {
    
    //string
    @js.native
    sealed trait Percentage
      extends StObject
         with typings.ejWebAll.ej.datavisualization.Chart.Unit
    
    //string
    @js.native
    sealed trait Pixel
      extends StObject
         with typings.ejWebAll.ej.datavisualization.Chart.Unit
  }
  
  @js.native
  sealed trait ValueType extends StObject
  @JSGlobal("ej.datavisualization.Chart.ValueType")
  @js.native
  object ValueType extends StObject {
    
    //string
    @js.native
    sealed trait Category
      extends StObject
         with ValueType
    
    //string
    @js.native
    sealed trait DateTime
      extends StObject
         with ValueType
    
    //string
    @js.native
    sealed trait Double
      extends StObject
         with ValueType
    
    //string
    @js.native
    sealed trait Logarithmic
      extends StObject
         with ValueType
  }
  
  @js.native
  sealed trait VerticalAlignment extends StObject
  @JSGlobal("ej.datavisualization.Chart.VerticalAlignment")
  @js.native
  object VerticalAlignment extends StObject {
    
    //string
    @js.native
    sealed trait Bottom
      extends StObject
         with VerticalAlignment
    
    //string
    @js.native
    sealed trait Middle
      extends StObject
         with VerticalAlignment
    
    //string
    @js.native
    sealed trait Top
      extends StObject
         with VerticalAlignment
  }
  
  @js.native
  sealed trait VerticalTextAlignment extends StObject
  @JSGlobal("ej.datavisualization.Chart.VerticalTextAlignment")
  @js.native
  object VerticalTextAlignment extends StObject {
    
    //string
    @js.native
    sealed trait Center
      extends StObject
         with VerticalTextAlignment
    
    //string
    @js.native
    sealed trait Far
      extends StObject
         with VerticalTextAlignment
    
    //string
    @js.native
    sealed trait Near
      extends StObject
         with VerticalTextAlignment
  }
  
  @js.native
  sealed trait ZIndex extends StObject
  @JSGlobal("ej.datavisualization.Chart.ZIndex")
  @js.native
  object ZIndex extends StObject {
    
    //string
    @js.native
    sealed trait Inside
      extends StObject
         with ZIndex
    
    //string
    @js.native
    sealed trait Over
      extends StObject
         with ZIndex
  }
  
  @js.native
  sealed trait boxPlotMode extends StObject
  @JSGlobal("ej.datavisualization.Chart.boxPlotMode")
  @js.native
  object boxPlotMode extends StObject {
    
    //string
    @js.native
    sealed trait Exclusive
      extends StObject
         with boxPlotMode
    
    //string
    @js.native
    sealed trait Inclusive
      extends StObject
         with boxPlotMode
    
    //string
    @js.native
    sealed trait Normal
      extends StObject
         with boxPlotMode
  }
  
  trait AfterResizeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** width - Chart width, after resize    height - Chart height, after resize    prevWidth - Chart width, before resize    prevHeight - Chart height, before resize
      * originalWidth- Chart width, when the chart was first rendered    originalHeight - Chart height, when the chart was first rendered
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AfterResizeEventArgs {
    
    inline def apply(): AfterResizeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AfterResizeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AfterResizeEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait AnimationCompleteEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** series - Instance of the series that completed has animation.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AnimationCompleteEventArgs {
    
    inline def apply(): AnimationCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationCompleteEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimationCompleteEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait Annotation extends StObject {
    
    /** Angle to rotate the annotation in degrees.
      * @Default {'0'}
      */
    var angle: js.UndefOr[Double] = js.undefined
    
    /** Text content or id of a HTML element to be displayed as annotation.
      */
    var content: js.UndefOr[String] = js.undefined
    
    /** Specifies how annotations have to be placed in Chart.
      * @Default {none. See CoordinateUnit}
      */
    var coordinateUnit: js.UndefOr[CoordinateUnit | String] = js.undefined
    
    /** Specifies the horizontal alignment of the annotation.
      * @Default {middle. See HorizontalAlignment}
      */
    var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.undefined
    
    /** Options to customize the margin of annotation.
      */
    var margin: js.UndefOr[AnnotationsMargin] = js.undefined
    
    /** Controls the opacity of the annotation.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies whether annotation has to be placed with respect to chart or series.
      * @Default {chart. See Region}
      */
    var region: js.UndefOr[Region | String] = js.undefined
    
    /** Specifies the vertical alignment of the annotation.
      * @Default {middle. See VerticalAlignment}
      */
    var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.undefined
    
    /** Controls the visibility of the annotation.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Represents the horizontal offset when coordinateUnit is pixels.when coordinateUnit is points, it represents the x-coordinate of axis bounded with xAxisName property or primary X
      * axis when xAxisName is not provided.This property is not applicable when coordinateUnit is none.
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Name of the horizontal axis to be used for positioning the annotation. This property is applicable only when coordinateUnit is points.
      */
    var xAxisName: js.UndefOr[String] = js.undefined
    
    /** Represents the vertical offset when coordinateUnit is pixels.When coordinateUnit is points, it represents the y-coordinate of axis bounded with yAxisName property or primary Y
      * axis when yAxisName is not provided.This property is not applicable when coordinateUnit is none.
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.undefined
    
    /** Name of the vertical axis to be used for positioning the annotation.This property is applicable only when coordinateUnit is points.
      */
    var yAxisName: js.UndefOr[String] = js.undefined
  }
  object Annotation {
    
    inline def apply(): Annotation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Annotation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Annotation] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCoordinateUnit(value: CoordinateUnit | String): Self = StObject.set(x, "coordinateUnit", value.asInstanceOf[js.Any])
      
      inline def setCoordinateUnitUndefined: Self = StObject.set(x, "coordinateUnit", js.undefined)
      
      inline def setHorizontalAlignment(value: HorizontalAlignment | String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      
      inline def setMargin(value: AnnotationsMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRegion(value: Region | String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setVerticalAlignment(value: VerticalAlignment | String): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXAxisName(value: String): Self = StObject.set(x, "xAxisName", value.asInstanceOf[js.Any])
      
      inline def setXAxisNameUndefined: Self = StObject.set(x, "xAxisName", js.undefined)
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYAxisName(value: String): Self = StObject.set(x, "yAxisName", value.asInstanceOf[js.Any])
      
      inline def setYAxisNameUndefined: Self = StObject.set(x, "yAxisName", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait AnnotationClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the annotation in chart area.     contentData - Information about the annotation, like Coordinate unit, Region, content    pageX-
      * x-coordinate of the pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AnnotationClickEventArgs {
    
    inline def apply(): AnnotationClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnnotationClickEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait AnnotationsMargin extends StObject {
    
    /** Annotation is placed at the specified value above its original position.
      * @Default {0}
      */
    var bottom: js.UndefOr[Double] = js.undefined
    
    /** Annotation is placed at the specified value from left side of its original position.
      * @Default {0}
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /** Annotation is placed at the specified value from the right side of its original position.
      * @Default {0}
      */
    var right: js.UndefOr[Double] = js.undefined
    
    /** Annotation is placed at the specified value under its original position.
      * @Default {0}
      */
    var top: js.UndefOr[Double] = js.undefined
  }
  object AnnotationsMargin {
    
    inline def apply(): AnnotationsMargin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationsMargin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnnotationsMargin] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait AxesAlternateGridBand extends StObject {
    
    /** Options for customizing even grid band.
      */
    var even: js.UndefOr[AxesAlternateGridBandEven] = js.undefined
    
    /** Options for customizing odd grid band.
      */
    var odd: js.UndefOr[AxesAlternateGridBandOdd] = js.undefined
  }
  object AxesAlternateGridBand {
    
    inline def apply(): AxesAlternateGridBand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesAlternateGridBand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesAlternateGridBand] (val x: Self) extends AnyVal {
      
      inline def setEven(value: AxesAlternateGridBandEven): Self = StObject.set(x, "even", value.asInstanceOf[js.Any])
      
      inline def setEvenUndefined: Self = StObject.set(x, "even", js.undefined)
      
      inline def setOdd(value: AxesAlternateGridBandOdd): Self = StObject.set(x, "odd", value.asInstanceOf[js.Any])
      
      inline def setOddUndefined: Self = StObject.set(x, "odd", js.undefined)
    }
  }
  
  trait AxesAlternateGridBandEven extends StObject {
    
    /** Fill color for the even grid bands.
      * @Default {transparent}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Opacity of the even grid band.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object AxesAlternateGridBandEven {
    
    inline def apply(): AxesAlternateGridBandEven = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesAlternateGridBandEven]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesAlternateGridBandEven] (val x: Self) extends AnyVal {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait AxesAlternateGridBandOdd extends StObject {
    
    /** Fill color of the odd grid bands
      * @Default {transparent}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Opacity of odd grid band
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object AxesAlternateGridBandOdd {
    
    inline def apply(): AxesAlternateGridBandOdd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesAlternateGridBandOdd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesAlternateGridBandOdd] (val x: Self) extends AnyVal {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait AxesAxisLine extends StObject {
    
    /** Color of axis line.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Pattern of dashes and gaps to be applied to the axis line.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Padding for axis line. Normally, it is used along with plotOffset to pad the plot area.
      * @Default {null}
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /** Show/hides the axis line.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of axis line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object AxesAxisLine {
    
    inline def apply(): AxesAxisLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesAxisLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesAxisLine] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait AxesCrosshairLabel extends StObject {
    
    /** Show/hides the crosshair label associated with this axis.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object AxesCrosshairLabel {
    
    inline def apply(): AxesCrosshairLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesCrosshairLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesCrosshairLabel] (val x: Self) extends AnyVal {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait AxesFont extends StObject {
    
    /** Font family of labels.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of labels.
      * @Default {ej.datavisualization.Chart.FontStyle.Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the label.
      * @Default {ej.datavisualization.Chart.FontWeight.Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity of the axis labels.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the axis labels.
      * @Default {13px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object AxesFont {
    
    inline def apply(): AxesFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait AxesLabelBorder extends StObject {
    
    /** Specifies the color of the label border.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of the label border.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object AxesLabelBorder {
    
    inline def apply(): AxesLabelBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesLabelBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesLabelBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait AxesLabelRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** axis - Instance of the corresponding axis.        label - Arguments of axis label value and text.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AxesLabelRenderingEventArgs {
    
    inline def apply(): AxesLabelRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesLabelRenderingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesLabelRenderingEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait AxesLabelsInitializeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** dataAxes - Collection of axes in Chart
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AxesLabelsInitializeEventArgs {
    
    inline def apply(): AxesLabelsInitializeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesLabelsInitializeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesLabelsInitializeEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait AxesMajorGridLines extends StObject {
    
    /** Color of the major grid line.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Pattern of dashes and gaps used to stroke the major grid lines.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Opacity of major grid lines.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Show/hides the major grid lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the major grid lines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object AxesMajorGridLines {
    
    inline def apply(): AxesMajorGridLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesMajorGridLines]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesMajorGridLines] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait AxesMajorTickLines extends StObject {
    
    /** Length of the major tick lines.
      * @Default {5}
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Show/hides the major tick lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the major tick lines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object AxesMajorTickLines {
    
    inline def apply(): AxesMajorTickLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesMajorTickLines]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesMajorTickLines] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait AxesMinorGridLines extends StObject {
    
    /** Patterns of dashes and gaps used to stroke the minor grid lines.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Show/hides the minor grid lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the minorGridLines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object AxesMinorGridLines {
    
    inline def apply(): AxesMinorGridLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesMinorGridLines]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesMinorGridLines] (val x: Self) extends AnyVal {
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait AxesMinorTickLines extends StObject {
    
    /** Length of the minor tick lines.
      * @Default {5}
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Show/hides the minor tick lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the minor tick line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object AxesMinorTickLines {
    
    inline def apply(): AxesMinorTickLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesMinorTickLines]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesMinorTickLines] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait AxesMultiLevelLabel extends StObject {
    
    /** Options for customizing the border of the series.
      */
    var border: js.UndefOr[AxesMultiLevelLabelsBorder] = js.undefined
    
    /** Ending value of the multi level labels.
      * @Default {null}
      */
    var end: js.UndefOr[Any] = js.undefined
    
    /** Options for customizing the font of the text.
      */
    var font: js.UndefOr[AxesMultiLevelLabelsFont] = js.undefined
    
    /** Specifies the level of multi level labels.
      * @Default {0}
      */
    var level: js.UndefOr[Double] = js.undefined
    
    /** Specifies the maximum width of the text in multi level labels.
      * @Default {null}
      */
    var maximumTextWidth: js.UndefOr[Double] = js.undefined
    
    /** Starting value of the multi level labels.
      * @Default {null}
      */
    var start: js.UndefOr[Any] = js.undefined
    
    /** Text of the multi level labels.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the alignment of the text in multi level labels.
      * @Default {center. See TextAlignment}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.undefined
    
    /** Specifies the handling of text over flow in multi level labels.
      * @Default {center. See TextOverflow}
      */
    var textOverflow: js.UndefOr[TextOverflow | String] = js.undefined
    
    /** Visibility of the multi level labels.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object AxesMultiLevelLabel {
    
    inline def apply(): AxesMultiLevelLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesMultiLevelLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesMultiLevelLabel] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: AxesMultiLevelLabelsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setEnd(value: Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFont(value: AxesMultiLevelLabelsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMaximumTextWidth(value: Double): Self = StObject.set(x, "maximumTextWidth", value.asInstanceOf[js.Any])
      
      inline def setMaximumTextWidthUndefined: Self = StObject.set(x, "maximumTextWidth", js.undefined)
      
      inline def setStart(value: Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait AxesMultiLevelLabelsBorder extends StObject {
    
    /** Border color of the multi level labels.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border type of the multi level labels.
      * @Default {rectangle. See Type}
      */
    var `type`: js.UndefOr[MultiLevelLabelsBorderType | String] = js.undefined
    
    /** Border width of the multi level labels.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object AxesMultiLevelLabelsBorder {
    
    inline def apply(): AxesMultiLevelLabelsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesMultiLevelLabelsBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesMultiLevelLabelsBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setType(value: MultiLevelLabelsBorderType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait AxesMultiLevelLabelsFont extends StObject {
    
    /** Font color of the multi level labels text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Font family of the multi level labels text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of the multi level labels text.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the multi level label text.
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[String] = js.undefined
    
    /** Opacity of the multi level label text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the multi level label text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object AxesMultiLevelLabelsFont {
    
    inline def apply(): AxesMultiLevelLabelsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesMultiLevelLabelsFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesMultiLevelLabelsFont] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait AxesRange extends StObject {
    
    /** Interval of the axis range.
      * @Default {null}
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /** Maximum value of the axis range.
      * @Default {null}
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /** Minimum value of the axis range.
      * @Default {null}
      */
    var min: js.UndefOr[Double] = js.undefined
  }
  object AxesRange {
    
    inline def apply(): AxesRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesRange] (val x: Self) extends AnyVal {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  trait AxesRangeCalculateEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** delta - Difference between minimum and maximum value of axis range.    interval - Interval value of axis range. Grid lines, tick lines and axis labels are drawn based on this
      * interval value.    max - Maximum value of axis range.    min - Minimum value of axis range.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AxesRangeCalculateEventArgs {
    
    inline def apply(): AxesRangeCalculateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesRangeCalculateEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesRangeCalculateEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait AxesScrollbarSettings extends StObject {
    
    /** Controls whether scrollbar has to be responsive in the chart.
      * @Default {false}
      */
    var canResize: js.UndefOr[Boolean] = js.undefined
    
    /** The maximum number of points to be displayed in the scrollbar.
      * @Default {null}
      */
    var pointsLength: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the range for the scrollbar in the axis.
      */
    var range: js.UndefOr[AxesScrollbarSettingsRange] = js.undefined
    
    /** Specifies to enable or disable the scrollbar.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object AxesScrollbarSettings {
    
    inline def apply(): AxesScrollbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesScrollbarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesScrollbarSettings] (val x: Self) extends AnyVal {
      
      inline def setCanResize(value: Boolean): Self = StObject.set(x, "canResize", value.asInstanceOf[js.Any])
      
      inline def setCanResizeUndefined: Self = StObject.set(x, "canResize", js.undefined)
      
      inline def setPointsLength(value: Double): Self = StObject.set(x, "pointsLength", value.asInstanceOf[js.Any])
      
      inline def setPointsLengthUndefined: Self = StObject.set(x, "pointsLength", js.undefined)
      
      inline def setRange(value: AxesScrollbarSettingsRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait AxesScrollbarSettingsRange extends StObject {
    
    /** Maximum value for the scrollbar range .
      * @Default {null}
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /** Minimum value of the scrollbar range.
      * @Default {null}
      */
    var min: js.UndefOr[Double] = js.undefined
  }
  object AxesScrollbarSettingsRange {
    
    inline def apply(): AxesScrollbarSettingsRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesScrollbarSettingsRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesScrollbarSettingsRange] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  trait AxesStripLine extends StObject {
    
    /** Border color of the strip line.
      * @Default {gray}
      */
    var borderColor: js.UndefOr[String] = js.undefined
    
    /** Background color of the strip line.
      * @Default {gray}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** End value of the strip line.
      * @Default {null}
      */
    var end: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the font of the text.
      */
    var font: js.UndefOr[AxesStripLineFont] = js.undefined
    
    /** Start value of the strip line.
      * @Default {null}
      */
    var start: js.UndefOr[Double] = js.undefined
    
    /** Indicates whether to render the strip line from the minimum/start value of the axis. This property does not work when start property is set.
      * @Default {false}
      */
    var startFromAxis: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies text to be displayed inside the strip line.
      * @Default {stripLine}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the alignment of the text inside the strip line.
      * @Default {middlecenter. See TextAlignment}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.undefined
    
    /** Show/hides the strip line.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the strip line.
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /** Specifies the order where the strip line and the series have to be rendered. When Z-order is â€œbehindâ€, strip line is rendered under the series and when it is â€œoverâ€, it is
      * rendered above the series.
      * @Default {over. See ZIndex}
      */
    var zIndex: js.UndefOr[ZIndex | String] = js.undefined
  }
  object AxesStripLine {
    
    inline def apply(): AxesStripLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesStripLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesStripLine] (val x: Self) extends AnyVal {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFont(value: AxesStripLineFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartFromAxis(value: Boolean): Self = StObject.set(x, "startFromAxis", value.asInstanceOf[js.Any])
      
      inline def setStartFromAxisUndefined: Self = StObject.set(x, "startFromAxis", js.undefined)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZIndex(value: ZIndex | String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait AxesStripLineFont extends StObject {
    
    /** Font color of the strip line text.
      * @Default {black}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Font family of the strip line text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of the strip line text.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the strip line text.
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[String] = js.undefined
    
    /** Opacity of the strip line text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the strip line text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object AxesStripLineFont {
    
    inline def apply(): AxesStripLineFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesStripLineFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesStripLineFont] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait AxesTitle extends StObject {
    
    /** Specifies the position of the axis title.
      * @Default {center. See Alignment}
      */
    var alignment: js.UndefOr[TextAlignment | String] = js.undefined
    
    /** Specifies whether to trim the axis title when it exceeds the chart area or the maximum width of the title.
      * @Default {false}
      */
    var enableTrim: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the title font.
      */
    var font: js.UndefOr[AxesTitleFont] = js.undefined
    
    /** Maximum width of the title, when the title exceeds this width, the title gets trimmed, when enableTrim is true.
      * @Default {34}
      */
    var maximumTitleWidth: js.UndefOr[Double] = js.undefined
    
    /** offset value for axis title.
      * @Default {0}
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /** Specifies the position of the axis title.
      * @Default {outside. See Position}
      */
    var position: js.UndefOr[LabelPosition | String] = js.undefined
    
    /** Title for the axis.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Controls the visibility of axis title.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object AxesTitle {
    
    inline def apply(): AxesTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesTitle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesTitle] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: TextAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      inline def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      inline def setFont(value: AxesTitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setMaximumTitleWidth(value: Double): Self = StObject.set(x, "maximumTitleWidth", value.asInstanceOf[js.Any])
      
      inline def setMaximumTitleWidthUndefined: Self = StObject.set(x, "maximumTitleWidth", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPosition(value: LabelPosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait AxesTitleFont extends StObject {
    
    /** Font family of the title text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of the title text.
      * @Default {ej.datavisualization.Chart.FontStyle.Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the title text.
      * @Default {ej.datavisualization.Chart.FontWeight.Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity of the axis title text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the axis title.
      * @Default {16px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object AxesTitleFont {
    
    inline def apply(): AxesTitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesTitleFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesTitleFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait AxesTitleRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** axes - Instance of the axis whose title is being rendered    locationX - X-coordinate of title location    locationY - Y-coordinate of title location    title - Axis title
      * text. You can add custom text to the title.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AxesTitleRenderingEventArgs {
    
    inline def apply(): AxesTitleRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesTitleRenderingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesTitleRenderingEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait Axis extends StObject {
    
    /** Specifies the position of the axis labels.
      * @Default {center. See Alignment}
      */
    var alignment: js.UndefOr[LabelAlignment | String] = js.undefined
    
    /** Options for customizing axis alternate grid band.
      */
    var alternateGridBand: js.UndefOr[AxesAlternateGridBand] = js.undefined
    
    /** Options for customizing the axis line.
      */
    var axisLine: js.UndefOr[AxesAxisLine] = js.undefined
    
    /** Specifies the index of the column where the axis is associated, when the chart area is divided into multiple plot areas by using columnDefinitions.
      * @Default {null}
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /** Specifies the number of columns or plot areas an axis has to span horizontally.
      * @Default {null}
      */
    var columnSpan: js.UndefOr[Double] = js.undefined
    
    /** Specifies where axis should intersect the vertical axis or vice versa. Value should be provided in axis co-ordinates. If provided value is greater than the maximum value of
      * crossing axis, then axis will be placed at the opposite side.
      * @Default {null}
      */
    var crossesAt: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the crosshair label.
      */
    var crosshairLabel: js.UndefOr[AxesCrosshairLabel] = js.undefined
    
    /** With this setting, you can request axis to calculate intervals approximately equal to your desired interval.
      * @Default {null}
      */
    var desiredIntervals: js.UndefOr[Double] = js.undefined
    
    /** Specifies the position of labels at the edge of the axis.
      * @Default {ej.datavisualization.Chart.EdgeLabelPlacement.None. See EdgeLabelPlacement}
      */
    var edgeLabelPlacement: js.UndefOr[EdgeLabelPlacement | String] = js.undefined
    
    /** Specifies the interval of the axis according to the zoomed data of the chart.
      * @Default {true}
      */
    var enableAutoIntervalOnZooming: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to trim the axis label when the width of the label exceeds the maximumLabelWidth.
      * @Default {false}
      */
    var enableTrim: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the font of the axis Labels.
      */
    var font: js.UndefOr[AxesFont] = js.undefined
    
    /** Specifies the type of interval in date time axis.
      * @Default {null. See IntervalType}
      */
    var intervalType: js.UndefOr[IntervalType | String] = js.undefined
    
    /** Category axis can also plot points based on index value of data points. Index based plotting can be enabled by setting â€˜isIndexedâ€™ property to true.
      * @Default {false}
      */
    var isIndexed: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to inverse the axis.
      * @Default {false}
      */
    var isInversed: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the border of the labels.
      */
    var labelBorder: js.UndefOr[AxesLabelBorder] = js.undefined
    
    /** Custom formatting for axis label and supports all standard formatting type of numerical and date time values.
      * @Default {null}
      */
    var labelFormat: js.UndefOr[String] = js.undefined
    
    /** Specifies the action to take when the axis labels are overlapping with each other.
      * @Default {ej.datavisualization.Chart.LabelIntersectAction.None. See LabelIntersectAction}
      */
    var labelIntersectAction: js.UndefOr[LabelIntersectAction | String] = js.undefined
    
    /** Specifies the placement of labels.
      * @Default {ej.datavisualization.Chart.LabelPlacement.BetweenTicks. See LabelPlacement}
      */
    var labelPlacement: js.UndefOr[LabelPlacement | String] = js.undefined
    
    /** Specifies the position of the axis labels.
      * @Default {outside. See LabelPosition}
      */
    var labelPosition: js.UndefOr[LabelPosition | String] = js.undefined
    
    /** Angle in degrees to rotate the axis labels.
      * @Default {null}
      */
    var labelRotation: js.UndefOr[Double] = js.undefined
    
    /** Logarithmic base value. This is applicable only for logarithmic axis.
      * @Default {10}
      */
    var logBase: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing major gird lines.
      */
    var majorGridLines: js.UndefOr[AxesMajorGridLines] = js.undefined
    
    /** Options for customizing the major tick lines.
      */
    var majorTickLines: js.UndefOr[AxesMajorTickLines] = js.undefined
    
    /** Maximum width of the axis label. When the label exceeds the width, the label gets trimmed when the enableTrim is set to true.
      * @Default {34}
      */
    var maximumLabelWidth: js.UndefOr[Double] = js.undefined
    
    /** Maximum number of labels to be displayed in every 100 pixels.
      * @Default {3}
      */
    var maximumLabels: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the minor grid lines.
      */
    var minorGridLines: js.UndefOr[AxesMinorGridLines] = js.undefined
    
    /** Options for customizing the minor tick lines.
      */
    var minorTickLines: js.UndefOr[AxesMinorTickLines] = js.undefined
    
    /** Specifies the number of minor ticks per interval.
      * @Default {null}
      */
    var minorTicksPerInterval: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the multi level labels.
      * @Default {[ ]}
      */
    var multiLevelLabels: js.UndefOr[js.Array[AxesMultiLevelLabel]] = js.undefined
    
    /** Unique name of the axis. To associate an axis with the series, you have to set this name to the xAxisName/yAxisName property of the series.
      * @Default {null}
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Specifies whether to render the axis at the opposite side of its default position.
      * @Default {false}
      */
    var opposedPosition: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the orientation of the axis line in the chart.
      * @Default {'horizontal'}
      */
    var orientation: js.UndefOr[AxisOrientation | String] = js.undefined
    
    /** Specifies the padding for the plot area.
      * @Default {10}
      */
    var plotOffset: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the range of the axis.
      */
    var range: js.UndefOr[AxesRange] = js.undefined
    
    /** Specifies the padding for the axis range.
      * @Default {None. See RangePadding}
      */
    var rangePadding: js.UndefOr[RangePadding | String] = js.undefined
    
    /** Rounds the number to the given number of decimals.
      * @Default {null}
      */
    var roundingPlaces: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the axis scrollbar.
      */
    var scrollbarSettings: js.UndefOr[AxesScrollbarSettings] = js.undefined
    
    /** Specifies whether the axis elements need to be placed nearby the axis line, while crossing.
      * @Default {true}
      */
    var showNextToAxisLine: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the strip lines.
      * @Default {[ ]}
      */
    var stripLine: js.UndefOr[js.Array[AxesStripLine]] = js.undefined
    
    /** Specifies the position of the axis tick lines.
      * @Default {outside. See TickLinesPosition}
      */
    var tickLinesPosition: js.UndefOr[TickLinesPosition | String] = js.undefined
    
    /** Options for customizing the axis title.
      */
    var title: js.UndefOr[AxesTitle] = js.undefined
    
    /** Specifies the type of data the axis is handling.
      * @Default {null. See ValueType}
      */
    var valueType: js.UndefOr[ValueType | String] = js.undefined
    
    /** Show/hides the axis.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** The axis is scaled by this factor. When zoomFactor is 0.5, the chart is scaled by 200% along this axis. Value ranges from 0 to 1.
      * @Default {1}
      */
    var zoomFactor: js.UndefOr[Double] = js.undefined
    
    /** Position of the zoomed axis. Value ranges from 0 to 1.
      * @Default {0}
      */
    var zoomPosition: js.UndefOr[Double] = js.undefined
  }
  object Axis {
    
    inline def apply(): Axis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Axis]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Axis] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: LabelAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setAlternateGridBand(value: AxesAlternateGridBand): Self = StObject.set(x, "alternateGridBand", value.asInstanceOf[js.Any])
      
      inline def setAlternateGridBandUndefined: Self = StObject.set(x, "alternateGridBand", js.undefined)
      
      inline def setAxisLine(value: AxesAxisLine): Self = StObject.set(x, "axisLine", value.asInstanceOf[js.Any])
      
      inline def setAxisLineUndefined: Self = StObject.set(x, "axisLine", js.undefined)
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
      
      inline def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
      
      inline def setCrossesAt(value: Double): Self = StObject.set(x, "crossesAt", value.asInstanceOf[js.Any])
      
      inline def setCrossesAtUndefined: Self = StObject.set(x, "crossesAt", js.undefined)
      
      inline def setCrosshairLabel(value: AxesCrosshairLabel): Self = StObject.set(x, "crosshairLabel", value.asInstanceOf[js.Any])
      
      inline def setCrosshairLabelUndefined: Self = StObject.set(x, "crosshairLabel", js.undefined)
      
      inline def setDesiredIntervals(value: Double): Self = StObject.set(x, "desiredIntervals", value.asInstanceOf[js.Any])
      
      inline def setDesiredIntervalsUndefined: Self = StObject.set(x, "desiredIntervals", js.undefined)
      
      inline def setEdgeLabelPlacement(value: EdgeLabelPlacement | String): Self = StObject.set(x, "edgeLabelPlacement", value.asInstanceOf[js.Any])
      
      inline def setEdgeLabelPlacementUndefined: Self = StObject.set(x, "edgeLabelPlacement", js.undefined)
      
      inline def setEnableAutoIntervalOnZooming(value: Boolean): Self = StObject.set(x, "enableAutoIntervalOnZooming", value.asInstanceOf[js.Any])
      
      inline def setEnableAutoIntervalOnZoomingUndefined: Self = StObject.set(x, "enableAutoIntervalOnZooming", js.undefined)
      
      inline def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      inline def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      inline def setFont(value: AxesFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setIntervalType(value: IntervalType | String): Self = StObject.set(x, "intervalType", value.asInstanceOf[js.Any])
      
      inline def setIntervalTypeUndefined: Self = StObject.set(x, "intervalType", js.undefined)
      
      inline def setIsIndexed(value: Boolean): Self = StObject.set(x, "isIndexed", value.asInstanceOf[js.Any])
      
      inline def setIsIndexedUndefined: Self = StObject.set(x, "isIndexed", js.undefined)
      
      inline def setIsInversed(value: Boolean): Self = StObject.set(x, "isInversed", value.asInstanceOf[js.Any])
      
      inline def setIsInversedUndefined: Self = StObject.set(x, "isInversed", js.undefined)
      
      inline def setLabelBorder(value: AxesLabelBorder): Self = StObject.set(x, "labelBorder", value.asInstanceOf[js.Any])
      
      inline def setLabelBorderUndefined: Self = StObject.set(x, "labelBorder", js.undefined)
      
      inline def setLabelFormat(value: String): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
      
      inline def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
      
      inline def setLabelIntersectAction(value: LabelIntersectAction | String): Self = StObject.set(x, "labelIntersectAction", value.asInstanceOf[js.Any])
      
      inline def setLabelIntersectActionUndefined: Self = StObject.set(x, "labelIntersectAction", js.undefined)
      
      inline def setLabelPlacement(value: LabelPlacement | String): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setLabelPosition(value: LabelPosition | String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLabelRotation(value: Double): Self = StObject.set(x, "labelRotation", value.asInstanceOf[js.Any])
      
      inline def setLabelRotationUndefined: Self = StObject.set(x, "labelRotation", js.undefined)
      
      inline def setLogBase(value: Double): Self = StObject.set(x, "logBase", value.asInstanceOf[js.Any])
      
      inline def setLogBaseUndefined: Self = StObject.set(x, "logBase", js.undefined)
      
      inline def setMajorGridLines(value: AxesMajorGridLines): Self = StObject.set(x, "majorGridLines", value.asInstanceOf[js.Any])
      
      inline def setMajorGridLinesUndefined: Self = StObject.set(x, "majorGridLines", js.undefined)
      
      inline def setMajorTickLines(value: AxesMajorTickLines): Self = StObject.set(x, "majorTickLines", value.asInstanceOf[js.Any])
      
      inline def setMajorTickLinesUndefined: Self = StObject.set(x, "majorTickLines", js.undefined)
      
      inline def setMaximumLabelWidth(value: Double): Self = StObject.set(x, "maximumLabelWidth", value.asInstanceOf[js.Any])
      
      inline def setMaximumLabelWidthUndefined: Self = StObject.set(x, "maximumLabelWidth", js.undefined)
      
      inline def setMaximumLabels(value: Double): Self = StObject.set(x, "maximumLabels", value.asInstanceOf[js.Any])
      
      inline def setMaximumLabelsUndefined: Self = StObject.set(x, "maximumLabels", js.undefined)
      
      inline def setMinorGridLines(value: AxesMinorGridLines): Self = StObject.set(x, "minorGridLines", value.asInstanceOf[js.Any])
      
      inline def setMinorGridLinesUndefined: Self = StObject.set(x, "minorGridLines", js.undefined)
      
      inline def setMinorTickLines(value: AxesMinorTickLines): Self = StObject.set(x, "minorTickLines", value.asInstanceOf[js.Any])
      
      inline def setMinorTickLinesUndefined: Self = StObject.set(x, "minorTickLines", js.undefined)
      
      inline def setMinorTicksPerInterval(value: Double): Self = StObject.set(x, "minorTicksPerInterval", value.asInstanceOf[js.Any])
      
      inline def setMinorTicksPerIntervalUndefined: Self = StObject.set(x, "minorTicksPerInterval", js.undefined)
      
      inline def setMultiLevelLabels(value: js.Array[AxesMultiLevelLabel]): Self = StObject.set(x, "multiLevelLabels", value.asInstanceOf[js.Any])
      
      inline def setMultiLevelLabelsUndefined: Self = StObject.set(x, "multiLevelLabels", js.undefined)
      
      inline def setMultiLevelLabelsVarargs(value: AxesMultiLevelLabel*): Self = StObject.set(x, "multiLevelLabels", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpposedPosition(value: Boolean): Self = StObject.set(x, "opposedPosition", value.asInstanceOf[js.Any])
      
      inline def setOpposedPositionUndefined: Self = StObject.set(x, "opposedPosition", js.undefined)
      
      inline def setOrientation(value: AxisOrientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPlotOffset(value: Double): Self = StObject.set(x, "plotOffset", value.asInstanceOf[js.Any])
      
      inline def setPlotOffsetUndefined: Self = StObject.set(x, "plotOffset", js.undefined)
      
      inline def setRange(value: AxesRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangePadding(value: RangePadding | String): Self = StObject.set(x, "rangePadding", value.asInstanceOf[js.Any])
      
      inline def setRangePaddingUndefined: Self = StObject.set(x, "rangePadding", js.undefined)
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRoundingPlaces(value: Double): Self = StObject.set(x, "roundingPlaces", value.asInstanceOf[js.Any])
      
      inline def setRoundingPlacesUndefined: Self = StObject.set(x, "roundingPlaces", js.undefined)
      
      inline def setScrollbarSettings(value: AxesScrollbarSettings): Self = StObject.set(x, "scrollbarSettings", value.asInstanceOf[js.Any])
      
      inline def setScrollbarSettingsUndefined: Self = StObject.set(x, "scrollbarSettings", js.undefined)
      
      inline def setShowNextToAxisLine(value: Boolean): Self = StObject.set(x, "showNextToAxisLine", value.asInstanceOf[js.Any])
      
      inline def setShowNextToAxisLineUndefined: Self = StObject.set(x, "showNextToAxisLine", js.undefined)
      
      inline def setStripLine(value: js.Array[AxesStripLine]): Self = StObject.set(x, "stripLine", value.asInstanceOf[js.Any])
      
      inline def setStripLineUndefined: Self = StObject.set(x, "stripLine", js.undefined)
      
      inline def setStripLineVarargs(value: AxesStripLine*): Self = StObject.set(x, "stripLine", js.Array(value*))
      
      inline def setTickLinesPosition(value: TickLinesPosition | String): Self = StObject.set(x, "tickLinesPosition", value.asInstanceOf[js.Any])
      
      inline def setTickLinesPositionUndefined: Self = StObject.set(x, "tickLinesPosition", js.undefined)
      
      inline def setTitle(value: AxesTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setValueType(value: ValueType | String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
      
      inline def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
      
      inline def setZoomPosition(value: Double): Self = StObject.set(x, "zoomPosition", value.asInstanceOf[js.Any])
      
      inline def setZoomPositionUndefined: Self = StObject.set(x, "zoomPosition", js.undefined)
    }
  }
  
  trait AxisLabelClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the labels in chart area.         index - Index of the label.    axis - Instance of the corresponding axis.    text - Label that is clicked.
      *
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AxisLabelClickEventArgs {
    
    inline def apply(): AxisLabelClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisLabelClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxisLabelClickEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait AxisLabelMouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the labels in chart area.         index - Index of the label.    axis - Instance of the corresponding axis.    text - Label that is hovered.
      *
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AxisLabelMouseMoveEventArgs {
    
    inline def apply(): AxisLabelMouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisLabelMouseMoveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxisLabelMouseMoveEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait BeforeResizeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** currentWidth - Chart width, before resize    currentHeight - Chart height, before resize    newWidth - Chart width, after resize    newHeight - Chart height, after resize
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeResizeEventArgs {
    
    inline def apply(): BeforeResizeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeResizeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeResizeEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait Border extends StObject {
    
    /** Border color of the chart.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Opacity of the chart border.
      * @Default {0.3}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Width of the Chart border.
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Border {
    
    inline def apply(): Border = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Border]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ChartArea extends StObject {
    
    /** Background color of the plot area.
      * @Default {transparent}
      */
    var background: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the border of the plot area.
      */
    var border: js.UndefOr[ChartAreaBorder] = js.undefined
  }
  object ChartArea {
    
    inline def apply(): ChartArea = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartArea]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChartArea] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBorder(value: ChartAreaBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    }
  }
  
  trait ChartAreaBorder extends StObject {
    
    /** Border color of the plot area.
      * @Default {Gray}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Opacity of the plot area border.
      * @Default {0.3}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Border width of the plot area.
      * @Default {0.5}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ChartAreaBorder {
    
    inline def apply(): ChartAreaBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartAreaBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChartAreaBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ChartAreaBoundsCalculateEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** areaBoundsHeight - Height of the chart area.    areaBoundsWidth - Width of the chart area.    areaBoundsX - X-coordinate of the chart area.    areaBoundsY - Y-coordinate of the
      * chart area.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ChartAreaBoundsCalculateEventArgs {
    
    inline def apply(): ChartAreaBoundsCalculateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartAreaBoundsCalculateEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChartAreaBoundsCalculateEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait ChartClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the points with respect to chart area.id - ID of the target element.    size - Width and height of the chart.    pageX - x-coordinate of the
      * pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ChartClickEventArgs {
    
    inline def apply(): ChartClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChartClickEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait ChartDoubleClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the points with respect to chart area.id - ID of the target element.    size - Width and height of the chart.    pageX - x-coordinate of the
      * pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ChartDoubleClickEventArgs {
    
    inline def apply(): ChartDoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartDoubleClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChartDoubleClickEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait ChartMouseLeaveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the points with respect to chart area.id - ID of the target element.    size - Width and height of the chart.    pageX - x-coordinate of the
      * pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ChartMouseLeaveEventArgs {
    
    inline def apply(): ChartMouseLeaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartMouseLeaveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChartMouseLeaveEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait ChartMouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the points with respect to chart area.id - ID of the target element.    size - Width and height of the chart.    pageX - x-coordinate of the
      * pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ChartMouseMoveEventArgs {
    
    inline def apply(): ChartMouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartMouseMoveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChartMouseMoveEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait ColumnDefinition extends StObject {
    
    /** Width of the column in plotting area. Width is measured in either pixel or percentage based on the value of unit property.
      * @Default {50}
      */
    var columnWidth: js.UndefOr[Double] = js.undefined
    
    /** Color of the line that indicates the starting point of the column in plotting area.
      * @Default {transparent}
      */
    var lineColor: js.UndefOr[String] = js.undefined
    
    /** Width of the line that indicates the starting point of the column in plot area.
      * @Default {1}
      */
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    /** Specifies the unit to measure the width of the column in plotting area.
      * @Default {'pixel'. See Unit}
      */
    var unit: js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.Unit | String] = js.undefined
  }
  object ColumnDefinition {
    
    inline def apply(): ColumnDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnDefinition] (val x: Self) extends AnyVal {
      
      inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
      
      inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      inline def setUnit(value: typings.ejWebAll.ej.datavisualization.Chart.Unit | String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  trait CommonSeriesOptions extends StObject {
    
    /** Specifies animation duration for series rendering
      * @Default {null}
      */
    var animationDuration: js.UndefOr[String] = js.undefined
    
    /** Options to customize the border of all the series.
      */
    var border: js.UndefOr[CommonSeriesOptionsBorder] = js.undefined
    
    /** Quartile calculation has been performed in three different formulas to render the box and whisker series.
      * @Default {exclusive}
      */
    var boxPlotMode: js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.boxPlotMode | String] = js.undefined
    
    /** Options for customizing the bubble options of the Bubble series
      */
    var bubbleOptions: js.UndefOr[CommonSeriesOptionsBubbleOptions] = js.undefined
    
    /** Specifies spline tension value for cardinal spline type. Value ranges from 0 to 1.
      * @Default {0.5}
      */
    var cardinalSplineTension: js.UndefOr[Double] = js.undefined
    
    /** Name of the property in the datasource that contains close value for the series.
      * @Default {null}
      */
    var close: js.UndefOr[String] = js.undefined
    
    /** To render the column and bar type series in rectangle/cylinder shape. See
      * @Default {rectangle}
      */
    var columnFacet: js.UndefOr[ColumnFacet | String] = js.undefined
    
    /** Spacing between columns of different series. Value ranges from 0 to 1
      * @Default {0}
      */
    var columnSpacing: js.UndefOr[Double] = js.undefined
    
    /** Relative width of the columns in column type series. Value ranges from 0 to 1. Width also depends upon columnSpacing property.
      * @Default {0.7}
      */
    var columnWidth: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the waterfall connector line.
      */
    var connectorLine: js.UndefOr[CommonSeriesOptionsConnectorLine] = js.undefined
    
    /** Options for customizing the corner radius. cornerRadius property also takes the numeric input and applies it for all the four corners of the column.
      */
    var cornerRadius: js.UndefOr[CommonSeriesOptionsCornerRadius] = js.undefined
    
    /** Pattern of dashes and gaps used to stroke all the line type series.
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Set the dataSource for all series. It can be an array of JSON objects or an instance of ej.DataManager.
      * @Default {null}
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Controls the size of the hole in doughnut series. Value ranges from 0 to 1
      * @Default {0.4}
      */
    var doughnutCoefficient: js.UndefOr[Double] = js.undefined
    
    /** Controls the size of the doughnut series. Value ranges from 0 to 1.
      * @Default {0.8}
      */
    var doughnutSize: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the drag and drop in series.
      */
    var dragSettings: js.UndefOr[CommonSeriesOptionsDragSettings] = js.undefined
    
    /** Specifies the type of series to be drawn in radar or polar series.
      * @Default {line. See DrawType}
      */
    var drawType: js.UndefOr[DrawType | String] = js.undefined
    
    /** Options for customizing the empty point in the series.
      */
    var emptyPointSettings: js.UndefOr[CommonSeriesOptionsEmptyPointSettings] = js.undefined
    
    /** Enable/disable the animation for all the series.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** To avoid overlapping of data labels smartly.
      * @Default {true}
      */
    var enableSmartLabels: js.UndefOr[Boolean] = js.undefined
    
    /** Start angle of pie/doughnut series.
      * @Default {null}
      */
    var endAngle: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the error bar in series.
      */
    var errorBar: js.UndefOr[CommonSeriesOptionsErrorBar] = js.undefined
    
    /** Explodes the pie/doughnut slices on mouse move.
      * @Default {false}
      */
    var explode: js.UndefOr[Boolean] = js.undefined
    
    /** Explodes all the slice of pie/doughnut on render.
      * @Default {false}
      */
    var explodeAll: js.UndefOr[Boolean] = js.undefined
    
    /** Index of the point to be exploded from pie/doughnut/pyramid/funnel.
      * @Default {null}
      */
    var explodeIndex: js.UndefOr[Double] = js.undefined
    
    /** Specifies the distance of the slice from the center, when it is exploded.
      * @Default {0.4}
      */
    var explodeOffset: js.UndefOr[Double] = js.undefined
    
    /** Fill color for all the series.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the font of all the series.
      */
    var font: js.UndefOr[CommonSeriesOptionsFont] = js.undefined
    
    /** Sets the height of the funnel in funnel series. Values can be either pixel or percentage.
      * @Default {32.7%}
      */
    var funnelHeight: js.UndefOr[String] = js.undefined
    
    /** Sets the width of the funnel in funnel series. Values can be either pixel or percentage.
      * @Default {11.6%}
      */
    var funnelWidth: js.UndefOr[String] = js.undefined
    
    /** Gap between the slices in pyramid and funnel series.
      * @Default {0}
      */
    var gapRatio: js.UndefOr[Double] = js.undefined
    
    /** Distance between the two pie's in pieOfPie series.
      * @Default {50}
      */
    var gapWidth: js.UndefOr[Double] = js.undefined
    
    /** Name of the property in the datasource that contains high value for the series.
      * @Default {null}
      */
    var high: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the appearance of the series or data point while highlighting.
      */
    var highlightSettings: js.UndefOr[CommonSeriesOptionsHighlightSettings] = js.undefined
    
    /** Specifies whether to join start and end point of a line/area series used in polar/radar chart to form a closed path.
      * @Default {true}
      */
    var isClosed: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to stack the column series in polar/radar charts.
      * @Default {false}
      */
    var isStacking: js.UndefOr[Boolean] = js.undefined
    
    /** Renders the chart vertically. This is applicable only for Cartesian type series.
      * @Default {false}
      */
    var isTransposed: js.UndefOr[Boolean] = js.undefined
    
    /** Position of the data label in pie/doughnut/pyramid/funnel series. OutsideExtended position is not applicable for pyramid/funnel.
      * @Default {inside. See LabelPosition}
      */
    var labelPosition: js.UndefOr[LabelPosition | String] = js.undefined
    
    /** Specifies the line cap of the series.
      * @Default {butt. See LineCap}
      */
    var lineCap: js.UndefOr[LineCap | String] = js.undefined
    
    /** Specifies the type of shape to be used where two lines meet.
      * @Default {round. See LineJoin}
      */
    var lineJoin: js.UndefOr[LineJoin | String] = js.undefined
    
    /** Name of the property in the datasource that contains low value for the series.
      * @Default {null}
      */
    var low: js.UndefOr[String] = js.undefined
    
    /** Options for displaying and customizing marker for individual point in a series. Marker contains shapes and/or data labels.
      */
    var marker: js.UndefOr[CommonSeriesOptionsMarker] = js.undefined
    
    /** Opacity of the series.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Name of the property in the datasource that contains open value for the series.
      * @Default {null}
      */
    var open: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the outlier of the series.
      */
    var outlierSettings: js.UndefOr[CommonSeriesOptionsOutlierSettings] = js.undefined
    
    /** Name of a field in data source, where the fill color for all the data points is generated.
      */
    var palette: js.UndefOr[String] = js.undefined
    
    /** Controls the size of pie series. Value ranges from 0 to 1.
      * @Default {0.8}
      */
    var pieCoefficient: js.UndefOr[Double] = js.undefined
    
    /** Controls the size of the second pie in pieOfPie series. Value ranges from 0 to 1.
      * @Default {0.6}
      */
    var pieOfPieCoefficient: js.UndefOr[Double] = js.undefined
    
    /** Name of the property in the datasource that contains fill color for the series.
      * @Default {null}
      */
    var pointColorMappingName: js.UndefOr[String] = js.undefined
    
    /** Fill color for the positive column of the waterfall.
      * @Default {null}
      */
    var positiveFill: js.UndefOr[String] = js.undefined
    
    /** Specifies the mode of the pyramid series.
      * @Default {linear. See PyramidMode}
      */
    var pyramidMode: js.UndefOr[PyramidMode | String] = js.undefined
    
    /** Options for customizing the appearance of the series/data point on selection.
      */
    var selectionSettings: js.UndefOr[CommonSeriesOptionsSelectionSettings] = js.undefined
    
    /** Render the x mark in the center of the box and whisker series type.x represents the average value of the box and whisker series.
      * @Default {true}
      */
    var showMedian: js.UndefOr[Boolean] = js.undefined
    
    /** Name of the property in the datasource that contains the size value for the bubble series.
      * @Default {null}
      */
    var size: js.UndefOr[String] = js.undefined
    
    /** To render the spline series curve in different forms.
      * @Default {natural. See SplineType}
      */
    var splineType: js.UndefOr[SplineType | String] = js.undefined
    
    /** Specifies the mode for splitting the data points in pieOfPie series.
      * @Default {value. See SplitMode}
      */
    var splitMode: js.UndefOr[SplitMode | String] = js.undefined
    
    /** Split Value of pieOfPie series.
      * @Default {null}
      */
    var splitValue: js.UndefOr[String] = js.undefined
    
    /** Group of the stacking collection series.
      */
    var stackingGroup: js.UndefOr[String] = js.undefined
    
    /** Start angle from where the pie/doughnut series renders. By default it starts from 0.
      * @Default {null}
      */
    var startAngle: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the tooltip of chart.
      */
    var tooltip: js.UndefOr[CommonSeriesOptionsTooltip] = js.undefined
    
    /** Option to add the trendlines to chart.
      */
    var trendlines: js.UndefOr[js.Array[CommonSeriesOptionsTrendline]] = js.undefined
    
    /** Specifies the type of the series to render in chart.
      * @Default {column. See Type}
      */
    var `type`: js.UndefOr[typings.ejWebAll.ej.Type | String] = js.undefined
    
    /** Enables or disables the visibility of legend item.
      * @Default {visible}
      */
    var visibleOnLegend: js.UndefOr[String] = js.undefined
    
    /** Specifies the name of the x-axis that has to be associated with this series. Add an axis instance with this name to axes collection.
      * @Default {null}
      */
    var xAxisName: js.UndefOr[String] = js.undefined
    
    /** Name of the property in the datasource that contains x value for the series.
      * @Default {null}
      */
    var xName: js.UndefOr[String] = js.undefined
    
    /** Specifies the name of the y-axis that has to be associated with this series. Add an axis instance with this name to axes collection.
      * @Default {null}
      */
    var yAxisName: js.UndefOr[String] = js.undefined
    
    /** Name of the property in the datasource that contains y value for the series.
      * @Default {null}
      */
    var yName: js.UndefOr[String] = js.undefined
    
    /** Z-order of the series.
      * @Default {0}
      */
    var zOrder: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptions {
    
    inline def apply(): CommonSeriesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimationDuration(value: String): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setBorder(value: CommonSeriesOptionsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBoxPlotMode(value: boxPlotMode | String): Self = StObject.set(x, "boxPlotMode", value.asInstanceOf[js.Any])
      
      inline def setBoxPlotModeUndefined: Self = StObject.set(x, "boxPlotMode", js.undefined)
      
      inline def setBubbleOptions(value: CommonSeriesOptionsBubbleOptions): Self = StObject.set(x, "bubbleOptions", value.asInstanceOf[js.Any])
      
      inline def setBubbleOptionsUndefined: Self = StObject.set(x, "bubbleOptions", js.undefined)
      
      inline def setCardinalSplineTension(value: Double): Self = StObject.set(x, "cardinalSplineTension", value.asInstanceOf[js.Any])
      
      inline def setCardinalSplineTensionUndefined: Self = StObject.set(x, "cardinalSplineTension", js.undefined)
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setColumnFacet(value: ColumnFacet | String): Self = StObject.set(x, "columnFacet", value.asInstanceOf[js.Any])
      
      inline def setColumnFacetUndefined: Self = StObject.set(x, "columnFacet", js.undefined)
      
      inline def setColumnSpacing(value: Double): Self = StObject.set(x, "columnSpacing", value.asInstanceOf[js.Any])
      
      inline def setColumnSpacingUndefined: Self = StObject.set(x, "columnSpacing", js.undefined)
      
      inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setConnectorLine(value: CommonSeriesOptionsConnectorLine): Self = StObject.set(x, "connectorLine", value.asInstanceOf[js.Any])
      
      inline def setConnectorLineUndefined: Self = StObject.set(x, "connectorLine", js.undefined)
      
      inline def setCornerRadius(value: CommonSeriesOptionsCornerRadius): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDoughnutCoefficient(value: Double): Self = StObject.set(x, "doughnutCoefficient", value.asInstanceOf[js.Any])
      
      inline def setDoughnutCoefficientUndefined: Self = StObject.set(x, "doughnutCoefficient", js.undefined)
      
      inline def setDoughnutSize(value: Double): Self = StObject.set(x, "doughnutSize", value.asInstanceOf[js.Any])
      
      inline def setDoughnutSizeUndefined: Self = StObject.set(x, "doughnutSize", js.undefined)
      
      inline def setDragSettings(value: CommonSeriesOptionsDragSettings): Self = StObject.set(x, "dragSettings", value.asInstanceOf[js.Any])
      
      inline def setDragSettingsUndefined: Self = StObject.set(x, "dragSettings", js.undefined)
      
      inline def setDrawType(value: DrawType | String): Self = StObject.set(x, "drawType", value.asInstanceOf[js.Any])
      
      inline def setDrawTypeUndefined: Self = StObject.set(x, "drawType", js.undefined)
      
      inline def setEmptyPointSettings(value: CommonSeriesOptionsEmptyPointSettings): Self = StObject.set(x, "emptyPointSettings", value.asInstanceOf[js.Any])
      
      inline def setEmptyPointSettingsUndefined: Self = StObject.set(x, "emptyPointSettings", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setEnableSmartLabels(value: Boolean): Self = StObject.set(x, "enableSmartLabels", value.asInstanceOf[js.Any])
      
      inline def setEnableSmartLabelsUndefined: Self = StObject.set(x, "enableSmartLabels", js.undefined)
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setErrorBar(value: CommonSeriesOptionsErrorBar): Self = StObject.set(x, "errorBar", value.asInstanceOf[js.Any])
      
      inline def setErrorBarUndefined: Self = StObject.set(x, "errorBar", js.undefined)
      
      inline def setExplode(value: Boolean): Self = StObject.set(x, "explode", value.asInstanceOf[js.Any])
      
      inline def setExplodeAll(value: Boolean): Self = StObject.set(x, "explodeAll", value.asInstanceOf[js.Any])
      
      inline def setExplodeAllUndefined: Self = StObject.set(x, "explodeAll", js.undefined)
      
      inline def setExplodeIndex(value: Double): Self = StObject.set(x, "explodeIndex", value.asInstanceOf[js.Any])
      
      inline def setExplodeIndexUndefined: Self = StObject.set(x, "explodeIndex", js.undefined)
      
      inline def setExplodeOffset(value: Double): Self = StObject.set(x, "explodeOffset", value.asInstanceOf[js.Any])
      
      inline def setExplodeOffsetUndefined: Self = StObject.set(x, "explodeOffset", js.undefined)
      
      inline def setExplodeUndefined: Self = StObject.set(x, "explode", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: CommonSeriesOptionsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFunnelHeight(value: String): Self = StObject.set(x, "funnelHeight", value.asInstanceOf[js.Any])
      
      inline def setFunnelHeightUndefined: Self = StObject.set(x, "funnelHeight", js.undefined)
      
      inline def setFunnelWidth(value: String): Self = StObject.set(x, "funnelWidth", value.asInstanceOf[js.Any])
      
      inline def setFunnelWidthUndefined: Self = StObject.set(x, "funnelWidth", js.undefined)
      
      inline def setGapRatio(value: Double): Self = StObject.set(x, "gapRatio", value.asInstanceOf[js.Any])
      
      inline def setGapRatioUndefined: Self = StObject.set(x, "gapRatio", js.undefined)
      
      inline def setGapWidth(value: Double): Self = StObject.set(x, "gapWidth", value.asInstanceOf[js.Any])
      
      inline def setGapWidthUndefined: Self = StObject.set(x, "gapWidth", js.undefined)
      
      inline def setHigh(value: String): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setHighlightSettings(value: CommonSeriesOptionsHighlightSettings): Self = StObject.set(x, "highlightSettings", value.asInstanceOf[js.Any])
      
      inline def setHighlightSettingsUndefined: Self = StObject.set(x, "highlightSettings", js.undefined)
      
      inline def setIsClosed(value: Boolean): Self = StObject.set(x, "isClosed", value.asInstanceOf[js.Any])
      
      inline def setIsClosedUndefined: Self = StObject.set(x, "isClosed", js.undefined)
      
      inline def setIsStacking(value: Boolean): Self = StObject.set(x, "isStacking", value.asInstanceOf[js.Any])
      
      inline def setIsStackingUndefined: Self = StObject.set(x, "isStacking", js.undefined)
      
      inline def setIsTransposed(value: Boolean): Self = StObject.set(x, "isTransposed", value.asInstanceOf[js.Any])
      
      inline def setIsTransposedUndefined: Self = StObject.set(x, "isTransposed", js.undefined)
      
      inline def setLabelPosition(value: LabelPosition | String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLineCap(value: LineCap | String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      inline def setLineJoin(value: LineJoin | String): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      inline def setLow(value: String): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setMarker(value: CommonSeriesOptionsMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOutlierSettings(value: CommonSeriesOptionsOutlierSettings): Self = StObject.set(x, "outlierSettings", value.asInstanceOf[js.Any])
      
      inline def setOutlierSettingsUndefined: Self = StObject.set(x, "outlierSettings", js.undefined)
      
      inline def setPalette(value: String): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setPieCoefficient(value: Double): Self = StObject.set(x, "pieCoefficient", value.asInstanceOf[js.Any])
      
      inline def setPieCoefficientUndefined: Self = StObject.set(x, "pieCoefficient", js.undefined)
      
      inline def setPieOfPieCoefficient(value: Double): Self = StObject.set(x, "pieOfPieCoefficient", value.asInstanceOf[js.Any])
      
      inline def setPieOfPieCoefficientUndefined: Self = StObject.set(x, "pieOfPieCoefficient", js.undefined)
      
      inline def setPointColorMappingName(value: String): Self = StObject.set(x, "pointColorMappingName", value.asInstanceOf[js.Any])
      
      inline def setPointColorMappingNameUndefined: Self = StObject.set(x, "pointColorMappingName", js.undefined)
      
      inline def setPositiveFill(value: String): Self = StObject.set(x, "positiveFill", value.asInstanceOf[js.Any])
      
      inline def setPositiveFillUndefined: Self = StObject.set(x, "positiveFill", js.undefined)
      
      inline def setPyramidMode(value: PyramidMode | String): Self = StObject.set(x, "pyramidMode", value.asInstanceOf[js.Any])
      
      inline def setPyramidModeUndefined: Self = StObject.set(x, "pyramidMode", js.undefined)
      
      inline def setSelectionSettings(value: CommonSeriesOptionsSelectionSettings): Self = StObject.set(x, "selectionSettings", value.asInstanceOf[js.Any])
      
      inline def setSelectionSettingsUndefined: Self = StObject.set(x, "selectionSettings", js.undefined)
      
      inline def setShowMedian(value: Boolean): Self = StObject.set(x, "showMedian", value.asInstanceOf[js.Any])
      
      inline def setShowMedianUndefined: Self = StObject.set(x, "showMedian", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSplineType(value: SplineType | String): Self = StObject.set(x, "splineType", value.asInstanceOf[js.Any])
      
      inline def setSplineTypeUndefined: Self = StObject.set(x, "splineType", js.undefined)
      
      inline def setSplitMode(value: SplitMode | String): Self = StObject.set(x, "splitMode", value.asInstanceOf[js.Any])
      
      inline def setSplitModeUndefined: Self = StObject.set(x, "splitMode", js.undefined)
      
      inline def setSplitValue(value: String): Self = StObject.set(x, "splitValue", value.asInstanceOf[js.Any])
      
      inline def setSplitValueUndefined: Self = StObject.set(x, "splitValue", js.undefined)
      
      inline def setStackingGroup(value: String): Self = StObject.set(x, "stackingGroup", value.asInstanceOf[js.Any])
      
      inline def setStackingGroupUndefined: Self = StObject.set(x, "stackingGroup", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setTooltip(value: CommonSeriesOptionsTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTrendlines(value: js.Array[CommonSeriesOptionsTrendline]): Self = StObject.set(x, "trendlines", value.asInstanceOf[js.Any])
      
      inline def setTrendlinesUndefined: Self = StObject.set(x, "trendlines", js.undefined)
      
      inline def setTrendlinesVarargs(value: CommonSeriesOptionsTrendline*): Self = StObject.set(x, "trendlines", js.Array(value*))
      
      inline def setType(value: typings.ejWebAll.ej.Type | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisibleOnLegend(value: String): Self = StObject.set(x, "visibleOnLegend", value.asInstanceOf[js.Any])
      
      inline def setVisibleOnLegendUndefined: Self = StObject.set(x, "visibleOnLegend", js.undefined)
      
      inline def setXAxisName(value: String): Self = StObject.set(x, "xAxisName", value.asInstanceOf[js.Any])
      
      inline def setXAxisNameUndefined: Self = StObject.set(x, "xAxisName", js.undefined)
      
      inline def setXName(value: String): Self = StObject.set(x, "xName", value.asInstanceOf[js.Any])
      
      inline def setXNameUndefined: Self = StObject.set(x, "xName", js.undefined)
      
      inline def setYAxisName(value: String): Self = StObject.set(x, "yAxisName", value.asInstanceOf[js.Any])
      
      inline def setYAxisNameUndefined: Self = StObject.set(x, "yAxisName", js.undefined)
      
      inline def setYName(value: String): Self = StObject.set(x, "yName", value.asInstanceOf[js.Any])
      
      inline def setYNameUndefined: Self = StObject.set(x, "yName", js.undefined)
      
      inline def setZOrder(value: Double): Self = StObject.set(x, "zOrder", value.asInstanceOf[js.Any])
      
      inline def setZOrderUndefined: Self = StObject.set(x, "zOrder", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsBorder extends StObject {
    
    /** Border color of all series.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** DashArray for border of the series.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Border width of all series.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsBorder {
    
    inline def apply(): CommonSeriesOptionsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsBubbleOptions extends StObject {
    
    /** Used for setting the maximum radius of the bubble
      * @Default {3}
      */
    var maxRadius: js.UndefOr[Double] = js.undefined
    
    /** Used for the setting the minimum radius of the bubble
      * @Default {1}
      */
    var minRadius: js.UndefOr[Double] = js.undefined
    
    /** Used for the calculation of the bubble radius based on the mode selected
      * @Default {minMax}
      */
    var radiusMode: js.UndefOr[RadiusMode | String] = js.undefined
  }
  object CommonSeriesOptionsBubbleOptions {
    
    inline def apply(): CommonSeriesOptionsBubbleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsBubbleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsBubbleOptions] (val x: Self) extends AnyVal {
      
      inline def setMaxRadius(value: Double): Self = StObject.set(x, "maxRadius", value.asInstanceOf[js.Any])
      
      inline def setMaxRadiusUndefined: Self = StObject.set(x, "maxRadius", js.undefined)
      
      inline def setMinRadius(value: Double): Self = StObject.set(x, "minRadius", value.asInstanceOf[js.Any])
      
      inline def setMinRadiusUndefined: Self = StObject.set(x, "minRadius", js.undefined)
      
      inline def setRadiusMode(value: RadiusMode | String): Self = StObject.set(x, "radiusMode", value.asInstanceOf[js.Any])
      
      inline def setRadiusModeUndefined: Self = StObject.set(x, "radiusMode", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsConnectorLine extends StObject {
    
    /** Color of the connector line.
      * @Default {#565656}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** DashArray of the connector line.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** DashArray of the connector line.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Width of the connector line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsConnectorLine {
    
    inline def apply(): CommonSeriesOptionsConnectorLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsConnectorLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsConnectorLine] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsCornerRadius extends StObject {
    
    /** Specifies the radius for the bottom left corner.
      * @Default {0}
      */
    var bottomLeft: js.UndefOr[Double] = js.undefined
    
    /** Specifies the radius for the bottom right corner.
      * @Default {0}
      */
    var bottomRight: js.UndefOr[Double] = js.undefined
    
    /** Specifies the radius for the top left corner.
      * @Default {0}
      */
    var topLeft: js.UndefOr[Double] = js.undefined
    
    /** Specifies the radius for the top right corner.
      * @Default {0}
      */
    var topRight: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsCornerRadius {
    
    inline def apply(): CommonSeriesOptionsCornerRadius = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsCornerRadius]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsCornerRadius] (val x: Self) extends AnyVal {
      
      inline def setBottomLeft(value: Double): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
      
      inline def setBottomRight(value: Double): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
      
      inline def setTopLeft(value: Double): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
      
      inline def setTopRight(value: Double): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
      
      inline def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsDragSettings extends StObject {
    
    /** drag/drop the series
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the type of drag settings.
      * @Default {xy}
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CommonSeriesOptionsDragSettings {
    
    inline def apply(): CommonSeriesOptionsDragSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsDragSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsDragSettings] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsEmptyPointSettings extends StObject {
    
    /** Specifies the mode of empty point.
      * @Default {gap}
      */
    var displayMode: js.UndefOr[EmptyPointMode | String] = js.undefined
    
    /** Options for customizing the color and border of the empty point in the series.
      */
    var style: js.UndefOr[CommonSeriesOptionsEmptyPointSettingsStyle] = js.undefined
    
    /** Controls the visibility of the empty point.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object CommonSeriesOptionsEmptyPointSettings {
    
    inline def apply(): CommonSeriesOptionsEmptyPointSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsEmptyPointSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsEmptyPointSettings] (val x: Self) extends AnyVal {
      
      inline def setDisplayMode(value: EmptyPointMode | String): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
      
      inline def setStyle(value: CommonSeriesOptionsEmptyPointSettingsStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsEmptyPointSettingsStyle extends StObject {
    
    /** Options for customizing border of the empty point in the series.
      */
    var border: js.UndefOr[CommonSeriesOptionsEmptyPointSettingsStyleBorder] = js.undefined
    
    /** Color of the empty point.
      */
    var color: js.UndefOr[String] = js.undefined
  }
  object CommonSeriesOptionsEmptyPointSettingsStyle {
    
    inline def apply(): CommonSeriesOptionsEmptyPointSettingsStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsEmptyPointSettingsStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsEmptyPointSettingsStyle] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: CommonSeriesOptionsEmptyPointSettingsStyleBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsEmptyPointSettingsStyleBorder extends StObject {
    
    /** Border color of the empty point.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the empty point.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsEmptyPointSettingsStyleBorder {
    
    inline def apply(): CommonSeriesOptionsEmptyPointSettingsStyleBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsEmptyPointSettingsStyleBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsEmptyPointSettingsStyleBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsErrorBar extends StObject {
    
    /** Options for customizing the error bar cap.
      */
    var cap: js.UndefOr[CommonSeriesOptionsErrorBarCap] = js.undefined
    
    /** Specifies the direction of error bar.
      * @Default {both}
      */
    var direction: js.UndefOr[ErrorBarDirection | String] = js.undefined
    
    /** Fill color of the error bar.
      * @Default {#000000}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Value of horizontal  error bar.
      * @Default {1}
      */
    var horizontalErrorValue: js.UndefOr[Double] = js.undefined
    
    /** Value of negative horizontal error bar.
      * @Default {1}
      */
    var horizontalNegativeErrorValue: js.UndefOr[Double] = js.undefined
    
    /** Value of positive horizontal error bar.
      * @Default {1}
      */
    var horizontalPositiveErrorValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the mode of error bar.
      * @Default {vertical}
      */
    var mode: js.UndefOr[ErrorBarMode | String] = js.undefined
    
    /** Specifies the type of error bar.
      * @Default {FixedValue}
      */
    var `type`: js.UndefOr[ErrorBarType | String] = js.undefined
    
    /** Value of vertical error bar.
      * @Default {3}
      */
    var verticalErrorValue: js.UndefOr[Double] = js.undefined
    
    /** Value of negative vertical error bar.
      * @Default {5}
      */
    var verticalNegativeErrorValue: js.UndefOr[Double] = js.undefined
    
    /** Value of positive vertical error bar.
      * @Default {5}
      */
    var verticalPositiveErrorValue: js.UndefOr[Double] = js.undefined
    
    /** Show/hides the error bar
      * @Default {visible}
      */
    var visibility: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the error bar.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsErrorBar {
    
    inline def apply(): CommonSeriesOptionsErrorBar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsErrorBar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsErrorBar] (val x: Self) extends AnyVal {
      
      inline def setCap(value: CommonSeriesOptionsErrorBarCap): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
      
      inline def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
      
      inline def setDirection(value: ErrorBarDirection | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHorizontalErrorValue(value: Double): Self = StObject.set(x, "horizontalErrorValue", value.asInstanceOf[js.Any])
      
      inline def setHorizontalErrorValueUndefined: Self = StObject.set(x, "horizontalErrorValue", js.undefined)
      
      inline def setHorizontalNegativeErrorValue(value: Double): Self = StObject.set(x, "horizontalNegativeErrorValue", value.asInstanceOf[js.Any])
      
      inline def setHorizontalNegativeErrorValueUndefined: Self = StObject.set(x, "horizontalNegativeErrorValue", js.undefined)
      
      inline def setHorizontalPositiveErrorValue(value: Double): Self = StObject.set(x, "horizontalPositiveErrorValue", value.asInstanceOf[js.Any])
      
      inline def setHorizontalPositiveErrorValueUndefined: Self = StObject.set(x, "horizontalPositiveErrorValue", js.undefined)
      
      inline def setMode(value: ErrorBarMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setType(value: ErrorBarType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVerticalErrorValue(value: Double): Self = StObject.set(x, "verticalErrorValue", value.asInstanceOf[js.Any])
      
      inline def setVerticalErrorValueUndefined: Self = StObject.set(x, "verticalErrorValue", js.undefined)
      
      inline def setVerticalNegativeErrorValue(value: Double): Self = StObject.set(x, "verticalNegativeErrorValue", value.asInstanceOf[js.Any])
      
      inline def setVerticalNegativeErrorValueUndefined: Self = StObject.set(x, "verticalNegativeErrorValue", js.undefined)
      
      inline def setVerticalPositiveErrorValue(value: Double): Self = StObject.set(x, "verticalPositiveErrorValue", value.asInstanceOf[js.Any])
      
      inline def setVerticalPositiveErrorValueUndefined: Self = StObject.set(x, "verticalPositiveErrorValue", js.undefined)
      
      inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsErrorBarCap extends StObject {
    
    /** Color of the error bar cap.
      * @Default {â€œ#000000â€}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Length of the error bar cap.
      * @Default {1}
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /** Show/Hides the error bar cap.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the error bar cap.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsErrorBarCap {
    
    inline def apply(): CommonSeriesOptionsErrorBarCap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsErrorBarCap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsErrorBarCap] (val x: Self) extends AnyVal {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsFont extends StObject {
    
    /** Font color of the text in all series.
      * @Default {#707070}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Font Family for all the series.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specifies the font Style for all the series.
      * @Default {normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Specifies the font weight for all the series.
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity for text in all the series.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size for text in all the series.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object CommonSeriesOptionsFont {
    
    inline def apply(): CommonSeriesOptionsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsFont] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsHighlightSettings extends StObject {
    
    /** Options for customizing the border of series on highlight.
      */
    var border: js.UndefOr[CommonSeriesOptionsHighlightSettingsBorder] = js.undefined
    
    /** Color of the series/point on highlight.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Custom pattern for the series on highlight.
      */
    var customPattern: js.UndefOr[String] = js.undefined
    
    /** Enables/disables the ability to highlight the series or data point interactively.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether the series or data point has to be highlighted.
      * @Default {series. See Mode}
      */
    var mode: js.UndefOr[Mode | String] = js.undefined
    
    /** Opacity of the series/point on highlight.
      * @Default {0.6}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the pattern for the series/point on highlight.
      * @Default {none. See Pattern}
      */
    var pattern: js.UndefOr[String] = js.undefined
  }
  object CommonSeriesOptionsHighlightSettings {
    
    inline def apply(): CommonSeriesOptionsHighlightSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsHighlightSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsHighlightSettings] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: CommonSeriesOptionsHighlightSettingsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCustomPattern(value: String): Self = StObject.set(x, "customPattern", value.asInstanceOf[js.Any])
      
      inline def setCustomPatternUndefined: Self = StObject.set(x, "customPattern", js.undefined)
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setMode(value: Mode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsHighlightSettingsBorder extends StObject {
    
    /** Border color of the series/point on highlight.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the series/point on highlight.
      * @Default {2}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object CommonSeriesOptionsHighlightSettingsBorder {
    
    inline def apply(): CommonSeriesOptionsHighlightSettingsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsHighlightSettingsBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsHighlightSettingsBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsMarker extends StObject {
    
    /** Options for customizing the border of the marker shape.
      */
    var border: js.UndefOr[CommonSeriesOptionsMarkerBorder] = js.undefined
    
    /** Options for displaying and customizing data labels.
      */
    var dataLabel: js.UndefOr[CommonSeriesOptionsMarkerDataLabel] = js.undefined
    
    /** Color of the marker shape.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** The URL for the Image to be displayed as marker. In order to display image as marker, set series.marker.shape as â€˜imageâ€™.
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** Opacity of the marker.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the shape of the marker.
      * @Default {circle. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.undefined
    
    /** Options for customizing the size of the marker shape.
      */
    var size: js.UndefOr[CommonSeriesOptionsMarkerSize] = js.undefined
    
    /** Controls the visibility of the marker shape.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object CommonSeriesOptionsMarker {
    
    inline def apply(): CommonSeriesOptionsMarker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsMarker] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: CommonSeriesOptionsMarkerBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setDataLabel(value: CommonSeriesOptionsMarkerDataLabel): Self = StObject.set(x, "dataLabel", value.asInstanceOf[js.Any])
      
      inline def setDataLabelUndefined: Self = StObject.set(x, "dataLabel", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: CommonSeriesOptionsMarkerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsMarkerBorder extends StObject {
    
    /** Border color of the marker shape.
      * @Default {white}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the marker shape.
      * @Default {3}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsMarkerBorder {
    
    inline def apply(): CommonSeriesOptionsMarkerBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarkerBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsMarkerBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsMarkerDataLabel extends StObject {
    
    /** Angle of the data label in degrees. Only the text gets rotated, whereas the background and border does not rotate.
      * @Default {null}
      */
    var angle: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the border of the data label.
      */
    var border: js.UndefOr[CommonSeriesOptionsMarkerDataLabelBorder] = js.undefined
    
    /** Options for displaying and customizing the line that connects point and data label.
      */
    var connectorLine: js.UndefOr[CommonSeriesOptionsMarkerDataLabelConnectorLine] = js.undefined
    
    /** Enables saturation to the data label.
      * @Default {false}
      */
    var enableContrastColor: js.UndefOr[Boolean] = js.undefined
    
    /** Enable the wrap option to the data label.
      * @Default {false}
      */
    var enableWrap: js.UndefOr[Boolean] = js.undefined
    
    /** Background color of the data label.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the data label font.
      */
    var font: js.UndefOr[CommonSeriesOptionsMarkerDataLabelFont] = js.undefined
    
    /** Horizontal alignment of the data label.
      * @Default {center}
      */
    var horizontalTextAlignment: js.UndefOr[HorizontalTextAlignment | String] = js.undefined
    
    /** Margin of the text to its background shape. The size of the background shape increases based on the margin applied to its text.
      */
    var margin: js.UndefOr[CommonSeriesOptionsMarkerDataLabelMargin] = js.undefined
    
    /** Maximum label width of the data label.
      * @Default {null}
      */
    var maximumLabelWidth: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the datalabel positions
      */
    var offset: js.UndefOr[CommonSeriesOptionsMarkerDataLabelOffset] = js.undefined
    
    /** Opacity of the data label.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Background shape of the data label.
      * @Default {none. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.undefined
    
    /** Displays the partially visible labels inside the chart Area
      * @Default {false}
      */
    var showEdgeLabels: js.UndefOr[Boolean] = js.undefined
    
    /** Custom template to format the data label content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Name of a field in data source, where datalabel text is displayed.
      */
    var textMappingName: js.UndefOr[String] = js.undefined
    
    /** Specifies the position of the data label. This property can be used only for the series such as column, bar, stacked column, stacked bar, 100% stacked column, 100% stacked bar,
      * candle and OHLC.
      * @Default {top. See TextPosition}
      */
    var textPosition: js.UndefOr[TextPosition | String] = js.undefined
    
    /** Vertical alignment of the data label.
      * @Default {center}
      */
    var verticalTextAlignment: js.UndefOr[VerticalTextAlignment | String] = js.undefined
    
    /** Controls the visibility of the data labels.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object CommonSeriesOptionsMarkerDataLabel {
    
    inline def apply(): CommonSeriesOptionsMarkerDataLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsMarkerDataLabel] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setBorder(value: CommonSeriesOptionsMarkerDataLabelBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setConnectorLine(value: CommonSeriesOptionsMarkerDataLabelConnectorLine): Self = StObject.set(x, "connectorLine", value.asInstanceOf[js.Any])
      
      inline def setConnectorLineUndefined: Self = StObject.set(x, "connectorLine", js.undefined)
      
      inline def setEnableContrastColor(value: Boolean): Self = StObject.set(x, "enableContrastColor", value.asInstanceOf[js.Any])
      
      inline def setEnableContrastColorUndefined: Self = StObject.set(x, "enableContrastColor", js.undefined)
      
      inline def setEnableWrap(value: Boolean): Self = StObject.set(x, "enableWrap", value.asInstanceOf[js.Any])
      
      inline def setEnableWrapUndefined: Self = StObject.set(x, "enableWrap", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: CommonSeriesOptionsMarkerDataLabelFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHorizontalTextAlignment(value: HorizontalTextAlignment | String): Self = StObject.set(x, "horizontalTextAlignment", value.asInstanceOf[js.Any])
      
      inline def setHorizontalTextAlignmentUndefined: Self = StObject.set(x, "horizontalTextAlignment", js.undefined)
      
      inline def setMargin(value: CommonSeriesOptionsMarkerDataLabelMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMaximumLabelWidth(value: Double): Self = StObject.set(x, "maximumLabelWidth", value.asInstanceOf[js.Any])
      
      inline def setMaximumLabelWidthUndefined: Self = StObject.set(x, "maximumLabelWidth", js.undefined)
      
      inline def setOffset(value: CommonSeriesOptionsMarkerDataLabelOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setShowEdgeLabels(value: Boolean): Self = StObject.set(x, "showEdgeLabels", value.asInstanceOf[js.Any])
      
      inline def setShowEdgeLabelsUndefined: Self = StObject.set(x, "showEdgeLabels", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTextMappingName(value: String): Self = StObject.set(x, "textMappingName", value.asInstanceOf[js.Any])
      
      inline def setTextMappingNameUndefined: Self = StObject.set(x, "textMappingName", js.undefined)
      
      inline def setTextPosition(value: TextPosition | String): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
      
      inline def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
      
      inline def setVerticalTextAlignment(value: VerticalTextAlignment | String): Self = StObject.set(x, "verticalTextAlignment", value.asInstanceOf[js.Any])
      
      inline def setVerticalTextAlignmentUndefined: Self = StObject.set(x, "verticalTextAlignment", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsMarkerDataLabelBorder extends StObject {
    
    /** Border color of the data label.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the data label.
      * @Default {0.1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsMarkerDataLabelBorder {
    
    inline def apply(): CommonSeriesOptionsMarkerDataLabelBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabelBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsMarkerDataLabelBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsMarkerDataLabelConnectorLine extends StObject {
    
    /** Color of the connector line.
      * @Default {#565656}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Height of the connector line.
      * @Default {null}
      */
    var height: js.UndefOr[String] = js.undefined
    
    /** Specifies when the connector has to be drawn as Bezier curve or straight line. This is applicable only for Pie and Doughnut chart types.
      * @Default {line. See ConnectorLineType}
      */
    var `type`: js.UndefOr[ConnectorLineType | String] = js.undefined
    
    /** Width of the connector.
      * @Default {0.5}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsMarkerDataLabelConnectorLine {
    
    inline def apply(): CommonSeriesOptionsMarkerDataLabelConnectorLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabelConnectorLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsMarkerDataLabelConnectorLine] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setType(value: ConnectorLineType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsMarkerDataLabelFont extends StObject {
    
    /** Font color of the data label text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Font family of the data label.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of the data label.
      * @Default {normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the data label.
      * @Default {regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity of the text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the data label.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object CommonSeriesOptionsMarkerDataLabelFont {
    
    inline def apply(): CommonSeriesOptionsMarkerDataLabelFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabelFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsMarkerDataLabelFont] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsMarkerDataLabelMargin extends StObject {
    
    /** Bottom margin of the text.
      * @Default {5}
      */
    var bottom: js.UndefOr[Double] = js.undefined
    
    /** Left margin of the text.
      * @Default {5}
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /** Right margin of the text.
      * @Default {5}
      */
    var right: js.UndefOr[Double] = js.undefined
    
    /** Top margin of the text.
      * @Default {5}
      */
    var top: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsMarkerDataLabelMargin {
    
    inline def apply(): CommonSeriesOptionsMarkerDataLabelMargin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabelMargin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsMarkerDataLabelMargin] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsMarkerDataLabelOffset extends StObject {
    
    /** X value or horizontal offset to position the labels in chart.
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Y value or vertical offset to position the labels.
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsMarkerDataLabelOffset {
    
    inline def apply(): CommonSeriesOptionsMarkerDataLabelOffset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabelOffset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsMarkerDataLabelOffset] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsMarkerSize extends StObject {
    
    /** Height of the marker.
      * @Default {6}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Width of the marker.
      * @Default {6}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsMarkerSize {
    
    inline def apply(): CommonSeriesOptionsMarkerSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarkerSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsMarkerSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsOutlierSettings extends StObject {
    
    /** Specifies the shape of the outlier.
      * @Default {circle. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.undefined
    
    /** Options for customizing the size of the outlier shape.
      */
    var size: js.UndefOr[CommonSeriesOptionsOutlierSettingsSize] = js.undefined
  }
  object CommonSeriesOptionsOutlierSettings {
    
    inline def apply(): CommonSeriesOptionsOutlierSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsOutlierSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsOutlierSettings] (val x: Self) extends AnyVal {
      
      inline def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: CommonSeriesOptionsOutlierSettingsSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsOutlierSettingsSize extends StObject {
    
    /** Height of the outlier shape.
      * @Default {6}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Width of the outlier shape.
      * @Default {6}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsOutlierSettingsSize {
    
    inline def apply(): CommonSeriesOptionsOutlierSettingsSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsOutlierSettingsSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsOutlierSettingsSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsSelectionSettings extends StObject {
    
    /** Options for customizing the border of the series on selection.
      */
    var border: js.UndefOr[CommonSeriesOptionsSelectionSettingsBorder] = js.undefined
    
    /** Color of the series/point on selection.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Custom pattern for the series on selection.
      */
    var customPattern: js.UndefOr[String] = js.undefined
    
    /** Enables/disables the ability to select a series/data point interactively.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether the series or data point has to be selected.
      * @Default {series. See Mode}
      */
    var mode: js.UndefOr[Mode | String] = js.undefined
    
    /** Opacity of the series/point on selection.
      * @Default {0.6}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the pattern for the series/point on selection.
      * @Default {none. See Pattern}
      */
    var pattern: js.UndefOr[String] = js.undefined
    
    /** Specifies the drawn rectangle type.
      * @Default {xy}
      */
    var rangeType: js.UndefOr[RangeType | String] = js.undefined
    
    /** Specifies the type of selection.
      * @Default {single}
      */
    var `type`: js.UndefOr[SelectionType | String] = js.undefined
  }
  object CommonSeriesOptionsSelectionSettings {
    
    inline def apply(): CommonSeriesOptionsSelectionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsSelectionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsSelectionSettings] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: CommonSeriesOptionsSelectionSettingsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCustomPattern(value: String): Self = StObject.set(x, "customPattern", value.asInstanceOf[js.Any])
      
      inline def setCustomPatternUndefined: Self = StObject.set(x, "customPattern", js.undefined)
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setMode(value: Mode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setRangeType(value: RangeType | String): Self = StObject.set(x, "rangeType", value.asInstanceOf[js.Any])
      
      inline def setRangeTypeUndefined: Self = StObject.set(x, "rangeType", js.undefined)
      
      inline def setType(value: SelectionType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsSelectionSettingsBorder extends StObject {
    
    /** Border color of the series/point on selection.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the series/point on selection.
      * @Default {2}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object CommonSeriesOptionsSelectionSettingsBorder {
    
    inline def apply(): CommonSeriesOptionsSelectionSettingsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsSelectionSettingsBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsSelectionSettingsBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsTooltip extends StObject {
    
    /** Options for customizing the border of the tooltip.
      */
    var border: js.UndefOr[CommonSeriesOptionsTooltipBorder] = js.undefined
    
    /** Specifies the duration, the tooltip has to be displayed.
      * @Default {500ms}
      */
    var duration: js.UndefOr[String] = js.undefined
    
    /** Enables/disables the animation of the tooltip when moving from one point to other.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Background color of the tooltip.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Format of the tooltip content.
      * @Default {#point.x# : #point.y#}
      */
    var format: js.UndefOr[String] = js.undefined
    
    /** Opacity of the tooltip.
      * @Default {0.5}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Customize the corner radius of the tooltip rectangle.
      * @Default {0}
      */
    var rx: js.UndefOr[Double] = js.undefined
    
    /** Customize the corner radius of the tooltip rectangle.
      * @Default {0}
      */
    var ry: js.UndefOr[Double] = js.undefined
    
    /** Custom template to format the tooltip content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Controls the visibility of the tooltip.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object CommonSeriesOptionsTooltip {
    
    inline def apply(): CommonSeriesOptionsTooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsTooltip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsTooltip] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: CommonSeriesOptionsTooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsTooltipBorder extends StObject {
    
    /** Border color of the tooltip.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the tooltip.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsTooltipBorder {
    
    inline def apply(): CommonSeriesOptionsTooltipBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsTooltipBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsTooltipBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsTrendline extends StObject {
    
    /** Past trends of the current series.
      * @Default {0}
      */
    var backwardForecast: js.UndefOr[Double] = js.undefined
    
    /** Pattern of dashes and gaps used to stroke the trendline.
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Fill color of the trendlines.
      * @Default {#0000FF}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Future trends of the current series.
      * @Default {0}
      */
    var forwardForecast: js.UndefOr[Double] = js.undefined
    
    /** Specifies the intercept value of the trendlines.
      * @Default {null}
      */
    var intercept: js.UndefOr[Double] = js.undefined
    
    /** Name for the trendlines that is to be displayed in the legend text.
      * @Default {trendline}
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Opacity of the trendline.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the moving average starting period value.
      * @Default {2}
      */
    var period: js.UndefOr[Double] = js.undefined
    
    /** Specifies the order of the polynomial trendlines.
      * @Default {0}
      */
    var polynomialOrder: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the tooltip of the trendlines in the chart.
      */
    var tooltip: js.UndefOr[CommonSeriesOptionsTrendlinesTooltip] = js.undefined
    
    /** Specifies the type of the trendline for the series.
      * @Default {linear. See TrendlinesType}
      */
    var `type`: js.UndefOr[TrendlinesType | String] = js.undefined
    
    /** Show/hides the trendline.
      */
    var visibility: js.UndefOr[Boolean] = js.undefined
    
    /** Show/hides the trendline legend.
      * @Default {visible}
      */
    var visibleOnLegend: js.UndefOr[String] = js.undefined
    
    /** Width of the trendlines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsTrendline {
    
    inline def apply(): CommonSeriesOptionsTrendline = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsTrendline]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsTrendline] (val x: Self) extends AnyVal {
      
      inline def setBackwardForecast(value: Double): Self = StObject.set(x, "backwardForecast", value.asInstanceOf[js.Any])
      
      inline def setBackwardForecastUndefined: Self = StObject.set(x, "backwardForecast", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setForwardForecast(value: Double): Self = StObject.set(x, "forwardForecast", value.asInstanceOf[js.Any])
      
      inline def setForwardForecastUndefined: Self = StObject.set(x, "forwardForecast", js.undefined)
      
      inline def setIntercept(value: Double): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
      
      inline def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      inline def setPolynomialOrder(value: Double): Self = StObject.set(x, "polynomialOrder", value.asInstanceOf[js.Any])
      
      inline def setPolynomialOrderUndefined: Self = StObject.set(x, "polynomialOrder", js.undefined)
      
      inline def setTooltip(value: CommonSeriesOptionsTrendlinesTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setType(value: TrendlinesType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setVisibleOnLegend(value: String): Self = StObject.set(x, "visibleOnLegend", value.asInstanceOf[js.Any])
      
      inline def setVisibleOnLegendUndefined: Self = StObject.set(x, "visibleOnLegend", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsTrendlinesTooltip extends StObject {
    
    /** Options for customizing the border of the  trendline tooltip.
      */
    var border: js.UndefOr[CommonSeriesOptionsTrendlinesTooltipBorder] = js.undefined
    
    /** Specifies the duration, the tooltip has to be displayed.
      * @Default {500ms}
      */
    var duration: js.UndefOr[String] = js.undefined
    
    /** Enables/disables the animation of the trendline tooltip when moving from one point to other.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Background color of the trendline tooltip.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Format of the tooltip content displayed in the trendlines.
      * @Default {#point.x# : #point.y#}
      */
    var format: js.UndefOr[String] = js.undefined
    
    /** Opacity of the trendline tooltip.
      * @Default {0.5}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Customize the corner radius of the trendline tooltip rectangle.
      * @Default {0}
      */
    var rx: js.UndefOr[Double] = js.undefined
    
    /** Customize the corner radius of the trendline tooltip rectangle.
      * @Default {0}
      */
    var ry: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsTrendlinesTooltip {
    
    inline def apply(): CommonSeriesOptionsTrendlinesTooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsTrendlinesTooltip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsTrendlinesTooltip] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: CommonSeriesOptionsTrendlinesTooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    }
  }
  
  trait CommonSeriesOptionsTrendlinesTooltipBorder extends StObject {
    
    /** Border color of the trendline tooltip.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the trendline tooltip.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CommonSeriesOptionsTrendlinesTooltipBorder {
    
    inline def apply(): CommonSeriesOptionsTrendlinesTooltipBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsTrendlinesTooltipBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonSeriesOptionsTrendlinesTooltipBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Crosshair extends StObject {
    
    /** Options for customizing the crosshair line.
      */
    var line: js.UndefOr[CrosshairLine] = js.undefined
    
    /** Options for customizing the marker in crosshair.
      */
    var marker: js.UndefOr[CrosshairMarker] = js.undefined
    
    /** Options for customizing the trackball tooltip.
      */
    var trackballTooltipSettings: js.UndefOr[CrosshairTrackballTooltipSettings] = js.undefined
    
    /** Specifies the type of the crosshair. It can be trackball or crosshair
      * @Default {crosshair. See CrosshairType}
      */
    var `type`: js.UndefOr[CrosshairType | String] = js.undefined
    
    /** Show/hides the crosshair/trackball visibility.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object Crosshair {
    
    inline def apply(): Crosshair = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Crosshair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Crosshair] (val x: Self) extends AnyVal {
      
      inline def setLine(value: CrosshairLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setMarker(value: CrosshairMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      inline def setTrackballTooltipSettings(value: CrosshairTrackballTooltipSettings): Self = StObject.set(x, "trackballTooltipSettings", value.asInstanceOf[js.Any])
      
      inline def setTrackballTooltipSettingsUndefined: Self = StObject.set(x, "trackballTooltipSettings", js.undefined)
      
      inline def setType(value: CrosshairType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait CrosshairLine extends StObject {
    
    /** Color of the crosshair line.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Width of the crosshair line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CrosshairLine {
    
    inline def apply(): CrosshairLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrosshairLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CrosshairLine] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CrosshairMarker extends StObject {
    
    /** Options for customizing the border.
      */
    var border: js.UndefOr[CrosshairMarkerBorder] = js.undefined
    
    /** Opacity of the marker.
      * @Default {true}
      */
    var opacity: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the size of the marker.
      */
    var size: js.UndefOr[CrosshairMarkerSize] = js.undefined
    
    /** Show/hides the marker.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object CrosshairMarker {
    
    inline def apply(): CrosshairMarker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrosshairMarker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CrosshairMarker] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: CrosshairMarkerBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setOpacity(value: Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: CrosshairMarkerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait CrosshairMarkerBorder extends StObject {
    
    /** Border width of the marker.
      * @Default {3}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CrosshairMarkerBorder {
    
    inline def apply(): CrosshairMarkerBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrosshairMarkerBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CrosshairMarkerBorder] (val x: Self) extends AnyVal {
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CrosshairMarkerSize extends StObject {
    
    /** Height of the marker.
      * @Default {10}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Width of the marker.
      * @Default {10}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CrosshairMarkerSize {
    
    inline def apply(): CrosshairMarkerSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrosshairMarkerSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CrosshairMarkerSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CrosshairTrackballTooltipSettings extends StObject {
    
    /** Options for customizing the trackball tooltip border.
      */
    var border: js.UndefOr[CrosshairTrackballTooltipSettingsBorder] = js.undefined
    
    /** Background color of the trackball tooltip.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Specifies the mode of the trackball tooltip.
      * @Default {float. See CrosshairMode}
      */
    var mode: js.UndefOr[CrosshairMode | String] = js.undefined
    
    /** Opacity value of the trackball tooltip.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Rounded corner x value of the trackball tooltip.
      * @Default {3}
      */
    var rx: js.UndefOr[Double] = js.undefined
    
    /** Rounded corner y value of the trackball tooltip.
      * @Default {3}
      */
    var ry: js.UndefOr[Double] = js.undefined
  }
  object CrosshairTrackballTooltipSettings {
    
    inline def apply(): CrosshairTrackballTooltipSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrosshairTrackballTooltipSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CrosshairTrackballTooltipSettings] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: CrosshairTrackballTooltipSettingsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setMode(value: CrosshairMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    }
  }
  
  trait CrosshairTrackballTooltipSettingsBorder extends StObject {
    
    /** Border color of the trackball tooltip.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the trackball tooltip.
      * @Default {null}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CrosshairTrackballTooltipSettingsBorder {
    
    inline def apply(): CrosshairTrackballTooltipSettingsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrosshairTrackballTooltipSettingsBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CrosshairTrackballTooltipSettingsBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DisplayTextRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** text - Text displayed in data label. You can add custom text to the data label    locationX - X-coordinate of data label location    locationY - Y-coordinate of data label
      * location    seriesIndex - Index of the series in series Collection whose data label is being rendered    pointIndex - Index of the point in series whose data label is being
      * rendered
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DisplayTextRenderingEventArgs {
    
    inline def apply(): DisplayTextRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayTextRenderingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisplayTextRenderingEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait DragEndEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** seriesIndex - Series Index of the point held for dragging    pointIndex - PointIndex of the point held for dragging    oldValue - Previous value of the point before dragging
      * newValue - Current value of the point    series - Contains the all the series information of the chart
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DragEndEventArgs {
    
    inline def apply(): DragEndEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragEndEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragEndEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait DragStartEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** seriesIndex - Series Index of the point held for dragging    pointIndex - PointIndex of the point held for dragging    point - Information of the point held for dragging
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DragStartEventArgs {
    
    inline def apply(): DragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragStartEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragStartEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait DraggingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** seriesIndex - Series Index of the point held for dragging    pointIndex - PointIndex of the point held for dragging    oldValue - Previous value of the point before dragging
      * newValue - Current value of the point
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DraggingEventArgs {
    
    inline def apply(): DraggingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraggingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DraggingEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait ErrorBarRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** errorBar - Error bar Object
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ErrorBarRenderingEventArgs {
    
    inline def apply(): ErrorBarRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBarRenderingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorBarRenderingEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait ExportSettings extends StObject {
    
    /** Specifies the name of the action URL
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** Specifies the angle for rotation
      * @Default {0}
      */
    var angle: js.UndefOr[Double] = js.undefined
    
    /** Specifies the downloading filename
      * @Default {chart}
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /** Specifies the mode of exporting
      * @Default {client}
      */
    var mode: js.UndefOr[ExportingMode | String] = js.undefined
    
    /** Enable/ disable the multiple excel exporting
      * @Default {false}
      */
    var multipleExport: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the orientation of the document
      * @Default {portrait}
      */
    var orientation: js.UndefOr[ExportingOrientation | String] = js.undefined
    
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
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setMode(value: ExportingMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMultipleExport(value: Boolean): Self = StObject.set(x, "multipleExport", value.asInstanceOf[js.Any])
      
      inline def setMultipleExportUndefined: Self = StObject.set(x, "multipleExport", js.undefined)
      
      inline def setOrientation(value: ExportingOrientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setType(value: ExportingType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Indicator extends StObject {
    
    /** Specifies animation duration for indicator rendering.
      * @Default {null}
      */
    var animationDuration: js.UndefOr[Boolean] = js.undefined
    
    /** The dPeriod value for stochastic indicator.
      * @Default {3}
      */
    var dPeriod: js.UndefOr[Double] = js.undefined
    
    /** Enables/disables the animation.
      * @Default {false}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Color of the technical indicator.
      * @Default {#00008B}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Options to customize the histogram in MACD indicator.
      */
    var histogram: js.UndefOr[IndicatorsHistogram] = js.undefined
    
    /** Specifies the k period in stochastic indicator.
      * @Default {3}
      */
    var kPeriod: js.UndefOr[Double] = js.undefined
    
    /** Specifies the long period in MACD indicator.
      * @Default {26}
      */
    var longPeriod: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the lower line in indicators.
      */
    var lowerLine: js.UndefOr[IndicatorsLowerLine] = js.undefined
    
    /** Options to customize the MACD line.
      */
    var macdLine: js.UndefOr[IndicatorsMacdLine] = js.undefined
    
    /** Specifies the type of the MACD indicator.
      * @Default {line. See MACDType}
      */
    var macdType: js.UndefOr[String] = js.undefined
    
    /** Specifies period value in indicator.
      * @Default {14}
      */
    var period: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the period line in indicators.
      */
    var periodLine: js.UndefOr[IndicatorsPeriodLine] = js.undefined
    
    /** Name of the series for which indicator has to be drawn.
      */
    var seriesName: js.UndefOr[String] = js.undefined
    
    /** Specifies the short period in MACD indicator.
      * @Default {13}
      */
    var shortPeriod: js.UndefOr[Double] = js.undefined
    
    /** Specifies the standard deviation value for Bollinger band indicator.
      * @Default {2}
      */
    var standardDeviations: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the tooltip.
      */
    var tooltip: js.UndefOr[IndicatorsTooltip] = js.undefined
    
    /** Trigger value of MACD indicator.
      * @Default {9}
      */
    var trigger: js.UndefOr[Double] = js.undefined
    
    /** Specifies the type of indicator that has to be rendered.
      * @Default {sma. See IndicatorsType}
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Options to customize the upper line in indicators
      */
    var upperLine: js.UndefOr[IndicatorsUpperLine] = js.undefined
    
    /** Specifies the visibility of indicator.
      * @Default {visible}
      */
    var visibility: js.UndefOr[String] = js.undefined
    
    /** Width of the indicator line.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /** Name of the horizontal axis used for indicator. Primary X axis is used when x axis name is not specified.
      */
    var xAxisName: js.UndefOr[String] = js.undefined
    
    /** Name of the vertical axis used for indicator. Primary Y axis is used when y axis name is not specified
      */
    var yAxisName: js.UndefOr[String] = js.undefined
  }
  object Indicator {
    
    inline def apply(): Indicator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Indicator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Indicator] (val x: Self) extends AnyVal {
      
      inline def setAnimationDuration(value: Boolean): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setDPeriod(value: Double): Self = StObject.set(x, "dPeriod", value.asInstanceOf[js.Any])
      
      inline def setDPeriodUndefined: Self = StObject.set(x, "dPeriod", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHistogram(value: IndicatorsHistogram): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
      
      inline def setHistogramUndefined: Self = StObject.set(x, "histogram", js.undefined)
      
      inline def setKPeriod(value: Double): Self = StObject.set(x, "kPeriod", value.asInstanceOf[js.Any])
      
      inline def setKPeriodUndefined: Self = StObject.set(x, "kPeriod", js.undefined)
      
      inline def setLongPeriod(value: Double): Self = StObject.set(x, "longPeriod", value.asInstanceOf[js.Any])
      
      inline def setLongPeriodUndefined: Self = StObject.set(x, "longPeriod", js.undefined)
      
      inline def setLowerLine(value: IndicatorsLowerLine): Self = StObject.set(x, "lowerLine", value.asInstanceOf[js.Any])
      
      inline def setLowerLineUndefined: Self = StObject.set(x, "lowerLine", js.undefined)
      
      inline def setMacdLine(value: IndicatorsMacdLine): Self = StObject.set(x, "macdLine", value.asInstanceOf[js.Any])
      
      inline def setMacdLineUndefined: Self = StObject.set(x, "macdLine", js.undefined)
      
      inline def setMacdType(value: String): Self = StObject.set(x, "macdType", value.asInstanceOf[js.Any])
      
      inline def setMacdTypeUndefined: Self = StObject.set(x, "macdType", js.undefined)
      
      inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setPeriodLine(value: IndicatorsPeriodLine): Self = StObject.set(x, "periodLine", value.asInstanceOf[js.Any])
      
      inline def setPeriodLineUndefined: Self = StObject.set(x, "periodLine", js.undefined)
      
      inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      inline def setSeriesName(value: String): Self = StObject.set(x, "seriesName", value.asInstanceOf[js.Any])
      
      inline def setSeriesNameUndefined: Self = StObject.set(x, "seriesName", js.undefined)
      
      inline def setShortPeriod(value: Double): Self = StObject.set(x, "shortPeriod", value.asInstanceOf[js.Any])
      
      inline def setShortPeriodUndefined: Self = StObject.set(x, "shortPeriod", js.undefined)
      
      inline def setStandardDeviations(value: Double): Self = StObject.set(x, "standardDeviations", value.asInstanceOf[js.Any])
      
      inline def setStandardDeviationsUndefined: Self = StObject.set(x, "standardDeviations", js.undefined)
      
      inline def setTooltip(value: IndicatorsTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTrigger(value: Double): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUpperLine(value: IndicatorsUpperLine): Self = StObject.set(x, "upperLine", value.asInstanceOf[js.Any])
      
      inline def setUpperLineUndefined: Self = StObject.set(x, "upperLine", js.undefined)
      
      inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setXAxisName(value: String): Self = StObject.set(x, "xAxisName", value.asInstanceOf[js.Any])
      
      inline def setXAxisNameUndefined: Self = StObject.set(x, "xAxisName", js.undefined)
      
      inline def setYAxisName(value: String): Self = StObject.set(x, "yAxisName", value.asInstanceOf[js.Any])
      
      inline def setYAxisNameUndefined: Self = StObject.set(x, "yAxisName", js.undefined)
    }
  }
  
  trait IndicatorsHistogram extends StObject {
    
    /** Options to customize the histogram border in MACD indicator.
      */
    var border: js.UndefOr[IndicatorsHistogramBorder] = js.undefined
    
    /** Color of histogram columns in MACD indicator.
      * @Default {#ccccff}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Opacity of histogram columns in MACD indicator.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object IndicatorsHistogram {
    
    inline def apply(): IndicatorsHistogram = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndicatorsHistogram]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndicatorsHistogram] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: IndicatorsHistogramBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait IndicatorsHistogramBorder extends StObject {
    
    /** Color of the histogram border in MACD indicator.
      * @Default {#9999ff}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Controls the width of histogram border line in MACD indicator.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object IndicatorsHistogramBorder {
    
    inline def apply(): IndicatorsHistogramBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndicatorsHistogramBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndicatorsHistogramBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IndicatorsLowerLine extends StObject {
    
    /** Color of lower line.
      * @Default {#008000}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Width of the lower line.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object IndicatorsLowerLine {
    
    inline def apply(): IndicatorsLowerLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndicatorsLowerLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndicatorsLowerLine] (val x: Self) extends AnyVal {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IndicatorsMacdLine extends StObject {
    
    /** Color of MACD line.
      * @Default {#ff9933}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Width of the MACD line.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object IndicatorsMacdLine {
    
    inline def apply(): IndicatorsMacdLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndicatorsMacdLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndicatorsMacdLine] (val x: Self) extends AnyVal {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IndicatorsPeriodLine extends StObject {
    
    /** Color of period line in indicator.
      * @Default {blue}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Width of the period line in indicators.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object IndicatorsPeriodLine {
    
    inline def apply(): IndicatorsPeriodLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndicatorsPeriodLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndicatorsPeriodLine] (val x: Self) extends AnyVal {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IndicatorsTooltip extends StObject {
    
    /** Option to customize the border of indicator tooltip.
      */
    var border: js.UndefOr[IndicatorsTooltipBorder] = js.undefined
    
    /** Specifies the animation duration of indicator tooltip.
      * @Default {500ms}
      */
    var duration: js.UndefOr[String] = js.undefined
    
    /** Enables/disables the tooltip animation.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Background color of indicator tooltip.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Format of indicator tooltip. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
      * @Default {#point.x# : #point.y#}
      */
    var format: js.UndefOr[String] = js.undefined
    
    /** Opacity of indicator tooltip.
      * @Default {0.95}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Controls the visibility of indicator tooltip.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object IndicatorsTooltip {
    
    inline def apply(): IndicatorsTooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndicatorsTooltip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndicatorsTooltip] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: IndicatorsTooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait IndicatorsTooltipBorder extends StObject {
    
    /** Border color of indicator tooltip.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of indicator tooltip.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object IndicatorsTooltipBorder {
    
    inline def apply(): IndicatorsTooltipBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndicatorsTooltipBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndicatorsTooltipBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IndicatorsUpperLine extends StObject {
    
    /** Fill color of the upper line in indicators
      * @Default {#ff9933}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Width of the upper line in indicators.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object IndicatorsUpperLine {
    
    inline def apply(): IndicatorsUpperLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndicatorsUpperLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndicatorsUpperLine] (val x: Self) extends AnyVal {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Legend extends StObject {
    
    /** Horizontal alignment of the legend.
      * @Default {Center. See Alignment}
      */
    var alignment: js.UndefOr[Alignment | String] = js.undefined
    
    /** Background for the legend. Use this property to add a background image or background color for the legend.
      */
    var background: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the legend border.
      */
    var border: js.UndefOr[LegendBorder] = js.undefined
    
    /** Number of columns to arrange the legend items.
      * @Default {null}
      */
    var columnCount: js.UndefOr[Double] = js.undefined
    
    /** Controls whether legend has to use scrollbar or not. When enabled, scroll bar appears depending upon size and position properties of legend.
      * @Default {true}
      */
    var enableScrollbar: js.UndefOr[Boolean] = js.undefined
    
    /** Fill color for the legend items. By using this property, it displays all legend item shapes in same color.Legend items representing invisible series is displayed in gray color.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Options to customize the font used for legend item text.
      */
    var font: js.UndefOr[LegendFont] = js.undefined
    
    /** Gap or padding between the legend items.
      * @Default {10}
      */
    var itemPadding: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the style of legend items.
      */
    var itemStyle: js.UndefOr[LegendItemStyle] = js.undefined
    
    /** Options to customize the location of chart legend. Legend is placed in provided location only when value of position property is custom
      */
    var location: js.UndefOr[LegendLocation] = js.undefined
    
    /** Opacity of the legend.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Places the legend at specified position. Legend can be placed at **left**, **right**, **top** or **bottom** of the chart area. To manually specify the location of legend, set
      * **custom** as value to this property.
      * @Default {Bottom. See Position}
      */
    var position: js.UndefOr[Position | String] = js.undefined
    
    /** Number of rows to arrange the legend items.
      * @Default {null}
      */
    var rowCount: js.UndefOr[Double] = js.undefined
    
    /** Shape of the legend items. Default shape for pie and doughnut series is circle and all other series uses rectangle.
      * @Default {None. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.undefined
    
    /** Options to customize the size of the legend.
      */
    var size: js.UndefOr[LegendSize] = js.undefined
    
    /** Specifies the action taken when the legend width is more than the textWidth.
      * @Default {none. See textOverflow}
      */
    var textOverflow: js.UndefOr[TextOverflow | String] = js.undefined
    
    /** Text width for legend item.
      * @Default {34}
      */
    var textWidth: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the legend title.
      */
    var title: js.UndefOr[LegendTitle] = js.undefined
    
    /** Controls the selection through the legend.
      * @Default {true}
      */
    var toggleSeriesVisibility: js.UndefOr[Boolean] = js.undefined
    
    /** Controls the visibility of the legend.
      * @Default {true}
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
      
      inline def setAlignment(value: Alignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBorder(value: LegendBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      inline def setEnableScrollbar(value: Boolean): Self = StObject.set(x, "enableScrollbar", value.asInstanceOf[js.Any])
      
      inline def setEnableScrollbarUndefined: Self = StObject.set(x, "enableScrollbar", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: LegendFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setItemPadding(value: Double): Self = StObject.set(x, "itemPadding", value.asInstanceOf[js.Any])
      
      inline def setItemPaddingUndefined: Self = StObject.set(x, "itemPadding", js.undefined)
      
      inline def setItemStyle(value: LegendItemStyle): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setLocation(value: LegendLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPosition(value: Position | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
      
      inline def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: LegendSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      inline def setTextWidth(value: Double): Self = StObject.set(x, "textWidth", value.asInstanceOf[js.Any])
      
      inline def setTextWidthUndefined: Self = StObject.set(x, "textWidth", js.undefined)
      
      inline def setTitle(value: LegendTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToggleSeriesVisibility(value: Boolean): Self = StObject.set(x, "toggleSeriesVisibility", value.asInstanceOf[js.Any])
      
      inline def setToggleSeriesVisibilityUndefined: Self = StObject.set(x, "toggleSeriesVisibility", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait LegendBorder extends StObject {
    
    /** Border color of the legend.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the legend.
      * @Default {1}
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
  
  trait LegendBoundsCalculateEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** legendBoundsHeight - Height of the legend    legendBoundsWidth - Width of the legend.    legendBoundsRows - Number of rows to display the legend items
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LegendBoundsCalculateEventArgs {
    
    inline def apply(): LegendBoundsCalculateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendBoundsCalculateEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendBoundsCalculateEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait LegendFont extends StObject {
    
    /** Font family for legend item text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style for legend item text.
      * @Default {Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight for legend item text.
      * @Default {Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Font size for legend item text.
      * @Default {12px}
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
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait LegendItemClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** startX - X-coordinate of legend item in pixel    startY - Y-coordinate of legend item in pixel    LegendItem - Instance of the legend item object that is about to be rendered
      * style - Options to customize the legend item styles such as border, color, size, etcâ€¦,    Bounds - Instance that holds information about legend bounds and legend item bounds.
      * symbolShape - Name of the legend item shape. Use this option to customize legend item shape before rendering    series - Instance of the series object corresponding to the
      * legend item
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
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
  
  trait LegendItemMouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** startX - X-coordinate of legend item in pixel    startY - Y-coordinate of legend item in pixel    LegendItem - Instance of the legend item object that is about to be rendered
      * style - Options to customize the legend item styles such as border, color, size, etcâ€¦,    Bounds - Instance that holds information about legend bounds and legend item bounds.
      * symbolShape - Name of the legend item shape. Use this option to customize legend item shape before rendering    series - Instance of the series object corresponding to the
      * legend item
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LegendItemMouseMoveEventArgs {
    
    inline def apply(): LegendItemMouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemMouseMoveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendItemMouseMoveEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait LegendItemRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** startX - X-coordinate of legend item in pixel    startY - Y-coordinate of legend item in pixel    legendItem - Instance of the legend item object that is about to be rendered
      * style - Options to customize the legend item styles such as border, color, size, etc.    symbolShape - Name of the legend item shape. Use this option to customize legend item
      * shape before rendering
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LegendItemRenderingEventArgs {
    
    inline def apply(): LegendItemRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemRenderingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendItemRenderingEventArgs] (val x: Self) extends AnyVal {
      
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
    
    /** Height of the shape in legend items.
      * @Default {10}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Width of the shape in legend items.
      * @Default {10}
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
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the legend items.
      * @Default {1}
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
  
  trait LegendLocation extends StObject {
    
    /** X value or horizontal offset to position the legend in chart.
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Y value or vertical offset to position the legend.
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object LegendLocation {
    
    inline def apply(): LegendLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendLocation] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait LegendSize extends StObject {
    
    /** Height of the legend. Height can be specified in either pixel or percentage.
      * @Default {null}
      */
    var height: js.UndefOr[String] = js.undefined
    
    /** Width of the legend. Width can be specified in either pixel or percentage.
      * @Default {null}
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
  
  trait LegendTitle extends StObject {
    
    /** Options to customize the font used for legend title
      */
    var font: js.UndefOr[LegendTitleFont] = js.undefined
    
    /** Text to be displayed in legend title.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Alignment of the legend title.
      * @Default {center. See Alignment}
      */
    var textAlignment: js.UndefOr[Alignment | String] = js.undefined
  }
  object LegendTitle {
    
    inline def apply(): LegendTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendTitle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendTitle] (val x: Self) extends AnyVal {
      
      inline def setFont(value: LegendTitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlignment(value: Alignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait LegendTitleFont extends StObject {
    
    /** Font family for the text in legend title.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style for legend title.
      * @Default {normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight for legend title.
      * @Default {normal. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Font size for legend title.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object LegendTitleFont {
    
    inline def apply(): LegendTitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendTitleFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendTitleFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait LoadEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
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
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Margin extends StObject {
    
    /** Spacing for the bottom margin of the chart area. Setting positive value decreases the height of the chart area from the bottom.
      * @Default {10}
      */
    var bottom: js.UndefOr[Double] = js.undefined
    
    /** Spacing for the left margin of chart area. Setting positive value decreases the width of the chart area from left side.
      * @Default {10}
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /** Spacing for the right margin of chart area. Setting positive value decreases the width of the chart area from right side.
      * @Default {10}
      */
    var right: js.UndefOr[Double] = js.undefined
    
    /** Spacing for the top margin of chart area. Setting positive value decreases the height of the chart area from the top.
      * @Default {10}
      */
    var top: js.UndefOr[Double] = js.undefined
  }
  object Margin {
    
    inline def apply(): Margin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Margin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Margin] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Fires, after the chart is resized.
      */
    var afterResize: js.UndefOr[js.Function1[/* e */ AfterResizeEventArgs, scala.Unit]] = js.undefined
    
    /** Fires after the series animation is completed. This event will be triggered for each series when animation is enabled.
      */
    var animationComplete: js.UndefOr[js.Function1[/* e */ AnimationCompleteEventArgs, scala.Unit]] = js.undefined
    
    /** Fires on clicking the annotation.
      */
    var annotationClick: js.UndefOr[js.Function1[/* e */ AnnotationClickEventArgs, scala.Unit]] = js.undefined
    
    /** Options for adding and customizing annotations in Chart.
      */
    var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
    
    /** To override x axis for particular series, create an axis object by providing unique name by using name property and add it to axes array. Then, assign the name to the seriesâ€™s
      * xAxisName property to link both axis and series.
      */
    var axes: js.UndefOr[js.Array[Axis]] = js.undefined
    
    /** Fires before rendering the labels. This event is fired for each label in axis. You can use this event to add custom text to axis labels.
      */
    var axesLabelRendering: js.UndefOr[js.Function1[/* e */ AxesLabelRenderingEventArgs, scala.Unit]] = js.undefined
    
    /** Fires during the initialization of axis labels.
      */
    var axesLabelsInitialize: js.UndefOr[js.Function1[/* e */ AxesLabelsInitializeEventArgs, scala.Unit]] = js.undefined
    
    /** Fires during axes range calculation. This event is fired for each axis present in Chart. You can use this event to customize axis range as required.
      */
    var axesRangeCalculate: js.UndefOr[js.Function1[/* e */ AxesRangeCalculateEventArgs, scala.Unit]] = js.undefined
    
    /** Fires before rendering the axis title. This event is triggered for each axis with title. You can use this event to add custom text to axis title.
      */
    var axesTitleRendering: js.UndefOr[js.Function1[/* e */ AxesTitleRenderingEventArgs, scala.Unit]] = js.undefined
    
    /** Fires, on clicking the axis label.
      */
    var axisLabelClick: js.UndefOr[js.Function1[/* e */ AxisLabelClickEventArgs, scala.Unit]] = js.undefined
    
    /** Fires on moving mouse over the axis label.
      */
    var axisLabelMouseMove: js.UndefOr[js.Function1[/* e */ AxisLabelMouseMoveEventArgs, scala.Unit]] = js.undefined
    
    /** URL of the image to be used as chart background.
      * @Default {null}
      */
    var backGroundImageUrl: js.UndefOr[String] = js.undefined
    
    /** Sets the background color of the  chart.
      * @Default {transparent}
      */
    var background: js.UndefOr[String] = js.undefined
    
    /** Fires, when chart size is changing.
      */
    var beforeResize: js.UndefOr[js.Function1[/* e */ BeforeResizeEventArgs, scala.Unit]] = js.undefined
    
    /** Options for customizing the color, opacity and width of the chart border.
      */
    var border: js.UndefOr[Border] = js.undefined
    
    /** Options for configuring the border and background of the plot area.
      */
    var chartArea: js.UndefOr[ChartArea] = js.undefined
    
    /** Fires during the calculation of chart area bounds. You can use this event to customize the bounds of chart area.
      */
    var chartAreaBoundsCalculate: js.UndefOr[js.Function1[/* e */ ChartAreaBoundsCalculateEventArgs, scala.Unit]] = js.undefined
    
    /** Fires, on the clicking the chart.
      */
    var chartClick: js.UndefOr[js.Function1[/* e */ ChartClickEventArgs, scala.Unit]] = js.undefined
    
    /** Fires, on double clicking the chart.
      */
    var chartDoubleClick: js.UndefOr[js.Function1[/* e */ ChartDoubleClickEventArgs, scala.Unit]] = js.undefined
    
    /** Fires when the mouse pointer leaves the chart
      */
    var chartMouseLeave: js.UndefOr[js.Function1[/* e */ ChartMouseLeaveEventArgs, scala.Unit]] = js.undefined
    
    /** Fires on moving mouse over the chart.
      */
    var chartMouseMove: js.UndefOr[js.Function1[/* e */ ChartMouseMoveEventArgs, scala.Unit]] = js.undefined
    
    /** Options to split Chart into multiple plotting areas vertically. Each object in the collection represents a plotting area in Chart.
      */
    var columnDefinitions: js.UndefOr[js.Array[ColumnDefinition]] = js.undefined
    
    /** Options for configuring the properties of all the series. You can also override the options for specific series by using series collection.
      */
    var commonSeriesOptions: js.UndefOr[CommonSeriesOptions] = js.undefined
    
    /** Fires after chart is created.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
    
    /** Options for displaying and customizing the crosshair.
      */
    var crosshair: js.UndefOr[Crosshair] = js.undefined
    
    /** Depth of the 3D Chart from front view of series to background wall. This property is applicable only for 3D view.
      * @Default {100}
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /** Fires when chart is destroyed completely.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
    
    /** Fires before rendering the data labels. This event is triggered for each data label in the series. You can use this event to add custom text in data labels.
      */
    var displayTextRendering: js.UndefOr[js.Function1[/* e */ DisplayTextRenderingEventArgs, scala.Unit]] = js.undefined
    
    /** Fires when the dragging is completed
      */
    var dragEnd: js.UndefOr[js.Function1[/* e */ DragEndEventArgs, scala.Unit]] = js.undefined
    
    /** Fires when the dragging is started
      */
    var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, scala.Unit]] = js.undefined
    
    /** Fires while  dragging
      */
    var dragging: js.UndefOr[js.Function1[/* e */ DraggingEventArgs, scala.Unit]] = js.undefined
    
    /** Controls whether 3D view has to be enabled or not. 3D view is supported only for column, bar. Stacking column, stacking bar, pie and doughnut series types.
      * @Default {false}
      */
    var enable3D: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether Chart has to be rendered as Canvas or SVG. Canvas rendering supports all functionalities in SVG rendering except 3D Charts.
      * @Default {false}
      */
    var enableCanvasRendering: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether 3D view has to be rotated on dragging. This property is applicable only for 3D view.
      * @Default {false}
      */
    var enableRotation: js.UndefOr[Boolean] = js.undefined
    
    /** Fires, when error bar is rendering.
      */
    var errorBarRendering: js.UndefOr[js.Function1[/* e */ ErrorBarRenderingEventArgs, scala.Unit]] = js.undefined
    
    /** This provides options for customizing export settings
      */
    var exportSettings: js.UndefOr[ExportSettings] = js.undefined
    
    /** Options to customize the technical indicators.
      */
    var indicators: js.UndefOr[js.Array[Indicator]] = js.undefined
    
    /** Controls whether the series has to be rendered at initial loading of chart, this will be useful in scenarios where chart is placed at the bottom of the web page and we need to
      * render the series only when the chart is visible while scrolling to the top.
      * @Default {true}
      */
    var initSeriesRender: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether Chart has to be responsive while resizing.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Options to customize the legend items and legend title.
      */
    var legend: js.UndefOr[Legend] = js.undefined
    
    /** Fires during the calculation of legend bounds. You can use this event to customize the bounds of legend.
      */
    var legendBoundsCalculate: js.UndefOr[js.Function1[/* e */ LegendBoundsCalculateEventArgs, scala.Unit]] = js.undefined
    
    /** Fires on clicking the legend item.
      */
    var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, scala.Unit]] = js.undefined
    
    /** Fires when moving mouse over legend item. You can use this event for hit testing on legend items.
      */
    var legendItemMouseMove: js.UndefOr[js.Function1[/* e */ LegendItemMouseMoveEventArgs, scala.Unit]] = js.undefined
    
    /** Fires before rendering the legend item. This event is fired for each legend item in Chart. You can use this event to customize legend item shape or add custom text to legend item.
      */
    var legendItemRendering: js.UndefOr[js.Function1[/* e */ LegendItemRenderingEventArgs, scala.Unit]] = js.undefined
    
    /** Fires before loading the chart.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
    
    /** Name of the culture based on which chart should be localized. Number and date time values are localized with respect to the culture name.String type properties like title text are
      * not localized automatically. Provide localized text as value to string type properties.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Options to customize the left, right, top and bottom margins of chart area.
      */
    var margin: js.UndefOr[Margin] = js.undefined
    
    /** Fires, on the clicking the Multi level labels of the chart .
      */
    var multiLevelLabelClick: js.UndefOr[js.Function1[/* e */ MultiLevelLabelClickEventArgs, scala.Unit]] = js.undefined
    
    /** Fires, when multi level labels are rendering.
      */
    var multiLevelLabelRendering: js.UndefOr[js.Function1[/* e */ MultiLevelLabelRenderingEventArgs, scala.Unit]] = js.undefined
    
    /** Palette is used to store the series fill color in array and apply the color to series collection in the order of series index.
      * @Default {null}
      */
    var palette: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Perspective angle of the 3D view. Chart appears closer when perspective angle is decreased, and distant when perspective angle is increased.This property is applicable only when
      * 3D view is enabled
      * @Default {90}
      */
    var perspectiveAngle: js.UndefOr[Double] = js.undefined
    
    /** Fires on clicking a point in chart. You can use this event to handle clicks made on points.
      */
    var pointRegionClick: js.UndefOr[js.Function1[/* e */ PointRegionClickEventArgs, scala.Unit]] = js.undefined
    
    /** Fires when mouse is moved over a point.
      */
    var pointRegionMouseMove: js.UndefOr[js.Function1[/* e */ PointRegionMouseMoveEventArgs, scala.Unit]] = js.undefined
    
    /** Fires before rendering chart.
      */
    var preRender: js.UndefOr[js.Function1[/* e */ PreRenderEventArgs, scala.Unit]] = js.undefined
    
    /** This is a horizontal axis that contains options to configure axis and it is the primary x axis for all the series in series array. To override x axis for particular series, create
      * an axis object by providing unique name by using name property and add it to axes array. Then, assign the name to the seriesâ€™s xAxisName property to link both axis and series.
      */
    var primaryXAxis: js.UndefOr[PrimaryXAxis] = js.undefined
    
    /** This is a vertical axis that contains options to configure axis. This is the primary y axis for all the series in series array. To override y axis for particular series, create an
      * axis object by providing unique name by using name property and add it to axes array. Then, assign the name to the seriesâ€™s yAxisName property to link both axis and series.
      */
    var primaryYAxis: js.UndefOr[PrimaryYAxis] = js.undefined
    
    /** Fires after selected the data in chart.
      */
    var rangeSelected: js.UndefOr[js.Function1[/* e */ RangeSelectedEventArgs, scala.Unit]] = js.undefined
    
    /** Rotation angle of the 3D view. This property is applicable only when 3D view is enabled.
      * @Default {0}
      */
    var rotation: js.UndefOr[Double] = js.undefined
    
    /** Options to split Chart into multiple plotting areas horizontally. Each object in the collection represents a plotting area in Chart.
      */
    var rowDefinitions: js.UndefOr[js.Array[RowDefinition]] = js.undefined
    
    /** Trigger, after the scrollbar position is changed.
      */
    var scrollChanged: js.UndefOr[js.Function1[/* e */ ScrollChangedEventArgs, scala.Unit]] = js.undefined
    
    /** Event triggered when scroll end
      */
    var scrollEnd: js.UndefOr[js.Function1[/* e */ ScrollEndEventArgs, scala.Unit]] = js.undefined
    
    /** Event triggered when scroll starts
      */
    var scrollStart: js.UndefOr[js.Function1[/* e */ ScrollStartEventArgs, scala.Unit]] = js.undefined
    
    /** Options for displaying the chart along with selected points while loading
      * @Default {[ ]}
      */
    var selectedDataPointIndexes: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the properties used for customizing the series.
      */
    var series: js.UndefOr[js.Array[Series]] = js.undefined
    
    /** Fires after selecting a series. This event is triggered after selecting a series only if selection mode is series.
      */
    var seriesRegionClick: js.UndefOr[js.Function1[/* e */ SeriesRegionClickEventArgs, scala.Unit]] = js.undefined
    
    /** Fires before rendering a series. This event is fired for each series in Chart.
      */
    var seriesRendering: js.UndefOr[js.Function1[/* e */ SeriesRenderingEventArgs, scala.Unit]] = js.undefined
    
    /** Controls whether data points has to be displayed side by side or along the depth of the axis.
      * @Default {false}
      */
    var sideBySideSeriesPlacement: js.UndefOr[Boolean] = js.undefined
    
    /** Options to customize the Chart size.
      */
    var size: js.UndefOr[Size] = js.undefined
    
    /** Fires when the sub Title of the chart is rendered
      */
    var subTitleRendering: js.UndefOr[js.Function1[/* e */ SubTitleRenderingEventArgs, scala.Unit]] = js.undefined
    
    /** Fires before rendering the marker symbols. This event is triggered for each marker in Chart.
      */
    var symbolRendering: js.UndefOr[js.Function1[/* e */ SymbolRenderingEventArgs, scala.Unit]] = js.undefined
    
    /** Specifies the theme for Chart.
      * @Default {Flatlight. See Theme}
      */
    var theme: js.UndefOr[Theme | String] = js.undefined
    
    /** Slope angle of 3D Chart. This property is applicable only when 3D view is enabled.
      * @Default {0}
      */
    var tilt: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the title and subtitle of Chart.
      */
    var title: js.UndefOr[Title] = js.undefined
    
    /** Fires before rendering the Chart title. You can use this event to add custom text in Chart title.
      */
    var titleRendering: js.UndefOr[js.Function1[/* e */ TitleRenderingEventArgs, scala.Unit]] = js.undefined
    
    /** Fires before rendering the tooltip. This event is fired when tooltip is enabled and mouse is hovered on a Chart point. You can use this event to customize tooltip before rendering.
      */
    var toolTipInitialize: js.UndefOr[js.Function1[/* e */ ToolTipInitializeEventArgs, scala.Unit]] = js.undefined
    
    /** Fires before rendering crosshair tooltip in axis. This event is fired for each axis with crosshair label enabled. You can use this event to customize crosshair label before
      * rendering
      */
    var trackAxisToolTip: js.UndefOr[js.Function1[/* e */ TrackAxisToolTipEventArgs, scala.Unit]] = js.undefined
    
    /** Fires before rendering trackball tooltip. This event is fired for each series in Chart because trackball tooltip is displayed for all the series. You can use this event to
      * customize the text displayed in trackball tooltip.
      */
    var trackToolTip: js.UndefOr[js.Function1[/* e */ TrackToolTipEventArgs, scala.Unit]] = js.undefined
    
    /** Fires, when trendlines are rendering.
      */
    var trendlineRendering: js.UndefOr[js.Function1[/* e */ TrendlineRenderingEventArgs, scala.Unit]] = js.undefined
    
    /** Width of the wall used in 3D Chart. Wall is present only in Cartesian type 3D series and not in 3D pie or Doughnut series. This property is applicable only when 3D view is enabled.
      * @Default {2}
      */
    var wallSize: js.UndefOr[Double] = js.undefined
    
    /** Fires while performing rectangle zooming in chart.
      */
    var zoomed: js.UndefOr[js.Function1[/* e */ ZoomedEventArgs, scala.Unit]] = js.undefined
    
    /** Options for enabling zooming feature of chart.
      */
    var zooming: js.UndefOr[Zooming] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.datavisualization.Chart.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.Chart.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.Chart.Model] (val x: Self) extends AnyVal {
      
      inline def setAfterResize(value: /* e */ AfterResizeEventArgs => scala.Unit): Self = StObject.set(x, "afterResize", js.Any.fromFunction1(value))
      
      inline def setAfterResizeUndefined: Self = StObject.set(x, "afterResize", js.undefined)
      
      inline def setAnimationComplete(value: /* e */ AnimationCompleteEventArgs => scala.Unit): Self = StObject.set(x, "animationComplete", js.Any.fromFunction1(value))
      
      inline def setAnimationCompleteUndefined: Self = StObject.set(x, "animationComplete", js.undefined)
      
      inline def setAnnotationClick(value: /* e */ AnnotationClickEventArgs => scala.Unit): Self = StObject.set(x, "annotationClick", js.Any.fromFunction1(value))
      
      inline def setAnnotationClickUndefined: Self = StObject.set(x, "annotationClick", js.undefined)
      
      inline def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setAxes(value: js.Array[Axis]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setAxesLabelRendering(value: /* e */ AxesLabelRenderingEventArgs => scala.Unit): Self = StObject.set(x, "axesLabelRendering", js.Any.fromFunction1(value))
      
      inline def setAxesLabelRenderingUndefined: Self = StObject.set(x, "axesLabelRendering", js.undefined)
      
      inline def setAxesLabelsInitialize(value: /* e */ AxesLabelsInitializeEventArgs => scala.Unit): Self = StObject.set(x, "axesLabelsInitialize", js.Any.fromFunction1(value))
      
      inline def setAxesLabelsInitializeUndefined: Self = StObject.set(x, "axesLabelsInitialize", js.undefined)
      
      inline def setAxesRangeCalculate(value: /* e */ AxesRangeCalculateEventArgs => scala.Unit): Self = StObject.set(x, "axesRangeCalculate", js.Any.fromFunction1(value))
      
      inline def setAxesRangeCalculateUndefined: Self = StObject.set(x, "axesRangeCalculate", js.undefined)
      
      inline def setAxesTitleRendering(value: /* e */ AxesTitleRenderingEventArgs => scala.Unit): Self = StObject.set(x, "axesTitleRendering", js.Any.fromFunction1(value))
      
      inline def setAxesTitleRenderingUndefined: Self = StObject.set(x, "axesTitleRendering", js.undefined)
      
      inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      inline def setAxesVarargs(value: Axis*): Self = StObject.set(x, "axes", js.Array(value*))
      
      inline def setAxisLabelClick(value: /* e */ AxisLabelClickEventArgs => scala.Unit): Self = StObject.set(x, "axisLabelClick", js.Any.fromFunction1(value))
      
      inline def setAxisLabelClickUndefined: Self = StObject.set(x, "axisLabelClick", js.undefined)
      
      inline def setAxisLabelMouseMove(value: /* e */ AxisLabelMouseMoveEventArgs => scala.Unit): Self = StObject.set(x, "axisLabelMouseMove", js.Any.fromFunction1(value))
      
      inline def setAxisLabelMouseMoveUndefined: Self = StObject.set(x, "axisLabelMouseMove", js.undefined)
      
      inline def setBackGroundImageUrl(value: String): Self = StObject.set(x, "backGroundImageUrl", value.asInstanceOf[js.Any])
      
      inline def setBackGroundImageUrlUndefined: Self = StObject.set(x, "backGroundImageUrl", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBeforeResize(value: /* e */ BeforeResizeEventArgs => scala.Unit): Self = StObject.set(x, "beforeResize", js.Any.fromFunction1(value))
      
      inline def setBeforeResizeUndefined: Self = StObject.set(x, "beforeResize", js.undefined)
      
      inline def setBorder(value: Border): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setChartArea(value: ChartArea): Self = StObject.set(x, "chartArea", value.asInstanceOf[js.Any])
      
      inline def setChartAreaBoundsCalculate(value: /* e */ ChartAreaBoundsCalculateEventArgs => scala.Unit): Self = StObject.set(x, "chartAreaBoundsCalculate", js.Any.fromFunction1(value))
      
      inline def setChartAreaBoundsCalculateUndefined: Self = StObject.set(x, "chartAreaBoundsCalculate", js.undefined)
      
      inline def setChartAreaUndefined: Self = StObject.set(x, "chartArea", js.undefined)
      
      inline def setChartClick(value: /* e */ ChartClickEventArgs => scala.Unit): Self = StObject.set(x, "chartClick", js.Any.fromFunction1(value))
      
      inline def setChartClickUndefined: Self = StObject.set(x, "chartClick", js.undefined)
      
      inline def setChartDoubleClick(value: /* e */ ChartDoubleClickEventArgs => scala.Unit): Self = StObject.set(x, "chartDoubleClick", js.Any.fromFunction1(value))
      
      inline def setChartDoubleClickUndefined: Self = StObject.set(x, "chartDoubleClick", js.undefined)
      
      inline def setChartMouseLeave(value: /* e */ ChartMouseLeaveEventArgs => scala.Unit): Self = StObject.set(x, "chartMouseLeave", js.Any.fromFunction1(value))
      
      inline def setChartMouseLeaveUndefined: Self = StObject.set(x, "chartMouseLeave", js.undefined)
      
      inline def setChartMouseMove(value: /* e */ ChartMouseMoveEventArgs => scala.Unit): Self = StObject.set(x, "chartMouseMove", js.Any.fromFunction1(value))
      
      inline def setChartMouseMoveUndefined: Self = StObject.set(x, "chartMouseMove", js.undefined)
      
      inline def setColumnDefinitions(value: js.Array[ColumnDefinition]): Self = StObject.set(x, "columnDefinitions", value.asInstanceOf[js.Any])
      
      inline def setColumnDefinitionsUndefined: Self = StObject.set(x, "columnDefinitions", js.undefined)
      
      inline def setColumnDefinitionsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "columnDefinitions", js.Array(value*))
      
      inline def setCommonSeriesOptions(value: CommonSeriesOptions): Self = StObject.set(x, "commonSeriesOptions", value.asInstanceOf[js.Any])
      
      inline def setCommonSeriesOptionsUndefined: Self = StObject.set(x, "commonSeriesOptions", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => scala.Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCrosshair(value: Crosshair): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
      
      inline def setCrosshairUndefined: Self = StObject.set(x, "crosshair", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => scala.Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDisplayTextRendering(value: /* e */ DisplayTextRenderingEventArgs => scala.Unit): Self = StObject.set(x, "displayTextRendering", js.Any.fromFunction1(value))
      
      inline def setDisplayTextRenderingUndefined: Self = StObject.set(x, "displayTextRendering", js.undefined)
      
      inline def setDragEnd(value: /* e */ DragEndEventArgs => scala.Unit): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1(value))
      
      inline def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
      
      inline def setDragStart(value: /* e */ DragStartEventArgs => scala.Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
      
      inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
      
      inline def setDragging(value: /* e */ DraggingEventArgs => scala.Unit): Self = StObject.set(x, "dragging", js.Any.fromFunction1(value))
      
      inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      inline def setEnable3D(value: Boolean): Self = StObject.set(x, "enable3D", value.asInstanceOf[js.Any])
      
      inline def setEnable3DUndefined: Self = StObject.set(x, "enable3D", js.undefined)
      
      inline def setEnableCanvasRendering(value: Boolean): Self = StObject.set(x, "enableCanvasRendering", value.asInstanceOf[js.Any])
      
      inline def setEnableCanvasRenderingUndefined: Self = StObject.set(x, "enableCanvasRendering", js.undefined)
      
      inline def setEnableRotation(value: Boolean): Self = StObject.set(x, "enableRotation", value.asInstanceOf[js.Any])
      
      inline def setEnableRotationUndefined: Self = StObject.set(x, "enableRotation", js.undefined)
      
      inline def setErrorBarRendering(value: /* e */ ErrorBarRenderingEventArgs => scala.Unit): Self = StObject.set(x, "errorBarRendering", js.Any.fromFunction1(value))
      
      inline def setErrorBarRenderingUndefined: Self = StObject.set(x, "errorBarRendering", js.undefined)
      
      inline def setExportSettings(value: ExportSettings): Self = StObject.set(x, "exportSettings", value.asInstanceOf[js.Any])
      
      inline def setExportSettingsUndefined: Self = StObject.set(x, "exportSettings", js.undefined)
      
      inline def setIndicators(value: js.Array[Indicator]): Self = StObject.set(x, "indicators", value.asInstanceOf[js.Any])
      
      inline def setIndicatorsUndefined: Self = StObject.set(x, "indicators", js.undefined)
      
      inline def setIndicatorsVarargs(value: Indicator*): Self = StObject.set(x, "indicators", js.Array(value*))
      
      inline def setInitSeriesRender(value: Boolean): Self = StObject.set(x, "initSeriesRender", value.asInstanceOf[js.Any])
      
      inline def setInitSeriesRenderUndefined: Self = StObject.set(x, "initSeriesRender", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setLegend(value: Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendBoundsCalculate(value: /* e */ LegendBoundsCalculateEventArgs => scala.Unit): Self = StObject.set(x, "legendBoundsCalculate", js.Any.fromFunction1(value))
      
      inline def setLegendBoundsCalculateUndefined: Self = StObject.set(x, "legendBoundsCalculate", js.undefined)
      
      inline def setLegendItemClick(value: /* e */ LegendItemClickEventArgs => scala.Unit): Self = StObject.set(x, "legendItemClick", js.Any.fromFunction1(value))
      
      inline def setLegendItemClickUndefined: Self = StObject.set(x, "legendItemClick", js.undefined)
      
      inline def setLegendItemMouseMove(value: /* e */ LegendItemMouseMoveEventArgs => scala.Unit): Self = StObject.set(x, "legendItemMouseMove", js.Any.fromFunction1(value))
      
      inline def setLegendItemMouseMoveUndefined: Self = StObject.set(x, "legendItemMouseMove", js.undefined)
      
      inline def setLegendItemRendering(value: /* e */ LegendItemRenderingEventArgs => scala.Unit): Self = StObject.set(x, "legendItemRendering", js.Any.fromFunction1(value))
      
      inline def setLegendItemRenderingUndefined: Self = StObject.set(x, "legendItemRendering", js.undefined)
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setLoad(value: /* e */ LoadEventArgs => scala.Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMargin(value: Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMultiLevelLabelClick(value: /* e */ MultiLevelLabelClickEventArgs => scala.Unit): Self = StObject.set(x, "multiLevelLabelClick", js.Any.fromFunction1(value))
      
      inline def setMultiLevelLabelClickUndefined: Self = StObject.set(x, "multiLevelLabelClick", js.undefined)
      
      inline def setMultiLevelLabelRendering(value: /* e */ MultiLevelLabelRenderingEventArgs => scala.Unit): Self = StObject.set(x, "multiLevelLabelRendering", js.Any.fromFunction1(value))
      
      inline def setMultiLevelLabelRenderingUndefined: Self = StObject.set(x, "multiLevelLabelRendering", js.undefined)
      
      inline def setPalette(value: js.Array[Any]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setPaletteVarargs(value: Any*): Self = StObject.set(x, "palette", js.Array(value*))
      
      inline def setPerspectiveAngle(value: Double): Self = StObject.set(x, "perspectiveAngle", value.asInstanceOf[js.Any])
      
      inline def setPerspectiveAngleUndefined: Self = StObject.set(x, "perspectiveAngle", js.undefined)
      
      inline def setPointRegionClick(value: /* e */ PointRegionClickEventArgs => scala.Unit): Self = StObject.set(x, "pointRegionClick", js.Any.fromFunction1(value))
      
      inline def setPointRegionClickUndefined: Self = StObject.set(x, "pointRegionClick", js.undefined)
      
      inline def setPointRegionMouseMove(value: /* e */ PointRegionMouseMoveEventArgs => scala.Unit): Self = StObject.set(x, "pointRegionMouseMove", js.Any.fromFunction1(value))
      
      inline def setPointRegionMouseMoveUndefined: Self = StObject.set(x, "pointRegionMouseMove", js.undefined)
      
      inline def setPreRender(value: /* e */ PreRenderEventArgs => scala.Unit): Self = StObject.set(x, "preRender", js.Any.fromFunction1(value))
      
      inline def setPreRenderUndefined: Self = StObject.set(x, "preRender", js.undefined)
      
      inline def setPrimaryXAxis(value: PrimaryXAxis): Self = StObject.set(x, "primaryXAxis", value.asInstanceOf[js.Any])
      
      inline def setPrimaryXAxisUndefined: Self = StObject.set(x, "primaryXAxis", js.undefined)
      
      inline def setPrimaryYAxis(value: PrimaryYAxis): Self = StObject.set(x, "primaryYAxis", value.asInstanceOf[js.Any])
      
      inline def setPrimaryYAxisUndefined: Self = StObject.set(x, "primaryYAxis", js.undefined)
      
      inline def setRangeSelected(value: /* e */ RangeSelectedEventArgs => scala.Unit): Self = StObject.set(x, "rangeSelected", js.Any.fromFunction1(value))
      
      inline def setRangeSelectedUndefined: Self = StObject.set(x, "rangeSelected", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setRowDefinitions(value: js.Array[RowDefinition]): Self = StObject.set(x, "rowDefinitions", value.asInstanceOf[js.Any])
      
      inline def setRowDefinitionsUndefined: Self = StObject.set(x, "rowDefinitions", js.undefined)
      
      inline def setRowDefinitionsVarargs(value: RowDefinition*): Self = StObject.set(x, "rowDefinitions", js.Array(value*))
      
      inline def setScrollChanged(value: /* e */ ScrollChangedEventArgs => scala.Unit): Self = StObject.set(x, "scrollChanged", js.Any.fromFunction1(value))
      
      inline def setScrollChangedUndefined: Self = StObject.set(x, "scrollChanged", js.undefined)
      
      inline def setScrollEnd(value: /* e */ ScrollEndEventArgs => scala.Unit): Self = StObject.set(x, "scrollEnd", js.Any.fromFunction1(value))
      
      inline def setScrollEndUndefined: Self = StObject.set(x, "scrollEnd", js.undefined)
      
      inline def setScrollStart(value: /* e */ ScrollStartEventArgs => scala.Unit): Self = StObject.set(x, "scrollStart", js.Any.fromFunction1(value))
      
      inline def setScrollStartUndefined: Self = StObject.set(x, "scrollStart", js.undefined)
      
      inline def setSelectedDataPointIndexes(value: js.Array[Any]): Self = StObject.set(x, "selectedDataPointIndexes", value.asInstanceOf[js.Any])
      
      inline def setSelectedDataPointIndexesUndefined: Self = StObject.set(x, "selectedDataPointIndexes", js.undefined)
      
      inline def setSelectedDataPointIndexesVarargs(value: Any*): Self = StObject.set(x, "selectedDataPointIndexes", js.Array(value*))
      
      inline def setSeries(value: js.Array[Series]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesRegionClick(value: /* e */ SeriesRegionClickEventArgs => scala.Unit): Self = StObject.set(x, "seriesRegionClick", js.Any.fromFunction1(value))
      
      inline def setSeriesRegionClickUndefined: Self = StObject.set(x, "seriesRegionClick", js.undefined)
      
      inline def setSeriesRendering(value: /* e */ SeriesRenderingEventArgs => scala.Unit): Self = StObject.set(x, "seriesRendering", js.Any.fromFunction1(value))
      
      inline def setSeriesRenderingUndefined: Self = StObject.set(x, "seriesRendering", js.undefined)
      
      inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      inline def setSeriesVarargs(value: Series*): Self = StObject.set(x, "series", js.Array(value*))
      
      inline def setSideBySideSeriesPlacement(value: Boolean): Self = StObject.set(x, "sideBySideSeriesPlacement", value.asInstanceOf[js.Any])
      
      inline def setSideBySideSeriesPlacementUndefined: Self = StObject.set(x, "sideBySideSeriesPlacement", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSubTitleRendering(value: /* e */ SubTitleRenderingEventArgs => scala.Unit): Self = StObject.set(x, "subTitleRendering", js.Any.fromFunction1(value))
      
      inline def setSubTitleRenderingUndefined: Self = StObject.set(x, "subTitleRendering", js.undefined)
      
      inline def setSymbolRendering(value: /* e */ SymbolRenderingEventArgs => scala.Unit): Self = StObject.set(x, "symbolRendering", js.Any.fromFunction1(value))
      
      inline def setSymbolRenderingUndefined: Self = StObject.set(x, "symbolRendering", js.undefined)
      
      inline def setTheme(value: Theme | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
      
      inline def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
      
      inline def setTitle(value: Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleRendering(value: /* e */ TitleRenderingEventArgs => scala.Unit): Self = StObject.set(x, "titleRendering", js.Any.fromFunction1(value))
      
      inline def setTitleRenderingUndefined: Self = StObject.set(x, "titleRendering", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToolTipInitialize(value: /* e */ ToolTipInitializeEventArgs => scala.Unit): Self = StObject.set(x, "toolTipInitialize", js.Any.fromFunction1(value))
      
      inline def setToolTipInitializeUndefined: Self = StObject.set(x, "toolTipInitialize", js.undefined)
      
      inline def setTrackAxisToolTip(value: /* e */ TrackAxisToolTipEventArgs => scala.Unit): Self = StObject.set(x, "trackAxisToolTip", js.Any.fromFunction1(value))
      
      inline def setTrackAxisToolTipUndefined: Self = StObject.set(x, "trackAxisToolTip", js.undefined)
      
      inline def setTrackToolTip(value: /* e */ TrackToolTipEventArgs => scala.Unit): Self = StObject.set(x, "trackToolTip", js.Any.fromFunction1(value))
      
      inline def setTrackToolTipUndefined: Self = StObject.set(x, "trackToolTip", js.undefined)
      
      inline def setTrendlineRendering(value: /* e */ TrendlineRenderingEventArgs => scala.Unit): Self = StObject.set(x, "trendlineRendering", js.Any.fromFunction1(value))
      
      inline def setTrendlineRenderingUndefined: Self = StObject.set(x, "trendlineRendering", js.undefined)
      
      inline def setWallSize(value: Double): Self = StObject.set(x, "wallSize", value.asInstanceOf[js.Any])
      
      inline def setWallSizeUndefined: Self = StObject.set(x, "wallSize", js.undefined)
      
      inline def setZoomed(value: /* e */ ZoomedEventArgs => scala.Unit): Self = StObject.set(x, "zoomed", js.Any.fromFunction1(value))
      
      inline def setZoomedUndefined: Self = StObject.set(x, "zoomed", js.undefined)
      
      inline def setZooming(value: Zooming): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
      
      inline def setZoomingUndefined: Self = StObject.set(x, "zooming", js.undefined)
    }
  }
  
  trait MultiLevelLabelClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the points with respect to chart area.    axis - axis of the multi level labels.    multiLevelLabel - Multi level label details
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MultiLevelLabelClickEventArgs {
    
    inline def apply(): MultiLevelLabelClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiLevelLabelClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiLevelLabelClickEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait MultiLevelLabelRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** MultiLevelLabels - MultiLevel Label Object
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MultiLevelLabelRenderingEventArgs {
    
    inline def apply(): MultiLevelLabelRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiLevelLabelRenderingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiLevelLabelRenderingEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait PointRegionClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** locationX - X-coordinate of point in pixel    locationY - Y-coordinate of point in pixel    seriesIndex - Index of the series in series collection to which the point belongs
      * pointIndex - Index of the point in series
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PointRegionClickEventArgs {
    
    inline def apply(): PointRegionClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointRegionClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointRegionClickEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait PointRegionMouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** locationX - X-coordinate of point in pixel    locationY - Y-coordinate of point in pixel    seriesIndex - Index of the series in series collection to which the point belongs
      * pointIndex - Index of the point in series
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PointRegionMouseMoveEventArgs {
    
    inline def apply(): PointRegionMouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointRegionMouseMoveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointRegionMouseMoveEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait PreRenderEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PreRenderEventArgs {
    
    inline def apply(): PreRenderEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreRenderEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreRenderEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait PrimaryXAxis extends StObject {
    
    /** Specifies the position of the axis labels.
      * @Default {center. See Alignment}
      */
    var alignment: js.UndefOr[LabelAlignment | String] = js.undefined
    
    /** Options for customizing horizontal axis alternate grid band.
      */
    var alternateGridBand: js.UndefOr[PrimaryXAxisAlternateGridBand] = js.undefined
    
    /** Options for customizing the axis line.
      */
    var axisLine: js.UndefOr[PrimaryXAxisAxisLine] = js.undefined
    
    /** Specifies the index of the column where the axis is associated, when the chart area is divided into multiple plot areas by using columnDefinitions.
      * @Default {null}
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /** Specifies the number of columns or plot areas an axis has to span horizontally.
      * @Default {null}
      */
    var columnSpan: js.UndefOr[Double] = js.undefined
    
    /** Specifies where horizontal axis should intersect the vertical axis or vice versa. Value should be provided in axis co-ordinates. If provided value is greater than the maximum
      * value of crossing axis, then axis will be placed at the opposite side.
      * @Default {null}
      */
    var crossesAt: js.UndefOr[Double] = js.undefined
    
    /** Name of the axis used for crossing. Vertical axis name should be provided for horizontal axis and vice versa. If the provided name does not belongs to a valid axis, then primary X
      * axis or primary Y axis will be used for crossing
      * @Default {null}
      */
    var crossesInAxis: js.UndefOr[String] = js.undefined
    
    /** Options to customize the crosshair label.
      */
    var crosshairLabel: js.UndefOr[PrimaryXAxisCrosshairLabel] = js.undefined
    
    /** With this setting, you can request axis to calculate intervals approximately equal to your desired interval.
      * @Default {null}
      */
    var desiredIntervals: js.UndefOr[Double] = js.undefined
    
    /** Specifies the position of labels at the edge of the axis.
      * @Default {ej.datavisualization.Chart.EdgeLabelPlacement.None. See EdgeLabelPlacement}
      */
    var edgeLabelPlacement: js.UndefOr[EdgeLabelPlacement | String] = js.undefined
    
    /** Specifies the interval of the axis according to the zoomed data of the chart.
      * @Default {true}
      */
    var enableAutoIntervalOnZooming: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to trim the axis label when the width of the label exceeds the maximumLabelWidth.
      * @Default {false}
      */
    var enableTrim: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the font of the axis Labels.
      */
    var font: js.UndefOr[PrimaryXAxisFont] = js.undefined
    
    /** Specifies the type of interval in date time axis.
      * @Default {null. See IntervalType}
      */
    var intervalType: js.UndefOr[IntervalType | String] = js.undefined
    
    /** Category axis can also plot points based on index value of data points. Index based plotting can be enabled by setting â€˜isIndexedâ€™ property to true.
      * @Default {false}
      */
    var isIndexed: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to inverse the axis.
      * @Default {false}
      */
    var isInversed: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the border of the labels.
      */
    var labelBorder: js.UndefOr[PrimaryXAxisLabelBorder] = js.undefined
    
    /** Custom formatting for axis label and supports all standard formatting type of numerical and date time values.
      * @Default {null}
      */
    var labelFormat: js.UndefOr[String] = js.undefined
    
    /** Specifies the action to take when the axis labels are overlapping with each other.
      * @Default {ej.datavisualization.Chart.LabelIntersectAction.None. See LabelIntersectAction}
      */
    var labelIntersectAction: js.UndefOr[LabelIntersectAction | String] = js.undefined
    
    /** Specifies the placement of labels.
      * @Default {ej.datavisualization.Chart.LabelPlacement.BetweenTicks. See LabelPlacement}
      */
    var labelPlacement: js.UndefOr[LabelPlacement | String] = js.undefined
    
    /** Specifies the position of the axis labels.
      * @Default {outside. See LabelPosition}
      */
    var labelPosition: js.UndefOr[LabelPosition | String] = js.undefined
    
    /** Angle in degrees to rotate the axis labels.
      * @Default {null}
      */
    var labelRotation: js.UndefOr[Double] = js.undefined
    
    /** Logarithmic base value. This is applicable only for logarithmic axis.
      * @Default {10}
      */
    var logBase: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing major gird lines.
      */
    var majorGridLines: js.UndefOr[PrimaryXAxisMajorGridLines] = js.undefined
    
    /** Options for customizing the major tick lines.
      */
    var majorTickLines: js.UndefOr[PrimaryXAxisMajorTickLines] = js.undefined
    
    /** Maximum width of the axis label. When the label exceeds the width, the label gets trimmed when the enableTrim is set to true.
      * @Default {34}
      */
    var maximumLabelWidth: js.UndefOr[Double] = js.undefined
    
    /** Maximum number of labels to be displayed in every 100 pixels.
      * @Default {3}
      */
    var maximumLabels: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the minor grid lines.
      */
    var minorGridLines: js.UndefOr[PrimaryXAxisMinorGridLines] = js.undefined
    
    /** Options for customizing the minor tick lines.
      */
    var minorTickLines: js.UndefOr[PrimaryXAxisMinorTickLines] = js.undefined
    
    /** Specifies the number of minor ticks per interval.
      * @Default {null}
      */
    var minorTicksPerInterval: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the multi level labels.
      * @Default {[ ]}
      */
    var multiLevelLabels: js.UndefOr[js.Array[PrimaryXAxisMultiLevelLabel]] = js.undefined
    
    /** Unique name of the axis. To associate an axis with the series, you have to set this name to the xAxisName/yAxisName property of the series.
      * @Default {null}
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Specifies whether to render the axis at the opposite side of its default position.
      * @Default {false}
      */
    var opposedPosition: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the orientation of the axis line
      * @Default {Horizontal}
      */
    var orientation: js.UndefOr[AxisOrientation | String] = js.undefined
    
    /** Specifies the padding for the plot area.
      * @Default {10}
      */
    var plotOffset: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the range of the axis.
      */
    var range: js.UndefOr[PrimaryXAxisRange] = js.undefined
    
    /** Specifies the padding for the axis range.
      * @Default {None. See RangePadding}
      */
    var rangePadding: js.UndefOr[RangePadding | String] = js.undefined
    
    /** Rounds the number to the given number of decimals.
      * @Default {null}
      */
    var roundingPlaces: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the axis scrollbar
      */
    var scrollbarSettings: js.UndefOr[PrimaryXAxisScrollbarSettings] = js.undefined
    
    /** Specifies whether the axis elements need to be placed nearby the axis line, while crossing.
      * @Default {true}
      */
    var showNextToAxisLine: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the strip lines.
      * @Default {[ ]}
      */
    var stripLine: js.UndefOr[js.Array[PrimaryXAxisStripLine]] = js.undefined
    
    /** Specifies the position of the axis tick lines.
      * @Default {outside. See TickLinesPosition}
      */
    var tickLinesPosition: js.UndefOr[TickLinesPosition | String] = js.undefined
    
    /** Options for customizing the axis title.
      */
    var title: js.UndefOr[PrimaryXAxisTitle] = js.undefined
    
    /** Specifies the type of data the axis is handling.
      * @Default {null. See ValueType}
      */
    var valueType: js.UndefOr[ValueType | String] = js.undefined
    
    /** Show/hides the axis.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** The axis is scaled by this factor. When zoomFactor is 0.5, the chart is scaled by 200% along this axis. Value ranges from 0 to 1.
      * @Default {1}
      */
    var zoomFactor: js.UndefOr[Double] = js.undefined
    
    /** Position of the zoomed axis. Value ranges from 0 to 1.
      * @Default {0}
      */
    var zoomPosition: js.UndefOr[Double] = js.undefined
  }
  object PrimaryXAxis {
    
    inline def apply(): PrimaryXAxis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxis]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxis] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: LabelAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setAlternateGridBand(value: PrimaryXAxisAlternateGridBand): Self = StObject.set(x, "alternateGridBand", value.asInstanceOf[js.Any])
      
      inline def setAlternateGridBandUndefined: Self = StObject.set(x, "alternateGridBand", js.undefined)
      
      inline def setAxisLine(value: PrimaryXAxisAxisLine): Self = StObject.set(x, "axisLine", value.asInstanceOf[js.Any])
      
      inline def setAxisLineUndefined: Self = StObject.set(x, "axisLine", js.undefined)
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
      
      inline def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
      
      inline def setCrossesAt(value: Double): Self = StObject.set(x, "crossesAt", value.asInstanceOf[js.Any])
      
      inline def setCrossesAtUndefined: Self = StObject.set(x, "crossesAt", js.undefined)
      
      inline def setCrossesInAxis(value: String): Self = StObject.set(x, "crossesInAxis", value.asInstanceOf[js.Any])
      
      inline def setCrossesInAxisUndefined: Self = StObject.set(x, "crossesInAxis", js.undefined)
      
      inline def setCrosshairLabel(value: PrimaryXAxisCrosshairLabel): Self = StObject.set(x, "crosshairLabel", value.asInstanceOf[js.Any])
      
      inline def setCrosshairLabelUndefined: Self = StObject.set(x, "crosshairLabel", js.undefined)
      
      inline def setDesiredIntervals(value: Double): Self = StObject.set(x, "desiredIntervals", value.asInstanceOf[js.Any])
      
      inline def setDesiredIntervalsUndefined: Self = StObject.set(x, "desiredIntervals", js.undefined)
      
      inline def setEdgeLabelPlacement(value: EdgeLabelPlacement | String): Self = StObject.set(x, "edgeLabelPlacement", value.asInstanceOf[js.Any])
      
      inline def setEdgeLabelPlacementUndefined: Self = StObject.set(x, "edgeLabelPlacement", js.undefined)
      
      inline def setEnableAutoIntervalOnZooming(value: Boolean): Self = StObject.set(x, "enableAutoIntervalOnZooming", value.asInstanceOf[js.Any])
      
      inline def setEnableAutoIntervalOnZoomingUndefined: Self = StObject.set(x, "enableAutoIntervalOnZooming", js.undefined)
      
      inline def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      inline def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      inline def setFont(value: PrimaryXAxisFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setIntervalType(value: IntervalType | String): Self = StObject.set(x, "intervalType", value.asInstanceOf[js.Any])
      
      inline def setIntervalTypeUndefined: Self = StObject.set(x, "intervalType", js.undefined)
      
      inline def setIsIndexed(value: Boolean): Self = StObject.set(x, "isIndexed", value.asInstanceOf[js.Any])
      
      inline def setIsIndexedUndefined: Self = StObject.set(x, "isIndexed", js.undefined)
      
      inline def setIsInversed(value: Boolean): Self = StObject.set(x, "isInversed", value.asInstanceOf[js.Any])
      
      inline def setIsInversedUndefined: Self = StObject.set(x, "isInversed", js.undefined)
      
      inline def setLabelBorder(value: PrimaryXAxisLabelBorder): Self = StObject.set(x, "labelBorder", value.asInstanceOf[js.Any])
      
      inline def setLabelBorderUndefined: Self = StObject.set(x, "labelBorder", js.undefined)
      
      inline def setLabelFormat(value: String): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
      
      inline def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
      
      inline def setLabelIntersectAction(value: LabelIntersectAction | String): Self = StObject.set(x, "labelIntersectAction", value.asInstanceOf[js.Any])
      
      inline def setLabelIntersectActionUndefined: Self = StObject.set(x, "labelIntersectAction", js.undefined)
      
      inline def setLabelPlacement(value: LabelPlacement | String): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setLabelPosition(value: LabelPosition | String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLabelRotation(value: Double): Self = StObject.set(x, "labelRotation", value.asInstanceOf[js.Any])
      
      inline def setLabelRotationUndefined: Self = StObject.set(x, "labelRotation", js.undefined)
      
      inline def setLogBase(value: Double): Self = StObject.set(x, "logBase", value.asInstanceOf[js.Any])
      
      inline def setLogBaseUndefined: Self = StObject.set(x, "logBase", js.undefined)
      
      inline def setMajorGridLines(value: PrimaryXAxisMajorGridLines): Self = StObject.set(x, "majorGridLines", value.asInstanceOf[js.Any])
      
      inline def setMajorGridLinesUndefined: Self = StObject.set(x, "majorGridLines", js.undefined)
      
      inline def setMajorTickLines(value: PrimaryXAxisMajorTickLines): Self = StObject.set(x, "majorTickLines", value.asInstanceOf[js.Any])
      
      inline def setMajorTickLinesUndefined: Self = StObject.set(x, "majorTickLines", js.undefined)
      
      inline def setMaximumLabelWidth(value: Double): Self = StObject.set(x, "maximumLabelWidth", value.asInstanceOf[js.Any])
      
      inline def setMaximumLabelWidthUndefined: Self = StObject.set(x, "maximumLabelWidth", js.undefined)
      
      inline def setMaximumLabels(value: Double): Self = StObject.set(x, "maximumLabels", value.asInstanceOf[js.Any])
      
      inline def setMaximumLabelsUndefined: Self = StObject.set(x, "maximumLabels", js.undefined)
      
      inline def setMinorGridLines(value: PrimaryXAxisMinorGridLines): Self = StObject.set(x, "minorGridLines", value.asInstanceOf[js.Any])
      
      inline def setMinorGridLinesUndefined: Self = StObject.set(x, "minorGridLines", js.undefined)
      
      inline def setMinorTickLines(value: PrimaryXAxisMinorTickLines): Self = StObject.set(x, "minorTickLines", value.asInstanceOf[js.Any])
      
      inline def setMinorTickLinesUndefined: Self = StObject.set(x, "minorTickLines", js.undefined)
      
      inline def setMinorTicksPerInterval(value: Double): Self = StObject.set(x, "minorTicksPerInterval", value.asInstanceOf[js.Any])
      
      inline def setMinorTicksPerIntervalUndefined: Self = StObject.set(x, "minorTicksPerInterval", js.undefined)
      
      inline def setMultiLevelLabels(value: js.Array[PrimaryXAxisMultiLevelLabel]): Self = StObject.set(x, "multiLevelLabels", value.asInstanceOf[js.Any])
      
      inline def setMultiLevelLabelsUndefined: Self = StObject.set(x, "multiLevelLabels", js.undefined)
      
      inline def setMultiLevelLabelsVarargs(value: PrimaryXAxisMultiLevelLabel*): Self = StObject.set(x, "multiLevelLabels", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpposedPosition(value: Boolean): Self = StObject.set(x, "opposedPosition", value.asInstanceOf[js.Any])
      
      inline def setOpposedPositionUndefined: Self = StObject.set(x, "opposedPosition", js.undefined)
      
      inline def setOrientation(value: AxisOrientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPlotOffset(value: Double): Self = StObject.set(x, "plotOffset", value.asInstanceOf[js.Any])
      
      inline def setPlotOffsetUndefined: Self = StObject.set(x, "plotOffset", js.undefined)
      
      inline def setRange(value: PrimaryXAxisRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangePadding(value: RangePadding | String): Self = StObject.set(x, "rangePadding", value.asInstanceOf[js.Any])
      
      inline def setRangePaddingUndefined: Self = StObject.set(x, "rangePadding", js.undefined)
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRoundingPlaces(value: Double): Self = StObject.set(x, "roundingPlaces", value.asInstanceOf[js.Any])
      
      inline def setRoundingPlacesUndefined: Self = StObject.set(x, "roundingPlaces", js.undefined)
      
      inline def setScrollbarSettings(value: PrimaryXAxisScrollbarSettings): Self = StObject.set(x, "scrollbarSettings", value.asInstanceOf[js.Any])
      
      inline def setScrollbarSettingsUndefined: Self = StObject.set(x, "scrollbarSettings", js.undefined)
      
      inline def setShowNextToAxisLine(value: Boolean): Self = StObject.set(x, "showNextToAxisLine", value.asInstanceOf[js.Any])
      
      inline def setShowNextToAxisLineUndefined: Self = StObject.set(x, "showNextToAxisLine", js.undefined)
      
      inline def setStripLine(value: js.Array[PrimaryXAxisStripLine]): Self = StObject.set(x, "stripLine", value.asInstanceOf[js.Any])
      
      inline def setStripLineUndefined: Self = StObject.set(x, "stripLine", js.undefined)
      
      inline def setStripLineVarargs(value: PrimaryXAxisStripLine*): Self = StObject.set(x, "stripLine", js.Array(value*))
      
      inline def setTickLinesPosition(value: TickLinesPosition | String): Self = StObject.set(x, "tickLinesPosition", value.asInstanceOf[js.Any])
      
      inline def setTickLinesPositionUndefined: Self = StObject.set(x, "tickLinesPosition", js.undefined)
      
      inline def setTitle(value: PrimaryXAxisTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setValueType(value: ValueType | String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
      
      inline def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
      
      inline def setZoomPosition(value: Double): Self = StObject.set(x, "zoomPosition", value.asInstanceOf[js.Any])
      
      inline def setZoomPositionUndefined: Self = StObject.set(x, "zoomPosition", js.undefined)
    }
  }
  
  trait PrimaryXAxisAlternateGridBand extends StObject {
    
    /** Options for customizing even grid band.
      */
    var even: js.UndefOr[PrimaryXAxisAlternateGridBandEven] = js.undefined
    
    /** Options for customizing odd grid band.
      */
    var odd: js.UndefOr[PrimaryXAxisAlternateGridBandOdd] = js.undefined
  }
  object PrimaryXAxisAlternateGridBand {
    
    inline def apply(): PrimaryXAxisAlternateGridBand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisAlternateGridBand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisAlternateGridBand] (val x: Self) extends AnyVal {
      
      inline def setEven(value: PrimaryXAxisAlternateGridBandEven): Self = StObject.set(x, "even", value.asInstanceOf[js.Any])
      
      inline def setEvenUndefined: Self = StObject.set(x, "even", js.undefined)
      
      inline def setOdd(value: PrimaryXAxisAlternateGridBandOdd): Self = StObject.set(x, "odd", value.asInstanceOf[js.Any])
      
      inline def setOddUndefined: Self = StObject.set(x, "odd", js.undefined)
    }
  }
  
  trait PrimaryXAxisAlternateGridBandEven extends StObject {
    
    /** Fill color for the even grid bands.
      * @Default {transparent}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Opacity of the even grid band.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object PrimaryXAxisAlternateGridBandEven {
    
    inline def apply(): PrimaryXAxisAlternateGridBandEven = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisAlternateGridBandEven]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisAlternateGridBandEven] (val x: Self) extends AnyVal {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait PrimaryXAxisAlternateGridBandOdd extends StObject {
    
    /** Fill color of the odd grid bands
      * @Default {transparent}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Opacity of odd grid band
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object PrimaryXAxisAlternateGridBandOdd {
    
    inline def apply(): PrimaryXAxisAlternateGridBandOdd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisAlternateGridBandOdd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisAlternateGridBandOdd] (val x: Self) extends AnyVal {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait PrimaryXAxisAxisLine extends StObject {
    
    /** Default Value
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Pattern of dashes and gaps to be applied to the axis line.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Padding for axis line. Normally, it is used along with plotOffset to pad the plot area.
      * @Default {null}
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /** Show/hides the axis line.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of axis line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PrimaryXAxisAxisLine {
    
    inline def apply(): PrimaryXAxisAxisLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisAxisLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisAxisLine] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PrimaryXAxisCrosshairLabel extends StObject {
    
    /** Show/hides the crosshair label associated with this axis.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object PrimaryXAxisCrosshairLabel {
    
    inline def apply(): PrimaryXAxisCrosshairLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisCrosshairLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisCrosshairLabel] (val x: Self) extends AnyVal {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait PrimaryXAxisFont extends StObject {
    
    /** Font family of labels.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of labels.
      * @Default {ej.datavisualization.Chart.FontStyle.Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the label.
      * @Default {ej.datavisualization.Chart.FontWeight.Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity of the axis labels.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the axis labels.
      * @Default {13px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object PrimaryXAxisFont {
    
    inline def apply(): PrimaryXAxisFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait PrimaryXAxisLabelBorder extends StObject {
    
    /** Specifies the color of the label border.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of the label border.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PrimaryXAxisLabelBorder {
    
    inline def apply(): PrimaryXAxisLabelBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisLabelBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisLabelBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PrimaryXAxisMajorGridLines extends StObject {
    
    /** Color of the major grid line.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Pattern of dashes and gaps used to stroke the major grid lines.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Opacity of major grid lines.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Show/hides the major grid lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the major grid lines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PrimaryXAxisMajorGridLines {
    
    inline def apply(): PrimaryXAxisMajorGridLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisMajorGridLines]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisMajorGridLines] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PrimaryXAxisMajorTickLines extends StObject {
    
    /** Length of the major tick lines.
      * @Default {5}
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Show/hides the major tick lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the major tick lines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PrimaryXAxisMajorTickLines {
    
    inline def apply(): PrimaryXAxisMajorTickLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisMajorTickLines]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisMajorTickLines] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PrimaryXAxisMinorGridLines extends StObject {
    
    /** Patterns of dashes and gaps used to stroke the minor grid lines.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Show/hides the minor grid lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the minorGridLines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PrimaryXAxisMinorGridLines {
    
    inline def apply(): PrimaryXAxisMinorGridLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisMinorGridLines]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisMinorGridLines] (val x: Self) extends AnyVal {
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PrimaryXAxisMinorTickLines extends StObject {
    
    /** Length of the minor tick lines.
      * @Default {5}
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Show/hides the minor tick lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the minor tick line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PrimaryXAxisMinorTickLines {
    
    inline def apply(): PrimaryXAxisMinorTickLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisMinorTickLines]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisMinorTickLines] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PrimaryXAxisMultiLevelLabel extends StObject {
    
    /** Options for customizing the border of the series.
      */
    var border: js.UndefOr[PrimaryXAxisMultiLevelLabelsBorder] = js.undefined
    
    /** Ending value of the multi level labels.
      * @Default {null}
      */
    var end: js.UndefOr[Any] = js.undefined
    
    /** Options for customizing the font of the text.
      */
    var font: js.UndefOr[PrimaryXAxisMultiLevelLabelsFont] = js.undefined
    
    /** Specifies the level of multi level labels.
      * @Default {0}
      */
    var level: js.UndefOr[Double] = js.undefined
    
    /** Specifies the maximum width of the text in multi level labels.
      * @Default {null}
      */
    var maximumTextWidth: js.UndefOr[Double] = js.undefined
    
    /** Starting value of the multi level labels.
      * @Default {null}
      */
    var start: js.UndefOr[Any] = js.undefined
    
    /** Text of the multi level labels.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the alignment of the text in multi level labels.
      * @Default {center. See TextAlignment}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.undefined
    
    /** Specifies the handling of text over flow in multi level labels.
      * @Default {center. See TextOverflow}
      */
    var textOverflow: js.UndefOr[TextOverflow | String] = js.undefined
    
    /** Visibility of the multi level labels.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object PrimaryXAxisMultiLevelLabel {
    
    inline def apply(): PrimaryXAxisMultiLevelLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisMultiLevelLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisMultiLevelLabel] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: PrimaryXAxisMultiLevelLabelsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setEnd(value: Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFont(value: PrimaryXAxisMultiLevelLabelsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMaximumTextWidth(value: Double): Self = StObject.set(x, "maximumTextWidth", value.asInstanceOf[js.Any])
      
      inline def setMaximumTextWidthUndefined: Self = StObject.set(x, "maximumTextWidth", js.undefined)
      
      inline def setStart(value: Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait PrimaryXAxisMultiLevelLabelsBorder extends StObject {
    
    /** Border color of the multi level labels.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border type of the multi level labels.
      * @Default {rectangle. See Type}
      */
    var `type`: js.UndefOr[MultiLevelLabelsBorderType | String] = js.undefined
    
    /** Border width of the multi level labels.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PrimaryXAxisMultiLevelLabelsBorder {
    
    inline def apply(): PrimaryXAxisMultiLevelLabelsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisMultiLevelLabelsBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisMultiLevelLabelsBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setType(value: MultiLevelLabelsBorderType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PrimaryXAxisMultiLevelLabelsFont extends StObject {
    
    /** Font color of the multi level labels text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Font family of the multi level labels text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of the multi level labels text.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the multi level label text.
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[String] = js.undefined
    
    /** Opacity of the multi level label text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the multi level label text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object PrimaryXAxisMultiLevelLabelsFont {
    
    inline def apply(): PrimaryXAxisMultiLevelLabelsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisMultiLevelLabelsFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisMultiLevelLabelsFont] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait PrimaryXAxisRange extends StObject {
    
    /** Interval of the axis range.
      * @Default {null}
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /** Maximum value of the axis range.
      * @Default {null}
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /** Minimum value of the axis range.
      * @Default {null}
      */
    var min: js.UndefOr[Double] = js.undefined
  }
  object PrimaryXAxisRange {
    
    inline def apply(): PrimaryXAxisRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisRange] (val x: Self) extends AnyVal {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  trait PrimaryXAxisScrollbarSettings extends StObject {
    
    /** Controls whether scrollbar has to be responsive in the chart.
      * @Default {false}
      */
    var canResize: js.UndefOr[Boolean] = js.undefined
    
    /** The maximum number of points to be displayed in the scrollbar.
      * @Default {null}
      */
    var pointsLength: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the range for the scrollbar in the axis.
      */
    var range: js.UndefOr[PrimaryXAxisScrollbarSettingsRange] = js.undefined
    
    /** Specifies to enables or disables the scroll bar.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object PrimaryXAxisScrollbarSettings {
    
    inline def apply(): PrimaryXAxisScrollbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisScrollbarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisScrollbarSettings] (val x: Self) extends AnyVal {
      
      inline def setCanResize(value: Boolean): Self = StObject.set(x, "canResize", value.asInstanceOf[js.Any])
      
      inline def setCanResizeUndefined: Self = StObject.set(x, "canResize", js.undefined)
      
      inline def setPointsLength(value: Double): Self = StObject.set(x, "pointsLength", value.asInstanceOf[js.Any])
      
      inline def setPointsLengthUndefined: Self = StObject.set(x, "pointsLength", js.undefined)
      
      inline def setRange(value: PrimaryXAxisScrollbarSettingsRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait PrimaryXAxisScrollbarSettingsRange extends StObject {
    
    /** Maximum value for the scrollbar range .
      * @Default {null}
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /** Minimum value of the scrollbar range.
      * @Default {null}
      */
    var min: js.UndefOr[Double] = js.undefined
  }
  object PrimaryXAxisScrollbarSettingsRange {
    
    inline def apply(): PrimaryXAxisScrollbarSettingsRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisScrollbarSettingsRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisScrollbarSettingsRange] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  trait PrimaryXAxisStripLine extends StObject {
    
    /** Border color of the strip line.
      * @Default {gray}
      */
    var borderColor: js.UndefOr[String] = js.undefined
    
    /** Background color of the strip line.
      * @Default {gray}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** End value of the strip line.
      * @Default {null}
      */
    var end: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the font of the text.
      */
    var font: js.UndefOr[PrimaryXAxisStripLineFont] = js.undefined
    
    /** Start value of the strip line.
      * @Default {null}
      */
    var start: js.UndefOr[Double] = js.undefined
    
    /** Indicates whether to render the strip line from the minimum/start value of the axis. This property does not work when start property is set.
      * @Default {false}
      */
    var startFromAxis: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies text to be displayed inside the strip line.
      * @Default {stripLine}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the alignment of the text inside the strip line.
      * @Default {middlecenter. See TextAlignment}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.undefined
    
    /** Show/hides the strip line.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the strip line.
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /** Specifies the order where the strip line and the series have to be rendered. When Z-order is â€œbehindâ€, strip line is rendered under the series and when it is â€œoverâ€, it is
      * rendered above the series.
      * @Default {over. See ZIndex}
      */
    var zIndex: js.UndefOr[ZIndex | String] = js.undefined
  }
  object PrimaryXAxisStripLine {
    
    inline def apply(): PrimaryXAxisStripLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisStripLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisStripLine] (val x: Self) extends AnyVal {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFont(value: PrimaryXAxisStripLineFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartFromAxis(value: Boolean): Self = StObject.set(x, "startFromAxis", value.asInstanceOf[js.Any])
      
      inline def setStartFromAxisUndefined: Self = StObject.set(x, "startFromAxis", js.undefined)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZIndex(value: ZIndex | String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait PrimaryXAxisStripLineFont extends StObject {
    
    /** Font color of the strip line text.
      * @Default {black}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Font family of the strip line text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of the strip line text.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the strip line text.
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[String] = js.undefined
    
    /** Opacity of the strip line text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the strip line text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object PrimaryXAxisStripLineFont {
    
    inline def apply(): PrimaryXAxisStripLineFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisStripLineFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisStripLineFont] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait PrimaryXAxisTitle extends StObject {
    
    /** Specifies the position of the axis title.
      * @Default {center. See Alignment}
      */
    var alignment: js.UndefOr[TextAlignment | String] = js.undefined
    
    /** Specifies whether to trim the axis title when it exceeds the chart area or the maximum width of the title.
      * @Default {false}
      */
    var enableTrim: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the title font.
      */
    var font: js.UndefOr[PrimaryXAxisTitleFont] = js.undefined
    
    /** Maximum width of the title, when the title exceeds this width, the title gets trimmed, when enableTrim is true.
      * @Default {34}
      */
    var maximumTitleWidth: js.UndefOr[Double] = js.undefined
    
    /** offset value for axis title.
      * @Default {0}
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /** Specifies the position of the axis title.
      * @Default {outside. See Position}
      */
    var position: js.UndefOr[LabelPosition | String] = js.undefined
    
    /** Title for the axis.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Controls the visibility of axis title.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object PrimaryXAxisTitle {
    
    inline def apply(): PrimaryXAxisTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisTitle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisTitle] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: TextAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      inline def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      inline def setFont(value: PrimaryXAxisTitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setMaximumTitleWidth(value: Double): Self = StObject.set(x, "maximumTitleWidth", value.asInstanceOf[js.Any])
      
      inline def setMaximumTitleWidthUndefined: Self = StObject.set(x, "maximumTitleWidth", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPosition(value: LabelPosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait PrimaryXAxisTitleFont extends StObject {
    
    /** Font family of the title text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of the title text.
      * @Default {ej.datavisualization.Chart.FontStyle.Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the title text.
      * @Default {ej.datavisualization.Chart.FontWeight.Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity of the axis title text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the axis title.
      * @Default {16px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object PrimaryXAxisTitleFont {
    
    inline def apply(): PrimaryXAxisTitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisTitleFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryXAxisTitleFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait PrimaryYAxis extends StObject {
    
    /** Specifies the position of the axis labels.
      * @Default {center. See Alignment}
      */
    var alignment: js.UndefOr[LabelAlignment | String] = js.undefined
    
    /** Options for customizing vertical axis alternate grid band.
      */
    var alternateGridBand: js.UndefOr[PrimaryYAxisAlternateGridBand] = js.undefined
    
    /** Options for customizing the axis line.
      */
    var axisLine: js.UndefOr[PrimaryYAxisAxisLine] = js.undefined
    
    /** Specifies where horizontal axis should intersect the vertical axis or vice versa. Value should be provided in axis co-ordinates. If provided value is greater than the maximum
      * value of crossing axis, then axis will be placed at the opposite side.
      * @Default {null}
      */
    var crossesAt: js.UndefOr[Double] = js.undefined
    
    /** Name of the axis used for crossing. Vertical axis name should be provided for horizontal axis and vice versa. If the provided name does not belongs to a valid axis, then primary X
      * axis or primary Y axis will be used for crossing
      * @Default {null}
      */
    var crossesInAxis: js.UndefOr[String] = js.undefined
    
    /** Options to customize the crosshair label.
      */
    var crosshairLabel: js.UndefOr[PrimaryYAxisCrosshairLabel] = js.undefined
    
    /** With this setting, you can request axis to calculate intervals approximately equal to your desired interval.
      * @Default {null}
      */
    var desiredIntervals: js.UndefOr[Double] = js.undefined
    
    /** Specifies the position of labels at the edge of the axis.
      * @Default {ej.datavisualization.Chart.EdgeLabelPlacement.None. See EdgeLabelPlacement}
      */
    var edgeLabelPlacement: js.UndefOr[EdgeLabelPlacement | String] = js.undefined
    
    /** Specifies the interval of the axis according to the zoomed data of the chart.
      * @Default {true}
      */
    var enableAutoIntervalOnZooming: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to trim the axis label when the width of the label exceeds the maximumLabelWidth.
      * @Default {false}
      */
    var enableTrim: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the font of the axis Labels.
      */
    var font: js.UndefOr[PrimaryYAxisFont] = js.undefined
    
    /** Specifies the type of interval in date time axis.
      * @Default {null. See IntervalType}
      */
    var intervalType: js.UndefOr[IntervalType | String] = js.undefined
    
    /** Specifies whether to inverse the axis.
      * @Default {false}
      */
    var isInversed: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the border of the labels.
      */
    var labelBorder: js.UndefOr[PrimaryYAxisLabelBorder] = js.undefined
    
    /** Custom formatting for axis label and supports all standard formatting type of numerical and date time values.
      * @Default {null}
      */
    var labelFormat: js.UndefOr[String] = js.undefined
    
    /** Specifies the action to take when the axis labels are overlapping with each other.
      * @Default {ej.datavisualization.Chart.LabelIntersectAction.None}
      */
    var labelIntersectAction: js.UndefOr[LabelIntersectAction | String] = js.undefined
    
    /** Specifies the placement of labels.
      * @Default {ej.datavisualization.Chart.LabelPlacement.BetweenTicks. See LabelPlacement}
      */
    var labelPlacement: js.UndefOr[LabelPlacement | String] = js.undefined
    
    /** Specifies the position of the axis labels.
      * @Default {outside. See LabelPosition}
      */
    var labelPosition: js.UndefOr[LabelPosition | String] = js.undefined
    
    /** Logarithmic base value. This is applicable only for logarithmic axis.
      * @Default {10}
      */
    var logBase: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing major gird lines.
      */
    var majorGridLines: js.UndefOr[PrimaryYAxisMajorGridLines] = js.undefined
    
    /** Options for customizing the major tick lines.
      */
    var majorTickLines: js.UndefOr[PrimaryYAxisMajorTickLines] = js.undefined
    
    /** Maximum width of the axis label. When the label exceeds the width, the label gets trimmed when the enableTrim is set to true.
      * @Default {ej.datavisualization.Chart.maximumLabelWidth type {int}}
      */
    var maximumLabelWidth: js.UndefOr[Double] = js.undefined
    
    /** Maximum number of labels to be displayed in every 100 pixels.
      * @Default {3}
      */
    var maximumLabels: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the minor grid lines.
      */
    var minorGridLines: js.UndefOr[PrimaryYAxisMinorGridLines] = js.undefined
    
    /** Options for customizing the minor tick lines.
      */
    var minorTickLines: js.UndefOr[PrimaryYAxisMinorTickLines] = js.undefined
    
    /** Specifies the number of minor ticks per interval.
      * @Default {null}
      */
    var minorTicksPerInterval: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the multi level labels.
      * @Default {[ ]}
      */
    var multiLevelLabels: js.UndefOr[js.Array[PrimaryYAxisMultiLevelLabel]] = js.undefined
    
    /** Unique name of the axis. To associate an axis with the series, you have to set this name to the xAxisName/yAxisName property of the series.
      * @Default {null}
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Specifies whether to render the axis at the opposite side of its default position.
      * @Default {false}
      */
    var opposedPosition: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the orientation of the axis line in the chart.
      * @Default {Vertical}
      */
    var orientation: js.UndefOr[AxisOrientation | String] = js.undefined
    
    /** Specifies the padding for the plot area.
      * @Default {10}
      */
    var plotOffset: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the range of the axis.
      */
    var range: js.UndefOr[PrimaryYAxisRange] = js.undefined
    
    /** Specifies the padding for the axis range.
      * @Default {ej.datavisualization.Chart.RangePadding.None. See RangePadding}
      */
    var rangePadding: js.UndefOr[RangePadding | String] = js.undefined
    
    /** Rounds the number to the given number of decimals.
      * @Default {null}
      */
    var roundingPlaces: js.UndefOr[Double] = js.undefined
    
    /** Specifies the index of the row to which the axis is associated, when the chart area is divided into multiple plot areas by using rowDefinitions.
      * @Default {null}
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Specifies the number of row or plot areas an axis has to span vertically.
      * @Default {null}
      */
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the axis scrollbar.
      */
    var scrollbarSettings: js.UndefOr[PrimaryYAxisScrollbarSettings] = js.undefined
    
    /** Specifies whether the axis elements need to be placed nearby the axis line, while crossing.
      * @Default {true}
      */
    var showNextToAxisLine: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the strip lines.
      * @Default {[ ]}
      */
    var stripLine: js.UndefOr[js.Array[PrimaryYAxisStripLine]] = js.undefined
    
    /** Specifies the position of the axis tick lines.
      * @Default {outside. See TickLinesPosition}
      */
    var tickLinesPosition: js.UndefOr[TickLinesPosition | String] = js.undefined
    
    /** Options for customizing the axis title.
      */
    var title: js.UndefOr[PrimaryYAxisTitle] = js.undefined
    
    /** Specifies the type of data the axis is handling.
      * @Default {null. See ValueType}
      */
    var valueType: js.UndefOr[ValueType | String] = js.undefined
    
    /** Show/hides the axis.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** The axis is scaled by this factor. When zoomFactor is 0.5, the chart is scaled by 200% along this axis. Values ranges from 0 to 1.
      * @Default {1}
      */
    var zoomFactor: js.UndefOr[Double] = js.undefined
    
    /** Position of the zoomed axis. Value ranges from 0 to 1
      * @Default {0}
      */
    var zoomPosition: js.UndefOr[Double] = js.undefined
  }
  object PrimaryYAxis {
    
    inline def apply(): PrimaryYAxis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxis]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxis] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: LabelAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setAlternateGridBand(value: PrimaryYAxisAlternateGridBand): Self = StObject.set(x, "alternateGridBand", value.asInstanceOf[js.Any])
      
      inline def setAlternateGridBandUndefined: Self = StObject.set(x, "alternateGridBand", js.undefined)
      
      inline def setAxisLine(value: PrimaryYAxisAxisLine): Self = StObject.set(x, "axisLine", value.asInstanceOf[js.Any])
      
      inline def setAxisLineUndefined: Self = StObject.set(x, "axisLine", js.undefined)
      
      inline def setCrossesAt(value: Double): Self = StObject.set(x, "crossesAt", value.asInstanceOf[js.Any])
      
      inline def setCrossesAtUndefined: Self = StObject.set(x, "crossesAt", js.undefined)
      
      inline def setCrossesInAxis(value: String): Self = StObject.set(x, "crossesInAxis", value.asInstanceOf[js.Any])
      
      inline def setCrossesInAxisUndefined: Self = StObject.set(x, "crossesInAxis", js.undefined)
      
      inline def setCrosshairLabel(value: PrimaryYAxisCrosshairLabel): Self = StObject.set(x, "crosshairLabel", value.asInstanceOf[js.Any])
      
      inline def setCrosshairLabelUndefined: Self = StObject.set(x, "crosshairLabel", js.undefined)
      
      inline def setDesiredIntervals(value: Double): Self = StObject.set(x, "desiredIntervals", value.asInstanceOf[js.Any])
      
      inline def setDesiredIntervalsUndefined: Self = StObject.set(x, "desiredIntervals", js.undefined)
      
      inline def setEdgeLabelPlacement(value: EdgeLabelPlacement | String): Self = StObject.set(x, "edgeLabelPlacement", value.asInstanceOf[js.Any])
      
      inline def setEdgeLabelPlacementUndefined: Self = StObject.set(x, "edgeLabelPlacement", js.undefined)
      
      inline def setEnableAutoIntervalOnZooming(value: Boolean): Self = StObject.set(x, "enableAutoIntervalOnZooming", value.asInstanceOf[js.Any])
      
      inline def setEnableAutoIntervalOnZoomingUndefined: Self = StObject.set(x, "enableAutoIntervalOnZooming", js.undefined)
      
      inline def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      inline def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      inline def setFont(value: PrimaryYAxisFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setIntervalType(value: IntervalType | String): Self = StObject.set(x, "intervalType", value.asInstanceOf[js.Any])
      
      inline def setIntervalTypeUndefined: Self = StObject.set(x, "intervalType", js.undefined)
      
      inline def setIsInversed(value: Boolean): Self = StObject.set(x, "isInversed", value.asInstanceOf[js.Any])
      
      inline def setIsInversedUndefined: Self = StObject.set(x, "isInversed", js.undefined)
      
      inline def setLabelBorder(value: PrimaryYAxisLabelBorder): Self = StObject.set(x, "labelBorder", value.asInstanceOf[js.Any])
      
      inline def setLabelBorderUndefined: Self = StObject.set(x, "labelBorder", js.undefined)
      
      inline def setLabelFormat(value: String): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
      
      inline def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
      
      inline def setLabelIntersectAction(value: LabelIntersectAction | String): Self = StObject.set(x, "labelIntersectAction", value.asInstanceOf[js.Any])
      
      inline def setLabelIntersectActionUndefined: Self = StObject.set(x, "labelIntersectAction", js.undefined)
      
      inline def setLabelPlacement(value: LabelPlacement | String): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setLabelPosition(value: LabelPosition | String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLogBase(value: Double): Self = StObject.set(x, "logBase", value.asInstanceOf[js.Any])
      
      inline def setLogBaseUndefined: Self = StObject.set(x, "logBase", js.undefined)
      
      inline def setMajorGridLines(value: PrimaryYAxisMajorGridLines): Self = StObject.set(x, "majorGridLines", value.asInstanceOf[js.Any])
      
      inline def setMajorGridLinesUndefined: Self = StObject.set(x, "majorGridLines", js.undefined)
      
      inline def setMajorTickLines(value: PrimaryYAxisMajorTickLines): Self = StObject.set(x, "majorTickLines", value.asInstanceOf[js.Any])
      
      inline def setMajorTickLinesUndefined: Self = StObject.set(x, "majorTickLines", js.undefined)
      
      inline def setMaximumLabelWidth(value: Double): Self = StObject.set(x, "maximumLabelWidth", value.asInstanceOf[js.Any])
      
      inline def setMaximumLabelWidthUndefined: Self = StObject.set(x, "maximumLabelWidth", js.undefined)
      
      inline def setMaximumLabels(value: Double): Self = StObject.set(x, "maximumLabels", value.asInstanceOf[js.Any])
      
      inline def setMaximumLabelsUndefined: Self = StObject.set(x, "maximumLabels", js.undefined)
      
      inline def setMinorGridLines(value: PrimaryYAxisMinorGridLines): Self = StObject.set(x, "minorGridLines", value.asInstanceOf[js.Any])
      
      inline def setMinorGridLinesUndefined: Self = StObject.set(x, "minorGridLines", js.undefined)
      
      inline def setMinorTickLines(value: PrimaryYAxisMinorTickLines): Self = StObject.set(x, "minorTickLines", value.asInstanceOf[js.Any])
      
      inline def setMinorTickLinesUndefined: Self = StObject.set(x, "minorTickLines", js.undefined)
      
      inline def setMinorTicksPerInterval(value: Double): Self = StObject.set(x, "minorTicksPerInterval", value.asInstanceOf[js.Any])
      
      inline def setMinorTicksPerIntervalUndefined: Self = StObject.set(x, "minorTicksPerInterval", js.undefined)
      
      inline def setMultiLevelLabels(value: js.Array[PrimaryYAxisMultiLevelLabel]): Self = StObject.set(x, "multiLevelLabels", value.asInstanceOf[js.Any])
      
      inline def setMultiLevelLabelsUndefined: Self = StObject.set(x, "multiLevelLabels", js.undefined)
      
      inline def setMultiLevelLabelsVarargs(value: PrimaryYAxisMultiLevelLabel*): Self = StObject.set(x, "multiLevelLabels", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpposedPosition(value: Boolean): Self = StObject.set(x, "opposedPosition", value.asInstanceOf[js.Any])
      
      inline def setOpposedPositionUndefined: Self = StObject.set(x, "opposedPosition", js.undefined)
      
      inline def setOrientation(value: AxisOrientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPlotOffset(value: Double): Self = StObject.set(x, "plotOffset", value.asInstanceOf[js.Any])
      
      inline def setPlotOffsetUndefined: Self = StObject.set(x, "plotOffset", js.undefined)
      
      inline def setRange(value: PrimaryYAxisRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangePadding(value: RangePadding | String): Self = StObject.set(x, "rangePadding", value.asInstanceOf[js.Any])
      
      inline def setRangePaddingUndefined: Self = StObject.set(x, "rangePadding", js.undefined)
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRoundingPlaces(value: Double): Self = StObject.set(x, "roundingPlaces", value.asInstanceOf[js.Any])
      
      inline def setRoundingPlacesUndefined: Self = StObject.set(x, "roundingPlaces", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setScrollbarSettings(value: PrimaryYAxisScrollbarSettings): Self = StObject.set(x, "scrollbarSettings", value.asInstanceOf[js.Any])
      
      inline def setScrollbarSettingsUndefined: Self = StObject.set(x, "scrollbarSettings", js.undefined)
      
      inline def setShowNextToAxisLine(value: Boolean): Self = StObject.set(x, "showNextToAxisLine", value.asInstanceOf[js.Any])
      
      inline def setShowNextToAxisLineUndefined: Self = StObject.set(x, "showNextToAxisLine", js.undefined)
      
      inline def setStripLine(value: js.Array[PrimaryYAxisStripLine]): Self = StObject.set(x, "stripLine", value.asInstanceOf[js.Any])
      
      inline def setStripLineUndefined: Self = StObject.set(x, "stripLine", js.undefined)
      
      inline def setStripLineVarargs(value: PrimaryYAxisStripLine*): Self = StObject.set(x, "stripLine", js.Array(value*))
      
      inline def setTickLinesPosition(value: TickLinesPosition | String): Self = StObject.set(x, "tickLinesPosition", value.asInstanceOf[js.Any])
      
      inline def setTickLinesPositionUndefined: Self = StObject.set(x, "tickLinesPosition", js.undefined)
      
      inline def setTitle(value: PrimaryYAxisTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setValueType(value: ValueType | String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
      
      inline def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
      
      inline def setZoomPosition(value: Double): Self = StObject.set(x, "zoomPosition", value.asInstanceOf[js.Any])
      
      inline def setZoomPositionUndefined: Self = StObject.set(x, "zoomPosition", js.undefined)
    }
  }
  
  trait PrimaryYAxisAlternateGridBand extends StObject {
    
    /** Options for customizing even grid band.
      */
    var even: js.UndefOr[PrimaryYAxisAlternateGridBandEven] = js.undefined
    
    /** Options for customizing odd grid band.
      */
    var odd: js.UndefOr[PrimaryYAxisAlternateGridBandOdd] = js.undefined
  }
  object PrimaryYAxisAlternateGridBand {
    
    inline def apply(): PrimaryYAxisAlternateGridBand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisAlternateGridBand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisAlternateGridBand] (val x: Self) extends AnyVal {
      
      inline def setEven(value: PrimaryYAxisAlternateGridBandEven): Self = StObject.set(x, "even", value.asInstanceOf[js.Any])
      
      inline def setEvenUndefined: Self = StObject.set(x, "even", js.undefined)
      
      inline def setOdd(value: PrimaryYAxisAlternateGridBandOdd): Self = StObject.set(x, "odd", value.asInstanceOf[js.Any])
      
      inline def setOddUndefined: Self = StObject.set(x, "odd", js.undefined)
    }
  }
  
  trait PrimaryYAxisAlternateGridBandEven extends StObject {
    
    /** Fill color for the even grid bands.
      * @Default {transparent}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Opacity of the even grid band.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object PrimaryYAxisAlternateGridBandEven {
    
    inline def apply(): PrimaryYAxisAlternateGridBandEven = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisAlternateGridBandEven]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisAlternateGridBandEven] (val x: Self) extends AnyVal {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait PrimaryYAxisAlternateGridBandOdd extends StObject {
    
    /** Fill color of the odd grid bands.
      * @Default {transparent}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Opacity of odd grid band.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object PrimaryYAxisAlternateGridBandOdd {
    
    inline def apply(): PrimaryYAxisAlternateGridBandOdd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisAlternateGridBandOdd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisAlternateGridBandOdd] (val x: Self) extends AnyVal {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait PrimaryYAxisAxisLine extends StObject {
    
    /** Color of axis line.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Pattern of dashes and gaps to be applied to the axis line.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Padding for axis line. Normally, it is used along with plotOffset to pad the plot area.
      * @Default {null}
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /** Show/hides the axis line.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of axis line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PrimaryYAxisAxisLine {
    
    inline def apply(): PrimaryYAxisAxisLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisAxisLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisAxisLine] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PrimaryYAxisCrosshairLabel extends StObject {
    
    /** Show/hides the crosshair label associated with this axis.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object PrimaryYAxisCrosshairLabel {
    
    inline def apply(): PrimaryYAxisCrosshairLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisCrosshairLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisCrosshairLabel] (val x: Self) extends AnyVal {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait PrimaryYAxisFont extends StObject {
    
    /** Font family of labels.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of labels.
      * @Default {ej.datavisualization.Chart.FontStyle.Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the label.
      * @Default {ej.datavisualization.Chart.FontWeight.Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity of the axis labels.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the axis labels.
      * @Default {13px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object PrimaryYAxisFont {
    
    inline def apply(): PrimaryYAxisFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait PrimaryYAxisLabelBorder extends StObject {
    
    /** Specifies the color of the label border.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of the label border.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PrimaryYAxisLabelBorder {
    
    inline def apply(): PrimaryYAxisLabelBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisLabelBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisLabelBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PrimaryYAxisMajorGridLines extends StObject {
    
    /** Color of the major grid lines.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Pattern of dashes and gaps used to stroke the major grid lines.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Opacity of major grid lines.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Show/hides the major grid lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the major grid lines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PrimaryYAxisMajorGridLines {
    
    inline def apply(): PrimaryYAxisMajorGridLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisMajorGridLines]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisMajorGridLines] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PrimaryYAxisMajorTickLines extends StObject {
    
    /** Length of the major tick lines.
      * @Default {5}
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Show/hides the major tick lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the major tick lines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PrimaryYAxisMajorTickLines {
    
    inline def apply(): PrimaryYAxisMajorTickLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisMajorTickLines]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisMajorTickLines] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PrimaryYAxisMinorGridLines extends StObject {
    
    /** Patterns of dashes and gaps used to stroke the minor grid lines.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Show/hides the minor grid lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the minorGridLines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PrimaryYAxisMinorGridLines {
    
    inline def apply(): PrimaryYAxisMinorGridLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisMinorGridLines]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisMinorGridLines] (val x: Self) extends AnyVal {
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PrimaryYAxisMinorTickLines extends StObject {
    
    /** Length of the minor tick lines.
      * @Default {5}
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Show/hides the minor tick lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the minor tick line
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PrimaryYAxisMinorTickLines {
    
    inline def apply(): PrimaryYAxisMinorTickLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisMinorTickLines]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisMinorTickLines] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PrimaryYAxisMultiLevelLabel extends StObject {
    
    /** Options for customizing the border of the series.
      */
    var border: js.UndefOr[PrimaryYAxisMultiLevelLabelsBorder] = js.undefined
    
    /** Ending value of the multi level labels.
      * @Default {null}
      */
    var end: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the font of the text.
      */
    var font: js.UndefOr[PrimaryYAxisMultiLevelLabelsFont] = js.undefined
    
    /** Specifies the level of multi level labels.
      * @Default {0}
      */
    var level: js.UndefOr[Double] = js.undefined
    
    /** Specifies the maximum width of the text in multi level labels.
      * @Default {null}
      */
    var maximumTextWidth: js.UndefOr[Double] = js.undefined
    
    /** Starting value of the multi level labels.
      * @Default {null}
      */
    var start: js.UndefOr[Double] = js.undefined
    
    /** Text of the multi level labels.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the alignment of the text in multi level labels.
      * @Default {center. See TextAlignment}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.undefined
    
    /** Specifies the handling of text over flow in multi level labels.
      * @Default {center. See TextOverflow}
      */
    var textOverflow: js.UndefOr[TextOverflow | String] = js.undefined
    
    /** Visibility of the multi level labels.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object PrimaryYAxisMultiLevelLabel {
    
    inline def apply(): PrimaryYAxisMultiLevelLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisMultiLevelLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisMultiLevelLabel] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: PrimaryYAxisMultiLevelLabelsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFont(value: PrimaryYAxisMultiLevelLabelsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMaximumTextWidth(value: Double): Self = StObject.set(x, "maximumTextWidth", value.asInstanceOf[js.Any])
      
      inline def setMaximumTextWidthUndefined: Self = StObject.set(x, "maximumTextWidth", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait PrimaryYAxisMultiLevelLabelsBorder extends StObject {
    
    /** Border color of the multi level labels.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border type of the multi level labels.
      * @Default {rectangle. See Type}
      */
    var `type`: js.UndefOr[MultiLevelLabelsBorderType | String] = js.undefined
    
    /** Border width of the multi level labels.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PrimaryYAxisMultiLevelLabelsBorder {
    
    inline def apply(): PrimaryYAxisMultiLevelLabelsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisMultiLevelLabelsBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisMultiLevelLabelsBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setType(value: MultiLevelLabelsBorderType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PrimaryYAxisMultiLevelLabelsFont extends StObject {
    
    /** Font color of the multi level labels text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Font family of the multi level labels text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of the multi level labels text.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the multi level label text.
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[String] = js.undefined
    
    /** Opacity of the multi level label text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the multi level label text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object PrimaryYAxisMultiLevelLabelsFont {
    
    inline def apply(): PrimaryYAxisMultiLevelLabelsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisMultiLevelLabelsFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisMultiLevelLabelsFont] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait PrimaryYAxisRange extends StObject {
    
    /** Interval for the range.
      * @Default {null}
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /** Maximum value of the axis range.
      * @Default {null}
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /** Minimum value of the axis range.
      * @Default {null}
      */
    var min: js.UndefOr[Double] = js.undefined
  }
  object PrimaryYAxisRange {
    
    inline def apply(): PrimaryYAxisRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisRange] (val x: Self) extends AnyVal {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  trait PrimaryYAxisScrollbarSettings extends StObject {
    
    /** Controls whether scrollbar has to be responsive in the chart.
      * @Default {false}
      */
    var canResize: js.UndefOr[Boolean] = js.undefined
    
    /** The maximum number of points to be displayed in the scrollbar.
      * @Default {null}
      */
    var pointsLength: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the range for the scrollbar in the axis.
      */
    var range: js.UndefOr[PrimaryYAxisScrollbarSettingsRange] = js.undefined
    
    /** Specifies to enable or disable the scrollbar.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object PrimaryYAxisScrollbarSettings {
    
    inline def apply(): PrimaryYAxisScrollbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisScrollbarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisScrollbarSettings] (val x: Self) extends AnyVal {
      
      inline def setCanResize(value: Boolean): Self = StObject.set(x, "canResize", value.asInstanceOf[js.Any])
      
      inline def setCanResizeUndefined: Self = StObject.set(x, "canResize", js.undefined)
      
      inline def setPointsLength(value: Double): Self = StObject.set(x, "pointsLength", value.asInstanceOf[js.Any])
      
      inline def setPointsLengthUndefined: Self = StObject.set(x, "pointsLength", js.undefined)
      
      inline def setRange(value: PrimaryYAxisScrollbarSettingsRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait PrimaryYAxisScrollbarSettingsRange extends StObject {
    
    /** Maximum value for the scrollbar range .
      * @Default {null}
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /** Minimum value of the scrollbar range.
      * @Default {null}
      */
    var min: js.UndefOr[Double] = js.undefined
  }
  object PrimaryYAxisScrollbarSettingsRange {
    
    inline def apply(): PrimaryYAxisScrollbarSettingsRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisScrollbarSettingsRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisScrollbarSettingsRange] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  trait PrimaryYAxisStripLine extends StObject {
    
    /** Border color of the strip line.
      * @Default {gray}
      */
    var borderColor: js.UndefOr[String] = js.undefined
    
    /** Background color of the strip line.
      * @Default {gray}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** End value of the strip line.
      * @Default {null}
      */
    var end: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the font of the text.
      */
    var font: js.UndefOr[PrimaryYAxisStripLineFont] = js.undefined
    
    /** Start value of the strip line.
      * @Default {null}
      */
    var start: js.UndefOr[Double] = js.undefined
    
    /** Indicates whether to render the strip line from the minimum/start value of the axis. This property wonâ€™t work when start property is set.
      * @Default {false}
      */
    var startFromAxis: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies text to be displayed inside the strip line.
      * @Default {stripLine}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the alignment of the text inside the strip line.
      * @Default {middlecenter. See TextAlignment}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.undefined
    
    /** Show/hides the strip line.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the strip line.
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /** Specifies the order in which strip line and the series have to be rendered. When Z-order is â€œbehindâ€, strip line is rendered below the series and when it is â€œoverâ€, it is
      * rendered above the series.
      * @Default {over. See ZIndex}
      */
    var zIndex: js.UndefOr[ZIndex | String] = js.undefined
  }
  object PrimaryYAxisStripLine {
    
    inline def apply(): PrimaryYAxisStripLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisStripLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisStripLine] (val x: Self) extends AnyVal {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFont(value: PrimaryYAxisStripLineFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartFromAxis(value: Boolean): Self = StObject.set(x, "startFromAxis", value.asInstanceOf[js.Any])
      
      inline def setStartFromAxisUndefined: Self = StObject.set(x, "startFromAxis", js.undefined)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZIndex(value: ZIndex | String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait PrimaryYAxisStripLineFont extends StObject {
    
    /** Font color of the strip line text.
      * @Default {black}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Font family of the strip line text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of the strip line text.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the strip line text.
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[String] = js.undefined
    
    /** Opacity of the strip line text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the strip line text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object PrimaryYAxisStripLineFont {
    
    inline def apply(): PrimaryYAxisStripLineFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisStripLineFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisStripLineFont] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait PrimaryYAxisTitle extends StObject {
    
    /** Specifies the position of the axis title.
      * @Default {center. See Alignment}
      */
    var alignment: js.UndefOr[TextAlignment | String] = js.undefined
    
    /** Specifies whether to trim the axis title when it exceeds the chart area or the maximum width of the title.
      * @Default {ej.datavisualization.Chart.enableTrim}
      */
    var enableTrim: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the title font.
      */
    var font: js.UndefOr[PrimaryYAxisTitleFont] = js.undefined
    
    /** Maximum width of the title, when the title exceeds this width, the title gets trimmed, when enableTrim is true.
      * @Default {ej.datavisualization.Chart.maximumTitleWidth.null}
      */
    var maximumTitleWidth: js.UndefOr[Double] = js.undefined
    
    /** offset value for axis title.
      * @Default {0}
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /** Specifies the position of the axis title.
      * @Default {outside. See Position}
      */
    var position: js.UndefOr[LabelPosition | String] = js.undefined
    
    /** Title for the axis.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Controls the visibility of axis title.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object PrimaryYAxisTitle {
    
    inline def apply(): PrimaryYAxisTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisTitle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisTitle] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: TextAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      inline def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      inline def setFont(value: PrimaryYAxisTitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setMaximumTitleWidth(value: Double): Self = StObject.set(x, "maximumTitleWidth", value.asInstanceOf[js.Any])
      
      inline def setMaximumTitleWidthUndefined: Self = StObject.set(x, "maximumTitleWidth", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPosition(value: LabelPosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait PrimaryYAxisTitleFont extends StObject {
    
    /** Font family of the title text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of the title text.
      * @Default {ej.datavisualization.Chart.FontStyle.Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the title text.
      * @Default {ej.datavisualization.Chart.FontWeight.Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity of the axis title text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the axis title.
      * @Default {16px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object PrimaryYAxisTitleFont {
    
    inline def apply(): PrimaryYAxisTitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisTitleFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryYAxisTitleFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait RangeSelectedEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Selected data collection of object
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RangeSelectedEventArgs {
    
    inline def apply(): RangeSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeSelectedEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RangeSelectedEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait RowDefinition extends StObject {
    
    /** Color of the line that indicates the starting point of the row in plotting area.
      * @Default {transparent}
      */
    var lineColor: js.UndefOr[String] = js.undefined
    
    /** Width of the line that indicates the starting point of the row in plot area.
      * @Default {1}
      */
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    /** Height of the row in plotting area. Height is measured in either pixel or percentage based on the value of unit property.
      * @Default {50}
      */
    var rowHeight: js.UndefOr[Double] = js.undefined
    
    /** Specifies the unit to measure the height of the row in plotting area.
      * @Default {'pixel'. See Unit}
      */
    var unit: js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.Unit | String] = js.undefined
  }
  object RowDefinition {
    
    inline def apply(): RowDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowDefinition] (val x: Self) extends AnyVal {
      
      inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
      
      inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      inline def setUnit(value: typings.ejWebAll.ej.datavisualization.Chart.Unit | String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  trait ScrollChangedEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** oldRange - returns the scrollbar position old start and end range value on change end of scrollbar    newRange - returns the scrollbar position new start and end range value
      * on change end of scrollbar
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** returns the RangeNavigator model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ScrollChangedEventArgs {
    
    inline def apply(): ScrollChangedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollChangedEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollChangedEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait ScrollEndEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** oldRange - returns the scrollbar position old start and end range value on change end of scrollbar    newRange - returns the scrollbar position new start and end range value
      * on change end of scrollbar
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** returns the RangeNavigator model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ScrollEndEventArgs {
    
    inline def apply(): ScrollEndEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollEndEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollEndEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait ScrollStartEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** startRange - returns the scrollbar position starting range value on changing scrollbar    endRange - returns the scrollbar position end range value on changing scrollbar
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** returns the RangeNavigator model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ScrollStartEventArgs {
    
    inline def apply(): ScrollStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollStartEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollStartEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait Series extends StObject {
    
    /** Specifies animation duration for series rendering.
      * @Default {null}
      */
    var animationDuration: js.UndefOr[String] = js.undefined
    
    /** Color of the point, where the close is up in financial chart.
      * @Default {null}
      */
    var bearFillColor: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the border of the series.
      */
    var border: js.UndefOr[SeriesBorder] = js.undefined
    
    /** Quartile calculation has been performed in three different formulas to render the boxplot series .
      * @Default {exclusive.See BoxPlotMode}
      */
    var boxPlotMode: js.UndefOr[LabelPosition | String] = js.undefined
    
    /** Options for customizing the bubble options of the Bubble series
      */
    var bubbleOptions: js.UndefOr[SeriesBubbleOptions] = js.undefined
    
    /** Color of the point, where the close is down in financial chart.
      * @Default {null}
      */
    var bullFillColor: js.UndefOr[String] = js.undefined
    
    /** Specifies spline tension values for cardinal spline type.Value ranges from 0 to 1.
      * @Default {0.5}
      */
    var cardinalSplineTension: js.UndefOr[Double] = js.undefined
    
    /** Name of the property in the datasource that contains close value for the series.
      * @Default {null}
      */
    var close: js.UndefOr[String] = js.undefined
    
    /** To render the column and bar type series in rectangle/cylinder shape. See ColumnFacet
      * @Default {rectangle}
      */
    var columnFacet: js.UndefOr[ColumnFacet | String] = js.undefined
    
    /** Spacing between columns of different series. Value ranges from 0 to 1
      * @Default {0}
      */
    var columnSpacing: js.UndefOr[Double] = js.undefined
    
    /** Relative width of the columns in column type series. Value ranges from 0 to 1. Width also depends upon columnSpacing property.
      * @Default {0.7}
      */
    var columnWidth: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the waterfall connector line.
      */
    var connectorLine: js.UndefOr[SeriesConnectorLine] = js.undefined
    
    /** Options for customizing the corner radius. cornerRadius property also takes the numeric input and applies it for all the four corners of the column.
      */
    var cornerRadius: js.UndefOr[SeriesCornerRadius] = js.undefined
    
    /** Pattern of dashes and gaps used to stroke the line type series.
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Specifies the dataSource for the series. It can be an array of JSON objects or an instance of ej.DataManager.
      * @Default {null}
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Controls the size of the hole in doughnut series. Value ranges from 0 to 1.
      * @Default {0.4}
      */
    var doughnutCoefficient: js.UndefOr[Double] = js.undefined
    
    /** Controls the size of the doughnut series. Value ranges from 0 to 1.
      * @Default {0.8}
      */
    var doughnutSize: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the drag and drop in series.
      */
    var dragSettings: js.UndefOr[SeriesDragSettings] = js.undefined
    
    /** Type of series to be drawn in radar or polar series.
      * @Default {line. See DrawType}
      */
    var drawType: js.UndefOr[DrawType | String] = js.undefined
    
    /** Options for customizing the empty point in the series.
      */
    var emptyPointSettings: js.UndefOr[SeriesEmptyPointSettings] = js.undefined
    
    /** Enable/disable the animation of series.
      * @Default {false}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** To avoid overlapping of data labels smartly.
      * @Default {null}
      */
    var enableSmartLabels: js.UndefOr[Double] = js.undefined
    
    /** End angle of pie/doughnut series. For a complete circle, it has to be 360, by default.
      * @Default {null}
      */
    var endAngle: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the error bar in series.
      */
    var errorBar: js.UndefOr[SeriesErrorBar] = js.undefined
    
    /** Explodes the pie/doughnut slices on mouse move.
      * @Default {false}
      */
    var explode: js.UndefOr[Boolean] = js.undefined
    
    /** Explodes all the slice of pie/doughnut on render.
      * @Default {null}
      */
    var explodeAll: js.UndefOr[Boolean] = js.undefined
    
    /** Index of the point to be exploded from pie/doughnut/pyramid/funnel.
      * @Default {null}
      */
    var explodeIndex: js.UndefOr[Double] = js.undefined
    
    /** Specifies the distance of the slice from the center, when it is exploded.
      * @Default {25}
      */
    var explodeOffset: js.UndefOr[Double] = js.undefined
    
    /** Fill color of the series.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the series font.
      */
    var font: js.UndefOr[SeriesFont] = js.undefined
    
    /** Specifies the height of the funnel in funnel series. Values can be in both pixel and percentage.
      * @Default {32.7%}
      */
    var funnelHeight: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of the funnel in funnel series. Values can be in both pixel and percentage.
      * @Default {11.6%}
      */
    var funnelWidth: js.UndefOr[String] = js.undefined
    
    /** Gap between the slices of pyramid/funnel series.
      * @Default {0}
      */
    var gapRatio: js.UndefOr[Double] = js.undefined
    
    /** Distance between the two pie's in pieOfPie series.
      * @Default {50}
      */
    var gapWidth: js.UndefOr[Double] = js.undefined
    
    /** Name of the property in the datasource that contains high value for the series.
      * @Default {null}
      */
    var high: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the appearance of the series or data point while highlighting.
      */
    var highlightSettings: js.UndefOr[SeriesHighlightSettings] = js.undefined
    
    /** Specifies whether to join start and end point of a line/area series used in polar/radar chart to form a closed path.
      * @Default {true}
      */
    var isClosed: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to stack the column series in polar/radar charts.
      * @Default {true}
      */
    var isStacking: js.UndefOr[Boolean] = js.undefined
    
    /** Renders the chart vertically. This is applicable only for Cartesian type series.
      * @Default {false}
      */
    var isTransposed: js.UndefOr[Boolean] = js.undefined
    
    /** Position of the data label in pie/doughnut/pyramid/funnel series. OutsideExtended position is not applicable for pyramid/funnel.
      * @Default {inside. See LabelPosition}
      */
    var labelPosition: js.UndefOr[LabelPosition | String] = js.undefined
    
    /** Specifies the line cap of the series.
      * @Default {Butt. See LineCap}
      */
    var lineCap: js.UndefOr[LineCap | String] = js.undefined
    
    /** Specifies the type of shape to be used where two lines meet.
      * @Default {Round. See LineJoin}
      */
    var lineJoin: js.UndefOr[LineJoin | String] = js.undefined
    
    /** Name of the property in the datasource that contains low value for the series.
      * @Default {null}
      */
    var low: js.UndefOr[String] = js.undefined
    
    /** Options for displaying and customizing marker for individual point in a series. Marker contains shapes and/or data labels.
      */
    var marker: js.UndefOr[SeriesMarker] = js.undefined
    
    /** Name of the series, that is to be displayed in the legend.
      * @Default {Add a comment to this line}
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Opacity of the series.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Name of the property in the datasource that contains open value for the series.
      * @Default {null}
      */
    var open: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the outlier of individual series.
      */
    var outlierSettings: js.UndefOr[SeriesOutlierSettings] = js.undefined
    
    /** Name of a field in data source where fill color for all the data points is generated.
      */
    var palette: js.UndefOr[String] = js.undefined
    
    /** Controls the size of pie series. Value ranges from 0 to 1.
      * @Default {0.8}
      */
    var pieCoefficient: js.UndefOr[Double] = js.undefined
    
    /** Controls the size of the second pie in pieOfPie series. Value ranges from 0 to 1.
      * @Default {0.6}
      */
    var pieOfPieCoefficient: js.UndefOr[Double] = js.undefined
    
    /** Name of the property in the datasource that contains fill color for the series.
      * @Default {null}
      */
    var pointColorMappingName: js.UndefOr[String] = js.undefined
    
    /** Option to add data points; each point should have x and y property. Also, optionally, you can customize the points color, border, marker by using fill, border and marker options.
      */
    var points: js.UndefOr[js.Array[SeriesPoint]] = js.undefined
    
    /** Fill color for the positive column of the waterfall.
      * @Default {null}
      */
    var positiveFill: js.UndefOr[String] = js.undefined
    
    /** Specifies the mode of the pyramid series.
      * @Default {linear}
      */
    var pyramidMode: js.UndefOr[PyramidMode | String] = js.undefined
    
    /** Specifies ej.Query to select data from dataSource. This property is applicable only when the dataSource is ej.DataManager.
      * @Default {null}
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** Options for customizing the appearance of the series/data point on selection.
      */
    var selectionSettings: js.UndefOr[SeriesSelectionSettings] = js.undefined
    
    /** Render the x mark in the center of the box and whisker series type.x represents the average value of the box and whisker series.
      * @Default {true}
      */
    var showMedian: js.UndefOr[Boolean] = js.undefined
    
    /** Name of the property in the datasource that contains the size value for the bubble series.
      * @Default {null}
      */
    var size: js.UndefOr[String] = js.undefined
    
    /** Specifies the different types of spline curve.
      * @Default {Natural. See SplineType}
      */
    var splineType: js.UndefOr[SplineType | String] = js.undefined
    
    /** Specifies the mode for splitting the data points in pieOfPie series.
      * @Default {value. See SplitMode}
      */
    var splitMode: js.UndefOr[SplitMode | String] = js.undefined
    
    /** Split Value of pieOfPie series.
      * @Default {null}
      */
    var splitValue: js.UndefOr[String] = js.undefined
    
    /** To group the series of stacking collection.
      */
    var stackingGroup: js.UndefOr[String] = js.undefined
    
    /** Start angle from where the pie/doughnut series renders. It starts from 0, by default.
      * @Default {null}
      */
    var startAngle: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the tooltip of chart.
      */
    var tooltip: js.UndefOr[SeriesTooltip] = js.undefined
    
    /** Option to add trendlines to chart.
      */
    var trendlines: js.UndefOr[js.Array[SeriesTrendline]] = js.undefined
    
    /** Specifies the type of the series to render in chart.
      * @Default {column. see Type}
      */
    var `type`: js.UndefOr[typings.ejWebAll.ej.Type | String] = js.undefined
    
    /** Controls the visibility of the series.
      * @Default {visible}
      */
    var visibility: js.UndefOr[String] = js.undefined
    
    /** Enables or disables the visibility of legend item.
      * @Default {visible}
      */
    var visibleOnLegend: js.UndefOr[String] = js.undefined
    
    /** Specifies the name of the x-axis that has to be associated with this series. Add an axis instance with this name to axes collection.
      * @Default {null}
      */
    var xAxisName: js.UndefOr[String] = js.undefined
    
    /** Name of the property in the datasource that contains x value for the series.
      * @Default {null}
      */
    var xName: js.UndefOr[String] = js.undefined
    
    /** Specifies the name of the y-axis that has to be associated with this series. Add an axis instance with this name to axes collection.
      * @Default {null}
      */
    var yAxisName: js.UndefOr[String] = js.undefined
    
    /** Name of the property in the datasource that contains y value for the series.
      * @Default {null}
      */
    var yName: js.UndefOr[String] = js.undefined
    
    /** Z-order of the series.
      * @Default {0}
      */
    var zOrder: js.UndefOr[Double] = js.undefined
  }
  object Series {
    
    inline def apply(): Series = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Series]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Series] (val x: Self) extends AnyVal {
      
      inline def setAnimationDuration(value: String): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setBearFillColor(value: String): Self = StObject.set(x, "bearFillColor", value.asInstanceOf[js.Any])
      
      inline def setBearFillColorUndefined: Self = StObject.set(x, "bearFillColor", js.undefined)
      
      inline def setBorder(value: SeriesBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBoxPlotMode(value: LabelPosition | String): Self = StObject.set(x, "boxPlotMode", value.asInstanceOf[js.Any])
      
      inline def setBoxPlotModeUndefined: Self = StObject.set(x, "boxPlotMode", js.undefined)
      
      inline def setBubbleOptions(value: SeriesBubbleOptions): Self = StObject.set(x, "bubbleOptions", value.asInstanceOf[js.Any])
      
      inline def setBubbleOptionsUndefined: Self = StObject.set(x, "bubbleOptions", js.undefined)
      
      inline def setBullFillColor(value: String): Self = StObject.set(x, "bullFillColor", value.asInstanceOf[js.Any])
      
      inline def setBullFillColorUndefined: Self = StObject.set(x, "bullFillColor", js.undefined)
      
      inline def setCardinalSplineTension(value: Double): Self = StObject.set(x, "cardinalSplineTension", value.asInstanceOf[js.Any])
      
      inline def setCardinalSplineTensionUndefined: Self = StObject.set(x, "cardinalSplineTension", js.undefined)
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setColumnFacet(value: ColumnFacet | String): Self = StObject.set(x, "columnFacet", value.asInstanceOf[js.Any])
      
      inline def setColumnFacetUndefined: Self = StObject.set(x, "columnFacet", js.undefined)
      
      inline def setColumnSpacing(value: Double): Self = StObject.set(x, "columnSpacing", value.asInstanceOf[js.Any])
      
      inline def setColumnSpacingUndefined: Self = StObject.set(x, "columnSpacing", js.undefined)
      
      inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setConnectorLine(value: SeriesConnectorLine): Self = StObject.set(x, "connectorLine", value.asInstanceOf[js.Any])
      
      inline def setConnectorLineUndefined: Self = StObject.set(x, "connectorLine", js.undefined)
      
      inline def setCornerRadius(value: SeriesCornerRadius): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDoughnutCoefficient(value: Double): Self = StObject.set(x, "doughnutCoefficient", value.asInstanceOf[js.Any])
      
      inline def setDoughnutCoefficientUndefined: Self = StObject.set(x, "doughnutCoefficient", js.undefined)
      
      inline def setDoughnutSize(value: Double): Self = StObject.set(x, "doughnutSize", value.asInstanceOf[js.Any])
      
      inline def setDoughnutSizeUndefined: Self = StObject.set(x, "doughnutSize", js.undefined)
      
      inline def setDragSettings(value: SeriesDragSettings): Self = StObject.set(x, "dragSettings", value.asInstanceOf[js.Any])
      
      inline def setDragSettingsUndefined: Self = StObject.set(x, "dragSettings", js.undefined)
      
      inline def setDrawType(value: DrawType | String): Self = StObject.set(x, "drawType", value.asInstanceOf[js.Any])
      
      inline def setDrawTypeUndefined: Self = StObject.set(x, "drawType", js.undefined)
      
      inline def setEmptyPointSettings(value: SeriesEmptyPointSettings): Self = StObject.set(x, "emptyPointSettings", value.asInstanceOf[js.Any])
      
      inline def setEmptyPointSettingsUndefined: Self = StObject.set(x, "emptyPointSettings", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setEnableSmartLabels(value: Double): Self = StObject.set(x, "enableSmartLabels", value.asInstanceOf[js.Any])
      
      inline def setEnableSmartLabelsUndefined: Self = StObject.set(x, "enableSmartLabels", js.undefined)
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setErrorBar(value: SeriesErrorBar): Self = StObject.set(x, "errorBar", value.asInstanceOf[js.Any])
      
      inline def setErrorBarUndefined: Self = StObject.set(x, "errorBar", js.undefined)
      
      inline def setExplode(value: Boolean): Self = StObject.set(x, "explode", value.asInstanceOf[js.Any])
      
      inline def setExplodeAll(value: Boolean): Self = StObject.set(x, "explodeAll", value.asInstanceOf[js.Any])
      
      inline def setExplodeAllUndefined: Self = StObject.set(x, "explodeAll", js.undefined)
      
      inline def setExplodeIndex(value: Double): Self = StObject.set(x, "explodeIndex", value.asInstanceOf[js.Any])
      
      inline def setExplodeIndexUndefined: Self = StObject.set(x, "explodeIndex", js.undefined)
      
      inline def setExplodeOffset(value: Double): Self = StObject.set(x, "explodeOffset", value.asInstanceOf[js.Any])
      
      inline def setExplodeOffsetUndefined: Self = StObject.set(x, "explodeOffset", js.undefined)
      
      inline def setExplodeUndefined: Self = StObject.set(x, "explode", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: SeriesFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFunnelHeight(value: String): Self = StObject.set(x, "funnelHeight", value.asInstanceOf[js.Any])
      
      inline def setFunnelHeightUndefined: Self = StObject.set(x, "funnelHeight", js.undefined)
      
      inline def setFunnelWidth(value: String): Self = StObject.set(x, "funnelWidth", value.asInstanceOf[js.Any])
      
      inline def setFunnelWidthUndefined: Self = StObject.set(x, "funnelWidth", js.undefined)
      
      inline def setGapRatio(value: Double): Self = StObject.set(x, "gapRatio", value.asInstanceOf[js.Any])
      
      inline def setGapRatioUndefined: Self = StObject.set(x, "gapRatio", js.undefined)
      
      inline def setGapWidth(value: Double): Self = StObject.set(x, "gapWidth", value.asInstanceOf[js.Any])
      
      inline def setGapWidthUndefined: Self = StObject.set(x, "gapWidth", js.undefined)
      
      inline def setHigh(value: String): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setHighlightSettings(value: SeriesHighlightSettings): Self = StObject.set(x, "highlightSettings", value.asInstanceOf[js.Any])
      
      inline def setHighlightSettingsUndefined: Self = StObject.set(x, "highlightSettings", js.undefined)
      
      inline def setIsClosed(value: Boolean): Self = StObject.set(x, "isClosed", value.asInstanceOf[js.Any])
      
      inline def setIsClosedUndefined: Self = StObject.set(x, "isClosed", js.undefined)
      
      inline def setIsStacking(value: Boolean): Self = StObject.set(x, "isStacking", value.asInstanceOf[js.Any])
      
      inline def setIsStackingUndefined: Self = StObject.set(x, "isStacking", js.undefined)
      
      inline def setIsTransposed(value: Boolean): Self = StObject.set(x, "isTransposed", value.asInstanceOf[js.Any])
      
      inline def setIsTransposedUndefined: Self = StObject.set(x, "isTransposed", js.undefined)
      
      inline def setLabelPosition(value: LabelPosition | String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLineCap(value: LineCap | String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      inline def setLineJoin(value: LineJoin | String): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      inline def setLow(value: String): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setMarker(value: SeriesMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOutlierSettings(value: SeriesOutlierSettings): Self = StObject.set(x, "outlierSettings", value.asInstanceOf[js.Any])
      
      inline def setOutlierSettingsUndefined: Self = StObject.set(x, "outlierSettings", js.undefined)
      
      inline def setPalette(value: String): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setPieCoefficient(value: Double): Self = StObject.set(x, "pieCoefficient", value.asInstanceOf[js.Any])
      
      inline def setPieCoefficientUndefined: Self = StObject.set(x, "pieCoefficient", js.undefined)
      
      inline def setPieOfPieCoefficient(value: Double): Self = StObject.set(x, "pieOfPieCoefficient", value.asInstanceOf[js.Any])
      
      inline def setPieOfPieCoefficientUndefined: Self = StObject.set(x, "pieOfPieCoefficient", js.undefined)
      
      inline def setPointColorMappingName(value: String): Self = StObject.set(x, "pointColorMappingName", value.asInstanceOf[js.Any])
      
      inline def setPointColorMappingNameUndefined: Self = StObject.set(x, "pointColorMappingName", js.undefined)
      
      inline def setPoints(value: js.Array[SeriesPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setPointsVarargs(value: SeriesPoint*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setPositiveFill(value: String): Self = StObject.set(x, "positiveFill", value.asInstanceOf[js.Any])
      
      inline def setPositiveFillUndefined: Self = StObject.set(x, "positiveFill", js.undefined)
      
      inline def setPyramidMode(value: PyramidMode | String): Self = StObject.set(x, "pyramidMode", value.asInstanceOf[js.Any])
      
      inline def setPyramidModeUndefined: Self = StObject.set(x, "pyramidMode", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setSelectionSettings(value: SeriesSelectionSettings): Self = StObject.set(x, "selectionSettings", value.asInstanceOf[js.Any])
      
      inline def setSelectionSettingsUndefined: Self = StObject.set(x, "selectionSettings", js.undefined)
      
      inline def setShowMedian(value: Boolean): Self = StObject.set(x, "showMedian", value.asInstanceOf[js.Any])
      
      inline def setShowMedianUndefined: Self = StObject.set(x, "showMedian", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSplineType(value: SplineType | String): Self = StObject.set(x, "splineType", value.asInstanceOf[js.Any])
      
      inline def setSplineTypeUndefined: Self = StObject.set(x, "splineType", js.undefined)
      
      inline def setSplitMode(value: SplitMode | String): Self = StObject.set(x, "splitMode", value.asInstanceOf[js.Any])
      
      inline def setSplitModeUndefined: Self = StObject.set(x, "splitMode", js.undefined)
      
      inline def setSplitValue(value: String): Self = StObject.set(x, "splitValue", value.asInstanceOf[js.Any])
      
      inline def setSplitValueUndefined: Self = StObject.set(x, "splitValue", js.undefined)
      
      inline def setStackingGroup(value: String): Self = StObject.set(x, "stackingGroup", value.asInstanceOf[js.Any])
      
      inline def setStackingGroupUndefined: Self = StObject.set(x, "stackingGroup", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setTooltip(value: SeriesTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTrendlines(value: js.Array[SeriesTrendline]): Self = StObject.set(x, "trendlines", value.asInstanceOf[js.Any])
      
      inline def setTrendlinesUndefined: Self = StObject.set(x, "trendlines", js.undefined)
      
      inline def setTrendlinesVarargs(value: SeriesTrendline*): Self = StObject.set(x, "trendlines", js.Array(value*))
      
      inline def setType(value: typings.ejWebAll.ej.Type | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setVisibleOnLegend(value: String): Self = StObject.set(x, "visibleOnLegend", value.asInstanceOf[js.Any])
      
      inline def setVisibleOnLegendUndefined: Self = StObject.set(x, "visibleOnLegend", js.undefined)
      
      inline def setXAxisName(value: String): Self = StObject.set(x, "xAxisName", value.asInstanceOf[js.Any])
      
      inline def setXAxisNameUndefined: Self = StObject.set(x, "xAxisName", js.undefined)
      
      inline def setXName(value: String): Self = StObject.set(x, "xName", value.asInstanceOf[js.Any])
      
      inline def setXNameUndefined: Self = StObject.set(x, "xName", js.undefined)
      
      inline def setYAxisName(value: String): Self = StObject.set(x, "yAxisName", value.asInstanceOf[js.Any])
      
      inline def setYAxisNameUndefined: Self = StObject.set(x, "yAxisName", js.undefined)
      
      inline def setYName(value: String): Self = StObject.set(x, "yName", value.asInstanceOf[js.Any])
      
      inline def setYNameUndefined: Self = StObject.set(x, "yName", js.undefined)
      
      inline def setZOrder(value: Double): Self = StObject.set(x, "zOrder", value.asInstanceOf[js.Any])
      
      inline def setZOrderUndefined: Self = StObject.set(x, "zOrder", js.undefined)
    }
  }
  
  trait SeriesBorder extends StObject {
    
    /** Border color of the series.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** DashArray for border of the series.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Border width of the series.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesBorder {
    
    inline def apply(): SeriesBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesBubbleOptions extends StObject {
    
    /** Used for setting the maximum radius of the bubble
      * @Default {3}
      */
    var maxRadius: js.UndefOr[Double] = js.undefined
    
    /** Used for the setting the minimum radius of the bubble
      * @Default {1}
      */
    var minRadius: js.UndefOr[Double] = js.undefined
    
    /** Used for the calculation of the bubble radius based on the mode selected
      * @Default {minMax .See RadiusMode}
      */
    var radiusMode: js.UndefOr[RadiusMode | String] = js.undefined
  }
  object SeriesBubbleOptions {
    
    inline def apply(): SeriesBubbleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesBubbleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesBubbleOptions] (val x: Self) extends AnyVal {
      
      inline def setMaxRadius(value: Double): Self = StObject.set(x, "maxRadius", value.asInstanceOf[js.Any])
      
      inline def setMaxRadiusUndefined: Self = StObject.set(x, "maxRadius", js.undefined)
      
      inline def setMinRadius(value: Double): Self = StObject.set(x, "minRadius", value.asInstanceOf[js.Any])
      
      inline def setMinRadiusUndefined: Self = StObject.set(x, "minRadius", js.undefined)
      
      inline def setRadiusMode(value: RadiusMode | String): Self = StObject.set(x, "radiusMode", value.asInstanceOf[js.Any])
      
      inline def setRadiusModeUndefined: Self = StObject.set(x, "radiusMode", js.undefined)
    }
  }
  
  trait SeriesConnectorLine extends StObject {
    
    /** Color of the connector line.
      * @Default {#565656}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** DashArray of the connector line.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Opacity of the connector line.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Width of the connector line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesConnectorLine {
    
    inline def apply(): SeriesConnectorLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesConnectorLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesConnectorLine] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesCornerRadius extends StObject {
    
    /** Specifies the radius for the bottom left corner.
      * @Default {0}
      */
    var bottomLeft: js.UndefOr[Double] = js.undefined
    
    /** Specifies the radius for the bottom right corner.
      * @Default {0}
      */
    var bottomRight: js.UndefOr[Double] = js.undefined
    
    /** Specifies the radius for the top left corner.
      * @Default {0}
      */
    var topLeft: js.UndefOr[Double] = js.undefined
    
    /** Specifies the radius for the top right corner.
      * @Default {0}
      */
    var topRight: js.UndefOr[Double] = js.undefined
  }
  object SeriesCornerRadius {
    
    inline def apply(): SeriesCornerRadius = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesCornerRadius]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesCornerRadius] (val x: Self) extends AnyVal {
      
      inline def setBottomLeft(value: Double): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
      
      inline def setBottomRight(value: Double): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
      
      inline def setTopLeft(value: Double): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
      
      inline def setTopRight(value: Double): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
      
      inline def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
    }
  }
  
  trait SeriesDragSettings extends StObject {
    
    /** drag/drop the series
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the type of drag settings.
      * @Default {xy}
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SeriesDragSettings {
    
    inline def apply(): SeriesDragSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesDragSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesDragSettings] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SeriesEmptyPointSettings extends StObject {
    
    /** Specifies the mode of empty point.
      * @Default {gap}
      */
    var displayMode: js.UndefOr[EmptyPointMode | String] = js.undefined
    
    /** Options for customizing the color and border of the empty point in the series.
      */
    var style: js.UndefOr[SeriesEmptyPointSettingsStyle] = js.undefined
    
    /** Controls the visibility of the empty point.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object SeriesEmptyPointSettings {
    
    inline def apply(): SeriesEmptyPointSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesEmptyPointSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesEmptyPointSettings] (val x: Self) extends AnyVal {
      
      inline def setDisplayMode(value: EmptyPointMode | String): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
      
      inline def setStyle(value: SeriesEmptyPointSettingsStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait SeriesEmptyPointSettingsStyle extends StObject {
    
    /** Options for customizing border of the empty point in the series.
      */
    var border: js.UndefOr[SeriesEmptyPointSettingsStyleBorder] = js.undefined
    
    /** Color of the empty point.
      */
    var color: js.UndefOr[String] = js.undefined
  }
  object SeriesEmptyPointSettingsStyle {
    
    inline def apply(): SeriesEmptyPointSettingsStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesEmptyPointSettingsStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesEmptyPointSettingsStyle] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: SeriesEmptyPointSettingsStyleBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  trait SeriesEmptyPointSettingsStyleBorder extends StObject {
    
    /** Border color of the empty point.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the empty point.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesEmptyPointSettingsStyleBorder {
    
    inline def apply(): SeriesEmptyPointSettingsStyleBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesEmptyPointSettingsStyleBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesEmptyPointSettingsStyleBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesErrorBar extends StObject {
    
    /** Options for customizing the error bar cap.
      */
    var cap: js.UndefOr[SeriesErrorBarCap] = js.undefined
    
    /** Specifies the direction of error bar.
      * @Default {both}
      */
    var direction: js.UndefOr[ErrorBarDirection | String] = js.undefined
    
    /** Fill color of the error bar.
      * @Default {#000000}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Value of horizontal  error bar.
      * @Default {1}
      */
    var horizontalErrorValue: js.UndefOr[Double] = js.undefined
    
    /** Value of negative horizontal error bar.
      * @Default {1}
      */
    var horizontalNegativeErrorValue: js.UndefOr[Double] = js.undefined
    
    /** Value of positive horizontal error bar.
      * @Default {1}
      */
    var horizontalPositiveErrorValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies the mode of error bar.
      * @Default {vertical}
      */
    var mode: js.UndefOr[ErrorBarMode | String] = js.undefined
    
    /** Specifies the type of error bar.
      * @Default {FixedValue}
      */
    var `type`: js.UndefOr[ErrorBarType | String] = js.undefined
    
    /** Value of vertical error bar.
      * @Default {3}
      */
    var verticalErrorValue: js.UndefOr[Double] = js.undefined
    
    /** Value of negative vertical error bar.
      * @Default {5}
      */
    var verticalNegativeErrorValue: js.UndefOr[Double] = js.undefined
    
    /** Value of positive vertical error bar.
      * @Default {5}
      */
    var verticalPositiveErrorValue: js.UndefOr[Double] = js.undefined
    
    /** Show/hides the error bar
      * @Default {visible}
      */
    var visibility: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the error bar.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesErrorBar {
    
    inline def apply(): SeriesErrorBar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesErrorBar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesErrorBar] (val x: Self) extends AnyVal {
      
      inline def setCap(value: SeriesErrorBarCap): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
      
      inline def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
      
      inline def setDirection(value: ErrorBarDirection | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHorizontalErrorValue(value: Double): Self = StObject.set(x, "horizontalErrorValue", value.asInstanceOf[js.Any])
      
      inline def setHorizontalErrorValueUndefined: Self = StObject.set(x, "horizontalErrorValue", js.undefined)
      
      inline def setHorizontalNegativeErrorValue(value: Double): Self = StObject.set(x, "horizontalNegativeErrorValue", value.asInstanceOf[js.Any])
      
      inline def setHorizontalNegativeErrorValueUndefined: Self = StObject.set(x, "horizontalNegativeErrorValue", js.undefined)
      
      inline def setHorizontalPositiveErrorValue(value: Double): Self = StObject.set(x, "horizontalPositiveErrorValue", value.asInstanceOf[js.Any])
      
      inline def setHorizontalPositiveErrorValueUndefined: Self = StObject.set(x, "horizontalPositiveErrorValue", js.undefined)
      
      inline def setMode(value: ErrorBarMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setType(value: ErrorBarType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVerticalErrorValue(value: Double): Self = StObject.set(x, "verticalErrorValue", value.asInstanceOf[js.Any])
      
      inline def setVerticalErrorValueUndefined: Self = StObject.set(x, "verticalErrorValue", js.undefined)
      
      inline def setVerticalNegativeErrorValue(value: Double): Self = StObject.set(x, "verticalNegativeErrorValue", value.asInstanceOf[js.Any])
      
      inline def setVerticalNegativeErrorValueUndefined: Self = StObject.set(x, "verticalNegativeErrorValue", js.undefined)
      
      inline def setVerticalPositiveErrorValue(value: Double): Self = StObject.set(x, "verticalPositiveErrorValue", value.asInstanceOf[js.Any])
      
      inline def setVerticalPositiveErrorValueUndefined: Self = StObject.set(x, "verticalPositiveErrorValue", js.undefined)
      
      inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesErrorBarCap extends StObject {
    
    /** Color of the error bar cap.
      * @Default {#000000}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Length of the error bar cap.
      * @Default {1}
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /** Show/Hides the error bar cap.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the error bar cap.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesErrorBarCap {
    
    inline def apply(): SeriesErrorBarCap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesErrorBarCap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesErrorBarCap] (val x: Self) extends AnyVal {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesFont extends StObject {
    
    /** Font color of the series text.
      * @Default {#707070}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Font Family of the series.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font Style of the series.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the series.
      * @Default {Regular}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity of series text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Size of the series text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object SeriesFont {
    
    inline def apply(): SeriesFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesFont] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait SeriesHighlightSettings extends StObject {
    
    /** Options for customizing the border of series on highlight.
      */
    var border: js.UndefOr[SeriesHighlightSettingsBorder] = js.undefined
    
    /** Color of the series/point on highlight.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Custom pattern for the series on highlight.
      */
    var customPattern: js.UndefOr[String] = js.undefined
    
    /** Enables/disables the ability to highlight series or data point interactively.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether series or data point has to be highlighted.
      * @Default {series. See Mode}
      */
    var mode: js.UndefOr[Mode | String] = js.undefined
    
    /** Opacity of the series/point on highlight.
      * @Default {0.6}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the pattern for the series/point on highlight.
      * @Default {none. See Pattern}
      */
    var pattern: js.UndefOr[String] = js.undefined
  }
  object SeriesHighlightSettings {
    
    inline def apply(): SeriesHighlightSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesHighlightSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesHighlightSettings] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: SeriesHighlightSettingsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCustomPattern(value: String): Self = StObject.set(x, "customPattern", value.asInstanceOf[js.Any])
      
      inline def setCustomPatternUndefined: Self = StObject.set(x, "customPattern", js.undefined)
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setMode(value: Mode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
  
  trait SeriesHighlightSettingsBorder extends StObject {
    
    /** Border color of the series/point on highlight.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the series/point on highlight.
      * @Default {2}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object SeriesHighlightSettingsBorder {
    
    inline def apply(): SeriesHighlightSettingsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesHighlightSettingsBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesHighlightSettingsBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesMarker extends StObject {
    
    /** Options for customizing the border of the marker shape.
      */
    var border: js.UndefOr[SeriesMarkerBorder] = js.undefined
    
    /** Options for displaying and customizing data labels.
      */
    var dataLabel: js.UndefOr[SeriesMarkerDataLabel] = js.undefined
    
    /** Color of the marker shape.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** The URL for the Image that is to be displayed as marker. In order to display image as marker, set series.marker.shape as â€˜imageâ€™.
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** Opacity of the marker.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the shape of the marker.
      * @Default {circle. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.undefined
    
    /** Options for customizing the size of the marker shape.
      */
    var size: js.UndefOr[SeriesMarkerSize] = js.undefined
    
    /** Controls the visibility of the marker shape.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object SeriesMarker {
    
    inline def apply(): SeriesMarker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesMarker] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: SeriesMarkerBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setDataLabel(value: SeriesMarkerDataLabel): Self = StObject.set(x, "dataLabel", value.asInstanceOf[js.Any])
      
      inline def setDataLabelUndefined: Self = StObject.set(x, "dataLabel", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: SeriesMarkerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait SeriesMarkerBorder extends StObject {
    
    /** Border color of the marker shape.
      * @Default {white}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the marker shape.
      * @Default {3}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesMarkerBorder {
    
    inline def apply(): SeriesMarkerBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarkerBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesMarkerBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesMarkerDataLabel extends StObject {
    
    /** Angle of the data label in degrees. Only the text gets rotated, whereas the background and border does not rotate.
      * @Default {null}
      */
    var angle: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the border of the data label.
      */
    var border: js.UndefOr[SeriesMarkerDataLabelBorder] = js.undefined
    
    /** Options for displaying and customizing the line that connects point and data label.
      */
    var connectorLine: js.UndefOr[SeriesMarkerDataLabelConnectorLine] = js.undefined
    
    /** Enables saturation to the data label.
      * @Default {false}
      */
    var enableContrastColor: js.UndefOr[Boolean] = js.undefined
    
    /** Enable the wrap option to the data label.
      * @Default {false}
      */
    var enableWrap: js.UndefOr[Boolean] = js.undefined
    
    /** Background color of the data label.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the data label font.
      */
    var font: js.UndefOr[SeriesMarkerDataLabelFont] = js.undefined
    
    /** Horizontal alignment of the data label.
      * @Default {center}
      */
    var horizontalTextAlignment: js.UndefOr[HorizontalTextAlignment | String] = js.undefined
    
    /** Margin of the text to its background shape. The size of the background shape increases based on the margin applied to its text.
      */
    var margin: js.UndefOr[SeriesMarkerDataLabelMargin] = js.undefined
    
    /** Maximum label width of the data label.
      * @Default {null}
      */
    var maximumLabelWidth: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the datalabel positions
      */
    var offset: js.UndefOr[SeriesMarkerDataLabelOffset] = js.undefined
    
    /** Opacity of the data label.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Background shape of the data label.
      * @Default {No shape is rendered by default, so its value is â€˜noneâ€™. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.undefined
    
    /** Displays the partially visible data labels inside the chart Area.
      * @Default {false}
      */
    var showEdgeLabels: js.UndefOr[Boolean] = js.undefined
    
    /** Custom template to format the data label content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Name of a field in data source where datalabel text is displayed.
      */
    var textMappingName: js.UndefOr[String] = js.undefined
    
    /** Specifies the position of the data label. This property can be used only for the series such as column, bar, stacked column, stacked bar, 100% stacked column, 100% stacked bar,
      * candle and OHLC.
      * @Default {top. See TextPosition}
      */
    var textPosition: js.UndefOr[TextPosition | String] = js.undefined
    
    /** Vertical alignment of the data label.
      * @Default {'center'}
      */
    var verticalTextAlignment: js.UndefOr[VerticalTextAlignment | String] = js.undefined
    
    /** Controls the visibility of the data labels.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object SeriesMarkerDataLabel {
    
    inline def apply(): SeriesMarkerDataLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarkerDataLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesMarkerDataLabel] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setBorder(value: SeriesMarkerDataLabelBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setConnectorLine(value: SeriesMarkerDataLabelConnectorLine): Self = StObject.set(x, "connectorLine", value.asInstanceOf[js.Any])
      
      inline def setConnectorLineUndefined: Self = StObject.set(x, "connectorLine", js.undefined)
      
      inline def setEnableContrastColor(value: Boolean): Self = StObject.set(x, "enableContrastColor", value.asInstanceOf[js.Any])
      
      inline def setEnableContrastColorUndefined: Self = StObject.set(x, "enableContrastColor", js.undefined)
      
      inline def setEnableWrap(value: Boolean): Self = StObject.set(x, "enableWrap", value.asInstanceOf[js.Any])
      
      inline def setEnableWrapUndefined: Self = StObject.set(x, "enableWrap", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: SeriesMarkerDataLabelFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHorizontalTextAlignment(value: HorizontalTextAlignment | String): Self = StObject.set(x, "horizontalTextAlignment", value.asInstanceOf[js.Any])
      
      inline def setHorizontalTextAlignmentUndefined: Self = StObject.set(x, "horizontalTextAlignment", js.undefined)
      
      inline def setMargin(value: SeriesMarkerDataLabelMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMaximumLabelWidth(value: Double): Self = StObject.set(x, "maximumLabelWidth", value.asInstanceOf[js.Any])
      
      inline def setMaximumLabelWidthUndefined: Self = StObject.set(x, "maximumLabelWidth", js.undefined)
      
      inline def setOffset(value: SeriesMarkerDataLabelOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setShowEdgeLabels(value: Boolean): Self = StObject.set(x, "showEdgeLabels", value.asInstanceOf[js.Any])
      
      inline def setShowEdgeLabelsUndefined: Self = StObject.set(x, "showEdgeLabels", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTextMappingName(value: String): Self = StObject.set(x, "textMappingName", value.asInstanceOf[js.Any])
      
      inline def setTextMappingNameUndefined: Self = StObject.set(x, "textMappingName", js.undefined)
      
      inline def setTextPosition(value: TextPosition | String): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
      
      inline def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
      
      inline def setVerticalTextAlignment(value: VerticalTextAlignment | String): Self = StObject.set(x, "verticalTextAlignment", value.asInstanceOf[js.Any])
      
      inline def setVerticalTextAlignmentUndefined: Self = StObject.set(x, "verticalTextAlignment", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait SeriesMarkerDataLabelBorder extends StObject {
    
    /** Border color of the data label.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the data label.
      * @Default {0.1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesMarkerDataLabelBorder {
    
    inline def apply(): SeriesMarkerDataLabelBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarkerDataLabelBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesMarkerDataLabelBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesMarkerDataLabelConnectorLine extends StObject {
    
    /** Color of the connector.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Height of the connector.
      * @Default {null}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Specifies when the connector has to be drawn as Bezier curve or straight line. This is applicable only for Pie and Doughnut chart types.
      * @Default {line. See ConnectorLineType}
      */
    var `type`: js.UndefOr[typings.ejWebAll.ej.Type | String] = js.undefined
    
    /** Width of the connector.
      * @Default {0.5}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesMarkerDataLabelConnectorLine {
    
    inline def apply(): SeriesMarkerDataLabelConnectorLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarkerDataLabelConnectorLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesMarkerDataLabelConnectorLine] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setType(value: typings.ejWebAll.ej.Type | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesMarkerDataLabelFont extends StObject {
    
    /** Font color of the data label text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Font family of the data label.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of the data label.
      * @Default {normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the data label.
      * @Default {regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity of the text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the data label.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object SeriesMarkerDataLabelFont {
    
    inline def apply(): SeriesMarkerDataLabelFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarkerDataLabelFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesMarkerDataLabelFont] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait SeriesMarkerDataLabelMargin extends StObject {
    
    /** Bottom margin of the text.
      * @Default {5}
      */
    var bottom: js.UndefOr[Double] = js.undefined
    
    /** Left margin of the text.
      * @Default {5}
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /** Right margin of the text.
      * @Default {5}
      */
    var right: js.UndefOr[Double] = js.undefined
    
    /** Top margin of the text.
      * @Default {5}
      */
    var top: js.UndefOr[Double] = js.undefined
  }
  object SeriesMarkerDataLabelMargin {
    
    inline def apply(): SeriesMarkerDataLabelMargin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarkerDataLabelMargin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesMarkerDataLabelMargin] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait SeriesMarkerDataLabelOffset extends StObject {
    
    /** X value or horizontal offset to position the labels in chart.
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Y value or vertical offset to position the labels.
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object SeriesMarkerDataLabelOffset {
    
    inline def apply(): SeriesMarkerDataLabelOffset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarkerDataLabelOffset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesMarkerDataLabelOffset] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait SeriesMarkerSize extends StObject {
    
    /** Height of the marker.
      * @Default {6}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Width of the marker.
      * @Default {6}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesMarkerSize {
    
    inline def apply(): SeriesMarkerSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarkerSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesMarkerSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesOutlierSettings extends StObject {
    
    /** Specifies the shape of the outlier.
      * @Default {circle. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.undefined
    
    /** Options for customizing the size of the outlier shape.
      */
    var size: js.UndefOr[SeriesOutlierSettingsSize] = js.undefined
  }
  object SeriesOutlierSettings {
    
    inline def apply(): SeriesOutlierSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesOutlierSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesOutlierSettings] (val x: Self) extends AnyVal {
      
      inline def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: SeriesOutlierSettingsSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait SeriesOutlierSettingsSize extends StObject {
    
    /** Height of the outlier shape.
      * @Default {6}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Width of the outlier shape.
      * @Default {6}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesOutlierSettingsSize {
    
    inline def apply(): SeriesOutlierSettingsSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesOutlierSettingsSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesOutlierSettingsSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesPoint extends StObject {
    
    /** Options for customizing the border of a point. This is applicable only for column type series and accumulation type series.
      */
    var border: js.UndefOr[SeriesPointsBorder] = js.undefined
    
    /** Close value of the point. Close value is applicable only for financial type series.
      * @Default {null}
      */
    var close: js.UndefOr[Double] = js.undefined
    
    /** Background color of the point. This is applicable only for column type series and accumulation type series.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** High value of the point. High value is applicable only for financial type series, range area series and range column series.
      * @Default {null}
      */
    var high: js.UndefOr[Double] = js.undefined
    
    /** Low value of the point. Low value is applicable only for financial type series, range area series and range column series.
      * @Default {null}
      */
    var low: js.UndefOr[Double] = js.undefined
    
    /** Options for displaying and customizing marker for a data point. Marker contains shapes and/or data labels.
      */
    var marker: js.UndefOr[SeriesPointsMarker] = js.undefined
    
    /** Open value of the point. This is applicable only for financial type series.
      * @Default {null}
      */
    var open: js.UndefOr[Double] = js.undefined
    
    /** To show/hide the intermediate summary from the last intermediate point.
      * @Default {false}
      */
    var showIntermediateSum: js.UndefOr[Boolean] = js.undefined
    
    /** To show/hide the total summary of the waterfall series.
      * @Default {false}
      */
    var showTotalSum: js.UndefOr[Boolean] = js.undefined
    
    /** Size of a bubble in the bubble series. This is applicable only for the bubble series.
      * @Default {null}
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Datalabel text for the point.
      * @Default {null}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Enables or disables the visibility of legend item.
      * @Default {visible}
      */
    var visibleOnLegend: js.UndefOr[String] = js.undefined
    
    /** X value of the point.
      * @Default {null}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Y value of the point.
      * @Default {null}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object SeriesPoint {
    
    inline def apply(): SeriesPoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesPoint] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: SeriesPointsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setMarker(value: SeriesPointsMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      inline def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setShowIntermediateSum(value: Boolean): Self = StObject.set(x, "showIntermediateSum", value.asInstanceOf[js.Any])
      
      inline def setShowIntermediateSumUndefined: Self = StObject.set(x, "showIntermediateSum", js.undefined)
      
      inline def setShowTotalSum(value: Boolean): Self = StObject.set(x, "showTotalSum", value.asInstanceOf[js.Any])
      
      inline def setShowTotalSumUndefined: Self = StObject.set(x, "showTotalSum", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisibleOnLegend(value: String): Self = StObject.set(x, "visibleOnLegend", value.asInstanceOf[js.Any])
      
      inline def setVisibleOnLegendUndefined: Self = StObject.set(x, "visibleOnLegend", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait SeriesPointsBorder extends StObject {
    
    /** Border color of the point.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the point.
      * @Default {null}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesPointsBorder {
    
    inline def apply(): SeriesPointsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesPointsBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesPointsMarker extends StObject {
    
    /** Options for customizing the border of the marker shape.
      */
    var border: js.UndefOr[SeriesPointsMarkerBorder] = js.undefined
    
    /** Options for displaying and customizing data label.
      */
    var dataLabel: js.UndefOr[SeriesPointsMarkerDataLabel] = js.undefined
    
    /** Color of the marker shape.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** The URL for the Image that is to be displayed as marker. In order to display image as marker, set series.marker.shape as â€˜imageâ€™.
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** Opacity of the marker.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the shape of the marker.
      * @Default {circle. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.undefined
    
    /** Options for customizing the size of the marker shape.
      */
    var size: js.UndefOr[SeriesPointsMarkerSize] = js.undefined
    
    /** Controls the visibility of the marker shape.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object SeriesPointsMarker {
    
    inline def apply(): SeriesPointsMarker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsMarker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesPointsMarker] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: SeriesPointsMarkerBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setDataLabel(value: SeriesPointsMarkerDataLabel): Self = StObject.set(x, "dataLabel", value.asInstanceOf[js.Any])
      
      inline def setDataLabelUndefined: Self = StObject.set(x, "dataLabel", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: SeriesPointsMarkerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait SeriesPointsMarkerBorder extends StObject {
    
    /** Border color of the marker shape.
      * @Default {white}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the marker shape.
      * @Default {3}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesPointsMarkerBorder {
    
    inline def apply(): SeriesPointsMarkerBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsMarkerBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesPointsMarkerBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesPointsMarkerDataLabel extends StObject {
    
    /** Angle of the data label in degrees. Only the text gets rotated, whereas the background and border does not rotate.
      * @Default {null}
      */
    var angle: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the border of the data label.
      */
    var border: js.UndefOr[SeriesPointsMarkerDataLabelBorder] = js.undefined
    
    /** Options for displaying and customizing the line that connects point and data label.
      */
    var connectorLine: js.UndefOr[SeriesPointsMarkerDataLabelConnectorLine] = js.undefined
    
    /** Background color of the data label.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the data label font.
      */
    var font: js.UndefOr[SeriesPointsMarkerDataLabelFont] = js.undefined
    
    /** Horizontal alignment of the data label.
      * @Default {center}
      */
    var horizontalTextAlignment: js.UndefOr[HorizontalTextAlignment | String] = js.undefined
    
    /** Margin of the text to its background shape. The size of the background shape increases based on the margin applied to its text.
      */
    var margin: js.UndefOr[SeriesPointsMarkerDataLabelMargin] = js.undefined
    
    /** Moves the label vertically by specified offset.
      * @Default {0}
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /** Opacity of the data label.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Background shape of the data label.
      * @Default {No shape is rendered by default, so its value is â€˜noneâ€™. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.undefined
    
    /** Custom template to format the data label content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Specifies the position of the data label. This property can be used only for the series such as column, bar, stacked column, stacked bar, 100% stacked column, 100% stacked bar,
      * candle and OHLC.
      * @Default {top. See TextPosition}
      */
    var textPosition: js.UndefOr[TextPosition | String] = js.undefined
    
    /** Vertical alignment of the data label.
      * @Default {'center'}
      */
    var verticalTextAlignment: js.UndefOr[VerticalTextAlignment | String] = js.undefined
    
    /** Controls the visibility of the data labels.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object SeriesPointsMarkerDataLabel {
    
    inline def apply(): SeriesPointsMarkerDataLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsMarkerDataLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesPointsMarkerDataLabel] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setBorder(value: SeriesPointsMarkerDataLabelBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setConnectorLine(value: SeriesPointsMarkerDataLabelConnectorLine): Self = StObject.set(x, "connectorLine", value.asInstanceOf[js.Any])
      
      inline def setConnectorLineUndefined: Self = StObject.set(x, "connectorLine", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: SeriesPointsMarkerDataLabelFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHorizontalTextAlignment(value: HorizontalTextAlignment | String): Self = StObject.set(x, "horizontalTextAlignment", value.asInstanceOf[js.Any])
      
      inline def setHorizontalTextAlignmentUndefined: Self = StObject.set(x, "horizontalTextAlignment", js.undefined)
      
      inline def setMargin(value: SeriesPointsMarkerDataLabelMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTextPosition(value: TextPosition | String): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
      
      inline def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
      
      inline def setVerticalTextAlignment(value: VerticalTextAlignment | String): Self = StObject.set(x, "verticalTextAlignment", value.asInstanceOf[js.Any])
      
      inline def setVerticalTextAlignmentUndefined: Self = StObject.set(x, "verticalTextAlignment", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait SeriesPointsMarkerDataLabelBorder extends StObject {
    
    /** Border color of the data label.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the data label.
      * @Default {0.1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesPointsMarkerDataLabelBorder {
    
    inline def apply(): SeriesPointsMarkerDataLabelBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsMarkerDataLabelBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesPointsMarkerDataLabelBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesPointsMarkerDataLabelConnectorLine extends StObject {
    
    /** Specifies when the connector has to be drawn as Bezier curve or straight line. This is applicable only for Pie and Doughnut chart types.
      * @Default {line. See ConnectorLineType}
      */
    var `type`: js.UndefOr[ConnectorLineType | String] = js.undefined
    
    /** Width of the connector.
      * @Default {0.5}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesPointsMarkerDataLabelConnectorLine {
    
    inline def apply(): SeriesPointsMarkerDataLabelConnectorLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsMarkerDataLabelConnectorLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesPointsMarkerDataLabelConnectorLine] (val x: Self) extends AnyVal {
      
      inline def setType(value: ConnectorLineType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesPointsMarkerDataLabelFont extends StObject {
    
    /** Font family of the data label.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of the data label.
      * @Default {normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the data label.
      * @Default {regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity of the text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the data label.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object SeriesPointsMarkerDataLabelFont {
    
    inline def apply(): SeriesPointsMarkerDataLabelFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsMarkerDataLabelFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesPointsMarkerDataLabelFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait SeriesPointsMarkerDataLabelMargin extends StObject {
    
    /** Bottom margin of the text.
      * @Default {5}
      */
    var bottom: js.UndefOr[Double] = js.undefined
    
    /** Left margin of the text.
      * @Default {5}
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /** Right margin of the text.
      * @Default {5}
      */
    var right: js.UndefOr[Double] = js.undefined
    
    /** Top margin of the text.
      * @Default {5}
      */
    var top: js.UndefOr[Double] = js.undefined
  }
  object SeriesPointsMarkerDataLabelMargin {
    
    inline def apply(): SeriesPointsMarkerDataLabelMargin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsMarkerDataLabelMargin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesPointsMarkerDataLabelMargin] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait SeriesPointsMarkerSize extends StObject {
    
    /** Height of the marker.
      * @Default {6}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Width of the marker.
      * @Default {6}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesPointsMarkerSize {
    
    inline def apply(): SeriesPointsMarkerSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsMarkerSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesPointsMarkerSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesRegionClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** series - Instance of the selected series    seriesIndex - Index of the selected series
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SeriesRegionClickEventArgs {
    
    inline def apply(): SeriesRegionClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesRegionClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesRegionClickEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait SeriesRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** series - Instance of the series which is about to get rendered
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SeriesRenderingEventArgs {
    
    inline def apply(): SeriesRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesRenderingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesRenderingEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait SeriesSelectionSettings extends StObject {
    
    /** Options for customizing the border of series on selection.
      */
    var border: js.UndefOr[SeriesSelectionSettingsBorder] = js.undefined
    
    /** Color of the series/point on selection.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Custom pattern for the series on selection.
      */
    var customPattern: js.UndefOr[String] = js.undefined
    
    /** Enables/disables the ability to select a series/data point interactively.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether series or data point has to be selected.
      * @Default {series. See Mode}
      */
    var mode: js.UndefOr[Mode | String] = js.undefined
    
    /** Opacity of the series/point on selection.
      * @Default {0.6}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the pattern for the series/point on selection.
      * @Default {none. See Pattern}
      */
    var pattern: js.UndefOr[String] = js.undefined
    
    /** Specifies the drawn rectangle type.
      * @Default {xy}
      */
    var rangeType: js.UndefOr[RangeType | String] = js.undefined
    
    /** Specifies the type of selection.
      * @Default {single}
      */
    var `type`: js.UndefOr[SelectionType | String] = js.undefined
  }
  object SeriesSelectionSettings {
    
    inline def apply(): SeriesSelectionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesSelectionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesSelectionSettings] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: SeriesSelectionSettingsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCustomPattern(value: String): Self = StObject.set(x, "customPattern", value.asInstanceOf[js.Any])
      
      inline def setCustomPatternUndefined: Self = StObject.set(x, "customPattern", js.undefined)
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setMode(value: Mode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setRangeType(value: RangeType | String): Self = StObject.set(x, "rangeType", value.asInstanceOf[js.Any])
      
      inline def setRangeTypeUndefined: Self = StObject.set(x, "rangeType", js.undefined)
      
      inline def setType(value: SelectionType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SeriesSelectionSettingsBorder extends StObject {
    
    /** Border color of the series/point on selection.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the series/point on selection.
      * @Default {2}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object SeriesSelectionSettingsBorder {
    
    inline def apply(): SeriesSelectionSettingsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesSelectionSettingsBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesSelectionSettingsBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesTooltip extends StObject {
    
    /** Options for customizing the border of the tooltip.
      */
    var border: js.UndefOr[SeriesTooltipBorder] = js.undefined
    
    /** Specifies the duration, the tooltip has to be displayed.
      * @Default {500ms}
      */
    var duration: js.UndefOr[String] = js.undefined
    
    /** Enables/disables the animation of the tooltip when moving from one point to another.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Background color of the tooltip.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Format of the tooltip content.
      * @Default {#point.x# : #point.y#}
      */
    var format: js.UndefOr[String] = js.undefined
    
    /** Opacity of the tooltip.
      * @Default {0.95}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Customize the corner radius of the tooltip rectangle.
      * @Default {0}
      */
    var rx: js.UndefOr[Double] = js.undefined
    
    /** Customize the corner radius of the tooltip rectangle.
      * @Default {0}
      */
    var ry: js.UndefOr[Double] = js.undefined
    
    /** Custom template to format the tooltip content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Controls the visibility of the tooltip.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object SeriesTooltip {
    
    inline def apply(): SeriesTooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesTooltip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesTooltip] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: SeriesTooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait SeriesTooltipBorder extends StObject {
    
    /** Border Color of the tooltip.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border Width of the tooltip.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesTooltipBorder {
    
    inline def apply(): SeriesTooltipBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesTooltipBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesTooltipBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesTrendline extends StObject {
    
    /** Past trends of the current series.
      * @Default {0}
      */
    var backwardForecast: js.UndefOr[Double] = js.undefined
    
    /** Pattern of dashes and gaps used to stroke the trendline.
      */
    var dashArray: js.UndefOr[String] = js.undefined
    
    /** Fill color of the trendlines.
      * @Default {#0000FF}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Future trends of the current series.
      * @Default {0}
      */
    var forwardForecast: js.UndefOr[Double] = js.undefined
    
    /** Specifies the trendline intercept value
      * @Default {null}
      */
    var intercept: js.UndefOr[Double] = js.undefined
    
    /** Name for the trendlines that is to be displayed in legend text.
      * @Default {Trendline}
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Opacity of the trendline.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the moving average starting period  value.
      * @Default {2}
      */
    var period: js.UndefOr[Double] = js.undefined
    
    /** Specifies the order of polynomial trendlines.
      * @Default {0}
      */
    var polynomialOrder: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the trendline tooltip
      */
    var tooltip: js.UndefOr[SeriesTrendlinesTooltip] = js.undefined
    
    /** Specifies the type of trendline for the series.
      * @Default {linear. See TrendlinesType}
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Show/hides the trendline.
      */
    var visibility: js.UndefOr[Boolean] = js.undefined
    
    /** Show/hides the trendline legend.
      * @Default {visible}
      */
    var visibleOnLegend: js.UndefOr[String] = js.undefined
    
    /** Width of the trendlines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesTrendline {
    
    inline def apply(): SeriesTrendline = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesTrendline]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesTrendline] (val x: Self) extends AnyVal {
      
      inline def setBackwardForecast(value: Double): Self = StObject.set(x, "backwardForecast", value.asInstanceOf[js.Any])
      
      inline def setBackwardForecastUndefined: Self = StObject.set(x, "backwardForecast", js.undefined)
      
      inline def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setForwardForecast(value: Double): Self = StObject.set(x, "forwardForecast", value.asInstanceOf[js.Any])
      
      inline def setForwardForecastUndefined: Self = StObject.set(x, "forwardForecast", js.undefined)
      
      inline def setIntercept(value: Double): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
      
      inline def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      inline def setPolynomialOrder(value: Double): Self = StObject.set(x, "polynomialOrder", value.asInstanceOf[js.Any])
      
      inline def setPolynomialOrderUndefined: Self = StObject.set(x, "polynomialOrder", js.undefined)
      
      inline def setTooltip(value: SeriesTrendlinesTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setVisibleOnLegend(value: String): Self = StObject.set(x, "visibleOnLegend", value.asInstanceOf[js.Any])
      
      inline def setVisibleOnLegendUndefined: Self = StObject.set(x, "visibleOnLegend", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SeriesTrendlinesTooltip extends StObject {
    
    /** Options for customizing the border of the trendline tooltip.
      */
    var border: js.UndefOr[SeriesTrendlinesTooltipBorder] = js.undefined
    
    /** Specifies the duration of the trendline tooltip to be displayed.
      * @Default {500ms}
      */
    var duration: js.UndefOr[String] = js.undefined
    
    /** Enables/disables the animation of the trendline tooltip when moving from one point to other.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Background color of the trendline tooltip.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Format of the trendline tooltip content.
      * @Default {#point.x# : #point.y#}
      */
    var format: js.UndefOr[String] = js.undefined
    
    /** Opacity of the trendline tooltip.
      * @Default {0.5}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Customize the corner radius of the trendline tooltip rectangle.
      * @Default {0}
      */
    var rx: js.UndefOr[Double] = js.undefined
    
    /** Customize the corner radius of the trendline tooltip rectangle.
      * @Default {0}
      */
    var ry: js.UndefOr[Double] = js.undefined
  }
  object SeriesTrendlinesTooltip {
    
    inline def apply(): SeriesTrendlinesTooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesTrendlinesTooltip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesTrendlinesTooltip] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: SeriesTrendlinesTooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    }
  }
  
  trait SeriesTrendlinesTooltipBorder extends StObject {
    
    /** Specify the Border color of the  trendline tooltip.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the trendline tooltip.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SeriesTrendlinesTooltipBorder {
    
    inline def apply(): SeriesTrendlinesTooltipBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesTrendlinesTooltipBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeriesTrendlinesTooltipBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Size extends StObject {
    
    /** Height of the Chart. Height can be specified in either pixel or percentage.
      * @Default {'450'}
      */
    var height: js.UndefOr[String] = js.undefined
    
    /** Width of the Chart. Width can be specified in either pixel or percentage.
      * @Default {'450'}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object Size {
    
    inline def apply(): Size = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SubTitleRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - location of the subTitle text    subtitle - text of the subtitle    size - Size of the Subtitle text
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SubTitleRenderingEventArgs {
    
    inline def apply(): SubTitleRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubTitleRenderingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubTitleRenderingEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait SymbolRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - Instance that holds the location of marker symbol    style - Options to customize the marker style such as color, border and size
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SymbolRenderingEventArgs {
    
    inline def apply(): SymbolRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SymbolRenderingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SymbolRenderingEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait Title extends StObject {
    
    /** Background color for the chart title.
      * @Default {transparent}
      */
    var background: js.UndefOr[String] = js.undefined
    
    /** Options to customize the border of the title.
      */
    var border: js.UndefOr[TitleBorder] = js.undefined
    
    /** Specifies whether to trim the Chart Title when the width of the title exceeds the maximumWidth.
      * @Default {false}
      */
    var enableTrim: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the font of Chart title.
      */
    var font: js.UndefOr[TitleFont] = js.undefined
    
    /** Maximum width of the title, when the title exceeds this width, the title gets trimmed, when enableTrim is true.
      * @Default {auto}
      */
    var maximumWidth: js.UndefOr[String] = js.undefined
    
    /** Options to customize the sub title of Chart.
      */
    var subTitle: js.UndefOr[TitleSubTitle] = js.undefined
    
    /** Text to be displayed in Chart title.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Alignment of the title text.
      * @Default {Center. See TextAlignment}
      */
    var textAlignment: js.UndefOr[Alignment | String] = js.undefined
    
    /** Specifies the action taken when the Chart width is more than the titleWidth.
      * @Default {trim.}
      */
    var textOverflow: js.UndefOr[TextOverflow | String] = js.undefined
    
    /** Controls the visibility of the Chart title
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object Title {
    
    inline def apply(): Title = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Title]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Title] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBorder(value: TitleBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      inline def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      inline def setFont(value: TitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setMaximumWidth(value: String): Self = StObject.set(x, "maximumWidth", value.asInstanceOf[js.Any])
      
      inline def setMaximumWidthUndefined: Self = StObject.set(x, "maximumWidth", js.undefined)
      
      inline def setSubTitle(value: TitleSubTitle): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlignment(value: Alignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait TitleBorder extends StObject {
    
    /** color of the title border.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** opacity of the title border.
      * @Default {0.8}
      */
    var cornerRadius: js.UndefOr[Double] = js.undefined
    
    /** opacity of the title border.
      * @Default {0.8}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Width of the title border.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object TitleBorder {
    
    inline def apply(): TitleBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TitleBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait TitleFont extends StObject {
    
    /** Font family for Chart title.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style for Chart title.
      * @Default {Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight for Chart title.
      * @Default {Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity of the Chart title.
      * @Default {0.5}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size for Chart title.
      * @Default {20px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object TitleFont {
    
    inline def apply(): TitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TitleFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait TitleRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - Option to customize the title location in pixels    size - Read-only option to find the size of the title    title - Use this option to add custom text in title
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TitleRenderingEventArgs {
    
    inline def apply(): TitleRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleRenderingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TitleRenderingEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait TitleSubTitle extends StObject {
    
    /** Background color for the chart subtitle.
      * @Default {transparent}
      */
    var background: js.UndefOr[String] = js.undefined
    
    /** Options to customize the border of the title.
      */
    var border: js.UndefOr[TitleSubTitleBorder] = js.undefined
    
    /** Specifies whether to trim the Chart SubTitle when the width of the Subtitle exceeds the maximumWidth.
      * @Default {false}
      */
    var enableTrim: js.UndefOr[Boolean] = js.undefined
    
    /** Options for customizing the font of sub title.
      */
    var font: js.UndefOr[TitleSubTitleFont] = js.undefined
    
    /** Maximum width of the Subtitle, when the Subtitle exceeds this width, the Subtitle gets trimmed, when enableTrim is true.
      * @Default {auto}
      */
    var maximumWidth: js.UndefOr[String] = js.undefined
    
    /** Text to be displayed in sub title.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Alignment of sub title text.
      * @Default {far. See TextAlignment}
      */
    var textAlignment: js.UndefOr[Alignment | String] = js.undefined
    
    /** Specifies the action taken when the Chart width is more than the SubTitleWidth.
      * @Default {trim.}
      */
    var textOverflow: js.UndefOr[TextOverflow | String] = js.undefined
    
    /** Controls the visibility of the Chart SubTitle
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object TitleSubTitle {
    
    inline def apply(): TitleSubTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleSubTitle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TitleSubTitle] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBorder(value: TitleSubTitleBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      inline def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      inline def setFont(value: TitleSubTitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setMaximumWidth(value: String): Self = StObject.set(x, "maximumWidth", value.asInstanceOf[js.Any])
      
      inline def setMaximumWidthUndefined: Self = StObject.set(x, "maximumWidth", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlignment(value: Alignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait TitleSubTitleBorder extends StObject {
    
    /** color of the subtitle border.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** opacity of the subtitle border.
      * @Default {0.8}
      */
    var cornerRadius: js.UndefOr[Double] = js.undefined
    
    /** opacity of the subtitle border.
      * @Default {0.8}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Width of the subtitle border.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object TitleSubTitleBorder {
    
    inline def apply(): TitleSubTitleBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleSubTitleBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TitleSubTitleBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait TitleSubTitleFont extends StObject {
    
    /** Font family of sub title.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style for sub title.
      * @Default {Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight for sub title.
      * @Default {Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity of the sub title.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size for sub title.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object TitleSubTitleFont {
    
    inline def apply(): TitleSubTitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleSubTitleFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TitleSubTitleFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ToolTipInitializeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** currentText - Text to be displayed in tooltip. Set this option to customize the text displayed in tooltip    pointIndex - Index of the point on which mouse is hovered
      * seriesIndex - Index of the series in series collection whose point is hovered by mouse
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ToolTipInitializeEventArgs {
    
    inline def apply(): ToolTipInitializeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolTipInitializeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolTipInitializeEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait TrackAxisToolTipEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - Location of the crosshair label in pixels    axisIndex - Index of the axis for which crosshair label is displayed    crossAxis - Instance of the chart axis object
      * for which cross hair label is displayed    currentTrackText - Text to be displayed in crosshair label. Use this option to add custom text in crosshair label
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TrackAxisToolTipEventArgs {
    
    inline def apply(): TrackAxisToolTipEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrackAxisToolTipEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrackAxisToolTipEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait TrackToolTipEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - Location of the trackball tooltip in pixels    pointIndex - Index of the point for which trackball tooltip is displayed    seriesIndex - Index of the series in
      * series collection    currentText - Text to be displayed in trackball tooltip. Use this option to add custom text in trackball tooltip    series - Instance of the series object
      * for which trackball tooltip is displayed.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TrackToolTipEventArgs {
    
    inline def apply(): TrackToolTipEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrackToolTipEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrackToolTipEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait TrendlineRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** trendlines - Trendline Object    series - Series data of the chart    forwardForecast - Forward Forecast value for the trendline    backwardForecast - Backward Forecast value
      * for the trendline
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TrendlineRenderingEventArgs {
    
    inline def apply(): TrendlineRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrendlineRenderingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrendlineRenderingEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait ZoomedEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Selected data collection of object
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ZoomedEventArgs {
    
    inline def apply(): ZoomedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomedEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomedEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait Zooming extends StObject {
    
    /** Enables or disables zooming.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Enable or disables the differed zooming. When it is enabled, chart is updated only on mouse up action while zooming and panning.
      * @Default {false}
      */
    var enableDeferredZoom: js.UndefOr[Boolean] = js.undefined
    
    /** Enables/disables the ability to zoom the chart on moving the mouse wheel.
      * @Default {false}
      */
    var enableMouseWheel: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables pinch zooming.
      * @Default {true}
      */
    var enablePinching: js.UndefOr[Boolean] = js.undefined
    
    /** Toggles the visibility of the scrollbar, which will be displayed while zooming.
      * @Default {false}
      */
    var enableScrollbar: js.UndefOr[Boolean] = js.undefined
    
    /** To display user specified buttons in zooming toolbar.
      * @Default {[zoomIn, zoomOut, zoom, pan, reset]}
      */
    var toolbarItems: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies whether to allow zooming the chart vertically or horizontally or in both ways.
      * @Default {'x,y'}
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Zooming {
    
    inline def apply(): Zooming = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Zooming]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Zooming] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableDeferredZoom(value: Boolean): Self = StObject.set(x, "enableDeferredZoom", value.asInstanceOf[js.Any])
      
      inline def setEnableDeferredZoomUndefined: Self = StObject.set(x, "enableDeferredZoom", js.undefined)
      
      inline def setEnableMouseWheel(value: Boolean): Self = StObject.set(x, "enableMouseWheel", value.asInstanceOf[js.Any])
      
      inline def setEnableMouseWheelUndefined: Self = StObject.set(x, "enableMouseWheel", js.undefined)
      
      inline def setEnablePinching(value: Boolean): Self = StObject.set(x, "enablePinching", value.asInstanceOf[js.Any])
      
      inline def setEnablePinchingUndefined: Self = StObject.set(x, "enablePinching", js.undefined)
      
      inline def setEnableScrollbar(value: Boolean): Self = StObject.set(x, "enableScrollbar", value.asInstanceOf[js.Any])
      
      inline def setEnableScrollbarUndefined: Self = StObject.set(x, "enableScrollbar", js.undefined)
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setToolbarItems(value: js.Array[Any]): Self = StObject.set(x, "toolbarItems", value.asInstanceOf[js.Any])
      
      inline def setToolbarItemsUndefined: Self = StObject.set(x, "toolbarItems", js.undefined)
      
      inline def setToolbarItemsVarargs(value: Any*): Self = StObject.set(x, "toolbarItems", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
