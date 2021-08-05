package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.ReportDesigner")
@js.native
class ReportDesigner protected ()
  extends StObject
     with typings.ejWebAll.ej.ReportDesigner {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object ReportDesigner {
  
  @JSGlobal("ej.ReportDesigner")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.ReportDesigner.ConfigureItems")
  @js.native
  object ConfigureItems extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportDesigner.ConfigureItems & Double] = js.native
    
    /* 4 */ val All: typings.ejWebAll.ej.ReportDesigner.ConfigureItems.All & Double = js.native
    
    /* 1 */ val Data: typings.ejWebAll.ej.ReportDesigner.ConfigureItems.Data & Double = js.native
    
    /* 3 */ val ImageManager: typings.ejWebAll.ej.ReportDesigner.ConfigureItems.ImageManager & Double = js.native
    
    /* 2 */ val Parameter: typings.ejWebAll.ej.ReportDesigner.ConfigureItems.Parameter & Double = js.native
    
    /* 0 */ val Property: typings.ejWebAll.ej.ReportDesigner.ConfigureItems.Property & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.ReportDesigner.Locale")
  @js.native
  def Locale: js.Any = js.native
  inline def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.ReportDesigner.Permission")
  @js.native
  object Permission extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportDesigner.Permission & Double] = js.native
    
    /* 3 */ val All: typings.ejWebAll.ej.ReportDesigner.Permission.All & Double = js.native
    
    /* 0 */ val Create: typings.ejWebAll.ej.ReportDesigner.Permission.Create & Double = js.native
    
    /* 2 */ val Delete: typings.ejWebAll.ej.ReportDesigner.Permission.Delete & Double = js.native
    
    /* 1 */ val Edit: typings.ejWebAll.ej.ReportDesigner.Permission.Edit & Double = js.native
  }
  
  @JSGlobal("ej.ReportDesigner.ToolbarItems")
  @js.native
  object ToolbarItems extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ReportDesigner.ToolbarItems & Double] = js.native
    
    /* 15 */ val AlignGrid: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.AlignGrid & Double = js.native
    
    /* 12 */ val Alignment: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Alignment & Double = js.native
    
    /* 19 */ val All: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.All & Double = js.native
    
    /* 11 */ val Center: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Center & Double = js.native
    
    /* 4 */ val Copy: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Copy & Double = js.native
    
    /* 3 */ val Cut: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Cut & Double = js.native
    
    /* 6 */ val Delete: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Delete & Double = js.native
    
    /* 13 */ val Distribute: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Distribute & Double = js.native
    
    /* 16 */ val EditDesign: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.EditDesign & Double = js.native
    
    /* 0 */ val New: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.New & Double = js.native
    
    /* 1 */ val Open: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Open & Double = js.native
    
    /* 10 */ val Order: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Order & Double = js.native
    
    /* 5 */ val Paste: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Paste & Double = js.native
    
    /* 18 */ val Preview: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Preview & Double = js.native
    
    /* 8 */ val Redo: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Redo & Double = js.native
    
    /* 2 */ val Save: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Save & Double = js.native
    
    /* 14 */ val Sizing: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Sizing & Double = js.native
    
    /* 7 */ val Undo: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Undo & Double = js.native
    
    /* 17 */ val View: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.View & Double = js.native
    
    /* 9 */ val Zoom: typings.ejWebAll.ej.ReportDesigner.ToolbarItems.Zoom & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.ReportDesigner.fn")
  @js.native
  def fn: typings.ejWebAll.ej.ReportDesigner = js.native
  inline def fn_=(x: typings.ejWebAll.ej.ReportDesigner): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
