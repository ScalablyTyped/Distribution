package typings.ejWebAll.global.ej.datavisualization

import typings.ejWebAll.JQuery
import typings.ejWebAll.ej.Model
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.LinearGauge")
@js.native
open class LinearGauge protected ()
  extends StObject
     with typings.ejWebAll.ej.datavisualization.LinearGauge {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}
object LinearGauge {
  
  @JSGlobal("ej.datavisualization.LinearGauge")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.datavisualization.LinearGauge.Direction")
  @js.native
  object Direction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.Direction & Double] = js.native
    
    /* 0 */ val Clockwise: typings.ejWebAll.ej.datavisualization.LinearGauge.Direction.Clockwise & Double = js.native
    
    /* 1 */ val CounterClockwise: typings.ejWebAll.ej.datavisualization.LinearGauge.Direction.CounterClockwise & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.LinearGauge.ExportingMode")
  @js.native
  object ExportingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.ExportingMode & Double] = js.native
    
    /* 1 */ val ClientSide: typings.ejWebAll.ej.datavisualization.LinearGauge.ExportingMode.ClientSide & Double = js.native
    
    /* 0 */ val ServerSide: typings.ejWebAll.ej.datavisualization.LinearGauge.ExportingMode.ServerSide & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.LinearGauge.ExportingType")
  @js.native
  object ExportingType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.ExportingType & Double] = js.native
    
    /* 1 */ val JPG: typings.ejWebAll.ej.datavisualization.LinearGauge.ExportingType.JPG & Double = js.native
    
    /* 0 */ val PNG: typings.ejWebAll.ej.datavisualization.LinearGauge.ExportingType.PNG & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.LinearGauge.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.FontStyle & Double] = js.native
    
    /* 0 */ val Bold: typings.ejWebAll.ej.datavisualization.LinearGauge.FontStyle.Bold & Double = js.native
    
    /* 1 */ val Italic: typings.ejWebAll.ej.datavisualization.LinearGauge.FontStyle.Italic & Double = js.native
    
    /* 2 */ val Regular: typings.ejWebAll.ej.datavisualization.LinearGauge.FontStyle.Regular & Double = js.native
    
    /* 3 */ val Strikeout: typings.ejWebAll.ej.datavisualization.LinearGauge.FontStyle.Strikeout & Double = js.native
    
    /* 4 */ val Underline: typings.ejWebAll.ej.datavisualization.LinearGauge.FontStyle.Underline & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.LinearGauge.IndicatorTypes")
  @js.native
  object IndicatorTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.IndicatorTypes & Double] = js.native
    
    /* 1 */ val Circle: typings.ejWebAll.ej.datavisualization.LinearGauge.IndicatorTypes.Circle & Double = js.native
    
    /* 0 */ val Rectangle: typings.ejWebAll.ej.datavisualization.LinearGauge.IndicatorTypes.Rectangle & Double = js.native
    
    /* 2 */ val RoundedRectangle: typings.ejWebAll.ej.datavisualization.LinearGauge.IndicatorTypes.RoundedRectangle & Double = js.native
    
    /* 3 */ val Text: typings.ejWebAll.ej.datavisualization.LinearGauge.IndicatorTypes.Text & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.LinearGauge.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.datavisualization.LinearGauge.MarkerType")
  @js.native
  object MarkerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType & Double] = js.native
    
    /* 5 */ val Circle: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Circle & Double = js.native
    
    /* 3 */ val Diamond: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Diamond & Double = js.native
    
    /* 2 */ val Ellipse: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Ellipse & Double = js.native
    
    /* 4 */ val Pentagon: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Pentagon & Double = js.native
    
    /* 8 */ val Pointer: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Pointer & Double = js.native
    
    /* 0 */ val Rectangle: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Rectangle & Double = js.native
    
    /* 11 */ val RoundedRectangle: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.RoundedRectangle & Double = js.native
    
    /* 7 */ val Slider: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Slider & Double = js.native
    
    /* 6 */ val Star: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Star & Double = js.native
    
    /* 10 */ val Trapezoid: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Trapezoid & Double = js.native
    
    /* 1 */ val Triangle: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Triangle & Double = js.native
    
    /* 9 */ val Wedge: typings.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Wedge & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.LinearGauge.OuterCustomLabelPosition")
  @js.native
  object OuterCustomLabelPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.ejWebAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition & Double
      ] = js.native
    
    /* 3 */ val Bottom: typings.ejWebAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition.Bottom & Double = js.native
    
    /* 0 */ val Left: typings.ejWebAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition.Left & Double = js.native
    
    /* 1 */ val Right: typings.ejWebAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition.Right & Double = js.native
    
    /* 2 */ val Top: typings.ejWebAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition.Top & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.LinearGauge.PointerPlacement")
  @js.native
  object PointerPlacement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.PointerPlacement & Double] = js.native
    
    /* 2 */ val Center: typings.ejWebAll.ej.datavisualization.LinearGauge.PointerPlacement.Center & Double = js.native
    
    /* 1 */ val Far: typings.ejWebAll.ej.datavisualization.LinearGauge.PointerPlacement.Far & Double = js.native
    
    /* 0 */ val Near: typings.ejWebAll.ej.datavisualization.LinearGauge.PointerPlacement.Near & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.LinearGauge.ScaleType")
  @js.native
  object ScaleType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.ScaleType & Double] = js.native
    
    /* 0 */ val Major: typings.ejWebAll.ej.datavisualization.LinearGauge.ScaleType.Major & Double = js.native
    
    /* 1 */ val Minor: typings.ejWebAll.ej.datavisualization.LinearGauge.ScaleType.Minor & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.LinearGauge.Themes")
  @js.native
  object Themes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.Themes & Double] = js.native
    
    /* 1 */ val FlatDark: typings.ejWebAll.ej.datavisualization.LinearGauge.Themes.FlatDark & Double = js.native
    
    /* 0 */ val FlatLight: typings.ejWebAll.ej.datavisualization.LinearGauge.Themes.FlatLight & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.LinearGauge.TicksType")
  @js.native
  object TicksType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.TicksType & Double] = js.native
    
    /* 0 */ val Majorinterval: typings.ejWebAll.ej.datavisualization.LinearGauge.TicksType.Majorinterval & Double = js.native
    
    /* 1 */ val Minorinterval: typings.ejWebAll.ej.datavisualization.LinearGauge.TicksType.Minorinterval & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.LinearGauge.UnitTextPlacement")
  @js.native
  object UnitTextPlacement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.LinearGauge.UnitTextPlacement & Double] = js.native
    
    /* 0 */ val Back: typings.ejWebAll.ej.datavisualization.LinearGauge.UnitTextPlacement.Back & Double = js.native
    
    /* 1 */ val From: typings.ejWebAll.ej.datavisualization.LinearGauge.UnitTextPlacement.From & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.LinearGauge.fn")
  @js.native
  def fn: typings.ejWebAll.ej.datavisualization.LinearGauge = js.native
  inline def fn_=(x: typings.ejWebAll.ej.datavisualization.LinearGauge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
