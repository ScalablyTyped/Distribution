package typings.ejWebAll.global.ej.datavisualization

import typings.ejWebAll.JQuery
import typings.ejWebAll.ej.Model
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.BulletGraph")
@js.native
class BulletGraph protected ()
  extends StObject
     with typings.ejWebAll.ej.datavisualization.BulletGraph {
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
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.FlowDirection & Double] = js.native
    
    /* 1 */ val Backward: typings.ejWebAll.ej.datavisualization.BulletGraph.FlowDirection.Backward & Double = js.native
    
    /* 0 */ val Forward: typings.ejWebAll.ej.datavisualization.BulletGraph.FlowDirection.Forward & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.FontStyle & Double] = js.native
    
    /* 1 */ val Italic: typings.ejWebAll.ej.datavisualization.BulletGraph.FontStyle.Italic & Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.datavisualization.BulletGraph.FontStyle.Normal & Double = js.native
    
    /* 2 */ val Oblique: typings.ejWebAll.ej.datavisualization.BulletGraph.FontStyle.Oblique & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.FontWeight & Double] = js.native
    
    /* 1 */ val Bold: typings.ejWebAll.ej.datavisualization.BulletGraph.FontWeight.Bold & Double = js.native
    
    /* 2 */ val Bolder: typings.ejWebAll.ej.datavisualization.BulletGraph.FontWeight.Bolder & Double = js.native
    
    /* 3 */ val Lighter: typings.ejWebAll.ej.datavisualization.BulletGraph.FontWeight.Lighter & Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.datavisualization.BulletGraph.FontWeight.Normal & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.LabelPlacement")
  @js.native
  object LabelPlacement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPlacement & Double] = js.native
    
    /* 0 */ val Inside: typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPlacement.Inside & Double = js.native
    
    /* 1 */ val Outside: typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPlacement.Outside & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.LabelPosition")
  @js.native
  object LabelPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPosition & Double] = js.native
    
    /* 0 */ val Above: typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPosition.Above & Double = js.native
    
    /* 1 */ val Below: typings.ejWebAll.ej.datavisualization.BulletGraph.LabelPosition.Below & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.BulletGraph.Locale")
  @js.native
  def Locale: js.Any = js.native
  inline def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.datavisualization.BulletGraph.Orientation")
  @js.native
  object Orientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.Orientation & Double] = js.native
    
    /* 0 */ val Horizontal: typings.ejWebAll.ej.datavisualization.BulletGraph.Orientation.Horizontal & Double = js.native
    
    /* 1 */ val Vertical: typings.ejWebAll.ej.datavisualization.BulletGraph.Orientation.Vertical & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.TextAlignment")
  @js.native
  object TextAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.TextAlignment & Double] = js.native
    
    /* 2 */ val Center: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAlignment.Center & Double = js.native
    
    /* 1 */ val Far: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAlignment.Far & Double = js.native
    
    /* 0 */ val Near: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAlignment.Near & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.TextAnchor")
  @js.native
  object TextAnchor extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.TextAnchor & Double] = js.native
    
    /* 2 */ val End: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAnchor.End & Double = js.native
    
    /* 1 */ val Middle: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAnchor.Middle & Double = js.native
    
    /* 0 */ val Start: typings.ejWebAll.ej.datavisualization.BulletGraph.TextAnchor.Start & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.TextPosition")
  @js.native
  object TextPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition & Double] = js.native
    
    /* 3 */ val Bottom: typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Bottom & Double = js.native
    
    /* 4 */ val Float: typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Float & Double = js.native
    
    /* 2 */ val Left: typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Left & Double = js.native
    
    /* 1 */ val Right: typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Right & Double = js.native
    
    /* 0 */ val Top: typings.ejWebAll.ej.datavisualization.BulletGraph.TextPosition.Top & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.TickPlacement")
  @js.native
  object TickPlacement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.TickPlacement & Double] = js.native
    
    /* 0 */ val Inside: typings.ejWebAll.ej.datavisualization.BulletGraph.TickPlacement.Inside & Double = js.native
    
    /* 1 */ val Outside: typings.ejWebAll.ej.datavisualization.BulletGraph.TickPlacement.Outside & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.BulletGraph.TickPosition")
  @js.native
  object TickPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.BulletGraph.TickPosition & Double] = js.native
    
    /* 1 */ val Above: typings.ejWebAll.ej.datavisualization.BulletGraph.TickPosition.Above & Double = js.native
    
    /* 0 */ val Below: typings.ejWebAll.ej.datavisualization.BulletGraph.TickPosition.Below & Double = js.native
    
    /* 2 */ val Cross: typings.ejWebAll.ej.datavisualization.BulletGraph.TickPosition.Cross & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.BulletGraph.fn")
  @js.native
  def fn: typings.ejWebAll.ej.datavisualization.BulletGraph = js.native
  inline def fn_=(x: typings.ejWebAll.ej.datavisualization.BulletGraph): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
