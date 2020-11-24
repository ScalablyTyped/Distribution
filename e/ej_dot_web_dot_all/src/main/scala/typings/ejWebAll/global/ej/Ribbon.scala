package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Ribbon")
@js.native
class Ribbon protected ()
  extends typings.ejWebAll.ej.Ribbon {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Ribbon.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Ribbon.Model) = this()
}
/* static members */
@JSGlobal("ej.Ribbon")
@js.native
object Ribbon extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typings.ejWebAll.ej.Ribbon = js.native
  
  @js.native
  object AlignType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Ribbon.AlignType with Double] = js.native
    
    /* 1 */ val Columns: typings.ejWebAll.ej.Ribbon.AlignType.Columns with Double = js.native
    
    /* 0 */ val Rows: typings.ejWebAll.ej.Ribbon.AlignType.Rows with Double = js.native
  }
  
  @js.native
  object ApplicationTabType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Ribbon.ApplicationTabType with Double] = js.native
    
    /* 1 */ val Backstage: typings.ejWebAll.ej.Ribbon.ApplicationTabType.Backstage with Double = js.native
    
    /* 0 */ val Menu: typings.ejWebAll.ej.Ribbon.ApplicationTabType.Menu with Double = js.native
  }
  
  @js.native
  object CustomItemType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Ribbon.CustomItemType with Double] = js.native
    
    /* 0 */ val Button: typings.ejWebAll.ej.Ribbon.CustomItemType.Button with Double = js.native
    
    /* 1 */ val Menu: typings.ejWebAll.ej.Ribbon.CustomItemType.Menu with Double = js.native
  }
  
  @js.native
  object ItemType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Ribbon.ItemType with Double] = js.native
    
    /* 0 */ val Button: typings.ejWebAll.ej.Ribbon.ItemType.Button with Double = js.native
    
    /* 1 */ val Tab: typings.ejWebAll.ej.Ribbon.ItemType.Tab with Double = js.native
  }
  
  @js.native
  object QuickAccessMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Ribbon.QuickAccessMode with Double] = js.native
    
    /* 2 */ val Menu: typings.ejWebAll.ej.Ribbon.QuickAccessMode.Menu with Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.Ribbon.QuickAccessMode.None with Double = js.native
    
    /* 1 */ val ToolBar: typings.ejWebAll.ej.Ribbon.QuickAccessMode.ToolBar with Double = js.native
  }
  
  @js.native
  object Type extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Ribbon.Type with Double] = js.native
    
    /* 0 */ val Button: typings.ejWebAll.ej.Ribbon.Type.Button with Double = js.native
    
    /* 3 */ val Custom: typings.ejWebAll.ej.Ribbon.Type.Custom with Double = js.native
    
    /* 2 */ val DropDownList: typings.ejWebAll.ej.Ribbon.Type.DropDownList with Double = js.native
    
    /* 5 */ val Gallery: typings.ejWebAll.ej.Ribbon.Type.Gallery with Double = js.native
    
    /* 1 */ val SplitButton: typings.ejWebAll.ej.Ribbon.Type.SplitButton with Double = js.native
    
    /* 4 */ val ToggleButton: typings.ejWebAll.ej.Ribbon.Type.ToggleButton with Double = js.native
  }
}
