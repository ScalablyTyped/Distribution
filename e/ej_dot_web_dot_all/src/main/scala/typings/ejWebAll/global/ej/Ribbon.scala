package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Ribbon")
@js.native
open class Ribbon protected ()
  extends StObject
     with typings.ejWebAll.ej.Ribbon {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object Ribbon {
  
  @JSGlobal("ej.Ribbon")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Ribbon.AlignType")
  @js.native
  object AlignType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Ribbon.AlignType & Double] = js.native
    
    /* 1 */ val Columns: typings.ejWebAll.ej.Ribbon.AlignType.Columns & Double = js.native
    
    /* 0 */ val Rows: typings.ejWebAll.ej.Ribbon.AlignType.Rows & Double = js.native
  }
  
  @JSGlobal("ej.Ribbon.ApplicationTabType")
  @js.native
  object ApplicationTabType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Ribbon.ApplicationTabType & Double] = js.native
    
    /* 1 */ val Backstage: typings.ejWebAll.ej.Ribbon.ApplicationTabType.Backstage & Double = js.native
    
    /* 0 */ val Menu: typings.ejWebAll.ej.Ribbon.ApplicationTabType.Menu & Double = js.native
  }
  
  @JSGlobal("ej.Ribbon.CustomItemType")
  @js.native
  object CustomItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Ribbon.CustomItemType & Double] = js.native
    
    /* 0 */ val Button: typings.ejWebAll.ej.Ribbon.CustomItemType.Button & Double = js.native
    
    /* 1 */ val Menu: typings.ejWebAll.ej.Ribbon.CustomItemType.Menu & Double = js.native
  }
  
  @JSGlobal("ej.Ribbon.ItemType")
  @js.native
  object ItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Ribbon.ItemType & Double] = js.native
    
    /* 0 */ val Button: typings.ejWebAll.ej.Ribbon.ItemType.Button & Double = js.native
    
    /* 1 */ val Tab: typings.ejWebAll.ej.Ribbon.ItemType.Tab & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Ribbon.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Ribbon.QuickAccessMode")
  @js.native
  object QuickAccessMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Ribbon.QuickAccessMode & Double] = js.native
    
    /* 2 */ val Menu: typings.ejWebAll.ej.Ribbon.QuickAccessMode.Menu & Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.Ribbon.QuickAccessMode.None & Double = js.native
    
    /* 1 */ val ToolBar: typings.ejWebAll.ej.Ribbon.QuickAccessMode.ToolBar & Double = js.native
  }
  
  @JSGlobal("ej.Ribbon.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Ribbon.Type & Double] = js.native
    
    /* 0 */ val Button: typings.ejWebAll.ej.Ribbon.Type.Button & Double = js.native
    
    /* 3 */ val Custom: typings.ejWebAll.ej.Ribbon.Type.Custom & Double = js.native
    
    /* 2 */ val DropDownList: typings.ejWebAll.ej.Ribbon.Type.DropDownList & Double = js.native
    
    /* 5 */ val Gallery: typings.ejWebAll.ej.Ribbon.Type.Gallery & Double = js.native
    
    /* 1 */ val SplitButton: typings.ejWebAll.ej.Ribbon.Type.SplitButton & Double = js.native
    
    /* 4 */ val ToggleButton: typings.ejWebAll.ej.Ribbon.Type.ToggleButton & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Ribbon.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Ribbon = js.native
  inline def fn_=(x: typings.ejWebAll.ej.Ribbon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
