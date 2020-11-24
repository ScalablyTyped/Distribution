package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotClient")
@js.native
class PivotClient protected ()
  extends typings.ejWebAll.ej.PivotClient {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.PivotClient.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.PivotClient.Model) = this()
}
/* static members */
@JSGlobal("ej.PivotClient")
@js.native
object PivotClient extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typings.ejWebAll.ej.PivotClient = js.native
  
  @js.native
  object ClientExportMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotClient.ClientExportMode with Double] = js.native
    
    /* 0 */ val ChartAndGrid: typings.ejWebAll.ej.PivotClient.ClientExportMode.ChartAndGrid with Double = js.native
    
    /* 1 */ val ChartOnly: typings.ejWebAll.ej.PivotClient.ClientExportMode.ChartOnly with Double = js.native
    
    /* 2 */ val GridOnly: typings.ejWebAll.ej.PivotClient.ClientExportMode.GridOnly with Double = js.native
  }
  
  @js.native
  object ControlPlacement extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotClient.ControlPlacement with Double] = js.native
    
    /* 0 */ val Tab: typings.ejWebAll.ej.PivotClient.ControlPlacement.Tab with Double = js.native
    
    /* 1 */ val Tile: typings.ejWebAll.ej.PivotClient.ControlPlacement.Tile with Double = js.native
  }
  
  @js.native
  object DefaultView extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotClient.DefaultView with Double] = js.native
    
    /* 0 */ val Chart: typings.ejWebAll.ej.PivotClient.DefaultView.Chart with Double = js.native
    
    /* 1 */ val Grid: typings.ejWebAll.ej.PivotClient.DefaultView.Grid with Double = js.native
  }
  
  @js.native
  object DisplayMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotClient.DisplayMode with Double] = js.native
    
    /* 2 */ val ChartAndGrid: typings.ejWebAll.ej.PivotClient.DisplayMode.ChartAndGrid with Double = js.native
    
    /* 0 */ val ChartOnly: typings.ejWebAll.ej.PivotClient.DisplayMode.ChartOnly with Double = js.native
    
    /* 1 */ val GridOnly: typings.ejWebAll.ej.PivotClient.DisplayMode.GridOnly with Double = js.native
  }
}
