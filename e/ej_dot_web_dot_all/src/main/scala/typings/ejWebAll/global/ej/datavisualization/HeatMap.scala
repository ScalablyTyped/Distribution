package typings.ejWebAll.global.ej.datavisualization

import typings.ejWebAll.JQuery
import typings.ejWebAll.ej.Model
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.HeatMap")
@js.native
class HeatMap protected ()
  extends StObject
     with typings.ejWebAll.ej.datavisualization.HeatMap {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}
object HeatMap {
  
  @JSGlobal("ej.datavisualization.HeatMap")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.datavisualization.HeatMap.Associate")
  @js.native
  object Associate extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.Associate & Double] = js.native
    
    /* 2 */ val MouseEnter: typings.ejWebAll.ej.datavisualization.HeatMap.Associate.MouseEnter & Double = js.native
    
    /* 1 */ val MouseFollow: typings.ejWebAll.ej.datavisualization.HeatMap.Associate.MouseFollow & Double = js.native
    
    /* 0 */ val Target: typings.ejWebAll.ej.datavisualization.HeatMap.Associate.Target & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.HeatMap.CellVisibility")
  @js.native
  object CellVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.CellVisibility & Double] = js.native
    
    /* 1 */ val Hidden: typings.ejWebAll.ej.datavisualization.HeatMap.CellVisibility.Hidden & Double = js.native
    
    /* 0 */ val Visible: typings.ejWebAll.ej.datavisualization.HeatMap.CellVisibility.Visible & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.HeatMap.Effect")
  @js.native
  object Effect extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.Effect & Double] = js.native
    
    /* 1 */ val Fade: typings.ejWebAll.ej.datavisualization.HeatMap.Effect.Fade & Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.datavisualization.HeatMap.Effect.None & Double = js.native
    
    /* 2 */ val Slide: typings.ejWebAll.ej.datavisualization.HeatMap.Effect.Slide & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.HeatMap.Horizontal")
  @js.native
  object Horizontal extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.Horizontal & Double] = js.native
    
    /* 1 */ val Center: typings.ejWebAll.ej.datavisualization.HeatMap.Horizontal.Center & Double = js.native
    
    /* 0 */ val Left: typings.ejWebAll.ej.datavisualization.HeatMap.Horizontal.Left & Double = js.native
    
    /* 2 */ val Right: typings.ejWebAll.ej.datavisualization.HeatMap.Horizontal.Right & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.HeatMap.LegendMode")
  @js.native
  object LegendMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.LegendMode & Double] = js.native
    
    /* 0 */ val Gradient: typings.ejWebAll.ej.datavisualization.HeatMap.LegendMode.Gradient & Double = js.native
    
    /* 1 */ val List: typings.ejWebAll.ej.datavisualization.HeatMap.LegendMode.List & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.HeatMap.LegendOrientation")
  @js.native
  object LegendOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.LegendOrientation & Double] = js.native
    
    /* 0 */ val Horizontal: typings.ejWebAll.ej.datavisualization.HeatMap.LegendOrientation.Horizontal & Double = js.native
    
    /* 1 */ val Vertical: typings.ejWebAll.ej.datavisualization.HeatMap.LegendOrientation.Vertical & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.HeatMap.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.datavisualization.HeatMap.TextDecoration")
  @js.native
  object TextDecoration extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.TextDecoration & Double] = js.native
    
    /* 2 */ val LineThrough: typings.ejWebAll.ej.datavisualization.HeatMap.TextDecoration.LineThrough & Double = js.native
    
    /* 3 */ val None: typings.ejWebAll.ej.datavisualization.HeatMap.TextDecoration.None & Double = js.native
    
    /* 1 */ val Overline: typings.ejWebAll.ej.datavisualization.HeatMap.TextDecoration.Overline & Double = js.native
    
    /* 0 */ val Underline: typings.ejWebAll.ej.datavisualization.HeatMap.TextDecoration.Underline & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.HeatMap.Trigger")
  @js.native
  object Trigger extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.Trigger & Double] = js.native
    
    /* 1 */ val Click: typings.ejWebAll.ej.datavisualization.HeatMap.Trigger.Click & Double = js.native
    
    /* 0 */ val Hover: typings.ejWebAll.ej.datavisualization.HeatMap.Trigger.Hover & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.HeatMap.Vertical")
  @js.native
  object Vertical extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.Vertical & Double] = js.native
    
    /* 2 */ val Bottom: typings.ejWebAll.ej.datavisualization.HeatMap.Vertical.Bottom & Double = js.native
    
    /* 1 */ val Center: typings.ejWebAll.ej.datavisualization.HeatMap.Vertical.Center & Double = js.native
    
    /* 0 */ val Top: typings.ejWebAll.ej.datavisualization.HeatMap.Vertical.Top & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.HeatMap.fn")
  @js.native
  def fn: typings.ejWebAll.ej.datavisualization.HeatMap = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.datavisualization.HeatMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
