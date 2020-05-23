package typings.ejWebAll.global.ej.datavisualization

import typings.ejWebAll.JQuery
import typings.ejWebAll.ej.Model
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.BulletGraph")
@js.native
class BulletGraph protected ()
  extends typings.ejWebAll.ej.datavisualization.BulletGraph {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}

/* static members */
@JSGlobal("ej.datavisualization.BulletGraph")
@js.native
object BulletGraph extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejWebAll.ej.datavisualization.BulletGraph = js.native
  @js.native
  object FlowDirection extends js.Object {
    /* 1 */ val Backward: typings.ejWebAll.ej.datavisualization.BulletGraph.FlowDirection.Backward with Double = js.native
    /* 0 */ val Forward: typings.ejWebAll.ej.datavisualization.BulletGraph.FlowDirection.Forward with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.FlowDirection with Double] = js.native
  }
  
  @js.native
  object FontStyle extends js.Object {
    /* 1 */ val Italic: typings.ejWebAll.ej.datavisualization.BulletGraph.FontStyle.Italic with Double = js.native
    /* 0 */ val Normal: typings.ejWebAll.ej.datavisualization.BulletGraph.FontStyle.Normal with Double = js.native
    /* 2 */ val Oblique: typings.ejWebAll.ej.datavisualization.BulletGraph.FontStyle.Oblique with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.FontStyle with Double] = js.native
  }
  
  @js.native
  object FontWeight extends js.Object {
    /* 1 */ val Bold: typings.ejWebAll.ej.datavisualization.BulletGraph.FontWeight.Bold with Double = js.native
    /* 2 */ val Bolder: typings.ejWebAll.ej.datavisualization.BulletGraph.FontWeight.Bolder with Double = js.native
    /* 3 */ val Lighter: typings.ejWebAll.ej.datavisualization.BulletGraph.FontWeight.Lighter with Double = js.native
    /* 0 */ val Normal: typings.ejWebAll.ej.datavisualization.BulletGraph.FontWeight.Normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.FontWeight with Double] = js.native
  }
  
  @js.native
  object LabelPlacement extends js.Object {
    /* 0 */ val Inside: typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPlacement.Inside with Double = js.native
    /* 1 */ val Outside: typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPlacement.Outside with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPlacement with Double] = js.native
  }
  
  @js.native
  object LabelPosition extends js.Object {
    /* 0 */ val Above: typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPosition.Above with Double = js.native
    /* 1 */ val Below: typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPosition.Below with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPosition with Double] = js.native
  }
  
  @js.native
  object Orientation extends js.Object {
    /* 0 */ val Horizontal: typings.ejWebAll.ej.datavisualization.BulletGraph.Orientation.Horizontal with Double = js.native
    /* 1 */ val Vertical: typings.ejWebAll.ej.datavisualization.BulletGraph.Orientation.Vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.Orientation with Double] = js.native
  }
  
  @js.native
  object TextAlignment extends js.Object {
    /* 2 */ val Center: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAlignment.Center with Double = js.native
    /* 1 */ val Far: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAlignment.Far with Double = js.native
    /* 0 */ val Near: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAlignment.Near with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.TextAlignment with Double] = js.native
  }
  
  @js.native
  object TextAnchor extends js.Object {
    /* 2 */ val End: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAnchor.End with Double = js.native
    /* 1 */ val Middle: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAnchor.Middle with Double = js.native
    /* 0 */ val Start: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAnchor.Start with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.TextAnchor with Double] = js.native
  }
  
  @js.native
  object TextPosition extends js.Object {
    /* 3 */ val Bottom: typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Bottom with Double = js.native
    /* 4 */ val Float: typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Float with Double = js.native
    /* 2 */ val Left: typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Left with Double = js.native
    /* 1 */ val Right: typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Right with Double = js.native
    /* 0 */ val Top: typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Top with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition with Double] = js.native
  }
  
  @js.native
  object TickPlacement extends js.Object {
    /* 0 */ val Inside: typings.ejWebAll.ej.datavisualization.BulletGraph.TickPlacement.Inside with Double = js.native
    /* 1 */ val Outside: typings.ejWebAll.ej.datavisualization.BulletGraph.TickPlacement.Outside with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.TickPlacement with Double] = js.native
  }
  
  @js.native
  object TickPosition extends js.Object {
    /* 1 */ val Above: typings.ejWebAll.ej.datavisualization.BulletGraph.TickPosition.Above with Double = js.native
    /* 0 */ val Below: typings.ejWebAll.ej.datavisualization.BulletGraph.TickPosition.Below with Double = js.native
    /* 2 */ val Cross: typings.ejWebAll.ej.datavisualization.BulletGraph.TickPosition.Cross with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.TickPosition with Double] = js.native
  }
  
}

