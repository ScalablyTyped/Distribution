package typings.ejWebAll.global.ej.datavisualization

import typings.ejWebAll.JQuery
import typings.ejWebAll.ej.Model
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.Chart")
@js.native
class Chart protected ()
  extends StObject
     with typings.ejWebAll.ej.datavisualization.Chart {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}
object Chart {
  
  @JSGlobal("ej.datavisualization.Chart")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.datavisualization.Chart.Alignment")
  @js.native
  object Alignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.Alignment & Double] = js.native
    
    /* 0 */ val Center: typings.ejWebAll.ej.datavisualization.Chart.Alignment.Center & Double = js.native
    
    /* 2 */ val Far: typings.ejWebAll.ej.datavisualization.Chart.Alignment.Far & Double = js.native
    
    /* 1 */ val Near: typings.ejWebAll.ej.datavisualization.Chart.Alignment.Near & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.AxisOrientation")
  @js.native
  object AxisOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.AxisOrientation & Double] = js.native
    
    /* 0 */ val Horizontal: typings.ejWebAll.ej.datavisualization.Chart.AxisOrientation.Horizontal & Double = js.native
    
    /* 1 */ val Vertical: typings.ejWebAll.ej.datavisualization.Chart.AxisOrientation.Vertical & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.ColumnFacet")
  @js.native
  object ColumnFacet extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.ColumnFacet & Double] = js.native
    
    /* 1 */ val Cylinder: typings.ejWebAll.ej.datavisualization.Chart.ColumnFacet.Cylinder & Double = js.native
    
    /* 0 */ val Rectangle: typings.ejWebAll.ej.datavisualization.Chart.ColumnFacet.Rectangle & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.ConnectorLineType")
  @js.native
  object ConnectorLineType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.ConnectorLineType & Double] = js.native
    
    /* 1 */ val Bezier: typings.ejWebAll.ej.datavisualization.Chart.ConnectorLineType.Bezier & Double = js.native
    
    /* 0 */ val Line: typings.ejWebAll.ej.datavisualization.Chart.ConnectorLineType.Line & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.CoordinateUnit")
  @js.native
  object CoordinateUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.CoordinateUnit & Double] = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.datavisualization.Chart.CoordinateUnit.None & Double = js.native
    
    /* 1 */ val Pixels: typings.ejWebAll.ej.datavisualization.Chart.CoordinateUnit.Pixels & Double = js.native
    
    /* 2 */ val Points: typings.ejWebAll.ej.datavisualization.Chart.CoordinateUnit.Points & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.CrosshairMode")
  @js.native
  object CrosshairMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.CrosshairMode & Double] = js.native
    
    /* 0 */ val Float: typings.ejWebAll.ej.datavisualization.Chart.CrosshairMode.Float & Double = js.native
    
    /* 1 */ val Grouping: typings.ejWebAll.ej.datavisualization.Chart.CrosshairMode.Grouping & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.CrosshairType")
  @js.native
  object CrosshairType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.CrosshairType & Double] = js.native
    
    /* 0 */ val Crosshair: typings.ejWebAll.ej.datavisualization.Chart.CrosshairType.Crosshair & Double = js.native
    
    /* 1 */ val Trackball: typings.ejWebAll.ej.datavisualization.Chart.CrosshairType.Trackball & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.DrawType")
  @js.native
  object DrawType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.DrawType & Double] = js.native
    
    /* 1 */ val Area: typings.ejWebAll.ej.datavisualization.Chart.DrawType.Area & Double = js.native
    
    /* 2 */ val Column: typings.ejWebAll.ej.datavisualization.Chart.DrawType.Column & Double = js.native
    
    /* 0 */ val Line: typings.ejWebAll.ej.datavisualization.Chart.DrawType.Line & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.EdgeLabelPlacement")
  @js.native
  object EdgeLabelPlacement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.EdgeLabelPlacement & Double] = js.native
    
    /* 2 */ val Hide: typings.ejWebAll.ej.datavisualization.Chart.EdgeLabelPlacement.Hide & Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.datavisualization.Chart.EdgeLabelPlacement.None & Double = js.native
    
    /* 1 */ val Shift: typings.ejWebAll.ej.datavisualization.Chart.EdgeLabelPlacement.Shift & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.EmptyPointMode")
  @js.native
  object EmptyPointMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.EmptyPointMode & Double] = js.native
    
    /* 2 */ val Average: typings.ejWebAll.ej.datavisualization.Chart.EmptyPointMode.Average & Double = js.native
    
    /* 0 */ val Gap: typings.ejWebAll.ej.datavisualization.Chart.EmptyPointMode.Gap & Double = js.native
    
    /* 1 */ val Zero: typings.ejWebAll.ej.datavisualization.Chart.EmptyPointMode.Zero & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.ErrorBarDirection")
  @js.native
  object ErrorBarDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.ErrorBarDirection & Double] = js.native
    
    /* 0 */ val Both: typings.ejWebAll.ej.datavisualization.Chart.ErrorBarDirection.Both & Double = js.native
    
    /* 2 */ val Minus: typings.ejWebAll.ej.datavisualization.Chart.ErrorBarDirection.Minus & Double = js.native
    
    /* 1 */ val Plus: typings.ejWebAll.ej.datavisualization.Chart.ErrorBarDirection.Plus & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.ErrorBarMode")
  @js.native
  object ErrorBarMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.ErrorBarMode & Double] = js.native
    
    /* 0 */ val Both: typings.ejWebAll.ej.datavisualization.Chart.ErrorBarMode.Both & Double = js.native
    
    /* 2 */ val Horizontal: typings.ejWebAll.ej.datavisualization.Chart.ErrorBarMode.Horizontal & Double = js.native
    
    /* 1 */ val Vertical: typings.ejWebAll.ej.datavisualization.Chart.ErrorBarMode.Vertical & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.ErrorBarType")
  @js.native
  object ErrorBarType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.ErrorBarType & Double] = js.native
    
    /* 0 */ val FixedValue: typings.ejWebAll.ej.datavisualization.Chart.ErrorBarType.FixedValue & Double = js.native
    
    /* 1 */ val Percentage: typings.ejWebAll.ej.datavisualization.Chart.ErrorBarType.Percentage & Double = js.native
    
    /* 2 */ val StandardDeviation: typings.ejWebAll.ej.datavisualization.Chart.ErrorBarType.StandardDeviation & Double = js.native
    
    /* 3 */ val StandardError: typings.ejWebAll.ej.datavisualization.Chart.ErrorBarType.StandardError & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.ExportingMode")
  @js.native
  object ExportingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.ExportingMode & Double] = js.native
    
    /* 1 */ val ClientSide: typings.ejWebAll.ej.datavisualization.Chart.ExportingMode.ClientSide & Double = js.native
    
    /* 0 */ val ServerSide: typings.ejWebAll.ej.datavisualization.Chart.ExportingMode.ServerSide & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.ExportingOrientation")
  @js.native
  object ExportingOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.ExportingOrientation & Double] = js.native
    
    /* 1 */ val Landscape: typings.ejWebAll.ej.datavisualization.Chart.ExportingOrientation.Landscape & Double = js.native
    
    /* 0 */ val Portrait: typings.ejWebAll.ej.datavisualization.Chart.ExportingOrientation.Portrait & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.ExportingType")
  @js.native
  object ExportingType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.ExportingType & Double] = js.native
    
    /* 3 */ val DOCX: typings.ejWebAll.ej.datavisualization.Chart.ExportingType.DOCX & Double = js.native
    
    /* 1 */ val JPG: typings.ejWebAll.ej.datavisualization.Chart.ExportingType.JPG & Double = js.native
    
    /* 2 */ val PDF: typings.ejWebAll.ej.datavisualization.Chart.ExportingType.PDF & Double = js.native
    
    /* 0 */ val PNG: typings.ejWebAll.ej.datavisualization.Chart.ExportingType.PNG & Double = js.native
    
    /* 5 */ val SVG: typings.ejWebAll.ej.datavisualization.Chart.ExportingType.SVG & Double = js.native
    
    /* 4 */ val XLSX: typings.ejWebAll.ej.datavisualization.Chart.ExportingType.XLSX & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.FontStyle & Double] = js.native
    
    /* 1 */ val Italic: typings.ejWebAll.ej.datavisualization.Chart.FontStyle.Italic & Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.datavisualization.Chart.FontStyle.Normal & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.FontWeight & Double] = js.native
    
    /* 1 */ val Bold: typings.ejWebAll.ej.datavisualization.Chart.FontWeight.Bold & Double = js.native
    
    /* 2 */ val Lighter: typings.ejWebAll.ej.datavisualization.Chart.FontWeight.Lighter & Double = js.native
    
    /* 0 */ val Regular: typings.ejWebAll.ej.datavisualization.Chart.FontWeight.Regular & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.HorizontalAlignment")
  @js.native
  object HorizontalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.HorizontalAlignment & Double] = js.native
    
    /* 0 */ val Left: typings.ejWebAll.ej.datavisualization.Chart.HorizontalAlignment.Left & Double = js.native
    
    /* 2 */ val Middle: typings.ejWebAll.ej.datavisualization.Chart.HorizontalAlignment.Middle & Double = js.native
    
    /* 1 */ val Right: typings.ejWebAll.ej.datavisualization.Chart.HorizontalAlignment.Right & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.HorizontalTextAlignment")
  @js.native
  object HorizontalTextAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.HorizontalTextAlignment & Double] = js.native
    
    /* 0 */ val Center: typings.ejWebAll.ej.datavisualization.Chart.HorizontalTextAlignment.Center & Double = js.native
    
    /* 2 */ val Far: typings.ejWebAll.ej.datavisualization.Chart.HorizontalTextAlignment.Far & Double = js.native
    
    /* 1 */ val Near: typings.ejWebAll.ej.datavisualization.Chart.HorizontalTextAlignment.Near & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.IntervalType")
  @js.native
  object IntervalType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.IntervalType & Double] = js.native
    
    /* 0 */ val Days: typings.ejWebAll.ej.datavisualization.Chart.IntervalType.Days & Double = js.native
    
    /* 1 */ val Hours: typings.ejWebAll.ej.datavisualization.Chart.IntervalType.Hours & Double = js.native
    
    /* 3 */ val Milliseconds: typings.ejWebAll.ej.datavisualization.Chart.IntervalType.Milliseconds & Double = js.native
    
    /* 4 */ val Minutes: typings.ejWebAll.ej.datavisualization.Chart.IntervalType.Minutes & Double = js.native
    
    /* 5 */ val Months: typings.ejWebAll.ej.datavisualization.Chart.IntervalType.Months & Double = js.native
    
    /* 2 */ val Seconds: typings.ejWebAll.ej.datavisualization.Chart.IntervalType.Seconds & Double = js.native
    
    /* 6 */ val Years: typings.ejWebAll.ej.datavisualization.Chart.IntervalType.Years & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.LabelAlignment")
  @js.native
  object LabelAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.LabelAlignment & Double] = js.native
    
    /* 2 */ val Center: typings.ejWebAll.ej.datavisualization.Chart.LabelAlignment.Center & Double = js.native
    
    /* 1 */ val Far: typings.ejWebAll.ej.datavisualization.Chart.LabelAlignment.Far & Double = js.native
    
    /* 0 */ val Near: typings.ejWebAll.ej.datavisualization.Chart.LabelAlignment.Near & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.LabelIntersectAction")
  @js.native
  object LabelIntersectAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.LabelIntersectAction & Double] = js.native
    
    /* 6 */ val Hide: typings.ejWebAll.ej.datavisualization.Chart.LabelIntersectAction.Hide & Double = js.native
    
    /* 7 */ val MultipleRows: typings.ejWebAll.ej.datavisualization.Chart.LabelIntersectAction.MultipleRows & Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.datavisualization.Chart.LabelIntersectAction.None & Double = js.native
    
    /* 2 */ val Rotate45: typings.ejWebAll.ej.datavisualization.Chart.LabelIntersectAction.Rotate45 & Double = js.native
    
    /* 1 */ val Rotate90: typings.ejWebAll.ej.datavisualization.Chart.LabelIntersectAction.Rotate90 & Double = js.native
    
    /* 5 */ val Trim: typings.ejWebAll.ej.datavisualization.Chart.LabelIntersectAction.Trim & Double = js.native
    
    /* 3 */ val Wrap: typings.ejWebAll.ej.datavisualization.Chart.LabelIntersectAction.Wrap & Double = js.native
    
    /* 4 */ val WrapByword: typings.ejWebAll.ej.datavisualization.Chart.LabelIntersectAction.WrapByword & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.LabelPlacement")
  @js.native
  object LabelPlacement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.LabelPlacement & Double] = js.native
    
    /* 1 */ val BetweenTicks: typings.ejWebAll.ej.datavisualization.Chart.LabelPlacement.BetweenTicks & Double = js.native
    
    /* 0 */ val OnTicks: typings.ejWebAll.ej.datavisualization.Chart.LabelPlacement.OnTicks & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.LabelPosition")
  @js.native
  object LabelPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.LabelPosition & Double] = js.native
    
    /* 0 */ val Inside: typings.ejWebAll.ej.datavisualization.Chart.LabelPosition.Inside & Double = js.native
    
    /* 1 */ val Outside: typings.ejWebAll.ej.datavisualization.Chart.LabelPosition.Outside & Double = js.native
    
    /* 2 */ val OutsideExtended: typings.ejWebAll.ej.datavisualization.Chart.LabelPosition.OutsideExtended & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.LineCap")
  @js.native
  object LineCap extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.LineCap & Double] = js.native
    
    /* 0 */ val Butt: typings.ejWebAll.ej.datavisualization.Chart.LineCap.Butt & Double = js.native
    
    /* 1 */ val Round: typings.ejWebAll.ej.datavisualization.Chart.LineCap.Round & Double = js.native
    
    /* 2 */ val Square: typings.ejWebAll.ej.datavisualization.Chart.LineCap.Square & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.LineJoin")
  @js.native
  object LineJoin extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.LineJoin & Double] = js.native
    
    /* 1 */ val Bevel: typings.ejWebAll.ej.datavisualization.Chart.LineJoin.Bevel & Double = js.native
    
    /* 2 */ val Miter: typings.ejWebAll.ej.datavisualization.Chart.LineJoin.Miter & Double = js.native
    
    /* 0 */ val Round: typings.ejWebAll.ej.datavisualization.Chart.LineJoin.Round & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.Chart.Locale")
  @js.native
  def Locale: js.Any = js.native
  inline def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.datavisualization.Chart.Mode")
  @js.native
  object Mode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.Mode & Double] = js.native
    
    /* 2 */ val Cluster: typings.ejWebAll.ej.datavisualization.Chart.Mode.Cluster & Double = js.native
    
    /* 1 */ val Point: typings.ejWebAll.ej.datavisualization.Chart.Mode.Point & Double = js.native
    
    /* 3 */ val Range: typings.ejWebAll.ej.datavisualization.Chart.Mode.Range & Double = js.native
    
    /* 0 */ val Series: typings.ejWebAll.ej.datavisualization.Chart.Mode.Series & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.MultiLevelLabelsBorderType")
  @js.native
  object MultiLevelLabelsBorderType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.MultiLevelLabelsBorderType & Double] = js.native
    
    /* 3 */ val Brace: typings.ejWebAll.ej.datavisualization.Chart.MultiLevelLabelsBorderType.Brace & Double = js.native
    
    /* 4 */ val CurlyBrace: typings.ejWebAll.ej.datavisualization.Chart.MultiLevelLabelsBorderType.CurlyBrace & Double = js.native
    
    /* 1 */ val None: typings.ejWebAll.ej.datavisualization.Chart.MultiLevelLabelsBorderType.None & Double = js.native
    
    /* 0 */ val Rectangle: typings.ejWebAll.ej.datavisualization.Chart.MultiLevelLabelsBorderType.Rectangle & Double = js.native
    
    /* 2 */ val WithoutTopAndBottom: typings.ejWebAll.ej.datavisualization.Chart.MultiLevelLabelsBorderType.WithoutTopAndBottom & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.Position & Double] = js.native
    
    /* 3 */ val Bottom: typings.ejWebAll.ej.datavisualization.Chart.Position.Bottom & Double = js.native
    
    /* 0 */ val Left: typings.ejWebAll.ej.datavisualization.Chart.Position.Left & Double = js.native
    
    /* 1 */ val Right: typings.ejWebAll.ej.datavisualization.Chart.Position.Right & Double = js.native
    
    /* 2 */ val Top: typings.ejWebAll.ej.datavisualization.Chart.Position.Top & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.PyramidMode")
  @js.native
  object PyramidMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.PyramidMode & Double] = js.native
    
    /* 0 */ val Linear: typings.ejWebAll.ej.datavisualization.Chart.PyramidMode.Linear & Double = js.native
    
    /* 1 */ val Surface: typings.ejWebAll.ej.datavisualization.Chart.PyramidMode.Surface & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.RadiusMode")
  @js.native
  object RadiusMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.RadiusMode & Double] = js.native
    
    /* 1 */ val Auto: typings.ejWebAll.ej.datavisualization.Chart.RadiusMode.Auto & Double = js.native
    
    /* 0 */ val MinMax: typings.ejWebAll.ej.datavisualization.Chart.RadiusMode.MinMax & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.RangePadding")
  @js.native
  object RangePadding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.RangePadding & Double] = js.native
    
    /* 0 */ val Additional: typings.ejWebAll.ej.datavisualization.Chart.RangePadding.Additional & Double = js.native
    
    /* 2 */ val None: typings.ejWebAll.ej.datavisualization.Chart.RangePadding.None & Double = js.native
    
    /* 1 */ val Normal: typings.ejWebAll.ej.datavisualization.Chart.RangePadding.Normal & Double = js.native
    
    /* 3 */ val Round: typings.ejWebAll.ej.datavisualization.Chart.RangePadding.Round & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.RangeType")
  @js.native
  object RangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.RangeType & Double] = js.native
    
    /* 1 */ val X: typings.ejWebAll.ej.datavisualization.Chart.RangeType.X & Double = js.native
    
    /* 0 */ val XY: typings.ejWebAll.ej.datavisualization.Chart.RangeType.XY & Double = js.native
    
    /* 2 */ val Y: typings.ejWebAll.ej.datavisualization.Chart.RangeType.Y & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.Region")
  @js.native
  object Region extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.Region & Double] = js.native
    
    /* 0 */ val Chart: typings.ejWebAll.ej.datavisualization.Chart.Region.Chart & Double = js.native
    
    /* 1 */ val Series: typings.ejWebAll.ej.datavisualization.Chart.Region.Series & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.SelectionType & Double] = js.native
    
    /* 1 */ val Multiple: typings.ejWebAll.ej.datavisualization.Chart.SelectionType.Multiple & Double = js.native
    
    /* 0 */ val Single: typings.ejWebAll.ej.datavisualization.Chart.SelectionType.Single & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.Shape")
  @js.native
  object Shape extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.Shape & Double] = js.native
    
    /* 3 */ val Circle: typings.ejWebAll.ej.datavisualization.Chart.Shape.Circle & Double = js.native
    
    /* 4 */ val Cross: typings.ejWebAll.ej.datavisualization.Chart.Shape.Cross & Double = js.native
    
    /* 7 */ val Diamond: typings.ejWebAll.ej.datavisualization.Chart.Shape.Diamond & Double = js.native
    
    /* 16 */ val DownArrow: typings.ejWebAll.ej.datavisualization.Chart.Shape.DownArrow & Double = js.native
    
    /* 13 */ val Ellipse: typings.ejWebAll.ej.datavisualization.Chart.Shape.Ellipse & Double = js.native
    
    /* 10 */ val Hexagon: typings.ejWebAll.ej.datavisualization.Chart.Shape.Hexagon & Double = js.native
    
    /* 5 */ val HorizLine: typings.ejWebAll.ej.datavisualization.Chart.Shape.HorizLine & Double = js.native
    
    /* 17 */ val Image: typings.ejWebAll.ej.datavisualization.Chart.Shape.Image & Double = js.native
    
    /* 1 */ val LeftArrow: typings.ejWebAll.ej.datavisualization.Chart.Shape.LeftArrow & Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.datavisualization.Chart.Shape.None & Double = js.native
    
    /* 11 */ val Pentagon: typings.ejWebAll.ej.datavisualization.Chart.Shape.Pentagon & Double = js.native
    
    /* 8 */ val Rectangle: typings.ejWebAll.ej.datavisualization.Chart.Shape.Rectangle & Double = js.native
    
    /* 2 */ val RightArrow: typings.ejWebAll.ej.datavisualization.Chart.Shape.RightArrow & Double = js.native
    
    /* 18 */ val SeriesType: typings.ejWebAll.ej.datavisualization.Chart.Shape.SeriesType & Double = js.native
    
    /* 12 */ val Star: typings.ejWebAll.ej.datavisualization.Chart.Shape.Star & Double = js.native
    
    /* 14 */ val Trapezoid: typings.ejWebAll.ej.datavisualization.Chart.Shape.Trapezoid & Double = js.native
    
    /* 9 */ val Triangle: typings.ejWebAll.ej.datavisualization.Chart.Shape.Triangle & Double = js.native
    
    /* 15 */ val UpArrow: typings.ejWebAll.ej.datavisualization.Chart.Shape.UpArrow & Double = js.native
    
    /* 6 */ val VertLine: typings.ejWebAll.ej.datavisualization.Chart.Shape.VertLine & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.SplineType")
  @js.native
  object SplineType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.SplineType & Double] = js.native
    
    /* 2 */ val Cardinal: typings.ejWebAll.ej.datavisualization.Chart.SplineType.Cardinal & Double = js.native
    
    /* 3 */ val Clamped: typings.ejWebAll.ej.datavisualization.Chart.SplineType.Clamped & Double = js.native
    
    /* 1 */ val Monotonic: typings.ejWebAll.ej.datavisualization.Chart.SplineType.Monotonic & Double = js.native
    
    /* 0 */ val Natural: typings.ejWebAll.ej.datavisualization.Chart.SplineType.Natural & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.SplitMode")
  @js.native
  object SplitMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.SplitMode & Double] = js.native
    
    /* 3 */ val Indexes: typings.ejWebAll.ej.datavisualization.Chart.SplitMode.Indexes & Double = js.native
    
    /* 2 */ val Percentage: typings.ejWebAll.ej.datavisualization.Chart.SplitMode.Percentage & Double = js.native
    
    /* 0 */ val Position: typings.ejWebAll.ej.datavisualization.Chart.SplitMode.Position & Double = js.native
    
    /* 1 */ val Value: typings.ejWebAll.ej.datavisualization.Chart.SplitMode.Value & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.TextAlignment")
  @js.native
  object TextAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.TextAlignment & Double] = js.native
    
    /* 2 */ val MiddleBottom: typings.ejWebAll.ej.datavisualization.Chart.TextAlignment.MiddleBottom & Double = js.native
    
    /* 1 */ val MiddleCenter: typings.ejWebAll.ej.datavisualization.Chart.TextAlignment.MiddleCenter & Double = js.native
    
    /* 0 */ val MiddleTop: typings.ejWebAll.ej.datavisualization.Chart.TextAlignment.MiddleTop & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.TextOverflow")
  @js.native
  object TextOverflow extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.TextOverflow & Double] = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.datavisualization.Chart.TextOverflow.None & Double = js.native
    
    /* 1 */ val Trim: typings.ejWebAll.ej.datavisualization.Chart.TextOverflow.Trim & Double = js.native
    
    /* 2 */ val Wrap: typings.ejWebAll.ej.datavisualization.Chart.TextOverflow.Wrap & Double = js.native
    
    /* 3 */ val WrapAndTrim: typings.ejWebAll.ej.datavisualization.Chart.TextOverflow.WrapAndTrim & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.TextPosition")
  @js.native
  object TextPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.TextPosition & Double] = js.native
    
    /* 1 */ val Bottom: typings.ejWebAll.ej.datavisualization.Chart.TextPosition.Bottom & Double = js.native
    
    /* 2 */ val Middle: typings.ejWebAll.ej.datavisualization.Chart.TextPosition.Middle & Double = js.native
    
    /* 0 */ val Top: typings.ejWebAll.ej.datavisualization.Chart.TextPosition.Top & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.Theme")
  @js.native
  object Theme extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.Theme & Double] = js.native
    
    /* 0 */ val Azure: typings.ejWebAll.ej.datavisualization.Chart.Theme.Azure & Double = js.native
    
    /* 3 */ val Azuredark: typings.ejWebAll.ej.datavisualization.Chart.Theme.Azuredark & Double = js.native
    
    /* 2 */ val FlatDark: typings.ejWebAll.ej.datavisualization.Chart.Theme.FlatDark & Double = js.native
    
    /* 1 */ val FlatLight: typings.ejWebAll.ej.datavisualization.Chart.Theme.FlatLight & Double = js.native
    
    /* 9 */ val GradientDark: typings.ejWebAll.ej.datavisualization.Chart.Theme.GradientDark & Double = js.native
    
    /* 8 */ val GradientLight: typings.ejWebAll.ej.datavisualization.Chart.Theme.GradientLight & Double = js.native
    
    /* 4 */ val Lime: typings.ejWebAll.ej.datavisualization.Chart.Theme.Lime & Double = js.native
    
    /* 5 */ val LimeDark: typings.ejWebAll.ej.datavisualization.Chart.Theme.LimeDark & Double = js.native
    
    /* 6 */ val Saffron: typings.ejWebAll.ej.datavisualization.Chart.Theme.Saffron & Double = js.native
    
    /* 7 */ val SaffronDark: typings.ejWebAll.ej.datavisualization.Chart.Theme.SaffronDark & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.TickLinesPosition")
  @js.native
  object TickLinesPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.TickLinesPosition & Double] = js.native
    
    /* 0 */ val Inside: typings.ejWebAll.ej.datavisualization.Chart.TickLinesPosition.Inside & Double = js.native
    
    /* 1 */ val Outside: typings.ejWebAll.ej.datavisualization.Chart.TickLinesPosition.Outside & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.TrendlinesType")
  @js.native
  object TrendlinesType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.TrendlinesType & Double] = js.native
    
    /* 1 */ val Exponential: typings.ejWebAll.ej.datavisualization.Chart.TrendlinesType.Exponential & Double = js.native
    
    /* 0 */ val Linear: typings.ejWebAll.ej.datavisualization.Chart.TrendlinesType.Linear & Double = js.native
    
    /* 2 */ val Logarithmic: typings.ejWebAll.ej.datavisualization.Chart.TrendlinesType.Logarithmic & Double = js.native
    
    /* 4 */ val Polynomial: typings.ejWebAll.ej.datavisualization.Chart.TrendlinesType.Polynomial & Double = js.native
    
    /* 3 */ val Power: typings.ejWebAll.ej.datavisualization.Chart.TrendlinesType.Power & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.Type & Double] = js.native
    
    /* 0 */ val Area: typings.ejWebAll.ej.datavisualization.Chart.Type.Area & Double = js.native
    
    /* 13 */ val Bar: typings.ejWebAll.ej.datavisualization.Chart.Type.Bar & Double = js.native
    
    /* 5 */ val Bubble: typings.ejWebAll.ej.datavisualization.Chart.Type.Bubble & Double = js.native
    
    /* 12 */ val Candle: typings.ejWebAll.ej.datavisualization.Chart.Type.Candle & Double = js.native
    
    /* 3 */ val Column: typings.ejWebAll.ej.datavisualization.Chart.Type.Column & Double = js.native
    
    /* 25 */ val Doughnut: typings.ejWebAll.ej.datavisualization.Chart.Type.Doughnut & Double = js.native
    
    /* 24 */ val Funnel: typings.ejWebAll.ej.datavisualization.Chart.Type.Funnel & Double = js.native
    
    /* 10 */ val HiLo: typings.ejWebAll.ej.datavisualization.Chart.Type.HiLo & Double = js.native
    
    /* 11 */ val HiLoOpenClose: typings.ejWebAll.ej.datavisualization.Chart.Type.HiLoOpenClose & Double = js.native
    
    /* 1 */ val Line: typings.ejWebAll.ej.datavisualization.Chart.Type.Line & Double = js.native
    
    /* 9 */ val Pie: typings.ejWebAll.ej.datavisualization.Chart.Type.Pie & Double = js.native
    
    /* 26 */ val Polar: typings.ejWebAll.ej.datavisualization.Chart.Type.Polar & Double = js.native
    
    /* 23 */ val Pyramid: typings.ejWebAll.ej.datavisualization.Chart.Type.Pyramid & Double = js.native
    
    /* 27 */ val Radar: typings.ejWebAll.ej.datavisualization.Chart.Type.Radar & Double = js.native
    
    /* 28 */ val RangeArea: typings.ejWebAll.ej.datavisualization.Chart.Type.RangeArea & Double = js.native
    
    /* 16 */ val RangeColumn: typings.ejWebAll.ej.datavisualization.Chart.Type.RangeColumn & Double = js.native
    
    /* 4 */ val Scatter: typings.ejWebAll.ej.datavisualization.Chart.Type.Scatter & Double = js.native
    
    /* 2 */ val Spline: typings.ejWebAll.ej.datavisualization.Chart.Type.Spline & Double = js.native
    
    /* 6 */ val SplineArea: typings.ejWebAll.ej.datavisualization.Chart.Type.SplineArea & Double = js.native
    
    /* 14 */ val StackingArea: typings.ejWebAll.ej.datavisualization.Chart.Type.StackingArea & Double = js.native
    
    /* 15 */ val StackingArea100: typings.ejWebAll.ej.datavisualization.Chart.Type.StackingArea100 & Double = js.native
    
    /* 19 */ val StackingBar: typings.ejWebAll.ej.datavisualization.Chart.Type.StackingBar & Double = js.native
    
    /* 20 */ val StackingBar100: typings.ejWebAll.ej.datavisualization.Chart.Type.StackingBar100 & Double = js.native
    
    /* 17 */ val StackingColumn: typings.ejWebAll.ej.datavisualization.Chart.Type.StackingColumn & Double = js.native
    
    /* 18 */ val StackingColumn100: typings.ejWebAll.ej.datavisualization.Chart.Type.StackingColumn100 & Double = js.native
    
    /* 21 */ val StackingSplineArea: typings.ejWebAll.ej.datavisualization.Chart.Type.StackingSplineArea & Double = js.native
    
    /* 22 */ val StackingSplineArea100: typings.ejWebAll.ej.datavisualization.Chart.Type.StackingSplineArea100 & Double = js.native
    
    /* 7 */ val StepArea: typings.ejWebAll.ej.datavisualization.Chart.Type.StepArea & Double = js.native
    
    /* 8 */ val StepLine: typings.ejWebAll.ej.datavisualization.Chart.Type.StepLine & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.Unit")
  @js.native
  object Unit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.Unit & Double] = js.native
    
    /* 0 */ val Percentage: typings.ejWebAll.ej.datavisualization.Chart.Unit.Percentage & Double = js.native
    
    /* 1 */ val Pixel: typings.ejWebAll.ej.datavisualization.Chart.Unit.Pixel & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.ValueType")
  @js.native
  object ValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.ValueType & scala.Double] = js.native
    
    /* 1 */ val Category: typings.ejWebAll.ej.datavisualization.Chart.ValueType.Category & scala.Double = js.native
    
    /* 2 */ val DateTime: typings.ejWebAll.ej.datavisualization.Chart.ValueType.DateTime & scala.Double = js.native
    
    /* 0 */ val Double: typings.ejWebAll.ej.datavisualization.Chart.ValueType.Double & scala.Double = js.native
    
    /* 3 */ val Logarithmic: typings.ejWebAll.ej.datavisualization.Chart.ValueType.Logarithmic & scala.Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.VerticalAlignment")
  @js.native
  object VerticalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.VerticalAlignment & Double] = js.native
    
    /* 1 */ val Bottom: typings.ejWebAll.ej.datavisualization.Chart.VerticalAlignment.Bottom & Double = js.native
    
    /* 2 */ val Middle: typings.ejWebAll.ej.datavisualization.Chart.VerticalAlignment.Middle & Double = js.native
    
    /* 0 */ val Top: typings.ejWebAll.ej.datavisualization.Chart.VerticalAlignment.Top & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.VerticalTextAlignment")
  @js.native
  object VerticalTextAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.VerticalTextAlignment & Double] = js.native
    
    /* 0 */ val Center: typings.ejWebAll.ej.datavisualization.Chart.VerticalTextAlignment.Center & Double = js.native
    
    /* 2 */ val Far: typings.ejWebAll.ej.datavisualization.Chart.VerticalTextAlignment.Far & Double = js.native
    
    /* 1 */ val Near: typings.ejWebAll.ej.datavisualization.Chart.VerticalTextAlignment.Near & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.ZIndex")
  @js.native
  object ZIndex extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.ZIndex & Double] = js.native
    
    /* 0 */ val Inside: typings.ejWebAll.ej.datavisualization.Chart.ZIndex.Inside & Double = js.native
    
    /* 1 */ val Over: typings.ejWebAll.ej.datavisualization.Chart.ZIndex.Over & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Chart.boxPlotMode")
  @js.native
  object boxPlotMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Chart.boxPlotMode & Double] = js.native
    
    /* 0 */ val Exclusive: typings.ejWebAll.ej.datavisualization.Chart.boxPlotMode.Exclusive & Double = js.native
    
    /* 1 */ val Inclusive: typings.ejWebAll.ej.datavisualization.Chart.boxPlotMode.Inclusive & Double = js.native
    
    /* 2 */ val Normal: typings.ejWebAll.ej.datavisualization.Chart.boxPlotMode.Normal & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.Chart.fn")
  @js.native
  def fn: typings.ejWebAll.ej.datavisualization.Chart = js.native
  inline def fn_=(x: typings.ejWebAll.ej.datavisualization.Chart): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
