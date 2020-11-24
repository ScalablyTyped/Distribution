package typings.ejWebAll.global.ej.datavisualization

import typings.ejWebAll.JQuery
import typings.ejWebAll.ej.Model
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.LinearGauge")
@js.native
class LinearGauge protected ()
  extends typings.ejWebAll.ej.datavisualization.LinearGauge {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}
/* static members */
@JSGlobal("ej.datavisualization.LinearGauge")
@js.native
object LinearGauge extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typings.ejWebAll.ej.datavisualization.LinearGauge = js.native
  
  @js.native
  object Direction extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.Direction with Double] = js.native
    
    /* 0 */ val Clockwise: typings.ejWebAll.ej.datavisualization.LinearGauge.Direction.Clockwise with Double = js.native
    
    /* 1 */ val CounterClockwise: typings.ejWebAll.ej.datavisualization.LinearGauge.Direction.CounterClockwise with Double = js.native
  }
  
  @js.native
  object ExportingMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.ExportingMode with Double] = js.native
    
    /* 1 */ val ClientSide: typings.ejWebAll.ej.datavisualization.LinearGauge.ExportingMode.ClientSide with Double = js.native
    
    /* 0 */ val ServerSide: typings.ejWebAll.ej.datavisualization.LinearGauge.ExportingMode.ServerSide with Double = js.native
  }
  
  @js.native
  object ExportingType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.ExportingType with Double] = js.native
    
    /* 1 */ val JPG: typings.ejWebAll.ej.datavisualization.LinearGauge.ExportingType.JPG with Double = js.native
    
    /* 0 */ val PNG: typings.ejWebAll.ej.datavisualization.LinearGauge.ExportingType.PNG with Double = js.native
  }
  
  @js.native
  object FontStyle extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.FontStyle with Double] = js.native
    
    /* 0 */ val Bold: typings.ejWebAll.ej.datavisualization.LinearGauge.FontStyle.Bold with Double = js.native
    
    /* 1 */ val Italic: typings.ejWebAll.ej.datavisualization.LinearGauge.FontStyle.Italic with Double = js.native
    
    /* 2 */ val Regular: typings.ejWebAll.ej.datavisualization.LinearGauge.FontStyle.Regular with Double = js.native
    
    /* 3 */ val Strikeout: typings.ejWebAll.ej.datavisualization.LinearGauge.FontStyle.Strikeout with Double = js.native
    
    /* 4 */ val Underline: typings.ejWebAll.ej.datavisualization.LinearGauge.FontStyle.Underline with Double = js.native
  }
  
  @js.native
  object IndicatorTypes extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.IndicatorTypes with Double] = js.native
    
    /* 1 */ val Circle: typings.ejWebAll.ej.datavisualization.LinearGauge.IndicatorTypes.Circle with Double = js.native
    
    /* 0 */ val Rectangle: typings.ejWebAll.ej.datavisualization.LinearGauge.IndicatorTypes.Rectangle with Double = js.native
    
    /* 2 */ val RoundedRectangle: typings.ejWebAll.ej.datavisualization.LinearGauge.IndicatorTypes.RoundedRectangle with Double = js.native
    
    /* 3 */ val Text: typings.ejWebAll.ej.datavisualization.LinearGauge.IndicatorTypes.Text with Double = js.native
  }
  
  @js.native
  object MarkerType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType with Double] = js.native
    
    /* 5 */ val Circle: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Circle with Double = js.native
    
    /* 3 */ val Diamond: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Diamond with Double = js.native
    
    /* 2 */ val Ellipse: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Ellipse with Double = js.native
    
    /* 4 */ val Pentagon: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Pentagon with Double = js.native
    
    /* 8 */ val Pointer: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Pointer with Double = js.native
    
    /* 0 */ val Rectangle: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Rectangle with Double = js.native
    
    /* 11 */ val RoundedRectangle: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.RoundedRectangle with Double = js.native
    
    /* 7 */ val Slider: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Slider with Double = js.native
    
    /* 6 */ val Star: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Star with Double = js.native
    
    /* 10 */ val Trapezoid: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Trapezoid with Double = js.native
    
    /* 1 */ val Triangle: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Triangle with Double = js.native
    
    /* 9 */ val Wedge: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Wedge with Double = js.native
  }
  
  @js.native
  object OuterCustomLabelPosition extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.ejWebAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition with Double
      ] = js.native
    
    /* 3 */ val Bottom: typings.ejWebAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition.Bottom with Double = js.native
    
    /* 0 */ val Left: typings.ejWebAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition.Left with Double = js.native
    
    /* 1 */ val Right: typings.ejWebAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition.Right with Double = js.native
    
    /* 2 */ val Top: typings.ejWebAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition.Top with Double = js.native
  }
  
  @js.native
  object PointerPlacement extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.PointerPlacement with Double] = js.native
    
    /* 2 */ val Center: typings.ejWebAll.ej.datavisualization.LinearGauge.PointerPlacement.Center with Double = js.native
    
    /* 1 */ val Far: typings.ejWebAll.ej.datavisualization.LinearGauge.PointerPlacement.Far with Double = js.native
    
    /* 0 */ val Near: typings.ejWebAll.ej.datavisualization.LinearGauge.PointerPlacement.Near with Double = js.native
  }
  
  @js.native
  object ScaleType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.ScaleType with Double] = js.native
    
    /* 0 */ val Major: typings.ejWebAll.ej.datavisualization.LinearGauge.ScaleType.Major with Double = js.native
    
    /* 1 */ val Minor: typings.ejWebAll.ej.datavisualization.LinearGauge.ScaleType.Minor with Double = js.native
  }
  
  @js.native
  object Themes extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.Themes with Double] = js.native
    
    /* 1 */ val FlatDark: typings.ejWebAll.ej.datavisualization.LinearGauge.Themes.FlatDark with Double = js.native
    
    /* 0 */ val FlatLight: typings.ejWebAll.ej.datavisualization.LinearGauge.Themes.FlatLight with Double = js.native
  }
  
  @js.native
  object TicksType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.TicksType with Double] = js.native
    
    /* 0 */ val Majorinterval: typings.ejWebAll.ej.datavisualization.LinearGauge.TicksType.Majorinterval with Double = js.native
    
    /* 1 */ val Minorinterval: typings.ejWebAll.ej.datavisualization.LinearGauge.TicksType.Minorinterval with Double = js.native
  }
  
  @js.native
  object UnitTextPlacement extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.UnitTextPlacement with Double] = js.native
    
    /* 0 */ val Back: typings.ejWebAll.ej.datavisualization.LinearGauge.UnitTextPlacement.Back with Double = js.native
    
    /* 1 */ val From: typings.ejWebAll.ej.datavisualization.LinearGauge.UnitTextPlacement.From with Double = js.native
  }
}
