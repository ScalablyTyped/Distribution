package typings.ejWebAll.global.ej.datavisualization

import typings.ejWebAll.JQuery
import typings.ejWebAll.ej.Model
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.BulletGraph")
@js.native
class BulletGraph protected ()
  extends typings.ejWebAll.ej.datavisualization.BulletGraph {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}
object BulletGraph {
  
  @JSGlobal("ej.datavisualization.BulletGraph")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.datavisualization.BulletGraph.FlowDirection")
  @js.native
  object FlowDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.FlowDirection with Double] = js.native
    
    /* 1 */ val Backward: typings.ejWebAll.ej.datavisualization.BulletGraph.FlowDirection.Backward with Double = js.native
    
    /* 0 */ val Forward: typings.ejWebAll.ej.datavisualization.BulletGraph.FlowDirection.Forward with Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.FontStyle with Double] = js.native
    
    /* 1 */ val Italic: typings.ejWebAll.ej.datavisualization.BulletGraph.FontStyle.Italic with Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.datavisualization.BulletGraph.FontStyle.Normal with Double = js.native
    
    /* 2 */ val Oblique: typings.ejWebAll.ej.datavisualization.BulletGraph.FontStyle.Oblique with Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.FontWeight with Double] = js.native
    
    /* 1 */ val Bold: typings.ejWebAll.ej.datavisualization.BulletGraph.FontWeight.Bold with Double = js.native
    
    /* 2 */ val Bolder: typings.ejWebAll.ej.datavisualization.BulletGraph.FontWeight.Bolder with Double = js.native
    
    /* 3 */ val Lighter: typings.ejWebAll.ej.datavisualization.BulletGraph.FontWeight.Lighter with Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.datavisualization.BulletGraph.FontWeight.Normal with Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.LabelPlacement")
  @js.native
  object LabelPlacement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPlacement with Double] = js.native
    
    /* 0 */ val Inside: typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPlacement.Inside with Double = js.native
    
    /* 1 */ val Outside: typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPlacement.Outside with Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.LabelPosition")
  @js.native
  object LabelPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPosition with Double] = js.native
    
    /* 0 */ val Above: typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPosition.Above with Double = js.native
    
    /* 1 */ val Below: typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPosition.Below with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.BulletGraph.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.datavisualization.BulletGraph.Orientation")
  @js.native
  object Orientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.Orientation with Double] = js.native
    
    /* 0 */ val Horizontal: typings.ejWebAll.ej.datavisualization.BulletGraph.Orientation.Horizontal with Double = js.native
    
    /* 1 */ val Vertical: typings.ejWebAll.ej.datavisualization.BulletGraph.Orientation.Vertical with Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.TextAlignment")
  @js.native
  object TextAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.TextAlignment with Double] = js.native
    
    /* 2 */ val Center: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAlignment.Center with Double = js.native
    
    /* 1 */ val Far: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAlignment.Far with Double = js.native
    
    /* 0 */ val Near: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAlignment.Near with Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.TextAnchor")
  @js.native
  object TextAnchor extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.TextAnchor with Double] = js.native
    
    /* 2 */ val End: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAnchor.End with Double = js.native
    
    /* 1 */ val Middle: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAnchor.Middle with Double = js.native
    
    /* 0 */ val Start: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAnchor.Start with Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.TextPosition")
  @js.native
  object TextPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition with Double] = js.native
    
    /* 3 */ val Bottom: typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Bottom with Double = js.native
    
    /* 4 */ val Float: typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Float with Double = js.native
    
    /* 2 */ val Left: typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Left with Double = js.native
    
    /* 1 */ val Right: typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Right with Double = js.native
    
    /* 0 */ val Top: typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Top with Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.TickPlacement")
  @js.native
  object TickPlacement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.TickPlacement with Double] = js.native
    
    /* 0 */ val Inside: typings.ejWebAll.ej.datavisualization.BulletGraph.TickPlacement.Inside with Double = js.native
    
    /* 1 */ val Outside: typings.ejWebAll.ej.datavisualization.BulletGraph.TickPlacement.Outside with Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.TickPosition")
  @js.native
  object TickPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.TickPosition with Double] = js.native
    
    /* 1 */ val Above: typings.ejWebAll.ej.datavisualization.BulletGraph.TickPosition.Above with Double = js.native
    
    /* 0 */ val Below: typings.ejWebAll.ej.datavisualization.BulletGraph.TickPosition.Below with Double = js.native
    
    /* 2 */ val Cross: typings.ejWebAll.ej.datavisualization.BulletGraph.TickPosition.Cross with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.BulletGraph.fn")
  @js.native
  def fn: typings.ejWebAll.ej.datavisualization.BulletGraph = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.datavisualization.BulletGraph): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
