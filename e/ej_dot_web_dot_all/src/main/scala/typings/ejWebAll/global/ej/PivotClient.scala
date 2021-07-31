package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotClient")
@js.native
class PivotClient protected ()
  extends StObject
     with typings.ejWebAll.ej.PivotClient {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object PivotClient {
  
  @JSGlobal("ej.PivotClient")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.PivotClient.ClientExportMode")
  @js.native
  object ClientExportMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotClient.ClientExportMode & Double] = js.native
    
    /* 0 */ val ChartAndGrid: typings.ejWebAll.ej.PivotClient.ClientExportMode.ChartAndGrid & Double = js.native
    
    /* 1 */ val ChartOnly: typings.ejWebAll.ej.PivotClient.ClientExportMode.ChartOnly & Double = js.native
    
    /* 2 */ val GridOnly: typings.ejWebAll.ej.PivotClient.ClientExportMode.GridOnly & Double = js.native
  }
  
  @JSGlobal("ej.PivotClient.ControlPlacement")
  @js.native
  object ControlPlacement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotClient.ControlPlacement & Double] = js.native
    
    /* 0 */ val Tab: typings.ejWebAll.ej.PivotClient.ControlPlacement.Tab & Double = js.native
    
    /* 1 */ val Tile: typings.ejWebAll.ej.PivotClient.ControlPlacement.Tile & Double = js.native
  }
  
  @JSGlobal("ej.PivotClient.DefaultView")
  @js.native
  object DefaultView extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotClient.DefaultView & Double] = js.native
    
    /* 0 */ val Chart: typings.ejWebAll.ej.PivotClient.DefaultView.Chart & Double = js.native
    
    /* 1 */ val Grid: typings.ejWebAll.ej.PivotClient.DefaultView.Grid & Double = js.native
  }
  
  @JSGlobal("ej.PivotClient.DisplayMode")
  @js.native
  object DisplayMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotClient.DisplayMode & Double] = js.native
    
    /* 2 */ val ChartAndGrid: typings.ejWebAll.ej.PivotClient.DisplayMode.ChartAndGrid & Double = js.native
    
    /* 0 */ val ChartOnly: typings.ejWebAll.ej.PivotClient.DisplayMode.ChartOnly & Double = js.native
    
    /* 1 */ val GridOnly: typings.ejWebAll.ej.PivotClient.DisplayMode.GridOnly & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PivotClient.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.PivotClient.fn")
  @js.native
  def fn: typings.ejWebAll.ej.PivotClient = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.PivotClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
