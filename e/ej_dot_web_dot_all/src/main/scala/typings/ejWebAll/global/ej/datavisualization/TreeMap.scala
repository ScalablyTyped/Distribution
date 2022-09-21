package typings.ejWebAll.global.ej.datavisualization

import typings.ejWebAll.JQuery
import typings.ejWebAll.ej.Model
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.TreeMap")
@js.native
open class TreeMap protected ()
  extends StObject
     with typings.ejWebAll.ej.datavisualization.TreeMap {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}
object TreeMap {
  
  @JSGlobal("ej.datavisualization.TreeMap")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.datavisualization.TreeMap.DockPosition")
  @js.native
  object DockPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.TreeMap.DockPosition & Double] = js.native
    
    /* 1 */ val Bottom: typings.ejWebAll.ej.datavisualization.TreeMap.DockPosition.Bottom & Double = js.native
    
    /* 3 */ val Left: typings.ejWebAll.ej.datavisualization.TreeMap.DockPosition.Left & Double = js.native
    
    /* 2 */ val Right: typings.ejWebAll.ej.datavisualization.TreeMap.DockPosition.Right & Double = js.native
    
    /* 0 */ val Top: typings.ejWebAll.ej.datavisualization.TreeMap.DockPosition.Top & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.TreeMap.ItemsLayoutMode")
  @js.native
  object ItemsLayoutMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.TreeMap.ItemsLayoutMode & Double] = js.native
    
    /* 3 */ val Sliceanddiceauto: typings.ejWebAll.ej.datavisualization.TreeMap.ItemsLayoutMode.Sliceanddiceauto & Double = js.native
    
    /* 1 */ val Sliceanddicehorizontal: typings.ejWebAll.ej.datavisualization.TreeMap.ItemsLayoutMode.Sliceanddicehorizontal & Double = js.native
    
    /* 2 */ val Sliceanddicevertical: typings.ejWebAll.ej.datavisualization.TreeMap.ItemsLayoutMode.Sliceanddicevertical & Double = js.native
    
    /* 0 */ val Squarified: typings.ejWebAll.ej.datavisualization.TreeMap.ItemsLayoutMode.Squarified & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.TreeMap.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.datavisualization.TreeMap.Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.TreeMap.Position & Double] = js.native
    
    /* 8 */ val Bottomcenter: typings.ejWebAll.ej.datavisualization.TreeMap.Position.Bottomcenter & Double = js.native
    
    /* 7 */ val Bottomleft: typings.ejWebAll.ej.datavisualization.TreeMap.Position.Bottomleft & Double = js.native
    
    /* 9 */ val Bottomright: typings.ejWebAll.ej.datavisualization.TreeMap.Position.Bottomright & Double = js.native
    
    /* 5 */ val Center: typings.ejWebAll.ej.datavisualization.TreeMap.Position.Center & Double = js.native
    
    /* 4 */ val Centerleft: typings.ejWebAll.ej.datavisualization.TreeMap.Position.Centerleft & Double = js.native
    
    /* 6 */ val Centerright: typings.ejWebAll.ej.datavisualization.TreeMap.Position.Centerright & Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.datavisualization.TreeMap.Position.None & Double = js.native
    
    /* 2 */ val Topcenter: typings.ejWebAll.ej.datavisualization.TreeMap.Position.Topcenter & Double = js.native
    
    /* 1 */ val Topleft: typings.ejWebAll.ej.datavisualization.TreeMap.Position.Topleft & Double = js.native
    
    /* 3 */ val Topright: typings.ejWebAll.ej.datavisualization.TreeMap.Position.Topright & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.TreeMap.TextOverflow")
  @js.native
  object TextOverflow extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.TreeMap.TextOverflow & Double] = js.native
    
    /* 1 */ val Hide: typings.ejWebAll.ej.datavisualization.TreeMap.TextOverflow.Hide & Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.datavisualization.TreeMap.TextOverflow.None & Double = js.native
    
    /* 2 */ val Wrap: typings.ejWebAll.ej.datavisualization.TreeMap.TextOverflow.Wrap & Double = js.native
    
    /* 3 */ val WrapByWord: typings.ejWebAll.ej.datavisualization.TreeMap.TextOverflow.WrapByWord & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.TreeMap.VisibilityMode")
  @js.native
  object VisibilityMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.TreeMap.VisibilityMode & Double] = js.native
    
    /* 1 */ val Hideonexceededlength: typings.ejWebAll.ej.datavisualization.TreeMap.VisibilityMode.Hideonexceededlength & Double = js.native
    
    /* 0 */ val Top: typings.ejWebAll.ej.datavisualization.TreeMap.VisibilityMode.Top & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.TreeMap.fn")
  @js.native
  def fn: typings.ejWebAll.ej.datavisualization.TreeMap = js.native
  inline def fn_=(x: typings.ejWebAll.ej.datavisualization.TreeMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.datavisualization.TreeMap.groupSelectionMode")
  @js.native
  object groupSelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.TreeMap.groupSelectionMode & Double] = js.native
    
    /* 0 */ val Default: typings.ejWebAll.ej.datavisualization.TreeMap.groupSelectionMode.Default & Double = js.native
    
    /* 1 */ val Multiple: typings.ejWebAll.ej.datavisualization.TreeMap.groupSelectionMode.Multiple & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.TreeMap.selectionMode")
  @js.native
  object selectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.TreeMap.selectionMode & Double] = js.native
    
    /* 0 */ val Default: typings.ejWebAll.ej.datavisualization.TreeMap.selectionMode.Default & Double = js.native
    
    /* 1 */ val Multiple: typings.ejWebAll.ej.datavisualization.TreeMap.selectionMode.Multiple & Double = js.native
  }
}
