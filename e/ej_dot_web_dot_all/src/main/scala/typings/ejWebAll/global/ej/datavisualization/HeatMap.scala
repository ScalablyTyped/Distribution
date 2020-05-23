package typings.ejWebAll.global.ej.datavisualization

import typings.ejWebAll.JQuery
import typings.ejWebAll.ej.Model
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.HeatMap")
@js.native
class HeatMap protected ()
  extends typings.ejWebAll.ej.datavisualization.HeatMap {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}

/* static members */
@JSGlobal("ej.datavisualization.HeatMap")
@js.native
object HeatMap extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejWebAll.ej.datavisualization.HeatMap = js.native
  @js.native
  object Associate extends js.Object {
    /* 2 */ val MouseEnter: typings.ejWebAll.ej.datavisualization.HeatMap.Associate.MouseEnter with Double = js.native
    /* 1 */ val MouseFollow: typings.ejWebAll.ej.datavisualization.HeatMap.Associate.MouseFollow with Double = js.native
    /* 0 */ val Target: typings.ejWebAll.ej.datavisualization.HeatMap.Associate.Target with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.Associate with Double] = js.native
  }
  
  @js.native
  object CellVisibility extends js.Object {
    /* 1 */ val Hidden: typings.ejWebAll.ej.datavisualization.HeatMap.CellVisibility.Hidden with Double = js.native
    /* 0 */ val Visible: typings.ejWebAll.ej.datavisualization.HeatMap.CellVisibility.Visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.CellVisibility with Double] = js.native
  }
  
  @js.native
  object Effect extends js.Object {
    /* 1 */ val Fade: typings.ejWebAll.ej.datavisualization.HeatMap.Effect.Fade with Double = js.native
    /* 0 */ val None: typings.ejWebAll.ej.datavisualization.HeatMap.Effect.None with Double = js.native
    /* 2 */ val Slide: typings.ejWebAll.ej.datavisualization.HeatMap.Effect.Slide with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.Effect with Double] = js.native
  }
  
  @js.native
  object Horizontal extends js.Object {
    /* 1 */ val Center: typings.ejWebAll.ej.datavisualization.HeatMap.Horizontal.Center with Double = js.native
    /* 0 */ val Left: typings.ejWebAll.ej.datavisualization.HeatMap.Horizontal.Left with Double = js.native
    /* 2 */ val Right: typings.ejWebAll.ej.datavisualization.HeatMap.Horizontal.Right with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.Horizontal with Double] = js.native
  }
  
  @js.native
  object LegendMode extends js.Object {
    /* 0 */ val Gradient: typings.ejWebAll.ej.datavisualization.HeatMap.LegendMode.Gradient with Double = js.native
    /* 1 */ val List: typings.ejWebAll.ej.datavisualization.HeatMap.LegendMode.List with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.LegendMode with Double] = js.native
  }
  
  @js.native
  object LegendOrientation extends js.Object {
    /* 0 */ val Horizontal: typings.ejWebAll.ej.datavisualization.HeatMap.LegendOrientation.Horizontal with Double = js.native
    /* 1 */ val Vertical: typings.ejWebAll.ej.datavisualization.HeatMap.LegendOrientation.Vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.LegendOrientation with Double] = js.native
  }
  
  @js.native
  object TextDecoration extends js.Object {
    /* 2 */ val LineThrough: typings.ejWebAll.ej.datavisualization.HeatMap.TextDecoration.LineThrough with Double = js.native
    /* 3 */ val None: typings.ejWebAll.ej.datavisualization.HeatMap.TextDecoration.None with Double = js.native
    /* 1 */ val Overline: typings.ejWebAll.ej.datavisualization.HeatMap.TextDecoration.Overline with Double = js.native
    /* 0 */ val Underline: typings.ejWebAll.ej.datavisualization.HeatMap.TextDecoration.Underline with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.TextDecoration with Double] = js.native
  }
  
  @js.native
  object Trigger extends js.Object {
    /* 1 */ val Click: typings.ejWebAll.ej.datavisualization.HeatMap.Trigger.Click with Double = js.native
    /* 0 */ val Hover: typings.ejWebAll.ej.datavisualization.HeatMap.Trigger.Hover with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.Trigger with Double] = js.native
  }
  
  @js.native
  object Vertical extends js.Object {
    /* 2 */ val Bottom: typings.ejWebAll.ej.datavisualization.HeatMap.Vertical.Bottom with Double = js.native
    /* 1 */ val Center: typings.ejWebAll.ej.datavisualization.HeatMap.Vertical.Center with Double = js.native
    /* 0 */ val Top: typings.ejWebAll.ej.datavisualization.HeatMap.Vertical.Top with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.HeatMap.Vertical with Double] = js.native
  }
  
}

