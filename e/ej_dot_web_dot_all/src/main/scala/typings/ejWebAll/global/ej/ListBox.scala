package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.ListBox")
@js.native
class ListBox protected ()
  extends StObject
     with typings.ejWebAll.ej.ListBox {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object ListBox {
  
  @JSGlobal("ej.ListBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.ListBox.Locale")
  @js.native
  def Locale: js.Any = js.native
  inline def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.ListBox.SortOrder")
  @js.native
  object SortOrder extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ListBox.SortOrder & Double] = js.native
    
    /* 1 */ val Ascending: typings.ejWebAll.ej.ListBox.SortOrder.Ascending & Double = js.native
    
    /* 2 */ val Descending: typings.ejWebAll.ej.ListBox.SortOrder.Descending & Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.ListBox.SortOrder.None & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.ListBox.fn")
  @js.native
  def fn: typings.ejWebAll.ej.ListBox = js.native
  inline def fn_=(x: typings.ejWebAll.ej.ListBox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
